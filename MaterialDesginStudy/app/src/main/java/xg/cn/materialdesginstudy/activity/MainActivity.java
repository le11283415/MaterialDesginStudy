package xg.cn.materialdesginstudy.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import xg.cn.materialdesginstudy.R;
import xg.cn.materialdesginstudy.adapter.MyFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTableLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTableLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        //Fragment+ViewPager+FragmentViewPager组合的使用
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), this);
        mViewPager.setAdapter(adapter);
        //TabLayout
        mTableLayout.setupWithViewPager(mViewPager);



/*      1.通过TabLayout的addTab()方法添加新构建的Tab实例到TabLayout中：
        TabLayout tabLayout = ...;
        tabLayout.addTab(tabLayout.newTab().setText("Tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));

        2.第二种则是使用ViewPager和TabLayout一站式管理Tab，也就是说不需要像第一种方式那样手动添加Tab：

        ViewPager viewPager = ...;
        TabLayout tabLayout = ...;
        viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(tabLayout));*/

    }
}
