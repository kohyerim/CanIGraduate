package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kakao2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakao2);
    }

    public void onClick(View view) {
        startActivity(new Intent(Kakao2Activity.this, Graduationpoint_kakaoActivity.class));
    }
}
