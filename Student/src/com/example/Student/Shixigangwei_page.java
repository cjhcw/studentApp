package com.example.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Shixigangwei_page extends Activity{
	ListView lv;
	ImageView ima_shouye;
	ImageView ima_liaotian;
	ImageView ima_toujian;
	ImageView ima_wode;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shixigangwei_page);
		lv=(ListView) findViewById(R.id.listView2);
		final String[] cname=new String[]{"企业1*******",
				"企业2*******","企业3*******",
				"企业4*******","企业5*******",
				"企业6*******","企业7*******"};
		final String[] work=new String[]{"Android实习工程师",
				"IOS实习工程师","JAVA实习工程师","PHP实习工程师",
				"Python实习工程师","Web实习工程","数据库实习工程师"};
		ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();;
		int lengh = cname.length;
		for(int i =0; i < lengh; i++) {
		    Map<String,Object> item = new HashMap<String,Object>();
		    item.put("title", cname[i]);
		    item.put("text", work[i]);
		    mData.add(item);
		}
		SimpleAdapter adapter = new SimpleAdapter(this,mData,android.R.layout.simple_list_item_2,
			new String[]{"title","text"},new int[]{android.R.id.text1,android.R.id.text2});
	        lv.setAdapter(adapter);
	        ima_shouye = (ImageView) findViewById(R.id.first_image);
			ima_liaotian = (ImageView) findViewById(R.id.second_image);
			ima_toujian = (ImageView) findViewById(R.id.third_image);
			ima_wode = (ImageView) findViewById(R.id.fourth_image);
			ima_shouye.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
				Intent intent = new Intent(Shixigangwei_page.this, main_page.class);
					startActivity(intent);
				}
			});
			ima_liaotian.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(Shixigangwei_page.this, Chat_page.class);
					startActivity(intent);
				}
			});
			ima_toujian.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(Shixigangwei_page.this, Send_page.class);
					startActivity(intent);
				}
			});
			ima_wode.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					Intent intent = new Intent(Shixigangwei_page.this, Wode_page.class);
					startActivity(intent);
				}
			});
	}
}
