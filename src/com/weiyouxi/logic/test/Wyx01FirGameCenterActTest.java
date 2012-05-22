package com.weiyouxi.logic.test;

import java.util.ArrayList;
import java.util.List;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.entity.WyxGameCenter;
import com.weiyouxi.logic.WyxLoginPreAct;

@SuppressWarnings("rawtypes")
public class Wyx01FirGameCenterActTest extends ActivityInstrumentationTestCase2{
	private final String TAG = "Wyx02FirGameCenterActTest";
	private static int gamecount = 22;
	@SuppressWarnings("unchecked")
	public Wyx01FirGameCenterActTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic", WyxLoginPreAct.class);
	}
	
	private Solo solo;
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
		
	}
	
//	public void testGameCenterWaterfall() throws Exception{
//		solo.clickOnText("游戏中心");
//		boolean expected = true;
//		boolean actual = solo.searchText("列表");
//		assertEquals("找不到‘列表’模式", expected, actual);
//		
//		solo.clickOnText("列表");
//		actual = solo.searchText("瀑布");
//		assertEquals("列表/瀑布 模式切换不正确", expected, actual);
//	}
	
	public void test01GameWaterfallRank() {
		solo.sleep(3000);
		solo.clickOnButton("游戏中心");
		solo.sleep(3000);
		int clickCount = (int) Math.floor((gamecount-1)/9);
		for(int i = 0;i<clickCount;i++){
			solo.clickOnText("更多");
		}
		solo.sleep(2000);
		solo.searchText("已经没有更多游戏");
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView GameListView1 = ListViews.get(0);
		Log.e(TAG+" test01GameWaterfallRank()", "ChildCount="+ GameListView1.getChildCount());
		List<WyxGameCenter> GameItem = new ArrayList<WyxGameCenter>();
		for (int i = 2; i < 20; i++) {
			GameItem.add((WyxGameCenter) GameListView1.getItemAtPosition(i));
		}
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(0));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(1));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(2));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(3));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(6));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(7));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(8));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(9));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(10));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(11));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(12));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(13));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(14));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(15));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(16));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(17));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(18));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(19));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(20));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(21));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(22));
		GameItem.add((WyxGameCenter) GameListView1.getAdapter().getItem(23));
//		GameItem[1] = GameListView1.getChildAt(1);
//		GameItem[2] = GameListView1.getChildAt(2);
		int length = GameItem.size();
		for (int i = 0; i < length; i++) {
			Log.e("游戏名字", ":" + GameItem.get(i).getClass());
		}
//		for (int i = 0; i < 3; i++) {
//			Log.e(TAG+" test01GameWaterfallRank()", "GameItem" +i+"="+ GameItem[i]);
//		}
//		TextView[] GameName = new TextView[gamecount];
//		try {
//			GameName[0] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv0);
//			GameName[1] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv1);
//			GameName[2] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv2);
//			GameName[3] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv3);
//			GameName[4] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv4);
//			GameName[5] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv5);
//			GameName[6] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv6);
//			GameName[7] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv7);
//			GameName[8] = (TextView) GameItem[0]
//					.findViewById(R.id.fir_game_center_item_game_name_tv8);
//
//			GameName[9] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv0);
//			GameName[10] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv1);
//			GameName[11] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv2);
//			GameName[12] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv3);
//			GameName[13] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv4);
//			GameName[14] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv5);
//			GameName[15] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv6);
//			GameName[16] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv7);
//			GameName[17] = (TextView) GameItem[1]
//					.findViewById(R.id.fir_game_center_item_game_name_tv8);
//			
//			GameName[18] = (TextView) GameItem[2]
//					.findViewById(R.id.fir_game_center_item_game_name_tv0);
//			GameName[19] = (TextView) GameItem[2]
//					.findViewById(R.id.fir_game_center_item_game_name_tv1);
//			GameName[20] = (TextView) GameItem[2]
//					.findViewById(R.id.fir_game_center_item_game_name_tv2);
//			GameName[21] = (TextView) GameItem[2]
//					.findViewById(R.id.fir_game_center_item_game_name_tv3);
//
//			int length = GameItem.size();
//			for (int i = 0; i < length; i++) {
//				Log.e("游戏名字", ":" + GameItem.get(i).getAppname());
//			}
//		    Log.e("游戏名字", ":" + GameItem.get(i).getAppname());
//			assertEquals("第1个游戏不是‘超三国’？", "超三国", GameName[0].getText());
//			assertEquals("第2个游戏不是‘微城市’？", "微城市", GameName[1].getText());
//			assertEquals("第3个游戏不是‘你画我猜移动版’？", "你画我猜移动版", GameName[2].getText());
//			assertEquals("第4个游戏不是‘爱画爱猜’？", "爱画爱猜", GameName[3].getText());
//			assertEquals("第5个游戏不是‘梦幻方块’？", "梦幻方块", GameName[4].getText());
//			assertEquals("第6个游戏不是‘宝石连环战’？", "宝石连环战", GameName[5].getText());
//			assertEquals("第7个游戏不是‘邻邦战争’？", "邻邦战争", GameName[6].getText());
//			assertEquals("第8个游戏不是‘闹闹马戏团’？", "闹闹马戏团", GameName[7].getText());
//			assertEquals("第9个游戏不是‘微三国’？", "微三国", GameName[8].getText());
//			assertEquals("第10个游戏不是‘德州扑克’？", "德州扑克", GameName[9].getText());
//			assertEquals("第11个游戏不是‘动物保护色’？", "动物保护色", GameName[10].getText());
//			assertEquals("第12个游戏不是‘三国时代OL’？", "三国时代OL", GameName[11].getText());
//			assertEquals("第13个游戏不是‘趣味沙箱’？", "趣味沙箱", GameName[12].getText());
//			assertEquals("第14个游戏不是‘新宝石消消看’？", "新宝石消消看", GameName[13].getText());
//			assertEquals("第15个游戏不是‘单机斗地主’？", "单机斗地主", GameName[14].getText());
//			assertEquals("第16个游戏不是‘末日大冒险’？", "末日大冒险", GameName[15].getText());
//			assertEquals("第17个游戏不是‘随身宠’？", "随身宠", GameName[16].getText());
//			assertEquals("第18个游戏不是‘深海连连看’？", "深海连连看", GameName[17].getText());
//			assertEquals("第19个游戏不是‘十字消除’？", "十字消除", GameName[18].getText());
//			assertEquals("第20个游戏不是‘怪弹万圣节’？", "怪弹万圣节", GameName[19].getText());
//			assertEquals("第21个游戏不是‘古墓猎人’？", "古墓猎人", GameName[20].getText());
//			assertEquals("第22个游戏不是‘羊驼侠盗’？", "羊驼侠盗", GameName[21].getText());
//
//		} catch (Exception e) {
//			assertEquals("游戏中心(瀑布模式)数据有问题", true, false);
//		}
		
	}
	
