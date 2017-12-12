package products.daledawson.com.test_demo.MVP_Demo;

/**
 * Created by Administrator on 2017/12/11/011.
 */

public class IpInfo {
    private int code;
    private IpData data;

    public IpInfo(int code, IpData data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public IpData getData() {
        return data;
    }

    public void setData(IpData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "IpInfo{" +
                "code=" + code +
                ", data=" + data +
                '}';
    }
}
