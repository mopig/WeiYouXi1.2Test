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
//		solo.clickOnText("��Ϸ����");
//		boolean expected = true;
//		boolean actual = solo.searchText("�б�");
//		assertEquals("�Ҳ������б�ģʽ", expected, actual);
//		
//		solo.clickOnText("�б�");
//		actual = solo.searchText("�ٲ�");
//		assertEquals("�б�/�ٲ� ģʽ�л�����ȷ", expected, actual);
//	}
	
	public void test01GameWaterfallRank() {
		solo.sleep(3000);
		solo.clickOnButton("��Ϸ����");
		solo.sleep(3000);
		int clickCount = (int) Math.floor((gamecount-1)/9);
		for(int i = 0;i<clickCount;i++){
			solo.clickOnText("����");
		}
		solo.sleep(2000);
		solo.searchText("�Ѿ�û�и�����Ϸ");
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
			Log.e("��Ϸ����", ":" + GameItem.get(i).getClass());
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
//				Log.e("��Ϸ����", ":" + GameItem.get(i).getAppname());
//			}
//		    Log.e("��Ϸ����", ":" + GameItem.get(i).getAppname());
//			assertEquals("��1����Ϸ���ǡ�����������", "������", GameName[0].getText());
//			assertEquals("��2����Ϸ���ǡ�΢���С���", "΢����", GameName[1].getText());
//			assertEquals("��3����Ϸ���ǡ��㻭�Ҳ��ƶ��桯��", "�㻭�Ҳ��ƶ���", GameName[2].getText());
//			assertEquals("��4����Ϸ���ǡ��������¡���", "��������", GameName[3].getText());
//			assertEquals("��5����Ϸ���ǡ��λ÷��顯��", "�λ÷���", GameName[4].getText());
//			assertEquals("��6����Ϸ���ǡ���ʯ����ս����", "��ʯ����ս", GameName[5].getText());
//			assertEquals("��7����Ϸ���ǡ��ڰ�ս������", "�ڰ�ս��", GameName[6].getText());
//			assertEquals("��8����Ϸ���ǡ�������Ϸ�š���", "������Ϸ��", GameName[7].getText());
//			assertEquals("��9����Ϸ���ǡ�΢��������", "΢����", GameName[8].getText());
//			assertEquals("��10����Ϸ���ǡ������˿ˡ���", "�����˿�", GameName[9].getText());
//			assertEquals("��11����Ϸ���ǡ����ﱣ��ɫ����", "���ﱣ��ɫ", GameName[10].getText());
//			assertEquals("��12����Ϸ���ǡ�����ʱ��OL����", "����ʱ��OL", GameName[11].getText());
//			assertEquals("��13����Ϸ���ǡ�Ȥζɳ�䡯��", "Ȥζɳ��", GameName[12].getText());
//			assertEquals("��14����Ϸ���ǡ��±�ʯ����������", "�±�ʯ������", GameName[13].getText());
//			assertEquals("��15����Ϸ���ǡ���������������", "����������", GameName[14].getText());
//			assertEquals("��16����Ϸ���ǡ�ĩ�մ�ð�ա���", "ĩ�մ�ð��", GameName[15].getText());
//			assertEquals("��17����Ϸ���ǡ�����衯��", "�����", GameName[16].getText());
//			assertEquals("��18����Ϸ���ǡ������������", "�������", GameName[17].getText());
//			assertEquals("��19����Ϸ���ǡ�ʮ����������", "ʮ������", GameName[18].getText());
//			assertEquals("��20����Ϸ���ǡ��ֵ���ʥ�ڡ���", "�ֵ���ʥ��", GameName[19].getText());
//			assertEquals("��21����Ϸ���ǡ���Ĺ���ˡ���", "��Ĺ����", GameName[20].getText());
//			assertEquals("��22����Ϸ���ǡ�������������", "��������", GameName[21].getText());
//
//		} catch (Exception e) {
//			assertEquals("��Ϸ����(�ٲ�ģʽ)����������", true, false);
//		}
		
	}
	
