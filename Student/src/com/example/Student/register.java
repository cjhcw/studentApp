package com.example.Student;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class register extends Activity{
	private Button bt1;
	private EditText et1;
	private EditText et2;
	private EditText et3;
	private EditText et4;
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		bt1=(Button) findViewById(R.id.register);
		et1=(EditText) findViewById(R.id.phone_number);
		et2=(EditText) findViewById(R.id.yanzhengma);
		et3=(EditText) findViewById(R.id.mima1);
		et4=(EditText) findViewById(R.id.mima2);
		tv=(TextView) findViewById(R.id.result);
 		bt1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String S="";
				if(et1.getText().length()==11&&et2.getText().length()==4&&et3.getText().toString().length()>=6&&et3.getText().toString().length()<21) {
					if(et3.getText().toString().equals(et4.getText().toString())){
						Intent intent=new Intent(register.this,login_activity.class);
						startActivity(intent);					
					}
				}
				if(et1.getText().length()!=11||et1.getText().toString().matches("^(13|15|18)\\d{9}$")==false){
					S=S+"请输入正确的手机号\n";
					tv.setText(S);
					}
				if(et2.getText().length()!=4){
					S=S+"请输入正确的验证码\n";
					tv.setText(S);
				}
				if(et3.getText().toString().length()<6||et3.getText().toString().length()>20){
					S=S+"请输入6-20位的密码\n";
					tv.setText(S);
				}
				if(et3.getText().toString().equals(et4.getText().toString())==false){
					S=S+"请输入相同的密码\n";
					tv.setText(S);
				}
				S="";
			}
		});
	}
}