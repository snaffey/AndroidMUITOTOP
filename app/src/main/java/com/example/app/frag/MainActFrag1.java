package com.example.app.frag;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.app.R;


public class MainActFrag1 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactfrag1);

        /*
        Classe FragmentManager é responsável por gerir os fragmentos. add, remove, replace, etc.
         */
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag1, new MainFrag1());
    }
}
