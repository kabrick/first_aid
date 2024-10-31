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

import com.kabricks.firstaidapp.LearnFragmentFiles.LearnAbc;
import com.kabricks.firstaidapp.LearnFragmentFiles.LearnBurns;
import com.kabricks.firstaidapp.LearnFragmentFiles.LearnCuts;
import com.kabricks.firstaidapp.LearnFragmentFiles.LearnFractures;
import com.kabricks.firstaidapp.LearnFragmentFiles.LearnNosebleed;
import com.kabricks.firstaidapp.LearnFragmentFiles.LearnPoison;

public class LearnFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        String[] values = new String[]{
                "ABC", "BURNS/SCALDS", "FRACTURES", "POISON", "NOSE BLEED", "CUTS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.fragment_list_textview, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView i, View v, int position, long id){
       super.onListItemClick(i, v, position, id);
        if (position == 0){
                Intent newActivity = new Intent(v.getContext(), LearnAbc.class);
                startActivity(newActivity);
        }
        else if (position == 1){
            Intent newActivity = new Intent(v.getContext(), LearnBurns.class);
            startActivity(newActivity);
        }
        else if (position == 2){
            Intent newActivity = new Intent(v.getContext(), LearnFractures.class);
            startActivity(newActivity);
        }
        else if (position == 3){
            Intent newActivity = new Intent(v.getContext(), LearnPoison.class);
            startActivity(newActivity);
        }
        else if (position == 4){
            Intent newActivity = new Intent(v.getContext(), LearnNosebleed.class);
            startActivity(newActivity);
        }
        else if(position == 5){
            Intent newActivity = new Intent(v.getContext(), LearnCuts.class);
            startActivity(newActivity);
        }

    }
}
