package com.example.app.rv;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.app.Act2;
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
        PessoaAdapter adapter = new PessoaAdapter(lista, this);
        rv.setAdapter(adapter);
    }

    // Vincular menu a actividade


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() ==  R.id.menuJ1){
            Toast.makeText(getBaseContext(), "Click J1", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.menuJ2) {
            faz();
        }
        return false;
    }

    public void faz(){
        Intent intent = new Intent(mainRvPessoa.this, Act2.class);
        startActivity(intent);
    }
}
