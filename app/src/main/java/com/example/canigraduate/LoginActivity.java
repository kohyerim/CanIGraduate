package com.example.canigraduate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    protected void onClick_Login(View view){
        startActivity(new Intent(LoginActivity.this, CollectviewActivity.class));
        finish();
    }

    protected void onClick_Signup(View view){
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
        finish();
    }
}
