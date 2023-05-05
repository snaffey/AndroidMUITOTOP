package com.example.app.rv;

import static android.content.ContentValues.TAG;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.app.R;
import java.util.List;

/*
O adapter ira preencher os dados no recycleview. no entanto, ele precisa de um ViewHolder
 */

public class PessoaAdapter extends RecyclerView.Adapter<PessoaAdapter.PessoaViewHolder> {

    List<Pessoa> pessoas;

    PessoaAdapter(List<Pessoa> lista) {
        this.pessoas = lista;
    }

    /*
    onCreateViewHolder para inflar o layout do item
     */

    @Override
    public PessoaAdapter.PessoaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rvitempessoa, parent, false);
        PessoaViewHolder pvh = new PessoaViewHolder(v);
        return pvh;
    }

    /*
    onBindViewHolder para defenir os atributos de exebição do item
     */

    @Override
    public void onBindViewHolder(PessoaAdapter.PessoaViewHolder holder, int position) {
        holder.nomeView.setText(pessoas.get(position).nome);
        holder.idadeView.setText(pessoas.get(position).idade);
        holder.fotoView.setImageResource(pessoas.get(position).fotoId);
    }

    @Override
    public int getItemCount() {
        return pessoas.size();
    }

    public static class PessoaViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView nomeView;
        TextView idadeView;
        ImageView fotoView;

        public PessoaViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            nomeView = (TextView)itemView.findViewById(R.id.nomeView);
            idadeView = (TextView)itemView.findViewById(R.id.idadeView);
            fotoView = (ImageView)itemView.findViewById(R.id.fotoView);
        }

        @Override
        public void onClick(View v) {
            Log.d(TAG, "onClick " + getLayoutPosition() + nomeView.getText().toString());
        }
    }
}
