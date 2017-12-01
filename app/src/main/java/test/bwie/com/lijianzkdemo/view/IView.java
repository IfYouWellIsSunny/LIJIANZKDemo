package test.bwie.com.lijianzkdemo.view;

import test.bwie.com.lijianzkdemo.Bean;

/**
 * Created by lj on 2017/12/1.
 */

public interface IView {

    public  void  success(Bean bean);
    public  void failure(Exception e);
}
