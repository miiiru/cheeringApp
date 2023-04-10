package com.androidApp.cheeringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.androidApp.cheeringapp.R;

public class MainActivity extends AppCompatActivity {

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        txt = (TextView)this.findViewById(R.id.textView);
//        txt.setText("実験中です");
    }

    //次へボタン
    public void subButton(View view){
        Intent intent = new Intent(this,SubActivity.class);
        intent.putExtra("message", txt.getText().toString());
        startActivity(intent);
    }


    //がんばったボタン
    public void effortButton(View view){
        txt.setText(R.string.effort_button_label);
    }
    //疲れちゃったボタン
    public void tiredButton(View view){
        txt.setText(R.string.tired_button_label);
    }
    //楽しかったボタン
    public void enjoyButton(View view){
        txt.setText(R.string.enjoy_button_label);
    }
    //傷ついたボタン
    public void getHurtButton(View view){
        txt.setText(R.string.getHurt_button_label);
    }
    //嬉しいことがあったボタン
    public void happyFoundButton(View view){
        txt.setText(R.string.happyFound_button_label);
    }
    //眠かったボタン
    public void sleepyButton(View view){
        txt.setText(R.string.sleepy_button_label);
    }
    //新しい発見があったボタン
    public void newDiscoveryFoundButton(View view){
        txt.setText(R.string.newDiscoveryFound_button_label);
    }
    //体調が悪かったボタン
    public void ConditionBadButton(View view){
        txt.setText(R.string.ConditionBad_button_label);
    }
    //刺激的だったボタン
    public void stimulationButton(View view){
        txt.setText(R.string.stimulation_button_label);
    }
    //忙しかったボタン
    public void busyButton(View view){
        txt.setText(R.string.busy_button_label);
    }
    //のんびり安らいだボタン
    public void recoveryButton(View view){
        txt.setText(R.string.recovery_button_label);
    }
    //悲しいことがあったボタン
    public void sadFoundButton(View view){
        txt.setText(R.string.sadFound_button_label);
    }
    //いつもと変わらないボタン
    public void normalButton(View view){
        txt.setText(R.string.normal_button_label);
    }
    //何もしてないボタン
    public void nothingButton(View view){
        txt.setText(R.string.nothing_button_label);
    }


    //終了画面へ
    public void endButton(View view){
        setContentView(R.layout.end);
    }

    //終了ボタンの処理
    public void exitButton(View view){
        super.finish();
    }
}