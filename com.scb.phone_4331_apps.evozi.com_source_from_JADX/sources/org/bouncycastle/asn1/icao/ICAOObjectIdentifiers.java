package org.bouncycastle.asn1.icao;

import okhttp3.internal.cache.DiskLruCache;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

public interface ICAOObjectIdentifiers {
    public static final ASN1ObjectIdentifier id_icao;
    public static final ASN1ObjectIdentifier id_icao_aaProtocolObject = id_icao_mrtd_security.branch("5");
    public static final ASN1ObjectIdentifier id_icao_cscaMasterList = id_icao_mrtd_security.branch("2");
    public static final ASN1ObjectIdentifier id_icao_cscaMasterListSigningKey = id_icao_mrtd_security.branch("3");
    public static final ASN1ObjectIdentifier id_icao_documentTypeList = id_icao_mrtd_security.branch("4");
    public static final ASN1ObjectIdentifier id_icao_extensions;
    public static final ASN1ObjectIdentifier id_icao_extensions_namechangekeyrollover;
    public static final ASN1ObjectIdentifier id_icao_ldsSecurityObject;
    public static final ASN1ObjectIdentifier id_icao_mrtd;
    public static final ASN1ObjectIdentifier id_icao_mrtd_security;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("2.23.136");
        id_icao = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch(DiskLruCache.VERSION_1);
        id_icao_mrtd = branch;
        ASN1ObjectIdentifier branch2 = branch.branch(DiskLruCache.VERSION_1);
        id_icao_mrtd_security = branch2;
        id_icao_ldsSecurityObject = branch2.branch(DiskLruCache.VERSION_1);
        ASN1ObjectIdentifier branch3 = id_icao_mrtd_security.branch("6");
        id_icao_extensions = branch3;
        id_icao_extensions_namechangekeyrollover = branch3.branch(DiskLruCache.VERSION_1);
    }
}
