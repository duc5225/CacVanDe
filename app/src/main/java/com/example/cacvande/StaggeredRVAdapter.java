package com.example.cacvande;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cacvande.databinding.LayoutMainGridItemBinding;

import java.util.ArrayList;

public class StaggeredRVAdapter extends RecyclerView.Adapter<StaggeredRVAdapter.StaggeredVH>{
  Context mContext;
  private static final String TAG = "StaggeredRV";
  private ArrayList<Lesson> lessons;

  public StaggeredRVAdapter(ArrayList<Lesson> lessons){
    this.lessons = lessons;
  }

  @NonNull
  @Override
  public StaggeredVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    mContext = parent.getContext();
    return new StaggeredVH(LayoutMainGridItemBinding.inflate(LayoutInflater.from(mContext), parent, false));
  }

  @Override
  public void onBindViewHolder(@NonNull StaggeredVH holder, int position) {
    Lesson lesson = lessons.get(position);
    holder.binding.name.setText(lesson.getName()) ;
    holder.binding.image.setImageResource(lesson.getImage());
  }

  @Override
  public int getItemCount() {
    return lessons == null ? 0 : lessons.size();
  }

  public static class StaggeredVH extends RecyclerView.ViewHolder{

    LayoutMainGridItemBinding binding;
    public StaggeredVH(LayoutMainGridItemBinding binding) {
      super(binding.getRoot());
      this.binding = binding;
    }
  }
}
