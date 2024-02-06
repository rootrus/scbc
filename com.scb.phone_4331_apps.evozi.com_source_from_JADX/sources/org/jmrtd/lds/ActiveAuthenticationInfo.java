package org.jmrtd.lds;

import java.security.NoSuchAlgorithmException;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;

public class ActiveAuthenticationInfo extends SecurityInfo {
    public static final String ECDSA_PLAIN_RIPEMD160_OID = "0.4.0.127.0.7.1.1.4.1.6";
    public static final String ECDSA_PLAIN_SHA1_OID = "0.4.0.127.0.7.1.1.4.1.1";
    public static final String ECDSA_PLAIN_SHA224_OID = "0.4.0.127.0.7.1.1.4.1.2";
    public static final String ECDSA_PLAIN_SHA256_OID = "0.4.0.127.0.7.1.1.4.1.3";
    public static final String ECDSA_PLAIN_SHA384_OID = "0.4.0.127.0.7.1.1.4.1.4";
    public static final String ECDSA_PLAIN_SHA512_OID = "0.4.0.127.0.7.1.1.4.1.5";
    public static final String ECDSA_PLAIN_SIGNATURES = "0.4.0.127.0.7.1.1.4.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int VERSION_1 = 1;
    private static final long serialVersionUID = 6830847342039845308L;
    private String oid;
    private String signatureAlgorithmOID;
    private int version;

    ActiveAuthenticationInfo(String str, int i, String str2) {
        this.oid = str;
        this.version = i;
        this.signatureAlgorithmOID = str2;
        checkFields();
    }

    public ActiveAuthenticationInfo(String str) {
        this(SecurityInfo.ID_AA, 1, str);
    }

    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add(new ASN1Integer((long) this.version));
        String str = this.signatureAlgorithmOID;
        if (str != null) {
            aSN1EncodableVector.add(new ASN1ObjectIdentifier(str));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String getObjectIdentifier() {
        return this.oid;
    }

    public int getVersion() {
        return this.version;
    }

    public String getProtocolOIDString() {
        return toProtocolOIDString(this.oid);
    }

    public String getSignatureAlgorithmOID() {
        return this.signatureAlgorithmOID;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ActiveAuthenticationInfo");
        sb.append(" [");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("protocol: ");
        sb2.append(toProtocolOIDString(this.oid));
        sb.append(sb2.toString());
        sb.append(", ");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("version: ");
        sb3.append(this.version);
        sb.append(sb3.toString());
        sb.append(", ");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("signatureAlgorithmOID: ");
        sb4.append(toSignatureAlgorithmOIDString(getSignatureAlgorithmOID()));
        sb.append(sb4.toString());
        sb.append("]");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!ActiveAuthenticationInfo.class.equals(obj.getClass())) {
            return false;
        }
        return getDERObject().equals(((ActiveAuthenticationInfo) obj).getDERObject());
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.oid;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = this.version;
        String str2 = this.signatureAlgorithmOID;
        if (str2 == null) {
            i2 = 1;
        } else {
            i2 = str2.hashCode();
        }
        return (i * 3) + 12345 + (i3 * 5) + (i2 * 11);
    }

    public static String lookupMnemonicByOID(String str) throws NoSuchAlgorithmException {
        if (ECDSA_PLAIN_SHA1_OID.equals(str)) {
            return "SHA1withECDSA";
        }
        if (ECDSA_PLAIN_SHA224_OID.equals(str)) {
            return "SHA224withECDSA";
        }
        if (ECDSA_PLAIN_SHA256_OID.equals(str)) {
            return "SHA256withECDSA";
        }
        if (ECDSA_PLAIN_SHA384_OID.equals(str)) {
            return "SHA384withECDSA";
        }
        if (ECDSA_PLAIN_SHA512_OID.equals(str)) {
            return "SHA512withECDSA";
        }
        if (ECDSA_PLAIN_RIPEMD160_OID.equals(str)) {
            return "RIPEMD160withECDSA";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown OID ");
        sb.append(str);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    static boolean checkRequiredIdentifier(String str) {
        return SecurityInfo.ID_AA.equals(str);
    }

    private void checkFields() {
        try {
            if (!checkRequiredIdentifier(this.oid)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Wrong identifier: ");
                sb.append(this.oid);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.version != 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Wrong version: ");
                sb2.append(this.version);
                throw new IllegalArgumentException(sb2.toString());
            } else if (!ECDSA_PLAIN_SHA1_OID.equals(this.signatureAlgorithmOID) && !ECDSA_PLAIN_SHA224_OID.equals(this.signatureAlgorithmOID) && !ECDSA_PLAIN_SHA256_OID.equals(this.signatureAlgorithmOID) && !ECDSA_PLAIN_SHA384_OID.equals(this.signatureAlgorithmOID) && !ECDSA_PLAIN_SHA512_OID.equals(this.signatureAlgorithmOID) && !ECDSA_PLAIN_RIPEMD160_OID.equals(this.signatureAlgorithmOID)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Wrong signature algorithm OID: ");
                sb3.append(this.signatureAlgorithmOID);
                throw new IllegalArgumentException(sb3.toString());
            }
        } catch (Exception e) {
            Logger logger = LOGGER;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Exception: ");
            sb4.append(e.getMessage());
            logger.severe(sb4.toString());
            throw new IllegalArgumentException("Malformed ActiveAuthenticationInfo.");
        }
    }

    private String toProtocolOIDString(String str) {
        return SecurityInfo.ID_AA.equals(str) ? "id-AA" : str;
    }

    public static String toSignatureAlgorithmOIDString(String str) {
        if (ECDSA_PLAIN_SHA1_OID.equals(str) || ECDSA_PLAIN_SHA224_OID.equals(str)) {
            return "ecdsa-plain-SHA224";
        }
        if (ECDSA_PLAIN_SHA256_OID.equals(str)) {
            return "ecdsa-plain-SHA256";
        }
        if (ECDSA_PLAIN_SHA384_OID.equals(str)) {
            return "ecdsa-plain-SHA384";
        }
        if (ECDSA_PLAIN_SHA512_OID.equals(str)) {
            return "ecdsa-plain-SHA512";
        }
        return ECDSA_PLAIN_RIPEMD160_OID.equals(str) ? "ecdsa-plain-RIPEMD160" : str;
    }
}
