package com.example.retrozeu.subtrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView subListView;
    private List<Subscription> subscriptionList;
    private ArrayAdapter<Subscription> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
    }





    //methods
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_add:
                //open add activity
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void wireWidgets() {
        setSubscriptionList();
        subListView = (ListView) findViewById(R.id.listview_subs);
        adapter = new ArrayAdapter<Subscription>(this, R.layout.item_subcard, subscriptionList);

        subListView.setAdapter(adapter);
        for (Subscription s : subscriptionList) {
            if (s.getType().equals("spotify")) {
                MainActivity.this.findViewById(R.id.imageView_type).setBackgroundResource(R.drawable.ic_spotify);
            }
        }
        subListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //open subscription view activity
            }
        });
    }

    public void setSubscriptionList() {
        subscriptionList = new ArrayList<>();
        subscriptionList.add(new Subscription("retroZEU", "cloud music subscription", "spotify", Calendar.getInstance().getTime(), 9.99));
        subscriptionList.add(new Subscription("Zeu Capua", "to hit the gym", "gym", Calendar.getInstance().getTime(), 19.99));
    }
}
