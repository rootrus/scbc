package org.bouncycastle.jcajce.provider.asymmetric.p097ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.p061x9.X962Parameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.interfaces.ECPointEncoder;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.Strings;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey */
public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, PKCS12BagAttributeCarrier, ECPointEncoder {
    static final long serialVersionUID = 994553197664784084L;
    private String algorithm = "EC";
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient ProviderConfiguration configuration;

    /* renamed from: d */
    private transient BigInteger f6114d;
    private transient ECParameterSpec ecSpec;
    private transient DERBitString publicKey;
    private boolean withCompression;

    protected BCECPrivateKey() {
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.f6114d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
        this.configuration = providerConfiguration;
    }

    BCECPrivateKey(String str, PrivateKeyInfo privateKeyInfo, ProviderConfiguration providerConfiguration) throws IOException {
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPrivKeyInfo(privateKeyInfo);
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.algorithm = str;
        this.f6114d = eCPrivateKeyParameters.getD();
        this.configuration = providerConfiguration;
        if (eCParameterSpec == null) {
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), new ECPoint(parameters.getG().getAffineXCoord().toBigInteger(), parameters.getG().getAffineYCoord().toBigInteger()), parameters.getN(), parameters.getH().intValue());
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.publicKey = getPublicKeyDetails(bCECPublicKey);
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, BCECPublicKey bCECPublicKey, org.bouncycastle.jce.spec.ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        ECDomainParameters parameters = eCPrivateKeyParameters.getParameters();
        this.algorithm = str;
        this.f6114d = eCPrivateKeyParameters.getD();
        this.configuration = providerConfiguration;
        this.ecSpec = eCParameterSpec == null ? new ECParameterSpec(EC5Util.convertCurve(parameters.getCurve(), parameters.getSeed()), new ECPoint(parameters.getG().getAffineXCoord().toBigInteger(), parameters.getG().getAffineYCoord().toBigInteger()), parameters.getN(), parameters.getH().intValue()) : EC5Util.convertSpec(EC5Util.convertCurve(eCParameterSpec.getCurve(), eCParameterSpec.getSeed()), eCParameterSpec);
        this.publicKey = getPublicKeyDetails(bCECPublicKey);
    }

    public BCECPrivateKey(String str, ECPrivateKeyParameters eCPrivateKeyParameters, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.f6114d = eCPrivateKeyParameters.getD();
        this.ecSpec = null;
        this.configuration = providerConfiguration;
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = str;
        this.f6114d = bCECPrivateKey.f6114d;
        this.ecSpec = bCECPrivateKey.ecSpec;
        this.withCompression = bCECPrivateKey.withCompression;
        this.attrCarrier = bCECPrivateKey.attrCarrier;
        this.publicKey = bCECPrivateKey.publicKey;
        this.configuration = bCECPrivateKey.configuration;
    }

    public BCECPrivateKey(String str, org.bouncycastle.jce.spec.ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.f6114d = eCPrivateKeySpec.getD();
        this.ecSpec = eCPrivateKeySpec.getParams() != null ? EC5Util.convertSpec(EC5Util.convertCurve(eCPrivateKeySpec.getParams().getCurve(), eCPrivateKeySpec.getParams().getSeed()), eCPrivateKeySpec.getParams()) : null;
        this.configuration = providerConfiguration;
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, ProviderConfiguration providerConfiguration) {
        this.f6114d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
        this.configuration = providerConfiguration;
    }

    private DERBitString getPublicKeyDetails(BCECPublicKey bCECPublicKey) {
        try {
            return SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bCECPublicKey.getEncoded())).getPublicKeyData();
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(PrivateKeyInfo privateKeyInfo) throws IOException {
        X962Parameters instance = X962Parameters.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        this.ecSpec = EC5Util.convertToSpec(instance, EC5Util.getCurve(this.configuration, instance));
        ASN1Encodable parsePrivateKey = privateKeyInfo.parsePrivateKey();
        if (parsePrivateKey instanceof ASN1Integer) {
            this.f6114d = ASN1Integer.getInstance(parsePrivateKey).getValue();
            return;
        }
        org.bouncycastle.asn1.sec.ECPrivateKey instance2 = org.bouncycastle.asn1.sec.ECPrivateKey.getInstance(parsePrivateKey);
        this.f6114d = instance2.getKey();
        this.publicKey = instance2.getPublicKey();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        populateFromPrivKeyInfo(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray((byte[]) objectInputStream.readObject())));
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    /* access modifiers changed from: package-private */
    public org.bouncycastle.jce.spec.ECParameterSpec engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec, this.withCompression) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return getD().equals(bCECPrivateKey.getD()) && engineGetSpec().equals(bCECPrivateKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public ASN1Encodable getBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return this.attrCarrier.getBagAttribute(aSN1ObjectIdentifier);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public BigInteger getD() {
        return this.f6114d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getEncoded() {
        /*
            r10 = this;
            java.security.spec.ECParameterSpec r0 = r10.ecSpec
            boolean r1 = r0 instanceof org.bouncycastle.jce.spec.ECNamedCurveSpec
            r2 = 0
            if (r1 == 0) goto L_0x0026
            org.bouncycastle.jce.spec.ECNamedCurveSpec r0 = (org.bouncycastle.jce.spec.ECNamedCurveSpec) r0
            java.lang.String r0 = r0.getName()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getNamedCurveOid((java.lang.String) r0)
            if (r0 != 0) goto L_0x0020
            org.bouncycastle.asn1.ASN1ObjectIdentifier r0 = new org.bouncycastle.asn1.ASN1ObjectIdentifier
            java.security.spec.ECParameterSpec r1 = r10.ecSpec
            org.bouncycastle.jce.spec.ECNamedCurveSpec r1 = (org.bouncycastle.jce.spec.ECNamedCurveSpec) r1
            java.lang.String r1 = r1.getName()
            r0.<init>((java.lang.String) r1)
        L_0x0020:
            org.bouncycastle.asn1.x9.X962Parameters r1 = new org.bouncycastle.asn1.x9.X962Parameters
            r1.<init>((org.bouncycastle.asn1.ASN1ObjectIdentifier) r0)
            goto L_0x0072
        L_0x0026:
            if (r0 != 0) goto L_0x0038
            org.bouncycastle.asn1.x9.X962Parameters r0 = new org.bouncycastle.asn1.x9.X962Parameters
            org.bouncycastle.asn1.DERNull r1 = org.bouncycastle.asn1.DERNull.INSTANCE
            r0.<init>((org.bouncycastle.asn1.ASN1Null) r1)
            java.math.BigInteger r1 = r10.getS()
            int r1 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r2, r1)
            goto L_0x0083
        L_0x0038:
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            org.bouncycastle.math.ec.ECCurve r4 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertCurve(r0)
            org.bouncycastle.asn1.x9.X962Parameters r1 = new org.bouncycastle.asn1.x9.X962Parameters
            org.bouncycastle.asn1.x9.X9ECParameters r0 = new org.bouncycastle.asn1.x9.X9ECParameters
            java.security.spec.ECParameterSpec r3 = r10.ecSpec
            java.security.spec.ECPoint r3 = r3.getGenerator()
            boolean r5 = r10.withCompression
            org.bouncycastle.math.ec.ECPoint r5 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertPoint((org.bouncycastle.math.p099ec.ECCurve) r4, (java.security.spec.ECPoint) r3, (boolean) r5)
            java.security.spec.ECParameterSpec r3 = r10.ecSpec
            java.math.BigInteger r6 = r3.getOrder()
            java.security.spec.ECParameterSpec r3 = r10.ecSpec
            int r3 = r3.getCofactor()
            long r7 = (long) r3
            java.math.BigInteger r7 = java.math.BigInteger.valueOf(r7)
            java.security.spec.ECParameterSpec r3 = r10.ecSpec
            java.security.spec.EllipticCurve r3 = r3.getCurve()
            byte[] r8 = r3.getSeed()
            r3 = r0
            r3.<init>((org.bouncycastle.math.p099ec.ECCurve) r4, (org.bouncycastle.math.p099ec.ECPoint) r5, (java.math.BigInteger) r6, (java.math.BigInteger) r7, (byte[]) r8)
            r1.<init>((org.bouncycastle.asn1.p061x9.X9ECParameters) r0)
        L_0x0072:
            java.security.spec.ECParameterSpec r0 = r10.ecSpec
            java.math.BigInteger r0 = r0.getOrder()
            java.math.BigInteger r3 = r10.getS()
            int r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getOrderBitLength(r0, r3)
            r9 = r1
            r1 = r0
            r0 = r9
        L_0x0083:
            org.bouncycastle.asn1.DERBitString r3 = r10.publicKey
            if (r3 == 0) goto L_0x0093
            org.bouncycastle.asn1.sec.ECPrivateKey r3 = new org.bouncycastle.asn1.sec.ECPrivateKey
            java.math.BigInteger r4 = r10.getS()
            org.bouncycastle.asn1.DERBitString r5 = r10.publicKey
            r3.<init>(r1, r4, r5, r0)
            goto L_0x009c
        L_0x0093:
            org.bouncycastle.asn1.sec.ECPrivateKey r3 = new org.bouncycastle.asn1.sec.ECPrivateKey
            java.math.BigInteger r4 = r10.getS()
            r3.<init>((int) r1, (java.math.BigInteger) r4, (org.bouncycastle.asn1.ASN1Encodable) r0)
        L_0x009c:
            org.bouncycastle.asn1.pkcs.PrivateKeyInfo r1 = new org.bouncycastle.asn1.pkcs.PrivateKeyInfo     // Catch:{ IOException -> 0x00af }
            org.bouncycastle.asn1.x509.AlgorithmIdentifier r4 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier     // Catch:{ IOException -> 0x00af }
            org.bouncycastle.asn1.ASN1ObjectIdentifier r5 = org.bouncycastle.asn1.p061x9.X9ObjectIdentifiers.id_ecPublicKey     // Catch:{ IOException -> 0x00af }
            r4.<init>(r5, r0)     // Catch:{ IOException -> 0x00af }
            r1.<init>(r4, r3)     // Catch:{ IOException -> 0x00af }
            java.lang.String r0 = "DER"
            byte[] r0 = r1.getEncoded(r0)     // Catch:{ IOException -> 0x00af }
            return r0
        L_0x00af:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.p097ec.BCECPrivateKey.getEncoded():byte[]");
    }

    public String getFormat() {
        return "PKCS#8";
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

    public BigInteger getS() {
        return this.f6114d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setBagAttribute(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        this.attrCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Encodable);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String lineSeparator = Strings.lineSeparator();
        stringBuffer.append("EC Private Key");
        stringBuffer.append(lineSeparator);
        stringBuffer.append("             S: ");
        stringBuffer.append(this.f6114d.toString(16));
        stringBuffer.append(lineSeparator);
        return stringBuffer.toString();
    }
}
