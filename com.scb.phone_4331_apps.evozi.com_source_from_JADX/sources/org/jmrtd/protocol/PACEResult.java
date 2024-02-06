package org.jmrtd.protocol;

import java.io.Serializable;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import org.jmrtd.lds.PACEInfo;
import p040o.AlertController$RecycleListView;

public class PACEResult implements Serializable {
    private static final long serialVersionUID = -6819675856205885052L;
    private String agreementAlg;
    private byte[] chipAuthenticationData;
    private String cipherAlg;
    private String digestAlg;
    private byte[] encryptedChipAuthenticationData;
    private AlgorithmParameterSpec ephemeralParams;
    private int keyLength;
    private PACEInfo.MappingType mappingType;
    private KeyPair pcdKeyPair;
    private byte[] piccNonce;
    private PublicKey piccPublicKey;
    private byte[] sharedSecretBytes;
    private AlgorithmParameterSpec staticParams;
    private SecureMessagingWrapper wrapper;

    public PACEResult(PACEInfo.MappingType mappingType2, String str, String str2, String str3, int i, AlgorithmParameterSpec algorithmParameterSpec, byte[] bArr, AlgorithmParameterSpec algorithmParameterSpec2, KeyPair keyPair, PublicKey publicKey, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureMessagingWrapper secureMessagingWrapper) {
        this.mappingType = mappingType2;
        this.agreementAlg = str;
        this.cipherAlg = str2;
        this.digestAlg = str3;
        this.keyLength = i;
        this.staticParams = algorithmParameterSpec;
        this.piccNonce = bArr;
        this.ephemeralParams = algorithmParameterSpec2;
        this.pcdKeyPair = keyPair;
        this.piccPublicKey = publicKey;
        this.sharedSecretBytes = bArr2;
        this.encryptedChipAuthenticationData = bArr3;
        this.chipAuthenticationData = bArr4;
        this.wrapper = secureMessagingWrapper;
    }

    public SecureMessagingWrapper getWrapper() {
        return this.wrapper;
    }

    public PACEInfo.MappingType getMappingType() {
        return this.mappingType;
    }

    public String getAgreementAlg() {
        return this.agreementAlg;
    }

    public String getCipherAlg() {
        return this.cipherAlg;
    }

    public String getDigestAlg() {
        return this.digestAlg;
    }

    public void setDigestAlg(String str) {
        this.digestAlg = str;
    }

    public int getKeyLength() {
        return this.keyLength;
    }

    public AlgorithmParameterSpec getStaticParams() {
        return this.staticParams;
    }

    public byte[] getPICCNonce() {
        return this.piccNonce;
    }

    public AlgorithmParameterSpec getEphemeralParams() {
        return this.ephemeralParams;
    }

    public KeyPair getPCDKeyPair() {
        return this.pcdKeyPair;
    }

    public PublicKey getPICCPublicKey() {
        return this.piccPublicKey;
    }

    public byte[] getSharedSecretBytes() {
        return this.sharedSecretBytes;
    }

    public byte[] getEncryptedChipAuthenticationData() {
        return this.encryptedChipAuthenticationData;
    }

