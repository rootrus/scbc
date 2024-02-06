package org.bouncycastle.asn1.rosstandart;

import okhttp3.internal.cache.DiskLruCache;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface RosstandartObjectIdentifiers {
    public static final ASN1ObjectIdentifier id_tc26;
    public static final ASN1ObjectIdentifier id_tc26_gost_28147_param_Z = id_tc26.branch("2.5.1.1");
    public static final ASN1ObjectIdentifier id_tc26_gost_3410_12_256_paramSetA = id_tc26.branch("2.1.1.1");
    public static final ASN1ObjectIdentifier id_tc26_gost_3410_12_512_paramSetA = id_tc26.branch("2.1.2.1");
    public static final ASN1ObjectIdentifier id_tc26_gost_3410_12_512_paramSetB = id_tc26.branch("2.1.2.2");
    public static final ASN1ObjectIdentifier id_tc26_gost_3410_12_512_paramSetC = id_tc26.branch("2.1.2.3");
    public static final ASN1ObjectIdentifier id_tc26_gost_3411_12_256;
    public static final ASN1ObjectIdentifier id_tc26_gost_3411_12_512 = id_tc26.branch("1.2.3");
    public static final ASN1ObjectIdentifier id_tc26_hmac_gost_3411_12_256 = id_tc26.branch("1.4.1");
    public static final ASN1ObjectIdentifier id_tc26_hmac_gost_3411_12_512 = id_tc26.branch("1.4.2");
    public static final ASN1ObjectIdentifier rosstandart;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.643.7");
        rosstandart = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch(DiskLruCache.VERSION_1);
        id_tc26 = branch;
        id_tc26_gost_3411_12_256 = branch.branch("1.2.2");
    }
}
