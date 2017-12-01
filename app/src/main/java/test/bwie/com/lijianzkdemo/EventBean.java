package test.bwie.com.lijianzkdemo;

/**
 * Created by lj on 2017/12/1.
 */

public class EventBean {

    private  String url;
    private  String title;

    public EventBean(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
