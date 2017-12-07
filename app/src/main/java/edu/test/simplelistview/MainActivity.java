package edu.test.simplelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private ArrayList<String> mDataList;
    private ArrayAdapter<String> adapter;
    private int size = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataList = new ArrayList<>();

        for (int i = 0 ;i < size; i++){
            mDataList.add("Item" + i);
        }
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mDataList);
        mListView = findViewById(R.id.listview);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You click " + mDataList.get(i), Toast.LENGTH_LONG).show();
            }
        });

    }
}
