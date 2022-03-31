package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.searchbox.SearchFragment;
import com.example.searchbox.custom.IOnSearchClickListener;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private SearchFragment searchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initView();
        initData();
    }

    private void initData() {

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                searchFragment.showFragment(getSupportFragmentManager(),SearchFragment.TAG);
            }
        });


        searchFragment.setOnSearchClickListener(new IOnSearchClickListener() {
            @Override
            public void OnSearchClick(String keyword) {
                //这里处理逻辑
                Toast.makeText(MainActivity.this, keyword, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        button = (Button) findViewById(R.id.button);
        searchFragment = SearchFragment.newInstance();
    }
}