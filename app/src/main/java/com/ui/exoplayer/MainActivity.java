package com.ui.exoplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Intent intent = new Intent(this, SimpleVideoStream.class);
        Bundle extras = new Bundle();
        extras.putString("title", "Big Buck Bunny");
        extras.putString("url", "https://www.w3schools.com/html/mov_bbb.mp4");
        extras.putString("sub", "https://pastebin.com/raw/A0fDHxgK");
        extras.putBoolean("subShow", true);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
