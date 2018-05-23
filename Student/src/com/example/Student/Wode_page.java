package com.example.Student;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Wode_page extends Activity {
	ImageView ima_shouye;
	ImageView ima_liaotian;
	ImageView ima_toujian;
	ImageView ima_wode;
	TextView tv1;
	TextView tv2;
	TextView tv3;
	TextView tv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wode_page);
		ima_shouye = (ImageView) findViewById(R.id.first_image);
		ima_liaotian = (ImageView) findViewById(R.id.second_image);
		ima_toujian = (ImageView) findViewById(R.id.third_image);
		ima_wode = (ImageView) findViewById(R.id.fourth_image);
		ima_shouye.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Wode_page.this, main_page.class);
				startActivity(intent);
			}
		});
		ima_liaotian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Wode_page.this, Chat_page.class);
				startActivity(intent);
			}
		});
		ima_toujian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Wode_page.this, Send_page.class);
				startActivity(intent);
			}
		});
		ima_wode.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Wode_page.this, Wode_page.class);
				startActivity(intent);
			}
		});
		tv1 = (TextView) findViewById(R.id.textView1);
		tv2 = (TextView) findViewById(R.id.textView2);
		tv3 = (TextView) findViewById(R.id.textView3);
		tv4 = (TextView) findViewById(R.id.textView4);
		tv1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Wode_page.this,
						Gerenxinxi_page.class);
				startActivity(intent);
			}
		});
		tv2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Wode_page.this,
						Wodekecheng_page.class);
				startActivity(intent);
			}
		});
		tv3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Wode_page.this,
						Wodejianli_page.class);
				startActivity(intent);
			}
		});
		tv4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Wode_page.this,
						Shixigangwei_page.class);
				startActivity(intent);
			}
		});
	}
}
