package com.example.igboamaka.funfacts.dressing;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.igboamaka.R;

import java.util.List;

public class DressingAdapter extends PagerAdapter {
    final Context mContext;
    final List<Dressing> dressing;

    public DressingAdapter(Context context, List<Dressing> dressing) {
        mContext = context;
        this.dressing = dressing;
    }

    @Override
    public int getCount() {
        return dressing.size();
    }


    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.dressing_funfacts_item_view, container,false);

        ImageView dressing_image =  view.findViewById(R.id.dressing_image);
        TextView dressing_name =  view.findViewById(R.id.dressing_name);
        TextView dressing_description =  view.findViewById(R.id.dressing_description);

        dressing_image.setImageResource(dressing.get(position).getDressing_image());
        dressing_name.setText(dressing.get(position).getDressing_type());
        dressing_description.setText(dressing.get(position).getDressing_description());


        container.addView(view);

        return view;

    }




}
