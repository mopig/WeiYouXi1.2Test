package com.weiyouxi.logic.test;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.WyxFirSettingsAct;
import com.weiyouxi.logic.WyxLoginPreAct;

import android.test.ActivityInstrumentationTestCase2;

@SuppressWarnings("rawtypes")
public class Wyx04FirSettingsActTest extends ActivityInstrumentationTestCase2 {
	private final String TAG = "Wyx03FirSettingsActTest";
	
	@SuppressWarnings("unchecked")
	public Wyx04FirSettingsActTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
	}
	
	private Solo solo;
	
	protected void setUp() throws Exception{
		solo = new Solo(getInstrumentation(), getActivity());
		
	}
	
	public void test01CheckDirectory() throws Exception {
		solo.clickOnButton("设置");
		solo.assertCurrentActivity("不是设置页面？", WyxFirSettingsAct.class);
		boolean expected = true;
		boolean actual = solo.searchText("通知设置") && solo.searchText("反馈建议")
				&& solo.searchText("微游戏客服") && solo.searchText("分享")
				&& solo.searchText("关于") && solo.searchText("检查更新")
				&& solo.searchText("注销");
		assertEquals(TAG + "设置页面不完整", expected, actual);

		// solo.clickOnText("分享");
		// solo.typeText(solo.getEditText(0), "人之初，性本善");
		// solo.sleep(3000);
		// solo.clickOnButton("发送");
		// solo.sleep(1000);
		// assertEquals(true, solo.searchText("发送成功"));
		// assertEquals(true, solo.searchText("输入数字不能超过120字"));

	}
	public void test02NoticeSet() throws Exception{
		solo.clickOnButton("设置");
		solo.clickOnText("通知设置");
//		for(int i = 0;i<=10;i++){
//			solo.clickOnText("打开", 2);
//			solo.clickOnText("关闭");	
//		}
		solo.clickOnText("打开", 2);
		solo.clickOnButton(0);
		solo.clickOnText("通知设置");
		assertEquals("通知设置不正确", true, solo.searchText("打开", 15)&&solo.searchText("关闭", 1));
		
		solo.sleep(5000);
	}
//	public void test03ThemeChoice() throws Exception{
//		solo.clickOnButton("设置");
//		solo.clickOnText("主题选择");
//	}
   
	public void test04Suggestion() throws Exception{
		solo.clickOnButton("设置");
		solo.clickOnText("反馈建议");
		//默认页面显示是否正确
		boolean actual = solo.searchText("反馈建议")
				&& solo.searchText("我们会在第一时间处理您的问题") && solo.searchText("80字")
				&& solo.searchButton("发送");
		assertEquals("'反馈建议'初始页面显示不正确", true, actual);
		
//		solo.clickOnEditText(0);
		for(int i=0;i<20;i++){
			solo.enterText(0, "艸艸艸艸");
		}
//		solo.goBack();
		solo.clickOnButton("发送");
		boolean actual0 = solo.searchText("发送成功");
		assertEquals("反馈成功，感谢您对微游戏的支持", true, actual0);
		solo.sleep(5000);
	}
	
	public void test05CustomService() throws Exception{
		solo.clickOnButton("设置");
		solo.clickOnText("微游戏客服");
		//默认页面显示是否正确
				boolean actual = solo.searchText("微游戏客服")
						&& solo.searchText("#请输入游戏名称#请将您的问题反馈给微游戏客服，我们会尽快给您回复。") && solo.searchText("80字")
						&& solo.searchButton("发送");
				assertEquals("'微游戏客服'初始页面显示不正确", true, actual);
				
//				solo.clickOnEditText(0);
				for(int i=0;i<20;i++){
					solo.enterText(0, "艸艸艸艸");
				}
//				solo.goBack();
				solo.clickOnButton("发送");
				boolean actual0 = solo.searchText("发送成功");
				assertEquals("发送成功，微游戏客服会尽快给予回复", true, actual0);
				solo.sleep(5000);
	}
	
	public void test06Share() throws Exception{
		solo.clickOnButton("设置");
		solo.clickOnText("分享");
		//默认页面显示是否正确
		boolean actual = solo.searchText("分享")
				&& solo.searchText("我正在使用微游戏客户端，它可是微博的官方游戏平台哦，里面有各种新奇好玩的游戏，亲，快来下载哟～～～") && solo.searchText("80字")
				&& solo.searchButton("发送");
		assertEquals("'分享'初始页面显示不正确", true, actual);
		
		solo.clickOnButton("发送");
		boolean isSend = solo.searchText("正在发送")&&solo.searchText("微博发送成功");
		
		assertEquals("没有发送成功提示", true, isSend);
	}
	
	public void test07About() throws Exception{
		solo.clickOnButton("设置");
		solo.clickOnText("关于");
		boolean actual = solo.searchText("版本:") && solo.searchText("关于")
				&& solo.searchText("微游戏Android版")
				&& solo.searchText("北京微游互动网络科技有限公司")
				&& solo.searchText("Copyright © 1996-2012 SINA");
		assertEquals("关于页面内容不正确",true, actual);
	}
	
	public void test08CheckUpdate() throws Exception{
		solo.clickOnButton("设置");
		solo.clickOnText("检查更新");
		boolean isTip = solo.searchText("您安装的已经是最新版本");
		assertEquals("更新提示信息", true, isTip);
	}
	
	public void test09Logout() throws Exception{
		solo.clickOnButton("设置");
		solo.clickOnText("注销");
	}
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

}
