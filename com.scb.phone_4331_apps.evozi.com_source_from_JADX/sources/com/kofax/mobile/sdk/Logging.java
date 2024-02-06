package com.kofax.mobile.sdk;

import com.kofax.kmc.ken.engines.KENLogging;
import com.kofax.kmc.klo.logistics.KLOLogging;
import com.kofax.kmc.kui.uicontrols.KUILogging;
import com.kofax.kmc.kut.utilities.KUTLogging;
import com.kofax.mobile.sdk._internal.C0767k;

public class Logging {
    public static void enableConsoleLogging(boolean z) {
        C0767k.m1810c("com.kofax.mobile.sdk", z);
        KENLogging.enableConsoleLogging(z);
        KLOLogging.enableConsoleLogging(z);
        KUILogging.enableConsoleLogging(z);
        KUTLogging.enableConsoleLogging(z);
    }
}
