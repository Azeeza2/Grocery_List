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

        /*TextView TotalPrice = (TextView) findViewById(R.id.TOTALPRICE);
        String TOTALPRICE = TotalPrice.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("Total Price",TOTALPRICE);

        Intent totalPriceIntent = getIntent();
        if (totalPriceIntent.hasExtra("Total Price")) {
            TotalPrice.setText("Total Price (#): " + totalPrice);
        }
*/
       int price= calculatePrice();
        // int price= Price1+Price2+Price3+Price4+Price5+Price6+Price7+Price8+Price9+Price10+Price11+Price12+Price13+Price14+Price15+Price16+Price17+Price18+Price19+Price20;
        Log.v("SecondActivity", "I am working");

        TextView TotalPrice = (TextView) findViewById(R.id.TOTALPRICE);
            TotalPrice.setText("Total Price (#): " + price);


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
        Intent item1Intent = getIntent();
        item1TextView = (TextView) findViewById(R.id.ITEM1);
        if (item1Intent.hasExtra("Item1")) {
            item1TextView.setText("" + item1Intent.getStringExtra("Item1"));
        }
        Intent item2Intent = getIntent();
        item2TextView = (TextView) findViewById(R.id.ITEM2);
        if (item2Intent.hasExtra("Item2")) {
            item2TextView.setText("" + item2Intent.getStringExtra("Item2"));
        }
        Intent item3Intent = getIntent();
        item3TextView = (TextView) findViewById(R.id.ITEM3);
        if (item3Intent.hasExtra("Item3")) {
            item3TextView.setText("" + item3Intent.getStringExtra("Item3"));
        }
        Intent item4Intent = getIntent();
        item4TextView = (TextView) findViewById(R.id.ITEM4);
        if (item4Intent.hasExtra("Item4")) {
            item4TextView.setText("" + item4Intent.getStringExtra("Item4"));
        }
        Intent item5Intent = getIntent();
        item5TextView = (TextView) findViewById(R.id.ITEM5);
        if (item5Intent.hasExtra("Item5")) {
            item5TextView.setText("" + item5Intent.getStringExtra("Item5"));
        }
        Intent item6Intent = getIntent();
       item6TextView = (TextView) findViewById(R.id.ITEM6);
        if (item6Intent.hasExtra("Item6")) {
            item6TextView.setText("" + item6Intent.getStringExtra("Item6"));
        }
        Intent item7Intent = getIntent();
        item7TextView = (TextView) findViewById(R.id.ITEM7);
        if (item7Intent.hasExtra("Item7")) {
            item7TextView.setText("" + item7Intent.getStringExtra("Item7"));
        }
        Intent item8Intent = getIntent();
       item8TextView = (TextView) findViewById(R.id.ITEM8);
        if (item8Intent.hasExtra("Item8")) {
            item8TextView.setText("" + item8Intent.getStringExtra("Item8"));
        }
        Intent item9Intent = getIntent();
        item9TextView = (TextView) findViewById(R.id.ITEM9);
        if (item9Intent.hasExtra("Item9")) {
            item9TextView.setText("" + item9Intent.getStringExtra("Item9"));
        }
        Intent item10Intent = getIntent();
         item10TextView = (TextView) findViewById(R.id.ITEM10);
        if (item10Intent.hasExtra("Item10")) {
            item10TextView.setText("" + item10Intent.getStringExtra("Item10"));
        }
        Intent item11Intent = getIntent();
        item11TextView = (TextView) findViewById(R.id.ITEM11);
        if (item11Intent.hasExtra("Item11")) {
            item11TextView.setText("" + item11Intent.getStringExtra("Item11"));
        }
        Intent item12Intent = getIntent();
        item12TextView = (TextView) findViewById(R.id.ITEM12);
        if (item12Intent.hasExtra("Item12")) {
            item12TextView.setText("" + item12Intent.getStringExtra("Item12"));
        }
        Intent item13Intent = getIntent();
        item13TextView = (TextView) findViewById(R.id.ITEM13);
        if (item13Intent.hasExtra("Item13")) {
            item13TextView.setText("" + item13Intent.getStringExtra("Item13"));
        }
        Intent item14Intent = getIntent();
        item14TextView = (TextView) findViewById(R.id.ITEM14);
        if (item14Intent.hasExtra("Item14")) {
            item14TextView.setText("" + item14Intent.getStringExtra("Item14"));
        }
        Intent item15Intent = getIntent();
        item15TextView = (TextView) findViewById(R.id.ITEM15);
        if (item15Intent.hasExtra("Item15")) {
            item15TextView.setText("" + item15Intent.getStringExtra("Item15"));
        }
        Intent item16Intent = getIntent();
        item16TextView = (TextView) findViewById(R.id.ITEM16);
        if (item16Intent.hasExtra("Item16")) {
            item16TextView.setText("" + item16Intent.getStringExtra("Item16"));
        }
        Intent item17Intent = getIntent();
        item17TextView = (TextView) findViewById(R.id.ITEM17);
        if (item17Intent.hasExtra("Item17")) {
            item17TextView.setText("" + item17Intent.getStringExtra("Item17"));
        }
        Intent item18Intent = getIntent();
        item18TextView = (TextView) findViewById(R.id.ITEM18);
        if (item18Intent.hasExtra("Item18")) {
            item18TextView.setText("" + item18Intent.getStringExtra("Item18"));
        }
        Intent item19Intent = getIntent();
        item19TextView = (TextView) findViewById(R.id.ITEM19);
        if (item19Intent.hasExtra("Item19")) {
            item19TextView.setText("" + item19Intent.getStringExtra("Item19"));
        }
        Intent item20Intent = getIntent();
        item20TextView = (TextView) findViewById(R.id.ITEM20);
        if (item20Intent.hasExtra("Item20")) {
            item20TextView.setText("" + item20Intent.getStringExtra("Item20"));
        }

        // FOR PRICE TEXT VIEWS
        Intent price1Intent = getIntent();
        price1TextView = (TextView) findViewById(R.id.PRICE1);
        if (price1Intent.hasExtra("Price1")) {
            price1TextView.setText("" + price1Intent.getStringExtra("Price1"));
            price1 = price1TextView.getText().toString();
            try {
            Price1 = Integer.valueOf(price1);
            } catch (NumberFormatException e){ }
        }
        Intent price2Intent = getIntent();
        price2TextView = (TextView) findViewById(R.id.PRICE2);
        if (price2Intent.hasExtra("Price2")) {
            price2TextView.setText("" + price2Intent.getStringExtra("Price2"));
            price2 = price2TextView.getText().toString();
            try {
            Price2 = Integer.valueOf(price2);
            } catch (NumberFormatException e){ }
        }
        Intent price3Intent = getIntent();
        price3TextView = (TextView) findViewById(R.id.PRICE3);
        if (price3Intent.hasExtra("Price3")) {
            price3TextView.setText("" + price3Intent.getStringExtra("Price3"));
            price3 = price3TextView.getText().toString();
           // Price3 = Integer.parseInt(price3);
            try {
            Price3 = Integer.valueOf(price3);
            } catch (NumberFormatException e){ }

        }
        Intent price4Intent = getIntent();
        price4TextView = (TextView) findViewById(R.id.PRICE4);
        if (price4Intent.hasExtra("Price4")) {
            price4TextView.setText("" + price4Intent.getStringExtra("Price4"));
            price4 = price4TextView.getText().toString();
            try {
         Price4 = Integer.valueOf(price4);
            } catch (NumberFormatException e){ }
        }
        Intent price5Intent = getIntent();
        price5TextView = (TextView) findViewById(R.id.PRICE5);
        if (price5Intent.hasExtra("Price5")) {
            price5TextView.setText("" + price5Intent.getStringExtra("Price5"));
            price5 = price5TextView.getText().toString();
            try {
            Price5 = Integer.valueOf(price5);
            } catch (NumberFormatException e){ }
        }
        Intent price6Intent = getIntent();
        price6TextView = (TextView) findViewById(R.id.PRICE6);
        if (price6Intent.hasExtra("Price6")) {
            price6TextView.setText("" + price6Intent.getStringExtra("Price6"));
            price6 = price6TextView.getText().toString();
            try {
            Price6 = Integer.valueOf(price6);
            } catch (NumberFormatException e){ }
        }
        Intent price7Intent = getIntent();
        price7TextView = (TextView) findViewById(R.id.PRICE7);
        if (price7Intent.hasExtra("Price7")) {
            price7TextView.setText("" + price7Intent.getStringExtra("Price7"));
            price7 = price7TextView.getText().toString();
            try {
            Price7 = Integer.valueOf(price7);
            } catch (NumberFormatException e){ }
        }
        Intent price8Intent = getIntent();
        price8TextView = (TextView) findViewById(R.id.PRICE8);
        if (price8Intent.hasExtra("Price8")) {
            price8TextView.setText("" + price8Intent.getStringExtra("Price8"));
            price8 = price8TextView.getText().toString();
            try {
            Price8 = Integer.valueOf(price8);
            } catch (NumberFormatException e){ }
        }
        Intent price9Intent = getIntent();
        price9TextView = (TextView) findViewById(R.id.PRICE9);
        if (price9Intent.hasExtra("Price9")) {
            price9TextView.setText("" + price9Intent.getStringExtra("Price9"));
            price9 = price9TextView.getText().toString();
            try {
            Price9 = Integer.valueOf(price9);
            } catch (NumberFormatException e){ }
        }
        Intent price10Intent = getIntent();
        price10TextView = (TextView) findViewById(R.id.PRICE10);
        if (price10Intent.hasExtra("Price10")) {
            price10TextView.setText("" + price10Intent.getStringExtra("Price10"));
            price10 = price10TextView.getText().toString();
            try {
            Price10 = Integer.valueOf(price10);
            } catch (NumberFormatException e){ }
        }
        Intent price11Intent = getIntent();
        price11TextView = (TextView) findViewById(R.id.PRICE11);
        if (price11Intent.hasExtra("Price11")) {
            price11TextView.setText("" + price11Intent.getStringExtra("Price11"));
            price11 = price11TextView.getText().toString();
            try {
            Price11 = Integer.valueOf(price11);
            } catch (NumberFormatException e){ }
        }
        Intent price12Intent = getIntent();
        price12TextView = (TextView) findViewById(R.id.PRICE12);
        if (price12Intent.hasExtra("Price12")) {
            price12TextView.setText("" + price12Intent.getStringExtra("Price12"));
            price12 = price12TextView.getText().toString();
            try {
            Price12 = Integer.valueOf(price12);
            } catch (NumberFormatException e){ }
        }
        Intent price13Intent = getIntent();
        price13TextView = (TextView) findViewById(R.id.PRICE13);
        if (price13Intent.hasExtra("Price13")) {
            price13TextView.setText("" + price13Intent.getStringExtra("Price13"));
            price13 = price13TextView.getText().toString();
            try {
            Price13 = Integer.valueOf(price13);
            } catch (NumberFormatException e){ }
        }
        Intent price14Intent = getIntent();
        price14TextView = (TextView) findViewById(R.id.PRICE14);
        if (price14Intent.hasExtra("Price14")) {
            price14TextView.setText("" + price14Intent.getStringExtra("Price14"));
            price14 = price14TextView.getText().toString();
            try {
            Price14 = Integer.valueOf(price14);
            } catch (NumberFormatException e){ }
        }
        Intent price15Intent = getIntent();
        price15TextView = (TextView) findViewById(R.id.PRICE15);
        if (price15Intent.hasExtra("Price15")) {
            price15TextView.setText("" + price15Intent.getStringExtra("Price15"));
            price15 = price15TextView.getText().toString();
            try {
            Price15 = Integer.valueOf(price15);
            } catch (NumberFormatException e){ }
        }
        Intent price16Intent = getIntent();
        price16TextView = (TextView) findViewById(R.id.PRICE16);
        if (price16Intent.hasExtra("Price16")) {
            price16TextView.setText("" + price16Intent.getStringExtra("Price16"));
            price16 = price16TextView.getText().toString();
            try {
            Price16 = Integer.valueOf(price16);
            } catch (NumberFormatException e){ }
        }
        Intent price17Intent = getIntent();
        price17TextView = (TextView) findViewById(R.id.PRICE17);
        if (price17Intent.hasExtra("Price17")) {
            price17TextView.setText("" + price17Intent.getStringExtra("Price17"));
            price17 = price17TextView.getText().toString();
            try {
            Price17 = Integer.valueOf(price17);
            } catch (NumberFormatException e){ }
        }
        Intent price18Intent = getIntent();
        price18TextView = (TextView) findViewById(R.id.PRICE18);
        if (price18Intent.hasExtra("Price18")) {
            price18TextView.setText("" + price18Intent.getStringExtra("Price18"));
            price18 = price18TextView.getText().toString();
            try {
            Price18 = Integer.valueOf(price18);
            } catch (NumberFormatException e){ }
        }
        Intent price19Intent = getIntent();
        price19TextView = (TextView) findViewById(R.id.PRICE19);
        if (price19Intent.hasExtra("Price19")) {
            price19TextView.setText("" + price19Intent.getStringExtra("Price19"));
            price19 = price19TextView.getText().toString();
            try {
            Price19 = Integer.valueOf(price19);
            } catch (NumberFormatException e){ }
        }
        Intent price20Intent = getIntent();
        price20TextView = (TextView) findViewById(R.id.PRICE20);
        if (price20Intent.hasExtra("Price20")) {
            price20TextView.setText("" + price20Intent.getStringExtra("Price20"));
            price20 = price20TextView.getText().toString();
            try {
            Price20 = Integer.valueOf(price20);
            } catch (NumberFormatException e){ }
        }

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
       summaryMessage += "\n" + item1 + ": " + price1 + "\n" + item2 + ": " + price2 + "\n" + item3 + ": " + price3 + "\n" + item4 + ": " + price4 + "\n" + item5 + ": " + price5;
     //  summaryMessage += "\n" + item6 + ": " + price6 + "\n" + item7 + ": " + price7 + "\n" + item8 + ": " + price8 + "\n" + item9 + ": " + price9 + "\n" + item10 + ": " + price10;
      // summaryMessage += "\n" + item11 + ": " + price11 + "\n" + item12 + ": " + price12 + "\n" + item13 + ": " + price13 + "\n" + item14 + ": " + price14 + "\n" + item15 + ": " + price15;
     //  summaryMessage += "\n" + item16 + ": " + price16 + "\n" + item17 + ": " + price17 + "\n" + item18 + ": " + price18 + "\n" + item19 + ": " + price19 + "\n" + item20 + ": " + price20;

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

