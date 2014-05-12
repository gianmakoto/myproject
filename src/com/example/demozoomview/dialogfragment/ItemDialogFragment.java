package com.example.demozoomview.dialogfragment;

import com.example.demozoomview.R;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class ItemDialogFragment extends DialogFragment {
private static final int NUM_PAGES = 3;
	
	private ViewPager vpCatalogoItem;
    private PagerAdapter mPagerAdapter;
    
    public static ItemDialogFragment newInstance(int numeroImagen) {
    	ItemDialogFragment myFragment = new ItemDialogFragment();

        Bundle args = new Bundle();
        args.putInt("NumeroImagen", numeroImagen);
        myFragment.setArguments(args);

        return myFragment;
    }
    
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	}
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.catalogo_item_dialog , container);
		vpCatalogoItem = (ViewPager) view.findViewById(R.id.vpCatalogoItem);
		getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);
		getDialog().setCancelable(false);
		getDialog().setCanceledOnTouchOutside(false);
		//getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
		return view;
		
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		mPagerAdapter = new ScreenSlidePagerAdapter(getChildFragmentManager());
		vpCatalogoItem.setAdapter(mPagerAdapter);
		if (getDialog() != null) {

			int dialogWidth = 300;
			int dialogHeight = 400;
			getDialog().getWindow().setLayout(dialogWidth, dialogHeight);
			}
	}
	
	 private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
	        public ScreenSlidePagerAdapter(FragmentManager fm) {
	            super(fm);
	        }

	        @Override
	        public Fragment getItem(int position) {
	        	Bundle args;
	        	Fragment fragment = null;
	        	args = new Bundle();
	        	args.putInt("NumeroImagen", position);
	        	fragment = new ItemDialogFragment();
	        	fragment.setArguments(args);
	            return fragment;
	        }

	        @Override
	        public int getCount() {
	            return NUM_PAGES;
	        }
	    }
	
	
}
