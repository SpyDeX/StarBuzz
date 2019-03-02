package com.hfad.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.hfad.starbuzz.Drink;

public class TopLevelActivity extends Activity {

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
            switch (position){
                case 0 :
                    Intent intent = new Intent(TopLevelActivity.this, DrinkCategoryActivity.class);
                    //intent.putExtra("list", Drink.drinks);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);

        ListView listView = findViewById(R.id.lst_categories);
        listView.setOnItemClickListener(itemClickListener);
    }
}
