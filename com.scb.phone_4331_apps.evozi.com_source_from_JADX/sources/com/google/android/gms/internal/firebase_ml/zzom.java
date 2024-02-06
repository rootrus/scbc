package com.google.android.gms.internal.firebase_ml;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.IOUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.common.modeldownload.FirebaseRemoteModel;
import java.io.IOException;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class zzom {
    private static final GmsLogger zzaoz = new GmsLogger("ModelInfoRetriever", "");

    static zzop zza(FirebaseApp firebaseApp, FirebaseRemoteModel firebaseRemoteModel, zzon zzon) throws FirebaseMLException {
        JSONObject jSONObject;
        HttpsURLConnection zza = zzou.zza(zza(firebaseApp, firebaseRemoteModel.getModelName(), zzon), zzon);
        if (zza == null) {
            return null;
        }
        String headerField = zza.getHeaderField("Content-Location");
        String headerField2 = zza.getHeaderField("ETag");
        GmsLogger gmsLogger = zzaoz;
        String valueOf = String.valueOf(headerField);
        gmsLogger.mo4172d("ModelInfoRetriever", valueOf.length() != 0 ? "Received download URL: ".concat(valueOf) : new String("Received download URL: "));
        if (headerField == null) {
            return null;
        }
        if (headerField2 != null) {
            firebaseRemoteModel.zzce(headerField2);
            try {
                String str = new String(IOUtils.readInputStreamFully(zza.getInputStream()));
                if (TextUtils.isEmpty(str)) {
                    str = "{}";
                }
                JSONObject jSONObject2 = new JSONObject(str);
                zzok zzok = jSONObject2.has("inferenceInfo") ? zzok.AUTOML : zzok.CUSTOM;
                if (zzok.equals(zzok.AUTOML) && (jSONObject = jSONObject2.getJSONObject("inferenceInfo")) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("labels");
                    if (jSONArray == null || jSONArray.length() == 0) {
                        throw new FirebaseMLException("Cannot parse AutoML model's labels from model downloading backend.", 13);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    zzob.zza(firebaseApp, firebaseRemoteModel.zzmj(), arrayList);
                }
                return new zzop(firebaseRemoteModel.zzmj(), Uri.parse(headerField), headerField2, zzok);
            } catch (IOException | JSONException e) {
                throw new FirebaseMLException("Failed to parse the model backend response message", 13, e);
            }
        } else {
            zzon.zza(zzmk.MODEL_INFO_DOWNLOAD_NO_HASH, false);
            throw new FirebaseMLException("No hash value for the custom model", 13);
        }
    }

    private static String zza(FirebaseApp firebaseApp, String str, zzon zzon) throws FirebaseMLException {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            FirebaseInstanceId instance = FirebaseInstanceId.getInstance(firebaseApp);
            if (instance == null) {
                zzaoz.mo4183w("ModelInfoRetriever", "Cannot get a valid instance of FirebaseInstanceId. Cannot retrieve model info.");
                return null;
            }
            String id = instance.getId();
            if (id == null) {
                zzaoz.mo4183w("ModelInfoRetriever", "Firebase instance id is null. Cannot retrieve model info.");
                return null;
            }
            try {
                String token = instance.getToken(gcmSenderId, "*");
                if (token == null) {
                    zzaoz.mo4183w("ModelInfoRetriever", "Firebase instance token is null. Cannot retrieve model info.");
                    return null;
                }
                return String.format("https://mlkit.googleapis.com/v1beta1/projects/%s/models/%s/versions/active?key=%s&app_instance_id=%s&app_instance_token=%s", new Object[]{firebaseApp.getOptions().getProjectId(), str, firebaseApp.getOptions().getApiKey(), id, token});
            } catch (IOException e) {
                zzon.zza(zzmk.MODEL_INFO_DOWNLOAD_CONNECTION_FAILED, false);
                throw new FirebaseMLException("Failed to get model URL", 13, e);
            }
        } else {
            throw new FirebaseMLException("GCM sender id cannot be null in FirebaseOptions. Please configure FirebaseApp properly.", 9);
        }
    }
}
