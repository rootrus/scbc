package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.engines.SEEDWrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
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

public final class SEED {

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        /* access modifiers changed from: protected */
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("SEED");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "SEED IV";
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((BlockCipher) new CBCBlockCipher(new SEEDEngine()), 128);
        }
    }

    public static class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new SEEDEngine()));
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public BlockCipher get() {
                    return new SEEDEngine();
                }
            });
        }
    }

    public static class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(new GCMBlockCipher(new SEEDEngine())));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SEED", 128, new CipherKeyGenerator());
        }
    }

    public static class Mappings extends SymmetricAlgorithmProvider {
        private static final String PREFIX = SEED.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.SEED", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.AlgorithmParameters.");
            sb2.append(KISAObjectIdentifiers.id_seedCBC);
            configurableProvider.addAlgorithm(sb2.toString(), "SEED");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PREFIX);
            sb3.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.SEED", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb4.append(KISAObjectIdentifiers.id_seedCBC);
            configurableProvider.addAlgorithm(sb4.toString(), "SEED");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(PREFIX);
            sb5.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.SEED", sb5.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier = KISAObjectIdentifiers.id_seedCBC;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(PREFIX);
            sb6.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(PREFIX);
            sb7.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.SEEDWRAP", sb7.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap, "SEEDWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP");
            StringBuilder sb8 = new StringBuilder();
            sb8.append(PREFIX);
            sb8.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.SEED", sb8.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = KISAObjectIdentifiers.id_seedCBC;
            StringBuilder sb9 = new StringBuilder();
            sb9.append(PREFIX);
            sb9.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier2, sb9.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
            StringBuilder sb10 = new StringBuilder();
            sb10.append(PREFIX);
            sb10.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier3, sb10.toString());
            StringBuilder sb11 = new StringBuilder();
            sb11.append(PREFIX);
            sb11.append("$CMAC");
            String obj = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(PREFIX);
            sb12.append("$KeyGen");
            addCMacAlgorithm(configurableProvider, "SEED", obj, sb12.toString());
            StringBuilder sb13 = new StringBuilder();
            sb13.append(PREFIX);
            sb13.append("$GMAC");
            String obj2 = sb13.toString();
            StringBuilder sb14 = new StringBuilder();
            sb14.append(PREFIX);
            sb14.append("$KeyGen");
            addGMacAlgorithm(configurableProvider, "SEED", obj2, sb14.toString());
            StringBuilder sb15 = new StringBuilder();
            sb15.append(PREFIX);
            sb15.append("$Poly1305");
            String obj3 = sb15.toString();
            StringBuilder sb16 = new StringBuilder();
            sb16.append(PREFIX);
            sb16.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "SEED", obj3, sb16.toString());
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SEEDEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SEED", 256, new Poly1305KeyGenerator());
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new SEEDWrapEngine());
        }
    }

    private SEED() {
    }
}
