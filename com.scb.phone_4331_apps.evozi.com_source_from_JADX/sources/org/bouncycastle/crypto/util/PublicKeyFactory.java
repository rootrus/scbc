package org.bouncycastle.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class PublicKeyFactory {
    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: org.bouncycastle.crypto.params.DSAParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: org.bouncycastle.crypto.params.DSAParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: org.bouncycastle.crypto.params.ECNamedDomainParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: org.bouncycastle.crypto.params.ECDomainParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: org.bouncycastle.crypto.params.DSAParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: org.bouncycastle.crypto.params.DHValidationParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: org.bouncycastle.crypto.params.DSAParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: org.bouncycastle.crypto.params.ECNamedDomainParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: org.bouncycastle.crypto.params.ECNamedDomainParameters} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: org.bouncycastle.crypto.params.DSAParameters} */
    /* JADX WARNING: type inference failed for: r3v11, types: [org.bouncycastle.crypto.params.DHValidationParameters] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.bouncycastle.crypto.params.AsymmetricKeyParameter createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r10) throws java.io.IOException {
        /*
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r10.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rsaEncryption
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 != 0) goto L_0x01ba
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r3 = org.bouncycastle.asn1.x509.X509ObjectIdentifiers.id_ea_rsa
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x01ba
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r3 = org.bouncycastle.asn1.p061x9.X9ObjectIdentifiers.dhpublicnumber
            boolean r1 = r1.equals(r3)
            r3 = 0
            if (r1 == 0) goto L_0x007b
            org.bouncycastle.asn1.ASN1Primitive r10 = r10.parsePublicKey()
            org.bouncycastle.asn1.x9.DHPublicKey r10 = org.bouncycastle.asn1.p061x9.DHPublicKey.getInstance(r10)
            java.math.BigInteger r10 = r10.getY()
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.getParameters()
            org.bouncycastle.asn1.x9.DomainParameters r0 = org.bouncycastle.asn1.p061x9.DomainParameters.getInstance(r0)
            java.math.BigInteger r5 = r0.getP()
            java.math.BigInteger r6 = r0.getG()
            java.math.BigInteger r7 = r0.getQ()
            java.math.BigInteger r1 = r0.getJ()
            if (r1 == 0) goto L_0x0056
            java.math.BigInteger r1 = r0.getJ()
            r8 = r1
            goto L_0x0057
        L_0x0056:
            r8 = r3
        L_0x0057:
            org.bouncycastle.asn1.x9.ValidationParams r0 = r0.getValidationParams()
            if (r0 == 0) goto L_0x006e
            org.bouncycastle.crypto.params.DHValidationParameters r3 = new org.bouncycastle.crypto.params.DHValidationParameters
            byte[] r1 = r0.getSeed()
            java.math.BigInteger r0 = r0.getPgenCounter()
            int r0 = r0.intValue()
            r3.<init>(r1, r0)
        L_0x006e:
            r9 = r3
            org.bouncycastle.crypto.params.DHPublicKeyParameters r0 = new org.bouncycastle.crypto.params.DHPublicKeyParameters
            org.bouncycastle.crypto.params.DHParameters r1 = new org.bouncycastle.crypto.params.DHParameters
            r4 = r1
            r4.<init>((java.math.BigInteger) r5, (java.math.BigInteger) r6, (java.math.BigInteger) r7, (java.math.BigInteger) r8, (org.bouncycastle.crypto.params.DHValidationParameters) r9)
            r0.<init>(r10, r1)
            return r0
        L_0x007b:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r4 = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.dhKeyAgreement
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00b6
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.getParameters()
            org.bouncycastle.asn1.pkcs.DHParameter r0 = org.bouncycastle.asn1.pkcs.DHParameter.getInstance(r0)
            org.bouncycastle.asn1.ASN1Primitive r10 = r10.parsePublicKey()
            org.bouncycastle.asn1.ASN1Integer r10 = (org.bouncycastle.asn1.ASN1Integer) r10
            java.math.BigInteger r1 = r0.getL()
            if (r1 == 0) goto L_0x009f
            int r2 = r1.intValue()
        L_0x009f:
            org.bouncycastle.crypto.params.DHParameters r1 = new org.bouncycastle.crypto.params.DHParameters
            java.math.BigInteger r4 = r0.getP()
            java.math.BigInteger r0 = r0.getG()
            r1.<init>(r4, r0, r3, r2)
            org.bouncycastle.crypto.params.DHPublicKeyParameters r0 = new org.bouncycastle.crypto.params.DHPublicKeyParameters
            java.math.BigInteger r10 = r10.getValue()
            r0.<init>(r10, r1)
            return r0
        L_0x00b6:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.elGamalAlgorithm
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00e7
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.getParameters()
            org.bouncycastle.asn1.oiw.ElGamalParameter r0 = org.bouncycastle.asn1.oiw.ElGamalParameter.getInstance(r0)
            org.bouncycastle.crypto.params.ElGamalPublicKeyParameters r1 = new org.bouncycastle.crypto.params.ElGamalPublicKeyParameters
            org.bouncycastle.asn1.ASN1Primitive r10 = r10.parsePublicKey()
            org.bouncycastle.asn1.ASN1Integer r10 = (org.bouncycastle.asn1.ASN1Integer) r10
            java.math.BigInteger r10 = r10.getValue()
            org.bouncycastle.crypto.params.ElGamalParameters r2 = new org.bouncycastle.crypto.params.ElGamalParameters
            java.math.BigInteger r3 = r0.getP()
            java.math.BigInteger r0 = r0.getG()
            r2.<init>(r3, r0)
            r1.<init>(r10, r2)
            return r1
        L_0x00e7:
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.p061x9.X9ObjectIdentifiers.id_dsa
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x018b
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.dsaWithSHA1
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x018b
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r2 = org.bouncycastle.asn1.p061x9.X9ObjectIdentifiers.id_ecPublicKey
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0183
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.getParameters()
            org.bouncycastle.asn1.x9.X962Parameters r0 = org.bouncycastle.asn1.p061x9.X962Parameters.getInstance(r0)
            boolean r1 = r0.isNamedCurve()
            org.bouncycastle.asn1.ASN1Primitive r0 = r0.getParameters()
            if (r1 == 0) goto L_0x0145
            r3 = r0
            org.bouncycastle.asn1.ASN1ObjectIdentifier r3 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r3
            org.bouncycastle.asn1.x9.X9ECParameters r0 = org.bouncycastle.crypto.p093ec.CustomNamedCurves.getByOID(r3)
            if (r0 != 0) goto L_0x012a
            org.bouncycastle.asn1.x9.X9ECParameters r0 = org.bouncycastle.asn1.p061x9.ECNamedCurveTable.getByOID(r3)
        L_0x012a:
            org.bouncycastle.crypto.params.ECNamedDomainParameters r1 = new org.bouncycastle.crypto.params.ECNamedDomainParameters
            org.bouncycastle.math.ec.ECCurve r4 = r0.getCurve()
            org.bouncycastle.math.ec.ECPoint r5 = r0.getG()
            java.math.BigInteger r6 = r0.getN()
            java.math.BigInteger r7 = r0.getH()
            byte[] r8 = r0.getSeed()
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x0163
        L_0x0145:
            org.bouncycastle.asn1.x9.X9ECParameters r0 = org.bouncycastle.asn1.p061x9.X9ECParameters.getInstance(r0)
            org.bouncycastle.crypto.params.ECDomainParameters r7 = new org.bouncycastle.crypto.params.ECDomainParameters
            org.bouncycastle.math.ec.ECCurve r2 = r0.getCurve()
            org.bouncycastle.math.ec.ECPoint r3 = r0.getG()
            java.math.BigInteger r4 = r0.getN()
            java.math.BigInteger r5 = r0.getH()
            byte[] r6 = r0.getSeed()
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L_0x0163:
            org.bouncycastle.asn1.DEROctetString r2 = new org.bouncycastle.asn1.DEROctetString
            org.bouncycastle.asn1.DERBitString r10 = r10.getPublicKeyData()
            byte[] r10 = r10.getBytes()
            r2.<init>((byte[]) r10)
            org.bouncycastle.crypto.params.ECPublicKeyParameters r10 = new org.bouncycastle.crypto.params.ECPublicKeyParameters
            org.bouncycastle.asn1.x9.X9ECPoint r3 = new org.bouncycastle.asn1.x9.X9ECPoint
            org.bouncycastle.math.ec.ECCurve r0 = r0.getCurve()
            r3.<init>((org.bouncycastle.math.p099ec.ECCurve) r0, (org.bouncycastle.asn1.ASN1OctetString) r2)
            org.bouncycastle.math.ec.ECPoint r0 = r3.getPoint()
            r10.<init>(r0, r1)
            return r10
        L_0x0183:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r0 = "algorithm identifier in key not recognised"
            r10.<init>(r0)
            throw r10
        L_0x018b:
            org.bouncycastle.asn1.ASN1Primitive r10 = r10.parsePublicKey()
            org.bouncycastle.asn1.ASN1Integer r10 = (org.bouncycastle.asn1.ASN1Integer) r10
            org.bouncycastle.asn1.ASN1Encodable r0 = r0.getParameters()
            if (r0 == 0) goto L_0x01b0
            org.bouncycastle.asn1.ASN1Primitive r0 = r0.toASN1Primitive()
            org.bouncycastle.asn1.x509.DSAParameter r0 = org.bouncycastle.asn1.x509.DSAParameter.getInstance(r0)
            org.bouncycastle.crypto.params.DSAParameters r3 = new org.bouncycastle.crypto.params.DSAParameters
            java.math.BigInteger r1 = r0.getP()
            java.math.BigInteger r2 = r0.getQ()
            java.math.BigInteger r0 = r0.getG()
            r3.<init>(r1, r2, r0)
        L_0x01b0:
            org.bouncycastle.crypto.params.DSAPublicKeyParameters r0 = new org.bouncycastle.crypto.params.DSAPublicKeyParameters
            java.math.BigInteger r10 = r10.getValue()
            r0.<init>(r10, r3)
            return r0
        L_0x01ba:
            org.bouncycastle.asn1.ASN1Primitive r10 = r10.parsePublicKey()
            org.bouncycastle.asn1.pkcs.RSAPublicKey r10 = org.bouncycastle.asn1.pkcs.RSAPublicKey.getInstance(r10)
            org.bouncycastle.crypto.params.RSAKeyParameters r0 = new org.bouncycastle.crypto.params.RSAKeyParameters
            java.math.BigInteger r1 = r10.getModulus()
            java.math.BigInteger r10 = r10.getPublicExponent()
            r0.<init>(r2, r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.util.PublicKeyFactory.createKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):org.bouncycastle.crypto.params.AsymmetricKeyParameter");
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
