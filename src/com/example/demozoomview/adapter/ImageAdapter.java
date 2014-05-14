package com.example.demozoomview.adapter;

import com.example.demozoomview.MainActivity;
import com.example.demozoomview.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

	private LayoutInflater layoutInflater;
	private int imagenes[] = { R.drawable.descarga, R.drawable.pikachu,
			R.drawable.logoaudition, R.drawable.audition07, 
			R.drawable.descarga1, R.drawable.descarga2, R.drawable.descarga3, R.drawable.descarga4,
		    R.drawable.descarga5, R.drawable.dota1, R.drawable.dota2, R.drawable.dota3, R.drawable.dota4 };
	
	public ImageAdapter(MainActivity activity) {
		// TODO Auto-generated constructor stub
		layoutInflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	//sera

	@Override
	public int getCount() {
		// Set the count value to the total number of items in the Array
		return imagenes.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View listItem = convertView;
		int pos = position;
		if (listItem == null) {
			listItem = layoutInflater.inflate(R.layout.lista_main, null);
		}

		ImageView iv = (ImageView) listItem.findViewById(R.id.img1);
		iv.setBackgroundResource(imagenes[pos]);

		return listItem;
	}
}
