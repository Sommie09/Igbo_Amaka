package com.chisom.igboamaka.funfacts.dressing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.TextView;

import com.chisom.igboamaka.R;
import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

import java.util.ArrayList;
import java.util.List;

public class DressingActivity extends AppCompatActivity {
    HorizontalInfiniteCycleViewPager viewPager;
    List<Dressing> dressing;
    private TextView swipe_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dressing);


        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Igbo Dressing");


        setSupportActionBar(toolbar);


        dressing = new ArrayList<>();
        swipe_text = findViewById(R.id.swipe_text_dressing);

        initData();
        viewPager =  findViewById(R.id.dressing_view_pager);
        DressingAdapter adapter = new DressingAdapter(this, dressing);
        viewPager.setAdapter(adapter);

        manageBlinkEffect();
    }

    public void initData(){
        dressing.add(new Dressing(R.drawable.igbo_girl_marriage,
                "MARRIAGE ATTIRE",
                "Outfit for a maiden getting married"));

        dressing.add(new Dressing(R.drawable.igbo_man,
                "ISIAGU",
                "The Igbo men traditional attire is called Isiagu, also known as Chieftaincy."
        ));

        dressing.add(new Dressing(R.drawable.igbo_maiden,
                "MAIDEN WEAR",
                "Traditional attire of an Igbo maiden"));

    }


    private void manageBlinkEffect(){
        ObjectAnimator anim = ObjectAnimator.ofInt(swipe_text, "textColor",Color.parseColor("#471437"),
                Color.WHITE, Color.parseColor("#471437"));
        anim.setDuration(1500);
        anim.setEvaluator(new ArgbEvaluator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.start();


    }
}