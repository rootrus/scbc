package org.jmrtd.lds;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.cms.SignerIdentifier;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSASSAPSSparams;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.jce.provider.X509CertificateObject;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.jmrtd.JMRTDSecurityProvider;

class SignedDataUtil {
    private static final Provider BC_PROVIDER = JMRTDSecurityProvider.getBouncyCastleProvider();
    public static final String IEEE_P1363_SHA1_OID = "1.3.14.3.2.26";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final String PKCS1_MD2_WITH_RSA_OID = "1.2.840.113549.1.1.2";
    public static final String PKCS1_MD4_WITH_RSA_OID = "1.2.840.113549.1.1.3";
    public static final String PKCS1_MD5_WITH_RSA_OID = "1.2.840.113549.1.1.4";
    public static final String PKCS1_MGF1 = "1.2.840.113549.1.1.8";
    public static final String PKCS1_RSASSA_PSS_OID = "1.2.840.113549.1.1.10";
    public static final String PKCS1_RSA_OID = "1.2.840.113549.1.1.1";
    public static final String PKCS1_SHA1_WITH_RSA_OID = "1.2.840.113549.1.1.5";
    public static final String PKCS1_SHA224_WITH_RSA_OID = "1.2.840.113549.1.1.14";
    public static final String PKCS1_SHA256_WITH_RSA_OID = "1.2.840.113549.1.1.11";
    public static final String PKCS1_SHA384_WITH_RSA_OID = "1.2.840.113549.1.1.12";
    public static final String PKCS1_SHA512_WITH_RSA_OID = "1.2.840.113549.1.1.13";
    public static final String RFC_3369_CONTENT_TYPE_OID = "1.2.840.113549.1.9.3";
    public static final String RFC_3369_MESSAGE_DIGEST_OID = "1.2.840.113549.1.9.4";
    public static final String RFC_3369_SIGNED_DATA_OID = "1.2.840.113549.1.7.2";
    public static final String X9_SHA1_WITH_ECDSA_OID = "1.2.840.10045.4.1";
    public static final String X9_SHA224_WITH_ECDSA_OID = "1.2.840.10045.4.3.1";
    public static final String X9_SHA256_WITH_ECDSA_OID = "1.2.840.10045.4.3.2";
    public static final String X9_SHA384_WITH_ECDSA_OID = "1.2.840.10045.4.3.3";
    public static final String X9_SHA512_WITH_ECDSA_OID = "1.2.840.10045.4.3.4";

    private SignedDataUtil() {
    }

