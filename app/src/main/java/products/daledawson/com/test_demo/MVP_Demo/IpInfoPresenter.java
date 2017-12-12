package products.daledawson.com.test_demo.MVP_Demo;

/**
 * Created by Administrator on 2017/12/11/011.
 */

public class IpInfoPresenter implements IpInfoContract.Presenter, LoadTasksCallBack<IpInfo> {
    private NetTask netTask;
    private IpInfoContract.View addTaskView;

    public IpInfoPresenter(NetTask netTask, IpInfoContract.View addTaskView) {
        this.netTask = netTask;
        this.addTaskView = addTaskView;
    }

    @Override
    public void onSuccess(IpInfo ipInfo) {
        if (addTaskView.isActive()) {
            addTaskView.setIpInfo(ipInfo);
        }
    }

    @Override
    public void onStart() {
        addTaskView.showLoading();
    }

    @Override
    public void onFailed() {
        if (addTaskView.isActive()) {
            addTaskView.showError();
            addTaskView.hideLoading();
        }
    }

    @Override
    public void onFinished() {
        if (addTaskView.isActive()) {
            addTaskView.hideLoading();
        }
    }

    @Override
    public void getIpInfo(String ip) {
        netTask.execute(ip, this);
    }
}
