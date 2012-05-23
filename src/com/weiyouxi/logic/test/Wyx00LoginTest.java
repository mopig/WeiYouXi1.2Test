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
			Log.e(TAG, "�������");
		}
	}
	
	public void test01Login(){
		try {
			solo.clickOnButton(1);
			solo.clickOnEditText(0);
			solo.enterText(0, "weiyouxi_30@sina.com");
			solo.clickOnEditText(1);
			solo.enterText(1, "weiyouxi");
			solo.clickOnButton("��¼");
			solo.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void test02FourTab() throws Exception{
		try {
			solo.clickOnButton("��Ϸ����");
			boolean expected = true;
			boolean actual = solo.searchButton("��Ϸ����") && solo.searchButton("�ҵ���Ϸ")
					&& solo.searchButton("���ۺ���") && solo.searchButton("����");
			assertEquals("�ĸ�һ��ҳ��TAB������", expected, actual);
			solo.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			Log.e(TAG, "�����쳣");
		}
//		finally{
//			solo.goBack();
//			solo.clickOnButton("ȷ��");
//		}
//		
		
	}
	
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}
