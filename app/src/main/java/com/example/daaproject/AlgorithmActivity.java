package com.example.daaproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AlgorithmActivity extends AppCompatActivity {
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_list);

        ArrayList<String> topics = new ArrayList<>();
        topics.add("Analysis of Algorithms");
        topics.add("Searching Sorting");
        topics.add("Greedy Algorithms");
        topics.add("Dynamic Programming");
        topics.add("Pattern Searching");
        topics.add("Other String Algorithms");
        topics.add("Backtracking");
        topics.add("Divide and Conquer");
        topics.add("Geometric Algorithms");
        topics.add("Mathematical Algorithms");
        topics.add("Bit Algorithms");
        topics.add("Graph Algorithms");
        topics.add("Randomized Algorithms");
        topics.add("Branch and Bound");

        ArrayAdapter<String> topicsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topics);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(topicsAdapter);

    }
}
