package com.kabricks.firstaidapp.PrepFragmentFiles;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import com.kabricks.firstaidapp.R;

public class Terrorism extends AppCompatActivity {

    CheckBox checkBox1,checkBox2,checkBox3, checkBox4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terrorism);

        checkBox1 = (CheckBox)findViewById(R.id.checkBox39);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox40);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox41);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox42);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_terrorism, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.viewMap:
                Toast.makeText(Terrorism.this, "This feature is not yet available in this app version", Toast.LENGTH_SHORT).show();
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
        if(checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && checkBox4.isChecked()){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Congragulations")
                    .setMessage("You have completed your checklist. Remember to review it regularly!")
                    .setCancelable(true)
                    .setNeutralButton("Got it!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
        else{
           Toast toast =  Toast.makeText(this, "You have not yet completed the checks", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
