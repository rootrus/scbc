package p040o;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Picasso$MediaBrowserCompat$ItemReceiver;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import p040o.zzlu;

/* renamed from: o.zaz */
public class zaz {
    public final Picasso read;

    @HmlPinActivity
    public zaz(Context context, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        OkHttpClient build = new OkHttpClient.Builder().addInterceptor(new getByteArray(count_mediabrowsercompat_customactionresultreceiver)).cache(new Cache(context.getCacheDir(), 50000000)).build();
        Picasso$MediaBrowserCompat$ItemReceiver picasso$MediaBrowserCompat$ItemReceiver = new Picasso$MediaBrowserCompat$ItemReceiver(context);
        zzlu.read read2 = new zzlu.read(build);
        if (picasso$MediaBrowserCompat$ItemReceiver.write == null) {
            picasso$MediaBrowserCompat$ItemReceiver.write = read2;
            this.read = picasso$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            return;
        }
        throw new IllegalStateException("Downloader already set.");
    }
}
