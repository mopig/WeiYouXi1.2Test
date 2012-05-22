package com.weiyouxi.logic.test;

import java.util.ArrayList;

import android.R.integer;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.R;
import com.weiyouxi.logic.WyxLoginAct;
import com.weiyouxi.logic.WyxLoginPreAct;
import com.weiyouxi.logic.WyxMainAct;

@SuppressWarnings("rawtypes")
public class Wyx02FirMyGameActTest extends ActivityInstrumentationTestCase2{
	private final String TAG = "WyxLoginTest";
	private static int mygamecount = 14;
	@SuppressWarnings("unchecked")
	public Wyx02FirMyGameActTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
		
	}
	private Solo solo;
	
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void test01TwoTab(){
		solo.clickOnText("我的游戏");
		boolean expected = true;
		boolean actual = solo.searchText("我的游戏")&&solo.searchText("我的消息");
		assertEquals("找不到'我的游戏'或者'我的消息'", expected, actual);
		
	}
	public void test02MyGameList(){
		
		solo.clickOnButton("我的游戏");
//		solo.clickOnText("我的消息");
//		solo.clickOnText("我的游戏", 1);
		solo.sleep(10000);
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView MyGameListView = ListViews.get(0);
		
		View[] MyGameAdapter = null;
		
		MyGameAdapter = new View[mygamecount];
		TextView[] MyGameName = new TextView[mygamecount];
//		if(mygamecount==1){
//			
//		}else{
//			assertEquals("我的游戏没有取到数据", true, false);
//		}
		Object item1 = MyGameListView.findViewById(R.id.fir_mygame_textview_gamename);
//		MyGameListView.get
		Log.e("我的游戏列表", "游戏个数"+MyGameListView.getChildCount());
		try {
			for(int i = 1;i < mygamecount;i++){
				MyGameAdapter[i] = MyGameListView.getChildAt(i);
				MyGameName[i]  = (TextView) MyGameAdapter[i].findViewById(R.id.fir_mygame_textview_gamename);
			}
			//验证“我的游戏”页面，游戏列表排序是否正确（按玩游戏的时间先后）
			assertEquals("第一个游戏不是", "", MyGameName[1]);
			assertEquals("第一个游戏不是", "", MyGameName[2]);
			assertEquals("第一个游戏不是", "", MyGameName[3]);
			assertEquals("第一个游戏不是", "", MyGameName[4]);
			assertEquals("第一个游戏不是", "", MyGameName[5]);
			assertEquals("第一个游戏不是", "", MyGameName[6]);
			assertEquals("第一个游戏不是", "", MyGameName[7]);
			assertEquals("第一个游戏不是", "", MyGameName[8]);
			assertEquals("第一个游戏不是", "", MyGameName[9]);
		} catch (Exception e) {
			assertEquals("我的游戏没有取到数据", true, false);
			// TODO: handle exception
		}finally{
			Log.e("继续执行", "go on");
		}
		
		Log.e("适配器个数", ":"+MyGameListView.getAdapter().getCount());
		Log.e("第一个游戏名字", ":"+MyGameName[0]);
	    
	}
	
	public void test03MyMessageList() {
		solo.clickOnButton("我的游戏");
		solo.clickOnText("我的消息");
		ArrayList<ListView> MyMessageListViews = solo.getCurrentListViews();
		Log.e("消息页面ListViews个数", ":"+MyMessageListViews.size());
		ListView MyGameMessageListView = MyMessageListViews.get(1);
//		ListView FriendMessage = MyMessageListViews.get(1);
		
		boolean actual0 = solo.searchText("超大型PC游戏《超三国》在微游戏手机端闪耀登场，玩《超三国》手机版，享受VIP尊贵体验，快来吧！");
		boolean actual1 = solo.searchText("五一假期重点推荐大型策略游戏《邻邦战争》，亲，快邀请好友一起来体验哦！");
		boolean actual2 = solo.searchText("《深海连连看》火爆上线咯~快，再快，滑动手指，迅猛通关！亲快来哦！");
		boolean actual3 = solo.searchText("你是有耐心的人吗？微游戏新游戏《趣味沙箱》上线啦，快来验证你的耐心与智力吧！");
		boolean actual4 = solo.searchText("周五寂寞做什么？快来怪弹万圣节体验休闲的周末时光！");
		boolean actual5 = solo.searchText("大型PC网络游戏《微城市》在微游戏客户端里震撼上线啦！城市美景、私人花园、邀你在三八节high翻天！快来微游戏参与互动吧！");
		
		assertTrue("游戏消息1没找到", actual0);
		assertTrue("游戏消息2没找到", actual1);
		assertTrue("游戏消息3没找到", actual2);
		assertTrue("游戏消息4没找到", actual3);
		assertTrue("游戏消息5没找到", actual4);
		assertTrue("游戏消息6没找到", actual5);
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}