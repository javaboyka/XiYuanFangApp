package com.importnew.importnewapp.fragment;

import android.os.Bundle;
import android.view.View;

import com.importnew.importnewapp.DataController;

/**
 * Created by lzjun on 8/16/15.
 */
public class OtherFragment extends PostListFragment{

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        dataController = new DataController("other");
        super.onViewCreated(view, savedInstanceState);

    }

}
