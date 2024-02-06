package com.google.firebase.crashlytics.internal.common;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

class NativeSessionFileGzipper {
    NativeSessionFileGzipper() {
    }

    static void processNativeSessions(File file, List<NativeSessionFile> list) {
        for (NativeSessionFile next : list) {
            InputStream inputStream = null;
            try {
                inputStream = next.getStream();
                if (inputStream != null) {
                    gzipInputStream(inputStream, new File(file, next.getReportsEndpointFilename()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                CommonUtils.closeQuietly((Closeable) null);
                throw th;
            }
            CommonUtils.closeQuietly(inputStream);
        }
    }

    private static void gzipInputStream(InputStream inputStream, File file) throws IOException {
        GZIPOutputStream gZIPOutputStream;
        if (inputStream != null) {
            byte[] bArr = new byte[8192];
            try {
                gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(file));
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read > 0) {
                            gZIPOutputStream.write(bArr, 0, read);
                        } else {
                            gZIPOutputStream.finish();
                            CommonUtils.closeQuietly(gZIPOutputStream);
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.closeQuietly(gZIPOutputStream);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = null;
                CommonUtils.closeQuietly(gZIPOutputStream);
                throw th;
            }
        }
    }
}
