package com.kabricks.firstaidapp.EmergencyFragmentFiles;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kabricks.firstaidapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CutsFollowUp extends Fragment {


    public CutsFollowUp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cuts_follow_up, container, false);
    }


}
