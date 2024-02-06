package org.bouncycastle.jcajce.provider.symmetric.util;

import com.google.android.gms.stats.CodePackage;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.EAXBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.GOFBBlockCipher;
import org.bouncycastle.crypto.modes.OCBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.PGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.ISO10126d2Padding;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.paddings.TBCPadding;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.util.Strings;

public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final Class gcmSpecClass = lookup("javax.crypto.spec.GCMParameterSpec");
    private AEADParameters aeadParams;
    private Class[] availableSpecs = {RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv = true;
    private int ivLength = 0;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String modeName = null;
    private boolean padded;
    private String pbeAlgorithm = null;
    private PBEParameterSpec pbeSpec = null;
    private int scheme = -1;

    static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private AEADBlockCipher cipher;

        static {
            Class access$000 = BaseBlockCipher.lookup("javax.crypto.AEADBadTagException");
            aeadBadTagConstructor = access$000 != null ? findExceptionConstructor(access$000) : null;
        }

        AEADGenericBlockCipher(AEADBlockCipher aEADBlockCipher) {
            this.cipher = aEADBlockCipher;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(new Class[]{String.class});
            } catch (Exception unused) {
                return null;
            }
        }

        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    BadPaddingException badPaddingException = null;
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(new Object[]{e.getMessage()});
                    } catch (Exception unused) {
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z, cipherParameters);
        }

        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.processByte(b, bArr, i);
        }

        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.processAADBytes(bArr, i, i2);
        }

        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private BufferedBlockCipher cipher;

        BufferedGenericBlockCipher(BlockCipher blockCipher) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
            this.cipher = bufferedBlockCipher;
        }

        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.cipher.init(z, cipherParameters);
        }

        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.processByte(b, bArr, i);
        }

        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof CTSBlockCipher);
        }
    }

    interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException;

        String getAlgorithmName();

        int getOutputSize(int i);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException;

        int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    public BaseBlockCipher(BlockCipher blockCipher) {
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    public BaseBlockCipher(BlockCipher blockCipher, int i) {
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(BlockCipher blockCipher, int i, int i2, int i3, int i4) {
        this.baseEngine = blockCipher;
        this.scheme = i;
        this.digest = i2;
        this.keySizeInBits = i3;
        this.ivLength = i4;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    public BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i) {
        this.baseEngine = bufferedBlockCipher.getUnderlyingCipher();
        this.cipher = new BufferedGenericBlockCipher(bufferedBlockCipher);
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher) {
        BlockCipher underlyingCipher = aEADBlockCipher.getUnderlyingCipher();
        this.baseEngine = underlyingCipher;
        this.ivLength = underlyingCipher.getBlockSize();
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher, boolean z, int i) {
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: org.bouncycastle.crypto.params.ParametersWithSBox} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: org.bouncycastle.crypto.params.ParametersWithIV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: org.bouncycastle.crypto.params.ParametersWithSBox} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: org.bouncycastle.crypto.params.ParametersWithSBox} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: org.bouncycastle.crypto.params.ParametersWithSBox} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.bouncycastle.crypto.CipherParameters adjustParameters(java.security.spec.AlgorithmParameterSpec r4, org.bouncycastle.crypto.CipherParameters r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r0 == 0) goto L_0x0042
            r0 = r5
            org.bouncycastle.crypto.params.ParametersWithIV r0 = (org.bouncycastle.crypto.params.ParametersWithIV) r0
            org.bouncycastle.crypto.CipherParameters r0 = r0.getParameters()
            boolean r1 = r4 instanceof javax.crypto.spec.IvParameterSpec
            if (r1 == 0) goto L_0x001b
            org.bouncycastle.crypto.params.ParametersWithIV r5 = new org.bouncycastle.crypto.params.ParametersWithIV
            javax.crypto.spec.IvParameterSpec r4 = (javax.crypto.spec.IvParameterSpec) r4
            byte[] r4 = r4.getIV()
            r5.<init>(r0, r4)
            goto L_0x003d
        L_0x001b:
            boolean r1 = r4 instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec
            if (r1 == 0) goto L_0x0077
            org.bouncycastle.jcajce.spec.GOST28147ParameterSpec r4 = (org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) r4
            org.bouncycastle.crypto.params.ParametersWithSBox r1 = new org.bouncycastle.crypto.params.ParametersWithSBox
            byte[] r2 = r4.getSbox()
            r1.<init>(r5, r2)
            byte[] r5 = r4.getIV()
            if (r5 == 0) goto L_0x0040
            int r5 = r3.ivLength
            if (r5 == 0) goto L_0x0040
            org.bouncycastle.crypto.params.ParametersWithIV r5 = new org.bouncycastle.crypto.params.ParametersWithIV
            byte[] r4 = r4.getIV()
            r5.<init>(r0, r4)
        L_0x003d:
            r3.ivParam = r5
            goto L_0x0077
        L_0x0040:
            r5 = r1
            goto L_0x0077
        L_0x0042:
            boolean r0 = r4 instanceof javax.crypto.spec.IvParameterSpec
            if (r0 == 0) goto L_0x0055
            org.bouncycastle.crypto.params.ParametersWithIV r0 = new org.bouncycastle.crypto.params.ParametersWithIV
            javax.crypto.spec.IvParameterSpec r4 = (javax.crypto.spec.IvParameterSpec) r4
            byte[] r4 = r4.getIV()
            r0.<init>(r5, r4)
            r3.ivParam = r0
        L_0x0053:
            r5 = r0
            goto L_0x0077
        L_0x0055:
            boolean r0 = r4 instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec
            if (r0 == 0) goto L_0x0077
            org.bouncycastle.jcajce.spec.GOST28147ParameterSpec r4 = (org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) r4
            org.bouncycastle.crypto.params.ParametersWithSBox r0 = new org.bouncycastle.crypto.params.ParametersWithSBox
            byte[] r1 = r4.getSbox()
            r0.<init>(r5, r1)
            byte[] r5 = r4.getIV()
            if (r5 == 0) goto L_0x0053
            int r5 = r3.ivLength
            if (r5 == 0) goto L_0x0053
            org.bouncycastle.crypto.params.ParametersWithIV r5 = new org.bouncycastle.crypto.params.ParametersWithIV
            byte[] r4 = r4.getIV()
            r5.<init>(r0, r4)
        L_0x0077:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.adjustParameters(java.security.spec.AlgorithmParameterSpec, org.bouncycastle.crypto.CipherParameters):org.bouncycastle.crypto.CipherParameters");
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || CodePackage.GCM.equals(str) || "OCB".equals(str);
    }

    /* access modifiers changed from: private */
    public static Class lookup(String str) {
        try {
            return BaseBlockCipher.class.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int i4;
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (i2 != 0) {
                try {
                    i4 = this.cipher.processBytes(bArr, i, i2, bArr2, i3);
                } catch (OutputLengthException e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (DataLengthException e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            } else {
                i4 = 0;
            }
            return i4 + this.cipher.doFinal(bArr2, i3 + i4);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    /* access modifiers changed from: protected */
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        int engineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public int engineGetBlockSize() {
        return this.baseEngine.getBlockSize();
    }

    /* access modifiers changed from: protected */
    public byte[] engineGetIV() {
        AEADParameters aEADParameters = this.aeadParams;
        if (aEADParameters != null) {
            return aEADParameters.getNonce();
        }
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length << 3;
    }

    /* access modifiers changed from: protected */
    public int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    /* access modifiers changed from: protected */
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    this.engineParams = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    this.engineParams = createParametersInstance(algorithmName);
                    this.engineParams.init(this.ivParam.getIV());
                } catch (Exception e) {
                    throw new RuntimeException(e.toString());
                }
            } else if (this.aeadParams != null) {
                try {
                    this.engineParams = createParametersInstance(CodePackage.GCM);
                    this.engineParams.init(new GCMParameters(this.aeadParams.getNonce(), this.aeadParams.getMacSize() / 8).getEncoded());
                } catch (Exception e2) {
                    throw new RuntimeException(e2.toString());
                }
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
                } else if (clsArr[i2] != null) {
                    try {
                        algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i2]);
                        break;
                    } catch (Exception unused) {
                    }
                } else {
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
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    /* access modifiers changed from: protected */
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        if ((r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV) != false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        if ((r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV) != false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        if ((r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV) != false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01dc, code lost:
        if ((r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV) != false) goto L_0x01de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0424  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r22, java.security.Key r23, java.security.spec.AlgorithmParameterSpec r24, java.security.SecureRandom r25) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = 0
            r1.pbeSpec = r5
            r1.pbeAlgorithm = r5
            r1.engineParams = r5
            r1.aeadParams = r5
            boolean r6 = r2 instanceof javax.crypto.SecretKey
            if (r6 == 0) goto L_0x0466
            java.lang.String r6 = "RC5-64"
            if (r3 != 0) goto L_0x0030
            org.bouncycastle.crypto.BlockCipher r7 = r1.baseEngine
            java.lang.String r7 = r7.getAlgorithmName()
            boolean r7 = r7.startsWith(r6)
            if (r7 != 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "RC5 requires an RC5ParametersSpec to be passed in."
            r0.<init>(r2)
            throw r0
        L_0x0030:
            int r7 = r1.scheme
            r8 = 4
            java.lang.String r9 = "Algorithm requires a PBE key"
            r10 = 2
            r11 = 1
            r12 = 3
            if (r7 == r10) goto L_0x0142
            boolean r13 = r2 instanceof org.bouncycastle.jcajce.PKCS12Key
            if (r13 != 0) goto L_0x0142
            boolean r13 = r2 instanceof org.bouncycastle.jcajce.PBKDF1Key
            if (r13 == 0) goto L_0x008d
            r5 = r2
            org.bouncycastle.jcajce.PBKDF1Key r5 = (org.bouncycastle.jcajce.PBKDF1Key) r5
            boolean r7 = r3 instanceof javax.crypto.spec.PBEParameterSpec
            if (r7 == 0) goto L_0x004e
            r7 = r3
            javax.crypto.spec.PBEParameterSpec r7 = (javax.crypto.spec.PBEParameterSpec) r7
            r1.pbeSpec = r7
        L_0x004e:
            boolean r7 = r5 instanceof org.bouncycastle.jcajce.PBKDF1KeyWithParameters
            if (r7 == 0) goto L_0x0068
            javax.crypto.spec.PBEParameterSpec r7 = r1.pbeSpec
            if (r7 != 0) goto L_0x0068
            r7 = r5
            org.bouncycastle.jcajce.PBKDF1KeyWithParameters r7 = (org.bouncycastle.jcajce.PBKDF1KeyWithParameters) r7
            javax.crypto.spec.PBEParameterSpec r9 = new javax.crypto.spec.PBEParameterSpec
            byte[] r13 = r7.getSalt()
            int r7 = r7.getIterationCount()
            r9.<init>(r13, r7)
            r1.pbeSpec = r9
        L_0x0068:
            byte[] r14 = r5.getEncoded()
            r15 = 0
            int r5 = r1.digest
            int r7 = r1.keySizeInBits
            int r9 = r1.ivLength
            int r18 = r9 << 3
            javax.crypto.spec.PBEParameterSpec r9 = r1.pbeSpec
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r13 = r1.cipher
            java.lang.String r20 = r13.getAlgorithmName()
            r16 = r5
            r17 = r7
            r19 = r9
            org.bouncycastle.crypto.CipherParameters r5 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r14, r15, r16, r17, r18, r19, r20)
            boolean r7 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r7 == 0) goto L_0x01e3
            goto L_0x01de
        L_0x008d:
            boolean r13 = r2 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey
            if (r13 == 0) goto L_0x00dd
            r5 = r2
            org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey r5 = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) r5
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = r5.getOID()
            if (r7 == 0) goto L_0x00a3
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = r5.getOID()
            java.lang.String r7 = r7.getId()
            goto L_0x00a7
        L_0x00a3:
            java.lang.String r7 = r5.getAlgorithm()
        L_0x00a7:
            r1.pbeAlgorithm = r7
            org.bouncycastle.crypto.CipherParameters r7 = r5.getParam()
            if (r7 == 0) goto L_0x00b8
            org.bouncycastle.crypto.CipherParameters r5 = r5.getParam()
            org.bouncycastle.crypto.CipherParameters r5 = r1.adjustParameters(r3, r5)
            goto L_0x00cf
        L_0x00b8:
            boolean r7 = r3 instanceof javax.crypto.spec.PBEParameterSpec
            if (r7 == 0) goto L_0x00d5
            r7 = r3
            javax.crypto.spec.PBEParameterSpec r7 = (javax.crypto.spec.PBEParameterSpec) r7
            r1.pbeSpec = r7
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r7 = r1.cipher
            org.bouncycastle.crypto.BlockCipher r7 = r7.getUnderlyingCipher()
            java.lang.String r7 = r7.getAlgorithmName()
            org.bouncycastle.crypto.CipherParameters r5 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r5, r3, r7)
        L_0x00cf:
            boolean r7 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r7 == 0) goto L_0x01e3
            goto L_0x01de
        L_0x00d5:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "PBE requires PBE parameters to be set."
            r0.<init>(r2)
            throw r0
        L_0x00dd:
            boolean r13 = r2 instanceof javax.crypto.interfaces.PBEKey
            if (r13 == 0) goto L_0x0124
            r5 = r2
            javax.crypto.interfaces.PBEKey r5 = (javax.crypto.interfaces.PBEKey) r5
            r7 = r3
            javax.crypto.spec.PBEParameterSpec r7 = (javax.crypto.spec.PBEParameterSpec) r7
            r1.pbeSpec = r7
            boolean r9 = r5 instanceof org.bouncycastle.jcajce.PKCS12KeyWithParameters
            if (r9 == 0) goto L_0x00fe
            if (r7 != 0) goto L_0x00fe
            javax.crypto.spec.PBEParameterSpec r7 = new javax.crypto.spec.PBEParameterSpec
            byte[] r9 = r5.getSalt()
            int r13 = r5.getIterationCount()
            r7.<init>(r9, r13)
            r1.pbeSpec = r7
        L_0x00fe:
            byte[] r14 = r5.getEncoded()
            int r15 = r1.scheme
            int r5 = r1.digest
            int r7 = r1.keySizeInBits
            int r9 = r1.ivLength
            int r18 = r9 << 3
            javax.crypto.spec.PBEParameterSpec r9 = r1.pbeSpec
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r13 = r1.cipher
            java.lang.String r20 = r13.getAlgorithmName()
            r16 = r5
            r17 = r7
            r19 = r9
            org.bouncycastle.crypto.CipherParameters r5 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r14, r15, r16, r17, r18, r19, r20)
            boolean r7 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r7 == 0) goto L_0x01e3
            goto L_0x01de
        L_0x0124:
            boolean r13 = r2 instanceof org.bouncycastle.jcajce.spec.RepeatedSecretKeySpec
            if (r13 != 0) goto L_0x01e3
            if (r7 == 0) goto L_0x013c
            if (r7 == r8) goto L_0x013c
            if (r7 == r11) goto L_0x013c
            r5 = 5
            if (r7 == r5) goto L_0x013c
            org.bouncycastle.crypto.params.KeyParameter r5 = new org.bouncycastle.crypto.params.KeyParameter
            byte[] r7 = r23.getEncoded()
            r5.<init>(r7)
            goto L_0x01e3
        L_0x013c:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r9)
            throw r0
        L_0x0142:
            r5 = r2
            javax.crypto.SecretKey r5 = (javax.crypto.SecretKey) r5     // Catch:{ Exception -> 0x045e }
            boolean r7 = r3 instanceof javax.crypto.spec.PBEParameterSpec
            if (r7 == 0) goto L_0x014e
            r7 = r3
            javax.crypto.spec.PBEParameterSpec r7 = (javax.crypto.spec.PBEParameterSpec) r7
            r1.pbeSpec = r7
        L_0x014e:
            boolean r7 = r5 instanceof javax.crypto.interfaces.PBEKey
            if (r7 == 0) goto L_0x0177
            javax.crypto.spec.PBEParameterSpec r13 = r1.pbeSpec
            if (r13 != 0) goto L_0x0177
            r13 = r5
            javax.crypto.interfaces.PBEKey r13 = (javax.crypto.interfaces.PBEKey) r13
            byte[] r14 = r13.getSalt()
            if (r14 == 0) goto L_0x016f
            javax.crypto.spec.PBEParameterSpec r14 = new javax.crypto.spec.PBEParameterSpec
            byte[] r15 = r13.getSalt()
            int r13 = r13.getIterationCount()
            r14.<init>(r15, r13)
            r1.pbeSpec = r14
            goto L_0x0177
        L_0x016f:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "PBEKey requires parameters to specify salt"
            r0.<init>(r2)
            throw r0
        L_0x0177:
            javax.crypto.spec.PBEParameterSpec r13 = r1.pbeSpec
            if (r13 != 0) goto L_0x0184
            if (r7 == 0) goto L_0x017e
            goto L_0x0184
        L_0x017e:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r9)
            throw r0
        L_0x0184:
            boolean r7 = r2 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey
            if (r7 == 0) goto L_0x01bd
            r7 = r2
            org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey r7 = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) r7
            org.bouncycastle.crypto.CipherParameters r7 = r7.getParam()
            boolean r9 = r7 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r9 != 0) goto L_0x01bb
            if (r7 != 0) goto L_0x01b3
            byte[] r13 = r5.getEncoded()
            r14 = 2
            int r15 = r1.digest
            int r5 = r1.keySizeInBits
            int r7 = r1.ivLength
            int r17 = r7 << 3
            javax.crypto.spec.PBEParameterSpec r7 = r1.pbeSpec
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r9 = r1.cipher
            java.lang.String r19 = r9.getAlgorithmName()
            r16 = r5
            r18 = r7
            org.bouncycastle.crypto.CipherParameters r7 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x01bb
        L_0x01b3:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r2 = "Algorithm requires a PBE key suitable for PKCS12"
            r0.<init>(r2)
            throw r0
        L_0x01bb:
            r5 = r7
            goto L_0x01da
        L_0x01bd:
            byte[] r13 = r5.getEncoded()
            r14 = 2
            int r15 = r1.digest
            int r5 = r1.keySizeInBits
            int r7 = r1.ivLength
            int r17 = r7 << 3
            javax.crypto.spec.PBEParameterSpec r7 = r1.pbeSpec
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r9 = r1.cipher
            java.lang.String r19 = r9.getAlgorithmName()
            r16 = r5
            r18 = r7
            org.bouncycastle.crypto.CipherParameters r5 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r13, r14, r15, r16, r17, r18, r19)
        L_0x01da:
            boolean r7 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r7 == 0) goto L_0x01e3
        L_0x01de:
            r7 = r5
            org.bouncycastle.crypto.params.ParametersWithIV r7 = (org.bouncycastle.crypto.params.ParametersWithIV) r7
            r1.ivParam = r7
        L_0x01e3:
            boolean r7 = r3 instanceof javax.crypto.spec.IvParameterSpec
            r9 = 0
            if (r7 == 0) goto L_0x0257
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x0241
            r2 = r3
            javax.crypto.spec.IvParameterSpec r2 = (javax.crypto.spec.IvParameterSpec) r2
            byte[] r3 = r2.getIV()
            int r3 = r3.length
            int r6 = r1.ivLength
            if (r3 == r6) goto L_0x0221
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r3 = r1.cipher
            boolean r3 = r3 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher
            if (r3 != 0) goto L_0x0221
            boolean r3 = r1.fixedIv
            if (r3 != 0) goto L_0x0203
            goto L_0x0221
        L_0x0203:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "IV must be "
            r0.append(r2)
            int r2 = r1.ivLength
            r0.append(r2)
            java.lang.String r2 = " bytes long."
            r0.append(r2)
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0221:
            boolean r3 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r3 == 0) goto L_0x0235
            org.bouncycastle.crypto.params.ParametersWithIV r3 = new org.bouncycastle.crypto.params.ParametersWithIV
            org.bouncycastle.crypto.params.ParametersWithIV r5 = (org.bouncycastle.crypto.params.ParametersWithIV) r5
            org.bouncycastle.crypto.CipherParameters r5 = r5.getParameters()
            byte[] r2 = r2.getIV()
            r3.<init>(r5, r2)
            goto L_0x023e
        L_0x0235:
            org.bouncycastle.crypto.params.ParametersWithIV r3 = new org.bouncycastle.crypto.params.ParametersWithIV
            byte[] r2 = r2.getIV()
            r3.<init>(r5, r2)
        L_0x023e:
            r5 = r3
            goto L_0x034c
        L_0x0241:
            java.lang.String r2 = r1.modeName
            if (r2 == 0) goto L_0x03d0
            java.lang.String r3 = "ECB"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x024f
            goto L_0x03d0
        L_0x024f:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "ECB mode does not use an IV"
            r0.<init>(r2)
            throw r0
        L_0x0257:
            boolean r7 = r3 instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec
            if (r7 == 0) goto L_0x0285
            org.bouncycastle.jcajce.spec.GOST28147ParameterSpec r3 = (org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) r3
            org.bouncycastle.crypto.params.ParametersWithSBox r5 = new org.bouncycastle.crypto.params.ParametersWithSBox
            org.bouncycastle.crypto.params.KeyParameter r6 = new org.bouncycastle.crypto.params.KeyParameter
            byte[] r2 = r23.getEncoded()
            r6.<init>(r2)
            byte[] r2 = r3.getSbox()
            r5.<init>(r6, r2)
            byte[] r2 = r3.getIV()
            if (r2 == 0) goto L_0x03d0
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x03d0
            org.bouncycastle.crypto.params.ParametersWithIV r2 = new org.bouncycastle.crypto.params.ParametersWithIV
            byte[] r3 = r3.getIV()
            r2.<init>(r5, r3)
        L_0x0282:
            r5 = r2
            goto L_0x034c
        L_0x0285:
            boolean r7 = r3 instanceof javax.crypto.spec.RC2ParameterSpec
            if (r7 == 0) goto L_0x02ac
            javax.crypto.spec.RC2ParameterSpec r3 = (javax.crypto.spec.RC2ParameterSpec) r3
            org.bouncycastle.crypto.params.RC2Parameters r5 = new org.bouncycastle.crypto.params.RC2Parameters
            byte[] r2 = r23.getEncoded()
            int r6 = r3.getEffectiveKeyBits()
            r5.<init>(r2, r6)
            byte[] r2 = r3.getIV()
            if (r2 == 0) goto L_0x03d0
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x03d0
            org.bouncycastle.crypto.params.ParametersWithIV r2 = new org.bouncycastle.crypto.params.ParametersWithIV
            byte[] r3 = r3.getIV()
            r2.<init>(r5, r3)
            goto L_0x0282
        L_0x02ac:
            boolean r7 = r3 instanceof javax.crypto.spec.RC5ParameterSpec
            if (r7 == 0) goto L_0x035b
            javax.crypto.spec.RC5ParameterSpec r3 = (javax.crypto.spec.RC5ParameterSpec) r3
            org.bouncycastle.crypto.params.RC5Parameters r5 = new org.bouncycastle.crypto.params.RC5Parameters
            byte[] r2 = r23.getEncoded()
            int r7 = r3.getRounds()
            r5.<init>(r2, r7)
            org.bouncycastle.crypto.BlockCipher r2 = r1.baseEngine
            java.lang.String r2 = r2.getAlgorithmName()
            java.lang.String r7 = "RC5"
            boolean r2 = r2.startsWith(r7)
            if (r2 == 0) goto L_0x0353
            org.bouncycastle.crypto.BlockCipher r2 = r1.baseEngine
            java.lang.String r2 = r2.getAlgorithmName()
            java.lang.String r7 = "RC5-32"
            boolean r2 = r2.equals(r7)
            java.lang.String r7 = "."
            if (r2 == 0) goto L_0x0304
            int r2 = r3.getWordSize()
            r6 = 32
            if (r2 != r6) goto L_0x02e6
            goto L_0x0337
        L_0x02e6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "RC5 already set up for a word size of 32 not "
            r0.append(r2)
            int r2 = r3.getWordSize()
            r0.append(r2)
            r0.append(r7)
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0304:
            org.bouncycastle.crypto.BlockCipher r2 = r1.baseEngine
            java.lang.String r2 = r2.getAlgorithmName()
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0337
            int r2 = r3.getWordSize()
            r6 = 64
            if (r2 != r6) goto L_0x0319
            goto L_0x0337
        L_0x0319:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "RC5 already set up for a word size of 64 not "
            r0.append(r2)
            int r2 = r3.getWordSize()
            r0.append(r2)
            r0.append(r7)
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x0337:
            byte[] r2 = r3.getIV()
            if (r2 == 0) goto L_0x03d0
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x03d0
            org.bouncycastle.crypto.params.ParametersWithIV r2 = new org.bouncycastle.crypto.params.ParametersWithIV
            byte[] r3 = r3.getIV()
            r2.<init>(r5, r3)
            goto L_0x0282
        L_0x034c:
            r2 = r5
            org.bouncycastle.crypto.params.ParametersWithIV r2 = (org.bouncycastle.crypto.params.ParametersWithIV) r2
            r1.ivParam = r2
            goto L_0x03d0
        L_0x0353:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "RC5 parameters passed to a cipher that is not RC5."
            r0.<init>(r2)
            throw r0
        L_0x035b:
            java.lang.Class r2 = gcmSpecClass
            if (r2 == 0) goto L_0x03c1
            boolean r2 = r2.isInstance(r3)
            if (r2 == 0) goto L_0x03c1
            java.lang.String r2 = r1.modeName
            boolean r2 = r1.isAEADModeName(r2)
            if (r2 != 0) goto L_0x037c
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r2 = r1.cipher
            boolean r2 = r2 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher
            if (r2 == 0) goto L_0x0374
            goto L_0x037c
        L_0x0374:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "GCMParameterSpec can only be used with AEAD modes."
            r0.<init>(r2)
            throw r0
        L_0x037c:
            java.lang.Class r2 = gcmSpecClass     // Catch:{ Exception -> 0x03b9 }
            java.lang.String r6 = "getTLen"
            java.lang.Class[] r7 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03b9 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r6, r7)     // Catch:{ Exception -> 0x03b9 }
            java.lang.Class r6 = gcmSpecClass     // Catch:{ Exception -> 0x03b9 }
            java.lang.String r7 = "getIV"
            java.lang.Class[] r13 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x03b9 }
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r13)     // Catch:{ Exception -> 0x03b9 }
            boolean r7 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV     // Catch:{ Exception -> 0x03b9 }
            if (r7 == 0) goto L_0x039a
            org.bouncycastle.crypto.params.ParametersWithIV r5 = (org.bouncycastle.crypto.params.ParametersWithIV) r5     // Catch:{ Exception -> 0x03b9 }
            org.bouncycastle.crypto.CipherParameters r5 = r5.getParameters()     // Catch:{ Exception -> 0x03b9 }
        L_0x039a:
            org.bouncycastle.crypto.params.KeyParameter r5 = (org.bouncycastle.crypto.params.KeyParameter) r5     // Catch:{ Exception -> 0x03b9 }
            org.bouncycastle.crypto.params.AEADParameters r7 = new org.bouncycastle.crypto.params.AEADParameters     // Catch:{ Exception -> 0x03b9 }
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03b9 }
            java.lang.Object r2 = r2.invoke(r3, r13)     // Catch:{ Exception -> 0x03b9 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x03b9 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x03b9 }
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x03b9 }
            java.lang.Object r3 = r6.invoke(r3, r13)     // Catch:{ Exception -> 0x03b9 }
            byte[] r3 = (byte[]) r3     // Catch:{ Exception -> 0x03b9 }
            r7.<init>(r5, r2, r3)     // Catch:{ Exception -> 0x03b9 }
            r1.aeadParams = r7     // Catch:{ Exception -> 0x03b9 }
            r5 = r7
            goto L_0x03d0
        L_0x03b9:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "Cannot process GCMParameterSpec."
            r0.<init>(r2)
            throw r0
        L_0x03c1:
            if (r3 == 0) goto L_0x03d0
            boolean r2 = r3 instanceof javax.crypto.spec.PBEParameterSpec
            if (r2 == 0) goto L_0x03c8
            goto L_0x03d0
        L_0x03c8:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "unknown parameter type."
            r0.<init>(r2)
            throw r0
        L_0x03d0:
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x0416
            boolean r2 = r5 instanceof org.bouncycastle.crypto.params.ParametersWithIV
            if (r2 != 0) goto L_0x0416
            boolean r2 = r5 instanceof org.bouncycastle.crypto.params.AEADParameters
            if (r2 != 0) goto L_0x0416
            if (r4 != 0) goto L_0x03e4
            java.security.SecureRandom r2 = new java.security.SecureRandom
            r2.<init>()
            goto L_0x03e5
        L_0x03e4:
            r2 = r4
        L_0x03e5:
            if (r0 == r11) goto L_0x0404
            if (r0 == r12) goto L_0x0404
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r2 = r1.cipher
            org.bouncycastle.crypto.BlockCipher r2 = r2.getUnderlyingCipher()
            java.lang.String r2 = r2.getAlgorithmName()
            java.lang.String r3 = "PGPCFB"
            int r2 = r2.indexOf(r3)
            if (r2 < 0) goto L_0x03fc
            goto L_0x0416
        L_0x03fc:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "no IV set when one expected"
            r0.<init>(r2)
            throw r0
        L_0x0404:
            int r3 = r1.ivLength
            byte[] r3 = new byte[r3]
            r2.nextBytes(r3)
            org.bouncycastle.crypto.params.ParametersWithIV r2 = new org.bouncycastle.crypto.params.ParametersWithIV
            r2.<init>(r5, r3)
            r3 = r2
            org.bouncycastle.crypto.params.ParametersWithIV r3 = (org.bouncycastle.crypto.params.ParametersWithIV) r3
            r1.ivParam = r3
            r5 = r2
        L_0x0416:
            if (r4 == 0) goto L_0x0422
            boolean r2 = r1.padded
            if (r2 == 0) goto L_0x0422
            org.bouncycastle.crypto.params.ParametersWithRandom r2 = new org.bouncycastle.crypto.params.ParametersWithRandom
            r2.<init>(r5, r4)
            r5 = r2
        L_0x0422:
            if (r0 == r11) goto L_0x044d
            if (r0 == r10) goto L_0x0447
            if (r0 == r12) goto L_0x044d
            if (r0 != r8) goto L_0x042b
            goto L_0x0447
        L_0x042b:
            java.security.InvalidParameterException r2 = new java.security.InvalidParameterException     // Catch:{ Exception -> 0x0453 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0453 }
            r3.<init>()     // Catch:{ Exception -> 0x0453 }
            java.lang.String r4 = "unknown opmode "
            r3.append(r4)     // Catch:{ Exception -> 0x0453 }
            r3.append(r0)     // Catch:{ Exception -> 0x0453 }
            java.lang.String r0 = " passed"
            r3.append(r0)     // Catch:{ Exception -> 0x0453 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0453 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0453 }
            throw r2     // Catch:{ Exception -> 0x0453 }
        L_0x0447:
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r0 = r1.cipher     // Catch:{ Exception -> 0x0453 }
            r0.init(r9, r5)     // Catch:{ Exception -> 0x0453 }
            return
        L_0x044d:
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r0 = r1.cipher     // Catch:{ Exception -> 0x0453 }
            r0.init(r11, r5)     // Catch:{ Exception -> 0x0453 }
            return
        L_0x0453:
            r0 = move-exception
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$1 r2 = new org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$1
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x045e:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r2 = "PKCS12 requires a SecretKey/PBEKey"
            r0.<init>(r2)
            throw r0
        L_0x0466:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Key for algorithm "
            r0.append(r3)
            java.lang.String r2 = r23.getAlgorithm()
            r0.append(r2)
            java.lang.String r2 = " not suitable for symmetric enryption."
            r0.append(r2)
            java.security.InvalidKeyException r2 = new java.security.InvalidKeyException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    /* access modifiers changed from: protected */
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        GenericBlockCipher genericBlockCipher;
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        BufferedGenericBlockCipher bufferedGenericBlockCipher2;
        String upperCase = Strings.toUpperCase(str);
        this.modeName = upperCase;
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            genericBlockCipher = new BufferedGenericBlockCipher(this.baseEngine);
        } else if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.getBlockSize();
            genericBlockCipher = new BufferedGenericBlockCipher((BlockCipher) new CBCBlockCipher(this.baseEngine));
        } else {
            if (this.modeName.startsWith("OFB")) {
                this.ivLength = this.baseEngine.getBlockSize();
                if (this.modeName.length() != 3) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher((BlockCipher) new OFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                    this.cipher = bufferedGenericBlockCipher;
                    return;
                }
                BlockCipher blockCipher = this.baseEngine;
                bufferedGenericBlockCipher2 = new BufferedGenericBlockCipher((BlockCipher) new OFBBlockCipher(blockCipher, blockCipher.getBlockSize() << 3));
            } else {
                if (this.modeName.startsWith("CFB")) {
                    this.ivLength = this.baseEngine.getBlockSize();
                    if (this.modeName.length() != 3) {
                        bufferedGenericBlockCipher = new BufferedGenericBlockCipher((BlockCipher) new CFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                    } else {
                        BlockCipher blockCipher2 = this.baseEngine;
                        bufferedGenericBlockCipher2 = new BufferedGenericBlockCipher((BlockCipher) new CFBBlockCipher(blockCipher2, blockCipher2.getBlockSize() << 3));
                    }
                } else if (this.modeName.startsWith("PGP")) {
                    boolean equalsIgnoreCase = this.modeName.equalsIgnoreCase("PGPCFBwithIV");
                    this.ivLength = this.baseEngine.getBlockSize();
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher((BlockCipher) new PGPCFBBlockCipher(this.baseEngine, equalsIgnoreCase));
                } else if (this.modeName.equalsIgnoreCase("OpenPGPCFB")) {
                    this.ivLength = 0;
                    genericBlockCipher = new BufferedGenericBlockCipher((BlockCipher) new OpenPGPCFBBlockCipher(this.baseEngine));
                } else if (this.modeName.startsWith("SIC")) {
                    int blockSize = this.baseEngine.getBlockSize();
                    this.ivLength = blockSize;
                    if (blockSize >= 16) {
                        this.fixedIv = false;
                        genericBlockCipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(this.baseEngine)));
                    } else {
                        throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                    }
                } else if (this.modeName.startsWith("CTR")) {
                    this.ivLength = this.baseEngine.getBlockSize();
                    this.fixedIv = false;
                    genericBlockCipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(this.baseEngine)));
                } else if (this.modeName.startsWith("GOFB")) {
                    this.ivLength = this.baseEngine.getBlockSize();
                    genericBlockCipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new GOFBBlockCipher(this.baseEngine)));
                } else if (this.modeName.startsWith("GCFB")) {
                    this.ivLength = this.baseEngine.getBlockSize();
                    genericBlockCipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new GCFBBlockCipher(this.baseEngine)));
                } else if (this.modeName.startsWith("CTS")) {
                    this.ivLength = this.baseEngine.getBlockSize();
                    genericBlockCipher = new BufferedGenericBlockCipher((BufferedBlockCipher) new CTSBlockCipher(new CBCBlockCipher(this.baseEngine)));
                } else if (this.modeName.startsWith("CCM")) {
                    this.ivLength = 13;
                    genericBlockCipher = new AEADGenericBlockCipher(new CCMBlockCipher(this.baseEngine));
                } else if (this.modeName.startsWith("OCB")) {
                    if (this.engineProvider != null) {
                        this.ivLength = 15;
                        genericBlockCipher = new AEADGenericBlockCipher(new OCBBlockCipher(this.baseEngine, this.engineProvider.get()));
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("can't support mode ");
                        sb.append(str);
                        throw new NoSuchAlgorithmException(sb.toString());
                    }
                } else if (this.modeName.startsWith("EAX")) {
                    this.ivLength = this.baseEngine.getBlockSize();
                    genericBlockCipher = new AEADGenericBlockCipher(new EAXBlockCipher(this.baseEngine));
                } else if (this.modeName.startsWith(CodePackage.GCM)) {
                    this.ivLength = this.baseEngine.getBlockSize();
                    genericBlockCipher = new AEADGenericBlockCipher(new GCMBlockCipher(this.baseEngine));
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("can't support mode ");
                    sb2.append(str);
                    throw new NoSuchAlgorithmException(sb2.toString());
                }
                this.cipher = bufferedGenericBlockCipher;
                return;
            }
            genericBlockCipher = bufferedGenericBlockCipher2;
        }
        this.cipher = genericBlockCipher;
    }

    /* access modifiers changed from: protected */
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            if (this.cipher.wrapOnNoPadding()) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(this.cipher.getUnderlyingCipher()));
            } else {
                return;
            }
        } else if (upperCase.equals("WITHCTS")) {
            bufferedGenericBlockCipher = new BufferedGenericBlockCipher((BufferedBlockCipher) new CTSBlockCipher(this.cipher.getUnderlyingCipher()));
        } else {
            this.padded = true;
            if (isAEADModeName(this.modeName)) {
                throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
            } else if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
            } else if (upperCase.equals("ZEROBYTEPADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ZeroBytePadding());
            } else if (upperCase.equals("ISO10126PADDING") || upperCase.equals("ISO10126-2PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO10126d2Padding());
            } else if (upperCase.equals("X9.23PADDING") || upperCase.equals("X923PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new X923Padding());
            } else if (upperCase.equals("ISO7816-4PADDING") || upperCase.equals("ISO9797-1PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO7816d4Padding());
            } else if (upperCase.equals("TBCPADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new TBCPadding());
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Padding ");
                sb.append(str);
                sb.append(" unknown.");
                throw new NoSuchPaddingException(sb.toString());
            }
        }
        this.cipher = bufferedGenericBlockCipher;
    }

    /* access modifiers changed from: protected */
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.cipher.getUpdateOutputSize(i2) + i3 <= bArr2.length) {
            try {
                return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            } catch (DataLengthException e) {
                throw new IllegalStateException(e.toString());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    /* access modifiers changed from: protected */
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize > 0) {
            byte[] bArr2 = new byte[updateOutputSize];
            int processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
            if (processBytes == 0) {
                return null;
            }
            if (processBytes == updateOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[processBytes];
            System.arraycopy(bArr2, 0, bArr3, 0, processBytes);
            return bArr3;
        }
        this.cipher.processBytes(bArr, i, i2, (byte[]) null, 0);
        return null;
    }

    /* access modifiers changed from: protected */
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    /* access modifiers changed from: protected */
    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }
}
