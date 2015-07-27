package com.example.powersystems;

import java.util.ArrayList;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ImageView.ScaleType;

public class mainpage extends Fragment{
 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	      Bundle savedInstanceState){
	 super.onCreate(savedInstanceState);
	 LayoutInflater i = getActivity().getLayoutInflater();
	 View v = i.inflate(R.layout.stl,container, false);
	 /*ImageView t = (ImageView)v.findViewById(R.id.imageView1stl);
		t.setScaleType(ScaleType.FIT_XY);			
	  	final Button r = (Button)v.findViewById(R.id.button1stl);
	  	Button l = (Button)v.findViewById(R.id.Button01stl);
	  	r.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			LayoutInflater layoutInflater = getActivity().getLayoutInflater();  
			View popupView = layoutInflater.inflate(R.layout.rvalues, null);
			popupView.setBackgroundColor(Color.WHITE);
			final PopupWindow popupWindow = new PopupWindow(popupView,LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);  
			ListView t = (ListView)popupView.findViewById(R.id.listView1);
			ArrayList<String> tv = new ArrayList<String>();
			tv.add("hello hi");
			ArrayAdapter<String> tad = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, 0, tv);
			t.setAdapter(tad);
			popupWindow.isOutsideTouchable();
			popupWindow.showAsDropDown(r, 50, -30);
			}
		});*/
	 return v;
 }
}
