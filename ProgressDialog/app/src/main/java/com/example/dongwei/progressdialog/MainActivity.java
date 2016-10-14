package com.example.dongwei.progressdialog;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("message");
                progressDialog.setMessage("Loading...");
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);//设置显示样式 STYLE_SPINNER圆形进度条
                progressDialog.show();
                progressDialog.setCancelable(true);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("message");
                progressDialog.setMessage("Loading...");
                progressDialog.setMax(100);
                progressDialog.setProgress(50);
                progressDialog.setSecondaryProgress(70);
                progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);//STYLE_HORIZONTAL水平进度条
                progressDialog.show();
                progressDialog.setCancelable(true);
            }
        });
    }
}
