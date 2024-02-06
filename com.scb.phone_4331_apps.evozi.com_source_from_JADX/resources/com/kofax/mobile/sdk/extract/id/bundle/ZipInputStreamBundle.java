package com.kofax.mobile.sdk.extract.id.bundle;


import com.kofax.kmc.kut.utilities.error.IllegalArgumentException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStreamBundle
        implements IBundle, Enumeration<IBundleFile> {

    private final ZipInputStream _file;
    private IBundleFile _next = null;

    public ZipInputStreamBundle(ZipInputStream file) {
        if (file == null) {
            throw new IllegalArgumentException("file cannot be null");
        }

        _file = file;
    }

    public ZipInputStreamBundle(InputStream file) {
        if (file == null) {
            throw new IllegalArgumentException("file cannot be null");
        }

        _file = new ZipInputStream(file);
    }

    @Override
    public Enumeration<? extends IBundleFile> list() {
        return this;
    }

    @Override
    public boolean hasMoreElements() {
        _next = nextElement();
        return _next != null;
    }

    @Override
    public IBundleFile nextElement() {
        if (_next != null) {
            try {
                return _next;
            } finally {
                _next = null;
            }
        } else {
            try {
                ZipEntry nextZipEntry = _file.getNextEntry();
                return nextZipEntry == null ? null : new ZippedBundleFile(nextZipEntry);
            } catch (Exception ignored) {
                return null;
            }
        }
    }

    @Override
    public void close()
            throws IOException {
        _file.close();
    }

    private class ZippedBundleFile
            implements IBundleFile {

        private final ZipEntry _entry;

        ZippedBundleFile(ZipEntry entry) {
            _entry = entry;
        }

        @Override
        public File getFile() {
            try {
                File tmp = File.createTempFile("__zipBundle__", "__");
                writeToFile(tmp);
                return tmp;
            } catch (IOException e) {
                throw new RuntimeException("could not get file", e);
            }
        }

        @Override
        public void getFile(File output) {
            writeToFile(output);
        }

        private void writeToFile(File output) {
            OutputStream outputStream = null;
            try {
                outputStream = new FileOutputStream(output);
                IOUtils.copy(_file, outputStream);
            } catch (Exception e) {
                throw new RuntimeException("could not get file", e);
            } finally {
                IOUtils.closeQuietly(outputStream);
            }
        }

        @Override
        public boolean isDirectory() {
            return _entry.isDirectory();
        }

        @Override
        public String getAbsolutePath() {
            return _entry.getName();
        }

        @Override
        public String getName() {
            String name = StringUtils.removeEnd(_entry.getName(), "/");

            if (!_entry.getName().contains("/")) {
                return _entry.getName();
            }

            return StringUtils.substringAfterLast(name, "/");
        }
    }
}
