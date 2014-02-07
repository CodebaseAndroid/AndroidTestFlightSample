package com.codebase.android.androidtestflightsample.application;

import android.app.Application;

import com.testflightapp.lib.TestFlight;

public class AndroidTestFlightSample extends Application{

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		TestFlight.takeOff(this, "959612a3-eb6f-445a-abb9-2fc828258dab");
	}
	
}
