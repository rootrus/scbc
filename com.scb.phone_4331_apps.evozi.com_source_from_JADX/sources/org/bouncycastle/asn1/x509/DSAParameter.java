package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class DSAParameter extends ASN1Object {

    /* renamed from: g */
    ASN1Integer f5615g;

    /* renamed from: p */
    ASN1Integer f5616p;

    /* renamed from: q */
    ASN1Integer f5617q;

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f5616p = new ASN1Integer(bigInteger);
        this.f5617q = new ASN1Integer(bigInteger2);
        this.f5615g = new ASN1Integer(bigInteger3);
    }

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() == 3) {
            Enumeration objects = aSN1Sequence.getObjects();
            this.f5616p = ASN1Integer.getInstance(objects.nextElement());
            this.f5617q = ASN1Integer.getInstance(objects.nextElement());
            this.f5615g = ASN1Integer.getInstance(objects.nextElement());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad sequence size: ");
        sb.append(aSN1Sequence.size());
        throw new IllegalArgumentException(sb.toString());
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public BigInteger getG() {
        return this.f5615g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f5616p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f5617q.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f5616p);
        aSN1EncodableVector.add(this.f5617q);
        aSN1EncodableVector.add(this.f5615g);
        return new DERSequence(aSN1EncodableVector);
    }
}
