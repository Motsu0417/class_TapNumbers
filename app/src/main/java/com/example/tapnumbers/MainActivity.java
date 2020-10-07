package com.example.tapnumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] numArray;
    String Ques;
    int select;
    TextView text;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //縦画面固定
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        text = findViewById(R.id.textView);
        start();
    }
    
    public void start(){
        numArray = new int[4];
        Ques = "";
        Random rnd = new Random();
        for(int i = 0;i<4;i++){
            numArray[i] = rnd.nextInt(4) + 1;
            Ques += numArray[i] + "";
        }
        text.setText(Ques);
        select = 0;
    }

    public void numPress(View v){
        String pressnum = v.getTag().toString();
        if(pressnum.equals("1"));
    }
    
}