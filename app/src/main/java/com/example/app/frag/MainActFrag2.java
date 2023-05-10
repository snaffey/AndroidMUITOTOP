package com.example.applicationblow.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.app.R;
import com.example.namespace.R;

public class MainActFrag2 extends Activity {
    Button btn;
    private FragmentTransaction ft;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactfrag2);
        btn = (Button) findViewById(R.id.botao1);
        btn.setOnClickListener((View.OnClickListener) this);
        FragmentManager fm = getFragmentManager();
        ft = fm.beginTransaction();
        /*ft.add(R.id.fragment_content, new MainFrag2());
        //commit->que valida as transaction
        ft.commit();*/
        MainFrag2 frag = new MainFrag2();
        Bundle b = new Bundle();
        String link = "http://epcc.pt";
        b.putString("link", link);
        frag.setArguments(b);
        ft.add(R.id.fragment_content,frag);
    }
    public void onClick(View view){
        ft.commit();
    }


}