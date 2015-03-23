package com.xushuangshuang.uncle.app;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;

import com.xushuangshuang.uncle.R;
import com.xushuangshuang.uncle.fragment.Find;

/**
 * Created by xuss on 2015/3/23.
 */
public class MainActivity extends Activity {


    private ImageView imageView_find;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        imageView_find = (ImageView) findViewById(R.id.bottom_find);
        imageView_find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Find find = new Find();
                getFragmentManager().beginTransaction().replace(R.id.main_fragment, find).addToBackStack(null).commit();
            }
        });
    }
}
