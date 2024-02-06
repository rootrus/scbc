package org.jmrtd.lds;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DLSet;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.cms.SignedData;

public class CardSecurityFile implements Serializable {
    private static final String CONTENT_TYPE_OID = "0.4.0.127.0.7.3.2.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -3535507558193769952L;
    private X509Certificate certificate;
    private String digestAlgorithm;
    private String digestEncryptionAlgorithm;
    private byte[] encryptedDigest;
    private Set<SecurityInfo> securityInfos;

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, PrivateKey privateKey, X509Certificate x509Certificate) {
        this(str, str2, collection, privateKey, x509Certificate, (String) null);
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, PrivateKey privateKey, X509Certificate x509Certificate, String str3) {
        this(str, str2, collection, (byte[]) null, x509Certificate);
        this.encryptedDigest = SignedDataUtil.signData(str, str2, CONTENT_TYPE_OID, toContentInfo(CONTENT_TYPE_OID, collection), privateKey, str3);
    }

    public CardSecurityFile(String str, String str2, Collection<SecurityInfo> collection, byte[] bArr, X509Certificate x509Certificate) {
        if (collection == null) {
            throw new IllegalArgumentException("Null securityInfos");
        } else if (x509Certificate != null) {
            this.digestAlgorithm = str;
            this.digestEncryptionAlgorithm = str2;
            this.securityInfos = new HashSet(collection);
            this.encryptedDigest = bArr;
            this.certificate = x509Certificate;
        } else {
            throw new IllegalArgumentException("Null certificate");
        }
    }

    public CardSecurityFile(InputStream inputStream) throws IOException {
        readContent(inputStream);
    }

    public String getDigestAlgorithm() {
        return this.digestAlgorithm;
    }

    public String getDigestEncryptionAlgorithm() {
        return this.digestEncryptionAlgorithm;
    }

    public byte[] getEncryptedDigest() {
        return this.encryptedDigest;
    }

    /* access modifiers changed from: protected */
    public void readContent(InputStream inputStream) throws IOException {
        SignedData readSignedData = SignedDataUtil.readSignedData(inputStream);
        this.digestAlgorithm = SignedDataUtil.getSignerInfoDigestAlgorithm(readSignedData);
        this.digestEncryptionAlgorithm = SignedDataUtil.getDigestEncryptionAlgorithm(readSignedData);
        try {
            this.certificate = SignedDataUtil.getDocSigningCertificate(readSignedData);
        } catch (CertificateException e) {
            LOGGER.log(Level.SEVERE, "Exceptiong while extracting document signing certificate", e);
        }
        this.securityInfos = getSecurityInfos(readSignedData);
        this.encryptedDigest = SignedDataUtil.getEncryptedDigest(readSignedData);
    }

    /* access modifiers changed from: protected */
    public void writeContent(OutputStream outputStream) throws IOException {
        try {
            SignedDataUtil.writeData(SignedDataUtil.createSignedData(this.digestAlgorithm, this.digestEncryptionAlgorithm, CONTENT_TYPE_OID, toContentInfo(CONTENT_TYPE_OID, this.securityInfos), this.encryptedDigest, this.certificate), outputStream);
        } catch (CertificateException e) {
            LOGGER.log(Level.SEVERE, "Certificate exception during SignedData creation", e);
            throw new IOException(e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            LOGGER.log(Level.SEVERE, "Unsupported algorithm", e2);
            throw new IOException(e2.getMessage());
        }
    }

    public byte[] getEncoded() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeContent(byteArrayOutputStream);
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            return null;
        }
    }

    public Collection<SecurityInfo> getSecurityInfos() {
        return this.securityInfos;
    }

    public Collection<PACEInfo> getPACEInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo next : this.securityInfos) {
            if (next instanceof PACEInfo) {
                arrayList.add((PACEInfo) next);
            }
        }
        return arrayList;
    }

    public Collection<ChipAuthenticationInfo> getChipAuthenticationInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo next : this.securityInfos) {
            if (next instanceof ChipAuthenticationInfo) {
                arrayList.add((ChipAuthenticationInfo) next);
            }
        }
        return arrayList;
    }

    public Collection<ChipAuthenticationPublicKeyInfo> getChipAuthenticationPublicKeyInfos() {
        ArrayList arrayList = new ArrayList(this.securityInfos.size());
        for (SecurityInfo next : this.securityInfos) {
            if (next instanceof ChipAuthenticationPublicKeyInfo) {
                arrayList.add((ChipAuthenticationPublicKeyInfo) next);
            }
        }
        return arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CardSecurityFile [");
        sb.append(this.securityInfos.toString());
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        CardSecurityFile cardSecurityFile = (CardSecurityFile) obj;
        Set<SecurityInfo> set = this.securityInfos;
        if (set != null) {
            Set<SecurityInfo> set2 = cardSecurityFile.securityInfos;
            if (set2 != null) {
                return set.equals(set2);
            }
            if (set == null) {
                return true;
            }
            return false;
        } else if (cardSecurityFile.securityInfos == null) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (this.securityInfos.hashCode() * 3) + 63;
    }

    private static ContentInfo toContentInfo(String str, Collection<SecurityInfo> collection) {
        try {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            for (SecurityInfo dERObject : collection) {
                aSN1EncodableVector.add(dERObject.getDERObject());
            }
            return new ContentInfo(new ASN1ObjectIdentifier(str), new DEROctetString((ASN1Encodable) new DLSet(aSN1EncodableVector)));
        } catch (IOException e) {
            Logger logger = LOGGER;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating signedData: ");
            sb.append(e.getMessage());
            logger.log(level, sb.toString());
            throw new IllegalArgumentException("Error DER encoding the security infos");
        }
    }

    private static Set<SecurityInfo> getSecurityInfos(SignedData signedData) throws IOException {
        ASN1Primitive content = SignedDataUtil.getContent(signedData);
        if (content instanceof ASN1Set) {
            ASN1Set aSN1Set = (ASN1Set) content;
            HashSet hashSet = new HashSet();
            for (int i = 0; i < aSN1Set.size(); i++) {
                try {
                    SecurityInfo instance = SecurityInfo.getInstance(aSN1Set.getObjectAt(i).toASN1Primitive());
                    if (instance == null) {
                        LOGGER.log(Level.WARNING, "Could not parse, skipping security info");
                    } else {
                        hashSet.add(instance);
                    }
                } catch (Exception e) {
                    LOGGER.log(Level.WARNING, "Exception while parsing, skipping security info", e);
                }
            }
            return hashSet;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Was expecting an ASN1Set, found ");
        sb.append(content.getClass());
        throw new IOException(sb.toString());
    }
}
