package org.bouncycastle.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class ElGamalParameter extends ASN1Object {

    /* renamed from: g */
    ASN1Integer f5598g;

    /* renamed from: p */
    ASN1Integer f5599p;

    public ElGamalParameter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f5599p = new ASN1Integer(bigInteger);
        this.f5598g = new ASN1Integer(bigInteger2);
    }

    private ElGamalParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f5599p = (ASN1Integer) objects.nextElement();
        this.f5598g = (ASN1Integer) objects.nextElement();
    }

    public static ElGamalParameter getInstance(Object obj) {
        if (obj instanceof ElGamalParameter) {
            return (ElGamalParameter) obj;
        }
        if (obj != null) {
            return new ElGamalParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f5598g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f5599p.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f5599p);
        aSN1EncodableVector.add(this.f5598g);
        return new DERSequence(aSN1EncodableVector);
    }
}
