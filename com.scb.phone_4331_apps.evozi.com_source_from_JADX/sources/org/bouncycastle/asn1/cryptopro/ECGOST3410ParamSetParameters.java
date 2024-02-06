package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a */
    ASN1Integer f5574a;

    /* renamed from: b */
    ASN1Integer f5575b;

    /* renamed from: p */
    ASN1Integer f5576p;

    /* renamed from: q */
    ASN1Integer f5577q;

    /* renamed from: x */
    ASN1Integer f5578x;

    /* renamed from: y */
    ASN1Integer f5579y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f5574a = new ASN1Integer(bigInteger);
        this.f5575b = new ASN1Integer(bigInteger2);
        this.f5576p = new ASN1Integer(bigInteger3);
        this.f5577q = new ASN1Integer(bigInteger4);
        this.f5578x = new ASN1Integer((long) i);
        this.f5579y = new ASN1Integer(bigInteger5);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f5574a = (ASN1Integer) objects.nextElement();
        this.f5575b = (ASN1Integer) objects.nextElement();
        this.f5576p = (ASN1Integer) objects.nextElement();
        this.f5577q = (ASN1Integer) objects.nextElement();
        this.f5578x = (ASN1Integer) objects.nextElement();
        this.f5579y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid GOST3410Parameter: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public BigInteger getA() {
        return this.f5574a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f5576p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f5577q.getPositiveValue();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f5574a);
        aSN1EncodableVector.add(this.f5575b);
        aSN1EncodableVector.add(this.f5576p);
        aSN1EncodableVector.add(this.f5577q);
        aSN1EncodableVector.add(this.f5578x);
        aSN1EncodableVector.add(this.f5579y);
        return new DERSequence(aSN1EncodableVector);
    }
}
