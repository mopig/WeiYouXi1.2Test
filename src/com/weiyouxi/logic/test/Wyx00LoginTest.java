package com.weiyouxi.logic.test;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.WyxLoginPreAct;

@SuppressWarnings("rawtypes")
public class Wyx00LoginTest extends ActivityInstrumentationTestCase2{
	private final String TAG = "WyxLoginTest";
	
	@SuppressWarnings("unchecked")
	public Wyx00LoginTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
		
	}
	private Solo solo;
	
	protected void setUp() throws Exception {
		try {
			solo = new Solo(getInstrumentation(), getActivity());
		} catch (Exception e) {
			// TODO: handle exception
			Log.e(TAG, "程序崩溃");
		}
	}
	
	public void test01Login(){
		try {
			solo.clickOnButton(1);
			solo.clickOnEditText(0);
			solo.enterText(0, "weiyouxi_30@sina.com");
			solo.clickOnEditText(1);
			solo.enterText(1, "weiyouxi");
			solo.clickOnButton("登录");
			solo.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void test02FourTab() throws Exception{
		try {
			solo.clickOnButton("游戏中心");
			boolean expected = true;
			boolean actual = solo.searchButton("游戏中心") && solo.searchButton("我的游戏")
					&& solo.searchButton("互粉好友") && solo.searchButton("设置");
			assertEquals("四个一级页面TAB不完整", expected, actual);
			solo.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			Log.e(TAG, "程序异常");
		}
//		finally{
//			solo.goBack();
//			solo.clickOnButton("确定");
//		}
//		
		
	}
	
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}
