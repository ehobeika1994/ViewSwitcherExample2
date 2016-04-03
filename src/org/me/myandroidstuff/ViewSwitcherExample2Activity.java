package org.me.myandroidstuff;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ViewSwitcher;

public class ViewSwitcherExample2Activity extends Activity implements OnClickListener
{
	private ViewSwitcher avw;
	private Button s1Button;
	private Button s2Button;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.e(getPackageName(), "just before avw");
        avw = (ViewSwitcher) findViewById(R.id.vwSwitch);
        if (avw == null)
        {
        	Toast.makeText(getApplicationContext(), "Null ViewSwicther", Toast.LENGTH_LONG);
        	Log.e(getPackageName(), "null pointer");
        }
        s1Button = (Button) findViewById(R.id.screen1Button);
        s2Button = (Button) findViewById(R.id.screen2Button);
        s1Button.setOnClickListener(this);
        s2Button.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) 
	{
		// TODO Auto-generated method stub
		if (arg0 == s1Button)
		{
			avw.showNext();
		}
		else
			if (arg0 == s2Button)
			{
				avw.showPrevious();
			}
	}
}