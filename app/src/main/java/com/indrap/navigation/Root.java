package com.indrap.navigation;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mycomputer on 13/10/16.
 */

public class Root extends Fragment{
    public Root(){}
    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.root, container, false);

        getActivity().setTitle("Navigation Drawer");

        return rootView;
    }
}
