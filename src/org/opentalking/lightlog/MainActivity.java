package org.opentalking.lightlog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TextView tips;
	
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
		initViews();
	}

	private void initViews() {
		ILog.v("level v : initViews");
		ILog.i("level i : initViews");
		ILog.d("level d : initViews");
		ILog.w("level w : initViews");
		ILog.e("level e : initViews");
		ILog.wtf("level wtf : initViews");
		tips = (TextView) findViewById(R.id.tips);
		tips.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ILog.v(new Throwable("test throwable"));
				ILog.i("test message");
				ILog.d("Main---TAG","test tag + message");
				ILog.w("test message + ",new Throwable("test throwable"));
				ILog.e("Main---TAG","test message"+new Throwable("test throwable"));
				ILog.wtf("level wtf : OnClickListener");
			}
		});
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
