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
		solo.clickOnButton("����");
		solo.clickOnText("ע��");
		boolean actual = solo.searchButton("ȷ��") && solo.searchButton("ȡ��")
				&& solo.searchText("΢��Ϸ") && solo.searchText("��ȷ��Ҫע�������µ�¼��");
		assertEquals("ע��'ȷ��'ҳ�治��ȷ", true, actual);
		solo.clickOnButton("ȡ��");
		
		solo.clickOnText("ע��");
		solo.clickOnButton("ȷ��");
		solo.sleep(3000);
		boolean actual0 = solo.searchButton("��¼");
		assertEquals("δ��ȷ���ص���¼ҳ��",true, actual0);
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
	
	private void uninstall() {
		// TODO Auto-generated method stub
		solo.finishOpenedActivities();
	}
}
