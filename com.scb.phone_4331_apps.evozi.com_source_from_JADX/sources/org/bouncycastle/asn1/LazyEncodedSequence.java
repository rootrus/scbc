package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

class LazyEncodedSequence extends ASN1Sequence {
    private byte[] encoded;

    LazyEncodedSequence(byte[] bArr) throws IOException {
        this.encoded = bArr;
    }

    private void parse() {
        LazyConstructionEnumeration lazyConstructionEnumeration = new LazyConstructionEnumeration(this.encoded);
        while (lazyConstructionEnumeration.hasMoreElements()) {
            this.seq.addElement(lazyConstructionEnumeration.nextElement());
        }
        this.encoded = null;
    }

    /* access modifiers changed from: package-private */
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        byte[] bArr = this.encoded;
        if (bArr != null) {
            aSN1OutputStream.writeEncoded(48, bArr);
        } else {
            super.toDLObject().encode(aSN1OutputStream);
        }
    }

    /* access modifiers changed from: package-private */
    public int encodedLength() throws IOException {
        byte[] bArr = this.encoded;
        return bArr != null ? StreamUtil.calculateBodyLength(bArr.length) + 1 + this.encoded.length : super.toDLObject().encodedLength();
    }

    public ASN1Encodable getObjectAt(int i) {
        ASN1Encodable objectAt;
        synchronized (this) {
            if (this.encoded != null) {
                parse();
            }
            objectAt = super.getObjectAt(i);
        }
        return objectAt;
    }

    public Enumeration getObjects() {
        synchronized (this) {
            if (this.encoded == null) {
                Enumeration objects = super.getObjects();
                return objects;
            }
            LazyConstructionEnumeration lazyConstructionEnumeration = new LazyConstructionEnumeration(this.encoded);
            return lazyConstructionEnumeration;
        }
    }

    public int size() {
        int size;
        synchronized (this) {
            if (this.encoded != null) {
                parse();
            }
            size = super.size();
        }
        return size;
    }

    /* access modifiers changed from: package-private */
    public ASN1Primitive toDERObject() {
        if (this.encoded != null) {
            parse();
        }
        return super.toDERObject();
    }

    /* access modifiers changed from: package-private */
    public ASN1Primitive toDLObject() {
        if (this.encoded != null) {
            parse();
        }
        return super.toDLObject();
    }
}
