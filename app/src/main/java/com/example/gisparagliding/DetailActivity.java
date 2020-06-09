package com.example.gisparagliding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {
        TextView datanama,datatempat,datatelepon;
        Button btncall;
        ImageView datagambar;
        public static String id,nama,tempat,telepon,gambar;
        public static Double Latitude,Longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanama=findViewById(R.id.tv_Nama);
        datatempat=findViewById(R.id.tv_tempat);
        datatelepon=findViewById(R.id.tv_telepon);
        btncall=findViewById(R.id.btn_call);
        datagambar=findViewById(R.id.img_data);

        datanama.setText(nama);
        datatempat.setText(tempat);
        datatelepon.setText(telepon);
        Picasso.get().load(gambar).into(datagambar);

        btncall.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent call =new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+telepon));
        startActivity(call);

        }


    }



