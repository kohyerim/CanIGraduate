package com.example.canigraduate;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Drawable drawable = getResources().getDrawable(R.drawable.backward_arrow);
        ImageView imageView = (ImageView) findViewById(R.id.imageButton);
        imageView.setImageDrawable(drawable);
    }


    protected void onClick_back(View view){
        startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
        finish();
    }


}
