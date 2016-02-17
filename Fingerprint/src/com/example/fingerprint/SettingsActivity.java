package com.example.fingerprint;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class SettingsActivity extends Activity {
	public static final String KEY_ITERATIONS = "iterations";
	public static final String KEY_INTEVAL = "interval";
	public static final String DEFAULT_INTERVAL = "5";
	public static final String DEFAULT_ITERATIONS = "5";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Display the fragment as the main content.
		getFragmentManager().beginTransaction()
				.replace(android.R.id.content, new SettingsFragment()).commit();
	}

	static class SettingsFragment extends PreferenceFragment {
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);

			// Load the settings preferences from an XML resource
			addPreferencesFromResource(R.xml.settings);
		}

	}
}
