package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class DHParameter extends ASN1Object {

    /* renamed from: g */
    ASN1Integer f5600g;

    /* renamed from: l */
    ASN1Integer f5601l;

    /* renamed from: p */
    ASN1Integer f5602p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f5602p = new ASN1Integer(bigInteger);
        this.f5600g = new ASN1Integer(bigInteger2);
        this.f5601l = i != 0 ? new ASN1Integer((long) i) : null;
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f5602p = ASN1Integer.getInstance(objects.nextElement());
        this.f5600g = ASN1Integer.getInstance(objects.nextElement());
        this.f5601l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }

    public static DHParameter getInstance(Object obj) {
        if (obj instanceof DHParameter) {
            return (DHParameter) obj;
        }
        if (obj != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f5600g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f5601l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f5602p.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f5602p);
        aSN1EncodableVector.add(this.f5600g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f5601l);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
