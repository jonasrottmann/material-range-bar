package de.fluidmobile.rangebar;

import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;

/**
 * Created by Johannes Doll on 29/02/16.
 */
class ColorMatrixColorFilterFactory {


    private ColorMatrixColorFilterFactory() {}

    public static ColorMatrixColorFilter getOverrideColorMatrix(int color){
        return getOverrideColorMatrix(Color.red(color), Color.green(color), Color.blue(color));
    }

    public static ColorMatrixColorFilter getOverrideColorMatrix(int red, int green, int blue){
        return new ColorMatrixColorFilter(new float[]{
                0, 0, 0, 0, red,
                0, 0, 0, 0, green,
                0, 0, 0, 0, blue,
                0, 0, 0, 1, 0
        });
    }
}
