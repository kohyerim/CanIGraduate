package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MajordetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majordetail);
    }

    public void onClick(View view) {
        startActivity(new Intent(MajordetailActivity.this, Graduationpoint_kakaoActivity.class));
        finish();
    }
}
