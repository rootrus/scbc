package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.jcajce.spec.SPHINCS256KeyGenParameterSpec;
import org.jmrtd.PassportService;

public class SHA3 {

    public static class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
    }

    public static class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i) {
            super(new SHA3Digest(i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHA3Digest((SHA3Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
    }

    public static class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    public static class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(384);
        }
    }

    public static class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    public static class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i) {
            super(new HMac(new SHA3Digest(i)));
        }
    }

    public static class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
    }

    public static class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    public static class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(384);
        }
    }

    public static class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    public static class KeyGeneratorSHA3 extends BaseKeyGenerator {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public KeyGeneratorSHA3(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "HMACSHA3-"
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                org.bouncycastle.crypto.CipherKeyGenerator r1 = new org.bouncycastle.crypto.CipherKeyGenerator
                r1.<init>()
                r2.<init>(r0, r3, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.digest.SHA3.KeyGeneratorSHA3.<init>(int):void");
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA3.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$Digest224");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-224", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PREFIX);
            sb2.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-256", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$Digest384");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-384", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(PREFIX);
            sb4.append("$Digest512");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-512", sb4.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha3_224;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(PREFIX);
            sb5.append("$Digest224");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier, sb5.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha3_256;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(PREFIX);
            sb6.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier2, sb6.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha3_384;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(PREFIX);
            sb7.append("$Digest384");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier3, sb7.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha3_512;
            StringBuilder sb8 = new StringBuilder();
            sb8.append(PREFIX);
            sb8.append("$Digest512");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier4, sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(PREFIX);
            sb9.append("$HashMac224");
            String obj = sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(PREFIX);
            sb10.append("$KeyGenerator224");
            addHMACAlgorithm(configurableProvider, "SHA3-224", obj, sb10.toString());
            addHMACAlias(configurableProvider, "SHA3-224", NISTObjectIdentifiers.id_hmacWithSHA3_224);
            StringBuilder sb11 = new StringBuilder();
            sb11.append(PREFIX);
            sb11.append("$HashMac256");
            String obj2 = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(PREFIX);
            sb12.append("$KeyGenerator256");
            addHMACAlgorithm(configurableProvider, SPHINCS256KeyGenParameterSpec.SHA3_256, obj2, sb12.toString());
            addHMACAlias(configurableProvider, SPHINCS256KeyGenParameterSpec.SHA3_256, NISTObjectIdentifiers.id_hmacWithSHA3_256);
            StringBuilder sb13 = new StringBuilder();
            sb13.append(PREFIX);
            sb13.append("$HashMac384");
            String obj3 = sb13.toString();
            StringBuilder sb14 = new StringBuilder();
            sb14.append(PREFIX);
            sb14.append("$KeyGenerator384");
            addHMACAlgorithm(configurableProvider, "SHA3-384", obj3, sb14.toString());
            addHMACAlias(configurableProvider, "SHA3-384", NISTObjectIdentifiers.id_hmacWithSHA3_384);
            StringBuilder sb15 = new StringBuilder();
            sb15.append(PREFIX);
            sb15.append("$HashMac512");
            String obj4 = sb15.toString();
            StringBuilder sb16 = new StringBuilder();
            sb16.append(PREFIX);
            sb16.append("$KeyGenerator512");
            addHMACAlgorithm(configurableProvider, "SHA3-512", obj4, sb16.toString());
            addHMACAlias(configurableProvider, "SHA3-512", NISTObjectIdentifiers.id_hmacWithSHA3_512);
        }
    }

    private SHA3() {
    }
}
