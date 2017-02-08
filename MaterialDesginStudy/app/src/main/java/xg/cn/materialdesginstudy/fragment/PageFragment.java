package xg.cn.materialdesginstudy.fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import xg.cn.materialdesginstudy.R;
import xg.cn.materialdesginstudy.activity.AutoCloseToolbar;
import xg.cn.materialdesginstudy.activity.CollapsingToolbarActivity;
import xg.cn.materialdesginstudy.activity.NavigationViewStudy;
import xg.cn.materialdesginstudy.adapter.AdapterSampleListItem;

/**
 * Created by yefeng on 2017/2/6.
 * Modified by xxx
 */
public class PageFragment extends Fragment {

    public static final String ARGS_PAGE = "args_page";
    private int mPage;

    public static PageFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARGS_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARGS_PAGE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page,container,false);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setTextSize(40);
        textView.setTextColor(Color.WHITE);
        textView.setBackgroundColor(Color.parseColor("#3F51B5"));
        textView.setText("第"+mPage+"页");

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        //初始化adapter
        AdapterSampleListItem mAdapter = new AdapterSampleListItem(getContext());
        recyclerView.setAdapter(mAdapter);

        if(1 == mPage){
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getActivity(),NavigationViewStudy.class));
                }
            });
        }
        if(2 == mPage){
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getActivity(),AutoCloseToolbar.class));
                }
            });
        }
        if(3 == mPage){
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getActivity(),CollapsingToolbarActivity.class));
                }
            });
        }
        return view;
    }

    @Override
    public void onViewCreated(View view,
            @Nullable
                    Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
