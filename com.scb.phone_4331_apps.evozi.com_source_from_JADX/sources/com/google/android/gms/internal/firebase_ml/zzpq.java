package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.firebase_ml.zzej;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class zzpq implements zznm<zzir, zzpn> {
    private static final GmsLogger zzaoz = new GmsLogger("ImageAnnotatorTask", "");
    private static final zzfo zzawr = new zzga();
    private static final zzge zzaws = zzgn.zzgx();
    private static final Map<FirebaseApp, zzpq> zzax = new HashMap();
    private final GoogleApiClient zzawp;
    /* access modifiers changed from: private */
    public String zzawt;
    private final boolean zzawu;
    private final zzip zzawv;
    private final String zzsq;

    public static zzpq zza(FirebaseApp firebaseApp, boolean z, GoogleApiClient googleApiClient) {
        zzpq zzpq;
        synchronized (zzpq.class) {
            zzpq = zzax.get(firebaseApp);
            if (zzpq == null) {
                zzpq = new zzpq(firebaseApp, z, googleApiClient);
                zzax.put(firebaseApp, zzpq);
            }
        }
        return zzpq;
    }

    public final zznw zzlm() {
        return null;
    }

    private zzpq(FirebaseApp firebaseApp, boolean z, GoogleApiClient googleApiClient) {
        this.zzawu = z;
        if (z) {
            this.zzawp = googleApiClient;
            this.zzawv = new zzpr(this);
        } else {
            this.zzawp = null;
            this.zzawv = new zzps(this, zzi(firebaseApp), firebaseApp);
        }
        this.zzsq = String.format("FirebaseML_%s", new Object[]{firebaseApp.getName()});
    }

    private static String zzi(FirebaseApp firebaseApp) {
        Bundle bundle;
        String apiKey = firebaseApp.getOptions().getApiKey();
        Context applicationContext = firebaseApp.getApplicationContext();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return apiKey;
            }
            String string = bundle.getString("com.firebase.ml.cloud.ApiKeyForDebug");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            return apiKey;
        } catch (PackageManager.NameNotFoundException e) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(applicationContext.getPackageName());
            gmsLogger.mo4175e("ImageAnnotatorTask", valueOf.length() != 0 ? "No such package: ".concat(valueOf) : new String("No such package: "), e);
            return apiKey;
        }
    }

    /* access modifiers changed from: private */
    public static String zza(Context context, String str) {
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, str);
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(str);
            gmsLogger.mo4174e("ImageAnnotatorTask", valueOf.length() != 0 ? "Could not get fingerprint hash: ".concat(valueOf) : new String("Could not get fingerprint hash: "));
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            GmsLogger gmsLogger2 = zzaoz;
            String valueOf2 = String.valueOf(str);
            gmsLogger2.mo4175e("ImageAnnotatorTask", valueOf2.length() != 0 ? "No such package: ".concat(valueOf2) : new String("No such package: "), e);
            return null;
        }
    }

    private final String getSpatulaHeader() throws FirebaseMLException {
        if (!this.zzawp.isConnected()) {
            this.zzawp.blockingConnect(3, TimeUnit.SECONDS);
        }
        try {
            return AuthProxy.ProxyApi.getSpatulaHeader(this.zzawp).await(3, TimeUnit.SECONDS).getSpatulaHeader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public final zzir zza(zzpn zzpn) throws FirebaseMLException {
        int i;
        zzis zzc = new zzis().zzc(Collections.singletonList(new zziq().zzb(zzpn.features).zza(new zzjd().zze(zzpn.zzawk)).zza(zzpn.imageContext)));
        int i2 = 14;
        try {
            zzik zzhl = ((zzil) new zzil(zzawr, zzaws, new zzpt(this)).zzn(this.zzsq)).zza(this.zzawv).zzhl();
            if (this.zzawu) {
                String spatulaHeader = getSpatulaHeader();
                this.zzawt = spatulaHeader;
                if (TextUtils.isEmpty(spatulaHeader)) {
                    zzaoz.mo4174e("ImageAnnotatorTask", "Failed to contact Google Play services for certificate fingerprint matching. Please ensure you have latest Google Play services installed");
                    throw new FirebaseMLException("Failed to contact Google Play services for certificate fingerprint matching. Please ensure you have latest Google Play services installed", 14);
                }
            }
            List<zzir> zzhp = ((zzit) new zzim(zzhl).zza(zzc).zzep()).zzhp();
            if (zzhp != null && zzhp.size() > 0) {
                return zzhp.get(0);
            }
            throw new FirebaseMLException("Empty response from cloud vision api.", 13);
        } catch (zzek e) {
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(e.zzei());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
            sb.append("batchAnnotateImages call failed with error: ");
            sb.append(valueOf);
            gmsLogger.mo4174e("ImageAnnotatorTask", sb.toString());
            if (this.zzawu) {
                Log.d("ImageAnnotatorTask", "If you are developing / testing on a simulator, either register your development app on Firebase console or turn off enforceCertFingerprintMatch()");
            }
            String message = e.getMessage();
            if (e.getStatusCode() != 400) {
                if (e.zzei() != null && e.zzei().zzef() != null) {
                    i2 = 13;
                    for (zzej.zza reason : e.zzei().zzef()) {
                        String reason2 = reason.getReason();
                        if (reason2 != null) {
                            if (reason2.equals("rateLimitExceeded") || reason2.equals("dailyLimitExceeded") || reason2.equals("userRateLimitExceeded")) {
                                i = 8;
                            } else {
                                if (!reason2.equals("accessNotConfigured")) {
                                    if (reason2.equals("forbidden") || reason2.equals("inactiveBillingState")) {
                                        message = String.format("If you haven't set up billing, please go to Firebase console to set up billing: %s. If you are specifying a debug Api Key override and turned on Api Key restrictions, make sure the restrictions are set up correctly", new Object[]{"https://firebase.corp.google.com/u/0/project/_/overview?purchaseBillingPlan=true"});
                                    }
                                }
                                i = 7;
                            }
                            i2 = i;
                            continue;
                        }
                        if (i2 != 13) {
                            break;
                        }
                    }
                } else {
                    i2 = 13;
                }
            }
            throw new FirebaseMLException(message, i2);
        } catch (IOException e2) {
            zzaoz.mo4175e("ImageAnnotatorTask", "batchAnnotateImages call failed with exception: ", e2);
            throw new FirebaseMLException("Cloud Vision batchAnnotateImages call failure", 13, e2);
        }
    }
}
