package com.chisom.igboamaka.quiz.family;

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

public class FamilyQuizAdapter extends RecyclerView.Adapter<FamilyQuizAdapter.ViewHolder> {

    final List<FamilyQuiz> familyQuiz;
    private final Context context;

    public FamilyQuizAdapter(List<FamilyQuiz> familyQuiz, Context context) {
        this.familyQuiz = familyQuiz;
        this.context = context;
    }

    @NonNull
    @Override
    public FamilyQuizAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.family_quiz_item_view, parent, false);
        return new FamilyQuizAdapter.ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull final FamilyQuizAdapter.ViewHolder holder, final int position) {
        holder.questionCounter.setText(familyQuiz.get(position).getQuestionCounter());
        holder.question.setText(familyQuiz.get(position).getQuestion());
        holder.option1.setText(familyQuiz.get(position).getOption1());
        holder.option2.setText(familyQuiz.get(position).getOption2());
        holder.option3.setText(familyQuiz.get(position).getOption3());
        holder.option4.setText(familyQuiz.get(position).getOption4());
        holder.family_image1.setImageResource(familyQuiz.get(position).getFamilyImage1());
        holder.family_image2.setImageResource(familyQuiz.get(position).getFamilyImage2());
        holder.family_image3.setImageResource(familyQuiz.get(position).getFamilyImage3());
        holder.family_image4.setImageResource(familyQuiz.get(position).getFamilyImage4());

        holder.option1Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option1Colour.setCardBackgroundColor(familyQuiz.get(position).getOption1Colour());
            }
        });

        holder.option2Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option2Colour.setCardBackgroundColor(familyQuiz.get(position).getOption2Colour());
            }
        });

        holder.option3Colour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option3Colour.setCardBackgroundColor(familyQuiz.get(position).getOption3Colour());
            }
        });

        holder.option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option4Colour.setCardBackgroundColor(familyQuiz.get(position).getOption4Colour());
            }
        });
    }


    @Override
    public int getItemCount() {
        return familyQuiz.size();
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
        final ImageView family_image1;
        final ImageView family_image2;
        final ImageView family_image3;
        final ImageView family_image4;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionCounter = itemView.findViewById(R.id.family_question_counter);
            question = itemView.findViewById(R.id.family_question);
            option1 = itemView.findViewById(R.id.family_option1Text);
            option2 = itemView.findViewById(R.id.family_option2Text);
            option3 = itemView.findViewById(R.id.family_option3Text);
            option4 = itemView.findViewById(R.id.family_option4Text);
            option1Colour = itemView.findViewById(R.id.family_option1);
            option2Colour = itemView.findViewById(R.id.family_option2);
            option3Colour = itemView.findViewById(R.id.family_option3);
            option4Colour = itemView.findViewById(R.id.family_option4);
            family_image1 = itemView.findViewById(R.id.family_image_option1);
            family_image2 = itemView.findViewById(R.id.family_image_option2);
            family_image3 = itemView.findViewById(R.id.family_image_option3);
            family_image4 = itemView.findViewById(R.id.family_image_option4);



        }



    }
}
