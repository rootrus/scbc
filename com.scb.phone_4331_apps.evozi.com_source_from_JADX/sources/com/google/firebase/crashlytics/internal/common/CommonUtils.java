package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

public class CommonUtils {
    public static final Comparator<File> FILE_MODIFIED_COMPARATOR = new Comparator<File>() {
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    };
    private static final char[] HEX_VALUES = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static long totalRamInBytes = -1;

    public static SharedPreferences getSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    public static SharedPreferences getLegacySharedPrefs(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String extractFieldFromSystemFile(java.io.File r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r6.exists()
            r2 = 0
            if (r1 == 0) goto L_0x005f
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            r3.<init>(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x0037 }
            if (r3 == 0) goto L_0x0055
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x0037 }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x0037 }
            int r4 = r3.length     // Catch:{ Exception -> 0x0037 }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x0037 }
            boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x0037 }
            if (r4 == 0) goto L_0x0015
            r6 = r3[r5]     // Catch:{ Exception -> 0x0037 }
            r2 = r6
            goto L_0x0055
        L_0x0037:
            r7 = move-exception
            goto L_0x003d
        L_0x0039:
            r6 = move-exception
            goto L_0x005b
        L_0x003b:
            r7 = move-exception
            r1 = r2
        L_0x003d:
            com.google.firebase.crashlytics.internal.Logger r3 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r4.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "Error parsing "
            r4.append(r5)     // Catch:{ all -> 0x0059 }
            r4.append(r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r4.toString()     // Catch:{ all -> 0x0059 }
            r3.mo8869e(r6, r7)     // Catch:{ all -> 0x0059 }
        L_0x0055:
            closeOrLog(r1, r0)
            goto L_0x005f
        L_0x0059:
            r6 = move-exception
            r2 = r1
        L_0x005b:
            closeOrLog(r2, r0)
            throw r6
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.CommonUtils.extractFieldFromSystemFile(java.io.File, java.lang.String):java.lang.String");
    }

    public static int getCpuArchitectureInt() {
        return Architecture.getValue().ordinal();
    }

    enum Architecture {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        
        private static final Map<String, Architecture> matcher = null;

        static {
            HashMap hashMap = new HashMap(4);
            matcher = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            matcher.put("armeabi", ARMV6);
            matcher.put("arm64-v8a", ARM64);
            matcher.put("x86", X86_32);
        }

        static Architecture getValue() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                Logger.getLogger().mo8866d("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            Architecture architecture = matcher.get(str.toLowerCase(Locale.US));
            return architecture == null ? UNKNOWN : architecture;
        }
    }

    public static long getTotalRamInBytes() {
        long j;
        synchronized (CommonUtils.class) {
            if (totalRamInBytes == -1) {
                String extractFieldFromSystemFile = extractFieldFromSystemFile(new File("/proc/meminfo"), "MemTotal");
                long j2 = 0;
                if (!TextUtils.isEmpty(extractFieldFromSystemFile)) {
                    String upperCase = extractFieldFromSystemFile.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = convertMemInfoToBytes(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = convertMemInfoToBytes(upperCase, "MB", PKIFailureInfo.badCertTemplate);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = convertMemInfoToBytes(upperCase, "GB", 1073741824);
                        } else {
                            Logger logger = Logger.getLogger();
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            logger.mo8866d(sb.toString());
                        }
                    } catch (NumberFormatException e) {
                        Logger logger2 = Logger.getLogger();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        logger2.mo8869e(sb2.toString(), e);
                    }
                }
                totalRamInBytes = j2;
            }
            j = totalRamInBytes;
        }
        return j;
    }

    static long convertMemInfoToBytes(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    public static ActivityManager.RunningAppProcessInfo getAppProcessInfo(String str, Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public static String streamToString(InputStream inputStream) throws IOException {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static String sha1(String str) {
        return hash(str, McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    public static String sha1(InputStream inputStream) {
        return hash(inputStream, McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    private static String hash(String str, String str2) {
        return hash(str.getBytes(), str2);
    }

    private static String hash(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return hexify(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            Logger.getLogger().mo8869e("Could not calculate hash for app icon.", e);
            return "";
        }
    }

    private static String hash(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return hexify(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(str);
            sb.append(", returning empty string.");
            logger.mo8869e(sb.toString(), e);
            return "";
        }
    }

    public static String createInstanceIdFrom(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String obj = sb.toString();
        if (obj.length() > 0) {
            return sha1(obj);
        }
        return null;
    }

    public static long calculateFreeRamInBytes(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static long calculateUsedDiskSpaceInBytes(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    public static boolean getProximitySensorEnabled(Context context) {
        if (!isEmulator(context) && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            return true;
        }
        return false;
    }

    public static boolean getBooleanResourceValue(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int resourcesIdentifier = getResourcesIdentifier(context, str, "bool");
            if (resourcesIdentifier > 0) {
                return resources.getBoolean(resourcesIdentifier);
            }
            int resourcesIdentifier2 = getResourcesIdentifier(context, str, "string");
            if (resourcesIdentifier2 > 0) {
                return Boolean.parseBoolean(context.getString(resourcesIdentifier2));
            }
        }
        return z;
    }

    public static int getResourcesIdentifier(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, getResourcePackageName(context));
    }

    public static boolean isEmulator(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    public static boolean isRooted(Context context) {
        boolean isEmulator = isEmulator(context);
        String str = Build.TAGS;
        if ((!isEmulator && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (isEmulator || !file.exists()) {
            return false;
        }
        return true;
    }

    public static boolean isDebuggerAttached() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static int getDeviceState(Context context) {
        boolean isEmulator = isEmulator(context);
        if (isRooted(context)) {
            isEmulator |= true;
        }
        return isDebuggerAttached() ? isEmulator | true ? 1 : 0 : isEmulator ? 1 : 0;
    }

    public static String hexify(byte[] bArr) {
        char[] cArr = new char[(bArr.length << 1)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i << 1;
            char[] cArr2 = HEX_VALUES;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public static String getStringsFileValue(Context context, String str) {
        int resourcesIdentifier = getResourcesIdentifier(context, str, "string");
        return resourcesIdentifier > 0 ? context.getString(resourcesIdentifier) : "";
    }

    public static void closeOrLog(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Logger.getLogger().mo8869e(str, e);
            }
        }
    }

    public static void flushOrLog(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                Logger.getLogger().mo8869e(str, e);
            }
        }
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.length() == 0;
    }

    public static String padWithZerosToMaxIntWidth(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String getResourcePackageName(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                return context.getResources().getResourcePackageName(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    public static String getMappingFileId(Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (resourcesIdentifier == 0) {
            resourcesIdentifier = getResourcesIdentifier(context, "com.crashlytics.android.build_id", "string");
        }
        if (resourcesIdentifier != 0) {
            return context.getResources().getString(resourcesIdentifier);
        }
        return null;
    }

    public static String resolveUnityEditorVersion(Context context) {
        int resourcesIdentifier = getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (resourcesIdentifier == 0) {
            return null;
        }
        String string = context.getResources().getString(resourcesIdentifier);
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append("Unity Editor version is: ");
        sb.append(string);
        logger.mo8866d(sb.toString());
        return string;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean checkPermission(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static boolean canTryConnection(Context context) {
        if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }
}
