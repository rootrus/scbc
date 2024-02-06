package com.kofax.mobile.sdk.extract.p018id.bundle;

import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.apache.commons.io.IOUtils;
import p040o.ModifyQuickTopUpReviewActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.bundle.ZipInputStreamBundle */
public class ZipInputStreamBundle implements IBundle, Enumeration<IBundleFile> {
    /* access modifiers changed from: private */
    public final ZipInputStream afM;
    private IBundleFile afN = null;

    public Enumeration<? extends IBundleFile> list() {
        return this;
    }

    public ZipInputStreamBundle(ZipInputStream zipInputStream) {
        if (zipInputStream != null) {
            this.afM = zipInputStream;
            return;
        }
        throw new IllegalArgumentException("file cannot be null");
    }

    public ZipInputStreamBundle(InputStream inputStream) {
        if (inputStream != null) {
            this.afM = new ZipInputStream(inputStream);
            return;
        }
        throw new IllegalArgumentException("file cannot be null");
    }

    public boolean hasMoreElements() {
        IBundleFile nextElement = nextElement();
        this.afN = nextElement;
        return nextElement != null;
    }

    public IBundleFile nextElement() {
        IBundleFile iBundleFile = this.afN;
        if (iBundleFile != null) {
            this.afN = null;
            return iBundleFile;
        }
        try {
            ZipEntry nextEntry = this.afM.getNextEntry();
            if (nextEntry != null) {
                return new C8383a(nextEntry);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void close() throws IOException {
        this.afM.close();
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.bundle.ZipInputStreamBundle$a */
    class C8383a implements IBundleFile {
        private final ZipEntry afJ;

        C8383a(ZipEntry zipEntry) {
            this.afJ = zipEntry;
        }

        public File getFile() {
            try {
                File createTempFile = File.createTempFile("__zipBundle__", "__");
                m4862j(createTempFile);
                return createTempFile;
            } catch (IOException e) {
                throw new RuntimeException("could not get file", e);
            }
        }

        public void getFile(File file) {
            m4862j(file);
        }

        /* renamed from: j */
        private void m4862j(File file) {
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    IOUtils.copy(ZipInputStreamBundle.this.afM, fileOutputStream2);
                    IOUtils.closeQuietly(fileOutputStream2);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    try {
                        throw new RuntimeException("could not get file", e);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        IOUtils.closeQuietly(fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    IOUtils.closeQuietly(fileOutputStream2);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                throw new RuntimeException("could not get file", e);
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
            if (!this.afJ.getName().contains("/")) {
                return this.afJ.getName();
            }
            return ModifyQuickTopUpReviewActivity.read(write, "/");
        }
    }
}
