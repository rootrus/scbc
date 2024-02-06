package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Strings;

public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs = {IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
    private BufferedBlockCipher cipher;
    private AlgorithmParameters engineParams = null;
    private int ivLength = 0;
    private ParametersWithIV ivParam;
    private int pbeHash = 1;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType = 2;

    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new CBCBlockCipher(new TwofishEngine()), 3, 1, 256, 128);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 3, 1, 192, 64);
        }
    }

    protected BrokenJCEBlockCipher(BlockCipher blockCipher) {
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
    }

    protected BrokenJCEBlockCipher(BlockCipher blockCipher, int i, int i2, int i3, int i4) {
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        this.pbeType = i;
        this.pbeHash = i2;
        this.pbeKeySize = i3;
        this.pbeIvSize = i4;
    }

    /* access modifiers changed from: protected */
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException {
        int processBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, i3) : 0;
        try {
            return processBytes + this.cipher.doFinal(bArr2, i3 + processBytes);
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        } catch (InvalidCipherTextException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        byte[] bArr2 = new byte[engineGetOutputSize(i2)];
        int processBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        } catch (InvalidCipherTextException e2) {
            throw new BadPaddingException(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public int engineGetBlockSize() {
        return this.cipher.getBlockSize();
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetIV() {
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    /* access modifiers changed from: protected */
    public int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.ivParam != null) {
            String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
                this.engineParams = instance;
                instance.init(this.ivParam.getIV());
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i2 == clsArr.length) {
                    break;
                }
                try {
                    algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i2]);
                    break;
                } catch (Exception unused) {
                    i2++;
                }
            }
            if (algorithmParameterSpec == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("can't handle parameter ");
                sb.append(algorithmParameters.toString());
                throw new InvalidAlgorithmParameterException(sb.toString());
            }
        }
        this.engineParams = algorithmParameters;
        engineInit(i, key, algorithmParameterSpec, secureRandom);
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r8.pbeIvSize != 0) goto L_0x00b5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ec  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r9, java.security.Key r10, java.security.spec.AlgorithmParameterSpec r11, java.security.SecureRandom r12) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r8 = this;
            boolean r0 = r10 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey
            if (r0 == 0) goto L_0x0024
            r1 = r10
            org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey r1 = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) r1
            int r3 = r8.pbeType
            int r4 = r8.pbeHash
            org.bouncycastle.crypto.BufferedBlockCipher r10 = r8.cipher
            org.bouncycastle.crypto.BlockCipher r10 = r10.getUnderlyingCipher()
            java.lang.String r5 = r10.getAlgorithmName()
            int r6 = r8.pbeKeySize
            int r7 = r8.pbeIvSize
            r2 = r11
            org.bouncycastle.crypto.CipherParameters r10 = org.bouncycastle.jce.provider.BrokenPBE.Util.makePBEParameters(r1, r2, r3, r4, r5, r6, r7)
            int r11 = r8.pbeIvSize
            if (r11 == 0) goto L_0x00ba
            goto L_0x00b5
        L_0x0024:
            if (r11 != 0) goto L_0x0032
            org.bouncycastle.crypto.params.KeyParameter r11 = new org.bouncycastle.crypto.params.KeyParameter
            byte[] r10 = r10.getEncoded()
            r11.<init>(r10)
        L_0x002f:
            r10 = r11
            goto L_0x00ba
        L_0x0032:
            boolean r0 = r11 instanceof javax.crypto.spec.IvParameterSpec
            if (r0 == 0) goto L_0x005e
            int r0 = r8.ivLength
            if (r0 == 0) goto L_0x0054
            org.bouncycastle.crypto.params.ParametersWithIV r0 = new org.bouncycastle.crypto.params.ParametersWithIV
            org.bouncycastle.crypto.params.KeyParameter r1 = new org.bouncycastle.crypto.params.KeyParameter
            byte[] r10 = r10.getEncoded()
            r1.<init>(r10)
            javax.crypto.spec.IvParameterSpec r11 = (javax.crypto.spec.IvParameterSpec) r11
            byte[] r10 = r11.getIV()
            r0.<init>(r1, r10)
            r10 = r0
            org.bouncycastle.crypto.params.ParametersWithIV r10 = (org.bouncycastle.crypto.params.ParametersWithIV) r10
            r8.ivParam = r10
            goto L_0x0085
        L_0x0054:
            org.bouncycastle.crypto.params.KeyParameter r11 = new org.bouncycastle.crypto.params.KeyParameter
            byte[] r10 = r10.getEncoded()
            r11.<init>(r10)
            goto L_0x002f
        L_0x005e:
            boolean r0 = r11 instanceof javax.crypto.spec.RC2ParameterSpec
            if (r0 == 0) goto L_0x0087
            javax.crypto.spec.RC2ParameterSpec r11 = (javax.crypto.spec.RC2ParameterSpec) r11
            org.bouncycastle.crypto.params.RC2Parameters r0 = new org.bouncycastle.crypto.params.RC2Parameters
            byte[] r10 = r10.getEncoded()
            int r1 = r11.getEffectiveKeyBits()
            r0.<init>(r10, r1)
            byte[] r10 = r11.getIV()
            if (r10 == 0) goto L_0x0085
            int r10 = r8.ivLength
            if (r10 == 0) goto L_0x0085
            org.bouncycastle.crypto.params.ParametersWithIV r10 = new org.bouncycastle.crypto.params.ParametersWithIV
            byte[] r11 = r11.getIV()
            r10.<init>(r0, r11)
            goto L_0x00b5
        L_0x0085:
            r10 = r0
            goto L_0x00ba
        L_0x0087:
            boolean r0 = r11 instanceof javax.crypto.spec.RC5ParameterSpec
            if (r0 == 0) goto L_0x0111
            javax.crypto.spec.RC5ParameterSpec r11 = (javax.crypto.spec.RC5ParameterSpec) r11
            org.bouncycastle.crypto.params.RC5Parameters r0 = new org.bouncycastle.crypto.params.RC5Parameters
            byte[] r10 = r10.getEncoded()
            int r1 = r11.getRounds()
            r0.<init>(r10, r1)
            int r10 = r11.getWordSize()
            r1 = 32
            if (r10 != r1) goto L_0x0109
            byte[] r10 = r11.getIV()
            if (r10 == 0) goto L_0x0085
            int r10 = r8.ivLength
            if (r10 == 0) goto L_0x0085
            org.bouncycastle.crypto.params.ParametersWithIV r10 = new org.bouncycastle.crypto.params.ParametersWithIV
            byte[] r11 = r11.getIV()
            r10.<init>(r0, r11)
        L_0x00b5:
            r11 = r10
            org.bouncycastle.crypto.params.ParametersWithIV r11 = (org.bouncycastle.crypto.params.ParametersWithIV) r11
            r8.ivParam = r11
        L_0x00ba:
            int r11 = r8.ivLength
            r0 = 3
            r1 = 1
            if (r11 == 0) goto L_0x00ea
            boolean r11 = r10 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r11 != 0) goto L_0x00ea
            if (r12 != 0) goto L_0x00cb
            java.security.SecureRandom r12 = new java.security.SecureRandom
            r12.<init>()
        L_0x00cb:
            if (r9 == r1) goto L_0x00d8
            if (r9 != r0) goto L_0x00d0
            goto L_0x00d8
        L_0x00d0:
            java.security.InvalidAlgorithmParameterException r9 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r10 = "no IV set when one expected"
            r9.<init>(r10)
            throw r9
        L_0x00d8:
            int r11 = r8.ivLength
            byte[] r11 = new byte[r11]
            r12.nextBytes(r11)
            org.bouncycastle.crypto.params.ParametersWithIV r12 = new org.bouncycastle.crypto.params.ParametersWithIV
            r12.<init>(r10, r11)
            r10 = r12
            org.bouncycastle.crypto.params.ParametersWithIV r10 = (org.bouncycastle.crypto.params.ParametersWithIV) r10
            r8.ivParam = r10
            r10 = r12
        L_0x00ea:
            if (r9 == r1) goto L_0x0103
            r11 = 2
            if (r9 == r11) goto L_0x00fc
            if (r9 == r0) goto L_0x0103
            r11 = 4
            if (r9 == r11) goto L_0x00fc
            java.io.PrintStream r9 = java.lang.System.out
            java.lang.String r10 = "eeek!"
            r9.println(r10)
            return
        L_0x00fc:
            org.bouncycastle.crypto.BufferedBlockCipher r9 = r8.cipher
            r11 = 0
            r9.init(r11, r10)
            return
        L_0x0103:
            org.bouncycastle.crypto.BufferedBlockCipher r9 = r8.cipher
            r9.init(r1, r10)
            return
        L_0x0109:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "can only accept RC5 word size 32 (at the moment...)"
            r9.<init>(r10)
            throw r9
        L_0x0111:
            java.security.InvalidAlgorithmParameterException r9 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r10 = "unknown parameter type."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.BrokenJCEBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    /* access modifiers changed from: protected */
    public void engineSetMode(String str) {
        PaddedBufferedBlockCipher paddedBufferedBlockCipher;
        PaddedBufferedBlockCipher paddedBufferedBlockCipher2;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(this.cipher.getUnderlyingCipher());
        } else if (upperCase.equals("CBC")) {
            this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
            paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(this.cipher.getUnderlyingCipher()));
        } else {
            if (upperCase.startsWith("OFB")) {
                this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
                if (upperCase.length() != 3) {
                    paddedBufferedBlockCipher2 = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.cipher.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
                } else {
                    paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.cipher.getUnderlyingCipher(), this.cipher.getBlockSize() << 3));
                }
            } else if (upperCase.startsWith("CFB")) {
                this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
                if (upperCase.length() != 3) {
                    paddedBufferedBlockCipher2 = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.cipher.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
                } else {
                    paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.cipher.getUnderlyingCipher(), this.cipher.getBlockSize() << 3));
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("can't support mode ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            this.cipher = paddedBufferedBlockCipher2;
            return;
        }
        this.cipher = paddedBufferedBlockCipher;
    }

    /* access modifiers changed from: protected */
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        BufferedBlockCipher bufferedBlockCipher;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            bufferedBlockCipher = new BufferedBlockCipher(this.cipher.getUnderlyingCipher());
        } else if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING") || upperCase.equals("ISO10126PADDING")) {
            bufferedBlockCipher = new PaddedBufferedBlockCipher(this.cipher.getUnderlyingCipher());
        } else if (upperCase.equals("WITHCTS")) {
            bufferedBlockCipher = new CTSBlockCipher(this.cipher.getUnderlyingCipher());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Padding ");
            sb.append(str);
            sb.append(" unknown.");
            throw new NoSuchPaddingException(sb.toString());
        }
        this.cipher = bufferedBlockCipher;
    }

    /* access modifiers changed from: protected */
    public Key engineUnwrap(byte[] bArr, String str, int i) throws InvalidKeyException {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            try {
                KeyFactory instance = KeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME);
                if (i == 1) {
                    return instance.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i == 2) {
                    return instance.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown key type ");
                sb.append(i);
                throw new InvalidKeyException(sb.toString());
            } catch (NoSuchProviderException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown key type ");
                sb2.append(e.getMessage());
                throw new InvalidKeyException(sb2.toString());
            } catch (NoSuchAlgorithmException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown key type ");
                sb3.append(e2.getMessage());
                throw new InvalidKeyException(sb3.toString());
            } catch (InvalidKeySpecException e3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unknown key type ");
                sb4.append(e3.getMessage());
                throw new InvalidKeyException(sb4.toString());
            }
        } catch (BadPaddingException e4) {
            throw new InvalidKeyException(e4.getMessage());
        } catch (IllegalBlockSizeException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
    }

    /* access modifiers changed from: protected */
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize > 0) {
            byte[] bArr2 = new byte[updateOutputSize];
            this.cipher.processBytes(bArr, i, i2, bArr2, 0);
            return bArr2;
        }
        this.cipher.processBytes(bArr, i, i2, (byte[]) null, 0);
        return null;
    }

    /* access modifiers changed from: protected */
    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                return engineDoFinal(encoded, 0, encoded.length);
            } catch (BadPaddingException e) {
                throw new IllegalBlockSizeException(e.getMessage());
            }
        } else {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
    }
}
