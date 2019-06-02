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

public class WholecultureActivity extends Activity {
    DbOpenHelper mDbOpenHelper;
    DbControl mDbControl;
    Cursor iCusor;
    int[] pbwholeculture = new int[] {0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wholeculture);

        mDbOpenHelper = new DbOpenHelper(WholecultureActivity.this);
        mDbControl = new DbControl();
        mDbOpenHelper.open();
        mDbOpenHelper.create();

        iCusor = mDbControl.selectColumn();
        iCusor.moveToFirst();
        final int language = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.LAGUAGE));
        int history = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.HISTORY));
        int culture = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.CULTURE));
        int technology = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.TECHNOLOGY));
        int art = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.ART));
        int personality = iCusor.getInt(iCusor.getColumnIndex(Database.CreateDB.PERSONALITY));
        pbwholeculture = new int[]{language,history,culture,technology,art,personality};
        final ProgressBar progressBar = (ProgressBar) findViewById(R.id.PB_wholeculture);
        final CheckBox checkBox = (CheckBox) findViewById(R.id.language);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.history);
        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.culture);
        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.technology);
        final CheckBox checkBox5 = (CheckBox) findViewById(R.id.art);
        final CheckBox checkBox6 = (CheckBox) findViewById(R.id.personality);

        SharedPreferences preference = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preference.edit();
        checkBox.setChecked(1==language);
        checkBox2.setChecked(1==history);
        checkBox3.setChecked(1==culture);
        checkBox4.setChecked(1==technology);
        checkBox5.setChecked(1==art);
        checkBox5.setChecked(1==personality);
        for(int i = 0; i<pbwholeculture.length; i++){
            if (pbwholeculture[i]==1){
                progressBar.setProgress(progressBar.getProgress()+2);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox.isChecked()){
                    editor.putBoolean("checkBox",true);
                    progressBar.setProgress(progressBar.getProgress()+2);
                    pbwholeculture[0] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox",false);
                    int count = 0;
                    for(int i = 0; i<pbwholeculture.length; i++) {
                        if (pbwholeculture[i] == 1) {
                            count = count + 1;
                        }
                    }
                    if (count < 6) {
                        progressBar.setProgress(progressBar.getProgress() - 2);
                    }
                    pbwholeculture[0] = 0;
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
                    pbwholeculture[1] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox2",false);
                    int count = 0;
                    for(int i = 0; i<pbwholeculture.length; i++) {
                        if (pbwholeculture[i] == 1) {
                            count = count + 1;
                        }
                    }
                    if (count < 6) {
                        progressBar.setProgress(progressBar.getProgress() - 2);
                    }
                    pbwholeculture[1] = 0;
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
                    pbwholeculture[2] = 1;
                    editor.apply();
                }
                else{
                    editor.putBoolean("checkBox3",false);
                    int count = 0;
                    for(int i = 0; i<pbwholeculture.length; i++) {
                        if (pbwholeculture[i] == 1) {
                            count = count + 1;
                        }
                    }
                    if (count < 6) {
                        progressBar.setProgress(progressBar.getProgress() - 2);
                    }
                    pbwholeculture[2] = 0;
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
                    pbwholeculture[3] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox4",false);
                    int count = 0;
                    for(int i = 0; i<pbwholeculture.length; i++) {
                        if (pbwholeculture[i] == 1) {
                            count = count + 1;
                        }
                    }
                    if (count < 6) {
                        progressBar.setProgress(progressBar.getProgress() - 2);
                    }
                    pbwholeculture[3] = 0;
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
                    pbwholeculture[4] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox5",false);
                    int count = 0;
                    for(int i = 0; i<pbwholeculture.length; i++) {
                        if (pbwholeculture[i] == 1) {
                            count = count + 1;
                        }
                    }
                    if (count < 6) {
                        progressBar.setProgress(progressBar.getProgress() - 2);
                    }
                    pbwholeculture[4] = 0;
                    editor.apply();
                }
            }
        });

        checkBox6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(checkBox6.isChecked()){
                    editor.putBoolean("checkBox6",true);
                    progressBar.setProgress(progressBar.getProgress()+2);
                    pbwholeculture[5] = 1;
                    editor.apply();
                }else{
                    editor.putBoolean("checkBox6",false);
                    int count = 0;
                    for(int i = 0; i<pbwholeculture.length; i++) {
                        if (pbwholeculture[i] == 1) {
                            count = count + 1;
                        }
                    }
                    if (count < 6) {
                        progressBar.setProgress(progressBar.getProgress() - 2);
                    }
                    pbwholeculture[5] = 0;
                    editor.apply();
                }
            }
        });
    }

    public void onClick(View view) {
        startActivity(new Intent(WholecultureActivity.this, Graduationpoint_kakaoActivity.class));
        DbControl dbc = new DbControl();
        dbc.updateWholeCultureColumn(pbwholeculture[0],pbwholeculture[1],pbwholeculture[2],pbwholeculture[3],pbwholeculture[4],pbwholeculture[5]);
        finish();
    }
}
