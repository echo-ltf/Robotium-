package com.example.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyCircleView extends View{

	public MyCircleView(Context context, AttributeSet attrs) {
		super(context);
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		setMeasuredDimension(100, 100);
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		Paint white=new Paint(Paint.ANTI_ALIAS_FLAG);
		Paint red=new Paint(Paint.ANTI_ALIAS_FLAG);
		
		white.setColor(Color.WHITE);
		red.setColor(Color.RED);
		
		canvas.drawColor(Color.BLUE);
		canvas.translate(50, 50);
		canvas.drawCircle(0, 0, 25, red);
		canvas.drawCircle(0, 0, 21, white);
		canvas.drawCircle(0, 0, 17, red);
		canvas.drawCircle(0, 0, 13, white);
		canvas.drawCircle(0, 0, 9, red);
		canvas.drawCircle(0, 0, 5, white);
		canvas.drawCircle(0, 0, 1, red);
		
		
	}

	
}
