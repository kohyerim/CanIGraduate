package com.example.canigraduate;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;

public class MajorsearchActivity extends Activity {
    DbOpenHelper mDbOpenHelper;
    DbControl mDbControl;
    Cursor iCusor;
    int[] pbMajorsearch = new int[] {0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_majorsearch);

        mDbOpenHelper = new DbOpenHelper(MajorsearchActivity.this);
        mDbControl = new DbControl();
        mDbOpenHelper.open();
        mDbOpenHelper.create();

        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        final int humanity = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.HUMANITY));
        int society = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.SOCIETY));
        int science = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.SCIENCE));
        int enginer = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.ENGINERRING));;
        int art = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.ARTANDPHYSIC));;
        pbMajorsearch = new int[]{humanity,society,science,enginer,art};
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.PB_majorsearch);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.humanity);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.society);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.technology);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.enginerring);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.artandphysical);

        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preference.edit();
        checkBox.setChecked(1==humanity);
        checkBox2.setChecked(1==society);
        checkBox3.setChecked(1==science);
        checkBox4.setChecked(1==enginer);
        checkBox5.setChecked(1==art);
        for(int i = 0; i<pbMajorsearch.length; i++){
            if (pbMajorsearch[i]==1){
                progressBar.setProgress(progressBar.getProgress()+2);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()){
                    editor.putBoolean("checkBox",true);
                    progressBar.setProgress(progressBar.getProgress()+2);
                    pbMajorsearch[0] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbMajorsearch[0] = 0;
                    editor.apply();
                }
            }
        });




        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox2.isChecked()){
                    editor.putBoolean("checkBox2",true);
                    progressBar.setProgress(progressBar.getProgress()+2);
                    pbMajorsearch[1] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox2",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbMajorsearch[1] = 0;
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
                    pbMajorsearch[2] = 1;
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkBox3",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbMajorsearch[2] = 0;
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
                    pbMajorsearch[3] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox4",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbMajorsearch[3] = 0;
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
                    pbMajorsearch[4] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox5",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbMajorsearch[4] = 0;
                    editor.apply();
                }
            }
        });
    }


    public void onClick(View view) {
        startActivity(new Intent(MajorsearchActivity.this, Graduationpoint_kakaoActivity.class));
        DbControl dbc = new DbControl();
        dbc.updateMajorSearchColumn(pbMajorsearch[0],pbMajorsearch[1],pbMajorsearch[2],pbMajorsearch[3],pbMajorsearch[4]);
        finish();
    }
}
