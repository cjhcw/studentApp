package com.example.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class Send_page extends Activity{
	ListView lv;
	Button querentoujian;
	ImageView ima_shouye;
	ImageView ima_liaotian;
	ImageView ima_toujian;
	ImageView ima_wode;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send_page);
		lv=(ListView) findViewById(R.id.listView1);
		querentoujian=(Button) findViewById(R.id.button1);
		final String[] cname=new String[]{"企业1*******\nAndroid工程师",
				"企业2*******\nIOS工程师","企业3*******\nJAVA工程师",
				"企业4*******\nPHP工程师","企业5*******\nPython工程师",
				"企业6*******\nWeb工程","企业7*******\n数据库工程师"};
		final String[] work=new String[]{"Android工程师",
				"IOS工程师","JAVA工程师","PHP工程师","Python工程师",
				"Web工程","数据库工程师"};
		ArrayList<Map<String,Object>> mData= new ArrayList<Map<String,Object>>();;
		int lengh = cname.length;
		for(int i =0; i < lengh; i++) {
		    Map<String,Object> item = new HashMap<String,Object>();
		    item.put("title", cname[i]);
		    item.put("text", work[i]);
		    mData.add(item);
		}
		SimpleAdapter adapter = new SimpleAdapter(this,mData,android.R.layout.simple_list_item_multiple_choice,
			new String[]{"title","text"},new int[]{android.R.id.text1,android.R.id.text2});
	        lv.setAdapter(adapter);
	        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
	        lv.setOnItemClickListener(new OnItemClickListener() {
		    public void onItemClick(AdapterView<?> adapterView, View view, int position,long id) {
			Toast.makeText(Send_page.this,"您选择了标题：" + cname[position] + "\n内容："+work[position], Toast.LENGTH_LONG).show();
		    }
		});
	    querentoujian.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Send_page.this, Toujian_page.class);
				startActivity(intent);
			}
		});
	    ima_shouye = (ImageView) findViewById(R.id.first_image);
		ima_liaotian = (ImageView) findViewById(R.id.second_image);
		ima_toujian = (ImageView) findViewById(R.id.third_image);
		ima_wode = (ImageView) findViewById(R.id.fourth_image);
		ima_shouye.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Send_page.this, main_page.class);
				startActivity(intent);
			}
		});
		ima_liaotian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Send_page.this, Chat_page.class);
				startActivity(intent);
			}
		});
		ima_toujian.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Send_page.this, Send_page.class);
				startActivity(intent);
			}
		});
		ima_wode.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Send_page.this, Wode_page.class);
				startActivity(intent);
			}
		});
	}
}
