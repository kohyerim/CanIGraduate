package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    protected void onClick(View view){
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }
}
