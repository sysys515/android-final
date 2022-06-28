package com.example.fin_202010069;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Activity2 extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4;
    Button b1,b2;
    String result1,result2,result3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        rb1=(RadioButton) findViewById(R.id.radioButton1);
        rb2=(RadioButton) findViewById(R.id.radioButton2);
        rb3=(RadioButton) findViewById(R.id.radioButton3);
        rb4=(RadioButton) findViewById(R.id.radioButton4);

        b1=(Button) findViewById(R.id.button3);
        b2=(Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(rb1.isChecked()==true) {
                    result1="winter";
                    result2="clothes1";
                    result3="패딩, 두꺼운 코트, 누빔 옷, \n 기모, 목도리, 히트텍, 가죽자켓 등";
                } else if(rb2.isChecked()==true) {
                    result1="autumn";
                    result2="clothes2";
                    result3="자켓, 트렌치코트, 니트,\n 스타킹, 가디건, 야상, 청바지 등";
                } else if(rb3.isChecked()==true) {
                    result1="spring";
                    result2="clothes3";
                    result3="얇은니트, 맨투맨, 얇은 가디건,\n 긴팔, 면바지, 청바지 등";
                } else {
                    result1="summer";
                    result2="clothes4";
                    result3="반팔, 얇은셔츠, 반바지,\n 민소매, 원피스, 면바지 등";
                }
                Intent intent=new Intent(Activity2.this,Activity3.class);
                intent.putExtra("season",result1);
                intent.putExtra("clothes",result2);
                intent.putExtra("weather",result3);
                startActivityForResult(intent,1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
