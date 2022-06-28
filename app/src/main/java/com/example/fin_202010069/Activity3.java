package com.example.fin_202010069;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    ImageView iv1,iv2;
    TextView tv;
    Button b1,b2;
    String s1,s2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        iv1=(ImageView) findViewById(R.id.imageView);
        iv2=(ImageView) findViewById(R.id.imageView2);
        tv=(TextView) findViewById(R.id.textView3);
        b1=(Button) findViewById(R.id.button5);
        b2=(Button) findViewById(R.id.button6);

        Intent intent=getIntent();

        tv.setText(""+intent.getStringExtra("weather"));

        s1=intent.getStringExtra("season");
        if(s1.equals("winter")) {
            iv1.setImageResource(R.drawable.winter);
        } else if(s1.equals("autumn")) {
            iv1.setImageResource(R.drawable.autumn);
        } else if(s1.equals("spring")) {
            iv1.setImageResource(R.drawable.spring);
        } else {
            iv1.setImageResource(R.drawable.summer);
        }

        s2=intent.getStringExtra("clothes");
        if(s2.equals("clothes1")) {
            iv2.setImageResource(R.drawable.clothes_1);
        } else if(s2.equals("clothes2")) {
            iv2.setImageResource(R.drawable.clothes_2);
        } else if(s2.equals("clothes3")) {
            iv2.setImageResource(R.drawable.clothes_3);
        } else {
            iv2.setImageResource(R.drawable.clothes_4);
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity3.this,Activity2.class);
                startActivityForResult(intent,1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Activity3.this,Activity1.class);
                startActivity(intent);
            }
        });
    }
}