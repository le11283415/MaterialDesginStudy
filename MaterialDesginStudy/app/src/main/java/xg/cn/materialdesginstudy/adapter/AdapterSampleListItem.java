package xg.cn.materialdesginstudy.adapter;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xg.cn.materialdesginstudy.R;
import xg.cn.materialdesginstudy.viewholder.ViewHolderAutoCloseToolbar;

/**
 * Created by yefeng on 2017/2/6.
 * Modified by xxx
 */
public class AdapterSampleListItem extends RecyclerView.Adapter {

    private Context mContext;
    private List<String> mList;

    public AdapterSampleListItem(Context context){
        this.mContext = context;
        mList = new ArrayList<>();
        initData();
    }

    private void initData() {
    for (int i=0;i < 100 ; i++){
        mList.add("item:"+i);
    }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewHolderAutoCloseToolbar viewHolder = new ViewHolderAutoCloseToolbar(
                LayoutInflater.from(mContext).inflate(R.layout.adapter_autoclosetoolbar_item, parent, false));

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolderAutoCloseToolbar)holder).setData(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }



}
