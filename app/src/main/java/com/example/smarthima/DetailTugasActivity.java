package com.example.smarthima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.smarthima.adapter.TugasAdapter;
import com.example.smarthima.adapter.TugasTabAdapter;
import com.google.android.material.tabs.TabLayout;

public class DetailTugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tugas);

        TabLayout tabLayoutKomentarDanProgres = (TabLayout) findViewById(R.id.fragment_komentar_dan_progress_pada_tugas); // inisiasi tabLayout
        tabLayoutKomentarDanProgres.addTab(tabLayoutKomentarDanProgres.newTab().setText("Komentar")); // menambahkan item di tabLayout
        tabLayoutKomentarDanProgres.addTab(tabLayoutKomentarDanProgres.newTab().setText("Progres")); // menambahkan item di tabLayout

        tabLayoutKomentarDanProgres.setTabGravity(TabLayout.GRAVITY_FILL);
        final ViewPager viewPagerKomentarDanProgres =(ViewPager)findViewById(R.id.viewPagerTugas);

        TugasTabAdapter tabsAdapter = new TugasTabAdapter(getSupportFragmentManager(), tabLayoutKomentarDanProgres.getTabCount());
        viewPagerKomentarDanProgres.setAdapter(tabsAdapter);
        viewPagerKomentarDanProgres.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayoutKomentarDanProgres));
        tabLayoutKomentarDanProgres.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerKomentarDanProgres.setCurrentItem(tab.getPosition());

            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
