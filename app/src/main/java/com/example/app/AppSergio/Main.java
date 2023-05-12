package com.example.app.AppSergio;

import android.app.Activity;
import android.os.Bundle;

import com.example.app.AppSergio.LpLinksFragment;
import com.example.app.R;

/*
LpLinksFragment - Fragmento que mostra a lista de linguagens de programação. Este fragmento estende a claase ListFragment para lidar com a ListView

--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---

LpDetailsActivity - Atividade que incorpora o fragmento LpDetailsFragment para exibição da página respetiva quando o ecrã está em orientação vertical

--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---

LpDetailsFragment - Fragmento que mostra a página web correspondente à linguagem selecionada da lista no fragmento LpLinksFragment.

--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
* */

public class Main extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainapp);
    }
}
