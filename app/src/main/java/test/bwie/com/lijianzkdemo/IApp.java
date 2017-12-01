package test.bwie.com.lijianzkdemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

import org.greenrobot.greendao.database.Database;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import test.bwie.com.lijianzkdemo.dao.DaoMaster;
import test.bwie.com.lijianzkdemo.dao.DaoSession;

/**
 * Created by lj on 2017/12/1.
 */

public class IApp extends Application {
public static   IDataBase dataBase;
public  static DaoSession session;
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

     Retrofit  retrofit= new Retrofit.Builder()
             .baseUrl("http://api.tianapi.com")
             .addConverterFactory(GsonConverterFactory.create())
             .build();

       dataBase=  retrofit.create(IDataBase.class);

     DaoMaster.DevOpenHelper helper=  new DaoMaster.DevOpenHelper(this,"text");
       Database database= helper.getWritableDb();
       session=  new DaoMaster(database).newSession();



    }
}
