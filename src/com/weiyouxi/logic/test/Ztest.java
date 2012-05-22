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

@SuppressWarnings("rawtypes")
public class Ztest extends ActivityInstrumentationTestCase2{
	private final String TAG = "Ztest";
	
	@SuppressWarnings("unchecked")
	public Ztest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
		
	}
	private Solo solo;
	private int myGamecount = 18;
	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void test01TwoTab() {
		solo.clickOnButton("我的游戏");
		boolean expected = true;
		boolean actual = solo.searchText("我的游戏") && solo.searchText("我的消息");
		assertEquals("找不到'我的游戏'或者'我的消息'", expected, actual);
		try {
			solo.clickOnText("我的消息");

			solo.clickOnText("我的游戏", 0);
		} catch (Exception e) {
			// TODO: handle exception
			assertFalse("我的游戏页面：“我的游戏”“我的消息”切换失败", true);
		}

	}
	
	public void test02MyGameTab() {
		solo.clickOnButton("我的游戏");
		solo.sleep(3000);
		ArrayList<ListView> ListViews = solo.getCurrentListViews();
		ListView GameListView = ListViews.get(0);
		View[] GameItem = new View[myGamecount];
		TextView[] GameName = new TextView[myGamecount];
		try {
			for (int i = 0; i < myGamecount; i++) {
				GameItem[i] = GameListView.getChildAt(i);
				GameName[i] = (TextView) GameItem[i]
						.findViewById(R.id.fir_mygame_textview_gamename);

				Log.e("我的游戏列表", ":" + GameName[i].getText());
			}

		} catch (Exception e) {
			// TODO: handle exception
			
			Log.e("当前列表个数", ":"+solo.getCurrentListViews().size());
			GameItem[1] = GameListView.getChildAt(1);
			GameName[1] = (TextView) GameItem[1]
					.findViewById(R.id.fir_mygame_textview_gamename);
			Log.e("我的游戏列表", ":" + GameName[1].getText());
			assertFalse("我的游戏列表显示错误",true);
		}
	}
	
	public void test03MyMessageTab(){
		
	}
	
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}
}
