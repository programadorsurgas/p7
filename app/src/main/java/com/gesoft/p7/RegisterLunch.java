package com.gesoft.p7;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.gesoft.p7.db.dbManager;

import java.util.ArrayList;

public class RegisterLunch extends AppCompatActivity {

    ListView listOptions;
    Context ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_lunch);

        ctx = RegisterLunch.this;

        listOptions = findViewById(R.id.list_options);

        ArrayList<String> arrayOptions = new ArrayList<>();
        arrayOptions.add("View Registers");
        arrayOptions.add("Set values");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ctx, android.R.layout.simple_list_item_1, arrayOptions);

        listOptions.setAdapter(adapter);

        dbManager mngr = new dbManager(ctx);
        mngr.open();

        mngr.insert_record("2019-01-29");

        mngr.close();

    }
}
