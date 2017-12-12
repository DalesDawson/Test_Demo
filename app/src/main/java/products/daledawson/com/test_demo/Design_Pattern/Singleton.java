package products.daledawson.com.test_demo.Design_Pattern;

/**
 * Created by Administrator on 2017/12/12/012.
 */

/**
 * 静态内部类单例模式
 */
public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}

///**
// * 双重检查模式（DCL）
// */
//public class Singleton{
//    private volatile static Singleton singleton;
//    private Singleton(){}
//
//    public static Singleton getSingleton() {
//        if (singleton==null){
//            synchronized (Singleton.class){
//                if (singleton==null){
//                    singleton=new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
//}
