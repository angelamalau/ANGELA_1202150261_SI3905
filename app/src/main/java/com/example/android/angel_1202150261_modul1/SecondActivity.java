package com.example.android.angel_1202150261_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class SecondActivity extends AppCompatActivity {

    int uang = 65500;
    int biaya, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent a = getIntent();
        int porsi = a.getIntExtra("porsi", 0);
        String tempat = a.getStringExtra("tempat");
        String makanan = a.getStringExtra("makanan");
        int harga = a.getIntExtra("harga",0);

        TextView Makanan    = (TextView) findViewById(R.id.namamenu);
        Makanan.setText(makanan);
        TextView Porsi      = (TextView) findViewById(R.id.totalporsi);
        Porsi.setText(""+porsi);
        TextView Lokasi     = (TextView) findViewById(R.id.rm);
        Lokasi.setText(tempat);
        TextView Harga      = (TextView) findViewById(R.id.harga);
        Harga.setText(""+harga);


        if (harga > uang) {
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
