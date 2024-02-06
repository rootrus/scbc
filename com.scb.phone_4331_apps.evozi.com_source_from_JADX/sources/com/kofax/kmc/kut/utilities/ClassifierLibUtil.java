package com.kofax.kmc.kut.utilities;

import com.kofax.android.abc.image_classification.ImageClassifier;

public class ClassifierLibUtil {
    static {
        System.loadLibrary("gnustl_shared");
        System.loadLibrary("opencv_java3");
        System.loadLibrary("KfxEVRS");
        System.loadLibrary("sol_isg_mobile");
    }

    private ClassifierLibUtil() {
    }

    public static String getClassifierVersion() {
        return ImageClassifier.getVersion();
    }
}
