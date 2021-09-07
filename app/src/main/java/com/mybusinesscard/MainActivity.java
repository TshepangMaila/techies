package com.mybusinesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mNextScreenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNextScreenBtn = findViewById(R.id.button);

        mNextScreenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent nextScreenIntent = new Intent(view.getContext(), ListScreen.class);
               startActivity(nextScreenIntent);
            }
        });

    }
}