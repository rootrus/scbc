package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class SignerIdentifier extends ASN1Object implements ASN1Choice {

    /* renamed from: id */
    private ASN1Encodable f5573id;

    public SignerIdentifier(ASN1OctetString aSN1OctetString) {
        this.f5573id = new DERTaggedObject(false, 0, aSN1OctetString);
    }

    public SignerIdentifier(ASN1Primitive aSN1Primitive) {
        this.f5573id = aSN1Primitive;
    }

    public SignerIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f5573id = issuerAndSerialNumber;
    }

    public static SignerIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof SignerIdentifier)) {
            return (SignerIdentifier) obj;
        }
        if (obj instanceof IssuerAndSerialNumber) {
            return new SignerIdentifier((IssuerAndSerialNumber) obj);
        }
        if (obj instanceof ASN1OctetString) {
            return new SignerIdentifier((ASN1OctetString) obj);
        }
        if (obj instanceof ASN1Primitive) {
            return new SignerIdentifier((ASN1Primitive) obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal object in SignerIdentifier: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public ASN1Encodable getId() {
        ASN1Encodable aSN1Encodable = this.f5573id;
        return aSN1Encodable instanceof ASN1TaggedObject ? ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Encodable, false) : aSN1Encodable;
    }

    public boolean isTagged() {
        return this.f5573id instanceof ASN1TaggedObject;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.f5573id.toASN1Primitive();
    }
}
