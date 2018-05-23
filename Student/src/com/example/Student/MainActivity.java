package com.example.Student;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
//import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	private Button bt1;
	private Button bt2;
	private Context context1;
	private Context context2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button) findViewById(R.id.button1_first);
        bt2=(Button) findViewById(R.id.button2_second); 
        context1=this;
        context2=this;
        bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(context1, login_activity.class);
				startActivity(intent);
//				Toast.makeText(context1, "fisrt", 1000).show();
			}
		});
        bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent(context2, register.class);
				startActivity(intent);
			}
		});
    }
}
