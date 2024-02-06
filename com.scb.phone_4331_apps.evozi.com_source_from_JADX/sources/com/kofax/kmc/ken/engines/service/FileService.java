package com.kofax.kmc.ken.engines.service;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import com.kofax.mobile.sdk._internal.C0767k;
import java.io.File;
import java.io.IOException;

public class FileService {
    private static final String TAG = FileService.class.getSimpleName();

    public static boolean deleteDirectory(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append("Deleting directory/file - ");
        sb.append(file.getAbsolutePath());
        C0767k.m1801b("UtilsService.deleteDirectory", sb.toString());
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String file2 : list) {
                if (!deleteDirectory(new File(file, file2))) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static String getDocumentPath(Context context) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return context.getFilesDir().getAbsolutePath();
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        externalStoragePublicDirectory.mkdirs();
        return externalStoragePublicDirectory.getAbsolutePath();
    }

    public static String getLocalPath(Context context) {
        return context.getFilesDir().getAbsolutePath();
    }

    public static boolean copyFile(String str, String str2) throws IOException {
        return copyFile(new File(str), new File(str2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFile(java.io.File r10, java.io.File r11) throws java.io.IOException {
        /*
            java.lang.String r0 = "rw"
            java.lang.String r1 = TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Copying from '"
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = "' to '"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = "'"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)
            boolean r1 = r11.exists()
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = TAG
            java.lang.String r2 = "... destination exists. Deleting."
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)
            r11.delete()
            r11.createNewFile()
            goto L_0x003c
        L_0x0039:
            r11.createNewFile()
        L_0x003c:
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0070 }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x0070 }
            java.nio.channels.FileChannel r10 = r2.getChannel()     // Catch:{ all -> 0x0070 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x006b }
            r2.<init>(r11, r0)     // Catch:{ all -> 0x006b }
            java.nio.channels.FileChannel r11 = r2.getChannel()     // Catch:{ all -> 0x006b }
            long r6 = r10.size()     // Catch:{ all -> 0x0068 }
            r4 = 0
            r3 = r10
            r8 = r11
            r3.transferTo(r4, r6, r8)     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x005f
            r10.close()
        L_0x005f:
            if (r11 == 0) goto L_0x0066
            r11.close()
            r10 = 1
            goto L_0x0067
        L_0x0066:
            r10 = 0
        L_0x0067:
            return r10
        L_0x0068:
            r0 = move-exception
            r1 = r11
            goto L_0x006c
        L_0x006b:
            r0 = move-exception
        L_0x006c:
            r9 = r1
            r1 = r10
            r10 = r9
            goto L_0x0073
        L_0x0070:
            r10 = move-exception
            r0 = r10
            r10 = r1
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()
        L_0x0078:
            if (r10 == 0) goto L_0x007d
            r10.close()
        L_0x007d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.ken.engines.service.FileService.copyFile(java.io.File, java.io.File):boolean");
    }

    public static String getFileNameByUri(Uri uri, Context context) {
        C0767k.m1801b(TAG, "Getting filename from uri...");
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("... schema -> ");
        sb.append(uri.getScheme().toString());
        C0767k.m1801b(str, sb.toString());
        String str2 = null;
        if (uri.getScheme().toString().compareTo("content") == 0) {
            Cursor query = context.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            if (query.moveToFirst()) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                String str3 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("... column_index -> ");
                sb2.append(columnIndexOrThrow);
                C0767k.m1801b(str3, sb2.toString());
                str2 = Uri.parse(query.getString(columnIndexOrThrow)).getPath();
            }
        } else if (uri.getScheme().compareTo("file") == 0) {
            str2 = uri.getPath();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append((String) null);
            sb3.append("_");
            sb3.append(uri.getLastPathSegment().toString());
            str2 = sb3.toString();
        }
        String str4 = TAG;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("... fileName -> ");
        sb4.append(str2);
        C0767k.m1801b(str4, sb4.toString());
        return str2;
    }
}
