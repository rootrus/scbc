package org.bouncycastle.pqc.crypto.gmss;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* renamed from: i */
    private int f6287i;

    /* renamed from: j */
    private int f6288j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* renamed from: w */
    private int f6289w;

    GMSSLeaf(Digest digest, int i, int i2) {
        this.f6289w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d = (double) i;
        int ceil = (int) Math.ceil(((double) (digestSize << 3)) / d);
        int ceil2 = ceil + ((int) Math.ceil(((double) getLog((ceil << i) + 1)) / d));
        this.keysize = ceil2;
        int i3 = 1 << i;
        this.two_power_w = i3;
        this.steps = (int) Math.ceil(((double) ((((i3 - 1) * ceil2) + 1) + ceil2)) / ((double) i2));
        int i4 = this.mdsize;
        this.seed = new byte[i4];
        this.leaf = new byte[i4];
        this.privateKeyOTS = new byte[i4];
        this.concHashs = new byte[(i4 * this.keysize)];
    }

    public GMSSLeaf(Digest digest, int i, int i2, byte[] bArr) {
        this.f6289w = i;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        double d = (double) i;
        int ceil = (int) Math.ceil(((double) (digestSize << 3)) / d);
        int ceil2 = ceil + ((int) Math.ceil(((double) getLog((ceil << i) + 1)) / d));
        this.keysize = ceil2;
        int i3 = 1 << i;
        this.two_power_w = i3;
        this.steps = (int) Math.ceil(((double) ((((i3 - 1) * ceil2) + 1) + ceil2)) / ((double) i2));
        int i4 = this.mdsize;
        this.seed = new byte[i4];
        this.leaf = new byte[i4];
        this.privateKeyOTS = new byte[i4];
        this.concHashs = new byte[(i4 * this.keysize)];
        initLeafCalc(bArr);
    }

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f6287i = iArr[0];
        this.f6288j = iArr[1];
        this.steps = iArr[2];
        this.f6289w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int ceil = (int) Math.ceil(((double) (digestSize << 3)) / ((double) this.f6289w));
        this.keysize = ceil + ((int) Math.ceil(((double) getLog((ceil << this.f6289w) + 1)) / ((double) this.f6289w)));
        this.two_power_w = 1 << this.f6289w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f6287i = gMSSLeaf.f6287i;
        this.f6288j = gMSSLeaf.f6288j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f6289w = gMSSLeaf.f6289w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }

    private int getLog(int i) {
        int i2 = 1;
        int i3 = 2;
        while (i3 < i) {
            i3 <<= 1;
            i2++;
        }
        return i2;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i = 0; i < this.steps + 10000; i++) {
            if (this.f6287i == this.keysize && this.f6288j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (this.f6287i == 0 || this.f6288j == this.two_power_w - 1) {
                this.f6287i++;
                this.f6288j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i2 = this.f6288j + 1;
                this.f6288j = i2;
                if (i2 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i3 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f6287i - 1) * i3, i3);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unable to updateLeaf in steps: ");
        sb.append(this.steps);
        sb.append(" ");
        sb.append(this.f6287i);
        sb.append(" ");
        sb.append(this.f6288j);
        throw new IllegalStateException(sb.toString());
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        int i = this.mdsize;
        byte[][] bArr = {new byte[i], new byte[i], new byte[(this.keysize * i)], new byte[i]};
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.concHashs;
        bArr[3] = this.leaf;
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.f6287i, this.f6288j, this.steps, this.f6289w};
    }

    /* access modifiers changed from: package-private */
    public void initLeafCalc(byte[] bArr) {
        this.f6287i = 0;
        this.f6288j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    /* access modifiers changed from: package-private */
    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        StringBuilder sb;
        String str = "";
        for (int i = 0; i < 4; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(getStatInt()[i]);
            sb2.append(" ");
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" ");
        sb3.append(this.mdsize);
        sb3.append(" ");
        sb3.append(this.keysize);
        sb3.append(" ");
        sb3.append(this.two_power_w);
        sb3.append(" ");
        String obj = sb3.toString();
        byte[][] statByte = getStatByte();
        for (int i2 = 0; i2 < 4; i2++) {
            if (statByte[i2] != null) {
                sb = new StringBuilder();
                sb.append(obj);
                sb.append(new String(Hex.encode(statByte[i2])));
                sb.append(" ");
            } else {
                sb = new StringBuilder();
                sb.append(obj);
                sb.append("null ");
            }
            obj = sb.toString();
        }
        return obj;
    }
}
