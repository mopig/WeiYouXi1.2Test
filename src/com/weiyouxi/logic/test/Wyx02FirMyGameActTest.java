package com.weiyouxi.logic.test;

import java.util.ArrayList;

import android.R.integer;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.weiyouxi.entity.WyxMyGameGame;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.entity.WyxGameCenter;
import com.weiyouxi.logic.R;
import com.weiyouxi.logic.WyxLoginAct;
import com.weiyouxi.logic.WyxLoginPreAct;
import com.weiyouxi.logic.WyxMainAct;

@SuppressWarnings("rawtypes")
public class Wyx02FirMyGameActTest extends ActivityInstrumentationTestCase2{
	private final String TAG = "WyxLoginTest";
	private static int mygamecount = 8;
	@SuppressWarnings("unchecked")
	public Wyx02FirMyGameActTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
		
	}
	private Solo solo;
	
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void test01TwoTab(){
		solo.clickOnText("�ҵ���Ϸ");
		boolean expected = true;
		boolean actual = solo.searchText("�ҵ���Ϸ")&&solo.searchText("�ҵ���Ϣ");
		assertEquals("�Ҳ���'�ҵ���Ϸ'����'�ҵ���Ϣ'", expected, actual);
		
	}
	public void test02MyGameList(){
		
		solo.clickOnButton("�ҵ���Ϸ");
//		solo.clickOnText("�ҵ���Ϣ");
//		solo.clickOnText("�ҵ���Ϸ", 1);
		solo.sleep(10000);
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView MyGameListView = ListViews.get(0);
		
		View[] MyGameAdapter = null;
		
		MyGameAdapter = new View[mygamecount];
		String[] MyGameName = new String[mygamecount];
//		if(mygamecount==1){
//			
//		}else{
//			assertEquals("�ҵ���Ϸû��ȡ������", true, false);
//		}
//		Object item1 = MyGameListView.findViewById(R.id.fir_mygame_textview_gamename);
//		MyGameListView.get
		int gameCount = MyGameListView.getCount()-1;
		Log.e("�ҵ���Ϸ�б�", "��Ϸ����"+MyGameListView.getCount());
//		try {
			for(int i = 1;i < 9;i++){
				MyGameName[i-1] = ((WyxMyGameGame) MyGameListView.getItemAtPosition(i)).getAppname();
//				MyGameAdapter[i] = MyGameListView.getChildAt(i);
//				MyGameName[i-1]  = (String) ((TextView) MyGameAdapter[i].findViewById(R.id.fir_mygame_textview_gamename)).getText();
			Log.e("�ҵ���Ϸ�б�", ":"+i+MyGameName[i-1]);
			}
			//��֤���ҵ���Ϸ��ҳ�棬��Ϸ�б������Ƿ���ȷ��������Ϸ��ʱ���Ⱥ�
			assertEquals("��һ����Ϸ����", "ʮ������", MyGameName[0]);
			assertEquals("�ڶ�����Ϸ����", "�����", MyGameName[1]);
			assertEquals("��������Ϸ����", "�㻭�Ҳ��ƶ���", MyGameName[2]);
			assertEquals("���ĸ���Ϸ����", "΢����", MyGameName[3]);
			assertEquals("�������Ϸ����", "���ﱣ��ɫ", MyGameName[4]);
			assertEquals("��������Ϸ����", "������", MyGameName[5]);
			assertEquals("���߸���Ϸ����", "�¿���˹�˿�", MyGameName[6]);
			assertEquals("�ڰ˸���Ϸ����", "��Ĺ����", MyGameName[7]);
//		} catch (Exception e) {
//			assertEquals("�ҵ���Ϸû��ȡ������", true, false);
			// TODO: handle exception
//		}finally{
			Log.e("����ִ��", "go on");
//		}
		
		Log.e("����������", ":"+MyGameListView.getAdapter().getCount());
		Log.e("��һ����Ϸ����", ":"+MyGameName[0]);
	    
	}
	
	public void test03MyMessageList() {
		solo.clickOnButton("�ҵ���Ϸ");
		solo.clickOnText("�ҵ���Ϣ");
		ArrayList<ListView> MyMessageListViews = solo.getCurrentListViews();
		Log.e("��Ϣҳ��ListViews����", ":"+MyMessageListViews.size());
		ListView MyGameMessageListView = MyMessageListViews.get(1);
//		ListView FriendMessage = MyMessageListViews.get(1);
		
		boolean actual0 = solo.searchText("������PC��Ϸ������������΢��Ϸ�ֻ�����ҫ�ǳ����桶���������ֻ��棬����VIP������飬�����ɣ�");
		boolean actual1 = solo.searchText("��һ�����ص��Ƽ����Ͳ�����Ϸ���ڰ�ս�������ף����������һ��������Ŷ��");
		boolean actual2 = solo.searchText("����������������߿�~�죬�ٿ죬������ָ��Ѹ��ͨ�أ��׿���Ŷ��");
		boolean actual3 = solo.searchText("���������ĵ�����΢��Ϸ����Ϸ��Ȥζɳ�䡷��������������֤��������������ɣ�");
		boolean actual4 = solo.searchText("�����į��ʲô�������ֵ���ʥ���������е���ĩʱ�⣡");
		boolean actual5 = solo.searchText("����PC������Ϸ��΢���С���΢��Ϸ�ͻ�������������������������˽�˻�԰�����������˽�high���죡����΢��Ϸ���뻥���ɣ�");
		
		assertTrue("��Ϸ��Ϣ1û�ҵ�", actual0);
		assertTrue("��Ϸ��Ϣ2û�ҵ�", actual1);
		assertTrue("��Ϸ��Ϣ3û�ҵ�", actual2);
		assertTrue("��Ϸ��Ϣ4û�ҵ�", actual3);
		assertTrue("��Ϸ��Ϣ5û�ҵ�", actual4);
		assertTrue("��Ϸ��Ϣ6û�ҵ�", actual5);
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}