package p040o;

import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: o.HmlNTBAdditionalDocumentActivity_ViewBinding */
public enum HmlNTBAdditionalDocumentActivity_ViewBinding {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    LIST(13),
    LINKING_OBJECTS(14),
    INTEGER_LIST(128),
    BOOLEAN_LIST(129),
    STRING_LIST(ISO781611.BIOMETRIC_SUBTYPE_TAG),
    BINARY_LIST(132),
    DATE_LIST(136),
    FLOAT_LIST(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA),
    DOUBLE_LIST(CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
    
    private static final HmlNTBAdditionalDocumentActivity_ViewBinding[] basicTypes = null;
    private static final HmlNTBAdditionalDocumentActivity_ViewBinding[] listTypes = null;
    private final int nativeValue;

    static {
        int i;
        basicTypes = new HmlNTBAdditionalDocumentActivity_ViewBinding[15];
        listTypes = new HmlNTBAdditionalDocumentActivity_ViewBinding[15];
        for (HmlNTBAdditionalDocumentActivity_ViewBinding hmlNTBAdditionalDocumentActivity_ViewBinding : values()) {
            int i2 = hmlNTBAdditionalDocumentActivity_ViewBinding.nativeValue;
            if (i2 < 128) {
                basicTypes[i2] = hmlNTBAdditionalDocumentActivity_ViewBinding;
            } else {
                listTypes[i2 - 128] = hmlNTBAdditionalDocumentActivity_ViewBinding;
            }
        }
    }

    private HmlNTBAdditionalDocumentActivity_ViewBinding(int i) {
        this.nativeValue = i;
    }

    public static HmlNTBAdditionalDocumentActivity_ViewBinding MediaBrowserCompat$ItemReceiver(int i) {
        HmlNTBAdditionalDocumentActivity_ViewBinding hmlNTBAdditionalDocumentActivity_ViewBinding;
        HmlNTBAdditionalDocumentActivity_ViewBinding hmlNTBAdditionalDocumentActivity_ViewBinding2;
        if (i >= 0) {
            HmlNTBAdditionalDocumentActivity_ViewBinding[] hmlNTBAdditionalDocumentActivity_ViewBindingArr = basicTypes;
            if (i < hmlNTBAdditionalDocumentActivity_ViewBindingArr.length && (hmlNTBAdditionalDocumentActivity_ViewBinding2 = hmlNTBAdditionalDocumentActivity_ViewBindingArr[i]) != null) {
                return hmlNTBAdditionalDocumentActivity_ViewBinding2;
            }
        }
        if (128 <= i) {
            int i2 = i - 128;
            HmlNTBAdditionalDocumentActivity_ViewBinding[] hmlNTBAdditionalDocumentActivity_ViewBindingArr2 = listTypes;
            if (i2 < hmlNTBAdditionalDocumentActivity_ViewBindingArr2.length && (hmlNTBAdditionalDocumentActivity_ViewBinding = hmlNTBAdditionalDocumentActivity_ViewBindingArr2[i2]) != null) {
                return hmlNTBAdditionalDocumentActivity_ViewBinding;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid native Realm type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
