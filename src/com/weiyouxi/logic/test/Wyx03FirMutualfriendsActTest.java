package com.weiyouxi.logic.test;

import java.util.ArrayList;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.R;
import com.weiyouxi.logic.WyxLoginAct;
import com.weiyouxi.logic.WyxLoginPreAct;
import com.weiyouxi.entity.WyxFirMutualFriends;
import com.weiyouxi.entity.WyxGameCenter;

@SuppressWarnings("rawtypes")
public class Wyx03FirMutualfriendsActTest extends ActivityInstrumentationTestCase2{
	private final String TAG = "WyxLoginTest";
	private static int friendCount = 1;
	@SuppressWarnings("unchecked")
	public Wyx03FirMutualfriendsActTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
		
	}
	private Solo solo;
	
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void test01MutualFriends() throws Exception{
//		try {
			solo.clickOnButton("互粉好友");
//			solo.clickLongOnText("互粉好友");
//			solo.clickOnText("设置");
//			solo.clickOnText("互粉好友");
//			
//			solo.sleep(5000);
//			solo.clickOnText("加载更多");
			solo.sleep(5000);
			solo.clickOnText("更多");
			solo.sleep(3000);
			ArrayList<ListView> ListViews = solo.getCurrentListViews();
			ListView MutualfriendsListView = ListViews.get(0);
			String[] FriendName = new String[17];
//			for (int i = 1; i < 5; i++) {
//				MutualfriendsItem[i] = MutualfriendsListView.getChildAt(i);
//				FriendName[i] = (String) MutualfriendsItem[i]
//						.findViewById(R.id.fir_mutualfriends_textview_username);
//
//				Log.e("好友排行列表", ":" + FriendName[i].getText());
//			}
			for (int i = 1; i < 18; i++) {
				WyxFirMutualFriends gameCenter = (WyxFirMutualFriends) MutualfriendsListView.getItemAtPosition(i);
				Log.e("互粉好友", "互粉好友"+i+":" + gameCenter.getName());
				FriendName[i-1] = ((WyxFirMutualFriends) MutualfriendsListView.getItemAtPosition(i)).getName();
//				GameItem[i] = GameListView2.getChildAt(i);
//				GameName[i] = (TextView) GameItem[i]
//						.findViewById(R.id.fir_game_center_listing_item_gamename_tv);

//				Log.e("游戏中心列表", "  "+i+":" + GameName[i].getText());
			}
			
			ListView MutualFriendsListView = ListViews.get(0);
			//查看适配器个数
			Log.e("item个数", " 就是："+MutualFriendsListView.getCount());
			
		//验证数据正确性
			assertEquals("第1个好友不是‘超三国’？", "浅慯辄止", FriendName[0]);
			assertEquals("第2个好友不是‘超三国’？", "渺飘零", FriendName[1]);
			assertEquals("第3个好友不是‘超三国’？", "十五代庆喜_dsfdsfdss十五代庆喜", FriendName[2]);
			assertEquals("第4个好友不是‘超三国’？", "基金_weiyouxi03", FriendName[3]);
			assertEquals("第5个好友不是‘超三国’？", "weiyouxi_28", FriendName[4]);
			assertEquals("第6个游戏不是‘超三国’？", "我的微Online测试WWWW加油", FriendName[5]);
			assertEquals("第7个游戏不是‘超三国’？", "水中太阳空中花", FriendName[6]);
			assertEquals("第8个游戏不是‘超三国’？", "luo帅哥", FriendName[7]);
			assertEquals("第9个游戏不是‘超三国’？", "weiyouxi_31", FriendName[8]);
			assertEquals("第10个游戏不是‘超三国’？", "淘特价吧", FriendName[9]);
			assertEquals("第11个游戏不是‘超三国’？", "weiyouxi_45", FriendName[10]);
			assertEquals("第12个游戏不是‘超三国’？", "weiyouxi_34", FriendName[11]);
			assertEquals("第13个游戏不是‘超三国’？", "weiyouxi_21", FriendName[12]);
			assertEquals("第14个游戏不是‘超三国’？", "weiyouxi_36", FriendName[13]);
			assertEquals("第15个游戏不是‘超三国’？", "weiyouxi_40", FriendName[14]);
			assertEquals("第16个游戏不是‘超三国’？", "weiyouxi_39", FriendName[15]);
			assertEquals("第17个游戏不是‘超三国’？", "weiyouxi_38", FriendName[16]);
//			View[] FridendAdapter = new View[friendCount];
//			FridendAdapter[0] = (View) MutualFriendsListView.getChildAt(0);
//			View FridendAdapter = (View) MutualFriendsListView.getAdapter().getItem(0);
//			FridendAdapter.findViewById(R.id.fir_mutualfriends_textview_username);
//			TextView[] UserName = new TextView[friendCount];
//			UserName[0] = (TextView) FridendAdapter.findViewById(R.id.fir_mutualfriends_textview_username);
			
//			for(int i = 0;i < friendCount;i++){
				
//				UserName[i] = FridendAdapter[0].
//						findViewById(R.id.fir_mutualfriends_textview_username);
//			}
//			TextView[] UserName = new TextView[friendCount];
//			for(int i = 0;i < friendCount;i++){
//				UserName[i] = (TextView) FridendAdapter[i+1].findViewById(R.id.fir_mutualfriends_textview_username);
//			}
//			
//			for (int i = 0; i < friendCount; i++) {
//				Log.e(TAG, "互粉好友名称"+i+"="+ UserName[i]);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			assertTrue("艹，互粉好友不能正常显示", false);
		}
//	}
	//R.id.fir_mygame_textview_gamename
	public void test02FriendGamesAct() {
		solo.clickOnButton("互粉好友");
		solo.sleep(5000);
//		solo.drag(100.f, 100.f, 150.f, 100.f, 5);
//		solo.sleep(3000);
		
		solo.clickOnText("浅慯辄止");
		solo.sleep(5000);
		try {
			ArrayList<ListView> ListViews = solo.getCurrentListViews();
			ListView FriendGameListView = ListViews.get(0);
			
			View[] FriendGameItem = new View[4];
			
			TextView[] FriendGameName = new TextView[3];
//			if(mygamecount==1){
//				
//			}else{
//				assertEquals("我的游戏没有取到数据", true, false);
//			}
//			MyGameListView.get
			Log.e("我的游戏列表", "游戏个数"+FriendGameListView.getCount());
			Log.e("我的游戏列表", "游戏个数"+FriendGameListView.getItemAtPosition(0).getClass());
//			try {
				for(int i = 1;i < 9;i++){
					FriendGameItem[i] = FriendGameListView.getChildAt(i);
					FriendGameName[i-1]  = (TextView) FriendGameItem[i].findViewById(R.id.fir_mygame_textview_gamename);
				}
		} catch (Exception e) {
			// TODO: handle exception
			assertTrue("‘TA的游戏没有数据’", false);
		}
		
		
		
	}
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}