package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

public class SHA1 {

    public static class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA1Digest());
        }

        public Object clone() throws CloneNotSupportedException {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA1Digest((SHA1Digest) this.digest);
            return digest;
        }
    }

    public static class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    public static class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA1", 160, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends DigestAlgorithmProvider {
        private static final String PREFIX = SHA1.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-1", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA1", McElieceCCA2KeyGenParameterSpec.SHA1);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA", McElieceCCA2KeyGenParameterSpec.SHA1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.MessageDigest.");
            sb2.append(OIWObjectIdentifiers.idSHA1);
            configurableProvider.addAlgorithm(sb2.toString(), McElieceCCA2KeyGenParameterSpec.SHA1);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$HashMac");
            String obj = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(PREFIX);
            sb4.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "SHA1", obj, sb4.toString());
            addHMACAlias(configurableProvider, "SHA1", PKCSObjectIdentifiers.id_hmacWithSHA1);
            addHMACAlias(configurableProvider, "SHA1", IANAObjectIdentifiers.hmacSHA1);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(PREFIX);
            sb5.append("$SHA1Mac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(PREFIX);
            sb6.append("$SHA1Mac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA1", sb6.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.SecretKeyFactory.");
            sb7.append(OIWObjectIdentifiers.idSHA1);
            configurableProvider.addAlgorithm(sb7.toString(), "PBEWITHHMACSHA1");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Alg.Alias.Mac.");
            sb8.append(OIWObjectIdentifiers.idSHA1);
            configurableProvider.addAlgorithm(sb8.toString(), "PBEWITHHMACSHA");
            StringBuilder sb9 = new StringBuilder();
            sb9.append(PREFIX);
            sb9.append("$PBEWithMacKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA1", sb9.toString());
        }
    }

    public static class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", (ASN1ObjectIdentifier) null, false, 2, 1, 160, 0);
        }
    }

    public static class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    private SHA1() {
    }
}
