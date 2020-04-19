package com.example.mygroceries_javatask3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.text.MessageFormat;
import java.time.Month;
import java.util.Objects;

public class SecondActivity extends AppCompatActivity {

    int totalPrice;
    int Price1;
    int Price2;
    int Price3;
    int Price4;
    int Price5;
    int Price6;
    int Price7;
    int Price8;
    int Price9;
    int Price10;
    int Price11;
    int Price12;
    int Price13;
    int Price14;
    int Price15;
    int Price16;
    int Price17;
    int Price18;
    int Price19;
    int Price20;




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

    // for item textViews
    TextView item1TextView;
    TextView item2TextView;
    TextView item3TextView;
    TextView item4TextView;
    TextView item5TextView;
    TextView item6TextView;
    TextView item7TextView;
    TextView item8TextView;
    TextView item9TextView;
    TextView item10TextView;
    TextView item11TextView;
    TextView item12TextView;
    TextView item13TextView;
    TextView item14TextView;
    TextView item15TextView;
    TextView item16TextView;
    TextView item17TextView;
    TextView item18TextView;
    TextView item19TextView;
    TextView item20TextView;
    // for price textViews
    TextView price1TextView;
    TextView price2TextView;
    TextView price3TextView;
    TextView price4TextView;
    TextView price5TextView;
    TextView price6TextView;
    TextView price7TextView;
    TextView price8TextView;
    TextView price9TextView;
    TextView price10TextView;
    TextView price11TextView;
    TextView price12TextView;
    TextView price13TextView;
    TextView price14TextView;
    TextView price15TextView;
    TextView price16TextView;
    TextView price17TextView;
    TextView price18TextView;
    TextView price19TextView;
    TextView price20TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        // use single Intent intent to get editText values
        Intent intent = getIntent();

        TextView monthTextView = (TextView) findViewById(R.id.MONTH);
        if (intent.hasExtra("Month")) {
            monthTextView.setText("Month: " + intent.getStringExtra("Month"));
        }

        TextView nameTextView = (TextView) findViewById(R.id.NAME);
        if (intent.hasExtra("username")) {
            nameTextView.setText("Name: " + intent.getStringExtra("username"));
        }

        TextView groceryTypeTextView = (TextView) findViewById(R.id.GROCERYTYPE);
        if (intent.hasExtra("Grocery Type")) {
            groceryTypeTextView.setText("Grocery Type: " + intent.getStringExtra("Grocery Type"));
        }

        item1TextView = (TextView) findViewById(R.id.ITEM1);
        if (intent.hasExtra("Item1")) {
            item1TextView.setText("" + intent.getStringExtra("Item1"));
        }

        item2TextView = (TextView) findViewById(R.id.ITEM2);
        if (intent.hasExtra("Item2")) {
            item2TextView.setText("" + intent.getStringExtra("Item2"));
        }
        Intent item3Intent = getIntent();
        item3TextView = (TextView) findViewById(R.id.ITEM3);
        if (intent.hasExtra("Item3")) {
            item3TextView.setText("" + intent.getStringExtra("Item3"));
        }

        item4TextView = (TextView) findViewById(R.id.ITEM4);
        if (intent.hasExtra("Item4")) {
            item4TextView.setText("" + intent.getStringExtra("Item4"));
        }

        item5TextView = (TextView) findViewById(R.id.ITEM5);
        if (intent.hasExtra("Item5")) {
            item5TextView.setText("" + intent.getStringExtra("Item5"));
        }

       item6TextView = (TextView) findViewById(R.id.ITEM6);
        if (intent.hasExtra("Item6")) {
            item6TextView.setText("" + intent.getStringExtra("Item6"));
        }

        item7TextView = (TextView) findViewById(R.id.ITEM7);
        if (intent.hasExtra("Item7")) {
            item7TextView.setText("" + intent.getStringExtra("Item7"));
        }

       item8TextView = (TextView) findViewById(R.id.ITEM8);
        if (intent.hasExtra("Item8")) {
            item8TextView.setText("" + intent.getStringExtra("Item8"));
        }

        item9TextView = (TextView) findViewById(R.id.ITEM9);
        if (intent.hasExtra("Item9")) {
            item9TextView.setText("" + intent.getStringExtra("Item9"));
        }

         item10TextView = (TextView) findViewById(R.id.ITEM10);
        if (intent.hasExtra("Item10")) {
            item10TextView.setText("" + intent.getStringExtra("Item10"));
        }

        item11TextView = (TextView) findViewById(R.id.ITEM11);
        if (intent.hasExtra("Item11")) {
            item11TextView.setText("" + intent.getStringExtra("Item11"));
        }

