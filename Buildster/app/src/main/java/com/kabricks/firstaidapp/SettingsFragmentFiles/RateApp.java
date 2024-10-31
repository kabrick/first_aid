package com.kabricks.firstaidapp.SettingsFragmentFiles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.RatingBar.OnRatingBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

import com.kabricks.firstaidapp.R;

public class RateApp extends AppCompatActivity {

    RatingBar ratingBar;
    TextView rateMessage;
    String ratedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_app);

        ratingBar = (RatingBar)findViewById(R.id.ratingBar);
        rateMessage = (TextView)findViewById(R.id.rateMessage);

        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                ratedValue = String.valueOf(ratingBar.getRating());
                rateMessage.setText("Thanks for rating us at :" + ratedValue + "out of 6");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_rate_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.viewMap:
                Toast.makeText(RateApp.this, "This feature is not yet available in this app version", Toast.LENGTH_SHORT).show();
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