//	protected void tearDown0() throws Exception {
//		solo.finishOpenedActivities();
//	}
	
	public void test02GameListRank() {
		solo.clickOnText("游戏中心");
		solo.sleep(3000);
		solo.clickOnButton(0);
		solo.sleep(1000);
		int clickCount = (int) Math.floor((gamecount-1)/9);
		for(int i = 0;i<clickCount;i++){
			solo.clickOnText("更多");
		}
		solo.sleep(3000);
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView GameListView2 = ListViews.get(1);
		int gameCount = GameListView2.getCount();
		Log.e("游戏中心列表", "gameCount=" + gameCount);
		View[] GameItem = new View[gamecount];
		TextView[] GameName = new TextView[gamecount];
		try {
			for (int i = 2; i < gameCount-1; i++) {
				WyxGameCenter gameCenter = (WyxGameCenter) GameListView2.getItemAtPosition(i);
				Log.e("游戏中心列表", "游戏名称"+i+":" + gameCenter.getAppname());
//				GameItem[i] = GameListView2.getChildAt(i);
//				GameName[i] = (TextView) GameItem[i]
//						.findViewById(R.id.fir_game_center_listing_item_gamename_tv);

//				Log.e("游戏中心列表", "  "+i+":" + GameName[i].getText());
			}

			assertEquals("第1个游戏不是‘超三国’？", "超三国", GameName[0].getText());
			assertEquals("第2个游戏不是‘微城市’？", "微城市", GameName[1].getText());
			assertEquals("第3个游戏不是‘你画我猜移动版’？", "你画我猜移动版", GameName[2].getText());
			assertEquals("第4个游戏不是‘爱画爱猜’？", "爱画爱猜", GameName[3].getText());
			assertEquals("第5个游戏不是‘梦幻方块’？", "梦幻方块", GameName[4].getText());
			assertEquals("第6个游戏不是‘宝石连环战’？", "宝石连环战", GameName[5].getText());
			assertEquals("第7个游戏不是‘邻邦战争’？", "邻邦战争", GameName[6].getText());
			assertEquals("第8个游戏不是‘闹闹马戏团’？", "闹闹马戏团", GameName[7].getText());
			assertEquals("第9个游戏不是‘微三国’？", "微三国", GameName[8].getText());
			assertEquals("第10个游戏不是‘德州扑克’？", "德州扑克", GameName[9].getText());
			assertEquals("第11个游戏不是‘动物保护色’？", "动物保护色", GameName[10].getText());
			assertEquals("第12个游戏不是‘三国时代OL’？", "三国时代OL", GameName[11].getText());
			assertEquals("第13个游戏不是‘趣味沙箱’？", "趣味沙箱", GameName[12].getText());
			assertEquals("第14个游戏不是‘新宝石消消看’？", "新宝石消消看", GameName[13].getText());
			assertEquals("第15个游戏不是‘单机斗地主’？", "单机斗地主", GameName[14].getText());
			assertEquals("第16个游戏不是‘末日大冒险’？", "末日大冒险", GameName[15].getText());
			assertEquals("第17个游戏不是‘随身宠’？", "随身宠", GameName[16].getText());
			assertEquals("第18个游戏不是‘深海连连看’？", "深海连连看", GameName[17].getText());
			assertEquals("第19个游戏不是‘十字消除’？", "十字消除", GameName[18].getText());
			assertEquals("第20个游戏不是‘怪弹万圣节’？", "怪弹万圣节", GameName[19].getText());
			assertEquals("第21个游戏不是‘古墓猎人’？", "古墓猎人", GameName[20].getText());
			assertEquals("第22个游戏不是‘羊驼侠盗’？", "羊驼侠盗", GameName[21].getText());
			
			Log.e("y", "20"+GameName[20]);
			
		} catch (Exception e) {
			// TODO: handle exception

		} finally{
			Log.e("y", "20"+GameName[20]);
			solo.sleep(2000);
		}

	}
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}	
}
