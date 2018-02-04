package com.example.android.angel_1202150261_modul1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText txtmenu, txtporsi;
    Button bteatbus, btabnormal;

    int totalporsi;
    int biaya;
    int harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtmenu = (EditText) findViewById(R.id.menu);
        txtporsi = (EditText) findViewById(R.id.porsi);
        bteatbus = (Button) findViewById(R.id.eatbus);
        btabnormal = (Button) findViewById(R.id.abnormal);

    //  untuk Abnormal
        btabnormal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent a = new Intent(MainActivity.this,SecondActivity.class);
            String tempat = btabnormal.getText().toString();
            totalporsi = Integer.parseInt(txtporsi.getText().toString());
            int harga = 30000 * totalporsi;

            a.putExtra("makanan", txtmenu.getText().toString());
            a.putExtra("tempat", tempat);
            a.putExtra("porsi", totalporsi);
            a.putExtra("harga", harga);
            startActivity(a);

        }
    });

    //untuk eatbus
        bteatbus.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        Intent a = new Intent(MainActivity.this, SecondActivity.class);
        String tempat = bteatbus.getText().toString();
            totalporsi = Integer.parseInt(txtporsi.getText().toString());
            int harga  = 50000 * totalporsi;

        a.putExtra("makanan", txtmenu.getText().toString());
        a.putExtra("tempat", tempat);
        a.putExtra("porsi", totalporsi);
        a.putExtra("harga", harga);
        startActivity(a);
    }
    });
    }

    }
