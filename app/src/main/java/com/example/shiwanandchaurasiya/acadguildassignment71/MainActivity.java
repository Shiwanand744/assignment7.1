package com.example.shiwanandchaurasiya.acadguildassignment71;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
  This is the main Activity means the launcher activity of our Application.And through this activity we are showing the UI
*/
/*
 * This activity is extending AppCompatActivity to make this activity compatible with backword
 * */
public class MainActivity extends AppCompatActivity {
    /*
     * Creating object of TextView and Button
     * */
    TextView textField;
    Button button;

    /*
      @Override means this is an overrriden method of the Activity LifeCycle and this call back is used to create the UI of the Acivity.
      @return This method is not returning anything as it's return type is void.
     @Param This method is taking the Bundle's instance as an arguement named as savedInstanceState used to fetch the details sent by another activity or method.
     This method is responsible for initializing all the views and setting the content view through the layout file.

    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
         * setContentView is method to bind layout xml file with activity
         * */
        setContentView(R.layout.activity_main);
        /*
         * Initializing textView and btn using findViewById method
         * */

        textField = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        //setting onClickListener on btn to listen on click event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calling googleSearch method to do google search
                googleSearch();
            }
        });
    }

    //Implementation of googleSearch method
    public void googleSearch() {
        String textForSearch = textField.getText().toString();//getting text from user
        Intent i = new Intent(Intent.ACTION_WEB_SEARCH);//making object of Intent with ACTION_WEB_SEARCH action
        i.putExtra(SearchManager.QUERY, textForSearch);//passing data to search on google
        startActivity(i);//launching intent
    }
}
