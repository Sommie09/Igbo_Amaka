package com.example.igboamaka.quiz.family;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.igboamaka.R;
import com.example.igboamaka.quiz.numbers.NumberQuiz;
import com.example.igboamaka.quiz.numbers.NumberQuizAdapter;
import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class FamilyQuizAdapter extends RecyclerView.Adapter<FamilyQuizAdapter.ViewHolder> {

    List<FamilyQuiz> familyQuiz;
    private Context context;
    private ViewPager2 mViewPager2;

    public FamilyQuizAdapter(List<FamilyQuiz> familyQuiz, Context context, ViewPager2 viewPager2) {
        this.familyQuiz = familyQuiz;
        this.context = context;
        mViewPager2 = viewPager2;
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
        TextView questionCounter;
        TextView question;
        TextView option1, option2, option3, option4;
        MaterialCardView option1Colour, option2Colour, option3Colour, option4Colour;
        ImageView family_image1, family_image2, family_image3, family_image4;


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
