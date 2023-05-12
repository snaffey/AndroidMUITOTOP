package com.example.app.AppSergio;

import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.aplicacaofrancisco.R;


public class LpLinksFragment extends ListFragment {
    boolean dualFrame;
    int curPosition = 0;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Cria a lista list com o array definido no ficheiro XML
        //setListAdapter(contexto, array, tipo de vista)
        setListAdapter(ArrayAdapter.createFromResource(getActivity(), R.array.lp, android.R.layout.simple_list_item_activated_1));

        //Verifica a existência de frame para a página dos detalhes
        View detailsFrame = getActivity().findViewById(R.id.details);
        dualFrame = detailsFrame != null && detailsFrame.getVisibility() == View.VISIBLE;

        if(savedInstanceState != null){
            curPosition = savedInstanceState.getInt("curPosition", 0);
        }

        if(dualFrame){
            //retorna a lista e aplicas uma seleção simples
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            //chama o método de mostrar detalhes da seleção
            showDetails(curPosition);
        }
    }
    /*
        onSaveInstanceState(), este método é chamado antes da Activity ser parada ou qualquer método do ciclo de vida da atividade.
        Guardamos a última posição antes de ele ter quebrado (por exemplo: virar o ecrã, backstage)
    */

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("curPosition", curPosition);
        Log.i("curPosition", curPosition+"");
    }
    /*
        Ação despoletada pelo clique em algum item da lista
    */

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        showDetails(position);
    }

    private void showDetails(int index){
        curPosition = index;
        if(dualFrame){
            getListView().setItemChecked(index, true);
            //Verifica qual fragmento está exibido e altera-o caso necessário
            LpDetailsFragment details = (LpDetailsFragment) getFragmentManager().findFragmentById(R.id.details);
            //se o fragmento não existe ou não é ativo
            if(details == null || details.getShownIndex() != index){
                //Cria um novo fragmento
                details = LpDetailsFragment.newInstance(index);
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.details, details);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                ft.commit();
            }
        }else{
            Intent intent = new Intent();
            intent.setClass(getActivity(), LpDetailsActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }
    }
}
