package org.jmrtd.lds;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

public class ChipAuthenticationInfo extends SecurityInfo {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;
    private static final long serialVersionUID = 5591988305059068535L;
    private BigInteger keyId;
    private String oid;
    private int version;

    public ChipAuthenticationInfo(String str, int i) {
        this(str, i, (BigInteger) null);
    }

    public ChipAuthenticationInfo(String str, int i, BigInteger bigInteger) {
        this.oid = str;
        this.version = i;
        this.keyId = bigInteger;
        checkFields();
    }

    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add(new ASN1Integer((long) this.version));
        BigInteger bigInteger = this.keyId;
        if (bigInteger != null) {
            aSN1EncodableVector.add(new ASN1Integer(bigInteger));
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

    public BigInteger getKeyId() {
        return this.keyId;
    }

    /* access modifiers changed from: protected */
    public void checkFields() {
        try {
            if (!checkRequiredIdentifier(this.oid)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Wrong identifier: ");
                sb.append(this.oid);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.version != 1 && this.version != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Wrong version. Was expecting 1 or 2, found ");
                sb2.append(this.version);
                throw new IllegalArgumentException(sb2.toString());
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Exception", e);
            throw new IllegalArgumentException("Malformed ChipAuthenticationInfo.");
        }
    }

    static boolean checkRequiredIdentifier(String str) {
        return ID_CA_DH_3DES_CBC_CBC.equals(str) || ID_CA_ECDH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_128.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_256.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_128.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_256.equals(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChipAuthenticationInfo [protocol: ");
        sb.append(toProtocolOIDString(this.oid));
        sb.append(", version: ");
        sb.append(this.version);
        sb.append(", keyId: ");
        Object obj = this.keyId;
        if (obj == null) {
            obj = "-";
        }
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        String str = this.oid;
        int hashCode = str == null ? 0 : str.hashCode();
        int i = this.version;
        BigInteger bigInteger = this.keyId;
        return (hashCode * 11) + 3 + (i * 61) + ((bigInteger == null ? 111 : bigInteger.hashCode()) * 1991);
    }

    public boolean equals(Object obj) {
        BigInteger bigInteger;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!ChipAuthenticationInfo.class.equals(obj.getClass())) {
            return false;
        }
        ChipAuthenticationInfo chipAuthenticationInfo = (ChipAuthenticationInfo) obj;
        if (!this.oid.equals(chipAuthenticationInfo.oid) || this.version != chipAuthenticationInfo.version) {
            return false;
        }
        if ((this.keyId != null || chipAuthenticationInfo.keyId != null) && ((bigInteger = this.keyId) == null || !bigInteger.equals(chipAuthenticationInfo.keyId))) {
            return false;
        }
        return true;
    }

    public static String toKeyAgreementAlgorithm(String str) {
        String str2;
        if (ID_CA_DH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_128.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_256.equals(str)) {
            return "DH";
        }
        if (ID_CA_ECDH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_128.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_256.equals(str)) {
            return "ECDH";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown OID: ");
        sb.append(str);
        if (sb.toString() == null) {
            str2 = "null";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\"");
            sb2.append(str);
            sb2.append("\"");
            str2 = sb2.toString();
        }
        throw new NumberFormatException(str2);
    }

    public static String toCipherAlgorithm(String str) {
        if (ID_CA_DH_3DES_CBC_CBC.equals(str) || ID_CA_ECDH_3DES_CBC_CBC.equals(str)) {
            return "DESede";
        }
        if (SecurityInfo.ID_CA_DH_AES_CBC_CMAC_128.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_256.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_128.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_256.equals(str)) {
            return "AES";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown OID: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public static String toDigestAlgorithm(String str) {
        if (ID_CA_DH_3DES_CBC_CBC.equals(str) || ID_CA_ECDH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_128.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_128.equals(str)) {
            return McElieceCCA2KeyGenParameterSpec.SHA1;
        }
        if (SecurityInfo.ID_CA_DH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_256.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_256.equals(str)) {
            return McElieceCCA2KeyGenParameterSpec.SHA256;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown OID: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    public static int toKeyLength(String str) {
        if (ID_CA_DH_3DES_CBC_CBC.equals(str) || ID_CA_ECDH_3DES_CBC_CBC.equals(str) || SecurityInfo.ID_CA_DH_AES_CBC_CMAC_128.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_128.equals(str)) {
            return 128;
        }
        if (SecurityInfo.ID_CA_DH_AES_CBC_CMAC_192.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_192.equals(str)) {
            return 192;
        }
        if (SecurityInfo.ID_CA_DH_AES_CBC_CMAC_256.equals(str) || SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_256.equals(str)) {
            return 256;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown OID: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }

    private static String toProtocolOIDString(String str) {
        if (ID_CA_DH_3DES_CBC_CBC.equals(str)) {
            return "id-CA-DH-3DES-CBC-CBC";
        }
        if (SecurityInfo.ID_CA_DH_AES_CBC_CMAC_128.equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-128";
        }
        if (SecurityInfo.ID_CA_DH_AES_CBC_CMAC_192.equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-192";
        }
        if (SecurityInfo.ID_CA_DH_AES_CBC_CMAC_256.equals(str)) {
            return "id-CA-DH-AES-CBC-CMAC-256";
        }
        if (ID_CA_ECDH_3DES_CBC_CBC.equals(str)) {
            return "id-CA-ECDH-3DES-CBC-CBC";
        }
        if (SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_128.equals(str)) {
            return "id-CA-ECDH-AES-CBC-CMAC-128";
        }
        if (SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_192.equals(str)) {
            return "id-CA-ECDH-AES-CBC-CMAC-192";
        }
        return SecurityInfo.ID_CA_ECDH_AES_CBC_CMAC_256.equals(str) ? "id-CA-ECDH-AES-CBC-CMAC-256" : str;
    }
}
