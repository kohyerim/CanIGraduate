package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CollectviewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectview);
    }


    public void onClick(View view) {
        switch (view.getId()){
            case R.id.B_졸업학점:
                startActivity(new Intent(CollectviewActivity.this, Graduationpoint_kakaoActivity.class));
                finish();
                break;
            case R.id.B_전공학점:
                break;
            case R.id.B_자격증:
                startActivity(new Intent(CollectviewActivity.this, TestpopupActivity.class));
                finish();
                break;
        }
    }
}



