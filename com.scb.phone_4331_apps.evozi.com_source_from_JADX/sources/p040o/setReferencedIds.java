package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: o.setReferencedIds */
final class setReferencedIds implements Closeable {
    private final FileChannel IconCompatParcelizer;
    private final File MediaBrowserCompat$CustomActionResultReceiver;
    private final RandomAccessFile MediaBrowserCompat$ItemReceiver;
    private final long RatingCompat;
    private final File read;
    private final FileLock write;

    /* renamed from: o.setReferencedIds$IconCompatParcelizer */
    static class IconCompatParcelizer extends File {
        public long write = -1;

        public IconCompatParcelizer(File file, String str) {
            super(file, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        android.util.Log.w("MultiDex", "Failed to close resource", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        r8 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a2 A[ExcHandler: Error | RuntimeException (e java.lang.Throwable), Splitter:B:4:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    setReferencedIds(java.io.File r8, java.io.File r9) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to close resource"
            r7.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MultiDexExtractor("
            r1.append(r2)
            java.lang.String r2 = r8.getPath()
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.String r2 = r9.getPath()
            r1.append(r2)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MultiDex"
            android.util.Log.i(r2, r1)
            r7.MediaBrowserCompat$CustomActionResultReceiver = r8
            r7.read = r9
            long r3 = p040o.ConstraintLayout.write(r8)
            r5 = -1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0041
            r5 = 1
            long r3 = r3 - r5
        L_0x0041:
            r7.RatingCompat = r3
            java.io.File r8 = new java.io.File
            java.lang.String r1 = "MultiDex.lock"
            r8.<init>(r9, r1)
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r9.<init>(r8, r1)
            r7.MediaBrowserCompat$ItemReceiver = r9
            java.nio.channels.FileChannel r9 = r9.getChannel()     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            r7.IconCompatParcelizer = r9     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            r9.<init>()     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            java.lang.String r1 = "Blocking on lock "
            r9.append(r1)     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            java.lang.String r1 = r8.getPath()     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            r9.append(r1)     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            android.util.Log.i(r2, r9)     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            java.nio.channels.FileChannel r9 = r7.IconCompatParcelizer     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            java.nio.channels.FileLock r9 = r9.lock()     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            r7.write = r9     // Catch:{ IOException -> 0x0096, RuntimeException -> 0x0094, Error -> 0x0092 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            r9.<init>()     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            java.lang.String r8 = r8.getPath()     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            r9.append(r8)     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            java.lang.String r8 = " locked"
            r9.append(r8)     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            java.lang.String r8 = r9.toString()     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            android.util.Log.i(r2, r8)     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            return
        L_0x0092:
            r8 = move-exception
            goto L_0x0097
        L_0x0094:
            r8 = move-exception
            goto L_0x0097
        L_0x0096:
            r8 = move-exception
        L_0x0097:
            java.nio.channels.FileChannel r9 = r7.IconCompatParcelizer     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            r9.close()     // Catch:{ IOException -> 0x009d, RuntimeException -> 0x00a4, Error -> 0x00a2 }
            goto L_0x00a1
        L_0x009d:
            r9 = move-exception
            android.util.Log.w(r2, r0, r9)     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
        L_0x00a1:
            throw r8     // Catch:{ IOException -> 0x00a6, RuntimeException -> 0x00a4, Error -> 0x00a2 }
        L_0x00a2:
            r8 = move-exception
            goto L_0x00a7
        L_0x00a4:
            r8 = move-exception
            goto L_0x00a7
        L_0x00a6:
            r8 = move-exception
        L_0x00a7:
            java.io.RandomAccessFile r9 = r7.MediaBrowserCompat$ItemReceiver
            r9.close()     // Catch:{ IOException -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r9 = move-exception
            android.util.Log.w(r2, r0, r9)
        L_0x00b1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setReferencedIds.<init>(java.io.File, java.io.File):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0094, code lost:
        if (r8.getLong(r2.toString(), -1) == r10) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<? extends java.io.File> IconCompatParcelizer(android.content.Context r20, java.lang.String r21, boolean r22) throws java.io.IOException {
        /*
            r19 = this;
            r1 = r19
            r3 = r21
            r0 = r22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "MultiDexExtractor.load("
            r2.append(r4)
            java.io.File r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = r4.getPath()
            r2.append(r4)
            java.lang.String r4 = ", "
            r2.append(r4)
            r2.append(r0)
            r2.append(r4)
            r2.append(r3)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r9 = "MultiDex"
            android.util.Log.i(r9, r2)
            java.nio.channels.FileLock r2 = r1.write
            boolean r2 = r2.isValid()
            if (r2 == 0) goto L_0x0108
            r4 = 1
            r6 = -1
            if (r0 != 0) goto L_0x00c1
            java.io.File r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            long r10 = r1.RatingCompat
            int r8 = android.os.Build.VERSION.SDK_INT
            r12 = 11
            r13 = 0
            if (r8 >= r12) goto L_0x0050
            r8 = r13
            goto L_0x0051
        L_0x0050:
            r8 = 4
        L_0x0051:
            java.lang.String r12 = "multidex.version"
            r14 = r20
            android.content.SharedPreferences r8 = r14.getSharedPreferences(r12, r8)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r15 = "timestamp"
            r12.append(r15)
            java.lang.String r12 = r12.toString()
            long r15 = r8.getLong(r12, r6)
            long r17 = r2.lastModified()
            int r2 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0079
            long r17 = r17 - r4
        L_0x0079:
            int r2 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r12 = "crc"
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            long r15 = r8.getLong(r2, r6)
            int r2 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r13 = 1
        L_0x0098:
            if (r13 != 0) goto L_0x00c3
            java.util.List r0 = r19.write(r20, r21)     // Catch:{ IOException -> 0x009f }
            goto L_0x00ea
        L_0x009f:
            r0 = move-exception
            r2 = r0
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r9, r0, r2)
            java.util.List r0 = r19.MediaBrowserCompat$ItemReceiver()
            java.io.File r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            long r10 = r2.lastModified()
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x00b5
            long r10 = r10 - r4
        L_0x00b5:
            r4 = r10
            long r6 = r1.RatingCompat
            r2 = r20
            r3 = r21
            r8 = r0
            IconCompatParcelizer(r2, r3, r4, r6, r8)
            goto L_0x00ea
        L_0x00c1:
            r14 = r20
        L_0x00c3:
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "Forced extraction must be performed."
            android.util.Log.i(r9, r0)
            goto L_0x00d0
        L_0x00cb:
            java.lang.String r0 = "Detected that extraction must be performed."
            android.util.Log.i(r9, r0)
        L_0x00d0:
            java.util.List r0 = r19.MediaBrowserCompat$ItemReceiver()
            java.io.File r2 = r1.MediaBrowserCompat$CustomActionResultReceiver
            long r10 = r2.lastModified()
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x00df
            long r10 = r10 - r4
        L_0x00df:
            r4 = r10
            long r6 = r1.RatingCompat
            r2 = r20
            r3 = r21
            r8 = r0
            IconCompatParcelizer(r2, r3, r4, r6, r8)
        L_0x00ea:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "load found "
            r2.append(r3)
            int r3 = r0.size()
            r2.append(r3)
            java.lang.String r3 = " secondary dex files"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r9, r2)
            return r0
        L_0x0108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "MultiDexExtractor was closed"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setReferencedIds.IconCompatParcelizer(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    public final void close() throws IOException {
        this.write.release();
        this.IconCompatParcelizer.close();
        this.MediaBrowserCompat$ItemReceiver.close();
    }

    private List<IconCompatParcelizer> write(Context context, String str) throws IOException {
        String str2 = str;
        Log.i("MultiDex", "loading existing secondary dex files");
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getName());
        sb.append(".classes");
        String obj = sb.toString();
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("dex.number");
        int i = sharedPreferences.getInt(sb2.toString(), 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(i2);
            sb3.append(".zip");
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.read, sb3.toString());
            if (iconCompatParcelizer.isFile()) {
                long write2 = ConstraintLayout.write(iconCompatParcelizer);
                if (write2 == -1) {
                    write2--;
                }
                iconCompatParcelizer.write = write2;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append("dex.crc.");
                sb4.append(i2);
                long j = sharedPreferences.getLong(sb4.toString(), -1);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str2);
                sb5.append("dex.time.");
                sb5.append(i2);
                long j2 = sharedPreferences.getLong(sb5.toString(), -1);
                long lastModified = iconCompatParcelizer.lastModified();
                if (j2 == lastModified) {
                    String str3 = obj;
                    SharedPreferences sharedPreferences2 = sharedPreferences;
                    if (j == iconCompatParcelizer.write) {
                        arrayList.add(iconCompatParcelizer);
                        i2++;
                        sharedPreferences = sharedPreferences2;
                        obj = str3;
                    }
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Invalid extracted dex: ");
                sb6.append(iconCompatParcelizer);
                sb6.append(" (key \"");
                sb6.append(str2);
                sb6.append("\"), expected modification time: ");
                sb6.append(j2);
                sb6.append(", modification time: ");
                sb6.append(lastModified);
                sb6.append(", expected crc: ");
                sb6.append(j);
                sb6.append(", file crc: ");
                sb6.append(iconCompatParcelizer.write);
                throw new IOException(sb6.toString());
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Missing extracted secondary dex file '");
            sb7.append(iconCompatParcelizer.getPath());
            sb7.append("'");
            throw new IOException(sb7.toString());
        }
        return arrayList;
    }

    private List<IconCompatParcelizer> MediaBrowserCompat$ItemReceiver() throws IOException {
        IconCompatParcelizer iconCompatParcelizer;
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getName());
        sb.append(".classes");
        String obj = sb.toString();
        read();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.MediaBrowserCompat$CustomActionResultReceiver);
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("classes");
            sb2.append(2);
            sb2.append(".dex");
            int i = 2;
            ZipEntry entry = zipFile.getEntry(sb2.toString());
            while (entry != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj);
                sb3.append(i);
                sb3.append(".zip");
                iconCompatParcelizer = new IconCompatParcelizer(this.read, sb3.toString());
                arrayList.add(iconCompatParcelizer);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Extraction is needed for file ");
                sb4.append(iconCompatParcelizer);
                Log.i("MultiDex", sb4.toString());
                z = false;
                int i2 = 0;
                while (i2 < 3 && !z) {
                    read(zipFile, entry, iconCompatParcelizer, obj);
                    long write2 = ConstraintLayout.write(iconCompatParcelizer);
                    if (write2 == -1) {
                        write2--;
                    }
                    iconCompatParcelizer.write = write2;
                    z = true;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Extraction ");
                    sb5.append(z ? "succeeded" : "failed");
                    sb5.append(" '");
                    sb5.append(iconCompatParcelizer.getAbsolutePath());
                    sb5.append("': length ");
                    int i3 = i2;
                    sb5.append(iconCompatParcelizer.length());
                    sb5.append(" - crc: ");
                    sb5.append(iconCompatParcelizer.write);
                    Log.i("MultiDex", sb5.toString());
                    if (!z) {
                        iconCompatParcelizer.delete();
                        if (iconCompatParcelizer.exists()) {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("Failed to delete corrupted secondary dex '");
                            sb6.append(iconCompatParcelizer.getPath());
                            sb6.append("'");
                            Log.w("MultiDex", sb6.toString());
                        }
                    }
                    i2 = i3 + 1;
                }
                if (z) {
                    i++;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("classes");
                    sb7.append(i);
                    sb7.append(".dex");
                    entry = zipFile.getEntry(sb7.toString());
                } else {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("Could not create zip file ");
                    sb8.append(iconCompatParcelizer.getAbsolutePath());
                    sb8.append(" for secondary dex (");
                    sb8.append(i);
                    sb8.append(")");
                    throw new IOException(sb8.toString());
                }
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (IOException e2) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Failed to read crc from ");
            sb9.append(iconCompatParcelizer.getAbsolutePath());
            Log.w("MultiDex", sb9.toString(), e2);
            z = false;
        } catch (Throwable th) {
            Throwable th2 = th;
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th2;
        }
    }

    private void read() {
        File[] listFiles = this.read.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to list secondary dex dir content (");
            sb.append(this.read.getPath());
            sb.append(").");
            Log.w("MultiDex", sb.toString());
            return;
        }
        for (File file : listFiles) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Trying to delete old file ");
            sb2.append(file.getPath());
            sb2.append(" of size ");
            sb2.append(file.length());
            Log.i("MultiDex", sb2.toString());
            if (!file.delete()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete old file ");
                sb3.append(file.getPath());
                Log.w("MultiDex", sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Deleted old file ");
                sb4.append(file.getPath());
                Log.i("MultiDex", sb4.toString());
            }
        }
    }

    private static void read(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        StringBuilder sb = new StringBuilder();
        sb.append("tmp-");
        sb.append(str);
        File createTempFile = File.createTempFile(sb.toString(), ".zip", file.getParentFile());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Extracting ");
        sb2.append(createTempFile.getPath());
        Log.i("MultiDex", sb2.toString());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read2 = inputStream.read(bArr); read2 != -1; read2 = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read2);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Renaming to ");
                sb3.append(file.getPath());
                Log.i("MultiDex", sb3.toString());
                if (createTempFile.renameTo(file)) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to close resource", e);
                    }
                    createTempFile.delete();
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to rename \"");
                sb4.append(createTempFile.getAbsolutePath());
                sb4.append("\" to \"");
                sb4.append(file.getAbsolutePath());
                sb4.append("\"");
                throw new IOException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Failed to mark readonly \"");
            sb5.append(createTempFile.getAbsolutePath());
            sb5.append("\" (tmp of \"");
            sb5.append(file.getAbsolutePath());
            sb5.append("\")");
            throw new IOException(sb5.toString());
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            createTempFile.delete();
            throw th;
        }
    }

    private static void IconCompatParcelizer(Context context, String str, long j, long j2, List<IconCompatParcelizer> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", Build.VERSION.SDK_INT < 11 ? 0 : 4).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("timestamp");
        edit.putLong(sb.toString(), j);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("crc");
        edit.putLong(sb2.toString(), j2);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("dex.number");
        edit.putInt(sb3.toString(), list.size() + 1);
        int i = 2;
        for (IconCompatParcelizer next : list) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("dex.crc.");
            sb4.append(i);
            edit.putLong(sb4.toString(), next.write);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("dex.time.");
            sb5.append(i);
            edit.putLong(sb5.toString(), next.lastModified());
            i++;
        }
        edit.commit();
    }
}
