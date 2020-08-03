package com.example.igboamaka.quiz.numbers;

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

public class NumberQuizAdapter extends RecyclerView.Adapter<NumberQuizAdapter.ViewHolder> {
    List<NumberQuiz> numberQuiz;
    private Context context;
    private ViewPager2 mViewPager2;

    public NumberQuizAdapter(List<NumberQuiz> numberQuiz, Context context, ViewPager2 viewPager2) {
        this.numberQuiz = numberQuiz;
        this.context = context;
        mViewPager2 = viewPager2;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.number_quiz_item_view, parent, false);
        return new NumberQuizAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        holder.questionCounter.setText(numberQuiz.get(position).getQuestionCounter());
        holder.question.setText(numberQuiz.get(position).getQuestion());
        holder.option1.setText(numberQuiz.get(position).getOption1());
        holder.option2.setText(numberQuiz.get(position).getOption2());
        holder.option3.setText(numberQuiz.get(position).getOption3());
        holder.option4.setText(numberQuiz.get(position).getOption4());

        holder.option1Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option1Colour.setCardBackgroundColor(numberQuiz.get(position).getOption1Colour());
            }
        });

        holder.option2Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option2Colour.setCardBackgroundColor(numberQuiz.get(position).getOption2Colour());
            }
        });

        holder.option3Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option3Colour.setCardBackgroundColor(numberQuiz.get(position).getOption3Colour());
            }
        });

        holder.option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option4Colour.setCardBackgroundColor(numberQuiz.get(position).getOption4Colour());
            }
        });
    }


    @Override
    public int getItemCount() {
        return numberQuiz.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView questionCounter;
        TextView question;
        TextView option1, option2, option3, option4;
        MaterialCardView option1Colour, option2Colour, option3Colour, option4Colour;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionCounter = itemView.findViewById(R.id.colour_question_counter);
            question = itemView.findViewById(R.id.colour_question);
            option1 = itemView.findViewById(R.id.numbers_option1Text);
            option2 = itemView.findViewById(R.id.numbers_option2Text);
            option3 = itemView.findViewById(R.id.numbers_option3Text);
            option4 = itemView.findViewById(R.id.numbers_option4Text);
            option1Colour = itemView.findViewById(R.id.numbers_option1);
            option2Colour = itemView.findViewById(R.id.numbers_option2);
            option3Colour = itemView.findViewById(R.id.numbers_option3);
            option4Colour = itemView.findViewById(R.id.numbers_option4);


        }



    }


}
