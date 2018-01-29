package com.wmmalich.view.adapter;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.wmmalich.model.dto.ItemExample;
import com.wmmalich.util.Log;

import java.util.ArrayList;

/**
 * Created by greg on 1/29/2018.
 */

public class DataBindingAdapter {

    @BindingAdapter("ListData")
    public static void setListData(RecyclerView recyclerView, ArrayList<ItemExample> itemExampleArrayList) {
        if (recyclerView.getAdapter() != null && recyclerView.getAdapter().getItemCount() != 0) {
            recyclerView.getAdapter().notifyItemRangeChanged(recyclerView.getAdapter().getItemCount(), itemExampleArrayList.size());
            Log.d("2");

        } else {
            if (itemExampleArrayList != null) {
                recyclerView.setAdapter(new ItemExampleRecyclerViewAdapter(itemExampleArrayList));
                Log.d("3");
            }
        }
    }

    @BindingAdapter("percent")
    public static void setPercent(TextView textView, float percent) {
        //TODO change color, add percent char, use float numbers format
        textView.setText(String.valueOf(percent));
    }


}
