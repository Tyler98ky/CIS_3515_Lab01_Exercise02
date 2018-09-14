package edu.temple.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Button buttonA = findViewById(R.id.button_A);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick();
            }
        });
    }

    private void onButtonClick() {
        Toast.makeText(this, "Button A was clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
}
