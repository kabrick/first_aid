package com.kabricks.firstaidapp;

/**
 * Created by User on 09/02/2016.
 */
import android.support.v4.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.kabricks.firstaidapp.SettingsFragmentFiles.ConcernActivity;
import com.kabricks.firstaidapp.SettingsFragmentFiles.IceNumbers;
import com.kabricks.firstaidapp.SettingsFragmentFiles.PrivacyActivity;
import com.kabricks.firstaidapp.SettingsFragmentFiles.RateApp;

public class SettingsFragment extends ListFragment {

    @Override    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        String[] values = new String[]{
                "I.C.E NUMBERS", "RESET ACHIEVEMENTS", "TELL A STORY OF HOW THIS APP HELPED YOU", "PRIVACY",
                "CONCERN ABOUT FIRST AID", "RATE THIS APP"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.fragment_list_textview, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView i, View v, int position, long id){
        super.onListItemClick(i, v, position, id);
        if (position == 0){
            Intent newActivity = new Intent(v.getContext(), IceNumbers.class);
            startActivity(newActivity);
        }
        else if (position == 1){
            Toast.makeText(getActivity(), "Test achievements reset.", Toast.LENGTH_LONG).show();
        }
        else if (position == 2){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("plain/text");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{
                    "kabuyedouglas53@gmail.com"
            });
            intent.putExtra(Intent.EXTRA_SUBJECT,"How app changed my life");
            startActivity(Intent.createChooser(intent, ""));
        }
        else if (position == 3){
            Intent newActivity = new Intent(v.getContext(), PrivacyActivity.class);
            startActivity(newActivity);
        }
        else if (position == 4){
            Intent newActivity = new Intent(v.getContext(), ConcernActivity.class);
            startActivity(newActivity);
        }
        else if (position == 5){
            Intent newActivity = new Intent(v.getContext(), RateApp.class);
            startActivity(newActivity);
        }

    }
}

