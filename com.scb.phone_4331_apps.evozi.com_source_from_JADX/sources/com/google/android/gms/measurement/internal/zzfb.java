package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.util.Clock;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class zzfb extends zzkg {
    private final SSLSocketFactory zzb;

    public zzfb(zzkj zzkj) {
        super(zzkj);
        this.zzb = Build.VERSION.SDK_INT < 19 ? new zzku() : null;
    }

    /* access modifiers changed from: protected */
    public final boolean zze() {
        return false;
    }

    public final boolean zzf() {
        NetworkInfo networkInfo;
        zzak();
        try {
            networkInfo = ((ConnectivityManager) zzn().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* access modifiers changed from: private */
    public static byte[] zza(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            return byteArrayOutputStream.toByteArray();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final HttpURLConnection zza(URL url) throws IOException {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            SSLSocketFactory sSLSocketFactory = this.zzb;
            if (sSLSocketFactory != null && (openConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(sSLSocketFactory);
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain HTTP connection");
    }

    public final /* bridge */ /* synthetic */ zzkn zzg() {
        return super.zzg();
    }

    /* renamed from: e_ */
    public final /* bridge */ /* synthetic */ zzo mo7440e_() {
        return super.mo7440e_();
    }

    public final /* bridge */ /* synthetic */ zzad zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfs zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    public final /* bridge */ /* synthetic */ void zzc() {
        super.zzc();
    }

    public final /* bridge */ /* synthetic */ void zzd() {
        super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzai zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzes zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzkr zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zzfv zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ zzeu zzr() {
        return super.zzr();
    }

    public final /* bridge */ /* synthetic */ zzfg zzs() {
        return super.zzs();
    }

    public final /* bridge */ /* synthetic */ zzy zzt() {
        return super.zzt();
    }

    public final /* bridge */ /* synthetic */ zzx zzu() {
        return super.zzu();
    }
}
