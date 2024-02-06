package org.bouncycastle.asn1.crmf;

import okhttp3.internal.cache.DiskLruCache;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

public interface CRMFObjectIdentifiers {
    public static final ASN1ObjectIdentifier id_ct_encKeyWithID = PKCSObjectIdentifiers.id_ct.branch("21");
    public static final ASN1ObjectIdentifier id_pkip;
    public static final ASN1ObjectIdentifier id_pkix;
    public static final ASN1ObjectIdentifier id_regCtrl;
    public static final ASN1ObjectIdentifier id_regCtrl_authenticator = id_regCtrl.branch("2");
    public static final ASN1ObjectIdentifier id_regCtrl_pkiArchiveOptions = id_regCtrl.branch("4");
    public static final ASN1ObjectIdentifier id_regCtrl_pkiPublicationInfo = id_regCtrl.branch("3");
    public static final ASN1ObjectIdentifier id_regCtrl_regToken;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.5.5.7");
        id_pkix = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch("5");
        id_pkip = branch;
        ASN1ObjectIdentifier branch2 = branch.branch(DiskLruCache.VERSION_1);
        id_regCtrl = branch2;
        id_regCtrl_regToken = branch2.branch(DiskLruCache.VERSION_1);
    }
}
