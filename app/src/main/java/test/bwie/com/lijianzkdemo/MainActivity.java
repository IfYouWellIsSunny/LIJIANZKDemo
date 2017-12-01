package test.bwie.com.lijianzkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import test.bwie.com.lijianzkdemo.presenter.IPresenter;
import test.bwie.com.lijianzkdemo.view.IView;

public class MainActivity extends AppCompatActivity implements IView {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    private IPresenter presenter;
    private  RecyclerviewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new IPresenter(this);
        presenter.getData();
       adapter= new RecyclerviewAdapter(this);
        LinearLayoutManager manager=new LinearLayoutManager(this);
       recycler.setLayoutManager(manager);
        recycler.setAdapter(adapter);

       List<NewsBean> newsBeans= IApp.session.getNewsBeanDao().loadAll();
         for (NewsBean bean :newsBeans){

             System.out.println(bean.toString());
         }

    }


    @Override
    public void success(Bean bean) {
        adapter.add(bean);
    }

    @Override
    public void failure(Exception e) {

    }


}
