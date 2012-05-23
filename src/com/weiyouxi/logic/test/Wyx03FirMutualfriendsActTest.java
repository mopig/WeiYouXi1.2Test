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
			solo.clickOnButton("���ۺ���");
//			solo.clickLongOnText("���ۺ���");
//			solo.clickOnText("����");
//			solo.clickOnText("���ۺ���");
//			
//			solo.sleep(5000);
//			solo.clickOnText("���ظ���");
			solo.sleep(5000);
			solo.clickOnText("����");
			solo.sleep(3000);
			ArrayList<ListView> ListViews = solo.getCurrentListViews();
			ListView MutualfriendsListView = ListViews.get(0);
			String[] FriendName = new String[17];
//			for (int i = 1; i < 5; i++) {
//				MutualfriendsItem[i] = MutualfriendsListView.getChildAt(i);
//				FriendName[i] = (String) MutualfriendsItem[i]
//						.findViewById(R.id.fir_mutualfriends_textview_username);
//
//				Log.e("���������б�", ":" + FriendName[i].getText());
//			}
			for (int i = 1; i < 18; i++) {
				WyxFirMutualFriends gameCenter = (WyxFirMutualFriends) MutualfriendsListView.getItemAtPosition(i);
				Log.e("���ۺ���", "���ۺ���"+i+":" + gameCenter.getName());
				FriendName[i-1] = ((WyxFirMutualFriends) MutualfriendsListView.getItemAtPosition(i)).getName();
//				GameItem[i] = GameListView2.getChildAt(i);
//				GameName[i] = (TextView) GameItem[i]
//						.findViewById(R.id.fir_game_center_listing_item_gamename_tv);

//				Log.e("��Ϸ�����б�", "  "+i+":" + GameName[i].getText());
			}
			
			ListView MutualFriendsListView = ListViews.get(0);
			//�鿴����������
			Log.e("item����", " ���ǣ�"+MutualFriendsListView.getCount());
			
		//��֤������ȷ��
			assertEquals("��1�����Ѳ��ǡ�����������", "ǳ�^��ֹ", FriendName[0]);
			assertEquals("��2�����Ѳ��ǡ�����������", "��Ʈ��", FriendName[1]);
			assertEquals("��3�����Ѳ��ǡ�����������", "ʮ�����ϲ_dsfdsfdssʮ�����ϲ", FriendName[2]);
			assertEquals("��4�����Ѳ��ǡ�����������", "����_weiyouxi03", FriendName[3]);
			assertEquals("��5�����Ѳ��ǡ�����������", "weiyouxi_28", FriendName[4]);
			assertEquals("��6����Ϸ���ǡ�����������", "�ҵ�΢Online����WWWW����", FriendName[5]);
			assertEquals("��7����Ϸ���ǡ�����������", "ˮ��̫�����л�", FriendName[6]);
			assertEquals("��8����Ϸ���ǡ�����������", "luo˧��", FriendName[7]);
			assertEquals("��9����Ϸ���ǡ�����������", "weiyouxi_31", FriendName[8]);
			assertEquals("��10����Ϸ���ǡ�����������", "���ؼ۰�", FriendName[9]);
			assertEquals("��11����Ϸ���ǡ�����������", "weiyouxi_45", FriendName[10]);
			assertEquals("��12����Ϸ���ǡ�����������", "weiyouxi_34", FriendName[11]);
			assertEquals("��13����Ϸ���ǡ�����������", "weiyouxi_21", FriendName[12]);
			assertEquals("��14����Ϸ���ǡ�����������", "weiyouxi_36", FriendName[13]);
			assertEquals("��15����Ϸ���ǡ�����������", "weiyouxi_40", FriendName[14]);
			assertEquals("��16����Ϸ���ǡ�����������", "weiyouxi_39", FriendName[15]);
			assertEquals("��17����Ϸ���ǡ�����������", "weiyouxi_38", FriendName[16]);
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
//		} catch (Exception e) {
//			// TODO: handle exception
//			assertTrue("ܳ�����ۺ��Ѳ���������ʾ", false);
		}
//	}
	//R.id.fir_mygame_textview_gamename
	public void test02FriendGamesAct() {
		solo.clickOnButton("���ۺ���");
		solo.sleep(5000);
//		solo.drag(100.f, 100.f, 150.f, 100.f, 5);
//		solo.sleep(3000);
		
		solo.clickOnText("ǳ�^��ֹ");
		solo.sleep(5000);
		try {
			ArrayList<ListView> ListViews = solo.getCurrentListViews();
			ListView FriendGameListView = ListViews.get(0);
			
			View[] FriendGameItem = new View[4];
			
			TextView[] FriendGameName = new TextView[3];
//			if(mygamecount==1){
//				
//			}else{
//				assertEquals("�ҵ���Ϸû��ȡ������", true, false);
//			}
//			MyGameListView.get
			Log.e("�ҵ���Ϸ�б�", "��Ϸ����"+FriendGameListView.getCount());
			Log.e("�ҵ���Ϸ�б�", "��Ϸ����"+FriendGameListView.getItemAtPosition(0).getClass());
//			try {
				for(int i = 1;i < 9;i++){
					FriendGameItem[i] = FriendGameListView.getChildAt(i);
					FriendGameName[i-1]  = (TextView) FriendGameItem[i].findViewById(R.id.fir_mygame_textview_gamename);
				}
		} catch (Exception e) {
			// TODO: handle exception
			assertTrue("��TA����Ϸû�����ݡ�", false);
		}
		
		
		
	}
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}