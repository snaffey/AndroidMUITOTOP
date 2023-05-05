package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/*public class MainListView extends AppCompatActivity {
   ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlistview);
        listView = (ListView) findViewById(R.id.listView);

        //Lista de dados
        String[] dados = new String[]{"Sérgio", "João", "Maria", "José", "Pedro", "Paulo", "Lucas", "Luciana", "Ana", "Mariana", "Mário", "Marcos", "Márcia", "Marta"};

        //Padrão de desenho adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dados);

        //vincular ao list view
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView texto = (TextView) view;
                String txt = "Item" + position + " - " + texto.getText().toString();
                Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();
            }
        }

    }
}*/
