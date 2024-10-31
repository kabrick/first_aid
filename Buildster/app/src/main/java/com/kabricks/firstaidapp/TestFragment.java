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

import com.kabricks.firstaidapp.TestFragmentFiles.TestAbc;
import com.kabricks.firstaidapp.TestFragmentFiles.TestBurns;
import com.kabricks.firstaidapp.TestFragmentFiles.TestCuts;
import com.kabricks.firstaidapp.TestFragmentFiles.TestFractures;
import com.kabricks.firstaidapp.TestFragmentFiles.TestGeneral;
import com.kabricks.firstaidapp.TestFragmentFiles.TestNosebleed;
import com.kabricks.firstaidapp.TestFragmentFiles.TestPoison;

public class TestFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        String[] values = new String[]{
                "ABC", "BURNS/SCALDS","FRACTURES", "POISON", "NOSE BLEED", "CUTS", "GENERAL KNOWLEDGE TEST"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.fragment_list_textview, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView i, View v, int position, long id){
        super.onListItemClick(i, v, position, id);
        if (position == 0){
            Intent newActivity = new Intent(v.getContext(), TestAbc.class);
            startActivity(newActivity);
        }
        else if (position == 1){
            Intent newActivity = new Intent(v.getContext(), TestBurns.class);
            startActivity(newActivity);
        }
        else if (position == 2){
            Intent newActivity = new Intent(v.getContext(), TestFractures.class);
            startActivity(newActivity);
        }
        else if (position == 3){
            Intent newActivity = new Intent(v.getContext(), TestPoison.class);
            startActivity(newActivity);
        }
        else if (position == 4){
            Intent newActivity = new Intent(v.getContext(), TestNosebleed.class);
            startActivity(newActivity);
        }
        else if (position == 5){
            Intent newActivity = new Intent(v.getContext(), TestCuts.class);
            startActivity(newActivity);
        }
        else if (position == 6){
            Intent newActivity = new Intent(v.getContext(), TestGeneral.class);
            startActivity(newActivity);
        }

    }
}
