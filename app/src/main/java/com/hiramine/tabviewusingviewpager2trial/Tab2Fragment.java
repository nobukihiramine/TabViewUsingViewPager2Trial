package com.hiramine.tabviewusingviewpager2trial;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Tab2Fragment extends Fragment
{
	@Override
	public View onCreateView( LayoutInflater inflater,
							  ViewGroup container,
							  Bundle savedInstanceState )
	{
		// レイアウトファイルを使用し、Viewを生成
		return inflater.inflate( R.layout.fragment_tab2,
								 container,
								 false );
	}
}
