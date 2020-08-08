package com.chisom.igboamaka.quiz.sentences;

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
import com.chisom.igboamaka.quiz.numbers.NumberQuizAdapter;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SuppressWarnings({"ALL", "unused"})
public class SentenceQuizFragment extends Fragment {
    private ViewPager2 mViewPager2;
    MaterialButton nextButton, prevButton;
    private NumberQuizAdapter quizAdapter;

    public SentenceQuizFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_sentence_quiz, container, false);

        mViewPager2 = view.findViewById(R.id.sentences_pager);
        nextButton = view.findViewById(R.id.next_button_sentence);
        prevButton = view.findViewById(R.id.prev_button_sentence);


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


        final List<SentencesQuiz> sentencesQuiz = new ArrayList<>();

        sentencesQuiz.add(new SentencesQuiz(
                "Question 1/10",
                "Gịnị bu aha gị?",
                Color.GREEN,
                Color.RED,
                Color.RED,
                Color.RED,
                "What is your name?",
                "What is her name?",
                "My name is Chisom",
                "His name is John"));


        sentencesQuiz.add(new SentencesQuiz(
                "Question 2/10",
                "They are doing fine",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "Kedu di mma",
                "Di mma",
                "Amaghị m",
                "Ha dị mma"));


        sentencesQuiz.add(new SentencesQuiz(
                "Question 3/10",
                "I am from Anambra",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "ha sitere na Anambra",
                "A bu m onye Anambra",
                "o site na anambra",
                "nne ya si Anambra"));

        sentencesQuiz.add(new SentencesQuiz(
                "Question 4/10",
                "I remember",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "enweghị m ike icheta",
                "Amaghị m",
                "enwere m ike ịbịa",
                "Echetara m"));

        sentencesQuiz.add(new SentencesQuiz(
                "Question 5/10",
                "Ị mara mma nwanyị",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "I see beauty",
                "You are pretty",
                "He is handsome",
                "You are ugly"));

        sentencesQuiz.add(new SentencesQuiz(
                "Question 6/10",
                "Kedu onye bụ nke a?",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "It is me",
                "Who is this?",
                "Who are they?",
                "How are they?"));

        sentencesQuiz.add(new SentencesQuiz(
                "Question 7/10",
                "I love you",
                Color.GREEN,
                Color.RED,
                Color.RED,
                Color.RED,
                "a hụrụ m gị n'anya",
                "cheretu",
                "biko",
                "Mgbede ọma"));

        sentencesQuiz.add(new SentencesQuiz(
                "Question 8/10",
                "Where are you from?",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "ebe o si",
                "Ị bu onye ebe?",
                "ebee ka ha si",
                "iri abụọ na asaa"));

        sentencesQuiz.add(new SentencesQuiz(
                "Question 9/10",
                "See you tomorrow",
                Color.RED,
                Color.RED,
                Color.RED,
                Color.GREEN,
                "Ekene",
                "Ụtụtụ ọma",
                "Ka emesia",
                "Ka o di echi"));

        sentencesQuiz.add(new SentencesQuiz(
                "Question 10/10",
                "Welcome",
                Color.RED,
                Color.GREEN,
                Color.RED,
                Color.RED,
                "Ije ọma",
                "Nnọọ",
                "chere",
                "Bia rie nri"));


        mViewPager2.setAdapter(new SentenceQuizAdapter(sentencesQuiz, getContext()));
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
                if (position == sentencesQuiz.size() - 1) {
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