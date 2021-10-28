package com.example.demo;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;

public class PostDialog extends Dialog {
    private static PostDialog postDialog;

    public PostDialog(@NonNull Context context) {
        super(context);
    }

    public static PostDialog getInstance(Context context) {
        postDialog = new PostDialog(context);

        return postDialog;
    }

    public void showDefaultDialog() {
        LocationItem locItem = new LocationItem();
        postDialog.setContentView(R.layout.layout_input);

        Button btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                locItem.setLan(Double.parseDouble(((EditText)findViewById(R.id.etLan)).getText().toString()));
                locItem.setLan(Double.parseDouble(((EditText)findViewById(R.id.etLan)).getText().toString()));
                locItem.setAddress(((EditText)findViewById(R.id.etAdd)).getText().toString());
                locItem.setNum(Integer.parseInt(((EditText)findViewById(R.id.etNum)).getText().toString()));
                locItem.setDt(((EditText)findViewById(R.id.etDate)).getText().toString() + ((EditText)findViewById(R.id.etTime)).getText().toString());
                locItem.set_uid(Integer.parseInt(((EditText)findViewById(R.id.etUid)).getText().toString()));

                Log.d("정보", locItem.getLan() + "\t" + locItem.getLat() + "\t" + locItem.getDt());
            }
        });
    }
}
