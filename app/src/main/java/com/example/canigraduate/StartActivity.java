package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StartActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Drawable drawable = getResources().getDrawable(R.drawable.start_btn);
        ImageView imageView = (ImageView) findViewById(R.id.imageButton4);
        imageView.setImageDrawable(drawable);

    }

    protected void onClick(View view){
        startActivity(new Intent(StartActivity.this, CollectviewActivity.class));
        finish();
    }
}
