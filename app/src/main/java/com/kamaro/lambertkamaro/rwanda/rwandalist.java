package com.kamaro.lambertkamaro.rwanda;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class rwandalist extends ActionBarActivity {

    private ListView rwandaList;
    private String[] stringArray;
    private ArrayAdapter rwandaItemsArrayAdaptor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rwandalist);

        stringArray = new String[10];
        //add items to the array
        for (int i =0;i< stringArray.length;i++){

            //Push item to the array
            stringArray[i] = "Rwanda item"+i;
         }

        //Binding items to the array
        rwandaItemsArrayAdaptor = new ArrayAdapter(this,android.R.layout.simple_list_item_1,stringArray);

        //selecting the list view
        rwandaList = ( ListView ) findViewById(R.id.listviewid);

        //Binding the array to the list view
        rwandaList.setAdapter(rwandaItemsArrayAdaptor);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.rwandalist, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
