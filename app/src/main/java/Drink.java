package com.hfad.starbuzz;

import com.hfad.starbuzz.R;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks = {
            new Drink("Latte", "a couple of espresso shots with sreamed milk", R.drawable.latte),
            new Drink("Capuccino", "espresso hot milk, and steamed mil foam", R.drawable.capuccino),
            new Drink("Filter", "highest quality beans roasted and brewed fresh", R.drawable.filter)
    };
    private Drink(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getDescription(){ return description; }
    public String getName() { return name; }
    public int getImageResourceId() { return imageResourceId; }

    @Override
    public String toString() {
        return this.name;
    }
}
