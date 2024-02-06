package p039io.realm.internal;

import java.io.File;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import p039io.realm.log.RealmLog;
import p040o.HmlNTBBusinessOccupationInfoActivity;
import p040o.HmlNTBCaptureDocumentActivity;

/* renamed from: io.realm.internal.Util */
public class Util {
    static native String nativeGetTablePrefix();

    public static String read() {
        return nativeGetTablePrefix();
    }

    public static Class<? extends HmlNTBCaptureDocumentActivity> MediaBrowserCompat$ItemReceiver(Class<? extends HmlNTBCaptureDocumentActivity> cls) {
        if (cls.equals(HmlNTBCaptureDocumentActivity.class) || cls.equals(HmlNTBBusinessOccupationInfoActivity.class)) {
            throw new IllegalArgumentException("RealmModel or RealmObject was passed as an argument. Only subclasses of these can be used as arguments to methods that accept a Realm model class.");
        }
        Class<? super Object> superclass = cls.getSuperclass();
        return (superclass.equals(Object.class) || superclass.equals(HmlNTBBusinessOccupationInfoActivity.class)) ? cls : superclass;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean write(String str, File file, String str2) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(".management");
        File file2 = new File(file, sb.toString());
        File file3 = new File(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".note");
        File file4 = new File(sb2.toString());
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            for (File file5 : listFiles) {
                if (!file5.delete()) {
                    RealmLog.IconCompatParcelizer(String.format(Locale.ENGLISH, "Realm temporary file at %s cannot be deleted", new Object[]{file5.getAbsolutePath()}), new Object[0]);
                }
            }
        }
        if (file2.exists() && !file2.delete()) {
            RealmLog.IconCompatParcelizer(String.format(Locale.ENGLISH, "Realm temporary folder at %s cannot be deleted", new Object[]{file2.getAbsolutePath()}), new Object[0]);
        }
        if (file3.exists()) {
            z = file3.delete();
            if (!z) {
                RealmLog.IconCompatParcelizer(String.format(Locale.ENGLISH, "Realm file at %s cannot be deleted", new Object[]{file3.getAbsolutePath()}), new Object[0]);
            }
        } else {
            z = true;
        }
        if (file4.exists() && !file4.delete()) {
            RealmLog.IconCompatParcelizer(String.format(Locale.ENGLISH, ".note file at %s cannot be deleted", new Object[]{file4.getAbsolutePath()}), new Object[0]);
        }
        return z;
    }

    public static <T> Set<T> MediaBrowserCompat$ItemReceiver(T... tArr) {
        return new LinkedHashSet();
    }
}
