package com.hiramine.tabviewusingviewpager2trial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TabViewActivity extends AppCompatActivity
{

	@Override
	protected void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.activity_tab_view );

		// Viewの取得
		TabLayout  tablayout  = findViewById( R.id.tablayout );
		ViewPager2 viewpager2 = findViewById( R.id.viewpager );
		// ViewPagerにアダプターをセット
		viewpager2.setAdapter( new TabFragmentAdapter( this ) );
		// Mediator(仲介役)を介して、TabLayoutとViewPager2を紐づけ
		new TabLayoutMediator( tablayout,
							   viewpager2,
							   ( tab, position ) ->
							   {
								   String strTabTitle;
								   if( 0 == position )
								   {
									   strTabTitle = "Tab 1";
								   }
								   else
								   {
									   strTabTitle = "Tab 2";
								   }
								   tab.setText( strTabTitle );
							   }
		).attach();
	}
}