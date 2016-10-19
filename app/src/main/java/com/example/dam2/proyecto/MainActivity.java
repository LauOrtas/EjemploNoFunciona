package com.example.dam2.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button bu;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.editText1);
        bu = (Button)findViewById(R.id.button1);
        tv = (TextView)findViewById(R.id.textview1);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numero=et.getText().toString();
                int num1=Integer.parseInt(numero);
                int total=num1*num1;
                tv.setText(total);
            }
        });

    }
}
