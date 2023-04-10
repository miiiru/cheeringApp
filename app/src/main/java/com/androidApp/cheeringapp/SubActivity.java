package com.androidApp.cheeringapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androidApp.cheeringapp.R;

public class SubActivity  extends AppCompatActivity {

    //new表示
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);

        TextView txt = (TextView)this.findViewById(R.id.subText);
        TextView  letter = (TextView)this.findViewById(R.id.SubText2);

        Intent intent = getIntent();
        String word = intent.getStringExtra("message");

        if(word.equals("")){
            txt.setText("前のページに戻って選んでね");
        } else{
            txt.setText(word + "を選んだあなたへ");
        }

        //メッセージ表示
        switch (word) {
            case "がんばった":
                letter.setText(R.string.sub_result1);
                break;
            case "疲れちゃった":
                letter.setText(R.string.sub_result2);
                break;
            case "楽しかった":
                letter.setText(R.string.sub_result3);
                break;
            case "傷ついた":
                letter.setText(R.string.sub_result4);
                break;
            case "嬉しいことがあった":
                letter.setText(R.string.sub_result5);
                break;
            case "眠かった":
                letter.setText(R.string.sub_result6);
                break;
            case "新しい発見があった":
                letter.setText(R.string.sub_result7);
                break;
            case "体調が悪かった":
                letter.setText(R.string.sub_result8);
                break;
            case "刺激的だった":
                letter.setText(R.string.sub_result9);
                break;
            case "忙しかった":
                letter.setText(R.string.sub_result10);
                break;
            case "のんびり安らいだ":
                letter.setText(R.string.sub_result11);
                break;
            case "悲しいことがあった":
                letter.setText(R.string.sub_result12);
                break;
            case "いつもと変わらない":
                letter.setText(R.string.sub_result13);
                break;
            case "何もしてない":
                letter.setText(R.string.sub_result14);
                break;
        }
    }


}
