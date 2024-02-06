package org.bouncycastle.jcajce.provider.symmetric;

import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.CCMParameters;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.p091bc.BCObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.AESFastEngine;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.engines.RFC5649WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

public final class AES {
    private static final Class gcmSpecClass = lookup("javax.crypto.spec.GCMParameterSpec");

    public static class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new CMac(new AESFastEngine()));
        }
    }

    public static class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new GMac(new GCMBlockCipher(new AESFastEngine())));
        }
    }

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        /* access modifiers changed from: protected */
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("AES");
                createParametersInstance.init(new IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        /* access modifiers changed from: protected */
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("CCM");
                createParametersInstance.init(new CCMParameters(bArr, 12).getEncoded());
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        /* access modifiers changed from: protected */
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(CodePackage.GCM);
                createParametersInstance.init(new GCMParameters(bArr, 12).getEncoded());
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public static class AlgParams extends IvAlgorithmParameters {
        public String engineToString() {
            return "AES IV";
        }
    }

    public static class AlgParamsCCM extends BaseAlgorithmParameters {
        private CCMParameters ccmParams;

        /* access modifiers changed from: protected */
        public byte[] engineGetEncoded() throws IOException {
            return this.ccmParams.getEncoded();
        }

        /* access modifiers changed from: protected */
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = CCMParameters.getInstance(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AlgorithmParameterSpec class not recognized: ");
            sb.append(algorithmParameterSpec.getClass().getName());
            throw new InvalidParameterSpecException(sb.toString());
        }

        /* access modifiers changed from: protected */
        public void engineInit(byte[] bArr) throws IOException {
            this.ccmParams = CCMParameters.getInstance(bArr);
        }

        /* access modifiers changed from: protected */
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.ccmParams = CCMParameters.getInstance(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        /* access modifiers changed from: protected */
        public String engineToString() {
            return "CCM";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExists() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.toASN1Primitive()) : new IvParameterSpec(this.ccmParams.getNonce());
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.ccmParams.getNonce());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AlgorithmParameterSpec not recognized: ");
            sb.append(cls.getName());
            throw new InvalidParameterSpecException(sb.toString());
        }
    }

    public static class AlgParamsGCM extends BaseAlgorithmParameters {
        private GCMParameters gcmParams;

        /* access modifiers changed from: protected */
        public byte[] engineGetEncoded() throws IOException {
            return this.gcmParams.getEncoded();
        }

        /* access modifiers changed from: protected */
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        /* access modifiers changed from: protected */
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AlgorithmParameterSpec class not recognized: ");
            sb.append(algorithmParameterSpec.getClass().getName());
            throw new InvalidParameterSpecException(sb.toString());
        }

        /* access modifiers changed from: protected */
        public void engineInit(byte[] bArr) throws IOException {
            this.gcmParams = GCMParameters.getInstance(bArr);
        }

        /* access modifiers changed from: protected */
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (isASN1FormatString(str)) {
                this.gcmParams = GCMParameters.getInstance(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        /* access modifiers changed from: protected */
        public String engineToString() {
            return CodePackage.GCM;
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExists() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.toASN1Primitive()) : new IvParameterSpec(this.gcmParams.getNonce());
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.gcmParams.getNonce());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AlgorithmParameterSpec not recognized: ");
            sb.append(cls.getName());
            throw new InvalidParameterSpecException(sb.toString());
        }
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((BlockCipher) new CBCBlockCipher(new AESFastEngine()), 128);
        }
    }

    public static class CCM extends BaseBlockCipher {
        public CCM() {
            super(new CCMBlockCipher(new AESFastEngine()), false, 16);
        }
    }

    public static class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new AESFastEngine(), 128)), 128);
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((BlockCipherProvider) new BlockCipherProvider() {
                public BlockCipher get() {
                    return new AESFastEngine();
                }
            });
        }
    }

    public static class GCM extends BaseBlockCipher {
        public GCM() {
            super((AEADBlockCipher) new GCMBlockCipher(new AESFastEngine()));
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i) {
            super("AES", i, new CipherKeyGenerator());
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
        private static final String PREFIX = AES.class.getName();
        private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            sb.append(PREFIX);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.AES", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Alg.Alias.AlgorithmParameters.");
            sb2.append(NISTObjectIdentifiers.id_aes128_CBC);
            configurableProvider.addAlgorithm(sb2.toString(), "AES");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.AlgorithmParameters.");
            sb3.append(NISTObjectIdentifiers.id_aes192_CBC);
            configurableProvider.addAlgorithm(sb3.toString(), "AES");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.AlgorithmParameters.");
            sb4.append(NISTObjectIdentifiers.id_aes256_CBC);
            configurableProvider.addAlgorithm(sb4.toString(), "AES");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(PREFIX);
            sb5.append("$AlgParamsGCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.GCM", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.AlgorithmParameters.");
            sb6.append(NISTObjectIdentifiers.id_aes128_GCM);
            configurableProvider.addAlgorithm(sb6.toString(), CodePackage.GCM);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.AlgorithmParameters.");
            sb7.append(NISTObjectIdentifiers.id_aes192_GCM);
            configurableProvider.addAlgorithm(sb7.toString(), CodePackage.GCM);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Alg.Alias.AlgorithmParameters.");
            sb8.append(NISTObjectIdentifiers.id_aes256_GCM);
            configurableProvider.addAlgorithm(sb8.toString(), CodePackage.GCM);
            StringBuilder sb9 = new StringBuilder();
            sb9.append(PREFIX);
            sb9.append("$AlgParamsCCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.CCM", sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Alg.Alias.AlgorithmParameters.");
            sb10.append(NISTObjectIdentifiers.id_aes128_CCM);
            configurableProvider.addAlgorithm(sb10.toString(), "CCM");
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Alg.Alias.AlgorithmParameters.");
            sb11.append(NISTObjectIdentifiers.id_aes192_CCM);
            configurableProvider.addAlgorithm(sb11.toString(), "CCM");
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Alg.Alias.AlgorithmParameters.");
            sb12.append(NISTObjectIdentifiers.id_aes256_CCM);
            configurableProvider.addAlgorithm(sb12.toString(), "CCM");
            StringBuilder sb13 = new StringBuilder();
            sb13.append(PREFIX);
            sb13.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.AES", sb13.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb14 = new StringBuilder();
            sb14.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb14.append(NISTObjectIdentifiers.id_aes128_CBC);
            configurableProvider.addAlgorithm(sb14.toString(), "AES");
            StringBuilder sb15 = new StringBuilder();
            sb15.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb15.append(NISTObjectIdentifiers.id_aes192_CBC);
            configurableProvider.addAlgorithm(sb15.toString(), "AES");
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb16.append(NISTObjectIdentifiers.id_aes256_CBC);
            configurableProvider.addAlgorithm(sb16.toString(), "AES");
            StringBuilder sb17 = new StringBuilder();
            sb17.append(PREFIX);
            sb17.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.AES", sb17.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes128_ECB;
            StringBuilder sb18 = new StringBuilder();
            sb18.append(PREFIX);
            sb18.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb18.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_ECB;
            StringBuilder sb19 = new StringBuilder();
            sb19.append(PREFIX);
            sb19.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier2, sb19.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes256_ECB;
            StringBuilder sb20 = new StringBuilder();
            sb20.append(PREFIX);
            sb20.append("$ECB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, sb20.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes128_CBC;
            StringBuilder sb21 = new StringBuilder();
            sb21.append(PREFIX);
            sb21.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier4, sb21.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_aes192_CBC;
            StringBuilder sb22 = new StringBuilder();
            sb22.append(PREFIX);
            sb22.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier5, sb22.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_CBC;
            StringBuilder sb23 = new StringBuilder();
            sb23.append(PREFIX);
            sb23.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, sb23.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_aes128_OFB;
            StringBuilder sb24 = new StringBuilder();
            sb24.append(PREFIX);
            sb24.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier7, sb24.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_aes192_OFB;
            StringBuilder sb25 = new StringBuilder();
            sb25.append(PREFIX);
            sb25.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier8, sb25.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_aes256_OFB;
            StringBuilder sb26 = new StringBuilder();
            sb26.append(PREFIX);
            sb26.append("$OFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier9, sb26.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_aes128_CFB;
            StringBuilder sb27 = new StringBuilder();
            sb27.append(PREFIX);
            sb27.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, sb27.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_aes192_CFB;
            StringBuilder sb28 = new StringBuilder();
            sb28.append(PREFIX);
            sb28.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, sb28.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_aes256_CFB;
            StringBuilder sb29 = new StringBuilder();
            sb29.append(PREFIX);
            sb29.append("$CFB");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, sb29.toString());
            StringBuilder sb30 = new StringBuilder();
            sb30.append(PREFIX);
            sb30.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.AESWRAP", sb30.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes128_wrap, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes192_wrap, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes256_wrap, "AESWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            StringBuilder sb31 = new StringBuilder();
            sb31.append(PREFIX);
            sb31.append("$RFC3211Wrap");
            configurableProvider.addAlgorithm("Cipher.AESRFC3211WRAP", sb31.toString());
            StringBuilder sb32 = new StringBuilder();
            sb32.append(PREFIX);
            sb32.append("$RFC5649Wrap");
            configurableProvider.addAlgorithm("Cipher.AESRFC5649WRAP", sb32.toString());
            StringBuilder sb33 = new StringBuilder();
            sb33.append(PREFIX);
            sb33.append("$AlgParamGenCCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.CCM", sb33.toString());
            StringBuilder sb34 = new StringBuilder();
            sb34.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb34.append(NISTObjectIdentifiers.id_aes128_CCM);
            configurableProvider.addAlgorithm(sb34.toString(), "CCM");
            StringBuilder sb35 = new StringBuilder();
            sb35.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb35.append(NISTObjectIdentifiers.id_aes192_CCM);
            configurableProvider.addAlgorithm(sb35.toString(), "CCM");
            StringBuilder sb36 = new StringBuilder();
            sb36.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb36.append(NISTObjectIdentifiers.id_aes256_CCM);
            configurableProvider.addAlgorithm(sb36.toString(), "CCM");
            StringBuilder sb37 = new StringBuilder();
            sb37.append(PREFIX);
            sb37.append("$CCM");
            configurableProvider.addAlgorithm("Cipher.CCM", sb37.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes128_CCM, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes192_CCM, "CCM");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes256_CCM, "CCM");
            StringBuilder sb38 = new StringBuilder();
            sb38.append(PREFIX);
            sb38.append("$AlgParamGenGCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", sb38.toString());
            StringBuilder sb39 = new StringBuilder();
            sb39.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb39.append(NISTObjectIdentifiers.id_aes128_GCM);
            configurableProvider.addAlgorithm(sb39.toString(), CodePackage.GCM);
            StringBuilder sb40 = new StringBuilder();
            sb40.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb40.append(NISTObjectIdentifiers.id_aes192_GCM);
            configurableProvider.addAlgorithm(sb40.toString(), CodePackage.GCM);
            StringBuilder sb41 = new StringBuilder();
            sb41.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb41.append(NISTObjectIdentifiers.id_aes256_GCM);
            configurableProvider.addAlgorithm(sb41.toString(), CodePackage.GCM);
            StringBuilder sb42 = new StringBuilder();
            sb42.append(PREFIX);
            sb42.append("$GCM");
            configurableProvider.addAlgorithm("Cipher.GCM", sb42.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes128_GCM, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes192_GCM, CodePackage.GCM);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", NISTObjectIdentifiers.id_aes256_GCM, CodePackage.GCM);
            StringBuilder sb43 = new StringBuilder();
            sb43.append(PREFIX);
            sb43.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.AES", sb43.toString());
            StringBuilder sb44 = new StringBuilder();
            sb44.append(PREFIX);
            sb44.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.2", sb44.toString());
            StringBuilder sb45 = new StringBuilder();
            sb45.append(PREFIX);
            sb45.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.22", sb45.toString());
            StringBuilder sb46 = new StringBuilder();
            sb46.append(PREFIX);
            sb46.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.42", sb46.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_aes128_ECB;
            StringBuilder sb47 = new StringBuilder();
            sb47.append(PREFIX);
            sb47.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier13, sb47.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_aes128_CBC;
            StringBuilder sb48 = new StringBuilder();
            sb48.append(PREFIX);
            sb48.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier14, sb48.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.id_aes128_OFB;
            StringBuilder sb49 = new StringBuilder();
            sb49.append(PREFIX);
            sb49.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier15, sb49.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.id_aes128_CFB;
            StringBuilder sb50 = new StringBuilder();
            sb50.append(PREFIX);
            sb50.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier16, sb50.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.id_aes192_ECB;
            StringBuilder sb51 = new StringBuilder();
            sb51.append(PREFIX);
            sb51.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier17, sb51.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NISTObjectIdentifiers.id_aes192_CBC;
            StringBuilder sb52 = new StringBuilder();
            sb52.append(PREFIX);
            sb52.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier18, sb52.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NISTObjectIdentifiers.id_aes192_OFB;
            StringBuilder sb53 = new StringBuilder();
            sb53.append(PREFIX);
            sb53.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier19, sb53.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NISTObjectIdentifiers.id_aes192_CFB;
            StringBuilder sb54 = new StringBuilder();
            sb54.append(PREFIX);
            sb54.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier20, sb54.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NISTObjectIdentifiers.id_aes256_ECB;
            StringBuilder sb55 = new StringBuilder();
            sb55.append(PREFIX);
            sb55.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier21, sb55.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_aes256_CBC;
            StringBuilder sb56 = new StringBuilder();
            sb56.append(PREFIX);
            sb56.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier22, sb56.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NISTObjectIdentifiers.id_aes256_OFB;
            StringBuilder sb57 = new StringBuilder();
            sb57.append(PREFIX);
            sb57.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier23, sb57.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_aes256_CFB;
            StringBuilder sb58 = new StringBuilder();
            sb58.append(PREFIX);
            sb58.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, sb58.toString());
            StringBuilder sb59 = new StringBuilder();
            sb59.append(PREFIX);
            sb59.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.AESWRAP", sb59.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier25 = NISTObjectIdentifiers.id_aes128_wrap;
            StringBuilder sb60 = new StringBuilder();
            sb60.append(PREFIX);
            sb60.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier25, sb60.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier26 = NISTObjectIdentifiers.id_aes192_wrap;
            StringBuilder sb61 = new StringBuilder();
            sb61.append(PREFIX);
            sb61.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier26, sb61.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier27 = NISTObjectIdentifiers.id_aes256_wrap;
            StringBuilder sb62 = new StringBuilder();
            sb62.append(PREFIX);
            sb62.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier27, sb62.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier28 = NISTObjectIdentifiers.id_aes128_GCM;
            StringBuilder sb63 = new StringBuilder();
            sb63.append(PREFIX);
            sb63.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier28, sb63.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier29 = NISTObjectIdentifiers.id_aes192_GCM;
            StringBuilder sb64 = new StringBuilder();
            sb64.append(PREFIX);
            sb64.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier29, sb64.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier30 = NISTObjectIdentifiers.id_aes256_GCM;
            StringBuilder sb65 = new StringBuilder();
            sb65.append(PREFIX);
            sb65.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier30, sb65.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier31 = NISTObjectIdentifiers.id_aes128_CCM;
            StringBuilder sb66 = new StringBuilder();
            sb66.append(PREFIX);
            sb66.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier31, sb66.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier32 = NISTObjectIdentifiers.id_aes192_CCM;
            StringBuilder sb67 = new StringBuilder();
            sb67.append(PREFIX);
            sb67.append("$KeyGen192");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier32, sb67.toString());
            ASN1ObjectIdentifier aSN1ObjectIdentifier33 = NISTObjectIdentifiers.id_aes256_CCM;
            StringBuilder sb68 = new StringBuilder();
            sb68.append(PREFIX);
            sb68.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier33, sb68.toString());
            StringBuilder sb69 = new StringBuilder();
            sb69.append(PREFIX);
            sb69.append("$AESCMAC");
            configurableProvider.addAlgorithm("Mac.AESCMAC", sb69.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc, "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb70 = new StringBuilder();
            sb70.append(PREFIX);
            sb70.append("$PBEWithSHA1AESCBC128");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", sb70.toString());
            StringBuilder sb71 = new StringBuilder();
            sb71.append(PREFIX);
            sb71.append("$PBEWithSHA1AESCBC192");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", sb71.toString());
            StringBuilder sb72 = new StringBuilder();
            sb72.append(PREFIX);
            sb72.append("$PBEWithSHA1AESCBC256");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", sb72.toString());
            StringBuilder sb73 = new StringBuilder();
            sb73.append(PREFIX);
            sb73.append("$PBEWithSHA256AESCBC128");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", sb73.toString());
            StringBuilder sb74 = new StringBuilder();
            sb74.append(PREFIX);
            sb74.append("$PBEWithSHA256AESCBC192");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", sb74.toString());
            StringBuilder sb75 = new StringBuilder();
            sb75.append(PREFIX);
            sb75.append("$PBEWithSHA256AESCBC256");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", sb75.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb76 = new StringBuilder();
            sb76.append(PREFIX);
            sb76.append("$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb76.toString());
            StringBuilder sb77 = new StringBuilder();
            sb77.append(PREFIX);
            sb77.append("$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb77.toString());
            StringBuilder sb78 = new StringBuilder();
            sb78.append(PREFIX);
            sb78.append("$PBEWithAESCBC");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb78.toString());
            StringBuilder sb79 = new StringBuilder();
            sb79.append(PREFIX);
            sb79.append("$PBEWithMD5And128BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb79.toString());
            StringBuilder sb80 = new StringBuilder();
            sb80.append(PREFIX);
            sb80.append("$PBEWithMD5And192BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb80.toString());
            StringBuilder sb81 = new StringBuilder();
            sb81.append(PREFIX);
            sb81.append("$PBEWithMD5And256BitAESCBCOpenSSL");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb81.toString());
            StringBuilder sb82 = new StringBuilder();
            sb82.append(PREFIX);
            sb82.append("$PBEWithSHAAnd128BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", sb82.toString());
            StringBuilder sb83 = new StringBuilder();
            sb83.append(PREFIX);
            sb83.append("$PBEWithSHAAnd192BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", sb83.toString());
            StringBuilder sb84 = new StringBuilder();
            sb84.append(PREFIX);
            sb84.append("$PBEWithSHAAnd256BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", sb84.toString());
            StringBuilder sb85 = new StringBuilder();
            sb85.append(PREFIX);
            sb85.append("$PBEWithSHA256And128BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", sb85.toString());
            StringBuilder sb86 = new StringBuilder();
            sb86.append(PREFIX);
            sb86.append("$PBEWithSHA256And192BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", sb86.toString());
            StringBuilder sb87 = new StringBuilder();
            sb87.append(PREFIX);
            sb87.append("$PBEWithSHA256And256BitAESBC");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", sb87.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            StringBuilder sb88 = new StringBuilder();
            sb88.append("Alg.Alias.AlgorithmParameters.");
            sb88.append(BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc.getId());
            configurableProvider.addAlgorithm(sb88.toString(), "PKCS12PBE");
            StringBuilder sb89 = new StringBuilder();
            sb89.append("Alg.Alias.AlgorithmParameters.");
            sb89.append(BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc.getId());
            configurableProvider.addAlgorithm(sb89.toString(), "PKCS12PBE");
            StringBuilder sb90 = new StringBuilder();
            sb90.append("Alg.Alias.AlgorithmParameters.");
            sb90.append(BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc.getId());
            configurableProvider.addAlgorithm(sb90.toString(), "PKCS12PBE");
            StringBuilder sb91 = new StringBuilder();
            sb91.append("Alg.Alias.AlgorithmParameters.");
            sb91.append(BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc.getId());
            configurableProvider.addAlgorithm(sb91.toString(), "PKCS12PBE");
            StringBuilder sb92 = new StringBuilder();
            sb92.append("Alg.Alias.AlgorithmParameters.");
            sb92.append(BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc.getId());
            configurableProvider.addAlgorithm(sb92.toString(), "PKCS12PBE");
            StringBuilder sb93 = new StringBuilder();
            sb93.append("Alg.Alias.AlgorithmParameters.");
            sb93.append(BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc.getId());
            configurableProvider.addAlgorithm(sb93.toString(), "PKCS12PBE");
            StringBuilder sb94 = new StringBuilder();
            sb94.append(PREFIX);
            sb94.append("$AESGMAC");
            String obj = sb94.toString();
            StringBuilder sb95 = new StringBuilder();
            sb95.append(PREFIX);
            sb95.append("$KeyGen128");
            addGMacAlgorithm(configurableProvider, "AES", obj, sb95.toString());
            StringBuilder sb96 = new StringBuilder();
            sb96.append(PREFIX);
            sb96.append("$Poly1305");
            String obj2 = sb96.toString();
            StringBuilder sb97 = new StringBuilder();
            sb97.append(PREFIX);
            sb97.append("$Poly1305KeyGen");
            addPoly1305Algorithm(configurableProvider, "AES", obj2, sb97.toString());
        }
    }

    public static class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new AESFastEngine(), 128)), 128);
        }
    }

    public static class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super((BlockCipher) new CBCBlockCipher(new AESFastEngine()));
        }
    }

    public static class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", (ASN1ObjectIdentifier) null, true, 3, 0, 128, 128);
        }
    }

    public static class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", (ASN1ObjectIdentifier) null, true, 3, 0, 192, 128);
        }
    }

    public static class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", (ASN1ObjectIdentifier) null, true, 3, 0, 256, 128);
        }
    }

    public static class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(new CBCBlockCipher(new AESFastEngine()), 2, 1, 128, 16);
        }
    }

    public static class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(new CBCBlockCipher(new AESFastEngine()), 2, 1, 192, 16);
        }
    }

    public static class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(new CBCBlockCipher(new AESFastEngine()), 2, 1, 256, 16);
        }
    }

    public static class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(new CBCBlockCipher(new AESFastEngine()), 2, 4, 128, 16);
        }
    }

    public static class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(new CBCBlockCipher(new AESFastEngine()), 2, 4, 192, 16);
        }
    }

    public static class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(new CBCBlockCipher(new AESFastEngine()), 2, 4, 256, 16);
        }
    }

    public static class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", (ASN1ObjectIdentifier) null, true, 2, 4, 128, 128);
        }
    }

    public static class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", (ASN1ObjectIdentifier) null, true, 2, 4, 192, 128);
        }
    }

    public static class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", (ASN1ObjectIdentifier) null, true, 2, 4, 256, 128);
        }
    }

    public static class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", (ASN1ObjectIdentifier) null, true, 2, 1, 128, 128);
        }
    }

    public static class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", (ASN1ObjectIdentifier) null, true, 2, 1, 192, 128);
        }
    }

    public static class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", (ASN1ObjectIdentifier) null, true, 2, 1, 256, 128);
        }
    }

    public static class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new AESFastEngine()));
        }
    }

    public static class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new Poly1305KeyGenerator());
        }
    }

    public static class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new AESFastEngine()), 16);
        }
    }

    public static class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new RFC5649WrapEngine(new AESFastEngine()));
        }
    }

    public static class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new AESWrapEngine());
        }
    }

    private AES() {
    }

    private static Class lookup(String str) {
        try {
            return AES.class.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
