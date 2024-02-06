package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

public class RecipientIdentifier extends ASN1Object implements ASN1Choice {

    /* renamed from: id */
    private ASN1Encodable f5572id;

    public RecipientIdentifier(ASN1OctetString aSN1OctetString) {
        this.f5572id = new DERTaggedObject(false, 0, aSN1OctetString);
    }

    public RecipientIdentifier(ASN1Primitive aSN1Primitive) {
        this.f5572id = aSN1Primitive;
    }

    public RecipientIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f5572id = issuerAndSerialNumber;
    }

    public static RecipientIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof RecipientIdentifier)) {
            return (RecipientIdentifier) obj;
        }
        if (obj instanceof IssuerAndSerialNumber) {
            return new RecipientIdentifier((IssuerAndSerialNumber) obj);
        }
        if (obj instanceof ASN1OctetString) {
            return new RecipientIdentifier((ASN1OctetString) obj);
        }
        if (obj instanceof ASN1Primitive) {
            return new RecipientIdentifier((ASN1Primitive) obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal object in RecipientIdentifier: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public ASN1Encodable getId() {
        ASN1Encodable aSN1Encodable = this.f5572id;
        return aSN1Encodable instanceof ASN1TaggedObject ? ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Encodable, false) : IssuerAndSerialNumber.getInstance(aSN1Encodable);
    }

    public boolean isTagged() {
        return this.f5572id instanceof ASN1TaggedObject;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.f5572id.toASN1Primitive();
    }
}
