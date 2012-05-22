package com.weiyouxi.logic.test;

import android.test.ActivityInstrumentationTestCase2;
import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.WyxLoginAct;
import com.weiyouxi.logic.WyxLoginPreAct;

@SuppressWarnings("rawtypes")
public class Wyx11LogoutTest extends ActivityInstrumentationTestCase2{
	private final String TAG = "WyxLogoutTest";
	
	@SuppressWarnings("unchecked")
	public Wyx11LogoutTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
		
	}
	private Solo solo;
	
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testLogout(){
		solo.clickOnButton("设置");
		solo.clickOnText("注销");
		boolean actual = solo.searchButton("确定") && solo.searchButton("取消")
				&& solo.searchText("微游戏") && solo.searchText("您确定要注销并重新登录吗？");
		assertEquals("注销'确认'页面不正确", true, actual);
		solo.clickOnButton("取消");
		
		solo.clickOnText("注销");
		solo.clickOnButton("确定");
		solo.sleep(3000);
		boolean actual0 = solo.searchButton("登录");
		assertEquals("未正确返回到登录页面",true, actual0);
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
	
	private void uninstall() {
		// TODO Auto-generated method stub
		solo.finishOpenedActivities();
	}
}
