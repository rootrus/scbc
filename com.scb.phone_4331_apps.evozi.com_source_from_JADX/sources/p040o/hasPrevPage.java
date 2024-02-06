package p040o;

import android.content.SharedPreferences;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: o.hasPrevPage */
public final /* synthetic */ class hasPrevPage implements Interceptor {
    private final /* synthetic */ SharedPreferences MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ hasPrevPage(SharedPreferences sharedPreferences) {
        this.MediaBrowserCompat$ItemReceiver = sharedPreferences;
    }

    public final Response intercept(Interceptor.Chain chain) {
        return chain.proceed(chain.request().newBuilder().header("Content-Type", "application/json").header("Accept-Language", this.MediaBrowserCompat$ItemReceiver.getString("com.scb.phone.pref.key.LANGUAGE", "th")).header("scb-channel", "APP").build());
    }
}
