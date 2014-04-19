package com.snooze4charity;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	private static final String CLOCK_FONT_FACE = "fonts/digital-7-mono.ttf";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView alarmTime = (TextView) findViewById(R.id.alarm_time);
		TextView alarmBackground = (TextView) findViewById(R.id.alarm_time_background);
		
		Typeface digitalFontFace = Typeface.createFromAsset(getAssets(), CLOCK_FONT_FACE);
		alarmTime.setTypeface(digitalFontFace);
		alarmBackground.setTypeface(digitalFontFace);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int id = item.getItemId();
		
		if (id == R.id.action_settings) {
			return true;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
