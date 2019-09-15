package com.example.smarthima;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.smarthima.fragment.PengajuanFragment;
import com.example.smarthima.fragment.ProkerFragment;
import com.example.smarthima.fragment.RapatFragment;
import com.example.smarthima.fragment.TugasFragment;

class TabAdapter extends FragmentPagerAdapter {
    private  int numOfTab;
    public TabAdapter(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new TugasFragment();
            case 1:
                return new RapatFragment();
            case 2:
                return new ProkerFragment();
            case 3:
                return new PengajuanFragment();
                default: return  null;
        }

    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}
