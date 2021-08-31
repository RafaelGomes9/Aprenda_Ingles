package com.cursoandroid.aprendaingles.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {


    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {


        Fragment fragment= null;

        switch (position)
        {

            case 0:
                fragment= new BichosFragment();
                break;


            case 1:
                fragment= new NumerosFragment();
                break;






        }

        return fragment;







    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position)
        {

            case 0:
                return "Bichos";


            case 1:
                return "Números";







        }

return null;





    }



    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}