package com.codepath.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent i = new Intent(EditItemActivity.this, MainActivity.class);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String items = getIntent().getStringExtra("items");
        pos = getIntent().getIntExtra("pos", 0);
        EditText edit = (EditText) findViewById(R.id.editText);
        edit.setText(items);
        edit.setSelection(edit.getText().length());
    }

    public void onUpdateItem(View view){
        EditText edit = (EditText) findViewById(R.id.editText);
        Intent data = new Intent();
        data.putExtra("text", edit.getText().toString());
        data.putExtra("text", edit.getText().toString());
        data.putExtra("loc", pos);
        setResult(RESULT_OK, data);
        finish();
    }
}
