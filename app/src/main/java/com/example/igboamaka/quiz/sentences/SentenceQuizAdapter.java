package com.example.igboamaka.quiz.sentences;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class SentenceQuizAdapter extends RecyclerView.Adapter<SentenceQuizAdapter.ViewHolder> {
    List<SentencesQuiz> sentenceQuiz;
    private Context context;
    private ViewPager2 mViewPager2;

    public SentenceQuizAdapter(List<SentencesQuiz> sentenceQuiz, Context context, ViewPager2 viewPager2) {
        this.sentenceQuiz = sentenceQuiz;
        this.context = context;
        mViewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public SentenceQuizAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sentence_quiz_item_view, parent, false);
        return new SentenceQuizAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final SentenceQuizAdapter.ViewHolder holder, final int position) {
        holder.questionCounter.setText(sentenceQuiz.get(position).getQuestionCounter());
        holder.question.setText(sentenceQuiz.get(position).getQuestion());
        holder.option1.setText(sentenceQuiz.get(position).getOption1());
        holder.option2.setText(sentenceQuiz.get(position).getOption2());
        holder.option3.setText(sentenceQuiz.get(position).getOption3());
        holder.option4.setText(sentenceQuiz.get(position).getOption4());

        holder.option1Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option1Colour.setCardBackgroundColor(sentenceQuiz.get(position).getOption1Colour());
            }
        });

        holder.option2Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option2Colour.setCardBackgroundColor(sentenceQuiz.get(position).getOption2Colour());
            }
        });

        holder.option3Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option3Colour.setCardBackgroundColor(sentenceQuiz.get(position).getOption3Colour());
            }
        });

        holder.option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option4Colour.setCardBackgroundColor(sentenceQuiz.get(position).getOption4Colour());
            }
        });
    }


    @Override
    public int getItemCount() {
        return sentenceQuiz.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView questionCounter;
        TextView question;
        TextView option1, option2, option3, option4;
        MaterialCardView option1Colour, option2Colour, option3Colour, option4Colour;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionCounter = itemView.findViewById(R.id.family_question_counter);
            question = itemView.findViewById(R.id.family_question);
            option1 = itemView.findViewById(R.id.sentence_option1Text);
            option2 = itemView.findViewById(R.id.sentence_option2Text);
            option3 = itemView.findViewById(R.id.sentence_option3Text);
            option4 = itemView.findViewById(R.id.sentence_option4Text);
            option1Colour = itemView.findViewById(R.id.sentence_option1);
            option2Colour = itemView.findViewById(R.id.sentence_option2);
            option3Colour = itemView.findViewById(R.id.sentence_option3);
            option4Colour = itemView.findViewById(R.id.sentence_option4);


        }



    }

}
