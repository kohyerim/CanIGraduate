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
<<<<<<< HEAD
        startActivity(new Intent(StartActivity.this, LoginActivity.class));
=======
        startActivity(new Intent(StartActivity.this, MainActivity.class));
>>>>>>> 4e4b5d0c8b860ea02f1e1887f7a45c1231806f82
        finish();
    }
}
