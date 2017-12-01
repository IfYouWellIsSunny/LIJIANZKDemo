package test.bwie.com.lijianzkdemo;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lj on 2017/12/1.
 */
@Entity
public class NewsBean {

    /**
     * ctime : 2017-12-01
     * title : 早上好，一首《永远是朋友》献给此生遇到的真心朋友！
     * description : 经典情歌音乐
     * picUrl : https://zxpic.gtimg.com/infonew/0/wechat_pics_-35562573.static/640
     * url : https://mp.weixin.qq.com/s?src=16&ver=522&timestamp=1512115212&signature=EZhV6p-8Ke1FjJiD8thmadeJ6EWgmGo7fcCj*U4WUP2FnFCcrbDv0LoysPesdOMou0h1diChdQ7S4MkV9uSbiiTctAHJpYrBmPJgu8aK1g0=
     */
    @Id(autoincrement = true)
    private  Long id;
    private String ctime;
    private String title;
    private String description;
    private String picUrl;
    private String url;

    @Generated(hash = 652732417)
    public NewsBean(Long id, String ctime, String title, String description, String picUrl, String url) {
        this.id = id;
        this.ctime = ctime;
        this.title = title;
        this.description = description;
        this.picUrl = picUrl;
        this.url = url;
    }

    @Generated(hash = 1662878226)
    public NewsBean() {
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NewsBean{" +
                "id=" + id +
                ", ctime='" + ctime + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

}
