package org.jmrtd.lds;

import java.math.BigInteger;
import java.security.Provider;
import java.security.PublicKey;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.jmrtd.JMRTDSecurityProvider;
import org.jmrtd.Util;

public class ChipAuthenticationPublicKeyInfo extends SecurityInfo {
    private static final Provider BC_PROVIDER = JMRTDSecurityProvider.getBouncyCastleProvider();
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = 5687291829854501771L;
    private BigInteger keyId;
    private String oid;
    private SubjectPublicKeyInfo subjectPublicKeyInfo;

    ChipAuthenticationPublicKeyInfo(String str, SubjectPublicKeyInfo subjectPublicKeyInfo2) {
        this(str, subjectPublicKeyInfo2, (BigInteger) null);
    }

    public ChipAuthenticationPublicKeyInfo(PublicKey publicKey, BigInteger bigInteger) {
        this(Util.inferProtocolIdentifier(publicKey), Util.toSubjectPublicKeyInfo(Util.reconstructPublicKey(publicKey)), bigInteger);
    }

    public ChipAuthenticationPublicKeyInfo(PublicKey publicKey) {
        this(publicKey, (BigInteger) null);
    }

    ChipAuthenticationPublicKeyInfo(String str, SubjectPublicKeyInfo subjectPublicKeyInfo2, BigInteger bigInteger) {
        this.oid = str;
        this.subjectPublicKeyInfo = subjectPublicKeyInfo2;
        this.keyId = bigInteger;
        checkFields();
    }

    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add((ASN1Sequence) this.subjectPublicKeyInfo.toASN1Primitive());
        BigInteger bigInteger = this.keyId;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String getObjectIdentifier() {
        return this.oid;
    }

    public String getProtocolOIDString() {
        return toProtocolOIDString(this.oid);
    }

    public BigInteger getKeyId() {
        return this.keyId;
    }

    public PublicKey getSubjectPublicKey() {
        return Util.toPublicKey(this.subjectPublicKeyInfo);
    }

    /* access modifiers changed from: protected */
    public void checkFields() {
        try {
            if (!checkRequiredIdentifier(this.oid)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Wrong identifier: ");
                sb.append(this.oid);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (Exception e) {
            Logger logger = LOGGER;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception: ");
            sb2.append(e.getMessage());
            logger.severe(sb2.toString());
            throw new IllegalArgumentException("Malformed ChipAuthenticationInfo.");
        }
    }

    public static boolean checkRequiredIdentifier(String str) {
        return ID_PK_DH.equals(str) || ID_PK_ECDH.equals(str);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ChipAuthenticationPublicKeyInfo [protocol: ");
        sb.append(toProtocolOIDString(this.oid));
        sb.append(", chipAuthenticationPublicKey: ");
        sb.append(Util.getDetailedPublicKeyAlgorithm(getSubjectPublicKey()));
        sb.append(", keyId: ");
        BigInteger bigInteger = this.keyId;
        if (bigInteger == null) {
            str = "-";
        } else {
            str = bigInteger.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        int hashCode = this.oid.hashCode();
        BigInteger bigInteger = this.keyId;
        int i = 111;
        int hashCode2 = bigInteger == null ? 111 : bigInteger.hashCode();
        SubjectPublicKeyInfo subjectPublicKeyInfo2 = this.subjectPublicKeyInfo;
        if (subjectPublicKeyInfo2 != null) {
            i = subjectPublicKeyInfo2.hashCode();
        }
        return ((hashCode + hashCode2 + i) * 1337) + EACTags.SECURITY_ENVIRONMENT_TEMPLATE;
    }

    public boolean equals(Object obj) {
        BigInteger bigInteger;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!ChipAuthenticationPublicKeyInfo.class.equals(obj.getClass())) {
            return false;
        }
        ChipAuthenticationPublicKeyInfo chipAuthenticationPublicKeyInfo = (ChipAuthenticationPublicKeyInfo) obj;
        if (!this.oid.equals(chipAuthenticationPublicKeyInfo.oid)) {
            return false;
        }
        if (((this.keyId != null || chipAuthenticationPublicKeyInfo.keyId != null) && ((bigInteger = this.keyId) == null || !bigInteger.equals(chipAuthenticationPublicKeyInfo.keyId))) || !this.subjectPublicKeyInfo.equals(chipAuthenticationPublicKeyInfo.subjectPublicKeyInfo)) {
            return false;
        }
        return true;
    }

    private static String toProtocolOIDString(String str) {
        if (ID_PK_DH.equals(str)) {
            return "id-PK-DH";
        }
        return ID_PK_ECDH.equals(str) ? "id-PK-ECDH" : str;
    }
}
