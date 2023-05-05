package com.example.app.rv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.os.Bundle;
import com.example.app.R;

import java.util.ArrayList;
import java.util.List;

public class mainRvPessoa extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rvpessoa);
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        /*
        Recycler View precisa de um Layout Manager para funcionar.
         */
        rv.setLayoutManager(new LinearLayoutManager(this));

        Pessoa p1 = new Pessoa("João", "20", R.drawable.android);
        Pessoa p2 = new Pessoa("Maria", "30", R.drawable.android);
        Pessoa p3 = new Pessoa("José", "40", R.drawable.android);

        List<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        PessoaAdapter adapter = new PessoaAdapter(lista);
        rv.setAdapter(adapter);
    }
}
