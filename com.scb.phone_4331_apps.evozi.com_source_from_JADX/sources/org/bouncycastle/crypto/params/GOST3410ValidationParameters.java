package org.bouncycastle.crypto.params;

public class GOST3410ValidationParameters {

    /* renamed from: c */
    private int f6057c;

    /* renamed from: cL */
    private long f6058cL;

    /* renamed from: x0 */
    private int f6059x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f6059x0 = i;
        this.f6057c = i2;
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f6058cL = j2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GOST3410ValidationParameters)) {
            return false;
        }
        GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
        return gOST3410ValidationParameters.f6057c == this.f6057c && gOST3410ValidationParameters.f6059x0 == this.f6059x0 && gOST3410ValidationParameters.f6058cL == this.f6058cL && gOST3410ValidationParameters.x0L == this.x0L;
    }

    public int getC() {
        return this.f6057c;
    }

    public long getCL() {
        return this.f6058cL;
    }

    public int getX0() {
        return this.f6059x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f6059x0;
        int i2 = this.f6057c;
        long j = this.x0L;
        long j2 = this.f6058cL;
        return ((((i ^ i2) ^ ((int) j)) ^ ((int) (j >> 32))) ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }
}
