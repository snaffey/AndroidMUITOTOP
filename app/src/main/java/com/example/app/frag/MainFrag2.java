package com.example.app.frag;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.app.R;

public class MainFrag2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflater.inflate(R.layout.frag_main_2, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    // Act que vincula o fragmento


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String link = null;
        Bundle b = getArguments();
        if (b != null) {
            link = b.getString("Link");
            Toast.makeText(getActivity(), link, Toast.LENGTH_SHORT).show();
        }
    }




}
