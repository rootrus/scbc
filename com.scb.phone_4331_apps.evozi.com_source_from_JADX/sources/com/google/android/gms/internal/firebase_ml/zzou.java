package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.IOUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.common.modeldownload.FirebaseRemoteModel;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;

public final class zzou {
    private static final GmsLogger zzaoz = new GmsLogger("RmModelInfoRetriever", "");

    static zzop zzb(FirebaseApp firebaseApp, FirebaseRemoteModel firebaseRemoteModel, zzon zzon) throws FirebaseMLException {
        if (firebaseRemoteModel.zzmk()) {
            return zzof.zza(firebaseRemoteModel, zzon);
        }
        return zzom.zza(firebaseApp, firebaseRemoteModel, zzon);
    }

    static HttpsURLConnection zza(String str, zzon zzon) throws FirebaseMLException {
        String str2;
        if (str == null) {
            return null;
        }
        try {
            zzoy zzoy = new zzoy(str);
            GmsLogger gmsLogger = zzaoz;
            String valueOf = String.valueOf(str);
            gmsLogger.mo4172d("RmModelInfoRetriever", valueOf.length() != 0 ? "Checking model URL: ".concat(valueOf) : new String("Checking model URL: "));
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) zzoy.openConnection();
            httpsURLConnection.setConnectTimeout(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
            httpsURLConnection.connect();
            if (httpsURLConnection.getResponseCode() == 200 || httpsURLConnection.getResponseCode() == 304) {
                return httpsURLConnection;
            }
            zzon.zza(zzmk.MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS, false);
            InputStream errorStream = httpsURLConnection.getErrorStream();
            if (errorStream == null) {
                str2 = "";
            } else {
                str2 = new String(IOUtils.readInputStreamFully(errorStream));
            }
            throw new FirebaseMLException(String.format(Locale.getDefault(), "Failed to connect to Firebase ML console server with HTTP status code: %d and error message: %s", new Object[]{Integer.valueOf(httpsURLConnection.getResponseCode()), str2}), 13);
        } catch (SocketTimeoutException e) {
            zzon.zza(zzmk.TIME_OUT_FETCHING_MODEL_METADATA, false);
            throw new FirebaseMLException("Failed to get model URL due to time out", 13, e);
        } catch (IOException e2) {
            zzon.zza(zzmk.MODEL_INFO_DOWNLOAD_CONNECTION_FAILED, false);
            throw new FirebaseMLException("Failed to get model URL", 13, e2);
        }
    }
}
