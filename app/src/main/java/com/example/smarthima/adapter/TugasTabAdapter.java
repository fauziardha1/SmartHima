package com.example.smarthima.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.smarthima.fragment.PengajuanFragment;
import com.example.smarthima.fragment.ProkerFragment;
import com.example.smarthima.fragment.RapatFragment;
import com.example.smarthima.fragment.TugasFragment;
import com.example.smarthima.fragment.TugasKomentarFragment;

public class TugasTabAdapter extends FragmentPagerAdapter {
    private  int numOfTab;

    public TugasTabAdapter(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new TugasKomentarFragment();
            case 1:
                return new RapatFragment();
            default: return  null;
        }
    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}
