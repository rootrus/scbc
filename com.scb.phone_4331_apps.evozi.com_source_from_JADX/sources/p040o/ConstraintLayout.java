package p040o;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import okhttp3.internal.http2.Http2Stream;

/* renamed from: o.ConstraintLayout */
final class ConstraintLayout {

    /* renamed from: o.ConstraintLayout$IconCompatParcelizer */
    static class IconCompatParcelizer {
        long IconCompatParcelizer;
        long write;

        IconCompatParcelizer() {
        }
    }

    ConstraintLayout() {
    }

    static long write(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return MediaBrowserCompat$CustomActionResultReceiver(randomAccessFile, MediaBrowserCompat$CustomActionResultReceiver(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    private static IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
                    iconCompatParcelizer.write = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    iconCompatParcelizer.IconCompatParcelizer = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return iconCompatParcelizer;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File too short to be a zip file: ");
        sb.append(randomAccessFile.length());
        throw new ZipException(sb.toString());
    }

    private static long MediaBrowserCompat$CustomActionResultReceiver(RandomAccessFile randomAccessFile, IconCompatParcelizer iconCompatParcelizer) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = iconCompatParcelizer.write;
        randomAccessFile.seek(iconCompatParcelizer.IconCompatParcelizer);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j));
        }
        return crc32.getValue();
    }
}
