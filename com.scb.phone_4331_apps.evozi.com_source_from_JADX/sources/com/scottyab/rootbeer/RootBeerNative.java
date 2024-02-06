package com.scottyab.rootbeer;

import p040o.AlertController$RecycleListView;

public class RootBeerNative {
    private static boolean IconCompatParcelizer = true;

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);

    static {
        try {
            System.loadLibrary("tool-checker");
        } catch (UnsatisfiedLinkError e) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) e);
        }
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return IconCompatParcelizer;
    }
}
