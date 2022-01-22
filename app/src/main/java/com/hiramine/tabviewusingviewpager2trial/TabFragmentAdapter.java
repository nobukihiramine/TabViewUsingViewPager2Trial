package com.hiramine.tabviewusingviewpager2trial;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabFragmentAdapter extends FragmentStateAdapter
{
	public TabFragmentAdapter( @NonNull FragmentActivity fragmentActivity )
	{
		super( fragmentActivity );
	}

	@NonNull
	@Override
	public Fragment createFragment( int position )
	{
		// タグフラグメントを作成し、返す
		if( 0 == position )
		{
			return new Tab1Fragment();
		}
		return new Tab2Fragment();
	}

	@Override
	public int getItemCount()
	{
		// タブ数を返す
		return 2;
	}
}
