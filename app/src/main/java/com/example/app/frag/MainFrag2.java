package com.example.applicationblow.fragment;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.Toast;

import com.example.app.R;

public class MainFrag2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_main_2, container, false);
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