    public static SignedData readSignedData(InputStream inputStream) throws IOException {
        ASN1Sequence aSN1Sequence = (ASN1Sequence) new ASN1InputStream(inputStream).readObject();
        if (aSN1Sequence.size() == 2) {
            String id = ((ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0)).getId();
            if (RFC_3369_SIGNED_DATA_OID.equals(id)) {
                ASN1Primitive objectFromTaggedObject = getObjectFromTaggedObject(aSN1Sequence.getObjectAt(1));
                if (objectFromTaggedObject instanceof ASN1Sequence) {
                    return SignedData.getInstance(objectFromTaggedObject);
                }
                throw new IOException("Was expecting an ASN.1 sequence as content");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Was expecting signed-data content type OID (1.2.840.113549.1.7.2), found ");
            sb.append(id);
            throw new IOException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Was expecting a DER sequence of length 2, found a DER sequence of length ");
        sb2.append(aSN1Sequence.size());
        throw new IOException(sb2.toString());
    }

    public static void writeData(SignedData signedData, OutputStream outputStream) throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(RFC_3369_SIGNED_DATA_OID));
        aSN1EncodableVector.add(new DERTaggedObject(0, signedData));
        outputStream.write(new DLSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[SYNTHETIC, Splitter:B:17:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[SYNTHETIC, Splitter:B:25:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.bouncycastle.asn1.ASN1Primitive getContent(org.bouncycastle.asn1.cms.SignedData r6) {
        /*
            java.lang.String r0 = "Exception closing input stream"
            org.bouncycastle.asn1.cms.ContentInfo r6 = r6.getEncapContentInfo()
            org.bouncycastle.asn1.ASN1ObjectIdentifier r1 = r6.getContentType()
            r1.getId()
            org.bouncycastle.asn1.ASN1Encodable r6 = r6.getContent()
            org.bouncycastle.asn1.DEROctetString r6 = (org.bouncycastle.asn1.DEROctetString) r6
            r1 = 0
            org.bouncycastle.asn1.ASN1InputStream r2 = new org.bouncycastle.asn1.ASN1InputStream     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            byte[] r6 = r6.getOctets()     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            r2.<init>((java.io.InputStream) r3)     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            org.bouncycastle.asn1.ASN1Primitive r6 = r2.readObject()     // Catch:{ IOException -> 0x0032 }
            r2.close()     // Catch:{ IOException -> 0x002a }
            goto L_0x0031
        L_0x002a:
            java.util.logging.Logger r1 = LOGGER
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r1.log(r2, r0)
        L_0x0031:
            return r6
        L_0x0032:
            r6 = move-exception
            goto L_0x0038
        L_0x0034:
            r6 = move-exception
            goto L_0x0051
        L_0x0036:
            r6 = move-exception
            r2 = r1
        L_0x0038:
            java.util.logging.Logger r3 = LOGGER     // Catch:{ all -> 0x004f }
            java.util.logging.Level r4 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x004f }
            java.lang.String r5 = "Unexpected exception"
            r3.log(r4, r5, r6)     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004e
        L_0x0047:
            java.util.logging.Logger r6 = LOGGER
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r6.log(r2, r0)
        L_0x004e:
            return r1
        L_0x004f:
            r6 = move-exception
            r1 = r2
        L_0x0051:
            if (r1 == 0) goto L_0x005e
            r1.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x005e
        L_0x0057:
            java.util.logging.Logger r1 = LOGGER
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            r1.log(r2, r0)
        L_0x005e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jmrtd.lds.SignedDataUtil.getContent(org.bouncycastle.asn1.cms.SignedData):org.bouncycastle.asn1.ASN1Primitive");
    }

    public static ASN1Primitive getObjectFromTaggedObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                return aSN1TaggedObject.getObject();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Was expecting tag 0, found ");
            sb.append(Integer.toHexString(tagNo));
            throw new IOException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Was expecting an ASN1TaggedObject, found ");
        sb2.append(aSN1Encodable.getClass().getCanonicalName());
        throw new IOException(sb2.toString());
    }

    public static String getSignerInfoDigestAlgorithm(SignedData signedData) {
        try {
            return lookupMnemonicByOID(getSignerInfo(signedData).getDigestAlgorithm().getAlgorithm().getId());
        } catch (NoSuchAlgorithmException e) {
            Logger logger = LOGGER;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("No such algorithm");
            sb.append(e);
            logger.log(level, sb.toString());
            return null;
        }
    }

    public static AlgorithmParameterSpec getDigestEncryptionAlgorithmParams(SignedData signedData) {
        try {
            AlgorithmIdentifier digestEncryptionAlgorithm = getSignerInfo(signedData).getDigestEncryptionAlgorithm();
            ASN1Encodable parameters = digestEncryptionAlgorithm.getParameters();
            if (PKCS1_RSASSA_PSS_OID.equals(digestEncryptionAlgorithm.getAlgorithm().getId())) {
                return toAlgorithmParameterSpec(RSASSAPSSparams.getInstance(parameters));
            }
            return null;
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Exception", e);
            return null;
        }
    }

    public static String getDigestEncryptionAlgorithm(SignedData signedData) {
        try {
            String id = getSignerInfo(signedData).getDigestEncryptionAlgorithm().getAlgorithm().getId();
            if (id != null) {
                return lookupMnemonicByOID(id);
            }
            LOGGER.warning("Could not determine digest encryption algorithm OID");
            return null;
        } catch (NoSuchAlgorithmException e) {
            LOGGER.log(Level.WARNING, "No such algorithm", e);
            return null;
        }
    }

    public static byte[] getEContent(SignedData signedData) {
        SignerInfo signerInfo = getSignerInfo(signedData);
        ASN1Set authenticatedAttributes = signerInfo.getAuthenticatedAttributes();
        byte[] octets = ((DEROctetString) signedData.getEncapContentInfo().getContent()).getOctets();
        if (authenticatedAttributes.size() == 0) {
            return octets;
        }
        String id = signerInfo.getDigestAlgorithm().getAlgorithm().getId();
        byte[] bArr = null;
        try {
            bArr = authenticatedAttributes.getEncoded(ASN1Encoding.DER);
            checkEContent(getAttributes(authenticatedAttributes), id, octets);
            return bArr;
        } catch (NoSuchAlgorithmException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Error checking signedAttributes in eContent! No such algorithm: \"");
            sb.append(id);
            sb.append("\": ");
            sb.append(e.getMessage());
            logger.warning(sb.toString());
            return bArr;
        } catch (IOException e2) {
            Logger logger2 = LOGGER;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error getting signedAttributes: ");
            sb2.append(e2.getMessage());
            logger2.severe(sb2.toString());
            return bArr;
        }
    }

    public static byte[] getEncryptedDigest(SignedData signedData) {
        return getSignerInfo(signedData).getEncryptedDigest().getOctets();
    }

    public static IssuerAndSerialNumber getIssuerAndSerialNumber(SignedData signedData) {
        IssuerAndSerialNumber instance = IssuerAndSerialNumber.getInstance(getSignerInfo(signedData).getSID().getId());
        return new IssuerAndSerialNumber(instance.getName(), instance.getSerialNumber().getValue());
    }

    public static X509Certificate getDocSigningCertificate(SignedData signedData) throws CertificateException {
        ASN1Set certificates = signedData.getCertificates();
        byte[] bArr = null;
        if (certificates == null || certificates.size() <= 0) {
            return null;
        }
        if (certificates.size() != 1) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Found ");
            sb.append(certificates.size());
            sb.append(" certificates");
            logger.warning(sb.toString());
        }
        X509CertificateObject x509CertificateObject = null;
        for (int i = 0; i < certificates.size(); i++) {
            x509CertificateObject = new X509CertificateObject(Certificate.getInstance((ASN1Sequence) certificates.getObjectAt(i)));
            bArr = x509CertificateObject.getEncoded();
        }
        try {
            return (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr));
        } catch (Exception unused) {
            return x509CertificateObject;
        }
    }

    public static SignedData createSignedData(String str, String str2, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) throws NoSuchAlgorithmException, CertificateException, IOException {
        return new SignedData(createSingletonSet(createDigestAlgorithms(str)), contentInfo, createSingletonSet(createCertificate(x509Certificate)), (ASN1Set) null, createSingletonSet(createSignerInfo(str, str2, str3, contentInfo, bArr, x509Certificate).toASN1Object()));
    }

    public static SignerInfo createSignerInfo(String str, String str2, String str3, ContentInfo contentInfo, byte[] bArr, X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        return new SignerInfo(new SignerIdentifier(new IssuerAndSerialNumber(new X500Name(x509Certificate.getIssuerX500Principal().getName("RFC2253")), x509Certificate.getSerialNumber())), new AlgorithmIdentifier(new ASN1ObjectIdentifier(lookupOIDByMnemonic(str))), createAuthenticatedAttributes(str, str3, contentInfo), new AlgorithmIdentifier(new ASN1ObjectIdentifier(lookupOIDByMnemonic(str2))), (ASN1OctetString) new DEROctetString(bArr), (ASN1Set) null);
    }

    public static ASN1Set createAuthenticatedAttributes(String str, String str2, ContentInfo contentInfo) throws NoSuchAlgorithmException {
        if ("SHA256".equals(str)) {
            str = McElieceCCA2KeyGenParameterSpec.SHA256;
        }
        DEROctetString dEROctetString = new DEROctetString(MessageDigest.getInstance(str).digest(((DEROctetString) contentInfo.getContent()).getOctets()));
        return new DLSet((ASN1Encodable[]) new ASN1Object[]{new Attribute(new ASN1ObjectIdentifier(RFC_3369_CONTENT_TYPE_OID), createSingletonSet(new ASN1ObjectIdentifier(str2))).toASN1Primitive(), new Attribute(new ASN1ObjectIdentifier(RFC_3369_MESSAGE_DIGEST_OID), createSingletonSet(dEROctetString)).toASN1Primitive()});
    }

    public static ASN1Sequence createDigestAlgorithms(String str) throws NoSuchAlgorithmException {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(lookupOIDByMnemonic(str));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(aSN1ObjectIdentifier);
        return new DLSequence(aSN1EncodableVector);
    }

    public static ASN1Sequence createCertificate(X509Certificate x509Certificate) throws CertificateException {
        ASN1InputStream aSN1InputStream;
        try {
            aSN1InputStream = new ASN1InputStream(x509Certificate.getEncoded());
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1InputStream.readObject();
            aSN1InputStream.close();
            return aSN1Sequence;
        } catch (IOException unused) {
            throw new CertificateException("Could not construct certificate byte stream");
        } catch (Throwable th) {
            aSN1InputStream.close();
            throw th;
        }
    }

    public static byte[] signData(String str, String str2, String str3, ContentInfo contentInfo, PrivateKey privateKey, String str4) {
        Signature signature;
        try {
            byte[] encoded = createAuthenticatedAttributes(str, str3, contentInfo).getEncoded(ASN1Encoding.DER);
            if (str4 != null) {
                signature = Signature.getInstance(str2, str4);
            } else {
                signature = Signature.getInstance(str2);
            }
            signature.initSign(privateKey);
            signature.update(encoded);
            return signature.sign();
        } catch (Exception e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Exception: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            return null;
        }
    }

    public static String lookupMnemonicByOID(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            return null;
        }
        if (str.equals(X509ObjectIdentifiers.organization.getId())) {
            return "O";
        }
        if (str.equals(X509ObjectIdentifiers.organizationalUnitName.getId())) {
            return "OU";
        }
        if (str.equals(X509ObjectIdentifiers.commonName.getId())) {
            return "CN";
        }
        if (str.equals(X509ObjectIdentifiers.countryName.getId())) {
            return "C";
        }
        if (str.equals(X509ObjectIdentifiers.stateOrProvinceName.getId())) {
            return "ST";
        }
        if (str.equals(X509ObjectIdentifiers.localityName.getId())) {
            return "L";
        }
        if (str.equals(X509ObjectIdentifiers.id_SHA1.getId())) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (str.equals(NISTObjectIdentifiers.id_sha224.getId())) {
            return McElieceCCA2KeyGenParameterSpec.SHA224;
        }
        if (str.equals(NISTObjectIdentifiers.id_sha256.getId())) {
            return McElieceCCA2KeyGenParameterSpec.SHA256;
        }
        if (str.equals(NISTObjectIdentifiers.id_sha384.getId())) {
            return McElieceCCA2KeyGenParameterSpec.SHA384;
        }
        if (str.equals(NISTObjectIdentifiers.id_sha512.getId())) {
            return McElieceCCA2KeyGenParameterSpec.SHA512;
        }
        if (str.equals(X9_SHA1_WITH_ECDSA_OID)) {
            return "SHA1withECDSA";
        }
        if (str.equals(X9_SHA224_WITH_ECDSA_OID)) {
            return "SHA224withECDSA";
        }
        if (str.equals(X9_SHA256_WITH_ECDSA_OID)) {
            return "SHA256withECDSA";
        }
        if (str.equals(X9_SHA384_WITH_ECDSA_OID)) {
            return "SHA384withECDSA";
        }
        if (str.equals(X9_SHA512_WITH_ECDSA_OID)) {
            return "SHA512withECDSA";
        }
        if (str.equals(PKCS1_RSA_OID)) {
            return "RSA";
        }
        if (str.equals(PKCS1_MD2_WITH_RSA_OID)) {
            return "MD2withRSA";
        }
        if (str.equals(PKCS1_MD4_WITH_RSA_OID)) {
            return "MD4withRSA";
        }
        if (str.equals(PKCS1_MD5_WITH_RSA_OID)) {
            return "MD5withRSA";
        }
        if (str.equals(PKCS1_SHA1_WITH_RSA_OID)) {
            return "SHA1withRSA";
        }
        if (str.equals(PKCS1_SHA256_WITH_RSA_OID)) {
            return "SHA256withRSA";
        }
        if (str.equals(PKCS1_SHA384_WITH_RSA_OID)) {
            return "SHA384withRSA";
        }
        if (str.equals(PKCS1_SHA512_WITH_RSA_OID)) {
            return "SHA512withRSA";
        }
        if (str.equals(PKCS1_SHA224_WITH_RSA_OID)) {
            return "SHA224withRSA";
        }
        if (str.equals(IEEE_P1363_SHA1_OID)) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (str.equals(PKCS1_RSASSA_PSS_OID)) {
            return "SSAwithRSA/PSS";
        }
        if (str.equals(PKCS1_MGF1)) {
            return "MGF1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown OID ");
        sb.append(str);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static String lookupOIDByMnemonic(String str) throws NoSuchAlgorithmException {
        if (str.equals("O")) {
            return X509ObjectIdentifiers.organization.getId();
        }
        if (str.equals("OU")) {
            return X509ObjectIdentifiers.organizationalUnitName.getId();
        }
        if (str.equals("CN")) {
            return X509ObjectIdentifiers.commonName.getId();
        }
        if (str.equals("C")) {
            return X509ObjectIdentifiers.countryName.getId();
        }
        if (str.equals("ST")) {
            return X509ObjectIdentifiers.stateOrProvinceName.getId();
        }
        if (str.equals("L")) {
            return X509ObjectIdentifiers.localityName.getId();
        }
        if (str.equalsIgnoreCase(McElieceCCA2KeyGenParameterSpec.SHA1) || str.equalsIgnoreCase("SHA1")) {
            return X509ObjectIdentifiers.id_SHA1.getId();
        }
        if (str.equalsIgnoreCase(McElieceCCA2KeyGenParameterSpec.SHA224) || str.equalsIgnoreCase("SHA224")) {
            return NISTObjectIdentifiers.id_sha224.getId();
        }
        if (str.equalsIgnoreCase(McElieceCCA2KeyGenParameterSpec.SHA256) || str.equalsIgnoreCase("SHA256")) {
            return NISTObjectIdentifiers.id_sha256.getId();
        }
        if (str.equalsIgnoreCase(McElieceCCA2KeyGenParameterSpec.SHA384) || str.equalsIgnoreCase("SHA384")) {
            return NISTObjectIdentifiers.id_sha384.getId();
        }
        if (str.equalsIgnoreCase(McElieceCCA2KeyGenParameterSpec.SHA512) || str.equalsIgnoreCase("SHA512")) {
            return NISTObjectIdentifiers.id_sha512.getId();
        }
        if (str.equalsIgnoreCase("RSA")) {
            return PKCS1_RSA_OID;
        }
        if (str.equalsIgnoreCase("MD2withRSA")) {
            return PKCS1_MD2_WITH_RSA_OID;
        }
        if (str.equalsIgnoreCase("MD4withRSA")) {
            return PKCS1_MD4_WITH_RSA_OID;
        }
        if (str.equalsIgnoreCase("MD5withRSA")) {
            return PKCS1_MD5_WITH_RSA_OID;
        }
        if (str.equalsIgnoreCase("SHA1withRSA")) {
            return PKCS1_SHA1_WITH_RSA_OID;
        }
        if (str.equalsIgnoreCase("SHA256withRSA")) {
            return PKCS1_SHA256_WITH_RSA_OID;
        }
        if (str.equalsIgnoreCase("SHA384withRSA")) {
            return PKCS1_SHA384_WITH_RSA_OID;
        }
        if (str.equalsIgnoreCase("SHA512withRSA")) {
            return PKCS1_SHA512_WITH_RSA_OID;
        }
        if (str.equalsIgnoreCase("SHA224withRSA")) {
            return PKCS1_SHA224_WITH_RSA_OID;
        }
        if (str.equalsIgnoreCase("SHA1withECDSA")) {
            return X9_SHA1_WITH_ECDSA_OID;
        }
        if (str.equalsIgnoreCase("SHA224withECDSA")) {
            return X9_SHA224_WITH_ECDSA_OID;
        }
        if (str.equalsIgnoreCase("SHA256withECDSA")) {
            return X9_SHA256_WITH_ECDSA_OID;
        }
        if (str.equalsIgnoreCase("SHA384withECDSA")) {
            return X9_SHA384_WITH_ECDSA_OID;
        }
        if (str.equalsIgnoreCase("SHA512withECDSA")) {
            return X9_SHA512_WITH_ECDSA_OID;
        }
        if (str.equalsIgnoreCase("SAwithRSA/PSS") || str.equalsIgnoreCase("SSAwithRSA/PSS") || str.equalsIgnoreCase("RSASSA-PSS")) {
            return PKCS1_RSASSA_PSS_OID;
        }
        if (str.equalsIgnoreCase("MGF1") || str.equalsIgnoreCase("SHA256withRSAandMGF1") || str.equalsIgnoreCase("SHA512withRSAandMGF1")) {
            return PKCS1_MGF1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown name ");
        sb.append(str);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    private static void checkEContent(Collection<Attribute> collection, String str, byte[] bArr) throws NoSuchAlgorithmException {
        for (Attribute next : collection) {
            if (RFC_3369_MESSAGE_DIGEST_OID.equals(next.getAttrType().getId())) {
                ASN1Set attrValues = next.getAttrValues();
                if (attrValues.size() != 1) {
                    LOGGER.warning("Expected only one attribute value in signedAttribute message digest in eContent!");
                }
                byte[] octets = ((DEROctetString) attrValues.getObjectAt(0)).getOctets();
                if (octets == null) {
                    LOGGER.warning("Error extracting signedAttribute message digest in eContent!");
                }
                if (!Arrays.equals(octets, MessageDigest.getInstance(str).digest(bArr))) {
                    LOGGER.warning("Error checking signedAttribute message digest in eContent!");
                }
            }
        }
    }

    private static List<Attribute> getAttributes(ASN1Set aSN1Set) {
        ArrayList<ASN1Sequence> list = Collections.list(aSN1Set.getObjects());
        ArrayList arrayList = new ArrayList(list.size());
        for (ASN1Sequence instance : list) {
            arrayList.add(Attribute.getInstance(instance));
        }
        return arrayList;
    }

    private static AlgorithmParameterSpec toAlgorithmParameterSpec(RSASSAPSSparams rSASSAPSSparams) throws NoSuchAlgorithmException {
        String id = rSASSAPSSparams.getHashAlgorithm().getAlgorithm().getId();
        AlgorithmIdentifier maskGenAlgorithm = rSASSAPSSparams.getMaskGenAlgorithm();
        String id2 = maskGenAlgorithm.getAlgorithm().getId();
        return new PSSParameterSpec(lookupMnemonicByOID(id), lookupMnemonicByOID(id2), toMaskGenAlgorithmParameterSpec(maskGenAlgorithm), rSASSAPSSparams.getSaltLength().intValue(), rSASSAPSSparams.getTrailerField().intValue());
    }

    private static AlgorithmParameterSpec toMaskGenAlgorithmParameterSpec(AlgorithmIdentifier algorithmIdentifier) {
        try {
            ASN1Encodable parameters = algorithmIdentifier.getParameters();
            if (parameters != null) {
                return new MGF1ParameterSpec(lookupMnemonicByOID(AlgorithmIdentifier.getInstance(parameters).getAlgorithm().getId()));
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Exception", e);
        }
        return new MGF1ParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    private static SignerInfo getSignerInfo(SignedData signedData) {
        ASN1Set signerInfos = signedData.getSignerInfos();
        if (signerInfos.size() > 1) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Found ");
            sb.append(signerInfos.size());
            sb.append(" signerInfos");
            logger.warning(sb.toString());
        }
        if (signerInfos.size() > 0) {
            return new SignerInfo((ASN1Sequence) signerInfos.getObjectAt(0));
        }
        return null;
    }

    private static ASN1Set createSingletonSet(ASN1Object aSN1Object) {
        return new DLSet(new ASN1Encodable[]{aSN1Object});
    }
}
