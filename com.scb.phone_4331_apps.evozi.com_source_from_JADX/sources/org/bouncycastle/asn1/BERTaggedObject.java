package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;

public class BERTaggedObject extends ASN1TaggedObject {
    public BERTaggedObject(int i) {
        super(false, i, new BERSequence());
    }

    public BERTaggedObject(int i, ASN1Encodable aSN1Encodable) {
        super(true, i, aSN1Encodable);
    }

    public BERTaggedObject(boolean z, int i, ASN1Encodable aSN1Encodable) {
        super(z, i, aSN1Encodable);
    }

    /* access modifiers changed from: package-private */
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        Enumeration enumeration;
        aSN1OutputStream.writeTag(160, this.tagNo);
        aSN1OutputStream.write(128);
        if (!this.empty) {
            if (!this.explicit) {
                if (this.obj instanceof ASN1OctetString) {
                    enumeration = (this.obj instanceof BEROctetString ? (BEROctetString) this.obj : new BEROctetString(((ASN1OctetString) this.obj).getOctets())).getObjects();
                } else if (this.obj instanceof ASN1Sequence) {
                    enumeration = ((ASN1Sequence) this.obj).getObjects();
                } else if (this.obj instanceof ASN1Set) {
                    enumeration = ((ASN1Set) this.obj).getObjects();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("not implemented: ");
                    sb.append(this.obj.getClass().getName());
                    throw new ASN1Exception(sb.toString());
                }
                while (enumeration.hasMoreElements()) {
                    aSN1OutputStream.writeObject((ASN1Encodable) enumeration.nextElement());
                }
            } else {
                aSN1OutputStream.writeObject(this.obj);
            }
        }
        aSN1OutputStream.write(0);
        aSN1OutputStream.write(0);
    }

    /* access modifiers changed from: package-private */
    public int encodedLength() throws IOException {
        int i;
        if (this.empty) {
            return StreamUtil.calculateTagLength(this.tagNo) + 1;
        }
        int encodedLength = this.obj.toASN1Primitive().encodedLength();
        if (this.explicit) {
            i = StreamUtil.calculateTagLength(this.tagNo) + StreamUtil.calculateBodyLength(encodedLength);
        } else {
            encodedLength--;
            i = StreamUtil.calculateTagLength(this.tagNo);
        }
        return i + encodedLength;
    }

    /* access modifiers changed from: package-private */
    public boolean isConstructed() {
        if (this.empty || this.explicit) {
            return true;
        }
        return this.obj.toASN1Primitive().toDERObject().isConstructed();
    }
}
