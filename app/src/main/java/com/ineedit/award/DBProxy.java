package com.ineedit.award;

import android.content.Context;

import java.util.ArrayList;

/**
 * To get all data from here
 *
 * 玩家、每場資料
 *
 * DB
 *
 * GAME
 * game_no player round point
 *
 * Created by vince on 2017/7/19.
 */
public class DBProxy {

    private DBHelper dbHelper;

    public DBProxy(Context context) {
        this.dbHelper = new DBHelper(context);
        this.dbHelper.getWritableDatabase();
    }

    /**
     *
     * @param gameNo 指定遊戲編號
     * @return 當局的所有玩家列表
     */
    public ArrayList<String> getPlayerList(int gameNo) {

        return null;
    }


    public class Player {
        private String name;
        private int point;
    }
}
