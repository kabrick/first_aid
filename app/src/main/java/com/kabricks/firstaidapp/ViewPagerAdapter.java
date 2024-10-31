package com.kabricks.firstaidapp;

/**
 * Created by User on 09/02/2016.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter{

    CharSequence Titles[]; // this will store the Titles of the tabs which are going to be passed when ViewPagerAdapter
    int NumbOfTabs; // stores the number of tabs, will be passed when ViewPagerAdapter is created

    //Build a constructor and assign the passed values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb){
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;
    }

    //this method returns the fragment for every position in the view pager
    @Override
    public Fragment getItem(int position){
        if(position == 0)//if the position is 0 we are returning the first tab
        {
            LearnFragment learnFragment = new LearnFragment();
            return learnFragment;
        }
        else if(position == 1)
        {
            PrepFragment prepFragment = new PrepFragment();
            return prepFragment;
        }
        else if(position == 2)
        {
            EmergencyFragment emergencyFragment = new EmergencyFragment();
            return emergencyFragment;
        }
        else if(position == 3)
        {
            TestFragment testFragment = new TestFragment();
            return testFragment;
        }
        else if(position == 4)
        {
            AboutFragment aboutFragment = new AboutFragment();
            return aboutFragment;
        }
        else
        {
            SettingsFragment settingsFragment = new SettingsFragment();
            return settingsFragment;
        }
    }

    //this method returns the titles for the Tabs in the strip

    public CharSequence getPageTitle(int position){
        return Titles[position];
    }

    //this method return the number of tabs for the tab strip

    @Override
    public int getCount(){
        return NumbOfTabs;
    }
}

