package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
	private Button button;
	private TextView textView;
	private static int i=0;
	private Button skipButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button=(Button) findViewById(R.id.button);
		textView=(TextView) findViewById(R.id.textView);
		button.setOnClickListener(new ButtonListener());
		
		skipButton=(Button) findViewById(R.id.skipbutton);
		skipButton.setOnClickListener(new SkipButtonListener());
	}
	
	class ButtonListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			i++;
			System.out.println(i);
			textView.setText(String.valueOf(i));
		}
	}
	class SkipButtonListener implements OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent=new Intent();
			intent.setClass(MainActivity.this, SecondActivity.class);
			startActivity(intent);
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.tbutton_test, menu);
		return true;
	}
	

}
