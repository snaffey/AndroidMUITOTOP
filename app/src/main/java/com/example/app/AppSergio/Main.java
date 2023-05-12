package com.example.app.AppSergio;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.app.R;

/*
LpLinksFragment - Fragmento que mostra a lista de linguages de programação,
    este fragmento estende a classe ListFragment para lidar com a ListView
-----------
LpDetailsActivity - Atividade que incorpora o fragmento LpDetailsFragment
    para mostrar os detalhes de uma linguagem de programação
-----------
LpDetailsFragment - Fragmento que mostra os detalhes de uma linguagem de programação
 */

public class Main extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainapp);
    }
}
