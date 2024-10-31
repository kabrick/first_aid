package com.kabricks.firstaidapp.SettingsFragmentFiles;

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
import android.widget.EditText;
import android.widget.Toast;


import com.kabricks.firstaidapp.R;

public class IceNumbers extends AppCompatActivity {

    EditText name, phone_no, email;
    public static final String MyPreferences = "MyPrefs";
    public static final String Name = "name";
    public static final String Phone = "phone";
    public static final String Email = "email";
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ice_numbers);

        name = (EditText)findViewById(R.id.editText);
        phone_no = (EditText)findViewById(R.id.editText2);
        email = (EditText)findViewById(R.id.editText3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ice_numbers, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.viewMap:
                Toast.makeText(IceNumbers.this, "This feature is not yet available in this app version", Toast.LENGTH_SHORT).show();
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

    public void addContact(View view){
        sharedPreferences = getSharedPreferences(MyPreferences, Context.MODE_PRIVATE);

        String name1 = name.getText().toString();
        String phone_no1 = phone_no.getText().toString();
        String email1 = email.getText().toString();

        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(Name,name1);
        editor.putString(Phone,phone_no1);
        editor.putString(Email,email1);

        editor.apply();

        Toast.makeText(this, "Your emergency contact has been saved", Toast.LENGTH_LONG).show();

    }
}
