package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

public class CrlValidatedID extends ASN1Object {
    private OtherHash crlHash;
    private CrlIdentifier crlIdentifier;

    private CrlValidatedID(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new IllegalArgumentException(sb.toString());
        }
        this.crlHash = OtherHash.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() > 1) {
            this.crlIdentifier = CrlIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public CrlValidatedID(OtherHash otherHash) {
        this(otherHash, (CrlIdentifier) null);
    }

    public CrlValidatedID(OtherHash otherHash, CrlIdentifier crlIdentifier2) {
        this.crlHash = otherHash;
        this.crlIdentifier = crlIdentifier2;
    }

    public static CrlValidatedID getInstance(Object obj) {
        if (obj instanceof CrlValidatedID) {
            return (CrlValidatedID) obj;
        }
        if (obj != null) {
            return new CrlValidatedID(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public OtherHash getCrlHash() {
        return this.crlHash;
    }

    public CrlIdentifier getCrlIdentifier() {
        return this.crlIdentifier;
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(this.crlHash.toASN1Primitive());
        CrlIdentifier crlIdentifier2 = this.crlIdentifier;
        if (crlIdentifier2 != null) {
            aSN1EncodableVector.add(crlIdentifier2.toASN1Primitive());
        }
        return new DERSequence(aSN1EncodableVector);
    }
}
