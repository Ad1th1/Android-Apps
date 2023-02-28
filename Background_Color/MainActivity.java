package com.example.color;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button redButton, greenButton;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        redButton = findViewById(R.id.redButton);
        greenButton = findViewById(R.id.greenButton);
        layout = findViewById(R.id.linearlayout);

        redButton.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               layout.setBackgroundColor(Color.RED);
           }
        });

        greenButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                layout.setBackgroundColor(Color.GREEN);
            }
        });
    }
}
