package org.bouncycastle.asn1.p061x9;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* renamed from: org.bouncycastle.asn1.x9.DomainParameters */
public class DomainParameters extends ASN1Object {

    /* renamed from: g */
    private final ASN1Integer f5624g;

    /* renamed from: j */
    private final ASN1Integer f5625j;

    /* renamed from: p */
    private final ASN1Integer f5626p;

    /* renamed from: q */
    private final ASN1Integer f5627q;
    private final ValidationParams validationParams;

    public DomainParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, ValidationParams validationParams2) {
        if (bigInteger == null) {
            throw new IllegalArgumentException("'p' cannot be null");
        } else if (bigInteger2 == null) {
            throw new IllegalArgumentException("'g' cannot be null");
        } else if (bigInteger3 != null) {
            this.f5626p = new ASN1Integer(bigInteger);
            this.f5624g = new ASN1Integer(bigInteger2);
            this.f5627q = new ASN1Integer(bigInteger3);
            this.f5625j = bigInteger4 != null ? new ASN1Integer(bigInteger4) : null;
            this.validationParams = validationParams2;
        } else {
            throw new IllegalArgumentException("'q' cannot be null");
        }
    }

    private DomainParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() < 3 || aSN1Sequence.size() > 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new IllegalArgumentException(sb.toString());
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f5626p = ASN1Integer.getInstance(objects.nextElement());
        this.f5624g = ASN1Integer.getInstance(objects.nextElement());
        this.f5627q = ASN1Integer.getInstance(objects.nextElement());
        ASN1Encodable next = getNext(objects);
        if (next == null || !(next instanceof ASN1Integer)) {
            this.f5625j = null;
        } else {
            this.f5625j = ASN1Integer.getInstance(next);
            next = getNext(objects);
        }
        if (next != null) {
            this.validationParams = ValidationParams.getInstance(next.toASN1Primitive());
        } else {
            this.validationParams = null;
        }
    }

    public static DomainParameters getInstance(Object obj) {
        if (obj instanceof DomainParameters) {
            return (DomainParameters) obj;
        }
        if (obj != null) {
            return new DomainParameters(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static DomainParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    private static ASN1Encodable getNext(Enumeration enumeration) {
        if (enumeration.hasMoreElements()) {
            return (ASN1Encodable) enumeration.nextElement();
        }
        return null;
    }

    public BigInteger getG() {
        return this.f5624g.getPositiveValue();
    }

    public BigInteger getJ() {
        ASN1Integer aSN1Integer = this.f5625j;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f5626p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f5627q.getPositiveValue();
    }

    public ValidationParams getValidationParams() {
        return this.validationParams;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.f5626p);
        aSN1EncodableVector.add(this.f5624g);
        aSN1EncodableVector.add(this.f5627q);
        ASN1Integer aSN1Integer = this.f5625j;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ValidationParams validationParams2 = this.validationParams;
        if (validationParams2 != null) {
            aSN1EncodableVector.add(validationParams2);
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
