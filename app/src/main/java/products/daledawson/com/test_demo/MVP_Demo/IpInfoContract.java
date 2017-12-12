package products.daledawson.com.test_demo.MVP_Demo;

/**
 * Created by Administrator on 2017/12/11/011.
 */

public class IpInfoContract {
    interface Presenter {
        void getIpInfo(String ip);
    }

    interface View extends BaseView<Presenter> {
        void setIpInfo(IpInfo ipInfo);

        void showLoading();

        void hideLoading();

        void showError();

        boolean isActive();
    }
}
