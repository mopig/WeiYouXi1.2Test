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
		solo.clickOnText("�㻭�Ҳ�");
		solo.sleep(5000);
		solo.clickOnImageButton(0);
		boolean expected = true;
		boolean actual = solo.searchButton("����") && solo.searchButton("����")
				&& solo.searchButton("����") && solo.searchButton("�ͷ�")
				&& solo.searchButton("ˢ��") && solo.searchButton("����");
		assertEquals("��Ϸҳ��˵��б�����", expected, actual);
	}
	
	
	public void test02InGameBackButton() {
		solo.clickOnText("�㻭�Ҳ�");
		solo.sleep(5000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("����");
		solo.sleep(2000);
		String currentClassNameString = solo.getCurrentActivity().getLocalClassName();
		Log.e("���غ��Activity:", currentClassNameString);
		String actual = currentClassNameString;
		assertEquals("����Ϸҳ�淵�ز���ȷ", "WyxMainAct", actual);
		
		
	}	
	
	public void test03InGameRankButton() {
		solo.clickOnText("�㻭�Ҳ�");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("����");
		solo.sleep(2000);
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView FriendRankListView = ListViews.get(0);
		View[] FriendRankItem = new View[3];
		TextView[] FriendRankName = new TextView[3];
		for (int i = 0; i < 3; i++) {
			FriendRankItem[i] = FriendRankListView.getChildAt(i);
			FriendRankName[i] = (TextView) FriendRankItem[i]
					.findViewById(R.id.friend_name);

			Log.e("���������б�", ":" + FriendRankName[i].getText());
		}
		assertEquals("���ѵ�һ�����ǡ�����_weiyouxi03��", "����_weiyouxi03",
				FriendRankName[0].getText());
		assertEquals("���ѵ��������ǡ���Ʈ�㡯", "��Ʈ��", FriendRankName[1].getText());
		assertEquals("���ѵ��������ǡ�ˮ��̫�����л���", "ˮ��̫�����л�", FriendRankName[2].getText());
	}
	
	public void test04InGameFriendButton() {
		solo.clickOnText("�㻭�Ҳ�");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("����");
		solo.sleep(2000);
		solo.enterText(0, "weiyouxi_21");
		solo.sleep(1000);
		ArrayList<GridView> GridViews = solo.getCurrentGridViews();
		Log.e("GridViews", "èè" + GridViews.size());

		GridView FriendGridView = GridViews.get(0);
		View[] FriendItem = new View[1];
		TextView[] FriendName = new TextView[1];
		for (int i = 0; i < 1; i++) {
			FriendItem[i] = FriendGridView.getChildAt(i);
			FriendName[i] = (TextView) FriendItem[i]
					.findViewById(R.id.game_invite_gridview_textview);

			Log.e("���������б�", ":" + FriendName[i].getText());
		}
		assertEquals("������Leoaee���������ȷ", "weiyouxi_21",
				FriendName[0].getText());
	}
	
	public void test05InGameCustomButton() {
		solo.clickOnText("�㻭�Ҳ�");
		solo.sleep(10000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("�ͷ�");
		solo.sleep(2000);
		String CustomServiceClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("���غ��Activity:", CustomServiceClassName);
		String actual = CustomServiceClassName;
		assertEquals("δ�ܴ���Ϸҳ����ȷ����ͷ�ҳ��", "WyxSecCustomServerPortraitAct", actual);
		
		solo.clickOnButton(0);
		solo.sleep(3000);
		String GameActClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("���غ��Activity:", GameActClassName);
//		assertEquals("δ�ܴӿͷ�ҳ����ȷ������Ϸҳ��", "WyxSecGameLandscapeAct", GameActClassName);
	}

	public void test06InGameRefreshButton() {
		solo.clickOnText("�㻭�Ҳ�");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("ˢ��");
		solo.sleep(2000);
		
	}

	public void test07InGameCaptureButton() {
		solo.clickOnText("�㻭�Ҳ�");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("����");
		solo.sleep(2000);
		solo.clickOnButton("����");
		boolean isSendtip = solo.searchText("���ڷ���")&&solo.searchText("΢�����ͳɹ�");
		assertEquals("������΢�� δ���ͳɹ�", true, isSendtip);
		
		solo.clickOnImageButton(0);
		solo.sleep(5000);
		solo.clickOnButton("����");
		solo.sleep(2000);
		String captureClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("������΢��ҳ��:", captureClassName);
		String actual = captureClassName;
		assertEquals("δ�ܴ���Ϸҳ����ȷ����'������΢��'ҳ��", "WyxThiCaptureSendWeiboAct", actual);
		
		solo.clickOnButton(0);
		String currentClassNameString = solo.getCurrentActivity().getLocalClassName();
		Log.e("���غ��Activity:", currentClassNameString);
		String actual1 = currentClassNameString;
		assertEquals("����Ϸҳ�淵�ز���ȷ", "WyxSecGameLandscapeAct", actual1);
	}
	
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}
