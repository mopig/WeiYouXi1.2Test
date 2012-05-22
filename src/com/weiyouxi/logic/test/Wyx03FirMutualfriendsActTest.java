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
import com.weiyouxi.logic.WyxMainAct;

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
		try {
			solo.clickOnButton("互粉好友");
//			solo.clickLongOnText("互粉好友");
//			solo.clickOnText("设置");
//			solo.clickOnText("互粉好友");
//			
//			solo.sleep(5000);
//			solo.clickOnText("加载更多");
			solo.sleep(5000);
			
			ArrayList<ListView> ListViews = solo.getCurrentListViews();
			ListView MutualfriendsListView = ListViews.get(0);
			View[] MutualfriendsItem = new View[5];
			TextView[] FriendName = new TextView[5];
			for (int i = 1; i < 5; i++) {
				MutualfriendsItem[i] = MutualfriendsListView.getChildAt(i);
				FriendName[i] = (TextView) MutualfriendsItem[i]
						.findViewById(R.id.fir_mutualfriends_textview_username);

				Log.e("好友排行列表", ":" + FriendName[i].getText());
			}
			
			ListView MutualFriendsListView = ListViews.get(0);
			//查看适配器个数
			Log.e("item个数", " 就是："+MutualFriendsListView.getAdapter().getCount());
			
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
		} catch (Exception e) {
//			// TODO: handle exception
			assertTrue("艹，互粉好友不能正常显示", false);
		}
	}
	//R.id.fir_mygame_textview_gamename
	public void test02FriendGamesAct() {
		solo.clickOnButton("互粉好友");
		solo.sleep(5000);
		solo.drag(100.f, 100.f, 150.f, 100.f, 5);
		solo.sleep(5000);
		
		solo.clickOnText("weiyouxi04");
		solo.sleep(5000);
		
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView MyGameListView = ListViews.get(0);
		
		View[] FriendGameItem = new View[5];
		
		TextView[] FriendGameName = new TextView[5];
//		if(mygamecount==1){
//			
//		}else{
//			assertEquals("我的游戏没有取到数据", true, false);
//		}
//		MyGameListView.get
		Log.e("我的游戏列表", "游戏个数"+MyGameListView.getChildCount());
//		try {
			for(int i = 1;i < 5;i++){
				FriendGameItem[i] = MyGameListView.getChildAt(i);
				FriendGameName[i]  = (TextView) FriendGameItem[i].findViewById(R.id.fir_mygame_textview_gamename);
			}
		
		
	}
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}