package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class FirebaseInstallationServiceClient {
    private static final Pattern EXPIRATION_TIMESTAMP_PATTERN = Pattern.compile("[0-9]+s");
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final Context context;
    private final HeartBeatInfo heartbeatInfo;
    private final UserAgentPublisher userAgentPublisher;

    public FirebaseInstallationServiceClient(Context context2, UserAgentPublisher userAgentPublisher2, HeartBeatInfo heartBeatInfo) {
        this.context = context2;
        this.userAgentPublisher = userAgentPublisher2;
        this.heartbeatInfo = heartBeatInfo;
    }

    public InstallationResponse createFirebaseInstallation(String str, String str2, String str3, String str4, String str5) throws IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations", new Object[]{str3})}));
        while (i <= 1) {
            HttpURLConnection openHttpURLConnection = openHttpURLConnection(url, str);
            try {
                openHttpURLConnection.setRequestMethod("POST");
                openHttpURLConnection.setDoOutput(true);
                if (str5 != null) {
                    openHttpURLConnection.addRequestProperty("x-goog-fis-android-iid-migration-auth", str5);
                }
                writeFIDCreateRequestBodyToOutputStream(openHttpURLConnection, str2, str4);
                int responseCode = openHttpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InstallationResponse readCreateResponse = readCreateResponse(openHttpURLConnection);
                    openHttpURLConnection.disconnect();
                    return readCreateResponse;
                }
                logFisCommunicationError(openHttpURLConnection, str4, str, str3);
                if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                    i++;
                    openHttpURLConnection.disconnect();
                } else {
                    logBadConfigError();
                    return InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                }
            } finally {
                openHttpURLConnection.disconnect();
            }
        }
        throw new IOException();
    }

    private void writeFIDCreateRequestBodyToOutputStream(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
    }

    private static byte[] getJsonBytes(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static void writeRequestBodyToOutputStream(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
            } finally {
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        } else {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
    }

    private static JSONObject buildCreateFirebaseInstallationRequestBody(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.1");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(HttpURLConnection httpURLConnection) throws IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
    }

    private static JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    public TokenResult generateAuthToken(String str, String str2, String str3, String str4) throws IOException {
        int i = 0;
        URL url = new URL(String.format("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2})}));
        while (i <= 1) {
            HttpURLConnection openHttpURLConnection = openHttpURLConnection(url, str);
            try {
                openHttpURLConnection.setRequestMethod("POST");
                StringBuilder sb = new StringBuilder();
                sb.append("FIS_v2 ");
                sb.append(str4);
                openHttpURLConnection.addRequestProperty("Authorization", sb.toString());
                writeGenerateAuthTokenRequestBodyToOutputStream(openHttpURLConnection);
                int responseCode = openHttpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    TokenResult readGenerateAuthTokenResponse = readGenerateAuthTokenResponse(openHttpURLConnection);
                    openHttpURLConnection.disconnect();
                    return readGenerateAuthTokenResponse;
                }
                logFisCommunicationError(openHttpURLConnection, (String) null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    TokenResult build = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                    openHttpURLConnection.disconnect();
                    return build;
                } else if (responseCode == 429 || (responseCode >= 500 && responseCode < 600)) {
                    i++;
                    openHttpURLConnection.disconnect();
                } else {
                    logBadConfigError();
                    return TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                }
            } finally {
                openHttpURLConnection.disconnect();
            }
        }
        throw new IOException();
    }

    private static void logBadConfigError() {
        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private HttpURLConnection openHttpURLConnection(URL url, String str) throws IOException {
        HeartBeatInfo.HeartBeat heartBeatCode;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.addRequestProperty("Content-Type", "application/json");
        httpURLConnection.addRequestProperty("Accept", "application/json");
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("X-Android-Package", this.context.getPackageName());
        HeartBeatInfo heartBeatInfo = this.heartbeatInfo;
        if (!(heartBeatInfo == null || this.userAgentPublisher == null || (heartBeatCode = heartBeatInfo.getHeartBeatCode("fire-installations-id")) == HeartBeatInfo.HeartBeat.NONE)) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.userAgentPublisher.getUserAgent());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(heartBeatCode.getCode()));
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", getFingerprintHashForPackage());
        httpURLConnection.addRequestProperty("x-goog-api-key", str);
        return httpURLConnection;
    }

    private InstallationResponse readCreateResponse(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                builder2.setUri(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    private TokenResult readGenerateAuthTokenResponse(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, UTF_8));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
    }

    private String getFingerprintHashForPackage() {
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(this.context, this.context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get fingerprint hash for package: ");
            sb.append(this.context.getPackageName());
            Log.e("ContentValues", sb.toString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No such package: ");
            sb2.append(this.context.getPackageName());
            Log.e("ContentValues", sb2.toString(), e);
            return null;
        }
    }

    static long parseTokenExpirationTimestamp(String str) {
        Preconditions.checkArgument(EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static void logFisCommunicationError(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        String readErrorResponse = readErrorResponse(httpURLConnection);
        if (!TextUtils.isEmpty(readErrorResponse)) {
            Log.w("Firebase-Installations", readErrorResponse);
            Log.w("Firebase-Installations", availableFirebaseOptions(str, str2, str3));
        }
    }

    private static String availableFirebaseOptions(String str, String str2, String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(str);
            str4 = sb.toString();
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readErrorResponse(java.net.HttpURLConnection r6) {
        /*
            java.io.InputStream r0 = r6.getErrorStream()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = UTF_8
            r3.<init>(r0, r4)
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r0.<init>()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
        L_0x0019:
            java.lang.String r3 = r2.readLine()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            if (r3 == 0) goto L_0x0028
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3 = 10
            r0.append(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            goto L_0x0019
        L_0x0028:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4 = 0
            int r5 = r6.getResponseCode()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3[r4] = r5     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r4 = 1
            java.lang.String r6 = r6.getResponseMessage()     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r3[r4] = r6     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r6 = 2
            r3[r6] = r0     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            java.lang.String r6 = "Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]"
            java.lang.String r6 = java.lang.String.format(r6, r3)     // Catch:{ IOException -> 0x004f, all -> 0x004a }
            r2.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            return r6
        L_0x004a:
            r6 = move-exception
            r2.close()     // Catch:{ IOException -> 0x004e }
        L_0x004e:
            throw r6
        L_0x004f:
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.FirebaseInstallationServiceClient.readErrorResponse(java.net.HttpURLConnection):java.lang.String");
    }
}
