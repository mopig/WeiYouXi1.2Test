package com.weiyouxi.logic.test;

import java.util.ArrayList;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.R;
import com.weiyouxi.logic.WyxLoginAct;
import com.weiyouxi.logic.WyxLoginPreAct;

@SuppressWarnings("rawtypes")
public class Ztest extends ActivityInstrumentationTestCase2{
	private final String TAG = "Ztest";
	
	@SuppressWarnings("unchecked")
	public Ztest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
		
	}
	private Solo solo;
	private int myGamecount = 18;
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	
	
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}
