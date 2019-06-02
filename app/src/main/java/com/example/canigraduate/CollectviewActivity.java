package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CollectviewActivity extends Activity {
    DbOpenHelper mDbOpenHelper;
    DbControl mDbControl;
    Cursor iCusor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectview);

        mDbOpenHelper = new DbOpenHelper(CollectviewActivity.this);
        mDbControl = new DbControl();
        mDbOpenHelper.open();
        mDbOpenHelper.create();

        Drawable drawable_profile = getResources().getDrawable(R.drawable.profile);
        Drawable drawable_edit = getResources().getDrawable(R.drawable.edit_btn);

        ImageView profile_pic = (ImageView) findViewById(R.id.profile_pic);
        ImageView edit_pic = (ImageView) findViewById(R.id.edit_pic);

        profile_pic.setImageDrawable(drawable_profile);
        edit_pic.setImageDrawable(drawable_edit);
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

    public void onClick_Test(View view){
        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        String name = iCusor.getString(iCusor.getColumnIndex(Database.CreateDB.NAME));
    }
}



