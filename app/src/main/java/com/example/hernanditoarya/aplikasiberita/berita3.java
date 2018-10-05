package com.example.hernanditoarya.aplikasiberita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class berita3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita3);
    }
    public void backMessage (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
