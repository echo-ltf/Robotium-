package com.example.test.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.test.MainActivity;
import com.robotium.solo.Solo;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;


public class TButtonTest  extends ActivityInstrumentationTestCase2{

	private Solo solo;
	
	public TButtonTest() {
		super(MainActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void setUp() throws Exception {
		solo=new Solo(getInstrumentation(),getActivity());
	}
	
	@Override
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

	@Test
	public void test() {
		for (int i = 0; i < 5; i++) {
			solo.clickOnButton("原始数据");
		}
		solo.clickOnButton("跳转");
		solo.clickOnButton("返回");
//		solo.goBack();
		for (int i = 0; i < 2; i++) {
			solo.clickOnButton("原始数据");
		}
	}
}
