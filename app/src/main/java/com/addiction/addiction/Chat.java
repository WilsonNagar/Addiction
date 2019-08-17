package com.addiction.addiction;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class Chat extends AppCompatActivity {

    int a=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        final EditText chat = findViewById(R.id.wow);
        final ListView list = findViewById(R.id.listchat);
        final ArrayList<String> data = new ArrayList<>();
        final ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        list.setAdapter(adapter);
        TextView send = (TextView)findViewById(R.id.ok);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chat.getText().toString()!="")
                {
                    if(a%1==0)
                    {
                        data.add(chat.getText().toString());
                        adapter.notifyDataSetChanged();
                        chat.setText("");
                        a=0;
                    }
                    else
                    {
                        data.add(chat.getText().toString());
                        adapter.notifyDataSetChanged();
                        chat.setText("");
                        a=1;
                    }
                }
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(Chat.this);
        builder.setTitle("Are You Sure?")
                .setMessage("Do you want to move on to daily goals?")
                .setPositiveButton("Sure", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(Chat.this,Reward.class));
                    }
                })
                .setNegativeButton("Nope", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();
    }
}
