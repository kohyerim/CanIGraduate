package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Graduationpoint_kakaoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduationpoint_kakao);
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.B_기초교양:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, BasicActivity.class));
                break;
            case R.id.B_전공탐색:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, MajorsearchActivity.class));
                break;
            case R.id.B_전인교양:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, WholecultureActivity.class));
                break;
            case R.id.B_JNU:

                break;
            case R.id.B_필수전공:
                startActivity(new Intent(Graduationpoint_kakaoActivity.this, MajordetailActivity.class));
                break;
            case R.id.B_카카오트랙:
                break;
        }
    }
}
