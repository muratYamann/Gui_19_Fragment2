package com.yamankod.gui_19_fragment2;

import android.app.Activity;
import android.os.Bundle;

public class Fragment0 extends Activity implements MyListFragment.OnItemSelectedListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment0);
	}
	@Override
	public void onRssItemSelected(String link) {
		// TODO Auto-generated method stub
		DetailFragment fragment = (DetailFragment) getFragmentManager()
	            .findFragmentById(R.id.detailFragment);
	        if (fragment != null && fragment.isInLayout()) {
	          fragment.setText(link);
	        } 	
	}
	
	

}
