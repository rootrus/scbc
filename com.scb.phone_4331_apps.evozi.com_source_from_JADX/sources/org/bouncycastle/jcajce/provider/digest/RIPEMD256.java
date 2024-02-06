package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.RIPEMD256Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

public class RIPEMD256 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new RIPEMD256Digest());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new RIPEMD256Digest((RIPEMD256Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new RIPEMD256Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD256", 256, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD256.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.RIPEMD256", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.MessageDigest.");
            sb2.append(TeleTrusTObjectIdentifiers.ripemd256);
            configurableProvider.addAlgorithm(sb2.toString(), "RIPEMD256");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$HashMac");
            String obj = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(PREFIX);
            sb4.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "RIPEMD256", obj, sb4.toString());
        }
    }

    private RIPEMD256() {
    }
}
