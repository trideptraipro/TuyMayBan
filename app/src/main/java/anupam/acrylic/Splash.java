/*

 */

package anupam.acrylic;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import anupam.acrylic.databinding.MainBinding;

public class Splash extends Activity {
    MainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mainBinding = MainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        Thread t = new Thread() {

            public void run() {
                try {
                    Thread.sleep(1000);

                    startActivity(new Intent().setClassName("anupam.acrylic",
                            "anupam.acrylic.EasyPaint"));
                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
