package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class IdManager implements InstallIdProvider {
    private static final String FORWARD_SLASH_REGEX = Pattern.quote("/");
    private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
    private final Context appContext;
    private final String appIdentifier;
    private String crashlyticsInstallId;
    private final FirebaseInstanceIdInternal firebaseInstallId;
    private final InstallerPackageNameProvider installerPackageNameProvider;

    public IdManager(Context context, String str, FirebaseInstanceIdInternal firebaseInstanceIdInternal) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.appContext = context;
            this.appIdentifier = str;
            this.firebaseInstallId = firebaseInstanceIdInternal;
            this.installerPackageNameProvider = new InstallerPackageNameProvider();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    private static String formatId(String str) {
        if (str == null) {
            return null;
        }
        return ID_PATTERN.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public String getCrashlyticsInstallId() {
        synchronized (this) {
            if (this.crashlyticsInstallId != null) {
                String str = this.crashlyticsInstallId;
                return str;
            }
            SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.appContext);
            String id = this.firebaseInstallId.getId();
            String string = sharedPrefs.getString("firebase.installation.id", (String) null);
            if (string == null) {
                SharedPreferences legacySharedPrefs = CommonUtils.getLegacySharedPrefs(this.appContext);
                String string2 = legacySharedPrefs.getString("crashlytics.installation.id", (String) null);
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder();
                sb.append("No cached FID; legacy id is ");
                sb.append(string2);
                logger.mo8866d(sb.toString());
                if (string2 == null) {
                    this.crashlyticsInstallId = createAndStoreIid(id, sharedPrefs);
                } else {
                    this.crashlyticsInstallId = string2;
                    migrateLegacyId(string2, id, sharedPrefs, legacySharedPrefs);
                }
                String str2 = this.crashlyticsInstallId;
                return str2;
            }
            if (string.equals(id)) {
                this.crashlyticsInstallId = sharedPrefs.getString("crashlytics.installation.id", (String) null);
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Found matching FID, using Crashlytics IID: ");
                sb2.append(this.crashlyticsInstallId);
                logger2.mo8866d(sb2.toString());
                if (this.crashlyticsInstallId == null) {
                    this.crashlyticsInstallId = createAndStoreIid(id, sharedPrefs);
                }
            } else {
                this.crashlyticsInstallId = createAndStoreIid(id, sharedPrefs);
            }
            String str3 = this.crashlyticsInstallId;
            return str3;
        }
    }

    private void migrateLegacyId(String str, String str2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        synchronized (this) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Migrating legacy Crashlytics IID: ");
            sb.append(str);
            logger.mo8866d(sb.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", str).putString("firebase.installation.id", str2).apply();
            sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
        }
    }

    private String createAndStoreIid(String str, SharedPreferences sharedPreferences) {
        String formatId;
        synchronized (this) {
            formatId = formatId(UUID.randomUUID().toString());
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Created new Crashlytics IID: ");
            sb.append(formatId);
            logger.mo8866d(sb.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", formatId).putString("firebase.installation.id", str).apply();
        }
        return formatId;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", new Object[]{removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL)});
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    public String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }
}
