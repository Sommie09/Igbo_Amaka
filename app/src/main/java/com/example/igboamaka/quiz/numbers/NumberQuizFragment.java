package com.example.igboamaka.quiz.numbers;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.example.igboamaka.R;
import com.example.igboamaka.quiz.QuizFragment;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class NumberQuizFragment extends Fragment {
    private ViewPager2 mViewPager2;
    MaterialButton nextButton, prevButton;
    private NumberQuizAdapter quizAdapter;

    public NumberQuizFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number_quiz, container, false);


        mViewPager2 = view.findViewById(R.id.number_pager);
        nextButton = view.findViewById(R.id.next_button);
        prevButton = view.findViewById(R.id.prev_button);


        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager2.setCurrentItem(getItem(+1), true);
            }
        });

        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewPager2.setCurrentItem(getItem(-1), true);
            }
        });


        final List<NumberQuiz> numberQuiz = new ArrayList<>();

        numberQuiz.add(new NumberQuiz(
                "Question 1/10",
                "I have \"five\" fingers",
                Color.GREEN,
                Color.RED,
                Color.RED,
                Color.RED,
                "ise",
                "abụọ",
                "isii",
                "asato"));


        numberQuiz.add(new NumberQuiz(
                "Question 2/10",
                "My neighbour just won a \"million\' naira",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "Chisom",
                "Chinenye",
                "Chinaza",
                "Nwokwu"));


        numberQuiz.add(new NumberQuiz(
                "Question 3/10",
                "My name is Chisom",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "Chisom",
                "Chinenye",
                "Chinaza",
                "Nwokwu"));


        mViewPager2.setAdapter(new NumberQuizAdapter(numberQuiz, getContext(), mViewPager2));
        mViewPager2.setClipToPadding(false);
        mViewPager2.setClipChildren(false);
        mViewPager2.setOffscreenPageLimit(3);
        mViewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);


        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.85f + r * 0.15f);
            }
        });

        mViewPager2.setPageTransformer(compositePageTransformer);
        mViewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position == numberQuiz.size() - 1) {
                    nextButton.setBackgroundColor(Color.parseColor("#FF9249"));
                    nextButton.setText("FINISH");
                    prevButton.setVisibility(View.INVISIBLE);
                    nextButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Fragment fragment = new QuizFragment();
                            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, fragment);
                            fragmentTransaction.addToBackStack(null);
                            fragmentTransaction.commit();
                        }
                    });
                }

            }
        });


        return view;
    }

    private int getItem(int i) {
        return mViewPager2.getCurrentItem() + i;
    }

}
