package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SkeinDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.SkeinMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.jmrtd.PassportService;

public class Skein {

    public static class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i) {
            super(new SkeinDigest(1024, i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i) {
            super(new SkeinDigest(256, i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i) {
            super(new SkeinDigest(512, i));
        }

        public Object clone() throws CloneNotSupportedException {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public static class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    public static class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(384);
        }
    }

    public static class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    public static class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    public static class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(160);
        }
    }

    public static class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
    }

    public static class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(256);
        }
    }

    public static class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    public static class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(160);
        }
    }

    public static class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(PassportService.DEFAULT_MAX_BLOCKSIZE);
        }
    }

    public static class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(256);
        }
    }

    public static class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(384);
        }
    }

    public static class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    public static class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", 1024, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", 384, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", 512, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", 160, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", PassportService.DEFAULT_MAX_BLOCKSIZE, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", 256, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", 160, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", PassportService.DEFAULT_MAX_BLOCKSIZE, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", 256, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", 384, new CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", 512, new CipherKeyGenerator());
        }
    }

    public static class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new HMac(new SkeinDigest(1024, 1024)));
        }
    }

    public static class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new HMac(new SkeinDigest(1024, 384)));
        }
    }

    public static class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new HMac(new SkeinDigest(1024, 512)));
        }
    }

    public static class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new HMac(new SkeinDigest(256, 128)));
        }
    }

    public static class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new HMac(new SkeinDigest(256, 160)));
        }
    }

    public static class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new HMac(new SkeinDigest(256, PassportService.DEFAULT_MAX_BLOCKSIZE)));
        }
    }

    public static class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new HMac(new SkeinDigest(256, 256)));
        }
    }

    public static class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new HMac(new SkeinDigest(512, 128)));
        }
    }

    public static class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new HMac(new SkeinDigest(512, 160)));
        }
    }

    public static class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new HMac(new SkeinDigest(512, PassportService.DEFAULT_MAX_BLOCKSIZE)));
        }
    }

    public static class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new HMac(new SkeinDigest(512, 256)));
        }
    }

    public static class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new HMac(new SkeinDigest(512, 384)));
        }
    }

    public static class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new HMac(new SkeinDigest(512, 512)));
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = Skein.class.getName();

        private void addSkeinMacAlgorithm(ConfigurableProvider configurableProvider, int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Skein-MAC-");
            sb.append(i);
            sb.append("-");
            sb.append(i2);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PREFIX);
            sb2.append("$SkeinMac_");
            sb2.append(i);
            sb2.append("_");
            sb2.append(i2);
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$SkeinMacKeyGenerator_");
            sb3.append(i);
            sb3.append("_");
            sb3.append(i2);
            String obj3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Mac.");
            sb4.append(obj);
            configurableProvider.addAlgorithm(sb4.toString(), obj2);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Alg.Alias.Mac.Skein-MAC");
            sb5.append(i);
            sb5.append("/");
            sb5.append(i2);
            configurableProvider.addAlgorithm(sb5.toString(), obj);
            StringBuilder sb6 = new StringBuilder();
            sb6.append("KeyGenerator.");
            sb6.append(obj);
            configurableProvider.addAlgorithm(sb6.toString(), obj3);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.KeyGenerator.Skein-MAC");
            sb7.append(i);
            sb7.append("/");
            sb7.append(i2);
            configurableProvider.addAlgorithm(sb7.toString(), obj);
        }

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$Digest_256_128");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-128", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PREFIX);
            sb2.append("$Digest_256_160");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-160", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$Digest_256_224");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-224", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(PREFIX);
            sb4.append("$Digest_256_256");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-256", sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(PREFIX);
            sb5.append("$Digest_512_128");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-128", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(PREFIX);
            sb6.append("$Digest_512_160");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-160", sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(PREFIX);
            sb7.append("$Digest_512_224");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-224", sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(PREFIX);
            sb8.append("$Digest_512_256");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-256", sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(PREFIX);
            sb9.append("$Digest_512_384");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-384", sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(PREFIX);
            sb10.append("$Digest_512_512");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-512", sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append(PREFIX);
            sb11.append("$Digest_1024_384");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-384", sb11.toString());
            StringBuilder sb12 = new StringBuilder();
            sb12.append(PREFIX);
            sb12.append("$Digest_1024_512");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-512", sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(PREFIX);
            sb13.append("$Digest_1024_1024");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-1024", sb13.toString());
            StringBuilder sb14 = new StringBuilder();
            sb14.append(PREFIX);
            sb14.append("$HashMac_256_128");
            String obj = sb14.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(PREFIX);
            sb15.append("$HMacKeyGenerator_256_128");
            addHMACAlgorithm(configurableProvider, "Skein-256-128", obj, sb15.toString());
            StringBuilder sb16 = new StringBuilder();
            sb16.append(PREFIX);
            sb16.append("$HashMac_256_160");
            String obj2 = sb16.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(PREFIX);
            sb17.append("$HMacKeyGenerator_256_160");
            addHMACAlgorithm(configurableProvider, "Skein-256-160", obj2, sb17.toString());
            StringBuilder sb18 = new StringBuilder();
            sb18.append(PREFIX);
            sb18.append("$HashMac_256_224");
            String obj3 = sb18.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(PREFIX);
            sb19.append("$HMacKeyGenerator_256_224");
            addHMACAlgorithm(configurableProvider, "Skein-256-224", obj3, sb19.toString());
            StringBuilder sb20 = new StringBuilder();
            sb20.append(PREFIX);
            sb20.append("$HashMac_256_256");
            String obj4 = sb20.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(PREFIX);
            sb21.append("$HMacKeyGenerator_256_256");
            addHMACAlgorithm(configurableProvider, "Skein-256-256", obj4, sb21.toString());
            StringBuilder sb22 = new StringBuilder();
            sb22.append(PREFIX);
            sb22.append("$HashMac_512_128");
            String obj5 = sb22.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(PREFIX);
            sb23.append("$HMacKeyGenerator_512_128");
            addHMACAlgorithm(configurableProvider, "Skein-512-128", obj5, sb23.toString());
            StringBuilder sb24 = new StringBuilder();
            sb24.append(PREFIX);
            sb24.append("$HashMac_512_160");
            String obj6 = sb24.toString();
            StringBuilder sb25 = new StringBuilder();
            sb25.append(PREFIX);
            sb25.append("$HMacKeyGenerator_512_160");
            addHMACAlgorithm(configurableProvider, "Skein-512-160", obj6, sb25.toString());
            StringBuilder sb26 = new StringBuilder();
            sb26.append(PREFIX);
            sb26.append("$HashMac_512_224");
            String obj7 = sb26.toString();
            StringBuilder sb27 = new StringBuilder();
            sb27.append(PREFIX);
            sb27.append("$HMacKeyGenerator_512_224");
            addHMACAlgorithm(configurableProvider, "Skein-512-224", obj7, sb27.toString());
            StringBuilder sb28 = new StringBuilder();
            sb28.append(PREFIX);
            sb28.append("$HashMac_512_256");
            String obj8 = sb28.toString();
            StringBuilder sb29 = new StringBuilder();
            sb29.append(PREFIX);
            sb29.append("$HMacKeyGenerator_512_256");
            addHMACAlgorithm(configurableProvider, "Skein-512-256", obj8, sb29.toString());
            StringBuilder sb30 = new StringBuilder();
            sb30.append(PREFIX);
            sb30.append("$HashMac_512_384");
            String obj9 = sb30.toString();
            StringBuilder sb31 = new StringBuilder();
            sb31.append(PREFIX);
            sb31.append("$HMacKeyGenerator_512_384");
            addHMACAlgorithm(configurableProvider, "Skein-512-384", obj9, sb31.toString());
            StringBuilder sb32 = new StringBuilder();
            sb32.append(PREFIX);
            sb32.append("$HashMac_512_512");
            String obj10 = sb32.toString();
            StringBuilder sb33 = new StringBuilder();
            sb33.append(PREFIX);
            sb33.append("$HMacKeyGenerator_512_512");
            addHMACAlgorithm(configurableProvider, "Skein-512-512", obj10, sb33.toString());
            StringBuilder sb34 = new StringBuilder();
            sb34.append(PREFIX);
            sb34.append("$HashMac_1024_384");
            String obj11 = sb34.toString();
            StringBuilder sb35 = new StringBuilder();
            sb35.append(PREFIX);
            sb35.append("$HMacKeyGenerator_1024_384");
            addHMACAlgorithm(configurableProvider, "Skein-1024-384", obj11, sb35.toString());
            StringBuilder sb36 = new StringBuilder();
            sb36.append(PREFIX);
            sb36.append("$HashMac_1024_512");
            String obj12 = sb36.toString();
            StringBuilder sb37 = new StringBuilder();
            sb37.append(PREFIX);
            sb37.append("$HMacKeyGenerator_1024_512");
            addHMACAlgorithm(configurableProvider, "Skein-1024-512", obj12, sb37.toString());
            StringBuilder sb38 = new StringBuilder();
            sb38.append(PREFIX);
            sb38.append("$HashMac_1024_1024");
            String obj13 = sb38.toString();
            StringBuilder sb39 = new StringBuilder();
            sb39.append(PREFIX);
            sb39.append("$HMacKeyGenerator_1024_1024");
            addHMACAlgorithm(configurableProvider, "Skein-1024-1024", obj13, sb39.toString());
            addSkeinMacAlgorithm(configurableProvider, 256, 128);
            addSkeinMacAlgorithm(configurableProvider, 256, 160);
            addSkeinMacAlgorithm(configurableProvider, 256, PassportService.DEFAULT_MAX_BLOCKSIZE);
            addSkeinMacAlgorithm(configurableProvider, 256, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, 128);
            addSkeinMacAlgorithm(configurableProvider, 512, 160);
            addSkeinMacAlgorithm(configurableProvider, 512, PassportService.DEFAULT_MAX_BLOCKSIZE);
            addSkeinMacAlgorithm(configurableProvider, 512, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, 384);
            addSkeinMacAlgorithm(configurableProvider, 512, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, 384);
            addSkeinMacAlgorithm(configurableProvider, 1024, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, 1024);
        }
    }

    public static class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", 1024, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", 384, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", 512, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", 160, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", PassportService.DEFAULT_MAX_BLOCKSIZE, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", 256, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", 160, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", PassportService.DEFAULT_MAX_BLOCKSIZE, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", 256, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", 384, new CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", 512, new CipherKeyGenerator());
        }
    }

    public static class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new SkeinMac(1024, 1024));
        }
    }

    public static class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new SkeinMac(1024, 384));
        }
    }

    public static class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new SkeinMac(1024, 512));
        }
    }

    public static class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new SkeinMac(256, 128));
        }
    }

    public static class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new SkeinMac(256, 160));
        }
    }

    public static class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new SkeinMac(256, PassportService.DEFAULT_MAX_BLOCKSIZE));
        }
    }

    public static class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new SkeinMac(256, 256));
        }
    }

    public static class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new SkeinMac(512, 128));
        }
    }

    public static class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new SkeinMac(512, 160));
        }
    }

    public static class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new SkeinMac(512, PassportService.DEFAULT_MAX_BLOCKSIZE));
        }
    }

    public static class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new SkeinMac(512, 256));
        }
    }

    public static class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new SkeinMac(512, 384));
        }
    }

    public static class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new SkeinMac(512, 512));
        }
    }

    private Skein() {
    }
}
