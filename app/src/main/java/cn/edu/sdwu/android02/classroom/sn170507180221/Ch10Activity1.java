package cn.edu.sdwu.android02.classroom.sn170507180221;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Ch10Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch10_1);

        Log.i(Ch10Activity1.class.toString(),"onCreate");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Ch10Activity1.class.toString(),"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Ch10Activity1.class.toString(),"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Ch10Activity1.class.toString(),"onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Ch10Activity1.class.toString(),"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Ch10Activity1.class.toString(),"onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Ch10Activity1.class.toString(),"onRestart");
    }

}
