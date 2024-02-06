package org.bouncycastle.asn1;

import java.util.Enumeration;
import java.util.Vector;

public class ASN1EncodableVector {

    /* renamed from: v */
    private final Vector f2664v = new Vector();

    public void add(ASN1Encodable aSN1Encodable) {
        this.f2664v.addElement(aSN1Encodable);
    }

    public void addAll(ASN1EncodableVector aSN1EncodableVector) {
        Enumeration elements = aSN1EncodableVector.f2664v.elements();
        while (elements.hasMoreElements()) {
            this.f2664v.addElement(elements.nextElement());
        }
    }

    public ASN1Encodable get(int i) {
        return (ASN1Encodable) this.f2664v.elementAt(i);
    }

    public int size() {
        return this.f2664v.size();
    }
}
