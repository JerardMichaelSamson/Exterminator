package com.example.exterminator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Room1 extends AppCompatActivity {

    ImageView target1, target2, target3, target4, target5, target6, target7, target8, target9, target10, target11,
            target12, target13, target14, target15, target16, target17, target18, target19, target20, target21;

    TextView tv_life, tv_score, tv_Hp;

    Button button, back;

    Random r;

    int which = 0;
    int whichsave = 0;

    private hitsound sound;

    HomeWatcher mHomeWatcher;
    public Room1() {
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
        setContentView(R.layout.activity_room1);
    }
}
