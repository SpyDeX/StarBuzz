package com.hfad.starbuzz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.hfad.starbuzz.Drink;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKID = "Drink_Id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int dId = getIntent().getExtras().getInt(EXTRA_DRINKID);
        Drink drink = Drink.drinks[dId];

        ImageView iv_photo = findViewById(R.id.photo);
        iv_photo.setImageResource( drink.getImageResourceId() );
        iv_photo.setContentDescription( drink.getName() );

        TextView tv_title = findViewById(R.id.title);
        tv_title.setText( drink.getName() );

        TextView tv_description = findViewById(R.id.description);
        tv_description.setText( drink.getDescription() );
    }
}
