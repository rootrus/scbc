package p040o;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: o.setRemark */
public final class setRemark {
    private static SharedPreferences MediaBrowserCompat$CustomActionResultReceiver = PreferenceManager.getDefaultSharedPreferences(setRecipients.MediaMetadataCompat().MediaDescriptionCompat);

    public static int MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return MediaBrowserCompat$CustomActionResultReceiver.getInt(str, -1);
    }

    public static void MediaBrowserCompat$ItemReceiver(String str, String str2) throws NullPointerException {
        SharedPreferences.Editor edit = MediaBrowserCompat$CustomActionResultReceiver.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public static void MediaBrowserCompat$ItemReceiver(String str, int i) throws NullPointerException {
        SharedPreferences.Editor edit = MediaBrowserCompat$CustomActionResultReceiver.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    public static String write(String str) {
        return MediaBrowserCompat$CustomActionResultReceiver.getString(str, (String) null);
    }
}
