package com.example.canigraduate;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;


public class PrimalActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primal);

        Drawable drawable_profile = getResources().getDrawable(R.drawable.profile);
        Drawable drawable_edit = getResources().getDrawable(R.drawable.edit_btn);
        Drawable drawable_blueView = getResources().getDrawable(R.drawable.squrareblue);
        Drawable drawable_continue = getResources().getDrawable(R.drawable.continue_btn);

        ImageView profile_pic = (ImageView) findViewById(R.id.profile_pic);
        ImageView edit_pic = (ImageView) findViewById(R.id.edit_pic);
        ImageView blueView = (ImageView) findViewById(R.id.blueView);
        ImageView continue_btn = (ImageView) findViewById(R.id.continue_btn2);

        profile_pic.setImageDrawable(drawable_profile);
        edit_pic.setImageDrawable(drawable_edit);
        blueView.setImageDrawable(drawable_blueView);
        continue_btn.setImageDrawable(drawable_continue);

    }
}
