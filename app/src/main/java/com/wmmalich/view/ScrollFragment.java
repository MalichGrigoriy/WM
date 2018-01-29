package com.wmmalich.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wmmalich.App;
import com.wmmalich.R;
import com.wmmalich.databinding.FragmentScrollBinding;
import com.wmmalich.viewmodel.ScrollVO;

import javax.inject.Inject;

/**
 * Created by greg on 1/29/2018.
 */

public class ScrollFragment extends Fragment {

    private static String tag = "ScrollFragment";
    @Inject
    ScrollVO scrollVO;

    public ScrollFragment() {
    }

    public static ScrollFragment newInstance() {
        return new ScrollFragment();
    }

    public static String tag() {
        return tag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getComponent().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentScrollBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_scroll, container, false);
        binding.setScrollVO(scrollVO);
        return binding.getRoot();
    }


}
