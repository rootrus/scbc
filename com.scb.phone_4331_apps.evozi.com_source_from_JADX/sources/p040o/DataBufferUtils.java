package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.network.p034di.NetworkModule;
import okhttp3.Interceptor;
import okhttp3.Response;

/* renamed from: o.DataBufferUtils */
public final /* synthetic */ class DataBufferUtils implements Interceptor {
    private final /* synthetic */ count$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ SharedPreferences MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DataBufferUtils(SharedPreferences sharedPreferences, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        this.MediaBrowserCompat$ItemReceiver = sharedPreferences;
        this.MediaBrowserCompat$CustomActionResultReceiver = count_mediabrowsercompat_customactionresultreceiver;
    }

    public final Response intercept(Interceptor.Chain chain) {
        return NetworkModule.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, chain);
    }
}
