package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.CamelliaWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

public final class Camellia {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        /* access modifiers changed from: protected */
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("Camellia");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "Camellia IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((BlockCipher) new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public BlockCipher get() {
                    return new CamelliaEngine();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new CamelliaEngine())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("Camellia", i, new CipherKeyGenerator());
        }
    }

    public static class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public static class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = Camellia.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.CAMELLIA", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", NTTObjectIdentifiers.id_camellia128_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", NTTObjectIdentifiers.id_camellia192_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", NTTObjectIdentifiers.id_camellia256_cbc, "CAMELLIA");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(PREFIX);
            sb2.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CAMELLIA", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", NTTObjectIdentifiers.id_camellia128_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", NTTObjectIdentifiers.id_camellia192_cbc, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", NTTObjectIdentifiers.id_camellia256_cbc, "CAMELLIA");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.CAMELLIA", sb3.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia128_cbc;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(PREFIX);
            sb4.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb4.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NTTObjectIdentifiers.id_camellia192_cbc;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(PREFIX);
            sb5.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, sb5.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NTTObjectIdentifiers.id_camellia256_cbc;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(PREFIX);
            sb6.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(PREFIX);
            sb7.append("$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.CAMELLIARFC3211WRAP", sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(PREFIX);
            sb8.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.CAMELLIAWRAP", sb8.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NTTObjectIdentifiers.id_camellia128_wrap, "CAMELLIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NTTObjectIdentifiers.id_camellia192_wrap, "CAMELLIAWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NTTObjectIdentifiers.id_camellia256_wrap, "CAMELLIAWRAP");
            StringBuilder sb9 = new StringBuilder();
            sb9.append(PREFIX);
            sb9.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.CAMELLIA", sb9.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NTTObjectIdentifiers.id_camellia128_wrap;
            StringBuilder sb10 = new StringBuilder();
            sb10.append(PREFIX);
            sb10.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier4, sb10.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia192_wrap;
            StringBuilder sb11 = new StringBuilder();
            sb11.append(PREFIX);
            sb11.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier5, sb11.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia256_wrap;
            StringBuilder sb12 = new StringBuilder();
            sb12.append(PREFIX);
            sb12.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier6, sb12.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NTTObjectIdentifiers.id_camellia128_cbc;
            StringBuilder sb13 = new StringBuilder();
            sb13.append(PREFIX);
            sb13.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier7, sb13.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NTTObjectIdentifiers.id_camellia192_cbc;
            StringBuilder sb14 = new StringBuilder();
            sb14.append(PREFIX);
            sb14.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier8, sb14.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NTTObjectIdentifiers.id_camellia256_cbc;
            StringBuilder sb15 = new StringBuilder();
            sb15.append(PREFIX);
            sb15.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier9, sb15.toString());
            StringBuilder sb16 = new StringBuilder();
            sb16.append(PREFIX);
            sb16.append("$GMAC");
            String obj = sb16.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(PREFIX);
            sb17.append("$KeyGen");
            addGMacAlgorithm(configurableProvider, "CAMELLIA", obj, sb17.toString());
            StringBuilder sb18 = new StringBuilder();
            sb18.append(PREFIX);
            sb18.append("$Poly1305");
            String obj2 = sb18.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(PREFIX);
            sb19.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "CAMELLIA", obj2, sb19.toString());
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new CamelliaEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new CamelliaEngine()), 16);
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new CamelliaWrapEngine());
        }
    }

    private Camellia() {
    }
}
