package com.sanshisoft.waterfallgirls;

import android.app.Application;

import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.Iconics;

/**
 * Created by chenleicpp on 2015/2/26.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Iconics.registerFont(new GoogleMaterial());
    }
}