        item12TextView = (TextView) findViewById(R.id.ITEM12);
        if (intent.hasExtra("Item12")) {
            item12TextView.setText("" + intent.getStringExtra("Item12"));
        }

        item13TextView = (TextView) findViewById(R.id.ITEM13);
        if (intent.hasExtra("Item13")) {
            item13TextView.setText("" + intent.getStringExtra("Item13"));
        }

        item14TextView = (TextView) findViewById(R.id.ITEM14);
        if (intent.hasExtra("Item14")) {
            item14TextView.setText("" + intent.getStringExtra("Item14"));
        }

        item15TextView = (TextView) findViewById(R.id.ITEM15);
        if (intent.hasExtra("Item15")) {
            item15TextView.setText("" + intent.getStringExtra("Item15"));
        }

        item16TextView = (TextView) findViewById(R.id.ITEM16);
        if (intent.hasExtra("Item16")) {
            item16TextView.setText("" + intent.getStringExtra("Item16"));
        }

        item17TextView = (TextView) findViewById(R.id.ITEM17);
        if (intent.hasExtra("Item17")) {
            item17TextView.setText("" + intent.getStringExtra("Item17"));
        }

        item18TextView = (TextView) findViewById(R.id.ITEM18);
        if (intent.hasExtra("Item18")) {
            item18TextView.setText("" + intent.getStringExtra("Item18"));
        }

        item19TextView = (TextView) findViewById(R.id.ITEM19);
        if (intent.hasExtra("Item19")) {
            item19TextView.setText("" + intent.getStringExtra("Item19"));
        }

        item20TextView = (TextView) findViewById(R.id.ITEM20);
        if (intent.hasExtra("Item20")) {
            item20TextView.setText("" + intent.getStringExtra("Item20"));
        }

        // FOR PRICE TEXT VIEWS
        price1TextView = (TextView) findViewById(R.id.PRICE1);
        if (intent.hasExtra("Price1")) {
            price1TextView.setText("" + intent.getStringExtra("Price1"));
            price1 = price1TextView.getText().toString();
            try {
            Price1 = Integer.parseInt(price1);
            } catch (NumberFormatException e){ }
        }

        price2TextView = (TextView) findViewById(R.id.PRICE2);
        if (intent.hasExtra("Price2")) {
            price2TextView.setText("" + intent.getStringExtra("Price2"));
            price2 = price2TextView.getText().toString();
            try {
            Price2 = Integer.parseInt(price2);
            } catch (NumberFormatException e){ }
        }

        price3TextView = (TextView) findViewById(R.id.PRICE3);
        if (intent.hasExtra("Price3")) {
            price3TextView.setText("" + intent.getStringExtra("Price3"));
            price3 = price3TextView.getText().toString();
           // Price3 = Integer.parseInt(price3);
            try {
            Price3 = Integer.parseInt(price3);
            } catch (NumberFormatException e){ }

        }

        price4TextView = (TextView) findViewById(R.id.PRICE4);
        if (intent.hasExtra("Price4")) {
            price4TextView.setText("" + intent.getStringExtra("Price4"));
            price4 = price4TextView.getText().toString();
            try {
         Price4 = Integer.parseInt(price4);
            } catch (NumberFormatException e){ }
        }

        price5TextView = (TextView) findViewById(R.id.PRICE5);
        if (intent.hasExtra("Price5")) {
            price5TextView.setText("" + intent.getStringExtra("Price5"));
            price5 = price5TextView.getText().toString();
            try {
            Price5 = Integer.parseInt(price5);
            } catch (NumberFormatException e){ }
        }

        price6TextView = (TextView) findViewById(R.id.PRICE6);
        if (intent.hasExtra("Price6")) {
            price6TextView.setText("" + intent.getStringExtra("Price6"));
            price6 = price6TextView.getText().toString();
            try {
            Price6 = Integer.parseInt(price6);
            } catch (NumberFormatException e){ }
        }

        price7TextView = (TextView) findViewById(R.id.PRICE7);
        if (intent.hasExtra("Price7")) {
            price7TextView.setText("" + intent.getStringExtra("Price7"));
            price7 = price7TextView.getText().toString();
            try {
            Price7 = Integer.parseInt(price7);
            } catch (NumberFormatException e){ }
        }

        price8TextView = (TextView) findViewById(R.id.PRICE8);
        if (intent.hasExtra("Price8")) {
            price8TextView.setText("" + intent.getStringExtra("Price8"));
            price8 = price8TextView.getText().toString();
            try {
            Price8 = Integer.parseInt(price8);
            } catch (NumberFormatException e){ }
        }

