package products.daledawson.com.test_demo.MVP_Demo;

/**
 * Created by Administrator on 2017/12/11/011.
 */

public interface LoadTasksCallBack<T> {
    void onSuccess(T t);

    void onStart();

    void onFailed();

    void onFinished();
}
