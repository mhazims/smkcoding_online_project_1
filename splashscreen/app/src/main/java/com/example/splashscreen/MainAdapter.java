package com.example.splashscreen;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] titles;
    private int[] imgs;
    private String[] deskripsi;
    private int[] lagu;
    public MediaPlayer mediaPlayer;
    private boolean flag = true;

    public MainAdapter(Context c, String[] titles, int[] imgs, String[] deskripsi, int[] lagu) {
        context = c;
        this.titles = titles;
        this.imgs = imgs;
        this.deskripsi = deskripsi;
        this.lagu = lagu;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.row, null);
        }
        TextView textView1 = convertView.findViewById(R.id.text1);
        TextView textView2 = convertView.findViewById(R.id.text2);
        final ImageButton imageButton = convertView.findViewById(R.id.play1);

        textView1.setText(titles[position]);
        textView2.setText(deskripsi[position]);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag) {
                    mediaPlayer = MediaPlayer.create(context, (lagu[position]));
                    flag = false;

                }
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    imageButton.setImageResource(R.mipmap.play_button);
                }
                else {
                    mediaPlayer.release();
                    imageButton.setImageResource(R.mipmap.play_button);
                    mediaPlayer = MediaPlayer.create(context, (lagu[position]));
                    mediaPlayer.start();
                    imageButton.setImageResource(R.mipmap.pause);
                }

            }
        });
        return convertView;
    }
}
