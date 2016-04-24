package com.medctrl.mdteam.medctrl.activities;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.medctrl.mdteam.medctrl.R;

public class AlarmActivity extends AppCompatActivity {

    ImageView rightbutton = null;
    AnimationDrawable rightButtonAnimation = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        rightbutton = (ImageView) findViewById(R.id.rightButton);
        rightbutton.setBackgroundResource(R.drawable.button_animation);
        rightButtonAnimation = (AnimationDrawable) rightbutton.getBackground();

        double dose = 0.5;
        setDosageGraphic(dose);

    }

    private void setDosageGraphic(double v) {
        LinearLayout dosageLayout = (LinearLayout) findViewById(R.id.dosageLayout);
        int numberOfImages = (int) Math.floor(v);

        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 100, getResources().getDisplayMetrics());

        for(int i = 0; i < numberOfImages; i++){
            ImageView image =  new ImageView(this);
            image.setLayoutParams(new android.view.ViewGroup.LayoutParams(px,px));
            image.setAdjustViewBounds(true);
            image.setImageResource(R.drawable.p100);
            dosageLayout.addView(image);
        }

        ImageView image =  new ImageView(this);
        image.setLayoutParams(new android.view.ViewGroup.LayoutParams(px,px));
        image.setAdjustViewBounds(true);
        int lastDose = (int) ((v - numberOfImages)*100);
        Log.d("LastDose ", (new Integer(lastDose)).toString());
        switch(lastDose){
            case 25:
                image.setImageResource(R.drawable.p25);
                break;
            case 50:
                image.setImageResource(R.drawable.p50);
                break;
            case 75:
                image.setImageResource(R.drawable.p75);
                break;
            default:
                return;
        }

        dosageLayout.addView(image);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        rightButtonAnimation.start();
    }


}
