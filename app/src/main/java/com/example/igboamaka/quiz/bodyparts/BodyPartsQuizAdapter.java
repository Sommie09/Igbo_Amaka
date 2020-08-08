package com.example.igboamaka.quiz.bodyparts;

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

public class BodyPartsQuizAdapter  extends RecyclerView.Adapter<BodyPartsQuizAdapter.ViewHolder>{
    final List<BodyPartsQuiz> bodyPartsQuiz;
    private final Context context;

    public BodyPartsQuizAdapter(List<BodyPartsQuiz> bodyPartsQuiz, Context context, ViewPager2 viewPager2) {
        this.bodyPartsQuiz = bodyPartsQuiz;
        this.context = context;
    }

    @NonNull
    @Override
    public BodyPartsQuizAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.bodyparts_quiz_item_view, parent, false);
        return new BodyPartsQuizAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final BodyPartsQuizAdapter.ViewHolder holder, final int position) {
        holder.questionCounter.setText(bodyPartsQuiz.get(position).getQuestionCounter());
        holder.question.setText(bodyPartsQuiz.get(position).getQuestion());
        holder.option1.setText(bodyPartsQuiz.get(position).getOption1());
        holder.option2.setText(bodyPartsQuiz.get(position).getOption2());
        holder.option3.setText(bodyPartsQuiz.get(position).getOption3());
        holder.option4.setText(bodyPartsQuiz.get(position).getOption4());

        holder.option1Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option1Colour.setCardBackgroundColor(bodyPartsQuiz.get(position).getOption1Colour());
            }
        });

        holder.option2Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option2Colour.setCardBackgroundColor(bodyPartsQuiz.get(position).getOption2Colour());
            }
        });

        holder.option3Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option3Colour.setCardBackgroundColor(bodyPartsQuiz.get(position).getOption3Colour());
            }
        });

        holder.option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option4Colour.setCardBackgroundColor(bodyPartsQuiz.get(position).getOption4Colour());
            }
        });
    }


    @Override
    public int getItemCount() {
        return bodyPartsQuiz.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView questionCounter;
        final TextView question;
        final TextView option1;
        final TextView option2;
        final TextView option3;
        final TextView option4;
        final MaterialCardView option1Colour;
        final MaterialCardView option2Colour;
        final MaterialCardView option3Colour;
        final MaterialCardView option4Colour;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionCounter = itemView.findViewById(R.id.bodyparts_question_counter);
            question = itemView.findViewById(R.id.bodyparts_question);
            option1 = itemView.findViewById(R.id.bodyparts_option1Text);
            option2 = itemView.findViewById(R.id.bodyparts_option2Text);
            option3 = itemView.findViewById(R.id.bodyparts_option3Text);
            option4 = itemView.findViewById(R.id.bodyparts_option4Text);
            option1Colour = itemView.findViewById(R.id.bodyparts_option1);
            option2Colour = itemView.findViewById(R.id.bodyparts_option2);
            option3Colour = itemView.findViewById(R.id.bodyparts_option3);
            option4Colour = itemView.findViewById(R.id.bodyparts_option4);


        }



    }
}
