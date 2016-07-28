package com.taojt.gridviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private ImageView imageView;
    int[] imageIds = {R.mipmap.bomb5, R.mipmap.bomb6,R.mipmap.bomb7,R.mipmap.bomb8, R.mipmap.bomb9,
    R.mipmap.bomb10, R.mipmap.bomb11,R.mipmap.bomb12,R.mipmap.bomb13,R.mipmap.bomb14,R.mipmap.bomb15,R.mipmap.bomb16};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Map<String, Object>> listItems = new ArrayList<>();
        for(int i =0;i<imageIds.length;i++){
            Map<String, Object> listItem = new HashMap<>();
            listItem.put("image", imageIds[i]);
            listItems.add(listItem);
        }
        imageView = (ImageView) findViewById(R.id.image_view);
        SimpleAdapter adapter = new SimpleAdapter(this,listItems,R.layout.cell,new  String[]{"image"},new int[]{R.id.image1});
        gridView = (GridView) findViewById(R.id.grid01);
        gridView.setAdapter(adapter);
    }
}
