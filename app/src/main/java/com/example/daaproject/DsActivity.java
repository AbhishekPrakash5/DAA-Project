package com.example.daaproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

@SuppressLint("Registered")
public class DsActivity extends AppCompatActivity {
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topic_list);

        ArrayList<String> topics = new ArrayList<>();
        topics.add("Array");
        topics.add("Linked List");
        topics.add("Stack");
        topics.add("Queue");
        topics.add("Binary Tree");
        topics.add("Binary Search Tree");
        topics.add("Heap");
        topics.add("Array");
        topics.add("Hashing");
        topics.add("Graph");
        topics.add("Array");
        topics.add("Matrix");
        topics.add("Strings");

        ArrayAdapter<String> topicsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, topics);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(topicsAdapter);

    }
}
