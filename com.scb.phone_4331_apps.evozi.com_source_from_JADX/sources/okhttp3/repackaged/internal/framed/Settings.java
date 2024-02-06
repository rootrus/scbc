package okhttp3.repackaged.internal.framed;

import java.util.Arrays;

public final class Settings {
    static final int COUNT = 10;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65536;
    static final int ENABLE_PUSH = 2;
    static final int HEADER_TABLE_SIZE = 1;
    static final int INITIAL_WINDOW_SIZE = 7;
    static final int MAX_CONCURRENT_STREAMS = 4;
    static final int MAX_FRAME_SIZE = 5;
    static final int MAX_HEADER_LIST_SIZE = 6;
    static final int akN = 1;
    static final int akO = 1;
    static final int akP = 2;
    static final int akQ = 1;
    static final int akR = 2;
    static final int akS = 3;
    static final int akT = 5;
    static final int akU = 6;
    static final int akV = 8;
    static final int akW = 10;
    static final int akX = 1;
    private int akY;
    private int akZ;
    private int ala;
    private final int[] alb = new int[10];

    /* access modifiers changed from: package-private */
    public final void clear() {
        this.ala = 0;
        this.akZ = 0;
        this.akY = 0;
        Arrays.fill(this.alb, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Settings mo58793d(int i, int i2, int i3) {
        if (i >= this.alb.length) {
            return this;
        }
        int i4 = 1 << i;
        this.akY |= i4;
        if ((i2 & 1) != 0) {
            this.akZ |= i4;
        } else {
            this.akZ &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.ala |= i4;
        } else {
            this.ala &= ~i4;
        }
        this.alb[i] = i3;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final boolean isSet(int i) {
        return ((1 << i) & this.akY) != 0;
    }

    /* access modifiers changed from: package-private */
    public final int get(int i) {
        return this.alb[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final int mo58781G(int i) {
        int i2 = mo58790P(i) ? 2 : 0;
        return mo58789O(i) ? i2 | 1 : i2;
    }

    /* access modifiers changed from: package-private */
    public final int size() {
        return Integer.bitCount(this.akY);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final int mo58782H(int i) {
        return (this.akY & 2) != 0 ? this.alb[1] : i;
    }

    /* access modifiers changed from: package-private */
    public final int getHeaderTableSize() {
        if ((this.akY & 2) != 0) {
            return this.alb[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public final int mo58783I(int i) {
        return (this.akY & 4) != 0 ? this.alb[2] : i;
    }

    /* access modifiers changed from: package-private */
    public final boolean getEnablePush(boolean z) {
        return ((this.akY & 4) != 0 ? this.alb[2] : z ? 1 : 0) == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final int mo58784J(int i) {
        return (this.akY & 8) != 0 ? this.alb[3] : i;
    }

    /* access modifiers changed from: package-private */
    public final int getMaxConcurrentStreams(int i) {
        return (this.akY & 16) != 0 ? this.alb[4] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public final int mo58785K(int i) {
        return (this.akY & 32) != 0 ? this.alb[5] : i;
    }

    /* access modifiers changed from: package-private */
    public final int getMaxFrameSize(int i) {
        return (this.akY & 32) != 0 ? this.alb[5] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final int mo58786L(int i) {
        return (this.akY & 64) != 0 ? this.alb[6] : i;
    }

    /* access modifiers changed from: package-private */
    public final int getMaxHeaderListSize(int i) {
        return (this.akY & 64) != 0 ? this.alb[6] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final int mo58787M(int i) {
        return (this.akY & 128) != 0 ? this.alb[7] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final int mo58788N(int i) {
        return (this.akY & 256) != 0 ? this.alb[8] : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: uS */
    public final boolean mo58802uS() {
        return (((this.akY & 1024) != 0 ? this.alb[10] : 0) & 1) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final boolean mo58789O(int i) {
        return ((1 << i) & this.akZ) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final boolean mo58790P(int i) {
        return ((1 << i) & this.ala) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo58791b(Settings settings) {
        for (int i = 0; i < 10; i++) {
            if (settings.isSet(i)) {
                mo58793d(i, settings.mo58781G(i), settings.get(i));
            }
        }
    }
}
