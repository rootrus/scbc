package org.bouncycastle.asn1.p061x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* renamed from: org.bouncycastle.asn1.x9.X9ECPoint */
public class X9ECPoint extends ASN1Object {

    /* renamed from: c */
    private ECCurve f5631c;
    private final ASN1OctetString encoding;

    /* renamed from: p */
    private ECPoint f5632p;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f5631c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint) {
        this(eCPoint, false);
    }

    public X9ECPoint(ECPoint eCPoint, boolean z) {
        this.f5632p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z));
    }

    public ECPoint getPoint() {
        ECPoint eCPoint;
        synchronized (this) {
            if (this.f5632p == null) {
                this.f5632p = this.f5631c.decodePoint(this.encoding.getOctets()).normalize();
            }
            eCPoint = this.f5632p;
        }
        return eCPoint;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte[] octets = this.encoding.getOctets();
        if (octets == null || octets.length <= 0) {
            return false;
        }
        return octets[0] == 2 || octets[0] == 3;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }
}
