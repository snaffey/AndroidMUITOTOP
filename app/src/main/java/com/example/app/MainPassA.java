package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainPassA extends AppCompatActivity {
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_int_c);

        mButton = (Button) findViewById(R.id.btnAtivarAlarme);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPassA.this, MainTimer2Activity.class);
                Bundle b = new Bundle();
                b.putString("umaString", "Olá, sou uma String");
                intent.putExtra("stringBundle", b);
                intent.putExtra("mensagem", "2 msg");
                intent.putExtra("umInteiro", 10);
                intent.putExtra("umBool", true);
                startActivity(intent);
            }
        });
    }
}
