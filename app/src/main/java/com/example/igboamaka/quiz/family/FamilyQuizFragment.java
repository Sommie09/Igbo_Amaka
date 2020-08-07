package com.example.igboamaka.quiz.family;

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


public class FamilyQuizFragment extends Fragment {
    private ViewPager2 mViewPager2;
    MaterialButton nextButton, prevButton;
    private NumberQuizAdapter quizAdapter;



    public FamilyQuizFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_family_quiz, container, false);


        mViewPager2 = view.findViewById(R.id.family_pager);
        nextButton = view.findViewById(R.id.next_button_family);
        prevButton = view.findViewById(R.id.prev_button_family);


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


        final List<FamilyQuiz> familyQuiz = new ArrayList<>();

        familyQuiz.add(new FamilyQuiz(
                "Question 1/7",
                "My \"daughters\" went to school",
                Color.GREEN,
                Color.RED,
                Color.RED,
                Color.RED,
                "nwa nwanyị",
                "nnaochie",
                "nwanne nwanyị nke okenye",
                "nneochie",
                R.drawable.family_daughter,
                R.drawable.family_grandfather,
                R.drawable.family_younger_sister,
                R.drawable.family_grandmother));


        familyQuiz.add(new FamilyQuiz(
                "Question 2/7",
                "My husband left with my \"son\"",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "nne",
                "nna",
                "nwa nwanyị",
                "nwa nwoke",
                R.drawable.family_mother,
                R.drawable.family_father,
                R.drawable.family_daughter,
                R.drawable.family_son));


        familyQuiz.add(new FamilyQuiz(
                "Question 3/7",
                "I need to see my \"grandmother\".",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "nwa nwanyị",
                "nneochie",
                "nwa nwoke",
                "nne",
                R.drawable.family_daughter,
                R.drawable.family_grandmother,
                R.drawable.family_son,
                R.drawable.family_mother));

        familyQuiz.add(new FamilyQuiz(
                "Question 4/7",
                "My \"mother\" is a good woman",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "nna",
                "iri abụọ",
                "nwa nwanyi",
                "nne",
                R.drawable.family_father,
                R.drawable.family_grandmother,
                R.drawable.family_daughter,
                R.drawable.family_mother));

        familyQuiz.add(new FamilyQuiz(
                "Question 5/7",
                "My \"younger sister\" just came back",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "ise",
                "abụọ",
                "nneochie",
                "otu puku",
                R.drawable.family_son,
                R.drawable.family_younger_sister,
                R.drawable.family_younger_brother,
                R.drawable.family_father));

        familyQuiz.add(new FamilyQuiz(
                "Question 6/7",
                "My \"father\" works in the city",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "nwa nwanyi",
                "nna",
                "nwa nwoke",
                "nne",
                R.drawable.family_daughter,
                R.drawable.family_father,
                R.drawable.family_son,
                R.drawable.family_mother));

        familyQuiz.add(new FamilyQuiz(
                "Question 7/7",
                "My \"elder brother\" is in the university",
                Color.GREEN,
                Color.RED,
                Color.RED,
                Color.RED,
                "nwanne nwoke nke okenye",
                "new nwanyi",
                "nwanne nwanyị nke okenye",
                "nnaochie",
                R.drawable.family_younger_brother,
                R.drawable.family_daughter,
                R.drawable.family_younger_sister,
                R.drawable.family_grandfather));





        mViewPager2.setAdapter(new FamilyQuizAdapter(familyQuiz, getContext(), mViewPager2));
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
                if (position == familyQuiz.size() - 1) {
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
