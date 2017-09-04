package com.fangxiao55.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String oldValue = getIntent().getStringExtra("OldValue");
        final EditText mtEditItem = findViewById(R.id.mtEditItem);
        mtEditItem.setText(oldValue);
        Button btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent data = getIntent();
                data.putExtra("NewValue", mtEditItem.getText().toString());
                setResult(1, data);
                EditItemActivity.this.finish();
            }
        });
    }
}
