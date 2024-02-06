package org.jmrtd.lds;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;
import org.bouncycastle.asn1.icao.DataGroupHash;
import org.bouncycastle.asn1.icao.LDSSecurityObject;
import org.bouncycastle.asn1.icao.LDSVersionInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.jmrtd.JMRTDSecurityProvider;

public class SODFile extends AbstractTaggedLDSFile {
    private static final Provider BC_PROVIDER = JMRTDSecurityProvider.getBouncyCastleProvider();
    private static final String ICAO_LDS_SOD_ALT_OID = "1.3.27.1.1.1";
    private static final String ICAO_LDS_SOD_OID = "2.23.136.1.1.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final String SDU_LDS_SOD_OID = "1.2.528.1.1006.1.20.1";
    private static final long serialVersionUID = -1081347374739311111L;
    private SignedData signedData;

    public SODFile(String str, String str2, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate) throws NoSuchAlgorithmException, CertificateException {
        this(str, str2, map, privateKey, x509Certificate, (String) null);
    }

    public SODFile(String str, String str2, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate, String str3) throws NoSuchAlgorithmException, CertificateException {
        this(str, str2, map, privateKey, x509Certificate, str3, (String) null, (String) null);
    }

    public SODFile(String str, String str2, Map<Integer, byte[]> map, PrivateKey privateKey, X509Certificate x509Certificate, String str3, String str4, String str5) throws NoSuchAlgorithmException, CertificateException {
        super(119);
        try {
            ContentInfo contentInfo = toContentInfo(ICAO_LDS_SOD_OID, str, map, str4, str5);
            this.signedData = SignedDataUtil.createSignedData(str, str2, ICAO_LDS_SOD_OID, contentInfo, SignedDataUtil.signData(str, str2, ICAO_LDS_SOD_OID, contentInfo, privateKey, str3), x509Certificate);
        } catch (IOException e) {
            Logger logger = LOGGER;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating signedData: ");
            sb.append(e.getMessage());
            logger.log(level, sb.toString());
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public SODFile(String str, String str2, Map<Integer, byte[]> map, byte[] bArr, X509Certificate x509Certificate) throws NoSuchAlgorithmException, CertificateException {
        super(119);
        try {
            this.signedData = SignedDataUtil.createSignedData(str, str2, ICAO_LDS_SOD_OID, toContentInfo(ICAO_LDS_SOD_OID, str, map, (String) null, (String) null), bArr, x509Certificate);
        } catch (IOException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating signedData: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public SODFile(InputStream inputStream) throws IOException {
        super(119, inputStream);
    }

    /* access modifiers changed from: protected */
    public void readContent(InputStream inputStream) throws IOException {
        this.signedData = SignedDataUtil.readSignedData(inputStream);
    }

    /* access modifiers changed from: protected */
    public void writeContent(OutputStream outputStream) throws IOException {
        SignedDataUtil.writeData(this.signedData, outputStream);
    }

    public Map<Integer, byte[]> getDataGroupHashes() {
        DataGroupHash[] datagroupHash = getLDSSecurityObject(this.signedData).getDatagroupHash();
        TreeMap treeMap = new TreeMap();
        for (DataGroupHash dataGroupHash : datagroupHash) {
            treeMap.put(Integer.valueOf(dataGroupHash.getDataGroupNumber()), dataGroupHash.getDataGroupHashValue().getOctets());
        }
        return treeMap;
    }

    public byte[] getEncryptedDigest() {
        return SignedDataUtil.getEncryptedDigest(this.signedData);
    }

    public AlgorithmParameterSpec getDigestEncryptionAlgorithmParams() {
        return SignedDataUtil.getDigestEncryptionAlgorithmParams(this.signedData);
    }

    public byte[] getEContent() {
        return SignedDataUtil.getEContent(this.signedData);
    }

    public String getDigestAlgorithm() {
        return getDigestAlgorithm(getLDSSecurityObject(this.signedData));
    }

    private static String getDigestAlgorithm(LDSSecurityObject lDSSecurityObject) {
        try {
            return SignedDataUtil.lookupMnemonicByOID(lDSSecurityObject.getDigestAlgorithmIdentifier().getAlgorithm().getId());
        } catch (NoSuchAlgorithmException e) {
            LOGGER.log(Level.WARNING, "Exception", e);
            return null;
        }
    }

    public String getSignerInfoDigestAlgorithm() {
        return SignedDataUtil.getSignerInfoDigestAlgorithm(this.signedData);
    }

    public String getDigestEncryptionAlgorithm() {
        return SignedDataUtil.getDigestEncryptionAlgorithm(this.signedData);
    }

    public String getLDSVersion() {
        LDSVersionInfo versionInfo = getLDSSecurityObject(this.signedData).getVersionInfo();
        if (versionInfo == null) {
            return null;
        }
        return versionInfo.getLdsVersion();
    }

    public String getUnicodeVersion() {
        LDSVersionInfo versionInfo = getLDSSecurityObject(this.signedData).getVersionInfo();
        if (versionInfo == null) {
            return null;
        }
        return versionInfo.getUnicodeVersion();
    }

    public X509Certificate getDocSigningCertificate() throws CertificateException {
        return SignedDataUtil.getDocSigningCertificate(this.signedData);
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(SignedDataUtil.getIssuerAndSerialNumber(this.signedData).getName().getEncoded(ASN1Encoding.DER));
        } catch (IOException e) {
            Logger logger = LOGGER;
            StringBuilder sb = new StringBuilder();
            sb.append("Could not get issuer: ");
            sb.append(e.getMessage());
            logger.severe(sb.toString());
            return null;
        }
    }

    public BigInteger getSerialNumber() {
        return SignedDataUtil.getIssuerAndSerialNumber(this.signedData).getSerialNumber().getValue();
    }

    public String toString() {
        try {
            X509Certificate docSigningCertificate = getDocSigningCertificate();
            StringBuilder sb = new StringBuilder();
            sb.append("SODFile ");
            sb.append(docSigningCertificate.getIssuerX500Principal());
            return sb.toString();
        } catch (Exception unused) {
            return "SODFile";
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(getClass())) {
            return false;
        }
        return Arrays.equals(getEncoded(), ((SODFile) obj).getEncoded());
    }

    public int hashCode() {
        return (Arrays.hashCode(getEncoded()) * 11) + 111;
    }

    private static ContentInfo toContentInfo(String str, String str2, Map<Integer, byte[]> map, String str3, String str4) throws NoSuchAlgorithmException, IOException {
        LDSSecurityObject lDSSecurityObject;
        DataGroupHash[] dataGroupHashArr = new DataGroupHash[map.size()];
        int i = 0;
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            dataGroupHashArr[i] = new DataGroupHash(intValue2, new DEROctetString(map.get(Integer.valueOf(intValue2))));
            i++;
        }
        AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(new ASN1ObjectIdentifier(SignedDataUtil.lookupOIDByMnemonic(str2)));
        if (str3 == null) {
            lDSSecurityObject = new LDSSecurityObject(algorithmIdentifier, dataGroupHashArr);
        } else {
            lDSSecurityObject = new LDSSecurityObject(algorithmIdentifier, dataGroupHashArr, new LDSVersionInfo(str3, str4));
        }
        return new ContentInfo(new ASN1ObjectIdentifier(str), new DEROctetString((ASN1Encodable) lDSSecurityObject));
    }

    private static LDSSecurityObject getLDSSecurityObject(SignedData signedData2) {
        try {
            ContentInfo encapContentInfo = signedData2.getEncapContentInfo();
            String id = encapContentInfo.getContentType().getId();
            DEROctetString dEROctetString = (DEROctetString) encapContentInfo.getContent();
            if (!ICAO_LDS_SOD_OID.equals(id) && !SDU_LDS_SOD_OID.equals(id) && !ICAO_LDS_SOD_ALT_OID.equals(id)) {
                Logger logger = LOGGER;
                StringBuilder sb = new StringBuilder();
                sb.append("SignedData does not appear to contain an LDS SOd. (content type is ");
                sb.append(id);
                sb.append(", was expecting ");
                sb.append(ICAO_LDS_SOD_OID);
                sb.append(")");
                logger.warning(sb.toString());
            }
            ASN1InputStream aSN1InputStream = new ASN1InputStream((InputStream) new ByteArrayInputStream(dEROctetString.getOctets()));
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject instanceof ASN1Sequence) {
                LDSSecurityObject instance = LDSSecurityObject.getInstance(readObject);
                if (aSN1InputStream.readObject() != null) {
                    LOGGER.warning("Ignoring extra object found after LDSSecurityObject...");
                }
                return instance;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected ASN1Sequence, found ");
            sb2.append(readObject.getClass().getSimpleName());
            throw new IllegalStateException(sb2.toString());
        } catch (IOException unused) {
            throw new IllegalStateException("Could not read security object in signedData");
        }
    }
}
