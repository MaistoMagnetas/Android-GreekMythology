package com.cactustree.pc.greek;

import android.content.Intent;
import android.media.Image;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class PressedActivity extends AppCompatActivity {

    ImageView pressedImage;
    TextView pressedDesc, pressedTitle;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressed);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        pressedImage = (ImageView) findViewById(R.id.pressedImage);
        pressedDesc = (TextView) findViewById(R.id.pressedDesc);
        pressedTitle = (TextView) findViewById(R.id.pressedTitle);
        pressedImage.setClipToOutline(true);

        Intent intent = getIntent();

        int title = intent.getIntExtra("title",5);
        String desc = intent.getStringExtra("description");
        int image  = intent.getIntExtra("image",R.drawable.background);

        pressedImage.setImageResource(image);
        pressedTitle.setText(title);
        pressedDesc.setText(desc);
    }
}
