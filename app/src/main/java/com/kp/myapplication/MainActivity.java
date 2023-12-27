package com.kp.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<EmployeeModel> employeeModelArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rv_empList);
        setEmployeeModelArrayList();
        EmployeeAdapter adapter = new EmployeeAdapter(this,employeeModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setEmployeeModelArrayList(){
        for (int i = 1; i < 21; i++){
            employeeModelArrayList.add(new EmployeeModel(i+"", "Name "+i+"", "Role "+i+""));
        }
    }
}