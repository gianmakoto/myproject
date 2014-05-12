package com.example.demozoomview.fragment;

import com.example.demozoomview.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CatalogoItemViewPagerFragment extends Fragment {

	private Bundle args;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.catalogo_item_viewpager, container, false);

        args = getArguments();
        Integer numeroImagen = args.getInt("NumeroImagen");
        
        return rootView;
	}
	
}
