package com.example.test.test;

import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
	Button btn;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button) findViewById(R.id.main_btn);
		tv=(TextView) findViewById(R.id.main_tv);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startInstrumentation(new ComponentName("com.example.test.test", "com.zutubi.android.junitreport.JUnitReportTestRunner"), null, null);	
				Log.i("msg", startInstrumentation(new ComponentName("com.example.test.test", "com.zutubi.android.junitreport.JUnitReportTestRunner"), null, null)+"");
				if(startInstrumentation(new ComponentName("com.example.test.test", "android.test.InstrumentationTestRunner"), null, null)==true){
					tv.setText("≤‚ ‘≥…π¶");
				}else{
					tv.setText("≤‚ ‘ ß∞‹");
				}
			}
		});
		
	}
}
