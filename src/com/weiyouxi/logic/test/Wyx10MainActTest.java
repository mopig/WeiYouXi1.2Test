package com.weiyouxi.logic.test;

import java.util.ArrayList;

import com.jayway.android.robotium.solo.Solo;
import com.weiyouxi.logic.WyxLoginAct;
import com.weiyouxi.logic.WyxLoginPreAct;
import com.weiyouxi.logic.WyxMainAct;

import android.R.integer;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

@SuppressWarnings("rawtypes")
public class Wyx10MainActTest extends ActivityInstrumentationTestCase2 {
    private final String TAG = "Wyx01MainActTest";
	@SuppressWarnings("unchecked")
	public Wyx10MainActTest() throws ClassNotFoundException{
		super("com.weiyouxi.logic",WyxLoginPreAct.class);
	}
	
	private Solo solo;

	protected void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void disabletestWyxMainAct(){
		solo.clickOnButton("我的游戏");
		solo.clickOnButton("互粉好友");
		solo.clickOnButton("设置");
		solo.clickOnButton("游戏中心");
		solo.sleep(1000);
        solo.clickOnText("加载更多");
        solo.sleep(1000);
        ArrayList<ListView> GameListView = solo.getCurrentListViews();
//        ListView[] GameSession = new ListView[GameListView.size()];
//        for(int i = 0;i<GameListView.size();i++){
//        	GameSession[i] = GameListView.get(i);
//        }
        ListView GameList = GameListView.get(0);
        View GameAdapter1 = GameList.getChildAt(0);
        View GameAdapter2 = GameList.getChildAt(1);
        
        TextView[] GameName = new TextView[16];
//        GameName[0] = (TextView) GameAdapter1.findViewById(0x7f060007);
//        GameName[1] = (TextView) GameAdapter1.findViewById(0x7f060016);
//        GameName[2] = (TextView) GameAdapter1.findViewById(0x7f060025);
//        GameName[3] = (TextView) GameAdapter1.findViewById(0x7f06000c);
//        GameName[4] = (TextView) GameAdapter1.findViewById(0x7f06001b);
//        GameName[5] = (TextView) GameAdapter1.findViewById(0x7f06002a);
//        GameName[6] = (TextView) GameAdapter1.findViewById(0x7f060011);
//        GameName[7] = (TextView) GameAdapter1.findViewById(0x7f060020);
//        GameName[8] = (TextView) GameAdapter1.findViewById(0x7f06002f);
//        
//        GameName[9] = (TextView) GameAdapter2.findViewById(0x7f060007);
//        GameName[10] = (TextView) GameAdapter2.findViewById(0x7f060016);
//        GameName[11] = (TextView) GameAdapter2.findViewById(0x7f060025);
//        GameName[12] = (TextView) GameAdapter2.findViewById(0x7f06000c);
//        GameName[13] = (TextView) GameAdapter2.findViewById(0x7f06001b);
//        GameName[14] = (TextView) GameAdapter2.findViewById(0x7f06002a);
//        GameName[15] = (TextView) GameAdapter2.findViewById(0x7f060011);
//        
//        for (int i = 0; i < 16; i++) {
//			Log.e(TAG, "GameName"+i+"="+ GameName[i].getText());
//		}
//        
//        TextView[] GameType = new TextView[16];
//        GameType[0] = (TextView) GameAdapter1.findViewById(0x7f060008);
//        GameType[1] = (TextView) GameAdapter1.findViewById(0x7f060017);
//        GameType[2] = (TextView) GameAdapter1.findViewById(0x7f060026);
//        GameType[3] = (TextView) GameAdapter1.findViewById(0x7f06000d);
//        GameType[4] = (TextView) GameAdapter1.findViewById(0x7f06001c);
//        GameType[5] = (TextView) GameAdapter1.findViewById(0x7f06002b);
//        GameType[6] = (TextView) GameAdapter1.findViewById(0x7f060012);
//        GameType[7] = (TextView) GameAdapter1.findViewById(0x7f060021);
//        GameType[8] = (TextView) GameAdapter1.findViewById(0x7f060030);
//        
//        GameType[9] = (TextView) GameAdapter2.findViewById(0x7f060008);
//        GameType[10] = (TextView) GameAdapter2.findViewById(0x7f060017);
//        GameType[11] = (TextView) GameAdapter2.findViewById(0x7f060026);
//        GameType[12] = (TextView) GameAdapter2.findViewById(0x7f06000d);
//        GameType[13] = (TextView) GameAdapter2.findViewById(0x7f06001d);
//        GameType[14] = (TextView) GameAdapter2.findViewById(0x7f06002b);
//        GameType[15] = (TextView) GameAdapter2.findViewById(0x7f060012);
//        for (int i = 0; i < 16; i++) {
//			Log.e(TAG, "GameType"+i+"="+ GameType[i].getText());
//		}
//        
//        TextView[] GameContent = new TextView[16];
//        GameContent[0] = (TextView) GameAdapter1.findViewById(0x7f060009);
//        GameContent[1] = (TextView) GameAdapter1.findViewById(0x7f060018);
//        GameContent[2] = (TextView) GameAdapter1.findViewById(0x7f060027);
//        GameContent[3] = (TextView) GameAdapter1.findViewById(0x7f06000e);
//        GameContent[4] = (TextView) GameAdapter1.findViewById(0x7f06001d);
//        GameContent[5] = (TextView) GameAdapter1.findViewById(0x7f06002c);
//        GameContent[6] = (TextView) GameAdapter1.findViewById(0x7f060013);
//        GameContent[7] = (TextView) GameAdapter1.findViewById(0x7f060022);
//        GameContent[8] = (TextView) GameAdapter1.findViewById(0x7f060031);
//        
//        GameContent[9] = (TextView) GameAdapter2.findViewById(0x7f060009);
//        GameContent[10] = (TextView) GameAdapter2.findViewById(0x7f060018);
//        GameContent[11] = (TextView) GameAdapter2.findViewById(0x7f060027);
//        GameContent[12] = (TextView) GameAdapter2.findViewById(0x7f06000e);
//        GameContent[13] = (TextView) GameAdapter2.findViewById(0x7f06001d);
//        GameContent[14] = (TextView) GameAdapter2.findViewById(0x7f06002c);
//        GameContent[15] = (TextView) GameAdapter2.findViewById(0x7f060013);
//        for (int i = 0; i < 16; i++) {
//			Log.e(TAG, "GameContent"+i+"="+ GameContent[i].getText());
//		}
        //验证过程
    	boolean expected = true;
		boolean actual = solo.searchText("深海连连看") && solo.searchText("宝石连环战");
        assertEquals("深海连连看 或者 宝石连环战 找不到", expected, actual);
//        Log.e(TAG,  "GameName1="+ GameName[1].getText());
//        assertEquals("随身宠", GameName[0].getText());
//        String result = (String) GameName[0].getText();
//        assertTrue(result,result.contains("身"));
        

        
        
//        Game1.getAdapter().getCount();
//       Game1.getChildCount();
//        Log.e(TAG,  "count="+ Game1.getAdapter().getCount());
        //Log.e(TAG, GameListView.get(0).getTextFilter().toString());
        GameList.getContext().getDatabasePath("WyxDatabase");
        
        Log.e(TAG, GameList.getContext().getDatabasePath("WyxDatabase").toString());
		solo.sleep(1000);
//		Log.e(TAG, solo.getText("textGameName0").toString());
//		assertTrue(solo.getCurrentListViews().size() == 7);
		solo.sleep(5000);
	}

	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

}
