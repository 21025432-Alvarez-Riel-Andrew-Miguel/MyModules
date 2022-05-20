package sg.edu.rp.c346.id21025432.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class mod1 extends AppCompatActivity {

    TextView code, name, year, sem, credit, venue;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod1);
        code = findViewById(R.id.code);
        name = findViewById(R.id.name);
        year = findViewById(R.id.year);
        sem = findViewById(R.id.sem);
        credit = findViewById(R.id.credit);
        venue = findViewById(R.id.venue);

        Intent Received = getIntent();

        String moduleCode = Received.getStringExtra("code");
        code.setText("Module Code: " +moduleCode);

        String moduleName = Received.getStringExtra("n");
        name.setText("Module Name: " +moduleName);

        int moduleYear = Received.getIntExtra("y",2000);
        year.setText("Academic Year: " +moduleYear);

        String moduleSem = Received.getStringExtra("s");
        sem.setText("Semester: " +moduleSem);

        String moduleCredit = Received.getStringExtra("credit");
        credit.setText("Module Credit: " +moduleCredit);

        String moduleVenue = Received.getStringExtra("v");
        venue.setText("Venue: " +moduleVenue);


    }
}