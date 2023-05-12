package com.example.app.AppSergio;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class LpDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }
        if(savedInstanceState == null){
            //Durante a configuração inicial conecta o fragmento de detalhes
            LpDetailsFragment details = new LpDetailsFragment();
            details.setArguments(getIntent().getExtras());
            getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
        }
    }
}
