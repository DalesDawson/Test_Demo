package products.daledawson.com.test_demo.MVP_Demo;

/**
 * Created by Administrator on 2017/12/11/011.
 */

public interface NetTask<T> {
    void execute(T data,LoadTasksCallBack callBack);
}
