package sg.edu.rp.c346.id21025432.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mod1;
    TextView mod2;
    TextView mod3;
    TextView mod4;
    TextView mod5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mod1 = findViewById(R.id.mod1);
        mod2 = findViewById(R.id.mod2);
        mod3 = findViewById(R.id.mod3);
        mod4 = findViewById(R.id.mod4);
        mod5 = findViewById(R.id.mod5);

        mod1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, mod1.class);
                intent.putExtra("code","C203");
                intent.putExtra("n","Web Application Development");
                intent.putExtra("y",2020);
                intent.putExtra("s","1");
                intent.putExtra("credit","4");
                intent.putExtra("v","W65H");
                startActivity(intent);
            }
        });

        mod2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, mod1.class);
                intent.putExtra("code","C235");
                intent.putExtra("n","IT Security & Management");
                intent.putExtra("y","2020");
                intent.putExtra("s","1");
                intent.putExtra("credit","4");
                intent.putExtra("v","W65G");
                startActivity(intent);
            }
        });

        mod3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, mod1.class);
                intent.putExtra("code","C218");
                intent.putExtra("n","UI/UX Design for Applications");
                intent.putExtra("y","2020");
                intent.putExtra("s","1");
                intent.putExtra("credit","4");
                intent.putExtra("v","E66B");
                startActivity(intent);
            }
        });

        mod4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, mod1.class);
                intent.putExtra("code","C206");
                intent.putExtra("n","Software Development Process");
                intent.putExtra("y","2020");
                intent.putExtra("s","1");
                intent.putExtra("credit","4");
                intent.putExtra("v","E66K");
                startActivity(intent);
            }
        });

        mod5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, mod1.class);
                intent.putExtra("code","C346");
                intent.putExtra("n","Android Mobile Application Development");
                intent.putExtra("y","2020");
                intent.putExtra("s","1");
                intent.putExtra("credit","4");
                intent.putExtra("v","E62E");
                startActivity(intent);
            }
        });


    }
}