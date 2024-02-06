package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStoreImpl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

public class CachedSettingsIo {
    private final Context context;

    public CachedSettingsIo(Context context2) {
        this.context = context2;
    }

    private File getSettingsFile() {
        return new File(new FileStoreImpl(this.context).getFilesDir(), "com.crashlytics.settings.json");
    }

    public JSONObject readCachedSettings() {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Logger.getLogger().mo8866d("Reading cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File settingsFile = getSettingsFile();
            if (settingsFile.exists()) {
                fileInputStream = new FileInputStream(settingsFile);
                try {
                    jSONObject = new JSONObject(CommonUtils.streamToString(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        Logger.getLogger().mo8869e("Failed to fetch cached settings", e);
                        CommonUtils.closeOrLog(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        CommonUtils.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                Logger.getLogger().mo8866d("No cached settings found.");
                jSONObject = null;
            }
            CommonUtils.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            Logger.getLogger().mo8869e("Failed to fetch cached settings", e);
            CommonUtils.closeOrLog(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.closeOrLog(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public void writeCachedSettings(long j, JSONObject jSONObject) {
        Throwable th;
        Exception e;
        Logger.getLogger().mo8866d("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(getSettingsFile());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e2) {
                    e = e2;
                    fileWriter = fileWriter2;
                    try {
                        Logger.getLogger().mo8869e("Failed to cache settings", e);
                        CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter2 = fileWriter;
                        CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    CommonUtils.closeOrLog(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                Logger.getLogger().mo8869e("Failed to cache settings", e);
                CommonUtils.closeOrLog(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
