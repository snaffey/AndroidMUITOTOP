package com.example.app.AppSergio;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;

import com.example.app.R;

public class LpLinkFragment extends ListFragment {
    boolean dualFrame;
    int curPosition = 0;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Configura o adaptador para preencher a lista de linguagens de programação
        setListAdapter(ArrayAdapter.createFromResource(getActivity(),
                R.array.lp, android.R.layout.simple_list_item_activated_1));
        // Verifica se o fragmento está sendo executado em um layout de duas
        View detailsFrame = getActivity().findViewById(R.id.details);
        dualFrame = detailsFrame != null && detailsFrame.getVisibility() == View.VISIBLE;
    }
}
