package com.example.homework;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework.model.Foodlist;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAdapter adapter = new MyAdapter();
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
        RecyclerView rv = findViewById(R.id.word_list_recycler_view);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);
    }
}
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        Foodlist[] items = {
                new Foodlist(R.drawable.food_1, "Tomyumkung", "ต้นยำกุ้ง"),
                new Foodlist(R.drawable.food_2, "Curry with vegetables", "แกงส้มผักรวม"),
                new Foodlist(R.drawable.food_3, "Green curry", "แกงเขียวหวาน"),
                new Foodlist(R.drawable.food_4, "Curry with chicken", "พะแนงไก่"),
                new Foodlist(R.drawable.food_5, "Thai curry", "แกงมัสมั่น"),
                new Foodlist(R.drawable.food_6, "Curry with fried chicken", "ไก่ผัดผงกระหรี่"),
                new Foodlist(R.drawable.food_7, "Clear soup", "แกงจืด"),
                new Foodlist(R.drawable.food_8, "Shabu", "จิ้มจุ่ม"),
                new Foodlist(R.drawable.food_9, "Rice with grill duck", "ข้าวหน้าเป็ด"),
                new Foodlist(R.drawable.food_10, "Deap fried egg", "ไข่เจียวหมูสับ")
        };

        public MyAdapter() {

        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_word_item, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.imageView.setImageResource(items[position].imageResId);
            holder.mainwordTextView.setText(items[position].mainword);
            holder.subwordTextView.setText(items[position].subword);
        }

        @Override
        public int getItemCount() {
            return items.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder{
            ImageView imageView;
            TextView mainwordTextView;
            TextView subwordTextView;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.image_view);
                mainwordTextView = itemView.findViewById(R.id.main_text_view);
                subwordTextView = itemView.findViewById(R.id.sub_text_view);
            }
        }
    }
