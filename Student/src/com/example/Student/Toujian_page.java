package com.example.Student;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Toujian_page extends Activity{
	ListView lv1;
	ListView lv2;
	ImageView ima_shouye;
	ImageView ima_liaotian;
	ImageView ima_toujian;
	ImageView ima_wode;
	
@Override
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.toujian_page);
	lv1=(ListView) findViewById(R.id.listView5);
	lv2=(ListView) findViewById(R.id.listView6);
	String[] data1=new String[]{"企业1******","企业3******",
			"企业4******","企业5******"};
	String[] data2=new String[]{"企业2******",
			"企业6******","企业7******"};
	ArrayAdapter<String> adapter1=new ArrayAdapter<String>
	(this, android.R.layout.simple_list_item_1, data1);
	ArrayAdapter<String> adapter2=new ArrayAdapter<String>
	(this, android.R.layout.simple_list_item_1, data2);
	lv1.setAdapter(adapter1);
	lv2.setAdapter(adapter2);
	ima_shouye = (ImageView) findViewById(R.id.first_image);
	ima_liaotian = (ImageView) findViewById(R.id.second_image);
	ima_toujian = (ImageView) findViewById(R.id.third_image);
	ima_wode = (ImageView) findViewById(R.id.fourth_image);
	ima_shouye.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent intent = new Intent(Toujian_page.this, main_page.class);
			startActivity(intent);
		}
	});
	ima_liaotian.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent intent = new Intent(Toujian_page.this, Chat_page.class);
			startActivity(intent);
		}
	});
	ima_toujian.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent intent = new Intent(Toujian_page.this, Send_page.class);
			startActivity(intent);
		}
	});
	ima_wode.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View arg0) {
			Intent intent = new Intent(Toujian_page.this, Wode_page.class);
			startActivity(intent);
		}
	});
	}
}
