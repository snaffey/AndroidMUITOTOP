package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainIntA extends AppCompatActivity implements View.OnClickListener {
    TextView viewRes;
    EditText n1, n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_int_a);
        findViewById(R.id.btnActB).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        /* Chamar act B
        new Intent(origem, destino);
        */
        Intent intent = new Intent(MainIntA.this, MainIntB.class);
        startActivity(intent);
    }
}
