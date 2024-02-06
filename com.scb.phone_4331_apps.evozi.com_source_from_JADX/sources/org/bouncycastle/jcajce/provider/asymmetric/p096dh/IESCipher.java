package org.bouncycastle.jcajce.provider.asymmetric.p096dh;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.KeyEncoder;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.agreement.DHBasicAgreement;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.IESEngine;
import org.bouncycastle.crypto.engines.OldIESEngine;
import org.bouncycastle.crypto.generators.DHKeyPairGenerator;
import org.bouncycastle.crypto.generators.EphemeralKeyPairGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHKeyParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.parsers.DHIESPublicKeyParser;
import org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.IESKey;
import org.bouncycastle.jce.spec.IESParameterSpec;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

/* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher */
public class IESCipher extends CipherSpi {
    private ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    private boolean dhaesMode = false;
    private IESEngine engine;
    private AlgorithmParameters engineParam = null;
    private IESParameterSpec engineSpec = null;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private AsymmetricKeyParameter key;
    private AsymmetricKeyParameter otherKeyParameter = null;
    private SecureRandom random;
    private int state = -1;

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IES */
    public static class IES extends IESCipher {
        public IES() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest())));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithAES */
    public static class IESwithAES extends IESCipher {
        public IESwithAES() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest()), new PaddedBufferedBlockCipher(new AESEngine())));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$IESwithDESede */
    public static class IESwithDESede extends IESCipher {
        public IESwithDESede() {
            super(new IESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest()), new PaddedBufferedBlockCipher(new DESedeEngine())));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$OldIES */
    public static class OldIES extends IESCipher {
        public OldIES() {
            super(new OldIESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest())));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$OldIESwithAES */
    public static class OldIESwithAES extends OldIESwithCipher {
        public OldIESwithAES() {
            super(new AESEngine());
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$OldIESwithCipher */
    public static class OldIESwithCipher extends IESCipher {
        public OldIESwithCipher(BlockCipher blockCipher) {
            super(new OldIESEngine(new DHBasicAgreement(), new KDF2BytesGenerator(new SHA1Digest()), new HMac(new SHA1Digest()), new PaddedBufferedBlockCipher(blockCipher)));
        }
    }

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher$OldIESwithDESede */
    public static class OldIESwithDESede extends OldIESwithCipher {
        public OldIESwithDESede() {
            super(new DESedeEngine());
        }
    }

    public IESCipher(IESEngine iESEngine) {
        this.engine = iESEngine;
    }

    public IESCipher(OldIESEngine oldIESEngine) {
        this.engine = oldIESEngine;
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException, IllegalBlockSizeException, BadPaddingException {
        byte[] engineDoFinal = engineDoFinal(bArr, i, i2);
        System.arraycopy(engineDoFinal, 0, bArr2, i3, engineDoFinal.length);
        return engineDoFinal.length;
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (i2 != 0) {
            this.buffer.write(bArr, i, i2);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        IESWithCipherParameters iESWithCipherParameters = new IESWithCipherParameters(this.engineSpec.getDerivationV(), this.engineSpec.getEncodingV(), this.engineSpec.getMacKeySize(), this.engineSpec.getCipherKeySize());
        DHParameters parameters = ((DHKeyParameters) this.key).getParameters();
        AsymmetricKeyParameter asymmetricKeyParameter = this.otherKeyParameter;
        if (asymmetricKeyParameter != null) {
            try {
                if (this.state != 1) {
                    if (this.state != 3) {
                        this.engine.init(false, this.key, asymmetricKeyParameter, iESWithCipherParameters);
                        return this.engine.processBlock(byteArray, 0, byteArray.length);
                    }
                }
                this.engine.init(true, this.otherKeyParameter, this.key, iESWithCipherParameters);
                return this.engine.processBlock(byteArray, 0, byteArray.length);
            } catch (Exception e) {
                throw new BadPaddingException(e.getMessage());
            }
        } else {
            int i3 = this.state;
            if (i3 == 1 || i3 == 3) {
                DHKeyPairGenerator dHKeyPairGenerator = new DHKeyPairGenerator();
                dHKeyPairGenerator.init(new DHKeyGenerationParameters(this.random, parameters));
                try {
                    this.engine.init(this.key, (CipherParameters) iESWithCipherParameters, new EphemeralKeyPairGenerator(dHKeyPairGenerator, new KeyEncoder() {
                        public byte[] getEncoded(AsymmetricKeyParameter asymmetricKeyParameter) {
                            int bitLength = (((DHKeyParameters) asymmetricKeyParameter).getParameters().getP().bitLength() + 7) / 8;
                            byte[] bArr = new byte[bitLength];
                            byte[] asUnsignedByteArray = BigIntegers.asUnsignedByteArray(((DHPublicKeyParameters) asymmetricKeyParameter).getY());
                            if (asUnsignedByteArray.length <= bitLength) {
                                System.arraycopy(asUnsignedByteArray, 0, bArr, bitLength - asUnsignedByteArray.length, asUnsignedByteArray.length);
                                return bArr;
                            }
                            throw new IllegalArgumentException("Senders's public key longer than expected.");
                        }
                    }));
                    return this.engine.processBlock(byteArray, 0, byteArray.length);
                } catch (Exception e2) {
                    throw new BadPaddingException(e2.getMessage());
                }
            } else if (i3 == 2 || i3 == 4) {
                try {
                    this.engine.init(this.key, (CipherParameters) iESWithCipherParameters, (KeyParser) new DHIESPublicKeyParser(((DHKeyParameters) this.key).getParameters()));
                    return this.engine.processBlock(byteArray, 0, byteArray.length);
                } catch (InvalidCipherTextException e3) {
                    throw new BadPaddingException(e3.getMessage());
                }
            } else {
                throw new IllegalStateException("IESCipher not initialised");
            }
        }
    }

    public int engineGetBlockSize() {
        if (this.engine.getCipher() != null) {
            return this.engine.getCipher().getBlockSize();
        }
        return 0;
    }

    public byte[] engineGetIV() {
        return null;
    }

    public int engineGetKeySize(Key key2) {
        if (key2 instanceof DHKey) {
            return ((DHKey) key2).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    public int engineGetOutputSize(int i) {
        int i2;
        BufferedBlockCipher bufferedBlockCipher;
        if (this.key != null) {
            int macSize = this.engine.getMac().getMacSize();
            int bitLength = this.otherKeyParameter == null ? (((((DHKeyParameters) this.key).getParameters().getP().bitLength() + 7) << 1) / 8) + 1 : 0;
            if (this.engine.getCipher() != null) {
                int i3 = this.state;
                if (i3 == 1 || i3 == 3) {
                    bufferedBlockCipher = this.engine.getCipher();
                } else if (i3 == 2 || i3 == 4) {
                    bufferedBlockCipher = this.engine.getCipher();
                    i = (i - macSize) - bitLength;
                } else {
                    throw new IllegalStateException("cipher not initialised");
                }
                i = bufferedBlockCipher.getOutputSize(i);
            }
            int i4 = this.state;
            if (i4 == 1 || i4 == 3) {
                i2 = this.buffer.size() + macSize + bitLength;
            } else if (i4 == 2 || i4 == 4) {
                i2 = (this.buffer.size() - macSize) - bitLength;
            } else {
                throw new IllegalStateException("IESCipher not initialised");
            }
            return i2 + i;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters("IES");
                this.engineParam = createAlgorithmParameters;
                createAlgorithmParameters.init(this.engineSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParam;
    }

    public void engineInit(int i, Key key2, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            try {
                algorithmParameterSpec = algorithmParameters.getParameterSpec(IESParameterSpec.class);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("cannot recognise parameters: ");
                sb.append(e.toString());
                throw new InvalidAlgorithmParameterException(sb.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i, key2, algorithmParameterSpec, secureRandom);
    }

    public void engineInit(int i, Key key2, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key2, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            throw new IllegalArgumentException("can't handle supplied parameter spec");
        }
    }

    public void engineInit(int i, Key key2, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException, InvalidKeyException {
        IESParameterSpec iESParameterSpec;
        AsymmetricKeyParameter asymmetricKeyParameter;
        PrivateKey privateKey;
        if (algorithmParameterSpec == null) {
            iESParameterSpec = IESUtil.guessParameterSpec(this.engine.getCipher());
        } else if (algorithmParameterSpec instanceof IESParameterSpec) {
            iESParameterSpec = (IESParameterSpec) algorithmParameterSpec;
        } else {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        }
        this.engineSpec = iESParameterSpec;
        if (i == 1 || i == 3) {
            if (key2 instanceof DHPublicKey) {
                asymmetricKeyParameter = DHUtil.generatePublicKeyParameter((PublicKey) key2);
            } else if (key2 instanceof IESKey) {
                IESKey iESKey = (IESKey) key2;
                this.key = DHUtil.generatePublicKeyParameter(iESKey.getPublic());
                this.otherKeyParameter = DHUtil.generatePrivateKeyParameter(iESKey.getPrivate());
                this.random = secureRandom;
                this.state = i;
                this.buffer.reset();
            } else {
                throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
            }
        } else if (i == 2 || i == 4) {
            if (key2 instanceof DHPrivateKey) {
                privateKey = (PrivateKey) key2;
            } else if (key2 instanceof IESKey) {
                IESKey iESKey2 = (IESKey) key2;
                this.otherKeyParameter = DHUtil.generatePublicKeyParameter(iESKey2.getPublic());
                privateKey = iESKey2.getPrivate();
            } else {
                throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
            }
            asymmetricKeyParameter = DHUtil.generatePrivateKeyParameter(privateKey);
        } else {
            throw new InvalidKeyException("must be passed EC key");
        }
        this.key = asymmetricKeyParameter;
        this.random = secureRandom;
        this.state = i;
        this.buffer.reset();
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        boolean z;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NONE")) {
            z = false;
        } else if (upperCase.equals("DHAES")) {
            z = true;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("can't support mode ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        this.dhaesMode = z;
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        String upperCase = Strings.toUpperCase(str);
        if (!upperCase.equals("NOPADDING") && !upperCase.equals("PKCS5PADDING") && !upperCase.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        this.buffer.write(bArr, i, i2);
        return 0;
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        this.buffer.write(bArr, i, i2);
        return null;
    }
}
