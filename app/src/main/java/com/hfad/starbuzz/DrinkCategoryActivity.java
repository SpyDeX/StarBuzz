package com.hfad.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import com.hfad.starbuzz.Drink;

import java.util.ArrayList;

public class DrinkCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_category);

        Intent intent = getIntent();
        //ArrayList aLst = intent.getParcelableArrayListExtra("list");

        ArrayAdapter listAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Drink.drinks);

        ListView listDrinks = findViewById(R.id.lst_drinks);
        listDrinks.setAdapter(listAdapter);

        Spinner spinDrinks = findViewById(R.id.spn_drinks);
        spinDrinks.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
                intent1.putExtra(DrinkActivity.EXTRA_DRINKID, (int) id);
                startActivity(intent1);
            }
        };
        listDrinks.setOnItemClickListener(itemClickListener);
        //spinDrinks.setOnItemClickListener(itemClickListener);
    }
}
