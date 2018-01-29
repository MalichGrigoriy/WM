package com.wmmalich.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.wmmalich.App;
import com.wmmalich.BR;
import com.wmmalich.model.DataFactory;
import com.wmmalich.model.dto.ListExample;

import javax.inject.Inject;

/**
 * Created by greg on 1/29/2018.
 */

public class ScrollVO extends BaseObservable {


    private final ListExample list;

    @Inject
    DataFactory dataFactory;

    public ScrollVO() {
        App.getComponent().inject(this);
        list = dataFactory.getList();
        notifyPropertyChanged(BR.list);
    }

    @Bindable
    public ListExample getList() {
        return list;
    }
}
