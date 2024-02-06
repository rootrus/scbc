package p040o;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.fragment.app.Fragment;

/* renamed from: o.ProxySourceAdapter$ItemViewHolder */
public final class ProxySourceAdapter$ItemViewHolder {
    private static final AppCompatCheckBox<String, Integer> MediaBrowserCompat$ItemReceiver;

    static {
        AppCompatCheckBox<String, Integer> appCompatCheckBox = new AppCompatCheckBox<>(8);
        MediaBrowserCompat$ItemReceiver = appCompatCheckBox;
        appCompatCheckBox.put("com.android.voicemail.permission.ADD_VOICEMAIL", 14);
        MediaBrowserCompat$ItemReceiver.put("android.permission.BODY_SENSORS", 20);
        MediaBrowserCompat$ItemReceiver.put("android.permission.READ_CALL_LOG", 16);
        MediaBrowserCompat$ItemReceiver.put("android.permission.READ_EXTERNAL_STORAGE", 16);
        MediaBrowserCompat$ItemReceiver.put("android.permission.USE_SIP", 9);
        MediaBrowserCompat$ItemReceiver.put("android.permission.WRITE_CALL_LOG", 16);
        MediaBrowserCompat$ItemReceiver.put("android.permission.SYSTEM_ALERT_WINDOW", 23);
        MediaBrowserCompat$ItemReceiver.put("android.permission.WRITE_SETTINGS", 23);
    }

    public static boolean write(int... iArr) {
        if (iArr.length == 0) {
            return false;
        }
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(Context context, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= length) {
                return true;
            }
            String str = strArr[i];
            Integer num = MediaBrowserCompat$ItemReceiver.get(str);
            if (num != null && Build.VERSION.SDK_INT < num.intValue()) {
                z = false;
            }
            if (z && !read(context, str)) {
                return false;
            }
            i++;
        }
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(Activity activity, String... strArr) {
        for (String write : strArr) {
            if (AppCompatRatingBar.write(activity, write)) {
                return true;
            }
        }
        return false;
    }

    public static boolean write(Fragment fragment, String... strArr) {
        for (String shouldShowRequestPermissionRationale : strArr) {
            if (fragment.shouldShowRequestPermissionRationale(shouldShowRequestPermissionRationale)) {
                return true;
            }
        }
        return false;
    }

    private static boolean read(Context context, String str) {
        try {
            return AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(context, str, Process.myPid(), Process.myUid(), context.getPackageName()) == 0;
        } catch (RuntimeException unused) {
        }
    }
}