    public byte[] getChipAuthenticationData() {
        return this.chipAuthenticationData;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PACEResult [mappingType: ");
        sb.append(this.mappingType);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(", agreementAlg: ");
        sb2.append(this.agreementAlg);
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(", cipherAlg: ");
        sb3.append(this.cipherAlg);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(", digestAlg: ");
        sb4.append(this.digestAlg);
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(", keyLength: ");
        sb5.append(this.keyLength);
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(", staticParams: ");
        sb6.append(this.staticParams);
        sb.append(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(", piccNonce: ");
        sb7.append(Arrays.toString(this.piccNonce));
        sb.append(sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(", ephemeralParams: ");
        sb8.append(this.ephemeralParams);
        sb.append(sb8.toString());
        StringBuilder sb9 = new StringBuilder();
        sb9.append(", pcdKeyPair: ");
        sb9.append(this.pcdKeyPair);
        sb.append(sb9.toString());
        StringBuilder sb10 = new StringBuilder();
        sb10.append(", piccPublicKey: ");
        sb10.append(this.piccPublicKey);
        sb.append(sb10.toString());
        StringBuilder sb11 = new StringBuilder();
        sb11.append(", sharedSecretBytes: ");
        sb11.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.sharedSecretBytes));
        sb.append(sb11.toString());
        StringBuilder sb12 = new StringBuilder();
        sb12.append(", encryptedChipAuthenticationData: ");
        sb12.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.encryptedChipAuthenticationData));
        sb.append(sb12.toString());
        StringBuilder sb13 = new StringBuilder();
        sb13.append(", chipAuthenticationData: ");
        sb13.append(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.chipAuthenticationData));
        sb.append(sb13.toString());
        return sb.toString();
    }

    public int hashCode() {
        String str = this.agreementAlg;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = Arrays.hashCode(this.chipAuthenticationData);
        String str2 = this.cipherAlg;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.digestAlg;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        int hashCode5 = Arrays.hashCode(this.encryptedChipAuthenticationData);
        AlgorithmParameterSpec algorithmParameterSpec = this.ephemeralParams;
        int hashCode6 = algorithmParameterSpec == null ? 0 : algorithmParameterSpec.hashCode();
        int i2 = this.keyLength;
        PACEInfo.MappingType mappingType2 = this.mappingType;
        int hashCode7 = mappingType2 == null ? 0 : mappingType2.hashCode();
        KeyPair keyPair = this.pcdKeyPair;
        int hashCode8 = keyPair == null ? 0 : keyPair.hashCode();
        int hashCode9 = Arrays.hashCode(this.piccNonce);
        PublicKey publicKey = this.piccPublicKey;
        int hashCode10 = publicKey == null ? 0 : publicKey.hashCode();
        int hashCode11 = Arrays.hashCode(this.sharedSecretBytes);
        AlgorithmParameterSpec algorithmParameterSpec2 = this.staticParams;
        int hashCode12 = algorithmParameterSpec2 == null ? 0 : algorithmParameterSpec2.hashCode();
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper != null) {
            i = secureMessagingWrapper.hashCode();
        }
        return ((((((((((((((((((((((((((hashCode + 21901) * 1991) + hashCode2) * 1991) + hashCode3) * 1991) + hashCode4) * 1991) + hashCode5) * 1991) + hashCode6) * 1991) + i2) * 1991) + hashCode7) * 1991) + hashCode8) * 1991) + hashCode9) * 1991) + hashCode10) * 1991) + hashCode11) * 1991) + hashCode12) * 1991) + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PACEResult pACEResult = (PACEResult) obj;
        String str = this.agreementAlg;
        if (str == null) {
            if (pACEResult.agreementAlg != null) {
                return false;
            }
        } else if (!str.equals(pACEResult.agreementAlg)) {
            return false;
        }
        if (!Arrays.equals(this.chipAuthenticationData, pACEResult.chipAuthenticationData)) {
            return false;
        }
        String str2 = this.cipherAlg;
        if (str2 == null) {
            if (pACEResult.cipherAlg != null) {
                return false;
            }
        } else if (!str2.equals(pACEResult.cipherAlg)) {
            return false;
        }
        String str3 = this.digestAlg;
        if (str3 == null) {
            if (pACEResult.digestAlg != null) {
                return false;
            }
        } else if (!str3.equals(pACEResult.digestAlg)) {
            return false;
        }
        if (!Arrays.equals(this.encryptedChipAuthenticationData, pACEResult.encryptedChipAuthenticationData)) {
            return false;
        }
        AlgorithmParameterSpec algorithmParameterSpec = this.ephemeralParams;
        if (algorithmParameterSpec == null) {
            if (pACEResult.ephemeralParams != null) {
                return false;
            }
        } else if (!algorithmParameterSpec.equals(pACEResult.ephemeralParams)) {
            return false;
        }
        if (this.keyLength != pACEResult.keyLength || this.mappingType != pACEResult.mappingType) {
            return false;
        }
        KeyPair keyPair = this.pcdKeyPair;
        if (keyPair == null) {
            if (pACEResult.pcdKeyPair != null) {
                return false;
            }
        } else if (!keyPair.equals(pACEResult.pcdKeyPair)) {
            return false;
        }
        if (!Arrays.equals(this.piccNonce, pACEResult.piccNonce)) {
            return false;
        }
        PublicKey publicKey = this.piccPublicKey;
        if (publicKey == null) {
            if (pACEResult.piccPublicKey != null) {
                return false;
            }
        } else if (!publicKey.equals(pACEResult.piccPublicKey)) {
            return false;
        }
        if (!Arrays.equals(this.sharedSecretBytes, pACEResult.sharedSecretBytes)) {
            return false;
        }
        AlgorithmParameterSpec algorithmParameterSpec2 = this.staticParams;
        if (algorithmParameterSpec2 == null) {
            if (pACEResult.staticParams != null) {
                return false;
            }
        } else if (!algorithmParameterSpec2.equals(pACEResult.staticParams)) {
            return false;
        }
        SecureMessagingWrapper secureMessagingWrapper = this.wrapper;
        if (secureMessagingWrapper == null) {
            if (pACEResult.wrapper != null) {
                return false;
            }
        } else if (!secureMessagingWrapper.equals(pACEResult.wrapper)) {
            return false;
        }
        return true;
    }
}
