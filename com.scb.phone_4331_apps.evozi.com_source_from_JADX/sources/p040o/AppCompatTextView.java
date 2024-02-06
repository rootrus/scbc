package p040o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

/* renamed from: o.AppCompatTextView */
public class AppCompatTextView extends ContentProvider {
    private static HashMap<String, read> IconCompatParcelizer = new HashMap<>();
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"_display_name", "_size"};
    private static final File MediaBrowserCompat$ItemReceiver = new File("/");
    private read write;

    /* renamed from: o.AppCompatTextView$read */
    interface read {
        File IconCompatParcelizer(Uri uri);

        Uri write(File file);
    }

    public boolean onCreate() {
        return true;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.write = MediaBrowserCompat$ItemReceiver(context, providerInfo.authority);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public static Uri IconCompatParcelizer(Context context, String str, File file) {
        return MediaBrowserCompat$ItemReceiver(context, str).write(file);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File IconCompatParcelizer2 = this.write.IconCompatParcelizer(uri);
        if (strArr == null) {
            strArr = MediaBrowserCompat$CustomActionResultReceiver;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = IconCompatParcelizer2.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(IconCompatParcelizer2.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            o.AppCompatTextView$read r0 = r2.write
            java.io.File r3 = r0.IconCompatParcelizer(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0027
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0027
            return r3
        L_0x0027:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatTextView.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.write.IconCompatParcelizer(uri).delete() ? 1 : 0;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int i;
        File IconCompatParcelizer2 = this.write.IconCompatParcelizer(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        return ParcelFileDescriptor.open(IconCompatParcelizer2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        IconCompatParcelizer.put(r12, r1);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0106, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010e, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0106 A[ExcHandler: XmlPullParserException (r11v3 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:5:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static p040o.AppCompatTextView.read MediaBrowserCompat$ItemReceiver(android.content.Context r11, java.lang.String r12) {
        /*
            java.util.HashMap<java.lang.String, o.AppCompatTextView$read> r0 = IconCompatParcelizer
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, o.AppCompatTextView$read> r1 = IconCompatParcelizer     // Catch:{ all -> 0x011a }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ all -> 0x011a }
            o.AppCompatTextView$read r1 = (p040o.AppCompatTextView.read) r1     // Catch:{ all -> 0x011a }
            if (r1 != 0) goto L_0x0118
            o.AppCompatTextView$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.AppCompatTextView$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r1.<init>(r12)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            android.content.pm.PackageManager r2 = r11.getPackageManager()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r12, r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            android.content.pm.PackageManager r3 = r11.getPackageManager()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.String r4 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r2 = r2.loadXmlMetaData(r3, r4)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r2 == 0) goto L_0x00fe
        L_0x0028:
            int r3 = r2.next()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r4 = 1
            if (r3 == r4) goto L_0x00f8
            r5 = 2
            if (r3 != r5) goto L_0x0028
            java.lang.String r3 = r2.getName()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.String r5 = "name"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.String r7 = "path"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.String r8 = "root-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r9 = 0
            if (r8 == 0) goto L_0x004f
            java.io.File r6 = MediaBrowserCompat$ItemReceiver     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            goto L_0x00b1
        L_0x004f:
            java.lang.String r8 = "files-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r8 == 0) goto L_0x005c
            java.io.File r6 = r11.getFilesDir()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            goto L_0x00b1
        L_0x005c:
            java.lang.String r8 = "cache-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r8 == 0) goto L_0x0069
            java.io.File r6 = r11.getCacheDir()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            goto L_0x00b1
        L_0x0069:
            java.lang.String r8 = "external-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r8 == 0) goto L_0x0076
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            goto L_0x00b1
        L_0x0076:
            java.lang.String r8 = "external-files-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r8 == 0) goto L_0x0088
            java.io.File[] r3 = p040o.setLastBaselineToBottomHeight.MediaBrowserCompat$CustomActionResultReceiver(r11, r6)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            int r8 = r3.length     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r8 <= 0) goto L_0x00b1
            r6 = r3[r9]     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            goto L_0x00b1
        L_0x0088:
            java.lang.String r8 = "external-cache-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r8 == 0) goto L_0x009a
            java.io.File[] r3 = p040o.setLastBaselineToBottomHeight.IconCompatParcelizer(r11)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            int r8 = r3.length     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r8 <= 0) goto L_0x00b1
            r6 = r3[r9]     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            goto L_0x00b1
        L_0x009a:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r10 = 21
            if (r8 < r10) goto L_0x00b1
            java.lang.String r8 = "external-media-path"
            boolean r3 = r8.equals(r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r3 == 0) goto L_0x00b1
            java.io.File[] r3 = r11.getExternalMediaDirs()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            int r8 = r3.length     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r8 <= 0) goto L_0x00b1
            r6 = r3[r9]     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
        L_0x00b1:
            if (r6 == 0) goto L_0x0028
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r3[r9] = r7     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r4 = r9
        L_0x00b8:
            if (r4 > 0) goto L_0x00c7
            r7 = r3[r9]     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r7 == 0) goto L_0x00c4
            java.io.File r8 = new java.io.File     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r8.<init>(r6, r7)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r6 = r8
        L_0x00c4:
            int r4 = r4 + 1
            goto L_0x00b8
        L_0x00c7:
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            if (r3 != 0) goto L_0x00f0
            java.io.File r3 = r6.getCanonicalFile()     // Catch:{ IOException -> 0x00d8, XmlPullParserException -> 0x0106 }
            java.util.HashMap<java.lang.String, java.io.File> r4 = r1.IconCompatParcelizer     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r4.put(r5, r3)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            goto L_0x0028
        L_0x00d8:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r12.<init>()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.String r1 = "Failed to resolve canonical path for "
            r12.append(r1)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r12.append(r6)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            r1.<init>(r12, r11)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            throw r1     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
        L_0x00f0:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.String r12 = "Name must not be empty"
            r11.<init>(r12)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            throw r11     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
        L_0x00f8:
            java.util.HashMap<java.lang.String, o.AppCompatTextView$read> r11 = IconCompatParcelizer     // Catch:{ all -> 0x011a }
            r11.put(r12, r1)     // Catch:{ all -> 0x011a }
            goto L_0x0118
        L_0x00fe:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            java.lang.String r12 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r11.<init>(r12)     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
            throw r11     // Catch:{ IOException -> 0x010f, XmlPullParserException -> 0x0106 }
        L_0x0106:
            r11 = move-exception
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r12.<init>(r1, r11)     // Catch:{ all -> 0x011a }
            throw r12     // Catch:{ all -> 0x011a }
        L_0x010f:
            r11 = move-exception
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x011a }
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r12.<init>(r1, r11)     // Catch:{ all -> 0x011a }
            throw r12     // Catch:{ all -> 0x011a }
        L_0x0118:
            monitor-exit(r0)
            return r1
        L_0x011a:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AppCompatTextView.MediaBrowserCompat$ItemReceiver(android.content.Context, java.lang.String):o.AppCompatTextView$read");
    }
}
