package com.example.user.midterm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OndoActivity extends AppCompatActivity {
    EditText e1, e2;
    Button btn1, btn2, exit;
    TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ondo);
        setTitle("온도변환기");
        init();
    }
    public void init(){
        btn1 = (Button) findViewById(R.id.h2_btn);
        btn2 = (Button) findViewById(R.id.h2_btn2);
        exit = (Button) findViewById(R.id.exitButton);
        e1 = (EditText)findViewById(R.id.h2_edit);
        e2 = (EditText)findViewById(R.id.h2_edit2);
        resultview = (TextView) findViewById(R.id.resultview);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = e1.getText().toString();
                double result = Integer.parseInt(temp)*1.8 + 32;
                resultview.setText("화씨 온도는" + String.format("%.3f" ,result) + "도 입니다.");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = e2.getText().toString();
                double result = (Integer.parseInt(temp)-32)/(1.8);
                resultview.setText("섭씨 온도는" + String.format("%.3f" ,result) + "도 입니다.");
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}