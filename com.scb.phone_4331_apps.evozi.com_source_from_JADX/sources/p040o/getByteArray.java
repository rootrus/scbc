package p040o;

import android.os.SystemClock;
import com.scb.phone.domain.errors.RetrofitException;
import java.io.IOException;
import java.util.UUID;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p039io.beid.beidk.definitions.SCBHeader;

/* renamed from: o.getByteArray */
public final class getByteArray implements Interceptor {
    private count$MediaBrowserCompat$CustomActionResultReceiver read;

    @HmlPinActivity
    public getByteArray(count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        this.read = count_mediabrowsercompat_customactionresultreceiver;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        zzro zzro;
        String str;
        String str2;
        Request request = chain.request();
        RetrofitException.MediaBrowserCompat$ItemReceiver();
        count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver = this.read;
        String str3 = null;
        if (SystemClock.elapsedRealtime() - count_mediabrowsercompat_customactionresultreceiver.read > 600000) {
            zzro = null;
        } else {
            zzro = count_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
        }
        Request.Builder newBuilder = request.newBuilder();
        String str4 = this.read.IconCompatParcelizer;
        if (str4 != null) {
            newBuilder.addHeader("Api-Auth", str4);
        }
        String MediaBrowserCompat$CustomActionResultReceiver = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            newBuilder.addHeader("user-agent", MediaBrowserCompat$CustomActionResultReceiver);
        }
        String str5 = this.read.write;
        if (str5 != null) {
            newBuilder.addHeader(SCBHeader.SCB_REQ_HEADER_SESSION_ID, str5);
        }
        String obj = UUID.randomUUID().toString();
        if (this.read.MediaBrowserCompat$CustomActionResultReceiver.getBoolean("com.scb.phone.pref.key.WIREMOCK", false)) {
            obj = "wiremock-".concat(obj.substring(9));
        }
        if (obj != null) {
            newBuilder.addHeader(SCBHeader.SCB_REQ_HEADER_REQUEST_ID, obj);
        }
        if (zzro != null) {
            str = String.valueOf(zzro.IconCompatParcelizer);
        } else {
            str = null;
        }
        if (str != null) {
            newBuilder.addHeader("latitude", str);
        }
        if (zzro != null) {
            str2 = String.valueOf(zzro.write);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            newBuilder.addHeader("longitude", str2);
        }
        if (zzro != null) {
            str3 = String.valueOf(zzro.MediaBrowserCompat$CustomActionResultReceiver);
        }
        if (str3 != null) {
            newBuilder.addHeader("accuracy", str3);
        }
        return chain.proceed(newBuilder.build());
    }
}
