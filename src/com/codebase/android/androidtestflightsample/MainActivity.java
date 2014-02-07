package com.codebase.android.androidtestflightsample;

import com.testflightapp.lib.TestFlight;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TestFlight.log("Sample log from test flight by aromal");
		TestFlight.passCheckpoint("Entering CrashSite");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void crashMyApp(View v)
	{
		System.out.println("here");
		//TestFlight.passCheckpoint("Entering CrashSite");
		String s = null + "df";
		
		//System.out.println(5/0);
	}
}
