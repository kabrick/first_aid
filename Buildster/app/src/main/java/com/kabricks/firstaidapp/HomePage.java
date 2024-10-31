package com.kabricks.firstaidapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Learn", "Prep", "Emergency", "Test", "About", "Settings"};
    int Numboftabs = 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        //creating the toolbar and setting it as the Toolbar for the activity

        //toolbar = (Toolbar)findViewById(R.id.tool_bar);
        //setSupportActionBar(toolbar);

        //creating the viewpageradapter and passing fragment manager, titles for the tabs and number of tabs
        adapter = new ViewPagerAdapter(getSupportFragmentManager(),Titles,Numboftabs);

        //assigning viewpager view and setting the adapter
        pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(adapter);

        //assigning the sliding tab layout view
        tabs = (SlidingTabLayout)findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);//to make the tabs fixed set to true

        //setting the custom color for the scrollbar indicator of the tab view
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer(){
            @Override
            public int getIndicatorColor(int position){
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });

        //setting the viewPager for the sliding tabs layout
        tabs.setViewPager(pager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.viewMap:
                Toast.makeText(HomePage.this, "This feature is not yet available in this app version", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.callEmergency:
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:991"));
                startActivity(i);
                return true;
            case R.id.sendAlerts:
                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage("+25675138651", null, "message", null, null);
                return true;
            case R.id.shareApp:
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                startActivity(intent1);
                return true;
            case R.id.giveFeedback:
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
