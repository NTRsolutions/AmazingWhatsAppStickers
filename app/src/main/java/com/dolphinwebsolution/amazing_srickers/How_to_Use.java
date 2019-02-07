package com.dolphinwebsolution.amazing_srickers;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;

import java.util.ArrayList;

public class How_to_Use extends AppIntro {

    @Override
    public void init(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        //adding the three slides for introduction app you can ad as many you needed
         addSlide(AppIntroSampleSlider.newInstance(R.layout.howtouseifist));
         addSlide(AppIntroSampleSlider.newInstance(R.layout.howtousesecond));
         addSlide(AppIntroSampleSlider.newInstance(R.layout.howtousetherd));
         addSlide(AppIntroSampleSlider.newInstance(R.layout.howtouseforth));
         addSlide(AppIntroSampleSlider.newInstance(R.layout.howtousefive));

        // Show and Hide Skip and Done buttons
        showStatusBar(false);
        showSkipButton(false);

        //fist_sefrefn.setfist(MyIntro.this,"first");

        // Override bar/separator color.
        setBarColor(getResources().getColor(R.color.colorPrimary));
        setSeparatorColor(getResources().getColor(R.color.colorPrimary));

        // Hide Skip/Done button.

        //Add animation to the intro slider
        setDepthAnimation();

    }



    @Override
    public void onSkipPressed() {
        // Do something here when users click or tap on Skip button.
        /*Toast.makeText(getApplicationContext(),
                getString(R.string.app_intro_skip), Toast.LENGTH_SHORT).show();*/
       /* Intent intent = new Intent(this, StickerPackListActivity.class);
        intent.putParcelableArrayListExtra(StickerPackListActivity.EXTRA_STICKER_PACK_LIST_DATA, stickerPackList);
        startActivity(intent);
        finish();*/
    }

    @Override
    public void onNextPressed() {
        // Do something here when users click or tap on Next button.
    }

    @Override
    public void onDonePressed() {
        // Do something here when users click or tap tap on Done button.
        Log.e("ssss",""+StickerPackListActivity.stickerPackList);
        Intent i = new Intent(this, StickerPackListActivity.class);

        i.putParcelableArrayListExtra(StickerPackListActivity.EXTRA_STICKER_PACK_LIST_DATA, StickerPackListActivity.stickerPackList);
        startActivity(i);
        finish();
    }

    @Override
    public void onSlideChanged() {
        // Do something here when slide is changed
    }
}
