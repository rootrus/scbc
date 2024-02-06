package org.bouncycastle.asn1.p061x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* renamed from: org.bouncycastle.asn1.x9.DHPublicKey */
public class DHPublicKey extends ASN1Object {

    /* renamed from: y */
    private ASN1Integer f5623y;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger != null) {
            this.f5623y = new ASN1Integer(bigInteger);
            return;
        }
        throw new IllegalArgumentException("'y' cannot be null");
    }

    private DHPublicKey(ASN1Integer aSN1Integer) {
        if (aSN1Integer != null) {
            this.f5623y = aSN1Integer;
            return;
        }
        throw new IllegalArgumentException("'y' cannot be null");
    }

    public static DHPublicKey getInstance(Object obj) {
        if (obj == null || (obj instanceof DHPublicKey)) {
            return (DHPublicKey) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer) obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid DHPublicKey: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z));
    }

    public BigInteger getY() {
        return this.f5623y.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive() {
        return this.f5623y;
    }
}
