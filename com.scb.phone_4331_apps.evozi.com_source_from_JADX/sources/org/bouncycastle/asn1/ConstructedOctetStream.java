package org.bouncycastle.asn1;

import java.io.InputStream;

class ConstructedOctetStream extends InputStream {
    private InputStream _currentStream;
    private boolean _first = true;
    private final ASN1StreamParser _parser;

    ConstructedOctetStream(ASN1StreamParser aSN1StreamParser) {
        this._parser = aSN1StreamParser;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() throws java.io.IOException {
        /*
            r3 = this;
            java.io.InputStream r0 = r3._currentStream
            r1 = -1
            if (r0 != 0) goto L_0x001b
            boolean r0 = r3._first
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            org.bouncycastle.asn1.ASN1StreamParser r0 = r3._parser
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.readObject()
            org.bouncycastle.asn1.ASN1OctetStringParser r0 = (org.bouncycastle.asn1.ASN1OctetStringParser) r0
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            r2 = 0
            r3._first = r2
            r2 = r0
            r0 = r3
            goto L_0x0033
        L_0x001b:
            r0 = r3
        L_0x001c:
            java.io.InputStream r2 = r0._currentStream
            int r2 = r2.read()
            if (r2 < 0) goto L_0x0025
            return r2
        L_0x0025:
            org.bouncycastle.asn1.ASN1StreamParser r2 = r0._parser
            org.bouncycastle.asn1.ASN1Encodable r2 = r2.readObject()
            org.bouncycastle.asn1.ASN1OctetStringParser r2 = (org.bouncycastle.asn1.ASN1OctetStringParser) r2
            if (r2 != 0) goto L_0x0033
            r2 = 0
            r0._currentStream = r2
            return r1
        L_0x0033:
            java.io.InputStream r2 = r2.getOctetStream()
            r0._currentStream = r2
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ConstructedOctetStream.read():int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c A[EDGE_INSN: B:21:0x002c->B:15:0x002c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002b A[SYNTHETIC] */
    public int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            java.io.InputStream r0 = r6._currentStream
            r1 = -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            boolean r0 = r6._first
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            org.bouncycastle.asn1.ASN1StreamParser r0 = r6._parser
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.readObject()
            org.bouncycastle.asn1.ASN1OctetStringParser r0 = (org.bouncycastle.asn1.ASN1OctetStringParser) r0
            if (r0 != 0) goto L_0x0016
            return r1
        L_0x0016:
            r6._first = r2
            r3 = r0
            r0 = r6
            goto L_0x003e
        L_0x001b:
            r0 = r6
        L_0x001c:
            java.io.InputStream r3 = r0._currentStream
            int r4 = r8 + r2
            int r5 = r9 - r2
            int r3 = r3.read(r7, r4, r5)
            if (r3 < 0) goto L_0x002c
            int r2 = r2 + r3
            if (r2 != r9) goto L_0x001c
            return r2
        L_0x002c:
            org.bouncycastle.asn1.ASN1StreamParser r3 = r0._parser
            org.bouncycastle.asn1.ASN1Encodable r3 = r3.readObject()
            org.bouncycastle.asn1.ASN1OctetStringParser r3 = (org.bouncycastle.asn1.ASN1OctetStringParser) r3
            if (r3 != 0) goto L_0x003e
            r7 = 0
            r0._currentStream = r7
            if (r2 > 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            return r1
        L_0x003e:
            java.io.InputStream r3 = r3.getOctetStream()
            r0._currentStream = r3
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ConstructedOctetStream.read(byte[], int, int):int");
    }
}
