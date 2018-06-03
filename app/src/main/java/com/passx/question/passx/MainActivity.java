package com.passx.question.passx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    public void  initView(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true); //tối ưu hóa dữ liệu
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<DataPassX>  arrayList = new ArrayList<>();
        arrayList.add(new DataPassX(R.drawable.java1,"JAVA1"));
        arrayList.add(new DataPassX(R.drawable.jav3,"JAVA1"));
        arrayList.add(new DataPassX(R.drawable.java4,"JAVA1"));
        arrayList.add(new DataPassX(R.drawable.java5,"JAVA1"));
        arrayList.add(new DataPassX(R.drawable.java6,"JAVA1"));
        arrayList.add(new DataPassX(R.drawable.java9,"JAVA1"));
        Adapter adapter = new Adapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(adapter);


    }
}
