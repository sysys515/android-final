package com.example.fin_202010069;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import java.nio.charset.CharacterCodingException;

public class Activity4 extends AppCompatActivity {
    CheckBox cb1,cb2,cb3,cb4,cb5;
    EditText edit1,edit2,edit3,edit4,edit5;
    Button b3;
    String s1,s2,s3,s4,s5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);

        cb1=(CheckBox) findViewById(R.id.checkBox1);
        cb2=(CheckBox) findViewById(R.id.checkBox2);
        cb3=(CheckBox) findViewById(R.id.checkBox3);
        cb4=(CheckBox) findViewById(R.id.checkBox4);
        cb5=(CheckBox) findViewById(R.id.checkBox5);

        edit1=(EditText) findViewById(R.id.editText1);
        edit2=(EditText) findViewById(R.id.editText2);
        edit3=(EditText) findViewById(R.id.editText3);
        edit4=(EditText) findViewById(R.id.editText4);
        edit5=(EditText) findViewById(R.id.editText5);

//        b1=(Button) findViewById(R.id.button7);
//        b2=(Button) findViewById(R.id.button8);
        b3=(Button) findViewById(R.id.button9);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch(view.getId()) {
//                    case R.id.checkBox1:
//                        boolean checked1=((CheckBox)view).isChecked();
//                        if(checked1) {
//                            s1=edit1.getText().toString();
//                        } else
//                            s1="";
//                        break;
//                    case R.id.checkBox2:
//                        boolean checked2=((CheckBox)view).isChecked();
//                        if(checked2) {
//                            s2=edit2.getText().toString();
//                        } else
//                            s2="";
//                        break;
//                    case R.id.checkBox3:
//                        boolean checked3=((CheckBox)view).isChecked();
//                        if(checked3) {
//                            s3=edit3.getText().toString();
//                        } else
//                            s3="";
//                        break;
//                    case R.id.checkBox4:
//                        boolean checked4=((CheckBox)view).isChecked();
//                        if(checked4) {
//                            s4=edit4.getText().toString();
//                        } else
//                            s4="";
//                        break;
//                    case R.id.checkBox5:
//                        boolean checked5=((CheckBox)view).isChecked();
//                        if(checked5) {
//                            s5=edit5.getText().toString();
//                        } else
//                            s5="";
//                        break;
//                }
//                Intent intent=new Intent(Activity4.this,Activity5.class);
//                intent.putExtra("complete1",s1);
//                intent.putExtra("complete2",s2);
//                intent.putExtra("complete3",s3);
//                intent.putExtra("complete4",s4);
//                intent.putExtra("complete5",s5);
//                switch(view.getId()) {
//                    case R.id.checkBox1:
//                        boolean checked1=((CheckBox)view).isChecked();
//                        if(checked1) {
//                            s1=edit1.getText().toString();
//                            intent.putExtra("complete1",s1);
//                        } else
//                            break;
//                    case R.id.checkBox2:
//                        boolean checked2=((CheckBox)view).isChecked();
//                        if(checked2) {
//                            s2=edit2.getText().toString();
//                            intent.putExtra("complete2",s2);
//                        } else
//                            break;
//                    case R.id.checkBox3:
//                        boolean checked3=((CheckBox)view).isChecked();
//                        if(checked3) {
//                            s3=edit3.getText().toString();
//                            intent.putExtra("complete3",s3);
//                        } else
//                            break;
//                    case R.id.checkBox4:
//                        boolean checked4=((CheckBox)view).isChecked();
//                        if(checked4) {
//                            s4=edit4.getText().toString();
//                            intent.putExtra("complete4",s4);
//                        } else
//                            break;
//                    case R.id.checkBox5:
//                        boolean checked5=((CheckBox)view).isChecked();
//                        if(checked5) {
//                            s5=edit5.getText().toString();
//                            intent.putExtra("complete5",s5);
//                        } else
//                            break;

//                startActivityForResult(intent,2);
//            }
//        });

//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch(view.getId()) {
//                    case R.id.checkBox1:
//                        boolean checked1=((CheckBox)view).isChecked();
//                        if(checked1) {
//                            break;
//                        } else
//                            s1=edit1.getText().toString();
//                    case R.id.checkBox2:
//                        boolean checked2=((CheckBox)view).isChecked();
//                        if(checked2) {
//                            break;
//                        } else
//                            s2=edit2.getText().toString();
//                    case R.id.checkBox3:
//                        boolean checked3=((CheckBox)view).isChecked();
//                        if(checked3) {
//                            break;
//                        } else
//                            s3=edit3.getText().toString();
//                    case R.id.checkBox4:
//                        boolean checked4=((CheckBox)view).isChecked();
//                        if(checked4) {
//                            break;
//                        } else
//                            s4=edit4.getText().toString();
//                    case R.id.checkBox5:
//                        boolean checked5=((CheckBox)view).isChecked();
//                        if(checked5) {
//                            break;
//                        } else
//                            s5=edit5.getText().toString();
//                }
//                Intent intent=new Intent(Activity4.this,Activity6.class);
//                intent.putExtra("incomplete1",s1);
//                intent.putExtra("incomplete2",s2);
//                intent.putExtra("incomplete3",s3);
//                intent.putExtra("incomplete4",s4);
//                intent.putExtra("incomplete5",s5);
//                startActivityForResult(intent,3);
//            }
//        });
    }
}