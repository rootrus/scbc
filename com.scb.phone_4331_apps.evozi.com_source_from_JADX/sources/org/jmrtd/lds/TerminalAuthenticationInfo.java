package org.jmrtd.lds;

import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.eac.EACTags;

public class TerminalAuthenticationInfo extends SecurityInfo {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    public static final int VERSION_1 = 1;
    private static final int VERSION_2 = 2;
    private static final long serialVersionUID = 6220506985707094044L;
    private ASN1Sequence efCVCA;
    private String oid;
    private int version;

    TerminalAuthenticationInfo(String str, int i, ASN1Sequence aSN1Sequence) {
        this.oid = str;
        this.version = i;
        this.efCVCA = aSN1Sequence;
        checkFields();
    }

    TerminalAuthenticationInfo(String str, int i) {
        this(str, i, (ASN1Sequence) null);
    }

    public TerminalAuthenticationInfo() {
        this(ID_TA, 1);
    }

    public TerminalAuthenticationInfo(short s, byte b) {
        this(ID_TA, 1, constructEFCVCA(s, b));
    }

    public int getVersion() {
        return this.version;
    }

    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.oid));
        aSN1EncodableVector.add(new ASN1Integer((long) this.version));
        ASN1Sequence aSN1Sequence = this.efCVCA;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public String getObjectIdentifier() {
        return this.oid;
    }

    public String getProtocolOIDString() {
        return toProtocolOIDString(this.oid);
    }

    public int getFileId() {
        return getFileId(this.efCVCA);
    }

    public byte getShortFileId() {
        return getShortFileId(this.efCVCA);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TerminalAuthenticationInfo [");
        sb.append("protocol: ");
        sb.append(toProtocolOIDString(this.oid));
        sb.append(", ");
        sb.append("version: ");
        sb.append(this.version);
        sb.append(", ");
        sb.append("fileID: ");
        sb.append(getFileId());
        sb.append(", ");
        sb.append("shortFileID: ");
        sb.append(getShortFileId());
        sb.append("]");
        return sb.toString();
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
        ASN1Sequence aSN1Sequence = this.efCVCA;
        if (aSN1Sequence == null) {
            i2 = 1;
        } else {
            i2 = aSN1Sequence.hashCode();
        }
        return (i * 7) + EACTags.SECURITY_ENVIRONMENT_TEMPLATE + (i3 * 5) + (i2 * 3);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!TerminalAuthenticationInfo.class.equals(obj.getClass())) {
            return false;
        }
        TerminalAuthenticationInfo terminalAuthenticationInfo = (TerminalAuthenticationInfo) obj;
        if (this.efCVCA == null && terminalAuthenticationInfo.efCVCA != null) {
            return false;
        }
        if (this.efCVCA == null || terminalAuthenticationInfo.efCVCA != null) {
            return getDERObject().equals(terminalAuthenticationInfo.getDERObject());
        }
        return false;
    }

    static boolean checkRequiredIdentifier(String str) {
        return ID_TA.equals(str);
    }

    private void checkFields() {
        try {
            if (checkRequiredIdentifier(this.oid)) {
                if (this.version != 1) {
                    if (this.version != 2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Wrong version. Was expecting 1 or 2, found ");
                        sb.append(this.version);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (this.efCVCA == null) {
                    return;
                }
                if (((DEROctetString) this.efCVCA.getObjectAt(0)).getOctets().length != 2) {
                    throw new IllegalArgumentException("Malformed FID.");
                } else if (this.efCVCA.size() == 2 && ((DEROctetString) this.efCVCA.getObjectAt(1)).getOctets().length != 1) {
                    throw new IllegalArgumentException("Malformed SFI.");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Wrong identifier: ");
                sb2.append(this.oid);
                throw new IllegalArgumentException(sb2.toString());
            }
        } catch (Exception e) {
            Logger logger = LOGGER;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Exception: ");
            sb3.append(e.getMessage());
            logger.severe(sb3.toString());
            throw new IllegalArgumentException("Malformed TerminalAuthenticationInfo.");
        }
    }

    private static ASN1Sequence constructEFCVCA(short s, byte b) {
        if (b != -1) {
            return new DLSequence(new ASN1Encodable[]{new DEROctetString(new byte[]{(byte) ((65280 & s) >> 8), (byte) s}), new DEROctetString(new byte[]{(byte) b})});
        }
        return new DLSequence(new ASN1Encodable[]{new DEROctetString(new byte[]{(byte) ((65280 & s) >> 8), (byte) s})});
    }

    private static short getFileId(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return -1;
        }
        byte[] octets = ((DEROctetString) aSN1Sequence.getObjectAt(0)).getOctets();
        return (short) ((octets[1] & 255) | ((octets[0] & 255) << 8));
    }

    private static byte getShortFileId(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence != null && aSN1Sequence.size() == 2) {
            return ((DEROctetString) aSN1Sequence.getObjectAt(1)).getOctets()[0];
        }
        return -1;
    }

    private String toProtocolOIDString(String str) {
        if (ID_TA.equals(str)) {
            return "id-TA";
        }
        if (ID_TA_RSA.equals(str)) {
            return "id-TA-RSA";
        }
        if (ID_TA_RSA_V1_5_SHA_1.equals(str)) {
            return "id-TA-RSA-v1-5-SHA-1";
        }
        if (ID_TA_RSA_V1_5_SHA_256.equals(str)) {
            return "id-TA-RSA-v1-5-SHA-256";
        }
        if (ID_TA_RSA_PSS_SHA_1.equals(str)) {
            return "id-TA-RSA-PSS-SHA-1";
        }
        if (ID_TA_RSA_PSS_SHA_256.equals(str)) {
            return "id-TA-RSA-PSS-SHA-256";
        }
        if (ID_TA_ECDSA.equals(str)) {
            return "id-TA-ECDSA";
        }
        if (ID_TA_ECDSA_SHA_1.equals(str)) {
            return "id-TA-ECDSA-SHA-1";
        }
        if (ID_TA_ECDSA_SHA_224.equals(str)) {
            return "id-TA-ECDSA-SHA-224";
        }
        return ID_TA_ECDSA_SHA_256.equals(str) ? "id-TA-ECDSA-SHA-256" : str;
    }
}
