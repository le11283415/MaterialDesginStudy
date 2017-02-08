package xg.cn.materialdesginstudy.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import xg.cn.materialdesginstudy.fragment.PageFragment;

/**
 * Created by yefeng on 2017/2/6.
 * Modified by xxx
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public final int COUNT = 4;
    private String[] titles = new String[]{"TAB1", "Tab2", "Tab3","Tab4"};
    //private String[] titles = new String[]{"TAB1", "Tab2", "Tab3", "Tab4", "TAB5"};
   // private String[] titles = new String[]{"TAB1111111", "Tab2", "Tab3", "Tab4", "TAB55555555555555555"};
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
