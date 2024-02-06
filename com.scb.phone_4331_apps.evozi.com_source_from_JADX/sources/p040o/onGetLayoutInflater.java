package p040o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: o.onGetLayoutInflater */
public final class onGetLayoutInflater {
    private static String MediaBrowserCompat$ItemReceiver = "th";
    private static String write = Locale.ENGLISH.getLanguage();

    public static void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        MediaBrowserCompat$ItemReceiver = str;
    }

    public static String read() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static void write(Context context, String str) {
        write = str;
        SharedPreferences.Editor edit = context.getSharedPreferences("pref_language", 0).edit();
        edit.putString("com.scb.phone.pref.key.LANGUAGE", str);
        edit.apply();
    }

    public static String IconCompatParcelizer() {
        return write;
    }

    public static ContextWrapper write(Context context) {
        return new ContextWrapper(AlertController$RecycleListView.write(context));
    }

    public static int MediaBrowserCompat$ItemReceiver() {
        if (new Locale(write.toLowerCase(Locale.getDefault())).equals(new Locale("th"))) {
            return 1;
        }
        return Calendar.getInstance(new Locale(write.toLowerCase(Locale.getDefault()))).getFirstDayOfWeek();
    }

    public static String read(Context context) {
        return context.getSharedPreferences("pref_language", 0).getString("com.scb.phone.pref.key.LANGUAGE", MediaBrowserCompat$ItemReceiver);
    }

    public static Locale write() {
        return new Locale(write.toLowerCase(Locale.getDefault()));
    }

    public static Locale IconCompatParcelizer(Context context) {
        return new Locale(context.getSharedPreferences("pref_language", 0).getString("com.scb.phone.pref.key.LANGUAGE", MediaBrowserCompat$ItemReceiver).toLowerCase(Locale.getDefault()));
    }
}
