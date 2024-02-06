package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

public class RIPEMD160 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new RIPEMD160Digest());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new RIPEMD160Digest((RIPEMD160Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new RIPEMD160Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD160", 160, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = RIPEMD160.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.RIPEMD160", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.MessageDigest.");
            sb2.append(TeleTrusTObjectIdentifiers.ripemd160);
            configurableProvider.addAlgorithm(sb2.toString(), "RIPEMD160");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$HashMac");
            String obj = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(PREFIX);
            sb4.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "RIPEMD160", obj, sb4.toString());
            addHMACAlias(configurableProvider, "RIPEMD160", IANAObjectIdentifiers.hmacRIPEMD160);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(PREFIX);
            sb5.append("$PBEWithHmacKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACRIPEMD160", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(PREFIX);
            sb6.append("$PBEWithHmac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACRIPEMD160", sb6.toString());
        }
    }

    public static class PBEWithHmac extends BaseMac {
        public PBEWithHmac() {
            super(new HMac(new RIPEMD160Digest()), 2, 2, 160);
        }
    }

    public static class PBEWithHmacKeyFactory extends PBESecretKeyFactory {
        public PBEWithHmacKeyFactory() {
            super("PBEwithHmacRIPEMD160", (ASN1ObjectIdentifier) null, false, 2, 2, 160, 0);
        }
    }

    private RIPEMD160() {
    }
}
