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

public class EmergencyBag extends AppCompatActivity {

    CheckBox checkBox1,checkBox2,checkBox3, checkBox4;
    CheckBox checkBox8,checkBox7,checkBox6, checkBox5;
    CheckBox checkBox9,checkBox10,checkBox11, checkBox12;
    CheckBox checkBox16,checkBox15,checkBox14, checkBox13;
    CheckBox checkBox17,checkBox18,checkBox19, checkBox20, checkBox21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_bag);

        checkBox1 = (CheckBox)findViewById(R.id.checkBox14);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox15);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox16);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox17);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox18);
        checkBox6 = (CheckBox)findViewById(R.id.checkBox19);
        checkBox7 = (CheckBox)findViewById(R.id.checkBox20);
        checkBox8 = (CheckBox)findViewById(R.id.checkBox21);
        checkBox9 = (CheckBox)findViewById(R.id.checkBox22);
        checkBox10 = (CheckBox)findViewById(R.id.checkBox23);
        checkBox11 = (CheckBox)findViewById(R.id.checkBox24);
        checkBox12 = (CheckBox)findViewById(R.id.checkBox25);
        checkBox13 = (CheckBox)findViewById(R.id.checkBox26);
        checkBox14 = (CheckBox)findViewById(R.id.checkBox27);
        checkBox15 = (CheckBox)findViewById(R.id.checkBox28);
        checkBox16 = (CheckBox)findViewById(R.id.checkBox30);
        checkBox17 = (CheckBox)findViewById(R.id.checkBox31);
        checkBox18 = (CheckBox)findViewById(R.id.checkBox32);
        checkBox19 = (CheckBox)findViewById(R.id.checkBox33);
        checkBox20 = (CheckBox)findViewById(R.id.checkBox34);
        checkBox21 = (CheckBox)findViewById(R.id.checkBox35);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_emergency_bag, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.viewMap:
                Toast.makeText(EmergencyBag.this, "This feature is not yet available in this app version", Toast.LENGTH_SHORT).show();
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
        if(checkBox1.isChecked() && checkBox2.isChecked() && checkBox3.isChecked() && checkBox4.isChecked()
                && checkBox5.isChecked() && checkBox6.isChecked() && checkBox7.isChecked()
                && checkBox8.isChecked() && checkBox9.isChecked() && checkBox10.isChecked() && checkBox11.isChecked()
                && checkBox12.isChecked() && checkBox13.isChecked() && checkBox14.isChecked() && checkBox15.isChecked()){
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

    public void allDone2(View view){
        if(checkBox16.isChecked() && checkBox17.isChecked() && checkBox18.isChecked() && checkBox19.isChecked()
                && checkBox20.isChecked() && checkBox21.isChecked()){
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
