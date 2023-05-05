package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Act2 extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_int_c);
        // Capturar o que intent devolve
        Intent intent = getIntent();
        Bundle b = intent.getBundleExtra("stringBundle");
        String umaString = b.getString("umaString");
        String mensagem = intent.getStringExtra("mensagem");
        int umInteiro = intent.getIntExtra("umInteiro", 0);
        Toast.makeText(this, umaString + " " + mensagem + " " + umInteiro, Toast.LENGTH_LONG).show();
    }
}
