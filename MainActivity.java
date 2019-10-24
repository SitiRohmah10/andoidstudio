package com.example.sitirohmahh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button simp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nim = (EditText)findViewById(R.id.nim);
        final EditText nama = (EditText)findViewById(R.id.nama);
        final EditText kelas = (EditText)findViewById(R.id.kls);
        final EditText ttl = (EditText)findViewById(R.id.ttl);

        simp=(Button)findViewById(R.id.simpan);
        simp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(getApplicationContext(), Connec.class);
                pindah.putExtra("NIM", nim.getText().toString());
                pindah.putExtra("NAMA", nama.getText().toString());
                pindah.putExtra("KELAS", kelas.getText().toString());
                pindah.putExtra("TTL", ttl.getText().toString());
                startActivity(pindah);
                finish();
            }
        });
    }
}
