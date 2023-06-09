package com.example.app.frag;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import com.example.app.R;


public class MainActFrag1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactfrag2);

        /*
        Classe FragmentManager é responsável por gerir os fragmentos. add, remove, replace, etc.
         */
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, new MainFrag1());
    }
}
