package com.weiyouxi.logic.test;

import java.util.ArrayList;

import org.apache.http.impl.conn.DefaultClientConnection;
import org.junit.Test;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.R;
import com.weiyouxi.logic.WyxLoginAct;
import com.weiyouxi.logic.WyxLoginPreAct;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

@SuppressWarnings("rawtypes")
public class Wyx05SecLandscapeGameActTest extends ActivityInstrumentationTestCase2 {
	@SuppressWarnings("unused")
	private final String TAG = "Wyx05SecLandscapeGameActTest";
	
	@SuppressWarnings("unchecked")
	public Wyx05SecLandscapeGameActTest(){
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
	}
	
	private Solo solo;
	
	protected void setUp() throws Exception{
		solo = new Solo(getInstrumentation(), getActivity());
	}
//	@Test
//	public void test01InGameSixButton() {
//		solo.clickOnText("�㻭�Ҳ��ƶ���");
//		solo.sleep(5000);
//		solo.clickOnImageButton(0);
//		boolean expected = true;
//		boolean actual = solo.searchButton("����") && solo.searchButton("����")
//				&& solo.searchButton("����") && solo.searchButton("�ͷ�")
//				&& solo.searchButton("ˢ��") && solo.searchButton("����");
//		assertEquals("��Ϸҳ��˵��б�����", expected, actual);
//	}
	
	
	public void test02InGameBackButton() {
		solo.clickOnText("�㻭�Ҳ��ƶ���");
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
		solo.clickOnText("�㻭�Ҳ��ƶ���");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("����");
		solo.sleep(2000);
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView FriendRankListView = ListViews.get(0);
		View[] FriendRankItem = new View[5];
		TextView[] FriendRankName = new TextView[5];
		for (int i = 0; i < 5; i++) {
			FriendRankItem[i] = FriendRankListView.getChildAt(i);
			FriendRankName[i] = (TextView) FriendRankItem[i]
					.findViewById(R.id.friend_name);

			Log.e("���������б�", ":" + FriendRankName[i].getText());
		}
		assertEquals("���ѵ�һ�����ǡ�weiyouxi04��", "weiyouxi04",
				FriendRankName[0].getText());
		assertEquals("���ѵڶ������ǡ�������ʦ��", "������ʦ", FriendRankName[1].getText());
		assertEquals("���ѵ��������ǡ���Ʈ�㡯", "��Ʈ��", FriendRankName[2].getText());
		assertEquals("���ѵ��������ǡ�ZhangC__��", "ZhangC__", FriendRankName[3].getText());
		assertEquals("���ѵ��������ǡ�Leoaee��", "Leoaee", FriendRankName[4].getText());
	}
	
	public void test04InGameFriendButton() {
		solo.clickOnText("�㻭�Ҳ��ƶ���");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("����");
		solo.sleep(2000);
		solo.enterText(0, "Leoaee");
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
		assertEquals("������Leoaee���������ȷ", "Leoaee",
				FriendName[0].getText());
	}
	
	public void test05InGameCustomButton() {
		solo.clickOnText("�㻭�Ҳ��ƶ���");
		solo.sleep(10000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("�ͷ�");
		solo.sleep(2000);
		String CustomServiceClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("���غ��Activity:", CustomServiceClassName);
		String actual = CustomServiceClassName;
		assertEquals("δ�ܴ���Ϸҳ����ȷ����ͷ�ҳ��", "WyxSecCustomServerAct", actual);
		
		solo.clickOnButton("����");
		String GameActClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("���غ��Activity:", GameActClassName);
		String actual1 = GameActClassName;
		assertEquals("δ�ܴ���Ϸҳ����ȷ����ͷ�ҳ��", "WyxSecGameLandscapeAct", actual1);
	}

	public void test06InGameRefreshButton() {
		solo.clickOnText("�㻭�Ҳ��ƶ���");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("ˢ��");
		solo.sleep(2000);
		
	}

	public void test07InGameCaptureButton() {
		solo.clickOnText("�㻭�Ҳ��ƶ���");
		solo.sleep(7000);
		solo.clickOnImageButton(0);
		solo.clickOnButton("����");
		solo.sleep(2000);
		solo.clickOnButton("����");
		boolean isSendtip = solo.searchText("���ڷ���")&&solo.searchText("���ͳɹ�");
		assertEquals("������΢�� δ���ͳɹ�", true, isSendtip);
		
		solo.clickOnImageButton(0);
		solo.clickOnButton("����");
		solo.sleep(2000);
		String captureClassName = solo.getCurrentActivity().getLocalClassName();
		Log.e("���غ��Activity:", captureClassName);
		String actual = captureClassName;
		assertEquals("δ�ܴ���Ϸҳ����ȷ����'������΢��'ҳ��", "WyxThiCaptureSendWeiboAct", actual);
		
		solo.clickOnButton("����");
		String currentClassNameString = solo.getCurrentActivity().getLocalClassName();
		Log.e("���غ��Activity:", currentClassNameString);
		String actual1 = currentClassNameString;
		assertEquals("����Ϸҳ�淵�ز���ȷ", "WyxMainAct", actual1);
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
		
	}
	

