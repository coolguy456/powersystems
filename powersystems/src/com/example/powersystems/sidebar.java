package com.example.powersystems;

import java.util.ArrayList;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class sidebar extends Fragment{
	ArrayList<String> pavan;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		pavan = new ArrayList<String>();
		pavan.add("Short Transmission Lines");
		pavan.add("Medium pi Transmission Lines");
		pavan.add("Medium T Transmission Lines");
		pavan.add("Long Transmission Lines");
		pavan.add("problem");
	}
	public View onCreateView(LayoutInflater i,ViewGroup c,Bundle savedInstanceState){
		super.onCreateView(i, c, savedInstanceState);
		LayoutInflater r = getActivity().getLayoutInflater();
		View v = r.inflate(R.layout.sb, c, false);
		ListView t = (ListView)v.findViewById(R.id.listView1);
		ArrayAdapter<String> g = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, 0, pavan);
		//ca g = new ca(getActivity(), 0, pavan);
		t.setAdapter(g);
		t.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
				/*switch (position){
					case 0:
						startActivity(new Intent(getActivity(),stl.class));
					case 1:
						startActivity(new Intent(getActivity(),mptl.class));
					case 2:
						startActivity(new Intent(getActivity(),mtpl.class));
					case 3:
						startActivity(new Intent(getActivity(),ltl.class));
					case 4:
						startActivity(new Intent(getActivity(),prob.class));
				}*/
				if(position==0){startActivity(new Intent(getActivity(),stl.class));}
				if(position==1){startActivity(new Intent(getActivity(),mptl.class));}
				if(position==2){startActivity(new Intent(getActivity(),mtpl.class));}
				if(position==3){startActivity(new Intent(getActivity(),ltl.class));}
				if(position==4){startActivity(new Intent(getActivity(),prob.class));}
						}
			
		});
		return v;}}
			
			
		
 

