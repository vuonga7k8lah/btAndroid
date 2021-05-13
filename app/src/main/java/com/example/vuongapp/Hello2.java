package com.example.vuongapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hello2 extends AppCompatActivity {
    Button btnAuthor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello2);
        btnAuthor = (Button)findViewById(R.id.ve);
        btnAuthor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent veMain = new Intent(Hello2.this,MainActivity.class);
                startActivity(veMain);
            }
        });
    }
}