package com.kabricks.firstaidapp;

/**
 * Created by User on 09/02/2016.
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.w3c.dom.Text;

import java.net.HttpURLConnection;

public class AboutFragment extends Fragment{

    Button buttonEmail;
    Button buttonWeb;
    Button buttonDonate;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container
            , @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.about_fragment,container,false);

        //reach out to the button view ids thru getView()
        buttonDonate = (Button)view.findViewById(R.id.button3);
        buttonEmail = (Button)view.findViewById(R.id.button);
        buttonWeb = (Button)view.findViewById(R.id.button2);

        buttonEmail.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{
                        "kabuyedouglas53@gmail.com"
                });
                emailIntent.putExtra(Intent.EXTRA_SUBJECT,"my inquiry");
                startActivity(Intent.createChooser(emailIntent,""));
            }
        });

        buttonWeb.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent browserIntent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.redcross.org"));
                startActivity(browserIntent);
            }
        });

        buttonDonate.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                Intent browserIntent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.redcross.org"));
                startActivity(browserIntent);
            }
        });

        return view;


    }


}

