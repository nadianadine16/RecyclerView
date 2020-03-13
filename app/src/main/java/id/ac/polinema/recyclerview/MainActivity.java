package id.ac.polinema.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleSimpleButton(View view) {
		Intent i = new Intent(MainActivity.this, SimpleActivity.class);
		startActivity(i);
	}

	public void handleLogoButton(View view) {
		Intent i = new Intent(MainActivity.this, LogoActivity.class);
		startActivity(i);
	}

	public void handleGridButton(View view) {
		Intent i = new Intent(MainActivity.this, GridActivity.class);
		startActivity(i);
	}

	public void handleViewTypeButton(View view) {
		Intent i = new Intent(MainActivity.this, ViewTypeActivity.class);
		startActivity(i);
	}
	public void handleExerciseButton(View view) {
		Intent i = new Intent(MainActivity.this, Latihan.class);
		startActivity(i);
	}
	public void handleFastButton(View view) {
		Intent i = new Intent(MainActivity.this, FastAdapterActivity.class);
		startActivity(i);
	}


}
