package com.wmmalich.model;

import com.wmmalich.App;
import com.wmmalich.R;
import com.wmmalich.model.dto.ItemExample;
import com.wmmalich.model.dto.ListExample;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by greg on 1/29/2018.
 */

public class DataFactory {

    public ListExample getList() {
        ListExample listExample = new ListExample(
                App.getInstance().getResources().getString(R.string.example_name),
                App.getInstance().getResources().getString(R.string.example_description),
                465321f,
                App.getInstance().getResources().getString(R.string.example_currency),
                45.32143f,
                App.getInstance().getResources().getString(R.string.example_type),
                App.getInstance().getResources().getString(R.string.example_type_description),
                getItemExampleList());

        return listExample;
    }

    private ArrayList<ItemExample> getItemExampleList() {
        ArrayList<ItemExample> itemExampleArrayList = new ArrayList<>();
        String[] numbers = App.getInstance().getResources().getStringArray(R.array.numbers);
        Random random = new Random();
        int startValue = 1;
        for (int i = startValue; i <= numbers.length - startValue; i++) {
            ItemExample itemExample = new ItemExample(
                    App.getInstance().getResources().getString(R.string.item_name) + " " + numbers[i],
                    random.nextBoolean(),
                    //random.nextFloat() generate values from 0 to 1.0
                    //100 is max value of percent
                    random.nextFloat() * 100,
                    null
            );
            itemExampleArrayList.add(itemExample);
        }
        return itemExampleArrayList;
    }
}
