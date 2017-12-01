package test.bwie.com.lijianzkdemo.presenter;

import test.bwie.com.lijianzkdemo.Bean;
import test.bwie.com.lijianzkdemo.modle.IModel;
import test.bwie.com.lijianzkdemo.modle.ModleCallback;
import test.bwie.com.lijianzkdemo.view.IView;

/**
 * Created by lj on 2017/12/1.
 */

public class IPresenter {

       private IView mView;
       private IModel mModl;

    public IPresenter(IView mView) {
        this.mView = mView;
        this.mModl=new IModel();
    }

    public  void  getData(){
           mModl.getData(new ModleCallback() {
               @Override
               public void success(Bean bean) {

                   if (mView!=null){
                       mView.success(bean);
                   }

               }

               @Override
               public void failure(Exception e) {
                   if (mView!=null){

                       mView.failure(e);
                   }
               }
           });

    }




}
