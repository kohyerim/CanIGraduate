package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;

public class MajordetailActivity extends Activity {


    DbOpenHelper mDbOpenHelper;
    DbControl mDbControl;
    Cursor iCusor;
    int[] pbMajor = new int[] {0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majordetail);

        mDbOpenHelper = new DbOpenHelper(MajordetailActivity.this);
        mDbControl = new DbControl();
        mDbOpenHelper.open();
        mDbOpenHelper.create();

        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        final int dataStructure = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.DATASTRUCTURE));
        int datacommunication = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.DATACOMMUNICATION));
        int capStone1 = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.CAPSTONE1));
        int capStone2 = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.CAPSTONE2));;
        int capStone3 = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.CAPSTONE3));;
        pbMajor = new int[]{dataStructure,datacommunication,capStone1,capStone2,capStone3};
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.PB_datastructure);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.datastructure);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.datacommnuication);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.CAPSTONE1);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.CAPSTON2);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.CAPSTON3);

        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preference.edit();
        checkBox.setChecked(1==dataStructure);
        checkBox2.setChecked(1==datacommunication);
        checkBox3.setChecked(1==capStone1);
        checkBox4.setChecked(1==capStone2);
        checkBox5.setChecked(1==capStone3);
        for(int i = 0; i<pbMajor.length; i++){
            if(i<2){
                if (pbMajor[i]==1){
                    progressBar.setProgress(progressBar.getProgress()+3);
                }
            }else {
                if (pbMajor[i]==1){
                    progressBar.setProgress(progressBar.getProgress()+2);
                }
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()){
                    editor.putBoolean("checkBox",true);
                    progressBar.setProgress(progressBar.getProgress()+3);
                    pbMajor[0] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox",false);
                    progressBar.setProgress(progressBar.getProgress()-3);
                    pbMajor[0] = 0;
                    editor.apply();
                }
            }
        });




        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox2.isChecked()){
                    editor.putBoolean("checkBox2",true);
                    progressBar.setProgress(progressBar.getProgress()+3);
                    pbMajor[1] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox2",false);
                    progressBar.setProgress(progressBar.getProgress()-3);
                    pbMajor[1] = 0;
                    editor.apply();
                }
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox3.isChecked()){
                    editor.putBoolean("checkBox3",true);
                    progressBar.setProgress(progressBar.getProgress()+2);
                    pbMajor[2] = 1;
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkBox3",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbMajor[2] = 0;
                    editor.apply();
                }
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox4.isChecked()){
                    editor.putBoolean("checkBox4",true);
                    progressBar.setProgress(progressBar.getProgress()+2);
                    pbMajor[3] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox4",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbMajor[3] = 0;
                    editor.apply();
                }
            }
        });

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox5.isChecked()){
                    editor.putBoolean("checkBox5",true);
                    progressBar.setProgress(progressBar.getProgress()+2);
                    pbMajor[4] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox5",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbMajor[4] = 0;
                    editor.apply();
                }
            }
        });

    }

    public void onClick(View view) {
        startActivity(new Intent(MajordetailActivity.this, Graduationpoint_kakaoActivity.class));
        DbControl dbc = new DbControl();
        dbc.updateMajorDetailColumn(pbMajor[0],pbMajor[1],pbMajor[2],pbMajor[3],pbMajor[4]);
        finish();
    }
}
