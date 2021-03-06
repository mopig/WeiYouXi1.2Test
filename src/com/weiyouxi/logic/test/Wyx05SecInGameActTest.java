package com.weiyouxi.logic.test;

import java.util.ArrayList;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.R;
import com.weiyouxi.logic.WyxLoginPreAct;

@SuppressWarnings("rawtypes")
public class Wyx05SecInGameActTest extends ActivityInstrumentationTestCase2{
	private final String TAG = "Wyx05SecInGameActTest";
	
	@SuppressWarnings("unchecked")
	public Wyx05SecInGameActTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
		
	}
	private Solo solo;
	private int myGamecount = 18;
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void test01InGameSixButton() {
		solo.clickOnText("你画我猜");
		solo.sleep(5000);
		solo.clickOnImageButton(0);
		boolean expected = true;
		boolean actual = solo.searchButton("返回") && solo.searchButton("排行")
				&& solo.searchButton("邀请") && solo.searchButton("客服")
				&& solo.searchButton("刷新") && solo.searchButton("截屏");
		assertEquals("游戏页面菜单列表不完整", expected, actual);
	}
	
	
	public void test02InGameBackButton() {
		solo.clickOnText("你画我猜");
		solo.sleep(5000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("返回");
		solo.sleep(2000);
		String currentClassNameString = solo.getCurrentActivity().getLocalClassName();
		Log.e("返回后的Activity:", currentClassNameString);
		String actual = currentClassNameString;
		assertEquals("从游戏页面返回不正确", "WyxMainAct", actual);
		
		
	}	
	
	public void test03InGameRankButton() {
		solo.clickOnText("你画我猜");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("排行");
		solo.sleep(2000);
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView FriendRankListView = ListViews.get(0);
		View[] FriendRankItem = new View[3];
		TextView[] FriendRankName = new TextView[3];
		for (int i = 0; i < 3; i++) {
			FriendRankItem[i] = FriendRankListView.getChildAt(i);
			FriendRankName[i] = (TextView) FriendRankItem[i]
					.findViewById(R.id.friend_name);

			Log.e("好友排行列表", ":" + FriendRankName[i].getText());
		}
		assertEquals("好友第一名不是‘基金_weiyouxi03’", "基金_weiyouxi03",
				FriendRankName[0].getText());
		assertEquals("好友第三名不是‘渺飘零’", "渺飘零", FriendRankName[1].getText());
		assertEquals("好友第五名不是‘水中太阳空中花’", "水中太阳空中花", FriendRankName[2].getText());
	}
	
	public void test04InGameFriendButton() {
		solo.clickOnText("你画我猜");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("邀请");
		solo.sleep(2000);
		solo.enterText(0, "weiyouxi_21");
		solo.sleep(1000);
		ArrayList<GridView> GridViews = solo.getCurrentGridViews();
		Log.e("GridViews", "猫猫" + GridViews.size());

		GridView FriendGridView = GridViews.get(0);
		View[] FriendItem = new View[1];
		TextView[] FriendName = new TextView[1];
		for (int i = 0; i < 1; i++) {
			FriendItem[i] = FriendGridView.getChildAt(i);
			FriendName[i] = (TextView) FriendItem[i]
					.findViewById(R.id.game_invite_gridview_textview);

			Log.e("好友邀请列表", ":" + FriendName[i].getText());
		}
		assertEquals("搜索‘Leoaee’结果不正确", "weiyouxi_21",
				FriendName[0].getText());
	}
	
	public void test05InGameCustomButton() {
		solo.clickOnText("你画我猜");
		solo.sleep(10000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("客服");
		solo.sleep(2000);
		String CustomServiceClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("返回后的Activity:", CustomServiceClassName);
		String actual = CustomServiceClassName;
		assertEquals("未能从游戏页面正确进入客服页面", "WyxSecCustomServerPortraitAct", actual);
		
		solo.clickOnButton(0);
		solo.sleep(3000);
		String GameActClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("返回后的Activity:", GameActClassName);
//		assertEquals("未能从客服页面正确进入游戏页面", "WyxSecGameLandscapeAct", GameActClassName);
	}

	public void test06InGameRefreshButton() {
		solo.clickOnText("你画我猜");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("刷新");
		solo.sleep(2000);
		
	}

	public void test07InGameCaptureButton() {
		solo.clickOnText("你画我猜");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("截屏");
		solo.sleep(2000);
		solo.clickOnButton("分享");
		boolean isSendtip = solo.searchText("正在发送")&&solo.searchText("微博发送成功");
		assertEquals("截屏发微博 未发送成功", true, isSendtip);
		
		solo.clickOnImageButton(0);
		solo.sleep(5000);
		solo.clickOnButton("截屏");
		solo.sleep(2000);
		String captureClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("截屏发微博页面:", captureClassName);
		String actual = captureClassName;
		assertEquals("未能从游戏页面正确进入'截屏发微博'页面", "WyxThiCaptureSendWeiboAct", actual);
		
		solo.clickOnButton(0);
		String currentClassNameString = solo.getCurrentActivity().getLocalClassName();
		Log.e("返回后的Activity:", currentClassNameString);
		String actual1 = currentClassNameString;
		assertEquals("从游戏页面返回不正确", "WyxSecGameLandscapeAct", actual1);
	}
	
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}
