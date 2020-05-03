package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton aksaraJw = findViewById(R.id.aksaraJawa);
        aksaraJw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aksaraJw1 = new Intent(getApplicationContext(), BaruActivity.class);
                   startActivity(aksaraJw1);
            }
        });
        ImageButton unggahBasa = findViewById(R.id.unggahBasa);
        unggahBasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent unggahBasa1 = new Intent(getApplicationContext(), unggahUngguh.class);
                startActivity(unggahBasa1);
            }
        });
        ImageButton ikiwayang = findViewById(R.id.ikiwayang);
        ikiwayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wayangan1 = new Intent(getApplicationContext(), Wayang.class);
                startActivity(wayangan1);
            }
        });
        ImageButton tembangku = findViewById(R.id.tembang);
        tembangku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tembangku1 = new Intent(getApplicationContext(), tembang.class);
                startActivity(tembangku1);
            }
        });

    }
}
