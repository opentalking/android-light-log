package org.opentalking.lightlog;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ILog.v("level v : Activity Life Cycle");
		ILog.i("level i : Activity Life Cycle");
		ILog.d("level d : Activity Life Cycle");
		ILog.w("level w : Activity Life Cycle");
		ILog.e("level e : Activity Life Cycle");
		ILog.wtf("level wtf : Activity Life Cycle");
	}

	@Override
	protected void onStart() {
		super.onStart();
		ILog.v("level v : Activity Life Cycle");
		ILog.i("level i : Activity Life Cycle");
		ILog.d("level d : Activity Life Cycle");
		ILog.w("level w : Activity Life Cycle");
		ILog.e("level e : Activity Life Cycle");
		ILog.wtf("level wtf : Activity Life Cycle");
	}

	@Override
	protected void onResume() {
		super.onResume();
		ILog.v("level v : Activity Life Cycle");
		ILog.i("level i : Activity Life Cycle");
		ILog.d("level d : Activity Life Cycle");
		ILog.w("level w : Activity Life Cycle");
		ILog.e("level e : Activity Life Cycle");
		ILog.wtf("level wtf : Activity Life Cycle");
	}

	@Override
	protected void onPause() {
		super.onPause();
		ILog.v("level v : Activity Life Cycle");
		ILog.i("level i : Activity Life Cycle");
		ILog.d("level d : Activity Life Cycle");
		ILog.w("level w : Activity Life Cycle");
		ILog.e("level e : Activity Life Cycle");
		ILog.wtf("level wtf : Activity Life Cycle");
	}

	@Override
	protected void onStop() {
		super.onStop();
		ILog.v("level v : Activity Life Cycle");
		ILog.i("level i : Activity Life Cycle");
		ILog.d("level d : Activity Life Cycle");
		ILog.w("level w : Activity Life Cycle");
		ILog.e("level e : Activity Life Cycle");
		ILog.wtf("level wtf : Activity Life Cycle");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ILog.v("level v : Activity Life Cycle");
		ILog.i("level i : Activity Life Cycle");
		ILog.d("level d : Activity Life Cycle");
		ILog.w("level w : Activity Life Cycle");
		ILog.e("level e : Activity Life Cycle");
		ILog.wtf("level wtf : Activity Life Cycle");
	}
}
