package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MajorsearchActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majorsearch);
    }

    public void onClick(View view) {
        startActivity(new Intent(MajorsearchActivity.this, Graduationpoint_kakaoActivity.class));
        finish();
    }
}
