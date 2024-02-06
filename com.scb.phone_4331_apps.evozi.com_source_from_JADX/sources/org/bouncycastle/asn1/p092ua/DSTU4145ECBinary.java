package org.bouncycastle.asn1.p092ua;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.field.PolynomialExtensionField;
import org.bouncycastle.math.p099ec.ECAlgorithms;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.util.Arrays;

/* renamed from: org.bouncycastle.asn1.ua.DSTU4145ECBinary */
public class DSTU4145ECBinary extends ASN1Object {

    /* renamed from: a */
    ASN1Integer f5609a;

    /* renamed from: b */
    ASN1OctetString f5610b;

    /* renamed from: bp */
    ASN1OctetString f5611bp;

    /* renamed from: f */
    DSTU4145BinaryField f5612f;

    /* renamed from: n */
    ASN1Integer f5613n;
    BigInteger version = BigInteger.valueOf(0);

    private DSTU4145ECBinary(ASN1Sequence aSN1Sequence) {
        int i = 0;
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Sequence.getObjectAt(0);
            if (!aSN1TaggedObject.isExplicit() || aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.version = ASN1Integer.getInstance(aSN1TaggedObject.getLoadedObject()).getValue();
            i = 1;
        }
        this.f5612f = DSTU4145BinaryField.getInstance(aSN1Sequence.getObjectAt(i));
        int i2 = i + 1;
        this.f5609a = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i2));
        int i3 = i2 + 1;
        this.f5610b = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i3));
        int i4 = i3 + 1;
        this.f5613n = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(i4));
        this.f5611bp = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(i4 + 1));
    }

    public DSTU4145ECBinary(ECDomainParameters eCDomainParameters) {
        DSTU4145BinaryField dSTU4145BinaryField;
        ECCurve curve = eCDomainParameters.getCurve();
        if (ECAlgorithms.isF2mCurve(curve)) {
            int[] exponentsPresent = ((PolynomialExtensionField) curve.getField()).getMinimalPolynomial().getExponentsPresent();
            if (exponentsPresent.length == 3) {
                dSTU4145BinaryField = new DSTU4145BinaryField(exponentsPresent[2], exponentsPresent[1]);
            } else if (exponentsPresent.length == 5) {
                dSTU4145BinaryField = new DSTU4145BinaryField(exponentsPresent[4], exponentsPresent[1], exponentsPresent[2], exponentsPresent[3]);
            } else {
                throw new IllegalArgumentException("curve must have a trinomial or pentanomial basis");
            }
            this.f5612f = dSTU4145BinaryField;
            this.f5609a = new ASN1Integer(curve.getA().toBigInteger());
            this.f5610b = new DEROctetString(curve.getB().getEncoded());
            this.f5613n = new ASN1Integer(eCDomainParameters.getN());
            this.f5611bp = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCDomainParameters.getG()));
            return;
        }
        throw new IllegalArgumentException("only binary domain is possible");
    }

    public static DSTU4145ECBinary getInstance(Object obj) {
        if (obj instanceof DSTU4145ECBinary) {
            return (DSTU4145ECBinary) obj;
        }
        if (obj != null) {
            return new DSTU4145ECBinary(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getA() {
        return this.f5609a.getValue();
    }

    public byte[] getB() {
        return Arrays.clone(this.f5610b.getOctets());
    }

    public DSTU4145BinaryField getField() {
        return this.f5612f;
    }

    public byte[] getG() {
        return Arrays.clone(this.f5611bp.getOctets());
    }

    public BigInteger getN() {
        return this.f5613n.getValue();
    }

    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        if (this.version.compareTo(BigInteger.valueOf(0)) != 0) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, new ASN1Integer(this.version)));
        }
        aSN1EncodableVector.add(this.f5612f);
        aSN1EncodableVector.add(this.f5609a);
        aSN1EncodableVector.add(this.f5610b);
        aSN1EncodableVector.add(this.f5613n);
        aSN1EncodableVector.add(this.f5611bp);
        return new DERSequence(aSN1EncodableVector);
    }
}
