package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SerpentEngine;
import org.bouncycastle.crypto.engines.TnepresEngine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

public final class Serpent {

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Serpent IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((BlockCipher) new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public BlockCipher get() {
                    return new SerpentEngine();
                }
            });
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Serpent.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.Serpent", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PREFIX);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.Serpent", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.Serpent", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(PREFIX);
            sb4.append("$TECB");
            configurableProvider.addAlgorithm("Cipher.Tnepres", sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(PREFIX);
            sb5.append("$TKeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.Tnepres", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(PREFIX);
            sb6.append("$TAlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.Tnepres", sb6.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier = GNUObjectIdentifiers.Serpent_128_ECB;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(PREFIX);
            sb7.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb7.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = GNUObjectIdentifiers.Serpent_192_ECB;
            StringBuilder sb8 = new StringBuilder();
            sb8.append(PREFIX);
            sb8.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, sb8.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = GNUObjectIdentifiers.Serpent_256_ECB;
            StringBuilder sb9 = new StringBuilder();
            sb9.append(PREFIX);
            sb9.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, sb9.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = GNUObjectIdentifiers.Serpent_128_CBC;
            StringBuilder sb10 = new StringBuilder();
            sb10.append(PREFIX);
            sb10.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier4, sb10.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = GNUObjectIdentifiers.Serpent_192_CBC;
            StringBuilder sb11 = new StringBuilder();
            sb11.append(PREFIX);
            sb11.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier5, sb11.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = GNUObjectIdentifiers.Serpent_256_CBC;
            StringBuilder sb12 = new StringBuilder();
            sb12.append(PREFIX);
            sb12.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, sb12.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = GNUObjectIdentifiers.Serpent_128_CFB;
            StringBuilder sb13 = new StringBuilder();
            sb13.append(PREFIX);
            sb13.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier7, sb13.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = GNUObjectIdentifiers.Serpent_192_CFB;
            StringBuilder sb14 = new StringBuilder();
            sb14.append(PREFIX);
            sb14.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier8, sb14.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = GNUObjectIdentifiers.Serpent_256_CFB;
            StringBuilder sb15 = new StringBuilder();
            sb15.append(PREFIX);
            sb15.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier9, sb15.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = GNUObjectIdentifiers.Serpent_128_OFB;
            StringBuilder sb16 = new StringBuilder();
            sb16.append(PREFIX);
            sb16.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, sb16.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = GNUObjectIdentifiers.Serpent_192_OFB;
            StringBuilder sb17 = new StringBuilder();
            sb17.append(PREFIX);
            sb17.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, sb17.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = GNUObjectIdentifiers.Serpent_256_OFB;
            StringBuilder sb18 = new StringBuilder();
            sb18.append(PREFIX);
            sb18.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, sb18.toString());
            StringBuilder sb19 = new StringBuilder();
            sb19.append(PREFIX);
            sb19.append("$SerpentGMAC");
            String obj = sb19.toString();
            StringBuilder sb20 = new StringBuilder();
            sb20.append(PREFIX);
            sb20.append("$KeyGen");
            addGMacAlgorithm(configurableProvider, "SERPENT", obj, sb20.toString());
            StringBuilder sb21 = new StringBuilder();
            sb21.append(PREFIX);
            sb21.append("$TSerpentGMAC");
            String obj2 = sb21.toString();
            StringBuilder sb22 = new StringBuilder();
            sb22.append(PREFIX);
            sb22.append("$TKeyGen");
            addGMacAlgorithm(configurableProvider, "TNEPRES", obj2, sb22.toString());
            StringBuilder sb23 = new StringBuilder();
            sb23.append(PREFIX);
            sb23.append("$Poly1305");
            String obj3 = sb23.toString();
            StringBuilder sb24 = new StringBuilder();
            sb24.append(PREFIX);
            sb24.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "SERPENT", obj3, sb24.toString());
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new TwofishEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new Poly1305KeyGenerator());
        }
    }

    public static class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new SerpentEngine())));
        }
    }

    public static class TAlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Tnepres IV";
        }
    }

    public static class TECB extends BaseBlockCipher {
        public TECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public BlockCipher get() {
                    return new TnepresEngine();
                }
            });
        }
    }

    public static class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new CipherKeyGenerator());
        }
    }

    public static class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new GMac(new GCMBlockCipher(new TnepresEngine())));
        }
    }

    private Serpent() {
    }
}
