package com.kofax.mobile.sdk.extract.p018id.bundle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.apache.commons.io.IOUtils;
import p040o.ModifyQuickTopUpReviewActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.bundle.ZipFileBundle */
public class ZipFileBundle implements IBundle {
    /* access modifiers changed from: private */
    public final ZipFile afI;

    public ZipFileBundle(ZipFile zipFile) {
        if (zipFile != null) {
            this.afI = zipFile;
            return;
        }
        throw new IllegalArgumentException("file cannot be null");
    }

    public Enumeration<? extends IBundleFile> list() {
        return new C8382b(this.afI.entries());
    }

    public void close() throws IOException {
        this.afI.close();
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.bundle.ZipFileBundle$b */
    class C8382b implements Enumeration<IBundleFile> {
        private final Enumeration<? extends ZipEntry> afL;

        public C8382b(Enumeration<? extends ZipEntry> enumeration) {
            if (enumeration != null) {
                this.afL = enumeration;
                return;
            }
            throw new IllegalArgumentException("enumeration cannot be null");
        }

        public boolean hasMoreElements() {
            return this.afL.hasMoreElements();
        }

        public IBundleFile nextElement() {
            return new C8381a((ZipEntry) this.afL.nextElement());
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.bundle.ZipFileBundle$a */
    class C8381a implements IBundleFile {
        private final ZipEntry afJ;

        C8381a(ZipEntry zipEntry) {
            this.afJ = zipEntry;
        }

        public File getFile() {
            try {
                File createTempFile = File.createTempFile("__zipBundle__", "__");
                m4860j(createTempFile);
                return createTempFile;
            } catch (Exception e) {
                throw new RuntimeException("could not get file", e);
            }
        }

        public void getFile(File file) {
            m4860j(file);
        }

        /* renamed from: j */
        private void m4860j(File file) {
            InputStream inputStream;
            Throwable th;
            FileOutputStream fileOutputStream;
            Exception e;
            FileOutputStream fileOutputStream2 = null;
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    inputStream = ZipFileBundle.this.afI.getInputStream(this.afJ);
                } catch (Exception e2) {
                    e = e2;
                    inputStream = null;
                    try {
                        throw new RuntimeException("could not get file", e);
                    } catch (Throwable th2) {
                        th = th2;
                        FileOutputStream fileOutputStream3 = fileOutputStream;
                        th = th;
                        fileOutputStream2 = fileOutputStream3;
                        IOUtils.closeQuietly(fileOutputStream2);
                        IOUtils.closeQuietly(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    FileOutputStream fileOutputStream32 = fileOutputStream;
                    th = th;
                    fileOutputStream2 = fileOutputStream32;
                    IOUtils.closeQuietly(fileOutputStream2);
                    IOUtils.closeQuietly(inputStream);
                    throw th;
                }
                try {
                    IOUtils.copy(inputStream, fileOutputStream);
                    IOUtils.closeQuietly(fileOutputStream);
                    IOUtils.closeQuietly(inputStream);
                } catch (Exception e3) {
                    e = e3;
                    throw new RuntimeException("could not get file", e);
                }
            } catch (Exception e4) {
                fileOutputStream = null;
                e = e4;
                inputStream = null;
                throw new RuntimeException("could not get file", e);
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                IOUtils.closeQuietly(fileOutputStream2);
                IOUtils.closeQuietly(inputStream);
                throw th;
            }
        }

        public boolean isDirectory() {
            return this.afJ.isDirectory();
        }

        public String getAbsolutePath() {
            return this.afJ.getName();
        }

        public String getName() {
            String write = ModifyQuickTopUpReviewActivity.write(this.afJ.getName(), "/");
            return write.contains("/") ? ModifyQuickTopUpReviewActivity.read(write, "/") : write;
        }
    }
}
