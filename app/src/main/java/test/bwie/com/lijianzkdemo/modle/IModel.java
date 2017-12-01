package test.bwie.com.lijianzkdemo.modle;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import test.bwie.com.lijianzkdemo.Bean;
import test.bwie.com.lijianzkdemo.IApp;

/**
 * Created by lj on 2017/12/1.
 */

public class IModel {

        public  void getData(final ModleCallback callback){
            //http://api.tianapi.com/wxnew/?key=18e883dd6b316eb1d97fd86338abbf06&num=10
        Call<Bean> call= IApp.dataBase.get("18e883dd6b316eb1d97fd86338abbf06","10");
        call.enqueue(new Callback<Bean>() {
            @Override
            public void onResponse(Call<Bean> call, Response<Bean> response) {

              Bean bean=  response.body();
                   callback.success(bean);
                   //添加数据库
              IApp.session.getNewsBeanDao().insertInTx(bean.getNewslist());
            }

            @Override
            public void onFailure(Call<Bean> call, Throwable t) {
                callback.failure(new Exception(""));
            }
        });

        }



}
