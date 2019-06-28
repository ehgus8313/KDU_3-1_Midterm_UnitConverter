package com.example.user.midterm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("201444001 권도현");
        Button Button1 = (Button) findViewById(R.id.button1);
        Button Button2 = (Button) findViewById(R.id.button2);
        Button Button3 = (Button) findViewById(R.id.button3);
        Button Button4 = (Button) findViewById(R.id.button4);
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent1 = new Intent(MainActivity.this, OndoActivity.class);
                MainActivity.this.startActivity(Intent1);
            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent2 = new Intent(MainActivity.this, LtActivity.class);
                MainActivity.this.startActivity(Intent2);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent3 = new Intent(MainActivity.this, MGActivity.class);
                MainActivity.this.startActivity(Intent3);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent4 = new Intent(MainActivity.this, MjActivity.class);
                MainActivity.this.startActivity(Intent4);
            }
        });
    }
}