package org.opentalking.lightlog;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStart() {
		super.onStart();
		ILog.i("Activity Life Cycle");
	}

	@Override
	protected void onResume() {
		super.onResume();
		ILog.i("Activity Life Cycle");
	}

	@Override
	protected void onPause() {
		super.onPause();
		ILog.i("Activity Life Cycle");
	}

	@Override
	protected void onStop() {
		super.onStop();
		ILog.i("Activity Life Cycle");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ILog.i("Activity Life Cycle");
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		return super.onKeyDown(keyCode, event);
	}

}
