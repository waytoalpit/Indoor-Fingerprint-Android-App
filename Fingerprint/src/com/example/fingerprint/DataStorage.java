package com.example.fingerprint;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import android.content.Context;
import android.os.Environment;
import android.util.Log;

public class DataStorage {

	private static final String TAG = DataStorage.class.getSimpleName();
	private Context mContext;

	public DataStorage(Context context) {
		this.mContext = context;
	}

	protected void writeWifiDataToFile(String data) {
		try {

			// String fpath = "/storage/sdcard0/Alarms/wifi.txt";
			File sdcard = Environment.getExternalStorageDirectory();
			String fpath = sdcard.getAbsolutePath() + File.separator
					+ "wifi.txt";
			File file = new File(fpath);

			// If file does not exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			Log.i(TAG,
					"Wifi Data written successfully to the file:"
							+ file.getAbsoluteFile());

			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void writeCellularDataToFile(String data) {
		try {

			// String fpath = "/storage/sdcard0/Alarms/cellular.txt";
			File sdcard = Environment.getExternalStorageDirectory();
			String fpath = sdcard.getAbsolutePath() + File.separator
					+ "cellular.txt";
			File file = new File(fpath);

			// If file does not exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(data);
			Log.i(TAG,
					"Cellular Data written successfully to the file:"
							+ file.getAbsoluteFile());

			bw.close();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
