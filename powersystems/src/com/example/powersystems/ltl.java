package com.example.powersystems;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.View;

public class ltl extends Activity {
	DrawerLayout g;ActionBarDrawerToggle dt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.ltl);
final ActionBar ab = getActionBar();
		
		ab.setLogo(R.drawable.psp);
	g = (DrawerLayout)findViewById(R.id.mydrawer2);
	 dt = new ActionBarDrawerToggle(this, g, R.drawable.ic_launcher, R.string.open,R.string.close ){
	public void onDrawerClosed(View v){
		super.onDrawerClosed(v);
		ab.setTitle("hello");
		 
	}	
	public void onDrawerOpened(View v){
		super.onDrawerOpened(v);
		ab.setTitle("world");
		 invalidateOptionsMenu();
	}
	};
	g.setDrawerListener(dt);
	ab.setHomeButtonEnabled(true);
	ab.setDisplayHomeAsUpEnabled(true);
  }
@Override 
   protected void onPostCreate(Bundle savedInstanceState) {
       super.onPostCreate(savedInstanceState);
       // Sync the toggle state after onRestoreInstanceState has occurred. 
       dt.syncState();
   }} 