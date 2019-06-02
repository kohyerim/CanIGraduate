package com.example.canigraduate;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {
    DbControl DBcontrol = new DbControl();
    final DbOpenHelper mDbOpenHelper = new DbOpenHelper(SignUpActivity.this);
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Drawable drawable = getResources().getDrawable(R.drawable.backward_arrow);
        ImageView imageView = (ImageView) findViewById(R.id.onClick_back);
        imageView.setImageDrawable(drawable);
    }


    protected void onClick_back(View view){
        startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
        finish();
    }

    protected void onClick_Signup(View view){
        startActivity(new Intent(SignUpActivity.this, PrimalActivity.class));
//        mDbOpenHelper.open();
//        mDbOpenHelper.create();
//        DBcontrol.insertColumn(UserInfo.userID, UserInfo.userPW, UserInfo.userID);
//        System.out.println("done");
        finish();
    }


}
