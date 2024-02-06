package com.airbnb.lottie;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.setMeasureWithLargestChildEnabled;

/* renamed from: com.airbnb.lottie.L */
public class C0088L {
    public static boolean DBG = false;
    private static final int MAX_DEPTH = 20;
    public static final String TAG = "LOTTIE";
    private static int depthPastMaxDepth = 0;
    private static String[] sections = null;
    private static long[] startTimeNs = null;
    private static int traceDepth = 0;
    private static boolean traceEnabled = false;

    public static void setTraceEnabled(boolean z) {
        if (traceEnabled != z) {
            traceEnabled = z;
            if (z) {
                sections = new String[20];
                startTimeNs = new long[20];
            }
        }
    }

    public static void beginSection(String str) {
        if (traceEnabled) {
            int i = traceDepth;
            if (i == 20) {
                depthPastMaxDepth++;
                return;
            }
            sections[i] = str;
            startTimeNs[i] = System.nanoTime();
            setMeasureWithLargestChildEnabled.read(str);
            traceDepth++;
        }
    }

    public static float endSection(String str) {
        int i = depthPastMaxDepth;
        if (i > 0) {
            depthPastMaxDepth = i - 1;
            return BitmapDescriptorFactory.HUE_RED;
        } else if (!traceEnabled) {
            return BitmapDescriptorFactory.HUE_RED;
        } else {
            int i2 = traceDepth - 1;
            traceDepth = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(sections[i2])) {
                setMeasureWithLargestChildEnabled.MediaBrowserCompat$CustomActionResultReceiver();
                return ((float) (System.nanoTime() - startTimeNs[traceDepth])) / 1000000.0f;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unbalanced trace call ");
                sb.append(str);
                sb.append(". Expected ");
                sb.append(sections[traceDepth]);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
