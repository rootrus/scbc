package org.jmrtd.lds;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jmrtd.cert.CVCPrincipal;

public class CVCAFile extends AbstractLDSFile {
    public static final byte CAR_TAG = 66;
    public static final int LENGTH = 36;
    private static final long serialVersionUID = -1100904058684365703L;
    private String altCaReference;
    private String caReference;
    private short fid;

    public int getLength() {
        return 36;
    }

    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public CVCAFile(InputStream inputStream) throws IOException {
        this(284, inputStream);
    }

    public CVCAFile(short s, InputStream inputStream) throws IOException {
        this.caReference = null;
        this.altCaReference = null;
        this.fid = s;
        readObject(inputStream);
    }

    public CVCAFile(String str, String str2) {
        this(284, str, str2);
    }

    public CVCAFile(short s, String str, String str2) {
        this.caReference = null;
        this.altCaReference = null;
        if (str == null || str.length() > 16 || (str2 != null && str2.length() > 16)) {
            throw new IllegalArgumentException();
        }
        this.fid = s;
        this.caReference = str;
        this.altCaReference = str2;
    }

    public CVCAFile(short s, String str) {
        this(s, str, (String) null);
    }

    public short getFID() {
        return this.fid;
    }

    /* access modifiers changed from: protected */
    public void readObject(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        int read = dataInputStream.read();
        if (read == 66) {
            int read2 = dataInputStream.read();
            if (read2 <= 16) {
                byte[] bArr = new byte[read2];
                dataInputStream.readFully(bArr);
                this.caReference = new String(bArr);
                int read3 = dataInputStream.read();
                if (!(read3 == 0 || read3 == -1)) {
                    if (read3 == 66) {
                        int read4 = dataInputStream.read();
                        if (read4 <= 16) {
                            byte[] bArr2 = new byte[read4];
                            dataInputStream.readFully(bArr2);
                            this.altCaReference = new String(bArr2);
                            read3 = dataInputStream.read();
                        } else {
                            throw new IllegalArgumentException("Wrong length.");
                        }
                    } else {
                        throw new IllegalArgumentException("Wrong tag.");
                    }
                }
                while (read3 != -1) {
                    if (read3 == 0) {
                        read3 = dataInputStream.read();
                    } else {
                        throw new IllegalArgumentException("Bad file padding.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Wrong length.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong tag, expected ");
        sb.append(Integer.toHexString(66));
        sb.append(", found ");
        sb.append(Integer.toHexString(read));
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void writeObject(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[36];
        bArr[0] = CAR_TAG;
        bArr[1] = (byte) this.caReference.length();
        System.arraycopy(this.caReference.getBytes(), 0, bArr, 2, bArr[1]);
        String str = this.altCaReference;
        if (str != null) {
            int i = bArr[1] + 2;
            bArr[i] = CAR_TAG;
            int i2 = i + 1;
            bArr[i2] = (byte) str.length();
            System.arraycopy(this.altCaReference.getBytes(), 0, bArr, i + 2, bArr[i2]);
        }
        outputStream.write(bArr);
    }

    public CVCPrincipal getCAReference() {
        String str = this.caReference;
        if (str == null) {
            return null;
        }
        return new CVCPrincipal(str);
    }

    public CVCPrincipal getAltCAReference() {
        String str = this.altCaReference;
        if (str == null) {
            return null;
        }
        return new CVCPrincipal(str);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CA reference: \"");
        sb.append(this.caReference);
        sb.append("\"");
        if (this.altCaReference != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", Alternative CA reference: ");
            sb2.append(this.altCaReference);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        CVCAFile cVCAFile = (CVCAFile) obj;
        if (!this.caReference.equals(cVCAFile.caReference)) {
            return false;
        }
        if ((this.altCaReference != null || cVCAFile.altCaReference != null) && ((str = this.altCaReference) == null || !str.equals(cVCAFile.altCaReference))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.caReference.hashCode();
        String str = this.altCaReference;
        return (hashCode * 11) + (str != null ? str.hashCode() * 13 : 0) + 5;
    }
}
