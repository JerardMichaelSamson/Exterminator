package com.example.exterminator;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public class GlobalVar {
    //MainActivity
    public static HomeWatcher mHomeWatcher;
    public static int  re = getRest();
    public static int mc = 0;
    public static int l = getClife();
    public static int h = getHealth();
    public static int x = 0;
    public static int getX(){return x;}
    public static int getmc(){return mc;}
    public static boolean restart = false;
    public static boolean unfreeze = false;
    public static boolean getunfreeze(){return unfreeze;}
    public static boolean getrestart(){return restart;}

    //Room1
    public static int Hp = 1;
    public static boolean freeze;
    public static boolean rest = false;
    public static boolean getrest(){return rest; }
    public static int life = 10;
    public static int score;
    public static int getHp(){return 1; }
    public static boolean getfreeze(){
        return freeze;
    }
    public static int getlife() {
        return life;
    }
    public static int getscore(){
        return score;
    }
}