        price9TextView = (TextView) findViewById(R.id.PRICE9);
        if (intent.hasExtra("Price9")) {
            price9TextView.setText("" + intent.getStringExtra("Price9"));
            price9 = price9TextView.getText().toString();
            try {
            Price9 = Integer.parseInt(price9);
            } catch (NumberFormatException e){ }
        }

        price10TextView = (TextView) findViewById(R.id.PRICE10);
        if (intent.hasExtra("Price10")) {
            price10TextView.setText("" + intent.getStringExtra("Price10"));
            price10 = price10TextView.getText().toString();
            try {
            Price10 = Integer.parseInt(price10);
            } catch (NumberFormatException e){ }
        }

        price11TextView = (TextView) findViewById(R.id.PRICE11);
        if (intent.hasExtra("Price11")) {
            price11TextView.setText("" + intent.getStringExtra("Price11"));
            price11 = price11TextView.getText().toString();
            try {
            Price11 = Integer.parseInt(price11);
            } catch (NumberFormatException e){ }
        }

        price12TextView = (TextView) findViewById(R.id.PRICE12);
        if (intent.hasExtra("Price12")) {
            price12TextView.setText("" + intent.getStringExtra("Price12"));
            price12 = price12TextView.getText().toString();
            try {
            Price12 = Integer.parseInt(price12);
            } catch (NumberFormatException e){ }
        }

        price13TextView = (TextView) findViewById(R.id.PRICE13);
        if (intent.hasExtra("Price13")) {
            price13TextView.setText("" + intent.getStringExtra("Price13"));
            price13 = price13TextView.getText().toString();
            try {
            Price13 = Integer.parseInt(price13);
            } catch (NumberFormatException e){ }
        }

        price14TextView = (TextView) findViewById(R.id.PRICE14);
        if (intent.hasExtra("Price14")) {
            price14TextView.setText("" + intent.getStringExtra("Price14"));
            price14 = price14TextView.getText().toString();
            try {
            Price14 = Integer.parseInt(price14);
            } catch (NumberFormatException e){ }
        }

        price15TextView = (TextView) findViewById(R.id.PRICE15);
        if (intent.hasExtra("Price15")) {
            price15TextView.setText("" + intent.getStringExtra("Price15"));
            price15 = price15TextView.getText().toString();
            try {
            Price15 = Integer.parseInt(price15);
            } catch (NumberFormatException e){ }
        }

        price16TextView = (TextView) findViewById(R.id.PRICE16);
        if (intent.hasExtra("Price16")) {
            price16TextView.setText("" + intent.getStringExtra("Price16"));
            price16 = price16TextView.getText().toString();
            try {
            Price16 = Integer.parseInt(price16);
            } catch (NumberFormatException e){ }
        }

        price17TextView = (TextView) findViewById(R.id.PRICE17);
        if (intent.hasExtra("Price17")) {
            price17TextView.setText("" + intent.getStringExtra("Price17"));
            price17 = price17TextView.getText().toString();
            try {
            Price17 = Integer.parseInt(price17);
            } catch (NumberFormatException e){ }
        }

        price18TextView = (TextView) findViewById(R.id.PRICE18);
        if (intent.hasExtra("Price18")) {
            price18TextView.setText("" + intent.getStringExtra("Price18"));
            price18 = price18TextView.getText().toString();
            try {
            Price18 = Integer.parseInt(price18);
            } catch (NumberFormatException e){ }
        }

        price19TextView = (TextView) findViewById(R.id.PRICE19);
        if (intent.hasExtra("Price19")) {
            price19TextView.setText("" + intent.getStringExtra("Price19"));
            price19 = price19TextView.getText().toString();
            try {
            Price19 = Integer.parseInt(price19);
            } catch (NumberFormatException e){ }
        }

        price20TextView = (TextView) findViewById(R.id.PRICE20);
        if (intent.hasExtra("Price20")) {
            price20TextView.setText("" + intent.getStringExtra("Price20"));
            price20 = price20TextView.getText().toString();
            try {
            Price20 = Integer.parseInt(price20);
            } catch (NumberFormatException e){ }
        }
        int price= calculatePrice();

