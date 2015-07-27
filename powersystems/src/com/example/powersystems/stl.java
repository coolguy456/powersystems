package com.example.powersystems;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class stl extends Activity {
	DrawerLayout g;ActionBarDrawerToggle dt;Context co;float ans;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);	
		setContentView(R.layout.stl);
		//line a = new line(this, Color.RED);
		//setContentView(a);
		co=this;
		final Button h = (Button)findViewById(R.id.bu1);		 
		// output parameters of short transmission line
		final EditText vs = (EditText)findViewById(R.id.EditText07); 
		final EditText is = (EditText)findViewById(R.id.EditText06); 
		final EditText ps = (EditText)findViewById(R.id.EditText05); 
		final EditText pfs = (EditText)findViewById(R.id.EditText04); 
		// input parameters of short transmission line
		final EditText vr = (EditText)findViewById(R.id.editText1); 
		final EditText ir = (EditText)findViewById(R.id.EditText03); 
		final EditText pr = (EditText)findViewById(R.id.EditText02); 
		final EditText pfr = (EditText)findViewById(R.id.EditText01); 
		
		
		h.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/*View bv = getLayoutInflater().inflate(R.layout.pop,null, false);
			PopupWindow yu = new PopupWindow(bv,LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);	
			yu.showAsDropDown((View)findViewById(R.id.sv1));*/
				final Dialog he = new Dialog(co);
				he.setContentView(R.layout.popd);
				final Switch sw = (Switch)he.findViewById(R.id.switch1);

				
				he.setTitle("INDUCTANCE");
				he.getWindow().setLayout(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
				he.show();
				Button bi = (Button)he.findViewById(R.id.bop);
                final EditText dab = (EditText)he.findViewById(R.id.editText4popd);
                final EditText dbc = (EditText)he.findViewById(R.id.editText1popd);
                final  EditText dca = (EditText)he.findViewById(R.id.editText2popd);
                final EditText rad1 = (EditText)he.findViewById(R.id.editText3popd);

                final EditText Dd = (EditText)he.findViewById(R.id.editText5popd);
                final EditText rad2 = (EditText)he.findViewById(R.id.editText6popd);
                final EditText hd = (EditText)he.findViewById(R.id.editText7popd);
                final EditText md = (EditText)he.findViewById(R.id.editText8popd);
                final EditText nd = (EditText)he.findViewById(R.id.editText9popd);
				if(sw.isChecked()){
                    sw.setText("triangular");
                    Dd.setEnabled(false);
                    rad2.setEnabled(false);
                    hd.setEnabled(false);
                    md.setEnabled(false);
                    nd.setEnabled(false);
                    dab.setEnabled(true);
                    dbc.setEnabled(true);
                    dca.setEnabled(true);
                    rad1.setEnabled(true);
                }
                else{
                    sw.setText("double circuit");
                    Dd.setEnabled(true);
                    rad2.setEnabled(true);
                    hd.setEnabled(true);
                    md.setEnabled(true);
                    nd.setEnabled(true);
                    dab.setEnabled(false);
                    dbc.setEnabled(false);
                    dca.setEnabled(false);
                    rad1.setEnabled(false);
                }


                sw.setOnCheckedChangeListener(new OnCheckedChangeListener(){
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,
                                                 boolean isChecked) {

                        if(isChecked){
                            sw.setText("triangular");
                            Dd.setEnabled(false);
                            rad2.setEnabled(false);
                            hd.setEnabled(false);
                            md.setEnabled(false);
                            nd.setEnabled(false);
                            dab.setEnabled(true);
                            dbc.setEnabled(true);
                            dca.setEnabled(true);
                            rad1.setEnabled(true);
                        }else{
                            sw.setText("double circuit");
                            Dd.setEnabled(true);
                            rad2.setEnabled(true);
                            hd.setEnabled(true);
                            md.setEnabled(true);
                            nd.setEnabled(true);
                            dab.setEnabled(false);
                            dbc.setEnabled(false);
                            dca.setEnabled(false);
                            rad1.setEnabled(false);
                        }
                }});
                bi.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {

						// TODO Auto-generated method stub
						// values for equilateral configuration 
                        if(sw.isChecked()){

						float dabf =Float.parseFloat(dab.getText().toString());
						float dbcf =Float.parseFloat(dbc.getText().toString());
						float dcaf =Float.parseFloat(dca.getText().toString());
						float rad1f =Float.parseFloat(rad1.getText().toString());
						float deq = (float) Math.pow(dabf*dbcf*dcaf, (1/3));
						float radash = (float) (Math.exp(-4)*rad1f);
						ans = (float) (2*Math.pow(10,-7 )*Math.log(deq/radash));}
						
						// values for double circuit
                        else{

						float Ddf =Float.parseFloat(Dd.getText().toString());
						float rad2f =Float.parseFloat(rad2.getText().toString());
						float hdf =Float.parseFloat(hd.getText().toString());
						float mdf =Float.parseFloat(md.getText().toString());
						float ndf =Float.parseFloat(nd.getText().toString());
						float radash1 = (float) (Math.exp(-4)*rad2f);
						 ans = (float) (Math.pow(10,-7)*2*Math.log(Math.pow(2,(1/6))*Math.pow((Ddf/(Math.exp(-4)*rad2f)),0.5)*Math.pow((mdf/ndf),(1/3))));}
						h.setText(Float.toString(ans));

						he.dismiss();
					}
				});
				 }
		});
		
		final ActionBar ab = getActionBar();
		
		ab.setLogo(R.drawable.psp);
		final EditText edi = (EditText)findViewById(R.id.edi);
		final String t = edi.getText().toString();
		
		
		/*edi.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
			if(hasFocus==true){
				edi.setText("");
			}
			if(hasFocus==false){
				edi.setText("R="+edi.getText().toString());
			}
			
			}
		});*/
		
		
		Button okay = (Button)findViewById(R.id.bu2);
		okay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				float d = (float) (15000*Math.PI*100);
				float r = Float.parseFloat(t);
				System.out.println("value of r is"+r);
				complex z = new complex(r*d,ans*d);
				float vrv = (float) ((Float.parseFloat(vr.getText().toString()))/Math.sqrt(3));
				System.out.println("value of vrv is"+vrv);
				float pfrv = Float.parseFloat(pfr.getText().toString());
				float prv = Float.parseFloat(pr.getText().toString());
				float irv = prv/(vrv*pfrv);
				ir.setText(Float.toString(irv));
				float[] vsv = {(vrv+(irv*z.real)),(irv*z.imag)};
				float vsvmag = mag(vsv[0],vsv[1]);
				vs.setText(Float.toString(vsvmag));
				float isv = irv;
				is.setText(Float.toString(isv));
				float pfsv = angle(vsv[0],vsv[1]);
		        pfs.setText(Float.toString(pfsv));
		        
			}
		});
		g = (DrawerLayout)findViewById(R.id.mydrawer1);
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
	    } 
	 
	public float mag(float a, float b){
		return (float) Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
	} 
	  public float angle(float a,float b){
		  return (float) Math.cos(Math.atan(b/a));
	  } 
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings){
			return true;
		}
		if (id == android.R.id.home){
			Intent ih = new Intent(this,MainActivity.class);
			startActivity(ih);
			return true;
		}
		
		 
		return super.onOptionsItemSelected(item);
	}
}