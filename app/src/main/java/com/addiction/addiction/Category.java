package com.addiction.addiction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        TextView ok2 = (TextView)findViewById(R.id.food_name2);
        TextView ok3 = (TextView)findViewById(R.id.food_name3);
        TextView ok = (TextView)findViewById(R.id.food_name);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Category.this,Chat.class);
                startActivity(i);
            }
        });
        ok2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Category.this,Chat.class);
                startActivity(i);
            }
        });
        ok3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Category.this,Chat.class);
                startActivity(i);
            }
        });
    }
}
