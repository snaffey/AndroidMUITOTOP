package com.example.app.AppSergio;

import android.app.Fragment;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ScrollView;

import androidx.annotation.Nullable;

import com.example.aplicacaofrancisco.R;

public class LpDetailsFragment extends Fragment {

    public static LpDetailsFragment newInstance(int index) {
        LpDetailsFragment lpdf = new LpDetailsFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        lpdf.setArguments(args);
        return lpdf;
    }

    public int getShownIndex(){
        return getArguments().getInt("index", 0);
    }

    /*
        Devolve um objeto ScrollView com um webview carregado com a página web
    */

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final String[] links = getResources().getStringArray(R.array.pages);
        ScrollView scroller = new ScrollView(getActivity());
        WebView webview = new WebView(getActivity());
        //Serve para que aplicativos de terceiros abram paginas no próprio app
        webview.setWebViewClient(new SwAWebClient());
        int padding = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 4, getActivity().getResources().getDisplayMetrics());
        webview.setPadding(padding, padding, padding, padding);
        scroller.addView(webview);
        webview.loadUrl(links[getShownIndex()]);
        return scroller;
    }

    private class SwAWebClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return false;
        }
    }
}
