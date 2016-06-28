package com.example.elzatom.fragmenttutorial;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.OnCountriesSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void OnCountriesSelectedListener(String country) {
        System.out.println(country);
        FragmentTwo detailFragment = (FragmentTwo) getFragmentManager().findFragmentById(R.id.details);

            FragmentTransaction ft = getFragmentManager().beginTransaction();
            detailFragment = new FragmentTwo();
            ft.replace(R.id.details, detailFragment, "Detail_Fragment1");
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
            detailFragment.showSports(country);

    }
}
