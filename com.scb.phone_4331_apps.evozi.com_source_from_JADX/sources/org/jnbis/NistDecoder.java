package org.jnbis;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.jnbis.DecodedData;
import org.jnbis.internal.InternalNistDecoder;

public class NistDecoder {
    public DecodedData decode(String str, DecodedData.Format format) throws IOException {
        return decode(new File(str), format);
    }

    public DecodedData decode(File file, DecodedData.Format format) throws IOException {
        return decode((InputStream) new FileInputStream(file), format);
    }

    public DecodedData decode(InputStream inputStream, DecodedData.Format format) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, 16384);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return decode(byteArrayOutputStream.toByteArray(), format);
            }
        }
    }

    public DecodedData decode(byte[] bArr, DecodedData.Format format) {
        return new InternalNistDecoder().decode(bArr, format);
    }
}
