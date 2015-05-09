package com.example.butoonanimation;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends Activity {
	private Button button; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button=(Button) findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			AnimationSet animationSet=new AnimationSet(true);
			Animation animation=new RotateAnimation(0, -360);
			animation.setDuration(1000);
			animationSet.addAnimation(animation);
			button.startAnimation(animationSet);
			
			
			}
		});
	}

	
}
