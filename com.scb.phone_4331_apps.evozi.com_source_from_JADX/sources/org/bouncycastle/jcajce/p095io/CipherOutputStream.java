package org.bouncycastle.jcajce.p095io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.p094io.InvalidCipherTextIOException;

/* renamed from: org.bouncycastle.jcajce.io.CipherOutputStream */
public class CipherOutputStream extends FilterOutputStream {
    private final Cipher cipher;
    private final byte[] oneByte = new byte[1];

    public CipherOutputStream(OutputStream outputStream, Cipher cipher2) {
        super(outputStream);
        this.cipher = cipher2;
    }

    public void close() throws IOException {
        IOException iOException;
        try {
            byte[] doFinal = this.cipher.doFinal();
            if (doFinal != null) {
                this.out.write(doFinal);
            }
            iOException = null;
        } catch (GeneralSecurityException e) {
            iOException = new InvalidCipherTextIOException("Error during cipher finalisation", e);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error closing stream: ");
            sb.append(e2);
            iOException = new IOException(sb.toString());
        }
        try {
            flush();
            this.out.close();
        } catch (IOException e3) {
            if (iOException == null) {
                iOException = e3;
            }
        }
        if (iOException != null) {
            throw iOException;
        }
    }

    public void flush() throws IOException {
        this.out.flush();
    }

    public void write(int i) throws IOException {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        byte[] update = this.cipher.update(bArr, i, i2);
        if (update != null) {
            this.out.write(update);
        }
    }
}
