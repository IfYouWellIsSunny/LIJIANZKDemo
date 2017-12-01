package test.bwie.com.lijianzkdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lj on 2017/12/1.
 */

public interface IDataBase {
   //http://v.juhe.cn/weixin/query?key=88f7bbc507e3ecacfaeab2b47dd8936f
   // http://tingapi.ting.baidu.com/v1/restserver/ting?method=baidu.ting.billboard.billList&type=1&size=10&offset=0
     //http://v.juhe.cn/toutiao/index?type=top&key=597b4f9dcb50e051fd725a9ec54d6653
    //http://api.tianapi.com/wxnew/?key=18e883dd6b316eb1d97fd86338abbf06&num=10
       @GET("wxnew")
       Call<Bean> get(@Query("key") String key,@Query("num") String num);


}
