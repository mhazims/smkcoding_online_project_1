package com.example.splashscreen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class tembang extends AppCompatActivity {

    ListView list;
    ListAdapter listAdapter;
    MediaPlayer mediaPlayer;
    String titles[] = {"Tembang Macapat", "Tembang Macapat", "Tembang Macapat", "Tembang Macapat","Tembang Macapat","Tembang Macapat","Tembang Macapat","Tembang Macapat"};
    String deskripsi[]  = {"Dandhanggulo", "Gambuh", "Kinanthi", "Maskumambang", "Pangkur", "Sinom", "Pangkur", "Megatruh"};
    int imgs[] = {R.mipmap.play_button, R.mipmap.play_button, R.mipmap.play_button, R.mipmap.play_button, R.mipmap.play_button, R.mipmap.play_button, R.mipmap.play_button, R.mipmap.play_button};
    int lagu[] = {R.raw.dandang_gula, R.raw.gambuh, R.raw.kinanthi, R.raw.maskumambang, R.raw.pangkur, R.raw.pangkur, R.raw.pangkur, R.raw.pangkur};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tembang);

        list = findViewById(R.id.didi1);

        listAdapter = new MainAdapter( tembang.this, titles, imgs, deskripsi, lagu);

        list.setAdapter(listAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
    @Override
    protected void onPause(){
        super.onPause();
        mediaPlayer.stop();
        mediaPlayer.release();
    }
}
