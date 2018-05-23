package com.example.Student;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class Gerenxinxi_page extends Activity{
	ImageView ima_shouye;
	ImageView ima_liaotian;
	ImageView ima_toujian;
	ImageView ima_wode;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gerenxinxi_page);
		ima_shouye = (ImageView) findViewById(R.id.first_image);
		ima_liaotian = (ImageView) findViewById(R.id.second_image);
		ima_toujian = (ImageView) findViewById(R.id.third_image);
		ima_wode = (ImageView) findViewById(R.id.fourth_image);
		ima_shouye.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Gerenxinxi_page.this, main_page.class);
				startActivity(intent);
			}
		});
		ima_liaotian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Gerenxinxi_page.this, Chat_page.class);
				startActivity(intent);
			}
		});
		ima_toujian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Gerenxinxi_page.this, Send_page.class);
				startActivity(intent);
			}
		});
		ima_wode.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Gerenxinxi_page.this, Wode_page.class);
				startActivity(intent);
			}
		});
	}
}
