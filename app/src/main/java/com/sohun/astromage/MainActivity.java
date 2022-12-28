package com.sohun.astromage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView defaultImg, galaxyImg, oumuamuaImg, clusterImg, black_holeImg, neutron_starImg,
            pulsarImg, gravity_waveImg, rogue_planetImg, quasarImg;

    AppCompatButton defaultBtn, galaxyBtn, oumuamuaBtn, clusterBtn, black_holeBtn, neutron_starBtn,
            pulsarBtn, gravity_waveBtn, rogue_planetBtn, quasarBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      ======================== Find image ID ===============================

        defaultImg = findViewById(R.id.defaultImg);
        galaxyImg = findViewById(R.id.galaxyImg);
        oumuamuaImg = findViewById(R.id.oumuamuaImg);
        clusterImg = findViewById(R.id.clusterImg);
        black_holeImg = findViewById(R.id.black_holeImg);
        neutron_starImg = findViewById(R.id.neutron_starImg);
        pulsarImg = findViewById(R.id.pulsarImg);
        gravity_waveImg = findViewById(R.id.gravity_waveImg);
        rogue_planetImg = findViewById(R.id.rogue_planetImg);
        quasarImg = findViewById(R.id.quasarImg);


//      ======================== Find Button ID =================================

        defaultBtn = findViewById(R.id.defaultBtn);
        galaxyBtn = findViewById(R.id.galaxyBtn);
        oumuamuaBtn = findViewById(R.id.oumuamuaBtn);
        clusterBtn = findViewById(R.id.clusterBtn);
        black_holeBtn = findViewById(R.id.black_holeBtn);
        neutron_starBtn = findViewById(R.id.neutron_starBtn);
        pulsarBtn = findViewById(R.id.pulsarBtn);
        gravity_waveBtn = findViewById(R.id.gravity_waveBtn);
        rogue_planetBtn = findViewById(R.id.rogue_planetBtn);
        quasarBtn = findViewById(R.id.quasarBtn);


//        ======================== Button Click listener ==========================

        defaultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              ================= Code here ==================

                defaultImg.setVisibility(View.VISIBLE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.GONE);
            }

        });

        galaxyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//              ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.VISIBLE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.GONE);

            }
        });

        oumuamuaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//           ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.VISIBLE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.GONE);

            }
        });

        clusterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//           ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.VISIBLE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.GONE);

            }
        });

        black_holeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//           ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.VISIBLE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.GONE);

            }
        });


        neutron_starBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//           ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.VISIBLE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.GONE);

            }
        });


        pulsarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//           ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.VISIBLE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.GONE);

            }
        });

        gravity_waveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//           ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.VISIBLE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.GONE);

            }
        });

        rogue_planetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//           ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.VISIBLE);
                quasarImg.setVisibility(View.GONE);

            }
        });

        quasarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//           ================== Code here ===================

                defaultImg.setVisibility(View.GONE);
                galaxyImg.setVisibility(View.GONE);
                oumuamuaImg.setVisibility(View.GONE);
                clusterImg.setVisibility(View.GONE);
                black_holeImg.setVisibility(View.GONE);
                neutron_starImg.setVisibility(View.GONE);
                pulsarImg.setVisibility(View.GONE);
                gravity_waveImg.setVisibility(View.GONE);
                rogue_planetImg.setVisibility(View.GONE);
                quasarImg.setVisibility(View.VISIBLE);

            }
        });



    }
}