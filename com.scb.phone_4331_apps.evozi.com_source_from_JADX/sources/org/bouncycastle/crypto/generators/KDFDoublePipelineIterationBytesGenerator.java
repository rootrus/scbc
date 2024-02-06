package org.bouncycastle.crypto.generators;

import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.MacDerivationFunction;
import org.bouncycastle.crypto.params.KDFDoublePipelineIterationParameters;
import org.bouncycastle.crypto.params.KeyParameter;

public class KDFDoublePipelineIterationBytesGenerator implements MacDerivationFunction {
    private static final BigInteger INTEGER_MAX = BigInteger.valueOf(2147483647L);
    private static final BigInteger TWO = BigInteger.valueOf(2);

    /* renamed from: a */
    private byte[] f5943a;
    private byte[] fixedInputData;
    private int generatedBytes;

    /* renamed from: h */
    private final int f5944h;
    private byte[] ios;

    /* renamed from: k */
    private byte[] f5945k;
    private int maxSizeExcl;
    private final Mac prf;
    private boolean useCounter;

    public KDFDoublePipelineIterationBytesGenerator(Mac mac) {
        this.prf = mac;
        int macSize = mac.getMacSize();
        this.f5944h = macSize;
        this.f5943a = new byte[macSize];
        this.f5945k = new byte[macSize];
    }

    private void generateNext() {
        if (this.generatedBytes == 0) {
            Mac mac = this.prf;
            byte[] bArr = this.fixedInputData;
            mac.update(bArr, 0, bArr.length);
            this.prf.doFinal(this.f5943a, 0);
        } else {
            Mac mac2 = this.prf;
            byte[] bArr2 = this.f5943a;
            mac2.update(bArr2, 0, bArr2.length);
            this.prf.doFinal(this.f5943a, 0);
        }
        Mac mac3 = this.prf;
        byte[] bArr3 = this.f5943a;
        mac3.update(bArr3, 0, bArr3.length);
        if (this.useCounter) {
            int i = (this.generatedBytes / this.f5944h) + 1;
            byte[] bArr4 = this.ios;
            int length = bArr4.length;
            if (length != 1) {
                if (length != 2) {
                    if (length != 3) {
                        if (length == 4) {
                            bArr4[0] = (byte) (i >>> 24);
                        } else {
                            throw new IllegalStateException("Unsupported size of counter i");
                        }
                    }
                    byte[] bArr5 = this.ios;
                    bArr5[bArr5.length - 3] = (byte) (i >>> 16);
                }
                byte[] bArr6 = this.ios;
                bArr6[bArr6.length - 2] = (byte) (i >>> 8);
            }
            byte[] bArr7 = this.ios;
            bArr7[bArr7.length - 1] = (byte) i;
            this.prf.update(bArr7, 0, bArr7.length);
        }
        Mac mac4 = this.prf;
        byte[] bArr8 = this.fixedInputData;
        mac4.update(bArr8, 0, bArr8.length);
        this.prf.doFinal(this.f5945k, 0);
    }

    public int generateBytes(byte[] bArr, int i, int i2) throws DataLengthException, IllegalArgumentException {
        int i3 = this.generatedBytes;
        int i4 = i3 + i2;
        if (i4 < 0 || i4 >= this.maxSizeExcl) {
            StringBuilder sb = new StringBuilder();
            sb.append("Current KDFCTR may only be used for ");
            sb.append(this.maxSizeExcl);
            sb.append(" bytes");
            throw new DataLengthException(sb.toString());
        }
        if (i3 % this.f5944h == 0) {
            generateNext();
        }
        int i5 = this.generatedBytes;
        int i6 = this.f5944h;
        int i7 = i5 % i6;
        int min = Math.min(i6 - i7, i2);
        System.arraycopy(this.f5945k, i7, bArr, i, min);
        this.generatedBytes += min;
        int i8 = i2 - min;
        while (true) {
            i += min;
            if (i8 <= 0) {
                return i2;
            }
            generateNext();
            min = Math.min(this.f5944h, i8);
            System.arraycopy(this.f5945k, 0, bArr, i, min);
            this.generatedBytes += min;
            i8 -= min;
        }
    }

    public Mac getMac() {
        return this.prf;
    }

    public void init(DerivationParameters derivationParameters) {
        if (derivationParameters instanceof KDFDoublePipelineIterationParameters) {
            KDFDoublePipelineIterationParameters kDFDoublePipelineIterationParameters = (KDFDoublePipelineIterationParameters) derivationParameters;
            this.prf.init(new KeyParameter(kDFDoublePipelineIterationParameters.getKI()));
            this.fixedInputData = kDFDoublePipelineIterationParameters.getFixedInputData();
            int r = kDFDoublePipelineIterationParameters.getR();
            this.ios = new byte[(r / 8)];
            boolean useCounter2 = kDFDoublePipelineIterationParameters.useCounter();
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            if (useCounter2) {
                BigInteger multiply = TWO.pow(r).multiply(BigInteger.valueOf((long) this.f5944h));
                if (multiply.compareTo(INTEGER_MAX) != 1) {
                    i = multiply.intValue();
                }
            }
            this.maxSizeExcl = i;
            this.useCounter = kDFDoublePipelineIterationParameters.useCounter();
            this.generatedBytes = 0;
            return;
        }
        throw new IllegalArgumentException("Wrong type of arguments given");
    }
}
