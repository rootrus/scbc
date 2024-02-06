package org.jnbis;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.jnbis.internal.InternalWsqDecoder;

public class WsqDecoder {
    public Bitmap decode(String str) throws IOException {
        return decode(new File(str));
    }

    public Bitmap decode(File file) throws IOException {
        return decode((InputStream) new FileInputStream(file));
    }

    public Bitmap decode(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return decode(byteArrayOutputStream.toByteArray());
            }
        }
    }

    public Bitmap decode(byte[] bArr) {
        return new InternalWsqDecoder().decode(bArr);
    }
}
