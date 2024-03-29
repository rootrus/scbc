package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import org.bouncycastle.util.Strings;
import org.jmrtd.PassportService;

public class DigestFactory {
    private static Set md5 = new HashSet();
    private static Map oids = new HashMap();
    private static Set sha1 = new HashSet();
    private static Set sha224 = new HashSet();
    private static Set sha256 = new HashSet();
    private static Set sha384 = new HashSet();
    private static Set sha3_224 = new HashSet();
    private static Set sha3_256 = new HashSet();
    private static Set sha3_384 = new HashSet();
    private static Set sha3_512 = new HashSet();
    private static Set sha512 = new HashSet();
    private static Set sha512_224 = new HashSet();
    private static Set sha512_256 = new HashSet();

    static {
        md5.add("MD5");
        md5.add(PKCSObjectIdentifiers.md5.getId());
        sha1.add("SHA1");
        sha1.add(McElieceCCA2KeyGenParameterSpec.SHA1);
        sha1.add(OIWObjectIdentifiers.idSHA1.getId());
        sha224.add("SHA224");
        sha224.add(McElieceCCA2KeyGenParameterSpec.SHA224);
        sha224.add(NISTObjectIdentifiers.id_sha224.getId());
        sha256.add("SHA256");
        sha256.add(McElieceCCA2KeyGenParameterSpec.SHA256);
        sha256.add(NISTObjectIdentifiers.id_sha256.getId());
        sha384.add("SHA384");
        sha384.add(McElieceCCA2KeyGenParameterSpec.SHA384);
        sha384.add(NISTObjectIdentifiers.id_sha384.getId());
        sha512.add("SHA512");
        sha512.add(McElieceCCA2KeyGenParameterSpec.SHA512);
        sha512.add(NISTObjectIdentifiers.id_sha512.getId());
        sha512_224.add("SHA512(224)");
        sha512_224.add("SHA-512(224)");
        sha512_224.add(NISTObjectIdentifiers.id_sha512_224.getId());
        sha512_256.add("SHA512(256)");
        sha512_256.add("SHA-512(256)");
        sha512_256.add(NISTObjectIdentifiers.id_sha512_256.getId());
        sha3_224.add("SHA3-224");
        sha3_224.add(NISTObjectIdentifiers.id_sha3_224.getId());
        sha3_256.add(SPHINCS256KeyGenParameterSpec.SHA3_256);
        Set set = sha3_256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha3_256;
        Object obj = SPHINCS256KeyGenParameterSpec.SHA3_256;
        set.add(aSN1ObjectIdentifier.getId());
        sha3_384.add("SHA3-384");
        sha3_384.add(NISTObjectIdentifiers.id_sha3_384.getId());
        sha3_512.add("SHA3-512");
        sha3_512.add(NISTObjectIdentifiers.id_sha3_512.getId());
        oids.put("MD5", PKCSObjectIdentifiers.md5);
        oids.put(PKCSObjectIdentifiers.md5.getId(), PKCSObjectIdentifiers.md5);
        oids.put("SHA1", OIWObjectIdentifiers.idSHA1);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA1, OIWObjectIdentifiers.idSHA1);
        oids.put(OIWObjectIdentifiers.idSHA1.getId(), OIWObjectIdentifiers.idSHA1);
        oids.put("SHA224", NISTObjectIdentifiers.id_sha224);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA224, NISTObjectIdentifiers.id_sha224);
        oids.put(NISTObjectIdentifiers.id_sha224.getId(), NISTObjectIdentifiers.id_sha224);
        oids.put("SHA256", NISTObjectIdentifiers.id_sha256);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA256, NISTObjectIdentifiers.id_sha256);
        oids.put(NISTObjectIdentifiers.id_sha256.getId(), NISTObjectIdentifiers.id_sha256);
        oids.put("SHA384", NISTObjectIdentifiers.id_sha384);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA384, NISTObjectIdentifiers.id_sha384);
        oids.put(NISTObjectIdentifiers.id_sha384.getId(), NISTObjectIdentifiers.id_sha384);
        oids.put("SHA512", NISTObjectIdentifiers.id_sha512);
        oids.put(McElieceCCA2KeyGenParameterSpec.SHA512, NISTObjectIdentifiers.id_sha512);
        oids.put(NISTObjectIdentifiers.id_sha512.getId(), NISTObjectIdentifiers.id_sha512);
        oids.put("SHA512(224)", NISTObjectIdentifiers.id_sha512_224);
        oids.put("SHA-512(224)", NISTObjectIdentifiers.id_sha512_224);
        oids.put(NISTObjectIdentifiers.id_sha512_224.getId(), NISTObjectIdentifiers.id_sha512_224);
        oids.put("SHA512(256)", NISTObjectIdentifiers.id_sha512_256);
        oids.put("SHA-512(256)", NISTObjectIdentifiers.id_sha512_256);
        oids.put(NISTObjectIdentifiers.id_sha512_256.getId(), NISTObjectIdentifiers.id_sha512_256);
        oids.put("SHA3-224", NISTObjectIdentifiers.id_sha3_224);
        oids.put(NISTObjectIdentifiers.id_sha3_224.getId(), NISTObjectIdentifiers.id_sha3_224);
        oids.put(obj, NISTObjectIdentifiers.id_sha3_256);
        oids.put(NISTObjectIdentifiers.id_sha3_256.getId(), NISTObjectIdentifiers.id_sha3_256);
        oids.put("SHA3-384", NISTObjectIdentifiers.id_sha3_384);
        oids.put(NISTObjectIdentifiers.id_sha3_384.getId(), NISTObjectIdentifiers.id_sha3_384);
        oids.put("SHA3-512", NISTObjectIdentifiers.id_sha3_512);
        oids.put(NISTObjectIdentifiers.id_sha3_512.getId(), NISTObjectIdentifiers.id_sha3_512);
    }

    public static Digest getDigest(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (sha1.contains(upperCase)) {
            return new SHA1Digest();
        }
        if (md5.contains(upperCase)) {
            return new MD5Digest();
        }
        if (sha224.contains(upperCase)) {
            return new SHA224Digest();
        }
        if (sha256.contains(upperCase)) {
            return new SHA256Digest();
        }
        if (sha384.contains(upperCase)) {
            return new SHA384Digest();
        }
        if (sha512.contains(upperCase)) {
            return new SHA512Digest();
        }
        if (sha512_224.contains(upperCase)) {
            return new SHA512tDigest((int) PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
        if (sha512_256.contains(upperCase)) {
            return new SHA512tDigest(256);
        }
        if (sha3_224.contains(upperCase)) {
            return new SHA3Digest((int) PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
        if (sha3_256.contains(upperCase)) {
            return new SHA3Digest(256);
        }
        if (sha3_384.contains(upperCase)) {
            return new SHA3Digest(384);
        }
        if (sha3_512.contains(upperCase)) {
            return new SHA3Digest(512);
        }
        return null;
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) oids.get(str);
    }

    public static boolean isSameDigest(String str, String str2) {
        return (sha1.contains(str) && sha1.contains(str2)) || (sha224.contains(str) && sha224.contains(str2)) || ((sha256.contains(str) && sha256.contains(str2)) || ((sha384.contains(str) && sha384.contains(str2)) || ((sha512.contains(str) && sha512.contains(str2)) || ((sha512_224.contains(str) && sha512_224.contains(str2)) || ((sha512_256.contains(str) && sha512_256.contains(str2)) || ((sha3_224.contains(str) && sha3_224.contains(str2)) || ((sha3_256.contains(str) && sha3_256.contains(str2)) || ((sha3_384.contains(str) && sha3_384.contains(str2)) || ((sha3_512.contains(str) && sha3_512.contains(str2)) || (md5.contains(str) && md5.contains(str2)))))))))));
    }
}
