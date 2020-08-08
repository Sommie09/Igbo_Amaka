package com.chisom.igboamaka.quiz.animals;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chisom.igboamaka.R;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class AnimalQuizAdapter extends RecyclerView.Adapter<AnimalQuizAdapter.ViewHolder> {
    final List<AnimalsQuiz> animalQuiz;
    private final Context context;

    public AnimalQuizAdapter(List<AnimalsQuiz> animalQuiz, Context context) {
        this.animalQuiz = animalQuiz;
        this.context = context;
    }

    @NonNull
    @Override
    public AnimalQuizAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.animal_quiz_item_view, parent, false);
        return new AnimalQuizAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final AnimalQuizAdapter.ViewHolder holder, final int position) {
        holder.questionCounter.setText(animalQuiz.get(position).getQuestionCounter());
        holder.question.setImageResource(animalQuiz.get(position).getQuestionImage());
        holder.option1.setText(animalQuiz.get(position).getOption1());
        holder.option2.setText(animalQuiz.get(position).getOption2());
        holder.option3.setText(animalQuiz.get(position).getOption3());
        holder.option4.setText(animalQuiz.get(position).getOption4());

        holder.option1Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option1Colour.setCardBackgroundColor(animalQuiz.get(position).getOption1Colour());
            }
        });

        holder.option2Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option2Colour.setCardBackgroundColor(animalQuiz.get(position).getOption2Colour());
            }
        });

        holder.option3Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option3Colour.setCardBackgroundColor(animalQuiz.get(position).getOption3Colour());
            }
        });

        holder.option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option4Colour.setCardBackgroundColor(animalQuiz.get(position).getOption4Colour());
            }
        });
    }


    @Override
    public int getItemCount() {
        return animalQuiz.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView questionCounter;
        final ImageView question;
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
            questionCounter = itemView.findViewById(R.id.animal_question_counter);
            question = itemView.findViewById(R.id.animal_question);
            option1 = itemView.findViewById(R.id.animal_option1Text);
            option2 = itemView.findViewById(R.id.animal_option2Text);
            option3 = itemView.findViewById(R.id.animal_option3Text);
            option4 = itemView.findViewById(R.id.animal_option4Text);
            option1Colour = itemView.findViewById(R.id.animal_option1);
            option2Colour = itemView.findViewById(R.id.animal_option2);
            option3Colour = itemView.findViewById(R.id.animal_option3);
            option4Colour = itemView.findViewById(R.id.animal_option4);


        }



    }
}
