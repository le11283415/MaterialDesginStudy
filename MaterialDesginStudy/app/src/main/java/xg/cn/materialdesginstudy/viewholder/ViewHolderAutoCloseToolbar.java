package xg.cn.materialdesginstudy.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import xg.cn.materialdesginstudy.R;

/**
 * Created by yefeng on 2017/2/6.
 * Modified by xxx
 */

public class ViewHolderAutoCloseToolbar extends RecyclerView.ViewHolder {

    private final TextView mTextView;

    public ViewHolderAutoCloseToolbar(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.textView);
    }

    public void setData(String item){
        mTextView.setText(item);
    }

}
