package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

class MetaDataStore {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File filesDir;

    public MetaDataStore(File file) {
        this.filesDir = file;
    }

    public void writeUserData(String str, UserMetadata userMetadata) {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String userDataToJson = userDataToJson(userMetadata);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            try {
                bufferedWriter2.write(userDataToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().mo8869e("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.getLogger().mo8869e("Error serializing user metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        }
    }

    public UserMetadata readUserData(String str) {
        File userDataFileForSession = getUserDataFileForSession(str);
        if (!userDataFileForSession.exists()) {
            return new UserMetadata();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(userDataFileForSession);
            try {
                UserMetadata jsonToUserData = jsonToUserData(CommonUtils.streamToString(fileInputStream2));
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                return jsonToUserData;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    Logger.getLogger().mo8869e("Error deserializing user metadata.", e);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return new UserMetadata();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.getLogger().mo8869e("Error deserializing user metadata.", e);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return new UserMetadata();
        }
    }

    public File getUserDataFileForSession(String str) {
        File file = this.filesDir;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user");
        sb.append(".meta");
        return new File(file, sb.toString());
    }

    public File getKeysFileForSession(String str) {
        File file = this.filesDir;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys");
        sb.append(".meta");
        return new File(file, sb.toString());
    }

    private static UserMetadata jsonToUserData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        UserMetadata userMetadata = new UserMetadata();
        userMetadata.setUserId(valueOrNull(jSONObject, "userId"));
        return userMetadata;
    }

    private static String userDataToJson(final UserMetadata userMetadata) throws JSONException {
        return new JSONObject() {
            {
                put("userId", UserMetadata.this.getUserId());
            }
        }.toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }
}
