package com.kabricks.firstaidapp.TestFragmentFiles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import com.kabricks.firstaidapp.R;

public class TestAbc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_abc);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test_abc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.viewMap:
                Toast.makeText(TestAbc.this, "This feature is not yet available in this app version", Toast.LENGTH_SHORT).show();
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

    public void allDone(View view){
        int score = 0;
        RadioButton rb1 = (RadioButton)findViewById(R.id.at1);
        RadioButton rb2 = (RadioButton)findViewById(R.id.at2);
        RadioButton rb3 = (RadioButton)findViewById(R.id.at3);
        RadioButton rb4 = (RadioButton)findViewById(R.id.at4);
        RadioButton rb5 = (RadioButton)findViewById(R.id.at5);


        if(rb1.isChecked()){
            score = score + 1;
        }

        if(rb2.isChecked()){
            score = score + 1;
        }

        if(rb3.isChecked()){
            score = score + 1;
        }

        if(rb4.isChecked()){
            score = score + 1;
        }

        if(rb5.isChecked()){
            score = score + 1;
        }

        score = score * 2;

        displayScore(score);
    }



    public void displayScore(int testScore){

        Intent intent = new Intent(this, displayScore.class);
        intent.putExtra("score", testScore);
        startActivity(intent);
    }

}
