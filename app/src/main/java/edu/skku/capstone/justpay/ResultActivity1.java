package edu.skku.capstone.justpay;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.drawable.ColorDrawable;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import java.util.ArrayList;

public class ResultActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ListView listview ;
        CustomList adapter;
        adapter = new CustomList() ;

        // 리스트뷰 참조 및 Adapter달기
        listview = (ListView) findViewById(R.id.listView);

        adapter.addItem("김사무엘",1000) ;
        // 두 번째 아이템 추가.
        adapter.addItem("이상규",2000);
        // 첫 번째 아이템 추가.
        adapter.addItem("김사무엘",1000) ;
        // 두 번째 아이템 추가.
        adapter.addItem("이상규",2000);
        // 첫 번째 아이템 추가.
        adapter.addItem("김사무엘",1000) ;
        // 두 번째 아이템 추가.
        adapter.addItem("이상규",2000);
        // 첫 번째 아이템 추가.
        adapter.addItem("김사무엘",1000) ;
        // 두 번째 아이템 추가.
        adapter.addItem("이상규",2000);
        // 첫 번째 아이템 추가.
        adapter.addItem("김사무엘",1000) ;
        // 두 번째 아이템 추가.
        adapter.addItem("이상규",2000);
        // 첫 번째 아이템 추가.
        adapter.addItem("김사무엘",1000) ;
        // 두 번째 아이템 추가.
        adapter.addItem("이상규",2000);
        // 첫 번째 아이템 추가.
        adapter.addItem("김사무엘",1000) ;
        // 두 번째 아이템 추가.
        adapter.addItem("이상규",2000);
        adapter.addItem("김사무엘",1000) ;
        // 두 번째 아이템 추가.
        adapter.addItem("이상규",2000);

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                // get item
                resultlist_item item= (resultlist_item) parent.getItemAtPosition(position) ;

                String nickname= item.getName() ;
                int pay = item.getPay() ;


                // TODO : use item data.
            }
        }) ;

    }
}