package com.example.fathanauzan.jamdigital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {
    TextClock jamdigital;
    Button tampiljam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextClock jam1 = (TextClock) findViewById(R.id.jam1);

        jamdigital = (TextClock)findViewById(R.id.jam2);
        jamdigital.setVisibility(View.INVISIBLE);

        tampiljam = (Button)findViewById(R.id.btn_tampil);
    }
    public void ShowTextClock(View view) {
        jamdigital.setVisibility(view.VISIBLE);
        tampiljam.setText("Menampilkan Jam Digital");
    }
    public void keluar (View view) { finish(); }
}
