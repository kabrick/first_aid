package com.kabricks.firstaidapp;

/**
 * Created by User on 09/02/2016.
 */
import android.support.v4.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.kabricks.firstaidapp.EmergencyFragmentFiles.*;

public class EmergencyFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        String[] values = new String[]{
                "BURNS/SCALDS", "FRACTURES", "POISON", "UNCONSCIOUS PERSON BUT BREATHING", "UNCONSCIOUS PERSON NOT BREATHING", "CUTS"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.fragment_list_textview, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView i, View v, int position, long id){
        super.onListItemClick(i, v, position, id);
        if (position == 0){
            Intent newActivity = new Intent(v.getContext(), Abc.class);
            startActivity(newActivity);
        }
        else if (position == 1){
            Intent newActivity = new Intent(v.getContext(), Fractures.class);
            startActivity(newActivity);
        }
        else if (position == 2){
            Intent newActivity = new Intent(v.getContext(), Poison.class);
            startActivity(newActivity);
        }
        else if (position == 3){
            Intent newActivity = new Intent(v.getContext(), UnconBre.class);
            startActivity(newActivity);
        }
        else if (position == 4){
            Intent newActivity = new Intent(v.getContext(), UnconNotBre.class);
            startActivity(newActivity);
        }
        else if (position == 5){
            Intent newActivity = new Intent(v.getContext(), Cuts.class);
            startActivity(newActivity);
        }

    }
}
