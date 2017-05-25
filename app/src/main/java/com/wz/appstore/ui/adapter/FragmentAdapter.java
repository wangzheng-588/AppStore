package com.wz.appstore.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import com.wz.appstore.bean.FragmentInfo;
import com.wz.appstore.ui.fragment.CategoryFragment;
import com.wz.appstore.ui.fragment.GameFragment;
import com.wz.appstore.ui.fragment.RankingFragment;
import com.wz.appstore.ui.fragment.RecommendFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wz on 17-5-26.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {

    List<FragmentInfo> mFragments ;

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        initFragment();
    }

    private void initFragment() {
        mFragments = new ArrayList<>();
       mFragments.add(new FragmentInfo(RecommendFragment.class,"推荐"));
        mFragments.add(new FragmentInfo(RankingFragment.class,"排行"));
        mFragments.add(new FragmentInfo(GameFragment.class,"游戏"));
        mFragments.add(new FragmentInfo(CategoryFragment.class,"分类"));

    }

    @Override
    public Fragment getItem(int position) {

        try {
            return (Fragment) mFragments.get(position).getClazz().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;


    }

    @Override
    public int getCount() {
        Log.e("TAG",mFragments.size()+"");
        return mFragments.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mFragments.get(position).getTitle();
    }
}
