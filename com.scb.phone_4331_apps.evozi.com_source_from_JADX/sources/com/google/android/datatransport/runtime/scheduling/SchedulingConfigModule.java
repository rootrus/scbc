package com.google.android.datatransport.runtime.scheduling;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p040o.CreditCardCaptureModule_GetIParametersFactory;
import p040o.Int4;
import p040o.nAllocationCreateBitmapRef;
import p040o.nAllocationCreateFromAssetStream;
import p040o.nAllocationCreateFromBitmap;
import p040o.nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver;

public abstract class SchedulingConfigModule {
    public static nAllocationCreateFromBitmap MediaBrowserCompat$CustomActionResultReceiver(CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory) {
        nAllocationCreateFromBitmap.IconCompatParcelizer iconCompatParcelizer = new nAllocationCreateFromBitmap.IconCompatParcelizer();
        Int4 int4 = Int4.DEFAULT;
        nAllocationCreateFromAssetStream.write write = new nAllocationCreateFromAssetStream.write();
        Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> emptySet = Collections.emptySet();
        if (emptySet != null) {
            write.read = emptySet;
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.put(int4, write.IconCompatParcelizer(30000).write().MediaBrowserCompat$CustomActionResultReceiver());
            Int4 int42 = Int4.HIGHEST;
            nAllocationCreateFromAssetStream.write write2 = new nAllocationCreateFromAssetStream.write();
            Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                write2.read = emptySet2;
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.put(int42, write2.IconCompatParcelizer(1000).write().MediaBrowserCompat$CustomActionResultReceiver());
                Int4 int43 = Int4.VERY_LOW;
                nAllocationCreateFromAssetStream.write write3 = new nAllocationCreateFromAssetStream.write();
                Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> emptySet3 = Collections.emptySet();
                if (emptySet3 != null) {
                    write3.read = emptySet3;
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.put(int43, write3.IconCompatParcelizer(86400000).write().MediaBrowserCompat$CustomActionResultReceiver(Collections.unmodifiableSet(new HashSet(Arrays.asList(new nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver[]{nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver.NETWORK_UNMETERED, nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver.DEVICE_IDLE})))).MediaBrowserCompat$CustomActionResultReceiver());
                    iconCompatParcelizer.read = creditCardCaptureModule_GetIParametersFactory;
                    if (iconCompatParcelizer.read == null) {
                        throw new NullPointerException("missing required property: clock");
                    } else if (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.keySet().size() >= Int4.values().length) {
                        Map<Int4, nAllocationCreateFromBitmap.write> map = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = new HashMap();
                        return new nAllocationCreateBitmapRef(iconCompatParcelizer.read, map);
                    } else {
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                } else {
                    throw new NullPointerException("Null flags");
                }
            } else {
                throw new NullPointerException("Null flags");
            }
        } else {
            throw new NullPointerException("Null flags");
        }
    }
}
