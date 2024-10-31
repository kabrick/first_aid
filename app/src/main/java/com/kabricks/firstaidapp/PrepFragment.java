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

import com.kabricks.firstaidapp.PrepFragmentFiles.ChemicalAccidents;
import com.kabricks.firstaidapp.PrepFragmentFiles.CrowdIncidents;
import com.kabricks.firstaidapp.PrepFragmentFiles.EmergencyBag;
import com.kabricks.firstaidapp.PrepFragmentFiles.Fires;
import com.kabricks.firstaidapp.PrepFragmentFiles.FirstAidKit;
import com.kabricks.firstaidapp.PrepFragmentFiles.MedicalInsurance;
import com.kabricks.firstaidapp.PrepFragmentFiles.RoadTrafficIncidents;
import com.kabricks.firstaidapp.PrepFragmentFiles.Terrorism;
import com.kabricks.firstaidapp.PrepFragmentFiles.TopTenTips;

public class PrepFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        String[] values = new String[]{
                "FIRES", "FIRST AID KIT", "CHEMICAL ACCIDENTS", "EMERGENCY BAG", "ROAD TRAFFIC INCIDENTS", "TERRORISM"
                , "TOP TEN TIPS", "CROWD INCIDENTS", "MEDICAL INSURANCE"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), R.layout.fragment_list_textview, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView i, View v, int position, long id){
        super.onListItemClick(i, v, position, id);
        if (position == 0){
            Intent newActivity = new Intent(v.getContext(), Fires.class);
            startActivity(newActivity);
        }
        else if (position == 1){
            Intent newActivity = new Intent(v.getContext(), FirstAidKit.class);
            startActivity(newActivity);
        }
        else if (position == 2){
            Intent newActivity = new Intent(v.getContext(), ChemicalAccidents.class);
            startActivity(newActivity);
        }
        else if (position == 3){
            Intent newActivity = new Intent(v.getContext(), EmergencyBag.class);
            startActivity(newActivity);
        }
        else if (position == 4){
            Intent newActivity = new Intent(v.getContext(), RoadTrafficIncidents.class);
            startActivity(newActivity);
        }
        else if (position == 5){
            Intent newActivity = new Intent(v.getContext(), Terrorism.class);
            startActivity(newActivity);
        }
        else if (position == 6){
            Intent newActivity = new Intent(v.getContext(), TopTenTips.class);
            startActivity(newActivity);
        }
        else if (position == 7){
            Intent newActivity = new Intent(v.getContext(), CrowdIncidents.class);
            startActivity(newActivity);
        }
        else if (position == 8){
            Intent newActivity = new Intent(v.getContext(), MedicalInsurance.class);
            startActivity(newActivity);
        }

    }
}

