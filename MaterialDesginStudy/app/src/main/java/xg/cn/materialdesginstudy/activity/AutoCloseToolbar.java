package xg.cn.materialdesginstudy.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import xg.cn.materialdesginstudy.R;
import xg.cn.materialdesginstudy.adapter.MyFragmentPagerAdapter;

/**
 * Created by yefeng on 2017/2/6.
 * Modified by xxx
 */

public class AutoCloseToolbar extends AppCompatActivity {


    private TabLayout mTableLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autoclosetoolbar_layout);

        mTableLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        //Fragment+ViewPager+FragmentViewPager组合的使用

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), this);
        mViewPager.setAdapter(adapter);

        //TabLayout
        mTableLayout.setupWithViewPager(mViewPager);
    }
}
