package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WholecultureActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wholeculture);
    }

    public void onClick(View view) {
        startActivity(new Intent(WholecultureActivity.this, Graduationpoint_kakaoActivity.class));
        finish();
    }
}
