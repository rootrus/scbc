package org.bouncycastle.jce.provider;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters;
import org.bouncycastle.asn1.p061x9.X962Parameters;
import org.bouncycastle.asn1.p061x9.X9ECParameters;
import org.bouncycastle.asn1.p061x9.X9ECPoint;
import org.bouncycastle.asn1.p061x9.X9ObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.spec.ECNamedCurveSpec;
import org.bouncycastle.math.p099ec.ECCurve;
import org.bouncycastle.math.p099ec.ECPoint;
import org.bouncycastle.util.Strings;

public class JCEECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey, ECPointEncoder {
    private String algorithm = "EC";
    private ECParameterSpec ecSpec;
    private GOST3410PublicKeyAlgParameters gostParams;

    /* renamed from: q */
    private ECPoint f6135q;
    private boolean withCompression;

    public JCEECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.f6135q = EC5Util.convertPoint(params, eCPublicKeySpec.getW(), false);
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters) {
        this.algorithm = str;
        this.f6135q = eCPublicKeyParameters.getQ();
        this.ecSpec = null;
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, ECParameterSpec eCParameterSpec) {
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.algorithm = str;
        this.f6135q = eCPublicKeyParameters.getQ();
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), parameters);
        } else {
            this.ecSpec = eCParameterSpec;
        }
    }

    public JCEECPublicKey(String str, ECPublicKeyParameters eCPublicKeyParameters, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        ECDomainParameters parameters = eCPublicKeyParameters.getParameters();
        this.algorithm = str;
        this.f6135q = eCPublicKeyParameters.getQ();
        this.ecSpec = eCParameterSpec == null ? createSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), parameters) : EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
    }

    public JCEECPublicKey(String str, JCEECPublicKey jCEECPublicKey) {
        this.algorithm = str;
        this.f6135q = jCEECPublicKey.f6135q;
        this.ecSpec = jCEECPublicKey.ecSpec;
        this.withCompression = jCEECPublicKey.withCompression;
        this.gostParams = jCEECPublicKey.gostParams;
    }

    public JCEECPublicKey(String str, org.bouncycastle.jce.spec.ECPublicKeySpec eCPublicKeySpec) {
        ECParameterSpec eCParameterSpec;
        this.algorithm = str;
        this.f6135q = eCPublicKeySpec.getQ();
        if (eCPublicKeySpec.getParams() != null) {
            eCParameterSpec = EC5Util.convertSpec(EC5Util.convertCurve(eCPublicKeySpec.getParams().getCurve(), eCPublicKeySpec.getParams().getSeed()), eCPublicKeySpec.getParams());
        } else {
            if (this.f6135q.getCurve() == null) {
                this.f6135q = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa().getCurve().createPoint(this.f6135q.getAffineXCoord().toBigInteger(), this.f6135q.getAffineYCoord().toBigInteger(), false);
            }
            eCParameterSpec = null;
        }
        this.ecSpec = eCParameterSpec;
    }

    public JCEECPublicKey(ECPublicKey eCPublicKey) {
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.f6135q = EC5Util.convertPoint(params, eCPublicKey.getW(), false);
    }

    JCEECPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        populateFromPubKeyInfo(subjectPublicKeyInfo);
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, ECDomainParameters eCDomainParameters) {
        return new ECParameterSpec(ellipticCurve, new java.security.spec.ECPoint(eCDomainParameters.getG().getAffineXCoord().toBigInteger(), eCDomainParameters.getG().getAffineYCoord().toBigInteger()), eCDomainParameters.getN(), eCDomainParameters.getH().intValue());
    }

    private void extractBytes(byte[] bArr, int i, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(byteArray, 0, bArr2, 32 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i2 = 0; i2 != 32; i2++) {
            bArr[i + i2] = byteArray[(byteArray.length - 1) - i2];
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: org.bouncycastle.jce.spec.ECNamedCurveSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.security.spec.ECParameterSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: org.bouncycastle.jce.spec.ECNamedCurveSpec} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: org.bouncycastle.jce.spec.ECNamedCurveSpec} */
    /* JADX WARNING: type inference failed for: r14v6, types: [org.bouncycastle.asn1.ASN1Primitive] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateFromPubKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo r14) {
        /*
            r13 = this;
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r0 = r14.getAlgorithmId()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = r0.getAlgorithm()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3410_2001
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "error recovering public key"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00bf
            org.bouncycastle.asn1.DERBitString r0 = r14.getPublicKeyData()
            java.lang.String r4 = "ECGOST3410"
            r13.algorithm = r4
            byte[] r0 = r0.getBytes()     // Catch:{ IOException -> 0x00b9 }
            org.bouncycastle.asn1.ASN1Primitive r0 = org.bouncycastle.asn1.ASN1Primitive.fromByteArray(r0)     // Catch:{ IOException -> 0x00b9 }
            org.bouncycastle.asn1.ASN1OctetString r0 = (org.bouncycastle.asn1.ASN1OctetString) r0     // Catch:{ IOException -> 0x00b9 }
            byte[] r0 = r0.getOctets()
            r1 = 32
            byte[] r4 = new byte[r1]
            byte[] r5 = new byte[r1]
            r6 = r2
        L_0x0031:
            if (r6 == r1) goto L_0x003c
            int r7 = 31 - r6
            byte r7 = r0[r7]
            r4[r6] = r7
            int r6 = r6 + 1
            goto L_0x0031
        L_0x003c:
            r6 = r2
        L_0x003d:
            if (r6 == r1) goto L_0x0048
            int r7 = 63 - r6
            byte r7 = r0[r7]
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x003d
        L_0x0048:
            org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters r0 = new org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r14 = r14.getAlgorithmId()
            org.bouncycastle.asn1.ASN1Encodable r14 = r14.getParameters()
            org.bouncycastle.asn1.ASN1Sequence r14 = (org.bouncycastle.asn1.ASN1Sequence) r14
            r0.<init>(r14)
            r13.gostParams = r0
            org.bouncycastle.asn1.ASN1ObjectIdentifier r14 = r0.getPublicKeyParamSet()
            java.lang.String r14 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(r14)
            org.bouncycastle.jce.spec.ECNamedCurveParameterSpec r14 = org.bouncycastle.jce.ECGOST3410NamedCurveTable.getParameterSpec(r14)
            org.bouncycastle.math.ec.ECCurve r0 = r14.getCurve()
            byte[] r1 = r14.getSeed()
            java.security.spec.EllipticCurve r8 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0, r1)
            java.math.BigInteger r1 = new java.math.BigInteger
            r1.<init>(r3, r4)
            java.math.BigInteger r4 = new java.math.BigInteger
            r4.<init>(r3, r5)
            org.bouncycastle.math.ec.ECPoint r0 = r0.createPoint(r1, r4, r2)
            r13.f6135q = r0
            org.bouncycastle.jce.spec.ECNamedCurveSpec r0 = new org.bouncycastle.jce.spec.ECNamedCurveSpec
            org.bouncycastle.asn1.cryptopro.GOST3410PublicKeyAlgParameters r1 = r13.gostParams
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r1.getPublicKeyParamSet()
            java.lang.String r7 = org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves.getName(r1)
            java.security.spec.ECPoint r9 = new java.security.spec.ECPoint
            org.bouncycastle.math.ec.ECPoint r1 = r14.getG()
            org.bouncycastle.math.ec.ECFieldElement r1 = r1.getAffineXCoord()
            java.math.BigInteger r1 = r1.toBigInteger()
            org.bouncycastle.math.ec.ECPoint r2 = r14.getG()
            org.bouncycastle.math.ec.ECFieldElement r2 = r2.getAffineYCoord()
            java.math.BigInteger r2 = r2.toBigInteger()
            r9.<init>(r1, r2)
            java.math.BigInteger r10 = r14.getN()
            java.math.BigInteger r11 = r14.getH()
            r6 = r0
            r6.<init>((java.lang.String) r7, (java.security.spec.EllipticCurve) r8, (java.security.spec.ECPoint) r9, (java.math.BigInteger) r10, (java.math.BigInteger) r11)
            r13.ecSpec = r0
            return
        L_0x00b9:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r1)
            throw r14
        L_0x00bf:
            org.bouncycastle.asn1.x9.X962Parameters r0 = new org.bouncycastle.asn1.x9.X962Parameters
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r4 = r14.getAlgorithmId()
            org.bouncycastle.asn1.ASN1Encodable r4 = r4.getParameters()
            org.bouncycastle.asn1.ASN1Primitive r4 = (org.bouncycastle.asn1.ASN1Primitive) r4
            r0.<init>((org.bouncycastle.asn1.ASN1Primitive) r4)
            boolean r4 = r0.isNamedCurve()
            if (r4 == 0) goto L_0x011a
            org.bouncycastle.asn1.ASN1Primitive r0 = r0.getParameters()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r0
            org.bouncycastle.asn1.x9.X9ECParameters r4 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveByOid(r0)
            org.bouncycastle.math.ec.ECCurve r5 = r4.getCurve()
            byte[] r6 = r4.getSeed()
            java.security.spec.EllipticCurve r9 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r5, r6)
            org.bouncycastle.jce.spec.ECNamedCurveSpec r6 = new org.bouncycastle.jce.spec.ECNamedCurveSpec
            java.lang.String r8 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getCurveName(r0)
            java.security.spec.ECPoint r10 = new java.security.spec.ECPoint
            org.bouncycastle.math.ec.ECPoint r0 = r4.getG()
            org.bouncycastle.math.ec.ECFieldElement r0 = r0.getAffineXCoord()
            java.math.BigInteger r0 = r0.toBigInteger()
            org.bouncycastle.math.ec.ECPoint r7 = r4.getG()
            org.bouncycastle.math.ec.ECFieldElement r7 = r7.getAffineYCoord()
            java.math.BigInteger r7 = r7.toBigInteger()
            r10.<init>(r0, r7)
            java.math.BigInteger r11 = r4.getN()
            java.math.BigInteger r12 = r4.getH()
            r7 = r6
            r7.<init>((java.lang.String) r8, (java.security.spec.EllipticCurve) r9, (java.security.spec.ECPoint) r10, (java.math.BigInteger) r11, (java.math.BigInteger) r12)
            goto L_0x0170
        L_0x011a:
            boolean r4 = r0.isImplicitlyCA()
            if (r4 == 0) goto L_0x012e
            r0 = 0
            r13.ecSpec = r0
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r0 = org.bouncycastle.jce.provider.BouncyCastleProvider.CONFIGURATION
            org.bouncycastle.jce.spec.ECParameterSpec r0 = r0.getEcImplicitlyCa()
            org.bouncycastle.math.ec.ECCurve r0 = r0.getCurve()
            goto L_0x0173
        L_0x012e:
            org.bouncycastle.asn1.ASN1Primitive r0 = r0.getParameters()
            org.bouncycastle.asn1.x9.X9ECParameters r0 = org.bouncycastle.asn1.p061x9.X9ECParameters.getInstance(r0)
            org.bouncycastle.math.ec.ECCurve r5 = r0.getCurve()
            java.security.spec.ECParameterSpec r6 = new java.security.spec.ECParameterSpec
            byte[] r4 = r0.getSeed()
            java.security.spec.EllipticCurve r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r5, r4)
            java.security.spec.ECPoint r7 = new java.security.spec.ECPoint
            org.bouncycastle.math.ec.ECPoint r8 = r0.getG()
            org.bouncycastle.math.ec.ECFieldElement r8 = r8.getAffineXCoord()
            java.math.BigInteger r8 = r8.toBigInteger()
            org.bouncycastle.math.ec.ECPoint r9 = r0.getG()
            org.bouncycastle.math.ec.ECFieldElement r9 = r9.getAffineYCoord()
            java.math.BigInteger r9 = r9.toBigInteger()
            r7.<init>(r8, r9)
            java.math.BigInteger r8 = r0.getN()
            java.math.BigInteger r0 = r0.getH()
            int r0 = r0.intValue()
            r6.<init>(r4, r7, r8, r0)
        L_0x0170:
            r13.ecSpec = r6
            r0 = r5
        L_0x0173:
            org.bouncycastle.asn1.DERBitString r14 = r14.getPublicKeyData()
            byte[] r14 = r14.getBytes()
            org.bouncycastle.asn1.DEROctetString r4 = new org.bouncycastle.asn1.DEROctetString
            r4.<init>((byte[]) r14)
            byte r2 = r14[r2]
            r5 = 4
            if (r2 != r5) goto L_0x01b0
            byte r2 = r14[r3]
            int r3 = r14.length
            r5 = 2
            int r3 = r3 - r5
            if (r2 != r3) goto L_0x01b0
            byte r2 = r14[r5]
            r3 = 3
            if (r2 == r5) goto L_0x0195
            byte r2 = r14[r5]
            if (r2 != r3) goto L_0x01b0
        L_0x0195:
            org.bouncycastle.asn1.x9.X9IntegerConverter r2 = new org.bouncycastle.asn1.x9.X9IntegerConverter
            r2.<init>()
            int r2 = r2.getByteLength((org.bouncycastle.math.p099ec.ECCurve) r0)
            int r5 = r14.length
            int r5 = r5 - r3
            if (r2 < r5) goto L_0x01b0
            org.bouncycastle.asn1.ASN1Primitive r14 = org.bouncycastle.asn1.ASN1Primitive.fromByteArray(r14)     // Catch:{ IOException -> 0x01aa }
            r4 = r14
            org.bouncycastle.asn1.ASN1OctetString r4 = (org.bouncycastle.asn1.ASN1OctetString) r4     // Catch:{ IOException -> 0x01aa }
            goto L_0x01b0
        L_0x01aa:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            r14.<init>(r1)
            throw r14
        L_0x01b0:
            org.bouncycastle.asn1.x9.X9ECPoint r14 = new org.bouncycastle.asn1.x9.X9ECPoint
            r14.<init>((org.bouncycastle.math.p099ec.ECCurve) r0, (org.bouncycastle.asn1.ASN1OctetString) r4)
            org.bouncycastle.math.ec.ECPoint r14 = r14.getPoint()
            r13.f6135q = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.JCEECPublicKey.populateFromPubKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        populateFromPubKeyInfo(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.algorithm = (String) objectInputStream.readObject();
        this.withCompression = objectInputStream.readBoolean();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(getEncoded());
        objectOutputStream.writeObject(this.algorithm);
        objectOutputStream.writeBoolean(this.withCompression);
    }

    public ECPoint engineGetQ() {
        return this.f6135q;
    }

    /* access modifiers changed from: package-private */
    public org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec, this.withCompression) : BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JCEECPublicKey)) {
            return false;
        }
        JCEECPublicKey jCEECPublicKey = (JCEECPublicKey) obj;
        return engineGetQ().equals(jCEECPublicKey.engineGetQ()) && engineGetSpec().equals(jCEECPublicKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        SubjectPublicKeyInfo subjectPublicKeyInfo;
        X962Parameters x962Parameters;
        if (this.algorithm.equals("ECGOST3410")) {
            ASN1Encodable aSN1Encodable = this.gostParams;
            if (aSN1Encodable == null) {
                ECParameterSpec eCParameterSpec = this.ecSpec;
                if (eCParameterSpec instanceof ECNamedCurveSpec) {
                    aSN1Encodable = new GOST3410PublicKeyAlgParameters(ECGOST3410NamedCurves.getOID(((ECNamedCurveSpec) eCParameterSpec).getName()), CryptoProObjectIdentifiers.gostR3411_94_CryptoProParamSet);
                } else {
                    ECCurve convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
                    aSN1Encodable = new X962Parameters(new X9ECParameters(convertCurve, EC5Util.convertPoint(convertCurve, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
                }
            }
            BigInteger bigInteger = this.f6135q.getAffineXCoord().toBigInteger();
            BigInteger bigInteger2 = this.f6135q.getAffineYCoord().toBigInteger();
            byte[] bArr = new byte[64];
            extractBytes(bArr, 0, bigInteger);
            extractBytes(bArr, 32, bigInteger2);
            try {
                subjectPublicKeyInfo = new SubjectPublicKeyInfo(new AlgorithmIdentifier(CryptoProObjectIdentifiers.gostR3410_2001, aSN1Encodable), (ASN1Encodable) new DEROctetString(bArr));
            } catch (IOException unused) {
                return null;
            }
        } else {
            ECParameterSpec eCParameterSpec2 = this.ecSpec;
            if (eCParameterSpec2 instanceof ECNamedCurveSpec) {
                ASN1ObjectIdentifier namedCurveOid = ECUtil.getNamedCurveOid(((ECNamedCurveSpec) eCParameterSpec2).getName());
                if (namedCurveOid == null) {
                    namedCurveOid = new ASN1ObjectIdentifier(((ECNamedCurveSpec) this.ecSpec).getName());
                }
                x962Parameters = new X962Parameters(namedCurveOid);
            } else if (eCParameterSpec2 == null) {
                x962Parameters = new X962Parameters((ASN1Null) DERNull.INSTANCE);
            } else {
                ECCurve convertCurve2 = EC5Util.convertCurve(eCParameterSpec2.getCurve());
                x962Parameters = new X962Parameters(new X9ECParameters(convertCurve2, EC5Util.convertPoint(convertCurve2, this.ecSpec.getGenerator(), this.withCompression), this.ecSpec.getOrder(), BigInteger.valueOf((long) this.ecSpec.getCofactor()), this.ecSpec.getCurve().getSeed()));
            }
            subjectPublicKeyInfo = new SubjectPublicKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters), ((ASN1OctetString) new X9ECPoint(engineGetQ().getCurve().createPoint(getQ().getAffineXCoord().toBigInteger(), getQ().getAffineYCoord().toBigInteger(), this.withCompression)).toASN1Primitive()).getOctets());
        }
        return KeyUtil.getEncodedSubjectPublicKeyInfo(subjectPublicKeyInfo);
    }

    public String getFormat() {
        return "X.509";
    }

    public org.bouncycastle.jce.spec.ECParameterSpec getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec, this.withCompression);
    }

    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    public ECPoint getQ() {
        return this.ecSpec == null ? this.f6135q.getDetachedPoint() : this.f6135q;
    }

    public java.security.spec.ECPoint getW() {
        return new java.security.spec.ECPoint(this.f6135q.getAffineXCoord().toBigInteger(), this.f6135q.getAffineYCoord().toBigInteger());
    }

    public int hashCode() {
        return engineGetQ().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append("EC Public Key");
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            X: ");
        stringBuffer.append(this.f6135q.getAffineXCoord().toBigInteger().toString(16));
        stringBuffer.append(lineSeparator);
        stringBuffer.append("            Y: ");
        stringBuffer.append(this.f6135q.getAffineYCoord().toBigInteger().toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }
}
