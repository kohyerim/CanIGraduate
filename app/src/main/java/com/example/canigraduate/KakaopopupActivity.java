package com.example.canigraduate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;


public class KakaopopupActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graduationpoint_kakao);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.activity_kakaopopup, null);
        linearLayout.setBackgroundColor(Color.parseColor("#99000000"));
        LinearLayout.LayoutParams paramll = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
        addContentView(linearLayout, paramll);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.grade2:
                startActivity(new Intent(KakaopopupActivity.this, Kakao2Activity.class));
                break;
            case R.id.grade3:
                startActivity(new Intent(KakaopopupActivity.this, Kakao3Activity.class));
                break;
            case R.id.grade4:
                startActivity(new Intent(KakaopopupActivity.this, Kakao4Activity.class));
                break;
        }
    }
}
