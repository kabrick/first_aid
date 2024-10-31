package com.kabricks.firstaidapp.EmergencyFragmentFiles;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.kabricks.firstaidapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class UnconActFast extends Fragment {


    public UnconActFast() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_uncon_act_fast, container, false);
        VideoView videoView = (VideoView)view.findViewById(R.id.videoView3);

        MediaController mc = new MediaController(getActivity().getApplicationContext());
        String path = "android.resource://" +getActivity().getPackageName() + "/" + R.raw.uncon_not_breathing_long;
        videoView.setVideoURI(Uri.parse(path));
        videoView.setMediaController(mc);
        videoView.start();
        return view;
    }


}
