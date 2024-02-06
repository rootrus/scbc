package com.google.android.gms.internal.firebase_messaging;

import com.airbnb.lottie.utils.Utils;
import com.google.android.gms.common.api.Api;
import com.kofax.mobile.sdk._internal.impl.camera.C0608h;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.tls.CipherSuite;

public final class zzn {
    private static final byte[] zza = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
    private static final int[] zzb = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, Utils.SECOND_IN_NANOS};
    private static final int[] zzc = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, Api.BaseClientBuilder.API_PRIORITY_OTHER};
    private static final int[] zzd = {1, 1, 2, 6, 24, 120, C0608h.f1446Ay, 5040, 40320, 362880, 3628800, 39916800, 479001600};
    private static int[] zze = {Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, 65536, 2345, 477, CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    public static int zza(int i, int i2) {
        long j = ((long) i) << 1;
        return j > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : j < -2147483648L ? PKIFailureInfo.systemUnavail : (int) j;
    }
}
