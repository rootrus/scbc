package org.bouncycastle.asn1.p091bc;

import okhttp3.internal.cache.DiskLruCache;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;

/* renamed from: org.bouncycastle.asn1.bc.BCObjectIdentifiers */
public interface BCObjectIdentifiers {

    /* renamed from: bc */
    public static final ASN1ObjectIdentifier f5570bc;
    public static final ASN1ObjectIdentifier bc_exch;
    public static final ASN1ObjectIdentifier bc_pbe;
    public static final ASN1ObjectIdentifier bc_pbe_sha1;
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs12 = bc_pbe_sha1.branch("2");
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs12_aes128_cbc = bc_pbe_sha1_pkcs12.branch("1.2");
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs12_aes192_cbc = bc_pbe_sha1_pkcs12.branch("1.22");
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs12_aes256_cbc = bc_pbe_sha1_pkcs12.branch("1.42");
    public static final ASN1ObjectIdentifier bc_pbe_sha1_pkcs5 = bc_pbe_sha1.branch(DiskLruCache.VERSION_1);
    public static final ASN1ObjectIdentifier bc_pbe_sha224 = bc_pbe.branch("2.4");
    public static final ASN1ObjectIdentifier bc_pbe_sha256 = bc_pbe.branch("2.1");
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs12 = bc_pbe_sha256.branch("2");
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs12_aes128_cbc = bc_pbe_sha256_pkcs12.branch("1.2");
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs12_aes192_cbc = bc_pbe_sha256_pkcs12.branch("1.22");
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs12_aes256_cbc = bc_pbe_sha256_pkcs12.branch("1.42");
    public static final ASN1ObjectIdentifier bc_pbe_sha256_pkcs5 = bc_pbe_sha256.branch(DiskLruCache.VERSION_1);
    public static final ASN1ObjectIdentifier bc_pbe_sha384 = bc_pbe.branch("2.2");
    public static final ASN1ObjectIdentifier bc_pbe_sha512 = bc_pbe.branch("2.3");
    public static final ASN1ObjectIdentifier bc_sig;
    public static final ASN1ObjectIdentifier newHope;
    public static final ASN1ObjectIdentifier sphincs256;
    public static final ASN1ObjectIdentifier sphincs256_with_BLAKE512;
    public static final ASN1ObjectIdentifier sphincs256_with_SHA3_512 = sphincs256.branch("3");
    public static final ASN1ObjectIdentifier sphincs256_with_SHA512 = sphincs256.branch("2");

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.3.6.1.4.1.22554");
        f5570bc = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier branch = aSN1ObjectIdentifier.branch(DiskLruCache.VERSION_1);
        bc_pbe = branch;
        bc_pbe_sha1 = branch.branch(DiskLruCache.VERSION_1);
        ASN1ObjectIdentifier branch2 = f5570bc.branch("2");
        bc_sig = branch2;
        ASN1ObjectIdentifier branch3 = branch2.branch(DiskLruCache.VERSION_1);
        sphincs256 = branch3;
        sphincs256_with_BLAKE512 = branch3.branch(DiskLruCache.VERSION_1);
        ASN1ObjectIdentifier branch4 = f5570bc.branch("3");
        bc_exch = branch4;
        newHope = branch4.branch(DiskLruCache.VERSION_1);
    }
}
