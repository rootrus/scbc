package org.bouncycastle.asn1;

class DERFactory {
    static final ASN1Sequence EMPTY_SEQUENCE = new DERSequence();
    static final ASN1Set EMPTY_SET = new DERSet();

    DERFactory() {
    }

    static ASN1Sequence createSequence(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() <= 0 ? EMPTY_SEQUENCE : new DLSequence(aSN1EncodableVector);
    }

    static ASN1Set createSet(ASN1EncodableVector aSN1EncodableVector) {
        return aSN1EncodableVector.size() <= 0 ? EMPTY_SET : new DLSet(aSN1EncodableVector);
    }
}
