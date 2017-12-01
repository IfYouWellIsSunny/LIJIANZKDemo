package test.bwie.com.lijianzkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EventBus.getDefault().register(this);

    }

       @Subscribe(sticky = true)
       public void  event(EventBean eventBean){

            Toast.makeText(this, ""+eventBean.getTitle()+eventBean.getUrl(), Toast.LENGTH_SHORT).show();

       }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }


}
