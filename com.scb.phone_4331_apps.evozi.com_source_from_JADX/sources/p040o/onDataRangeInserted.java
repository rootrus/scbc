package p040o;

import android.text.TextUtils;
import com.google.gson.Gson;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: o.onDataRangeInserted */
public final class onDataRangeInserted implements Interceptor {
    private static final Gson read = new Gson();
    private count$MediaBrowserCompat$CustomActionResultReceiver write;

    static {
        MediaType.parse("application/json; charset=utf-8");
    }

    @HmlPinActivity
    public onDataRangeInserted(count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        this.write = count_mediabrowsercompat_customactionresultreceiver;
    }

    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Response proceed = chain.proceed(chain.request());
        ResponseBody peekBody = proceed.peekBody(Long.MAX_VALUE);
        String header = proceed.header("Api-Auth");
        String header2 = proceed.header("Api-Refresh");
        boolean z = false;
        if (!(header == null || header.length() == 0)) {
            count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver = this.write;
            if (!TextUtils.isEmpty(header)) {
                count_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = header;
            }
        }
        if (header2 == null || header2.length() == 0) {
            z = true;
        }
        if (!z) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver.edit().putString("com.scb.phone.pref.key.API_REFRESH", header2).commit();
        }
        if (!proceed.isSuccessful() && !proceed.isRedirect()) {
            return proceed;
        }
        try {
            setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) read.fromJson(peekBody.charStream(), setCurrentItemInternal.class);
            if (setcurrentiteminternal != null) {
                zabr.MediaBrowserCompat$ItemReceiver(setcurrentiteminternal);
            }
            return proceed;
        } catch (Exception e) {
            onCheckBoxClick.write((Throwable) e);
            return proceed;
        }
    }
}
