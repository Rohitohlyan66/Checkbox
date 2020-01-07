package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cb1,cb2,cb3;
    int a=0,b=0,c=0;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=(CheckBox)findViewById(R.id.cb1);
        cb2=(CheckBox)findViewById(R.id.cb2);
        cb3=(CheckBox)findViewById(R.id.cb3);
    }

    public void checkedList(View view) {
       if(cb1.isChecked())
       {
            a=100;
       }
       if(cb2.isChecked())
       {
           b=50;
       }
       if(cb3.isChecked())
       {
           c=30;
       }
       string=Integer.toString(a+b+c);
       a=0;
       b=0;
       c=0;
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
