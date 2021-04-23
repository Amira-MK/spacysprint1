package com.example.spacysprint1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        TextView numbers =findViewById(R.id.numbers);

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opennumbers();

            }
        });
    }
    public void opennumbers(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}
