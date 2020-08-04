package com.example.igboamaka.quiz.animals;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.igboamaka.R;
import com.example.igboamaka.quiz.QuizFragment;
import com.example.igboamaka.quiz.numbers.NumberQuiz;
import com.example.igboamaka.quiz.numbers.NumberQuizAdapter;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class AnimalQuizFragment extends Fragment {
    private ViewPager2 mViewPager2;
    MaterialButton nextButton, prevButton;
    private NumberQuizAdapter quizAdapter;


    public AnimalQuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View view = inflater.inflate(R.layout.fragment_animal_quiz, container, false);


            mViewPager2 = view.findViewById(R.id.animal_pager);
            nextButton = view.findViewById(R.id.next_button_animal);
            prevButton = view.findViewById(R.id.prev_button_animal);


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


            final List<AnimalsQuiz> animalsQuiz = new ArrayList<>();

        animalsQuiz.add(new AnimalsQuiz(
                    "Question 1/6",
                    R.drawable.cat_image,
                    Color.RED,
                    Color.RED,
                    Color.GREEN,
                    Color.RED,
                    "nkịta",
                    "Agwo",
                    "pusi",
                    "ọkụkọ"));


        animalsQuiz.add(new AnimalsQuiz(
                    "Question 2/6",
                R.drawable.chicken_image,
                    Color.RED,
                    Color.GREEN,
                    Color.RED,
                    Color.RED,
                    "enwe",
                    "ọkụkọ",
                    "Ehi",
                    "Nnụnụ"));


        animalsQuiz.add(new AnimalsQuiz(
                    "Question 3/6",
                R.drawable.cow_image,
                    Color.RED,
                    Color.GREEN,
                    Color.RED,
                    Color.RED,
                    "enwe",
                    "Ehi",
                    "Nnụnụ",
                    "Osa"));

        animalsQuiz.add(new AnimalsQuiz(
                    "Question 4/6",
                R.drawable.squirrel,
                    Color.RED,
                    Color.RED,
                    Color.RED,
                    Color.GREEN,
                    "pusi",
                    "mkpi",
                    "Nnụnụ",
                    "Osa"));

        animalsQuiz.add(new AnimalsQuiz(
                    "Question 5/6",
                R.drawable.bird_image,
                    Color.RED,
                    Color.GREEN,
                    Color.RED,
                    Color.RED,
                    "nkịta",
                    "Nnụnụ",
                    "enwe",
                    "Agwo"));

        animalsQuiz.add(new AnimalsQuiz(
                    "Question 6/6",
                R.drawable.dog_image,
                    Color.RED,
                    Color.GREEN,
                    Color.RED,
                    Color.RED,
                    "enwe",
                    "nkịta",
                    "mkpi",
                    "ọkụkọ"));





            mViewPager2.setAdapter(new AnimalQuizAdapter(animalsQuiz, getContext(), mViewPager2));
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
                    if (position == animalsQuiz.size() - 1) {
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