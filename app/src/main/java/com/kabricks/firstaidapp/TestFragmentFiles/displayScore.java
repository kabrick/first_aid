package com.kabricks.firstaidapp.TestFragmentFiles;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kabricks.firstaidapp.R;

public class displayScore extends AppCompatActivity {

    TextView tv1, tv2;
    ImageView iv;
    public int level, totalScore, level1, score;
    public static final String scoreDisplay = "MyPrefs";
    public static final String Score = "scoreKey";
    public static final String Level = "levelKey";
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_score);

        Intent intent = getIntent();
        score = intent.getIntExtra("score",0);

        tv1 = (TextView)findViewById(R.id.scoreDisplay);
        tv2 = (TextView)findViewById(R.id.comment);
        iv = (ImageView)findViewById(R.id.levelImage);

        displayLevelImage(score);
        displayCurrentScore(score);
        displayComment(score);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_score, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.viewMap:
                Toast.makeText(displayScore.this, "This feature is not yet available in this app version", Toast.LENGTH_SHORT).show();
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

    public void displayLevelImage(int score){

        SharedPreferences prefs = getSharedPreferences(scoreDisplay, MODE_PRIVATE);
        int level = prefs.getInt(Level, 0);
        int totalScore = prefs.getInt(Score, 0);

        totalScore = totalScore + score;
        getNewLevel(totalScore);

        if(level1 > level){
            iv.setImageResource(R.drawable.level_up);
        }
        if (level1 <= level){
            iv.setImageResource(R.drawable.same_level);
        }
    }

    public void displayCurrentScore(int score){
        tv1.setText("You got " + score + " out of 10");
    }

    public void displayComment(int score){
        if(score <= 5){
            tv2.setText("Poor start, but you'll get the hang of it. Please read the prep section");
        }
        if (score > 5 && score < 9){
            tv2.setText("Good work, let's just polish up for a perfect score");
        }
        if (score > 8){
            tv2.setText("Excellent!! On your way to becoming a life saver");
        }
    }

    public void tryAgain(View view){
        onBackPressed();
    }

    public void saveScores(View view){
        sharedPreferences = getSharedPreferences(scoreDisplay, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putInt(Score,score);
        editor.putInt(Level,level);

        editor.apply();
    }

    public int getNewLevel(int x){
        if(x <= 9){
            level1 = 1;
        }

        if(x>9 && x<20){
            level1 = 2;
        }

        if(x>19 && x<30){
            level1 = 3;
        }

        if(x>29 && x<40){
            level1 = 4;
        }

        if(x>39 && x<50){
            level1 = 5;
        }

        if(x>49 && x<60){
            level1 = 6;
        }

        if(x>59 && x<71){
            level1 = 7;
        }

        return level1;
    }
}
