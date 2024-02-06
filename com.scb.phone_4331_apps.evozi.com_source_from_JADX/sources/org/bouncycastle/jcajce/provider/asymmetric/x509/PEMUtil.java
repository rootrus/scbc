package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.encoders.Base64;

class PEMUtil {
    private final String _footer1;
    private final String _footer2;
    private final String _header1;
    private final String _header2;

    PEMUtil(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN ");
        sb.append(str);
        sb.append("-----");
        this._header1 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("-----BEGIN X509 ");
        sb2.append(str);
        sb2.append("-----");
        this._header2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("-----END ");
        sb3.append(str);
        sb3.append("-----");
        this._footer1 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("-----END X509 ");
        sb4.append(str);
        sb4.append("-----");
        this._footer2 = sb4.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String readLine(java.io.InputStream r6) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L_0x0005:
            int r1 = r6.read()
            r2 = 10
            r3 = 13
            if (r1 == r3) goto L_0x0018
            if (r1 == r2) goto L_0x0018
            if (r1 < 0) goto L_0x0018
            char r1 = (char) r1
            r0.append(r1)
            goto L_0x0005
        L_0x0018:
            if (r1 < 0) goto L_0x0020
            int r4 = r0.length()
            if (r4 == 0) goto L_0x0005
        L_0x0020:
            if (r1 >= 0) goto L_0x0024
            r6 = 0
            return r6
        L_0x0024:
            if (r1 != r3) goto L_0x0038
            r1 = 1
            r6.mark(r1)
            int r3 = r6.read()
            if (r3 != r2) goto L_0x0033
            r6.mark(r1)
        L_0x0033:
            if (r3 <= 0) goto L_0x0038
            r6.reset()
        L_0x0038:
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.x509.PEMUtil.readLine(java.io.InputStream):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public ASN1Sequence readPEMObject(InputStream inputStream) throws IOException {
        String readLine;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            readLine = readLine(inputStream);
            if (readLine == null || readLine.startsWith(this._header1) || readLine.startsWith(this._header2)) {
            }
            readLine = readLine(inputStream);
            break;
        } while (readLine.startsWith(this._header2));
        while (true) {
            String readLine2 = readLine(inputStream);
            if (readLine2 != null && !readLine2.startsWith(this._footer1) && !readLine2.startsWith(this._footer2)) {
                stringBuffer.append(readLine2);
            }
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return ASN1Sequence.getInstance(Base64.decode(stringBuffer.toString()));
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
