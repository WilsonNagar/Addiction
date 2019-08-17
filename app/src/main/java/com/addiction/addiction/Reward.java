package com.addiction.addiction;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.itangqi.waveloadingview.WaveLoadingView;

public class Reward extends AppCompatActivity {

    int progress=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward);
        final Button redeem = findViewById(R.id.redeem);
        Button plus1 = findViewById(R.id.addten1);
        Button plus2 = findViewById(R.id.addten2);
        Button plus3 = findViewById(R.id.addten3);
        Button plus = findViewById(R.id.addten);
        final WaveLoadingView mWaveLoadingView = (WaveLoadingView) findViewById(R.id.waveLoadingView);
        mWaveLoadingView.setShapeType(WaveLoadingView.ShapeType.CIRCLE);
        mWaveLoadingView.setTopTitle("DAILY TASKS COMPLETION");
        mWaveLoadingView.setCenterTitle(progress+"%");
        mWaveLoadingView.setCenterTitleColor(Color.WHITE);
        mWaveLoadingView.setBottomTitleSize(18);
        mWaveLoadingView.setProgressValue(0);
        mWaveLoadingView.setBorderWidth(10);
        mWaveLoadingView.setAmplitudeRatio(60);
        mWaveLoadingView.setWaveColor(Color.RED);
        mWaveLoadingView.setBorderColor(Color.RED);
        mWaveLoadingView.setTopTitleStrokeColor(Color.WHITE);
        mWaveLoadingView.setTopTitleStrokeWidth(3);
        mWaveLoadingView.setAnimDuration(3000);
        mWaveLoadingView.pauseAnimation();
        mWaveLoadingView.resumeAnimation();
        mWaveLoadingView.cancelAnimation();
        mWaveLoadingView.startAnimation();



        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progress<100)
                {
                    progress+=20;
                    mWaveLoadingView.setProgressValue(progress);
                    mWaveLoadingView.setCenterTitle(progress+"%");
                }
                if(progress>=100)
                {
                    redeem.setTextSize(30);
                }
            }
        });

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progress<100)
                {
                    progress+=10;
                    mWaveLoadingView.setProgressValue(progress);
                    mWaveLoadingView.setCenterTitle(progress+"%");
                }
                if(progress>=100)
                {
                    redeem.setTextSize(30);
                }
            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progress<100)
                {
                    progress+=10;
                    mWaveLoadingView.setProgressValue(progress);
                    mWaveLoadingView.setCenterTitle(progress+"%");
                }
                if(progress>=100)
                {
                    redeem.setTextSize(30);
                }
            }
        });
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progress<100)
                {
                    progress+=10;
                    mWaveLoadingView.setProgressValue(progress);
                    mWaveLoadingView.setCenterTitle(progress+"%");
                }
                if(progress>=100)
                {
                    redeem.setTextSize(30);
                }
            }
        });
        redeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(progress>=100)
                {
                    redeem.setTextSize(20);
                   progress-=100;
                   mWaveLoadingView.setProgressValue(progress);
                   mWaveLoadingView.setCenterTitle(progress+"%");
                }
            }
        });
    }
}
