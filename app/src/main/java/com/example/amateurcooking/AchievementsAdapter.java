// Achievements Adapter
// Stores and displays user created notes
// INFS3634 2020 T1 - Group 13
// 26-04-2020

// Adapted using Jetpack RecyclerView from Android Developers
// https://developer.android.com/guide/topics/ui/layout/recyclerview?hl=en



package com.example.amateurcooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AchievementsAdapter extends RecyclerView.Adapter<AchievementsAdapter.AchievementsViewHolder> {

    Context mContext;
    List<AchievementsItem> mData;

    public AchievementsAdapter(Context mContext, List<AchievementsItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public AchievementsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout;
        layout = LayoutInflater.from(mContext).inflate(R.layout.item_achievements, viewGroup, false);
        return new AchievementsViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull AchievementsViewHolder AchievementsViewHolder, int position) {
        //bind data here
        AchievementsViewHolder.tv_title.setText(mData.get(position).getTitle());
        AchievementsViewHolder.tv_content.setText(mData.get(position).getContent());
        AchievementsViewHolder.tv_date.setText(mData.get(position).getDate());
        AchievementsViewHolder.symbol.setImageResource(mData.get(position).getAchievementPhoto());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public class AchievementsViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title, tv_content, tv_date;
        ImageView symbol;

        public AchievementsViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_content = itemView.findViewById(R.id.tv_description);
            tv_date = itemView.findViewById(R.id.tv_date);
            symbol = itemView.findViewById(R.id.symbol);
        }
    }

}
