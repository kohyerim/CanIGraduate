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

public class BasicActivity extends Activity {
    DbOpenHelper mDbOpenHelper;
    DbControl mDbControl;
    Cursor iCusor;
    int[] pbBasic = new int[] {0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        mDbOpenHelper = new DbOpenHelper(BasicActivity.this);
        mDbControl = new DbControl();
        mDbOpenHelper.open();
        mDbOpenHelper.create();

        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        final int writing = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.WRITING));
        int foreign2  = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.FOREIGN_2));
        int foreign = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.FOREIGN));;
        int logic = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.LOGIC));;
        int foreignfinal = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.FOREIGN_FINAL));;
        pbBasic = new int[]{writing,foreign2,foreign,logic,foreignfinal};
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.PB_basic);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.writing);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.foreign2);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.foreign);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.logic);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.foreignfinal);


        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preference.edit();
        checkBox.setChecked(1==writing);
        checkBox2.setChecked(1==foreign2);
        checkBox3.setChecked(1==foreign);
        checkBox4.setChecked(1==logic);
        checkBox5.setChecked(1==foreignfinal);
        for(int i = 0; i<pbBasic.length-1; i++){
            if (pbBasic[i]==1){
                progressBar.setProgress(progressBar.getProgress()+2);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()){
                    editor.putBoolean("checkBox",true);
                    progressBar.setProgress(progressBar.getProgress()+2);
                    pbBasic[0] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox",false);
                    progressBar.setProgress(progressBar.getProgress()-2);
                    pbBasic[0] = 0;
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
                    pbBasic[1] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox2",false);
                    progressBar.setProgress(progressBar.getProgress()-2);

                    checkBox5.setChecked(false);
                    pbBasic[1] = 0;
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
                    pbBasic[2] = 1;
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkBox3",false);
                    progressBar.setProgress(progressBar.getProgress()-2);

                    checkBox5.setChecked(false);
                    pbBasic[2] = 0;
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
                    pbBasic[3] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox4",false);
                    progressBar.setProgress(progressBar.getProgress()-2);

                    pbBasic[3] = 0;
                    editor.apply();
                }
            }
        });

        checkBox5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox5.isChecked()){
                    editor.putBoolean("checkBox2",true);
                    editor.putBoolean("checkBox3",true);
                    editor.putBoolean("checkBox5",true);
                    checkBox2.setChecked(true);
                    checkBox3.setChecked(true);
                    pbBasic[1] = 1;
                    pbBasic[2] = 1;
                    pbBasic[4] = 1;
                    editor.apply();
                }else if(checkBox2.isChecked()&&checkBox3.isChecked()) {
                    editor.putBoolean("checkBox5", true);
                    checkBox5.setChecked(true);
                    pbBasic[1] = 1;
                    pbBasic[2] = 1;
                    pbBasic[4] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox2",false);
                    editor.putBoolean("checkBox3",false);
                    editor.putBoolean("checkBox5",false);
                    pbBasic[1] = 0;
                    pbBasic[2] = 0;
                    pbBasic[4] = 0;
                    editor.apply();
                }
            }
        });
    }

    public void onClick(View view) {
        startActivity(new Intent(BasicActivity.this, Graduationpoint_kakaoActivity.class));
        DbControl dbc = new DbControl();
        dbc.updateBasicColumn(pbBasic[0],pbBasic[1],pbBasic[2],pbBasic[4],pbBasic[3]);
        finish();
    }
}
