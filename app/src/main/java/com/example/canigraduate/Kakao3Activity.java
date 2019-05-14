package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Kakao3Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kakao3);
    }

    public void onClick(View view) {
        startActivity(new Intent(Kakao3Activity.this, Graduationpoint_kakaoActivity.class));
    }
}
