package com.example.exterminator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.exterminator.GlobalVar.l;
import static com.example.exterminator.GlobalVar.mHomeWatcher;
import static com.example.exterminator.GlobalVar.mc;
import static com.example.exterminator.GlobalVar.unfreeze;

public class MainActivity extends AppCompatActivity {
    public MainActivity() {
        Scon = new ServiceConnection(){

            public void onServiceConnected(ComponentName name, IBinder
                    binder) {
                mServ = ((MusicService.ServiceBinder)binder).getService();
            }

            public void onServiceDisconnected(ComponentName name) {
                mServ = null;
            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showSystemUI();
        doBindService();
        Intent music = new Intent();
        music.setClass(this, MusicService.class);
        startService(music);
        mHomeWatcher = new HomeWatcher(this);
        mHomeWatcher.setOnHomePressedListener(new HomeWatcher.OnHomePressedListener() {
            @Override
            public void onHomePressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
            @Override
            public void onHomeLongPressed() {
                if (mServ != null) {
                    mServ.pauseMusic();
                }
            }
        });
        mHomeWatcher.startWatch();


        final Button start = (Button)findViewById(R.id.button1);
        Button highscore = (Button)findViewById(R.id.button2);
        Button about = (Button)findViewById(R.id.button3);
        Button Continue = (Button)findViewById(R.id.button20);
        TextView title = (TextView)findViewById(R.id.title);
        Typeface font = Typeface.createFromAsset(getAssets(), "chocolate bar demo.otf");
        start.setTypeface(font);
        highscore.setTypeface(font);
        about.setTypeface(font);
        Continue.setTypeface(font);
        title.setTypeface(font);

        unfreeze = getFstat();
        mc = getc();

        if (unfreeze && l > 0){
            Continue.setVisibility(View.VISIBLE);
            Continue.setEnabled(true);
        }else {
            Continue.setVisibility(View.INVISIBLE);
            Continue.setEnabled(false);
        }

        Button buttonStart = (Button) findViewById(R.id.button1);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mc = 0;
                Room1.life = 10;
                Room1.score = 0;
                Room1.freeze = true;
                Intent intent = new Intent(getApplicationContext(), Room1.class);
                finish();
                startActivity(intent);
            }

        });

        Button buttonShop = (Button) findViewById(R.id.button2);
        buttonShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Highscore.class);
                startActivity(intent);
                finish();
            }

        });

        Button buttonOption = (Button) findViewById(R.id.button3);
        buttonOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), About.class);
                startActivity(intent);
                finish();
            }

        });

        Button buttonContinue = (Button) findViewById(R.id.button20);
        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mc = 1;
                Room1.Hp = h;
                Room2.Hp = h;
                Roo

            m3.Hp = h;
                Room4.Hp = h;
                Room5.Hp = h;
                Room6.Hp = h;
                Room7.Hp = h;
                Room8.Hp = h;
                Room9.Hp = h;
                Room10.Hp = h;
                Room11.Hp = h;
                Room12.Hp = h;
                Room13.Hp = h;
                Room14.Hp = h;
                Room15.Hp = h;
                Room16.Hp = h;
                if (Room16.getscore15() > Room15.getscore14()){
                    Intent intent = new Intent(MainActivity.this, Room16.class);
                    startActivity(intent);
                }else if (Room15.getscore14() > Room14.getscore13()){
                    Intent intent = new Intent(MainActivity.this, Room15.class);
                    startActivity(intent);
                }else if (Room14.getscore13() > Room13.getscore12()){
                    Intent intent = new Intent(MainActivity.this, Room14.class);
                    startActivity(intent);
                }else if (Room13.getscore12() > Room12.getscore11()){
                    Intent intent = new Intent(MainActivity.this, Room13.class);
                    startActivity(intent);
                }else if (Room12.getscore11() > Room11.getscore10()){
                    Intent intent = new Intent(MainActivity.this, Room12.class);
                    startActivity(intent);
                }else if (Room11.getscore10() > Room10.getscore9()){
                    Intent intent = new Intent(MainActivity.this, Room11.class);
                    startActivity(intent);
                }else if (Room10.getscore9() > Room9.getscore8()){
                    Intent intent = new Intent(MainActivity.this, Room10.class);
                    startActivity(intent);
                }else if (Room9.getscore8() > Room8.getscore7()){
                    Intent intent = new Intent(MainActivity.this, Room9.class);
                    startActivity(intent);
                }else if (Room8.getscore7() > Room7.getscore6()){
                    Intent intent = new Intent(MainActivity.this, Room8.class);
                    startActivity(intent);
                }else if (Room7.getscore6() > Room6.getscore5()){
                    Intent intent = new Intent(MainActivity.this, Room7.class);
                    startActivity(intent);
                }else if (Room6.getscore5() > Room5.getscore4()){
                    Intent intent = new Intent(MainActivity.this, Room6.class);
                    startActivity(intent);
                }else if (Room5.getscore4() > Room5.getscore4()){
                    Intent intent = new Intent(MainActivity.this, Room5.class);
                    startActivity(intent);
                }else if (Room4.getscore3() > Room3.getscore2()){
                    Intent intent = new Intent(MainActivity.this, Room4.class);
                    startActivity(intent);
                }else if (Room3.getscore2() > Room2.getscore1()){
                    Intent intent = new Intent(MainActivity.this, Room3.class);
                    startActivity(intent);
                } else if (Room2.getscore1() > Room1.getscore()){
                    Intent intent = new Intent(MainActivity.this, Room2.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(MainActivity.this, Room1.class);
                    startActivity(intent);
                }
                unfreeze = false;
                finish();
            }
        });


        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);

    }

    private boolean mIsBound = false;
    private MusicService mServ;
    private ServiceConnection Scon;

    void doBindService(){
        bindService(new Intent(this,MusicService.class),
                Scon, Context.BIND_AUTO_CREATE);
        mIsBound = true;
    }

    void doUnbindService()
    {
        if(mIsBound)
        {
            unbindService(Scon);
            mIsBound = false;
        }
    }
    @Override
    protected void onResume() {
        super.onResume();

        if (mServ != null) {
            mServ.resumeMusic();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        doUnbindService();
        Intent music = new Intent();
        music.setClass(this,MusicService.class);
        stopService(music);

    }

    @Override
    protected void onPause() {
        super.onPause();

        PowerManager pm = (PowerManager)
                getSystemService(Context.POWER_SERVICE);
        boolean isScreenOn = false;
        if (pm != null) {
            isScreenOn = pm.isScreenOn();
        }

        if (!isScreenOn) {
            if (mServ != null) {
                mServ.pauseMusic();
            }
        }

    }

    @Override
    public void onBackPressed() {
        {
            Log.e("My Tags", "onBackPressed");
            GlobalVar.x++;
            if(GlobalVar.x == 1)
            {
                Toast.makeText(MainActivity.this, "Please press again to exit game \n WARNING: Progress wont be save." , Toast.LENGTH_SHORT).show();
            }
            else
            {
                GlobalVar.x = 0;
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        }
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBoolean("MyBoolean", false);
        savedInstanceState.putInt("MyInt", 0);
    }
}
