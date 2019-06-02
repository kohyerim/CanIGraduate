package com.example.canigraduate;

import android.app.Activity;
import android.app.AuthenticationRequiredException;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


public class PrimalActivity extends Activity {
    String tempNum;
    String tempOtherMajor;
    int tempGrade;
    int tempKakao;

    DbOpenHelper mDbOpenHelper;
    DbControl mDbControl;
    Cursor iCusor;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primal);

        mDbOpenHelper = new DbOpenHelper(PrimalActivity.this);
        mDbControl = new DbControl();
        mDbOpenHelper.open();

        Drawable drawable_profile = getResources().getDrawable(R.drawable.profile);
        Drawable drawable_edit = getResources().getDrawable(R.drawable.edit_btn);
        Drawable drawable_continue = getResources().getDrawable(R.drawable.continue_btn);

        ImageView profile_pic = (ImageView) findViewById(R.id.profile_pic);
        ImageView edit_pic = (ImageView) findViewById(R.id.edit_pic);
        ImageView continue_btn = (ImageView) findViewById(R.id.continue_btn2);

        profile_pic.setImageDrawable(drawable_profile);
        edit_pic.setImageDrawable(drawable_edit);
        continue_btn.setImageDrawable(drawable_continue);

        Spinner spinner_num = (Spinner) findViewById(R.id.spinner_num);
        Spinner spinner_otehrMajor = (Spinner) findViewById(R.id.spinner_otherMajor);
        Spinner spinner_grade = (Spinner) findViewById(R.id.spinner_grade);
        Spinner spinner_kakao = (Spinner) findViewById(R.id.spinner_kakao);
        ArrayAdapter adapter_num = ArrayAdapter.createFromResource(this, R.array.student_num, android.R.layout.simple_spinner_item);
        ArrayAdapter adapter_otherMajor = ArrayAdapter.createFromResource(this, R.array.otherMajor, android.R.layout.simple_spinner_item);
        ArrayAdapter adapter_grade = ArrayAdapter.createFromResource(this, R.array.examGrade, android.R.layout.simple_spinner_item);
        ArrayAdapter adapter_kakao = ArrayAdapter.createFromResource(this, R.array.kakao, android.R.layout.simple_spinner_item);

        spinner_num.setAdapter(adapter_num);
        spinner_num.setSelection(3);
        spinner_otehrMajor.setAdapter(adapter_otherMajor);
        spinner_otehrMajor.setSelection(1);
        spinner_grade.setAdapter(adapter_grade);
        spinner_grade.setSelection(4);
        spinner_kakao.setAdapter(adapter_kakao);
        spinner_kakao.setSelection(0);

        spinner_num.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: tempNum = "14"; break;
                    case 1: tempNum = "15"; break;
                    case 2: tempNum = "16"; break;
                    case 3: tempNum = "17"; break;
                    case 4: tempNum = "18"; break;
                    case 5: tempNum = "19"; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_otehrMajor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: tempOtherMajor = "1"; break;
                    case 1: tempOtherMajor = "0"; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_grade.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: tempGrade = 1; break;
                    case 1: tempGrade = 2; break;
                    case 2: tempGrade = 3; break;
                    case 3: tempGrade = 4; break;
                    case 4: tempGrade = 5; break;
                    case 5: tempGrade = 6; break;
                    case 6: tempGrade = 7; break;
                    case 7: tempGrade = 8; break;
                    case 8: tempGrade = 9; break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner_kakao.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: tempKakao = 1; break;
                    case 1: tempKakao = 2; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onClick_Continue(View view){
        startActivity(new Intent(PrimalActivity.this, CollectviewActivity.class));
        mDbControl.updatePrimalColumn(UserInfo.userName, tempNum, UserInfo.userMajor, tempOtherMajor, tempGrade, tempKakao, 0, 0);
        finish();
    }
}
