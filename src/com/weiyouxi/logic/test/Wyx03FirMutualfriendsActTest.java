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
			solo.clickOnButton("���ۺ���");
//			solo.clickLongOnText("���ۺ���");
//			solo.clickOnText("����");
//			solo.clickOnText("���ۺ���");
//			
//			solo.sleep(5000);
//			solo.clickOnText("���ظ���");
			solo.sleep(5000);
			
			ArrayList<ListView> ListViews = solo.getCurrentListViews();
			ListView MutualfriendsListView = ListViews.get(0);
			View[] MutualfriendsItem = new View[5];
			TextView[] FriendName = new TextView[5];
			for (int i = 1; i < 5; i++) {
				MutualfriendsItem[i] = MutualfriendsListView.getChildAt(i);
				FriendName[i] = (TextView) MutualfriendsItem[i]
						.findViewById(R.id.fir_mutualfriends_textview_username);

				Log.e("���������б�", ":" + FriendName[i].getText());
			}
			
			ListView MutualFriendsListView = ListViews.get(0);
			//�鿴����������
			Log.e("item����", " ���ǣ�"+MutualFriendsListView.getAdapter().getCount());
			
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
//				Log.e(TAG, "���ۺ�������"+i+"="+ UserName[i]);
//			}
//			
		} catch (Exception e) {
//			// TODO: handle exception
			assertTrue("ܳ�����ۺ��Ѳ���������ʾ", false);
		}
	}
	//R.id.fir_mygame_textview_gamename
	public void test02FriendGamesAct() {
		solo.clickOnButton("���ۺ���");
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
//			assertEquals("�ҵ���Ϸû��ȡ������", true, false);
//		}
//		MyGameListView.get
		Log.e("�ҵ���Ϸ�б�", "��Ϸ����"+MyGameListView.getChildCount());
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