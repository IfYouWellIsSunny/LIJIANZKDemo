package test.bwie.com.lijianzkdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lj on 2017/12/1.
 */

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.IViewHolder> {

     Context context;
  List<NewsBean> list;

    public RecyclerviewAdapter(Context context) {
        this.context = context;
    }

    public  void  add(Bean bean){
        if (list==null){
            list=new ArrayList<>();
        }
        list.addAll(bean.getNewslist());
         notifyDataSetChanged();
    }

    @Override
    public RecyclerviewAdapter.IViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = View.inflate(context, R.layout.layout_item, null);
        return new IViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerviewAdapter.IViewHolder holder, final int position) {

          holder.itemTv.setText(list.get(position).getTitle());
          holder.simple.setImageURI(list.get(position).getPicUrl());
          holder.itemTv.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  EventBus.getDefault().postSticky(new EventBean(list.get(position).getTitle(),list.get(position).getPicUrl()));

                  context.startActivity(new Intent(context,Main2Activity.class));
              }
          });
    }

    @Override
    public int getItemCount() {
        return list==null?0:list.size();
    }

    static class IViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.simple)
        SimpleDraweeView simple;
        @BindView(R.id.item_tv)
        TextView itemTv;

        IViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
