package com.example.sitirohmahh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Connec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connec);

        TextView nim1 = (TextView)findViewById(R.id.tnim);
        TextView nama1 = (TextView)findViewById(R.id.tnama);
        TextView kelas1 = (TextView)findViewById(R.id.tkelas);
        TextView ttl1 = (TextView)findViewById(R.id.ttl);

        nim1.setText(getIntent().getStringExtra("NIM"));
        nama1.setText(getIntent().getStringExtra("NAMA"));
        kelas1.setText(getIntent().getStringExtra("KELAS"));
        ttl1.setText(getIntent().getStringExtra("TTL"));
    }
}
