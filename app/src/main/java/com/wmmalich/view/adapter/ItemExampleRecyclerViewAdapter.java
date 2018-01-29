package com.wmmalich.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.wmmalich.R;
import com.wmmalich.databinding.ItemExampleListBinding;
import com.wmmalich.model.dto.ItemExample;

import java.util.List;


public class ItemExampleRecyclerViewAdapter extends RecyclerView.Adapter<ItemExampleRecyclerViewAdapter.ViewHolder> {

    private List<ItemExample> mValues;
    private LayoutInflater layoutInflater;

    public ItemExampleRecyclerViewAdapter(List<ItemExample> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ItemExampleListBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.item_example_list, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        ItemExample item = mValues.get(position);
        holder.binding.setItem(item);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ItemExampleListBinding binding;

        ViewHolder(ItemExampleListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
