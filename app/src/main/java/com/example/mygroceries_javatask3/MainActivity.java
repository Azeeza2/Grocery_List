package com.example.mygroceries_javatask3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Date;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout itemLayout;

    // edit text values
    EditText Month;
    EditText Username;
    EditText GroceryType;
    EditText Item1;
    EditText Item2;
    EditText Item3;
    EditText Item4;
    EditText Item5;
    EditText Item6;
    EditText Item7;
    EditText Item8;
    EditText Item9;
    EditText Item10;
    EditText Item11;
    EditText Item12;
    EditText Item13;
    EditText Item14;
    EditText Item15;
    EditText Item16;
    EditText Item17;
    EditText Item18;
    EditText Item19;
    EditText Item20;
    EditText Price1;
    EditText Price2;
    EditText Price3;
    EditText Price4;
    EditText Price5;
    EditText Price6;
    EditText Price7;
    EditText Price8;
    EditText Price9;
    EditText Price10;
    EditText Price11;
    EditText Price12;
    EditText Price13;
    EditText Price14;
    EditText Price15;
    EditText Price16;
    EditText Price17;
    EditText Price18;
    EditText Price19;
    EditText Price20;


    // string names
    String month;
    String username;
    String groceryType;
    String item1;
    String item2;
    String item3;
    String item4;
    String item5;
    String item6;
    String item7;
    String item8;
    String item9;
    String item10;
    String item11;
    String item12;
    String item13;
    String item14;
    String item15;
    String item16;
    String item17;
    String item18;
    String item19;
    String item20;
    String price1;
    String price2;
    String price3;
    String price4;
    String price5;
    String price6;
    String price7;
    String price8;
    String price9;
    String price10;
    String price11;
    String price12;
    String price13;
    String price14;
    String price15;
    String price16;
    String price17;
    String price18;
    String price19;
    String price20;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Getting month from input in required field
        Month = findViewById(R.id.Month);
        // getting value from editable newItemTextView and storing it in a string


        // Getting user name from input in required field
        Username = findViewById(R.id.Username);


        // Getting grocery type from input in required field
        GroceryType = findViewById(R.id.GroceryType);
        Item1 = findViewById(R.id.Item1);
        Item2 = findViewById(R.id.Item2);
        Item3 = findViewById(R.id.Item3);
        Item4 = findViewById(R.id.Item4);
        Item5 = findViewById(R.id.Item5);
        Item6 = findViewById(R.id.Item6);
        Item7 = findViewById(R.id.Item7);
        Item8 = findViewById(R.id.Item8);
        Item9 = findViewById(R.id.Item9);
        Item10 = findViewById(R.id.Item10);
        Item11 = findViewById(R.id.Item11);
        Item12 = findViewById(R.id.Item12);
        Item13 = findViewById(R.id.Item13);
        Item14 = findViewById(R.id.Item14);
        Item15 = findViewById(R.id.Item15);
        Item16 = findViewById(R.id.Item16);
        Item17 = findViewById(R.id.Item17);
        Item18 = findViewById(R.id.Item18);
        Item19 = findViewById(R.id.Item19);
        Item20 = findViewById(R.id.Item20);

        Price1 = findViewById(R.id.price1);
        Price2 = findViewById(R.id.price2);
        Price3 = findViewById(R.id.price3);
        Price4 = findViewById(R.id.price4);
        Price5 = findViewById(R.id.price5);
        Price6 = findViewById(R.id.price6);
        Price7 = findViewById(R.id.price7);
        Price8 = findViewById(R.id.price8);
        Price9 = findViewById(R.id.price9);
        Price10 = findViewById(R.id.price10);
        Price11 = findViewById(R.id.price11);
        Price12 = findViewById(R.id.price12);
        Price13 = findViewById(R.id.price13);
        Price14 = findViewById(R.id.price14);
        Price15 = findViewById(R.id.price15);
        Price16 = findViewById(R.id.price16);
        Price17 = findViewById(R.id.price17);
        Price18 = findViewById(R.id.price18);
        Price19 = findViewById(R.id.price19);
        Price20 = findViewById(R.id.price20);


        /*// Creating dynamic edit text views for item names
        itemLayout = findViewById(R.id.itemsLayout);
        // Adding as many text views as possible with the limit set at 200
        for (int i = 1; i <= 200; i++) {
            ItemName = new EditText(this);
            ItemName.setText("");
          //  ItemNames = Integer.parseInt(ItemName.getText().toString());
            itemLayout.addView(ItemName);
        }


        // Creating dynamic edit text views for item prices
        LinearLayout priceLayout = findViewById(R.id.priceLayout);
        // Adding as many edit text views as possible with the limit set at 200
        for (int i = 1; i <= 200; i++) {
            ItemPrice = new EditText(this);
            ItemPrice.setText("");
            priceLayout.addView(ItemPrice);

        }*/
    }

    public void createSummary(View view) {
        // getting value from editable newItemTextView and storing it in a string
        username =  Username.getText().toString();
        // getting value from editable groceryTextView and storing it in a string
        groceryType = GroceryType.getText().toString();
        // getting value from editable newItemTextView and storing it in a string
        month = Month.getText().toString();
        /*// getting value from editable itemLayout and storing them in a string
        itemNames = ItemName.getText().toString();*/

        // for itemName edit text views
        item1 = Item1.getText().toString();
        item2 = Item2.getText().toString();
        item3 = Item3.getText().toString();
        item4 = Item4.getText().toString();
        item5 = Item5.getText().toString();
        item6 = Item6.getText().toString();
        item7 = Item7.getText().toString();
        item8 = Item8.getText().toString();
        item9 = Item9.getText().toString();
        item10 = Item10.getText().toString();
        item11 = Item11.getText().toString();
        item12 = Item12.getText().toString();
        item13 = Item13.getText().toString();
        item14 = Item14.getText().toString();
        item15 = Item15.getText().toString();
        item16 = Item16.getText().toString();
        item17 = Item17.getText().toString();
        item18 = Item18.getText().toString();
        item19 = Item19.getText().toString();
        item20 = Item20.getText().toString();
        // for price edit text views
        price1 = Price1.getText().toString();
        price2 = Price2.getText().toString();
        price3 = Price3.getText().toString();
        price4 = Price4.getText().toString();
        price5 = Price5.getText().toString();
        price6 = Price6.getText().toString();
        price7 = Price7.getText().toString();
        price8 = Price8.getText().toString();
        price9 = Price9.getText().toString();
        price10 = Price10.getText().toString();
        price11 = Price11.getText().toString();
        price12 = Price12.getText().toString();
        price13 = Price13.getText().toString();
        price14 = Price14.getText().toString();
        price15 = Price15.getText().toString();
        price16 = Price16.getText().toString();
        price17 = Price17.getText().toString();
        price18 = Price18.getText().toString();
        price19 = Price19.getText().toString();
        price20 = Price20.getText().toString();




        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("username",username);
        intent.putExtra("Grocery Type", groceryType);
        intent.putExtra("Month", month);
        // intent.putExtra("ItemNames", itemNames);

        // for  itemName EditViews
        intent.putExtra("Item1", item1);
        intent.putExtra("Item2", item2);
        intent.putExtra("Item3", item3);
        intent.putExtra("Item4", item4);
        intent.putExtra("Item5", item5);
        intent.putExtra("Item6", item6);
        intent.putExtra("Item7", item7);
        intent.putExtra("Item8", item8);
        intent.putExtra("Item9", item9);
        intent.putExtra("Item10", item10);
        intent.putExtra("Item11", item11);
        intent.putExtra("Item12", item12);
        intent.putExtra("Item13", item13);
        intent.putExtra("Item14", item14);
        intent.putExtra("Item15", item15);
        intent.putExtra("Item16", item16);
        intent.putExtra("Item17", item17);
        intent.putExtra("Item18", item18);
        intent.putExtra("Item19", item19);
        intent.putExtra("Item20", item20);
        // for itemPrice EditViews
        intent.putExtra("Price1", price1);
        intent.putExtra("Price2", price2);
        intent.putExtra("Price3", price3);
        intent.putExtra("Price4", price4);
        intent.putExtra("Price5", price5);
        intent.putExtra("Price6", price6);
        intent.putExtra("Price7", price7);
        intent.putExtra("Price8", price8);
        intent.putExtra("Price9", price9);
        intent.putExtra("Price10", price10);
        intent.putExtra("Price11", price11);
        intent.putExtra("Price12", price12);
        intent.putExtra("Price13", price13);
        intent.putExtra("Price14", price14);
        intent.putExtra("Price15", price15);
        intent.putExtra("Price16", price16);
        intent.putExtra("Price17", price17);
        intent.putExtra("Price18", price18);
        intent.putExtra("Price19", price19);
        intent.putExtra("Price20", price20);

        // starting SecondActivity
        startActivity(intent);
    }
}