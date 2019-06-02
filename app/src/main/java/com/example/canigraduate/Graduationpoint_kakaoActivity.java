package com.example.canigraduate;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class Graduationpoint_kakaoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduationpoint_kakao);

        //  LayoutInflater 객체와 시킴
        LayoutInflater inflater = (LayoutInflater) Graduationpoint_kakaoActivity.this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.B_기초교양:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, BasicActivity.class));
                finish();
                break;
            case R.id.B_전공탐색:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, MajorsearchActivity.class));
                finish();
                break;
            case R.id.B_전인교양:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, WholecultureActivity.class));
                finish();
                break;
            case R.id.B_JNU:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, JnupopupActivity.class));
                finish();
                break;
            case R.id.B_필수전공:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, MajordetailActivity.class));
                finish();
                break;
            case R.id.B_카카오트랙:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, KakaopopupActivity.class));
                finish();
                break;
            case R.id.B_Back:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, CollectviewActivity.class));
                finish();
                break;
        }
    }
}
