package com.example.vuongapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

import java.time.Instant;
import java.util.ArrayList;
import java.util.TooManyListenersException;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Users> arrayList;
    UsersAdapater adapater;
    Button buttonEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       lv = (ListView) findViewById(R.id.lvUser);
       arrayList = new ArrayList<>();
       arrayList.add(new Users("Hải Văn","thai nguyen",R.drawable.logo));
       arrayList.add(new Users("Hải 1","thai nguyen",R.drawable.logo));
       arrayList.add(new Users("Hải 2","thai nguyen",R.drawable.logo));
       arrayList.add(new Users("Hải 3","thai nguyen",R.drawable.logo));
       adapater = new UsersAdapater(this,R.layout.userprofile,arrayList);
       lv.setAdapter(adapater);
//        buttonEdit = (Button) findViewById(R.id.btnEdit);
//        buttonEdit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this, MainActivity2.class);
//                i.putExtra("key1","Lap trinh");
//                i.putExtra("key2",20);
//                startActivity(i);
//            }
//        });
    }

}