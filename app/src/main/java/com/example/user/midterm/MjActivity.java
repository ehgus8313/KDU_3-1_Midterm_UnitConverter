package com.example.user.midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MjActivity extends AppCompatActivity {
    EditText e1, e2;
    Button btn1, btn2, exit;
    TextView resultview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mj);
        setTitle("면적변환기");
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
                double result = Integer.parseInt(temp)* 10.76391;
                resultview.setText("제곱 피트 면적은" + String.format("%.3f" ,result) + "제곱피트(ft2) 입니다. ");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = e2.getText().toString();
                double result = Integer.parseInt(temp) * 0.092903;
                resultview.setText("제곱 미터 면적은" + String.format("%.3f" ,result) + "제곱미터(m2) 입니다. ");
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