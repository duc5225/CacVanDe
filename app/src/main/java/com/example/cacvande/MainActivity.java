package com.example.cacvande;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.cacvande.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  ActivityMainBinding binding;
  public static final int NUM_COLUMNS = 2;

  private ArrayList<Lesson> lessons = new ArrayList<>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityMainBinding.inflate(getLayoutInflater());
    View view = binding.getRoot();
    setContentView(view);

    initLessons();
  }


  private void initLessons(){
    lessons.add(new Lesson("Bài 1: Họa tiết hình kỷ hà", R.drawable.hinhkyha));
    lessons.add(new Lesson("Bài 2: Họa tiết chữ", R.drawable.hoatietchu));
    lessons.add(new Lesson("Bài 3: Họa tiết hình tĩnh vật", R.drawable.hinhtinhvat));
    lessons.add(new Lesson("Bài 4: Họa tiết hoa, lá - dây lá và quả", R.drawable.hoala));
    lessons.add(new Lesson("Bài 5: Họa tiết hình thú – con rồng", R.drawable.conrong));
    lessons.add(new Lesson("6. Bài 6", R.mipmap.ic_launcher));
    lessons.add(new Lesson("7. Bài 7", R.mipmap.ic_launcher));
    lessons.add(new Lesson("8. Bài 8", R.mipmap.ic_launcher));
    lessons.add(new Lesson("9. Bài 9", R.mipmap.ic_launcher));
    lessons.add(new Lesson("10. Bài 10", R.mipmap.ic_launcher));

    initRecyclerView();
  }

  private void initRecyclerView(){
    StaggeredRVAdapter staggeredRVAdapter = new StaggeredRVAdapter(lessons);
    StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(NUM_COLUMNS, LinearLayoutManager.VERTICAL);
    binding.recyclerView.setLayoutManager(staggeredGridLayoutManager);
    binding.recyclerView.setAdapter(staggeredRVAdapter);
  }
}