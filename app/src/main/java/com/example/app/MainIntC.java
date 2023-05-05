package com.example.app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainIntC extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_int_c);
        findViewById(R.id.btnActC).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        /* Intent interno*/
        /*
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, "Olá sou uma msg");
        intent.setType("text/plain");
        startActivity(intent);
        */

        // Chamar uma pagina internet
        /*
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        startActivity(intent);*/
        creatAlarm();
    }

    public void creatAlarm(){
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Alarme");
        intent.putExtra(AlarmClock.EXTRA_HOUR, 7);
        intent.putExtra(AlarmClock.EXTRA_MINUTES, 30);
        startActivity(intent);
    }


}
