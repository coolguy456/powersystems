package com.example.powersystems;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ca extends ArrayAdapter<String>{
    ArrayList<String> g = new ArrayList<String>();
    Context c;TextView t;
	public ca(Context context, int resource, ArrayList<String> objects) {
		super(context, resource,  objects);
		// TODO Auto-generated constructor stub
		this.c = context;
	    this.g = objects;
	}
    @Override
	 public View getView(int position, View cv, ViewGroup parent){
		if(cv == null){
			LayoutInflater li = ((Activity) c).getLayoutInflater();
			cv = li.inflate(android.R.layout.simple_list_item_1, parent, false);
			t = (TextView) cv.findViewById(android.R.id.text1);
			t.setText(g.get(position));
			//cv.setTag(t);
		}
		cv.setOnTouchListener(new View.OnTouchListener() {
			float x1;float dx;float limit = (float) 300.0;
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				if(event.getAction()==MotionEvent.ACTION_DOWN){
					 x1 = event.getX();
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_UP){
					if(dx<limit){
					v.animate().setDuration(1000).translationX(0).alpha(1);}
					return true;
				}
				if(event.getAction()==MotionEvent.ACTION_MOVE){
					float x2 = event.getX();
					 dx = x2-x1;
					v.setTranslationX(dx);
					v.setAlpha((1/limit)*(limit-dx));
					if(dx>limit){
						Intent a = new Intent(getContext(),stl.class);
						c.startActivity(a);
					}
					
					return true;
				}
				return false;
			}
		});
    	return cv;
		 
	 }
	

}