//	protected void tearDown0() throws Exception {
//		solo.finishOpenedActivities();
//	}
	
	public void test02GameListRank() {
		solo.clickOnText("��Ϸ����");
		solo.sleep(3000);
		solo.clickOnButton(0);
		solo.sleep(1000);
		int clickCount = (int) Math.floor((gamecount-1)/9);
		for(int i = 0;i<clickCount;i++){
			solo.clickOnText("����");
		}
		solo.sleep(3000);
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView GameListView2 = ListViews.get(1);
		int gameCount = GameListView2.getCount();
		Log.e("��Ϸ�����б�", "gameCount=" + gameCount);
		View[] GameItem = new View[gamecount];
		TextView[] GameName = new TextView[gamecount];
		try {
			for (int i = 2; i < gameCount-1; i++) {
				WyxGameCenter gameCenter = (WyxGameCenter) GameListView2.getItemAtPosition(i);
				Log.e("��Ϸ�����б�", "��Ϸ����"+i+":" + gameCenter.getAppname());
//				GameItem[i] = GameListView2.getChildAt(i);
//				GameName[i] = (TextView) GameItem[i]
//						.findViewById(R.id.fir_game_center_listing_item_gamename_tv);

//				Log.e("��Ϸ�����б�", "  "+i+":" + GameName[i].getText());
			}

			assertEquals("��1����Ϸ���ǡ�����������", "������", GameName[0].getText());
			assertEquals("��2����Ϸ���ǡ�΢���С���", "΢����", GameName[1].getText());
			assertEquals("��3����Ϸ���ǡ��㻭�Ҳ��ƶ��桯��", "�㻭�Ҳ��ƶ���", GameName[2].getText());
			assertEquals("��4����Ϸ���ǡ��������¡���", "��������", GameName[3].getText());
			assertEquals("��5����Ϸ���ǡ��λ÷��顯��", "�λ÷���", GameName[4].getText());
			assertEquals("��6����Ϸ���ǡ���ʯ����ս����", "��ʯ����ս", GameName[5].getText());
			assertEquals("��7����Ϸ���ǡ��ڰ�ս������", "�ڰ�ս��", GameName[6].getText());
			assertEquals("��8����Ϸ���ǡ�������Ϸ�š���", "������Ϸ��", GameName[7].getText());
			assertEquals("��9����Ϸ���ǡ�΢��������", "΢����", GameName[8].getText());
			assertEquals("��10����Ϸ���ǡ������˿ˡ���", "�����˿�", GameName[9].getText());
			assertEquals("��11����Ϸ���ǡ����ﱣ��ɫ����", "���ﱣ��ɫ", GameName[10].getText());
			assertEquals("��12����Ϸ���ǡ�����ʱ��OL����", "����ʱ��OL", GameName[11].getText());
			assertEquals("��13����Ϸ���ǡ�Ȥζɳ�䡯��", "Ȥζɳ��", GameName[12].getText());
			assertEquals("��14����Ϸ���ǡ��±�ʯ����������", "�±�ʯ������", GameName[13].getText());
			assertEquals("��15����Ϸ���ǡ���������������", "����������", GameName[14].getText());
			assertEquals("��16����Ϸ���ǡ�ĩ�մ�ð�ա���", "ĩ�մ�ð��", GameName[15].getText());
			assertEquals("��17����Ϸ���ǡ�����衯��", "�����", GameName[16].getText());
			assertEquals("��18����Ϸ���ǡ������������", "�������", GameName[17].getText());
			assertEquals("��19����Ϸ���ǡ�ʮ����������", "ʮ������", GameName[18].getText());
			assertEquals("��20����Ϸ���ǡ��ֵ���ʥ�ڡ���", "�ֵ���ʥ��", GameName[19].getText());
			assertEquals("��21����Ϸ���ǡ���Ĺ���ˡ���", "��Ĺ����", GameName[20].getText());
			assertEquals("��22����Ϸ���ǡ�������������", "��������", GameName[21].getText());
			
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
