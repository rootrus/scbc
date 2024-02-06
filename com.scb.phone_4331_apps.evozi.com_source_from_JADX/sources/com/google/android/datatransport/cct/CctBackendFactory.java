package com.google.android.datatransport.cct;

import p040o.getErrorHandler;
import p040o.nAllocationCopyToBitmap;
import p040o.setupNative;
import p040o.translate;

public class CctBackendFactory implements setupNative {
    public nAllocationCopyToBitmap create(getErrorHandler geterrorhandler) {
        return new translate(geterrorhandler.MediaBrowserCompat$ItemReceiver(), geterrorhandler.IconCompatParcelizer(), geterrorhandler.MediaBrowserCompat$CustomActionResultReceiver());
    }
}
