package eu.pulsation.scalasandbox

import android.app.{Activity, AlarmManager}
import android.os.Bundle

class ScalaSandboxActivity extends Activity
{
    /** Called when the activity is first created. */
    override def onCreate(savedInstanceState: Bundle)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
    }
}

