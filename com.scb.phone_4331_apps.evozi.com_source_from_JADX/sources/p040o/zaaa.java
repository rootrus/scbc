package p040o;

import android.os.Build;
import java.net.URI;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* renamed from: o.zaaa */
public final class zaaa {
    private static final Pattern MediaBrowserCompat$CustomActionResultReceiver = Pattern.compile("^[^.]*\\.(.*)$");
    private final onDataRangeInserted IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$MediaItem;
    private final removeObserver MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private OkHttpClient.Builder f2978x50fd9e4a;
    private Interceptor MediaDescriptionCompat;
    private final Converter.Factory MediaMetadataCompat;
    private final getByteArray MediaSessionCompat$QueueItem;
    private final boolean MediaSessionCompat$ResultReceiverWrapper;
    private final CallAdapter.Factory MediaSessionCompat$Token;
    private Retrofit.Builder ParcelableVolumeInfo;
    private final Interceptor RatingCompat;
    public Retrofit read;
    private final hasObservers write;

    public zaaa(String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2, boolean z) {
        this(str, interceptor, getbytearray, hasobservers, ondatarangeinserted, removeobserver, factory, factory2, 30, z);
    }

    public zaaa(String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2, int i, boolean z) {
        this.MediaBrowserCompat$MediaItem = str;
        this.RatingCompat = interceptor;
        this.MediaSessionCompat$QueueItem = getbytearray;
        this.write = hasobservers;
        this.IconCompatParcelizer = ondatarangeinserted;
        this.MediaBrowserCompat$SearchResultReceiver = removeobserver;
        this.MediaMetadataCompat = factory;
        this.MediaSessionCompat$Token = factory2;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaSessionCompat$ResultReceiverWrapper = z;
        MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat);
        this.read = this.ParcelableVolumeInfo.build();
    }

    public zaaa(String str, Interceptor interceptor, getByteArray getbytearray, hasObservers hasobservers, onDataRangeInserted ondatarangeinserted, removeObserver removeobserver, Converter.Factory factory, CallAdapter.Factory factory2, Interceptor interceptor2) {
        this.MediaBrowserCompat$MediaItem = str;
        this.RatingCompat = interceptor;
        this.MediaSessionCompat$QueueItem = getbytearray;
        this.write = hasobservers;
        this.IconCompatParcelizer = ondatarangeinserted;
        this.MediaBrowserCompat$SearchResultReceiver = removeobserver;
        this.MediaMetadataCompat = factory;
        this.MediaSessionCompat$Token = factory2;
        this.MediaBrowserCompat$ItemReceiver = 30;
        this.MediaDescriptionCompat = interceptor2;
        this.MediaSessionCompat$ResultReceiverWrapper = true;
        MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem, this.MediaMetadataCompat);
        this.read = this.ParcelableVolumeInfo.build();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().addInterceptor(this.RatingCompat).addInterceptor(this.MediaSessionCompat$QueueItem).addInterceptor(this.MediaBrowserCompat$SearchResultReceiver).addInterceptor(this.write);
        this.f2978x50fd9e4a = addInterceptor;
        Interceptor interceptor = this.MediaDescriptionCompat;
        if (interceptor != null) {
            addInterceptor.addInterceptor(interceptor);
        }
        this.f2978x50fd9e4a.addInterceptor(this.IconCompatParcelizer);
        if (Build.VERSION.SDK_INT < 24 && this.MediaSessionCompat$ResultReceiverWrapper) {
            String host = URI.create(this.MediaBrowserCompat$MediaItem).getHost();
            CertificatePinner build = new CertificatePinner.Builder().add(MediaBrowserCompat$CustomActionResultReceiver.matcher(host).replaceFirst("*.$1"), "sha256/980Ionqp3wkYtN9SZVgMzuWQzJta1nfxNPwTem1X0uc=").build();
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                SSLContext instance2 = SSLContext.getInstance("TLS");
                GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache((X509TrustManager) instance.getTrustManagers()[0], host);
                instance2.init((KeyManager[]) null, new TrustManager[]{googleApiAvailabilityCache}, (SecureRandom) null);
                this.f2978x50fd9e4a.certificatePinner(build);
                this.f2978x50fd9e4a.sslSocketFactory(instance2.getSocketFactory(), googleApiAvailabilityCache);
            } catch (NoSuchAlgorithmException e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            } catch (KeyStoreException e2) {
                onCheckBoxClick.IconCompatParcelizer(e2);
            } catch (KeyManagementException e3) {
                onCheckBoxClick.IconCompatParcelizer(e3);
            }
        }
        this.f2978x50fd9e4a.readTimeout((long) this.MediaBrowserCompat$ItemReceiver, TimeUnit.SECONDS).connectTimeout((long) this.MediaBrowserCompat$ItemReceiver, TimeUnit.SECONDS);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(String str, Converter.Factory factory) {
        this.ParcelableVolumeInfo = new Retrofit.Builder().baseUrl(str).addConverterFactory(factory).client(this.f2978x50fd9e4a.build()).addCallAdapterFactory(this.MediaSessionCompat$Token);
    }
}
