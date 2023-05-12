package com.example.app.frag;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.TextView;
import android.widget.Toast;

import com.example.app.R;

public class MainFrag2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View fragView = inflater.inflate(R.layout.frag_main_2, container, false);
        String linktxt = getArguments().getString("link");
        link = (TextView) fragView.findViewById(R.id.txtFrag1);
        link.setText(linktxt);
        String nometxt = getArguments().getString("nome");
        nome = (TextView) fragView.findViewById(R.id.txtFrag1);
        nome.setText(nometxt);
        return fragView;
    }
    @Override
    public void onActivityCreated(Bundle savedInstaceState){
        super.onActivityCreated(savedInstaceState);
        String link = null;
        Bundle b = getArguments();
        if(b != null)
            link = b.getString(link);
        Toast.makeText(getActivity() ,link, Toast.LENGTH_LONG).show();
    }
}