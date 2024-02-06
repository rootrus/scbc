package com.kofax.mobile.sdk.extract.id.bundle;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipFileBundle
        implements IBundle {

    private final ZipFile _file;

    public ZipFileBundle(ZipFile file) {
        if (file == null) {
            throw new IllegalArgumentException("file cannot be null");
        }

        _file = file;
    }

    @Override
    public Enumeration<? extends IBundleFile> list() {
        return new ZippedBundleFileEnumerator(_file.entries());
    }

    @Override
    public void close()
            throws IOException {
        _file.close();
    }

    private class ZippedBundleFileEnumerator
            implements Enumeration<IBundleFile> {
        private final Enumeration<? extends ZipEntry> _enumeration;

        public ZippedBundleFileEnumerator(Enumeration<? extends ZipEntry> enumeration) {
            if (enumeration == null) {
                throw new IllegalArgumentException("enumeration cannot be null");
            }

            _enumeration = enumeration;
        }

        @Override
        public boolean hasMoreElements() {
            return _enumeration.hasMoreElements();
        }

        @Override
        public IBundleFile nextElement() {
            return new ZippedBundleFile(_enumeration.nextElement());
        }
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
            } catch (Exception e) {
                throw new RuntimeException("could not get file", e);
            }
        }

        @Override
        public void getFile(File outputFile) {
            writeToFile(outputFile);
        }

        private void writeToFile(File output) {
            OutputStream outputStream = null;
            InputStream entryStream = null;

            try {
                outputStream = new FileOutputStream(output);
                entryStream = _file.getInputStream(_entry);
                IOUtils.copy(entryStream, outputStream);
            } catch (Exception e) {
                throw new RuntimeException("could not get file", e);
            } finally {
                IOUtils.closeQuietly(outputStream);
                IOUtils.closeQuietly(entryStream);
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
            return name.contains("/") ? StringUtils.substringAfterLast(name, "/") : name;
        }
    }
}
