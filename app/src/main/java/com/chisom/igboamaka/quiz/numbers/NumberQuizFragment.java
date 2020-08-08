package com.chisom.igboamaka.quiz.numbers;

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

import com.chisom.igboamaka.R;
import com.chisom.igboamaka.quiz.QuizFragment;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")
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
        nextButton = view.findViewById(R.id.next_button_number);
        prevButton = view.findViewById(R.id.prev_button_number);


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
                "My neighbour just won a \"thousand\" dollars",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "nari anọ",
                "otu puku",
                "otu nnari",
                "otu ijeri"));


        numberQuiz.add(new NumberQuiz(
                "Question 3/10",
                "I have \"four\" siblings",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "ise",
                "anọ",
                "ise",
                "asato"));

        numberQuiz.add(new NumberQuiz(
                "Question 4/10",
                "I bought \"fourteen\" bags of rice",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "iri na atọ",
                "iri abụọ",
                "iri atọ",
                "iri na anọ"));

        numberQuiz.add(new NumberQuiz(
                "Question 5/10",
                "I just took \"two\" gallons \nof palm wine",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "ise",
                "abụọ",
                "iri na itoolu",
                "otu puku"));

        numberQuiz.add(new NumberQuiz(
                "Question 6/10",
                "There are \"thirty\" days in September",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "iri abụọ na otu",
                "iri atọ",
                "iri abụọ na itoolu",
                "iri na otu"));

        numberQuiz.add(new NumberQuiz(
                "Question 7/10",
                "I am \"twenty-seven\" \nyears old",
                Color.GREEN,
                Color.RED,
                Color.RED,
                Color.RED,
                "iri abụọ na asaa",
                "iri abụọ na atọ",
                "nari atọ",
                "otu puku"));

        numberQuiz.add(new NumberQuiz(
                "Question 8/10",
                "I was able to make \"100,000\" today",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "otu nde",
                "otu nnari",
                "nari asato",
                "iri abụọ na asaa"));

        numberQuiz.add(new NumberQuiz(
                "Question 9/10",
                "My second daughter is \"9\" years old",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "otu nnari",
                "nari  asaa",
                "ise",
                "itoolu"));

        numberQuiz.add(new NumberQuiz(
                "Question 10/10",
                "I have just \"300\" \nnaira left",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "otu nnari",
                "nari atọ",
                "iri atọ",
                "iri na asaa"));


        mViewPager2.setAdapter(new NumberQuizAdapter(numberQuiz, getContext()));
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
                            FragmentManager fragmentManager = Objects.requireNonNull(getActivity()).getSupportFragmentManager();
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
