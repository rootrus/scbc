package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: o.DialogTitle */
public class DialogTitle {
    public static File write(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        String obj = sb.toString();
        int i = 0;
        while (i < 100) {
            File cacheDir = context.getCacheDir();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(i);
            File file = new File(cacheDir, sb2.toString());
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.nio.ByteBuffer write(java.io.File r7) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0025 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0025 }
            java.nio.channels.FileChannel r1 = r0.getChannel()     // Catch:{ all -> 0x0019 }
            long r5 = r1.size()     // Catch:{ all -> 0x0019 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0019 }
            r3 = 0
            java.nio.MappedByteBuffer r7 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0019 }
            r0.close()     // Catch:{ IOException -> 0x0025 }
            return r7
        L_0x0019:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x001b }
        L_0x001b:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch:{ IOException -> 0x0025 }
        L_0x0024:
            throw r1     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DialogTitle.write(java.io.File):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r9.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0044, code lost:
        if (r7 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        throw r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer write(android.content.Context r7, android.os.CancellationSignal r8, android.net.Uri r9) {
        /*
            android.content.ContentResolver r7 = r7.getContentResolver()
            r0 = 0
            java.lang.String r1 = "r"
            android.os.ParcelFileDescriptor r7 = r7.openFileDescriptor(r9, r1, r8)     // Catch:{ IOException -> 0x004f }
            if (r7 != 0) goto L_0x0013
            if (r7 == 0) goto L_0x0012
            r7.close()     // Catch:{ IOException -> 0x004f }
        L_0x0012:
            return r0
        L_0x0013:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0041 }
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ all -> 0x0041 }
            r8.<init>(r9)     // Catch:{ all -> 0x0041 }
            java.nio.channels.FileChannel r1 = r8.getChannel()     // Catch:{ all -> 0x0035 }
            long r5 = r1.size()     // Catch:{ all -> 0x0035 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0035 }
            r3 = 0
            java.nio.MappedByteBuffer r9 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0035 }
            r8.close()     // Catch:{ all -> 0x0041 }
            if (r7 == 0) goto L_0x0034
            r7.close()     // Catch:{ IOException -> 0x004f }
        L_0x0034:
            return r9
        L_0x0035:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r8 = move-exception
            r9.addSuppressed(r8)     // Catch:{ all -> 0x0041 }
        L_0x0040:
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r9 = move-exception
            if (r7 == 0) goto L_0x004e
            r7.close()     // Catch:{ all -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch:{ IOException -> 0x004f }
        L_0x004e:
            throw r9     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DialogTitle.write(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    public static ByteBuffer read(Context context, Resources resources, int i) {
        File write = write(context);
        if (write == null) {
            return null;
        }
        try {
            if (!IconCompatParcelizer(write, resources, i)) {
                return null;
            }
            ByteBuffer write2 = write(write);
            write.delete();
            return write2;
        } finally {
            write.delete();
        }
    }

    public static boolean write(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        MediaBrowserCompat$ItemReceiver(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error copying resource contents to temp file: ");
                    sb.append(e.getMessage());
                    Log.e("TypefaceCompatUtil", sb.toString());
                    MediaBrowserCompat$ItemReceiver(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    MediaBrowserCompat$ItemReceiver(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                MediaBrowserCompat$ItemReceiver(fileOutputStream2);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error copying resource contents to temp file: ");
            sb2.append(e.getMessage());
            Log.e("TypefaceCompatUtil", sb2.toString());
            MediaBrowserCompat$ItemReceiver(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static boolean IconCompatParcelizer(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean write = write(file, inputStream);
                MediaBrowserCompat$ItemReceiver(inputStream);
                return write;
            } catch (Throwable th) {
                th = th;
                MediaBrowserCompat$ItemReceiver(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            MediaBrowserCompat$ItemReceiver(inputStream);
            throw th;
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
