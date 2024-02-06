package org.jmrtd.lds.icao;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.logging.Logger;
import org.jmrtd.lds.DataGroup;

public class DG15File extends DataGroup {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 3834304239673755744L;
    private PublicKey publicKey;

    public DG15File(PublicKey publicKey2) {
        super(111);
        this.publicKey = publicKey2;
    }

    public DG15File(InputStream inputStream) throws IOException {
        super(111, inputStream);
    }

    public void readContent(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        try {
            byte[] bArr = new byte[getLength()];
            dataInputStream.readFully(bArr);
            this.publicKey = getPublicKey(bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    private static PublicKey getPublicKey(byte[] bArr) throws GeneralSecurityException {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(bArr);
        String[] strArr = {"RSA", "EC"};
        int i = 0;
        while (i < 2) {
            try {
                return KeyFactory.getInstance(strArr[i]).generatePublic(x509EncodedKeySpec);
            } catch (InvalidKeySpecException unused) {
                i++;
            }
        }
        throw new InvalidAlgorithmParameterException();
    }

    public void writeContent(OutputStream outputStream) throws IOException {
        outputStream.write(this.publicKey.getEncoded());
    }

    public PublicKey getPublicKey() {
        return this.publicKey;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            return this.publicKey.equals(((DG15File) obj).publicKey);
        }
        return false;
    }

    public int hashCode() {
        return (this.publicKey.hashCode() * 5) + 61;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DG15File [");
        sb.append(this.publicKey.toString());
        sb.append("]");
        return sb.toString();
    }
}
