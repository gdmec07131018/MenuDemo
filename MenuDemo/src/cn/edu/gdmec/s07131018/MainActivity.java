package cn.edu.gdmec.s07131018;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
    	switch(item.getItemId()){
    	case R.id.item1:
    		tv.setText("你点击了菜单项1");
    		break;
    	case R.id.item2:
    		tv.setText("你点击了菜单项2");
    		break;
    	case R.id.item3:
    		tv.setText("你点击了菜单项3");
    		break;
    	}
        return super.onOptionsItemSelected(item);
    }
}
