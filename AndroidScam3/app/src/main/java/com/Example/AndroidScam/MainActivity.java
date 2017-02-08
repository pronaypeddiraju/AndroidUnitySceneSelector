package com.Example.AndroidScam;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton1 (View view)
    {
        Intent i = new Intent(this, UnityPlayerActivity.class);

        String sceneName = "scene0";
        i.putExtra("sceneName", sceneName);
        startActivity(i);
    }

    public void onClickButton2 (View view)
    {
        Intent i = new Intent(this, UnityPlayerActivity.class);

        String sceneName = "scene1";
        i.putExtra("sceneName", sceneName);
        startActivity(i);
    }

}
