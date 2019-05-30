package com.example.canigraduate;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        //DbOpenHelper mDbOpenHelper = new DbOpenHelper(this);
        //mDbOpenHelper.open();
        //mDbOpenHelper.create();
=======
        final DbOpenHelper mDbOpenHelper = new DbOpenHelper(MainActivity.this);
        mDbOpenHelper.open();
        mDbOpenHelper.create();

>>>>>>> upstream/master

        final TextView text = (TextView)findViewById(R.id.textView);
        Button btn = (Button)findViewById(R.id.button3);

        System.out.println(Database.CreateDB._CREATE0);


        btn.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View view){
                text.setText("test");
            }
        });
    }

<<<<<<< HEAD
    protected void onClick(View view){
        startActivity(new Intent(MainActivity.this, CollectviewActivity.class));
=======
    public void onClick(View view){
        startActivity(new Intent(MainActivity.this, Graduationpoint_kakaoActivity.class));
>>>>>>> upstream/master
        finish();
    }

}
