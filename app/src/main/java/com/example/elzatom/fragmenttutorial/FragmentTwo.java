package com.example.elzatom.fragmenttutorial;


import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;




public class FragmentTwo extends ListFragment implements AdapterView.OnItemClickListener {


    ArrayAdapter<CharSequence> adapter;
    ListView listView;
    String country;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment_two, container, false);

        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        listView = getListView();
        if (country.matches("India")){ System.out.println("hai enter3");
            adapter = ArrayAdapter.createFromResource(getActivity(), R.array.india, android.R.layout.simple_list_item_1);
            listView.setAdapter(adapter);

        }else if (country.matches("USA")){
            adapter = ArrayAdapter.createFromResource(getActivity(), R.array.usa, android.R.layout.simple_list_item_1);
            listView.setAdapter(adapter);

        }else if (country.matches("Mexico")){
            adapter = ArrayAdapter.createFromResource(getActivity(), R.array.mexico, android.R.layout.simple_list_item_1);
            listView.setAdapter(adapter);

        }

        listView.setOnItemClickListener(this);


    }

    public void showSports(String country_name){
        country = country_name;




    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast.makeText(getActivity(), "Item: " + position, Toast.LENGTH_SHORT)
                .show();

    }


}
