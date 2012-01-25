package andrea.polverone.es2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Second extends Activity{
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        TextView label = (TextView) findViewById(R.id.textView1);
        String iltestoricevuto = getIntent().getExtras().getString("iltestonelbox");
        label.setText(iltestoricevuto);
	}
    
    protected void onStart() {
    	super.onStart();
    	String str="Start";
    	Log.d("Log XML", str);
    }

    protected void onRestart() {
    	super.onRestart();
    	String str="Restart";
    	Log.d("Log XML", str);
    }
    
    protected void onResume() {
    	super.onResume();
    	String str="Resume";
    	Log.d("Log XML", str);
    }

    protected void onPause() {
    	super.onPause();
    	String str="Pause";
    	Log.d("Log XML", str);
    }

    protected void onStop() {
    	super.onStop();
    	String str="Stop";
    	Log.d("Log XML", str);
    }
    
    protected void onDestroy() {
    	super.onDestroy();
    	String str="Destroy";
    	Log.d("Log XML", str);
    }
}