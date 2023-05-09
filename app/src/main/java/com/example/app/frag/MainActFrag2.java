package com.example.app.frag;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.app.R;


public class MainActFrag2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactfrag2);

        /*
        Classe FragmentManager é responsável por gerir os fragmentos. add, remove, replace, etc.
         */
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        //Exemplo 1 sem args
        /*
        ft.add(R.id.fragment_content, new MainFrag2());
        ft.commit();*/

        //Exemplo 2 com args
        MainFrag2 frag = new MainFrag2();
        Bundle b = new Bundle();
        String link = "https://www.google.com";
        b.putString("Link", link);
        frag.setArguments(b);
        ft.add(R.id.fragment_content, frag);
        ft.commit();


    }


}
