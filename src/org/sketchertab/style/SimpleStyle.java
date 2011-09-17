package org.sketchertab.style;

import java.util.HashMap;

import org.sketchertab.Style;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

class SimpleStyle implements Style {
	private float prevX;
	private float prevY;

	private Paint paint = new Paint();

	{
		paint.setColor(Color.BLACK);
		paint.setAlpha(100);
		paint.setAntiAlias(true);
		paint.setStrokeWidth(1.5F);
	}

	public void stroke(Canvas c, float x, float y) {
		c.drawLine(prevX, prevY, x, y, paint);

		prevX = x;
		prevY = y;
	}

	public void strokeStart(float x, float y) {
		prevX = x;
		prevY = y;
	}

	public void draw(Canvas c) {
	}

	public void setColor(int color) {
		paint.setColor(color);
		paint.setAlpha(100);
	}

	public void saveState(HashMap<Integer, Object> state) {
	}

	public void restoreState(HashMap<Integer, Object> state) {
	}
}