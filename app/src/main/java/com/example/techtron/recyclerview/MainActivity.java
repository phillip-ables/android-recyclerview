package com.example.techtron.recyclerview;

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

        //we need to cast this as a recycler view for it to be happy
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        //we want to display it as a list so we will be using a linear layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Array of school subject object that it will populate the recycler view with
        ArrayList<SchoolSubject> schoolSubjects = new ArrayList<>();

        SchoolSubject  forensic = new SchoolSubject("Forensic", false, R.drawable.forensic);
        schoolSubjects.add(forensic);

        SchoolSubject  computerScience = new SchoolSubject("Computer Science", false, R.drawable.computer_science);
        schoolSubjects.add(computerScience);

        SchoolSubject  network = new SchoolSubject("Network", false, R.drawable.network);
        schoolSubjects.add(computerScience);

        SchoolSubject  physics = new SchoolSubject("Physics", false, R.drawable.physics);
        schoolSubjects.add(physics);

        //pass the list to the adapter. first creat the adapter thats just a new class



    }
}
