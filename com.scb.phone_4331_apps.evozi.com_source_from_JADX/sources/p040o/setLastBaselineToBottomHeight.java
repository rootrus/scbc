package p040o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: o.setLastBaselineToBottomHeight */
public class setLastBaselineToBottomHeight {
    private static final Object IconCompatParcelizer = new Object();
    private static TypedValue write;

    public static boolean MediaBrowserCompat$ItemReceiver(Context context, Intent[] intentArr, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static File[] MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    public static File[] IconCompatParcelizer(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static Drawable write(Context context, int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (IconCompatParcelizer) {
            if (write == null) {
                write = new TypedValue();
            }
            context.getResources().getValue(i, write, true);
            i2 = write.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static ColorStateList IconCompatParcelizer(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    public static int read(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static int MediaBrowserCompat$ItemReceiver(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static File MediaBrowserCompat$ItemReceiver(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return MediaBrowserCompat$ItemReceiver(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.File MediaBrowserCompat$ItemReceiver(java.io.File r3) {
        /*
            java.lang.Class<o.setLastBaselineToBottomHeight> r0 = p040o.setLastBaselineToBottomHeight.class
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r3.mkdirs()     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0034
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r3
        L_0x0017:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0036 }
            r1.<init>()     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "Unable to create files subdir "
            r1.append(r2)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x0036 }
            r1.append(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "ContextCompat"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0036 }
            android.util.Log.w(r3, r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r0)
            r3 = 0
            return r3
        L_0x0034:
            monitor-exit(r0)
            return r3
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setLastBaselineToBottomHeight.MediaBrowserCompat$ItemReceiver(java.io.File):java.io.File");
    }

    public static Context MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    public static boolean write(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }
}