        TextView TotalPrice = (TextView) findViewById(R.id.TOTALPRICE);
        TotalPrice.setText("Total Price (#): " + price);


    }

   public void shareSummary(View view) {
       // for price edit text views
       item1 = item1TextView.getText().toString();
       item2 = item2TextView.getText().toString();
       item3 = item3TextView.getText().toString();
       item4 = item4TextView.getText().toString();
       item5 = item5TextView.getText().toString();
       item6 = item6TextView.getText().toString();
       item7 = item7TextView.getText().toString();
       item8 = item8TextView.getText().toString();
       item9 = item9TextView.getText().toString();
       item10 = item10TextView.getText().toString();
       item11 = item11TextView.getText().toString();
       item12 = item12TextView.getText().toString();
       item13 = item13TextView.getText().toString();
       item14 = item14TextView.getText().toString();
       item15 = item15TextView.getText().toString();
       item16 = item16TextView.getText().toString();
       item17 = item17TextView.getText().toString();
       item18 = item18TextView.getText().toString();
       item19 = item19TextView.getText().toString();
       item20 = item20TextView.getText().toString();



       Intent monthIntent = getIntent();
       TextView monthTextView = (TextView) findViewById(R.id.MONTH);
       if (monthIntent.hasExtra("Month")) {
           monthTextView.setText("Month: " + monthIntent.getStringExtra("Month"));
       }
       Intent nameIntent = getIntent();
       // username = nameIntent.getStringExtra(username);
       TextView nameTextView = (TextView) findViewById(R.id.NAME);
       if (nameIntent.hasExtra("username")) {
           nameTextView.setText("Name: " + nameIntent.getStringExtra("username"));
       }

       Intent groceryTypeIntent = getIntent();
       TextView groceryTypeTextView = (TextView) findViewById(R.id.GROCERYTYPE);
       if (groceryTypeIntent.hasExtra("Grocery Type")) {
           groceryTypeTextView.setText("Grocery Type: " + groceryTypeIntent.getStringExtra("Grocery Type"));
       }

       // getting values for items in below textViews to be set as mail subject
       String month = monthTextView.getText().toString();
       String name = nameTextView.getText().toString();
       String groceryType = groceryTypeTextView.getText().toString();

       String summaryMessage = name + "\n" + month +  "\n" + groceryType  ;
       summaryMessage += "\n" + ((item1 != null)? item1 + ": " + price1  + "\n":"" ) + ((item2 != null)? item2 + ": " + price2 + "\n":"" )+ ((item3 != null)?item3 + ": " + price3 + "\n":"" )+ ((item4 != null)? item4 + ": " + price4 + "\n":"" ) + ((item5 != null)?item5 + ": " + price5 + "\n":"" );
       summaryMessage += "\n" + ((item6 != null)? item6 + ": " + price6  + "\n":"" ) + ((item7 != null)? item7 + ": " + price7 + "\n":"" )+ ((item8 != null)?item8 + ": " + price8 + "\n":"" )+ ((item9 != null)? item9 + ": " + price9 + "\n":"" ) + ((item10 != null)?item10 + ": " + price10 + "\n":"" );
       summaryMessage += "\n" + ((item11 != null)? item11 + ": " + price11  + "\n":"" ) + ((item12 != null)? item12 + ": " + price12 + "\n":"" )+ ((item13 != null)?item13 + ": " + price13 + "\n":"" )+ ((item14 != null)? item14 + ": " + price14 + "\n":"" ) + ((item15 != null)?item15 + ": " + price15 + "\n":"" );
       summaryMessage += "\n" + ((item16 != null)? item16 + ": " + price16  + "\n":"" ) + ((item17 != null)? item17 + ": " + price17 + "\n":"" )+ ((item18 != null)?item18 + ": " + price18 + "\n":"" )+ ((item19 != null)? item19 + ": " + price19 + "\n":"" ) + ((item20 != null)?item20 + ": " + price20 + "\n":"" );


       // sending mail intent to be handled by the best app available
       Intent intent = new Intent(Intent.ACTION_SENDTO);
       intent.setData(Uri.parse("mailto:balogunzzt@gmail.com" )); // only email apps should handle this
      // intent.putExtra(Intent.EXTRA_SUBJECT, name + "'s" + " Summary of order of " + groceryType + " for " + " month: " + month);
       intent.putExtra(Intent.EXTRA_SUBJECT, "Summary of Grocery List");
       intent.putExtra(Intent.EXTRA_TEXT,summaryMessage);
       if (intent.resolveActivity(getPackageManager()) != null) {
           startActivity(intent);
       }


   }

    private int calculatePrice(){
        totalPrice = Price1+Price2+Price3+Price4+Price5+Price6+Price7+Price8+Price9+Price10+Price11+Price12+Price13+Price14+Price15+Price16+Price17+Price18+Price19+Price20;
        Log.v("SecondActivity", "I am working");
        return totalPrice;
    }
   /* private void displayQuantity(int totalPrice) {
        TextView quantityTextView = findViewById(R.id.TOTALPRICE);
        quantityTextView.setText(MessageFormat.format("{0}", totalPrice));
    }*/

}

