package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.TweakableBlockCipherParameters;

public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    /* access modifiers changed from: private */
    public static int[] MOD17 = new int[80];
    /* access modifiers changed from: private */
    public static int[] MOD3 = new int[80];
    /* access modifiers changed from: private */
    public static int[] MOD5 = new int[80];
    /* access modifiers changed from: private */
    public static int[] MOD9 = new int[80];
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;

    /* renamed from: kw */
    private long[] f5926kw;

    /* renamed from: t */
    private long[] f5927t;

    static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        /* JADX WARNING: type inference failed for: r88v0, types: [long[]] */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void decryptBlock(long[] r87, long[] r88) {
            /*
                r86 = this;
                r0 = r86
                long[] r1 = r0.f5928kw
                long[] r2 = r0.f5929t
                int[] r3 = org.bouncycastle.crypto.engines.ThreefishEngine.MOD17
                int[] r4 = org.bouncycastle.crypto.engines.ThreefishEngine.MOD3
                int r5 = r1.length
                r6 = 33
                if (r5 != r6) goto L_0x04de
                int r5 = r2.length
                r6 = 5
                if (r5 != r6) goto L_0x04d8
                r5 = 0
                r7 = r87[r5]
                r9 = 1
                r10 = r87[r9]
                r12 = 2
                r13 = r87[r12]
                r15 = 3
                r16 = r87[r15]
                r15 = 4
                r18 = r87[r15]
                r20 = r87[r6]
                r22 = 6
                r23 = r87[r22]
                r25 = 7
                r26 = r87[r25]
                r12 = 8
                r28 = r87[r12]
                r9 = 9
                r30 = r87[r9]
                r5 = 10
                r32 = r87[r5]
                r34 = 11
                r35 = r87[r34]
                r12 = 12
                r37 = r87[r12]
                r5 = 13
                r39 = r87[r5]
                r41 = 14
                r42 = r87[r41]
                r44 = 15
                r45 = r87[r44]
                r6 = 19
            L_0x0052:
                if (r6 <= 0) goto L_0x044b
                r47 = r3[r6]
                r48 = r4[r6]
                int r49 = r47 + 1
                r50 = r1[r49]
                long r7 = r7 - r50
                int r50 = r47 + 2
                r51 = r1[r50]
                int r53 = r47 + 3
                r54 = r1[r53]
                long r13 = r13 - r54
                int r54 = r47 + 4
                r55 = r1[r54]
                int r57 = r47 + 5
                r58 = r1[r57]
                r60 = r13
                long r12 = r18 - r58
                int r14 = r47 + 6
                r18 = r1[r14]
                int r58 = r47 + 7
                r62 = r1[r58]
                r64 = r10
                long r9 = r23 - r62
                int r11 = r47 + 8
                r23 = r1[r11]
                int r62 = r47 + 9
                r66 = r1[r62]
                r63 = r6
                long r5 = r28 - r66
                int r28 = r47 + 10
                r66 = r1[r28]
                int r29 = r47 + 11
                r68 = r1[r29]
                r70 = r3
                r71 = r4
                long r3 = r32 - r68
                int r32 = r47 + 12
                r68 = r1[r32]
                int r33 = r47 + 13
                r72 = r1[r33]
                r74 = r14
                long r14 = r37 - r72
                int r37 = r47 + 14
                r72 = r1[r37]
                int r38 = r48 + 1
                r75 = r2[r38]
                int r77 = r47 + 15
                r78 = r1[r77]
                int r80 = r48 + 2
                r80 = r2[r80]
                long r78 = r78 + r80
                r80 = r14
                long r14 = r42 - r78
                int r42 = r47 + 16
                r42 = r1[r42]
                r78 = r2
                r0 = r63
                r63 = r1
                long r1 = (long) r0
                long r42 = r42 + r1
                r82 = 1
                long r42 = r42 + r82
                r79 = r0
                r82 = r1
                long r0 = r45 - r42
                r2 = 9
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r0, r2, r7)
                long r7 = r7 - r0
                r42 = r0
                long r0 = r35 - r68
                r2 = 48
                r45 = r7
                r7 = r60
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r0, r2, r7)
                long r7 = r7 - r0
                long r72 = r72 + r75
                r35 = r0
                long r0 = r39 - r72
                r2 = 35
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r0, r2, r9)
                long r9 = r9 - r0
                r39 = r0
                long r0 = r30 - r66
                r2 = 52
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r0, r2, r12)
                long r12 = r12 - r0
                r30 = r0
                long r0 = r64 - r51
                r2 = 23
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r0, r2, r14)
                long r14 = r14 - r0
                r51 = r14
                long r14 = r20 - r18
                r2 = 31
                long r14 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r2, r5)
                long r5 = r5 - r14
                r18 = r5
                long r5 = r16 - r55
                r2 = 37
                long r5 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r5, r2, r3)
                long r3 = r3 - r5
                r55 = r3
                long r2 = r26 - r23
                r4 = 20
                r23 = r0
                r0 = r80
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r4, r0)
                long r0 = r0 - r2
                r26 = r0
                r0 = r45
                r4 = 31
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r4, r0)
                long r0 = r0 - r2
                r4 = 44
                long r14 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r4, r7)
                long r7 = r7 - r14
                r4 = 47
                long r5 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r5, r4, r12)
                long r12 = r12 - r5
                r4 = 46
                r45 = r14
                r14 = r23
                long r14 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r4, r9)
                long r9 = r9 - r14
                r23 = r14
                r14 = r42
                r84 = r5
                r6 = 19
                r4 = r26
                r26 = r84
                long r14 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r6, r4)
                long r4 = r4 - r14
                r6 = 42
                r42 = r4
                r4 = r39
                r39 = r2
                r2 = r51
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r6, r2)
                long r2 = r2 - r4
                r6 = 44
                r51 = r2
                r2 = r35
                r35 = r12
                r84 = r18
                r18 = r11
                r11 = r84
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r6, r11)
                long r11 = r11 - r2
                r6 = 25
                r60 = r11
                r11 = r30
                r30 = r14
                r13 = r55
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r11, r6, r13)
                long r13 = r13 - r11
                r6 = 16
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r11, r6, r0)
                long r0 = r0 - r11
                r15 = 34
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r15, r7)
                long r7 = r7 - r4
                r15 = 56
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r15, r9)
                long r9 = r9 - r2
                r15 = 51
                r55 = r7
                r6 = r35
                r84 = r4
                r4 = r30
                r30 = r84
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r15, r6)
                long r6 = r6 - r4
                r35 = r4
                r4 = r39
                r8 = 4
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r8, r13)
                long r13 = r13 - r4
                r8 = 53
                r39 = r2
                r2 = r26
                r26 = r13
                r13 = r42
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r8, r13)
                long r13 = r13 - r2
                r8 = 42
                r42 = r13
                r13 = r45
                r45 = r11
                r11 = r51
                long r13 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r13, r8, r11)
                long r11 = r11 - r13
                r8 = 41
                r51 = r11
                r11 = r23
                r23 = r4
                r4 = r60
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r11, r8, r4)
                long r4 = r4 - r11
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r11, r8, r0)
                r60 = r9
                r8 = r55
                r15 = 9
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r15, r8)
                r15 = 37
                long r13 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r13, r15, r6)
                r55 = r11
                r20 = r13
                r12 = r23
                r10 = r60
                r15 = 31
                long r12 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r12, r15, r10)
                r14 = r45
                r10 = 12
                long r14 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r10, r4)
                r10 = r39
                r39 = r14
                r14 = 47
                r84 = r4
                r4 = r26
                r26 = r84
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r10, r14, r4)
                r14 = 44
                r45 = r4
                r4 = r30
                r30 = r10
                r10 = r42
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r14, r10)
                r14 = 30
                r42 = r4
                r4 = r35
                r35 = r10
                r10 = r51
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r14, r10)
                long r0 = r0 - r55
                r14 = r63[r47]
                long r0 = r0 - r14
                r14 = r63[r49]
                long r8 = r8 - r2
                r49 = r63[r50]
                long r8 = r8 - r49
                r49 = r63[r53]
                long r6 = r6 - r20
                r51 = r63[r54]
                long r6 = r6 - r51
                r51 = r63[r57]
                long r53 = r60 - r12
                r60 = r63[r74]
                r64 = r12
                long r12 = r53 - r60
                r53 = r63[r58]
                long r26 = r26 - r39
                r57 = r63[r18]
                r60 = r2
                long r2 = r26 - r57
                r26 = r63[r62]
                long r45 = r45 - r30
                r57 = r63[r28]
                r66 = r2
                long r2 = r45 - r57
                r28 = r63[r29]
                long r35 = r35 - r42
                r45 = r63[r32]
                r57 = r2
                long r2 = r35 - r45
                r32 = r63[r33]
                r35 = r78[r48]
                long r10 = r10 - r4
                r45 = r63[r37]
                r37 = r78[r38]
                long r45 = r45 + r37
                long r10 = r10 - r45
                r37 = r63[r77]
                long r37 = r37 + r82
                long r4 = r4 - r37
                r37 = r10
                r10 = 5
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r10, r0)
                long r0 = r0 - r4
                long r10 = r30 - r28
                r28 = r4
                r4 = 20
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r10, r4, r8)
                long r8 = r8 - r4
                long r32 = r32 + r35
                long r10 = r42 - r32
                r30 = r4
                r4 = 48
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r10, r4, r12)
                long r12 = r12 - r4
                long r10 = r39 - r26
                r26 = r4
                r4 = 41
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r10, r4, r6)
                r4 = r37
                long r6 = r6 - r10
                long r14 = r55 - r14
                r32 = r10
                r10 = 47
                long r14 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r10, r4)
                long r10 = r4 - r14
                long r4 = r20 - r51
                r20 = r10
                r10 = 28
                r35 = r12
                r11 = r66
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r10, r11)
                long r10 = r11 - r4
                long r12 = r60 - r49
                r37 = r10
                r18 = r14
                r10 = r57
                r14 = 16
                long r12 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r12, r14, r10)
                long r10 = r10 - r12
                long r14 = r64 - r53
                r39 = r10
                r10 = 25
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r10, r2)
                long r2 = r2 - r10
                r14 = 33
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r10, r14, r0)
                long r0 = r0 - r10
                r14 = 4
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r14, r8)
                long r8 = r8 - r4
                r14 = 51
                long r12 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r12, r14, r6)
                long r6 = r6 - r12
                r14 = r35
                r35 = r12
                r12 = 13
                r84 = r4
                r4 = r18
                r18 = r84
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r12, r14)
                long r12 = r14 - r4
                r14 = 34
                r42 = r4
                r4 = r28
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r14, r2)
                long r2 = r2 - r4
                r23 = r10
                r14 = r26
                r10 = 41
                r84 = r2
                r2 = r20
                r20 = r84
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r10, r2)
                long r2 = r2 - r10
                r14 = 59
                r26 = r2
                r28 = r4
                r2 = r30
                r4 = r37
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r14, r4)
                long r4 = r4 - r2
                r14 = 17
                r30 = r4
                r4 = r32
                r32 = r6
                r6 = r39
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r14, r6)
                long r6 = r6 - r4
                r14 = 38
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r14, r0)
                long r0 = r0 - r4
                r15 = 19
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r10, r15, r8)
                long r8 = r8 - r10
                r14 = 10
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r14, r12)
                long r12 = r12 - r2
                r14 = 55
                r37 = r10
                r10 = r32
                r84 = r2
                r2 = r28
                r28 = r84
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r14, r10)
                long r10 = r10 - r2
                r14 = 49
                r32 = r2
                r2 = r23
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r14, r6)
                long r6 = r6 - r2
                r14 = 18
                r23 = r6
                r6 = r35
                r84 = r4
                r4 = r20
                r20 = r84
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r6, r14, r4)
                long r4 = r4 - r6
                r14 = 23
                r35 = r4
                r4 = r18
                r18 = r2
                r2 = r26
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r14, r2)
                long r2 = r2 - r4
                r14 = 52
                r26 = r2
                r2 = r42
                r84 = r12
                r12 = r30
                r30 = r84
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r14, r12)
                long r12 = r12 - r2
                r14 = 24
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r14, r0)
                r14 = 13
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r6, r14, r8)
                long r8 = r8 - r6
                r14 = 8
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r4, r14, r10)
                r39 = r6
                r6 = r30
                r15 = 47
                r84 = r8
                r8 = r18
                r18 = r84
                long r8 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r8, r15, r6)
                r30 = r0
                r0 = r20
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r0, r14, r12)
                r14 = 17
                r20 = r2
                r2 = r28
                r84 = r6
                r6 = r23
                r23 = r84
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r2, r14, r6)
                r14 = 22
                r28 = r8
                r8 = r37
                r84 = r2
                r2 = r35
                r35 = r84
                long r8 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r8, r14, r2)
                r16 = r6
                r6 = r26
                r14 = r32
                r26 = r4
                r4 = 37
                long r45 = org.bouncycastle.crypto.engines.ThreefishEngine.xorRotr(r14, r4, r6)
                long r42 = r6 - r45
                long r37 = r2 - r8
                long r2 = r12 - r0
                long r4 = r10 - r26
                int r6 = r79 + -2
                long r32 = r16 - r35
                long r23 = r23 - r28
                long r10 = r30 - r20
                r30 = r0
                r13 = r18
                r16 = r39
                r1 = r63
                r12 = 12
                r15 = 4
                r0 = r86
                r18 = r4
                r39 = r8
                r7 = r10
                r10 = r20
                r20 = r26
                r26 = r28
                r4 = r71
                r9 = 9
                r28 = r2
                r3 = r70
                r2 = r78
                goto L_0x0052
            L_0x044b:
                r63 = r1
                r78 = r2
                r64 = r10
                r0 = 0
                r1 = r63[r0]
                r0 = 1
                r3 = r63[r0]
                r0 = 2
                r5 = r63[r0]
                r0 = 3
                r9 = r63[r0]
                r0 = 4
                r11 = r63[r0]
                r0 = 5
                r47 = r63[r0]
                r49 = r63[r22]
                r51 = r63[r25]
                r0 = 8
                r53 = r63[r0]
                r0 = 9
                r55 = r63[r0]
                r0 = 10
                r57 = r63[r0]
                r60 = r63[r34]
                r0 = 12
                r66 = r63[r0]
                r0 = 13
                r68 = r63[r0]
                r0 = 0
                r70 = r78[r0]
                r72 = r63[r41]
                r15 = 1
                r74 = r78[r15]
                r62 = r63[r44]
                long r7 = r7 - r1
                r88[r0] = r7
                long r0 = r64 - r3
                r88[r15] = r0
                long r13 = r13 - r5
                r0 = 2
                r88[r0] = r13
                long r16 = r16 - r9
                r0 = 3
                r88[r0] = r16
                long r18 = r18 - r11
                r0 = 4
                r88[r0] = r18
                long r20 = r20 - r47
                r0 = 5
                r88[r0] = r20
                long r23 = r23 - r49
                r88[r22] = r23
                long r26 = r26 - r51
                r88[r25] = r26
                long r28 = r28 - r53
                r0 = 8
                r88[r0] = r28
                long r30 = r30 - r55
                r0 = 9
                r88[r0] = r30
                long r32 = r32 - r57
                r0 = 10
                r88[r0] = r32
                long r35 = r35 - r60
                r88[r34] = r35
                long r37 = r37 - r66
                r0 = 12
                r88[r0] = r37
                long r68 = r68 + r70
                long r39 = r39 - r68
                r0 = 13
                r88[r0] = r39
                long r72 = r72 + r74
                long r42 = r42 - r72
                r88[r41] = r42
                long r45 = r45 - r62
                r88[r44] = r45
                return
            L_0x04d8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            L_0x04de:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.ThreefishEngine.Threefish1024Cipher.decryptBlock(long[], long[]):void");
        }

        /* JADX WARNING: type inference failed for: r101v0, types: [long[]] */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void encryptBlock(long[] r100, long[] r101) {
            /*
                r99 = this;
                r0 = r99
                long[] r1 = r0.f5928kw
                long[] r2 = r0.f5929t
                int[] r3 = org.bouncycastle.crypto.engines.ThreefishEngine.MOD17
                int[] r4 = org.bouncycastle.crypto.engines.ThreefishEngine.MOD3
                int r5 = r1.length
                r6 = 33
                if (r5 != r6) goto L_0x04ba
                int r5 = r2.length
                r6 = 5
                if (r5 != r6) goto L_0x04b4
                r5 = 0
                r7 = r100[r5]
                r9 = 1
                r10 = r100[r9]
                r12 = 2
                r13 = r100[r12]
                r15 = 3
                r16 = r100[r15]
                r15 = 4
                r19 = r100[r15]
                r21 = r100[r6]
                r23 = 6
                r24 = r100[r23]
                r26 = 7
                r27 = r100[r26]
                r6 = 8
                r30 = r100[r6]
                r6 = 9
                r33 = r100[r6]
                r6 = 10
                r36 = r100[r6]
                r38 = 11
                r39 = r100[r38]
                r6 = 12
                r42 = r100[r6]
                r6 = 13
                r45 = r100[r6]
                r47 = 14
                r48 = r100[r47]
                r50 = 15
                r51 = r100[r50]
                r53 = r1[r5]
                long r7 = r7 + r53
                r53 = r1[r9]
                long r10 = r10 + r53
                r53 = r1[r12]
                long r13 = r13 + r53
                r18 = 3
                r53 = r1[r18]
                r55 = r1[r15]
                long r19 = r19 + r55
                r29 = 5
                r55 = r1[r29]
                r57 = r1[r23]
                long r24 = r24 + r57
                r57 = r1[r26]
                r32 = 8
                r59 = r1[r32]
                long r30 = r30 + r59
                r35 = 9
                r59 = r1[r35]
                r41 = 10
                r61 = r1[r41]
                long r36 = r36 + r61
                r61 = r1[r38]
                r44 = 12
                r63 = r1[r44]
                long r42 = r42 + r63
                r63 = r1[r6]
                r65 = r2[r5]
                r67 = r1[r47]
                r69 = r2[r9]
                long r67 = r67 + r69
                long r48 = r48 + r67
                r67 = r1[r50]
                long r16 = r16 + r53
                long r21 = r21 + r55
                long r27 = r27 + r57
                long r33 = r33 + r59
                long r39 = r39 + r61
                long r63 = r63 + r65
                long r45 = r45 + r63
                long r51 = r51 + r67
                r5 = r16
                r71 = r21
                r73 = r27
                r75 = r33
                r77 = r39
                r79 = r45
                r81 = r51
            L_0x00b2:
                r12 = 20
                if (r9 >= r12) goto L_0x0477
                r27 = r3[r9]
                r28 = r4[r9]
                long r7 = r7 + r10
                r12 = 24
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r10, r12, r7)
                long r13 = r13 + r5
                r12 = 13
                long r5 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r5, r12, r13)
                r12 = r1
                r33 = r3
                r34 = r4
                r3 = r71
                long r0 = r19 + r3
                r15 = 8
                long r3 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r3, r15, r0)
                r40 = r9
                r45 = r10
                r51 = r12
                r9 = r73
                long r11 = r24 + r9
                r15 = 47
                long r9 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r9, r15, r11)
                r52 = r2
                r19 = r3
                r53 = r5
                r2 = r75
                long r4 = r30 + r2
                r6 = 8
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r6, r4)
                r24 = r4
                r55 = r9
                r4 = r77
                long r9 = r36 + r4
                r6 = 17
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r4, r6, r9)
                r57 = r0
                r30 = r9
                r9 = r79
                long r0 = r42 + r9
                r6 = 22
                long r9 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r9, r6, r0)
                r36 = r0
                r59 = r4
                r0 = r81
                long r4 = r48 + r0
                r6 = 37
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r6, r4)
                long r7 = r7 + r2
                r6 = 38
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r6, r7)
                long r13 = r13 + r9
                r6 = 19
                long r9 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r9, r6, r13)
                long r11 = r11 + r59
                r48 = r2
                r2 = r59
                r6 = 10
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r6, r11)
                r59 = r2
                long r2 = r57 + r0
                r6 = 55
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r6, r2)
                r57 = r9
                long r9 = r30 + r55
                r6 = 49
                r30 = r0
                r0 = r55
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r6, r9)
                r55 = r9
                long r9 = r36 + r53
                r6 = 18
                r36 = r11
                r11 = r53
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r11, r6, r9)
                long r4 = r4 + r19
                r6 = 23
                r53 = r9
                r9 = r19
                long r9 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r9, r6, r4)
                r19 = r4
                long r4 = r24 + r45
                r6 = 52
                r24 = r2
                r2 = r45
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r6, r4)
                long r7 = r7 + r0
                r6 = 33
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r6, r7)
                long r13 = r13 + r9
                r6 = 4
                long r9 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r9, r6, r13)
                r45 = r0
                long r0 = r24 + r11
                r6 = 51
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r11, r6, r0)
                r24 = r11
                long r11 = r36 + r2
                r6 = 13
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r6, r11)
                r36 = r9
                long r9 = r53 + r30
                r6 = 34
                r53 = r2
                r2 = r30
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r6, r9)
                r30 = r9
                long r9 = r19 + r57
                r6 = 41
                r19 = r0
                r0 = r57
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r6, r9)
                long r4 = r4 + r59
                r15 = 59
                r61 = r7
                r6 = r59
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r6, r15, r4)
                r58 = r9
                long r8 = r55 + r48
                r15 = 17
                r55 = r11
                r10 = r48
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r10, r15, r8)
                r48 = r8
                long r8 = r61 + r2
                r15 = 5
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r15, r8)
                long r13 = r13 + r6
                r15 = 20
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r6, r15, r13)
                r60 = r13
                long r12 = r55 + r0
                r14 = 48
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r14, r12)
                long r14 = r19 + r10
                r19 = r12
                r12 = 41
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r10, r12, r14)
                long r12 = r58 + r53
                r55 = r14
                r14 = r53
                r53 = r8
                r8 = 47
                long r14 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r14, r8, r12)
                long r4 = r4 + r36
                r8 = 28
                r58 = r12
                r12 = r36
                long r8 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r12, r8, r4)
                long r12 = r48 + r24
                r36 = r4
                r4 = 16
                r48 = r2
                r2 = r24
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r4, r12)
                long r4 = r30 + r45
                r30 = r12
                r12 = 25
                r62 = r0
                r0 = r45
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r12, r4)
                r12 = r51[r27]
                int r25 = r27 + 1
                r45 = r51[r25]
                long r14 = r14 + r45
                int r45 = r27 + 2
                r64 = r51[r45]
                int r46 = r27 + 3
                r66 = r51[r46]
                long r2 = r2 + r66
                int r66 = r27 + 4
                r67 = r51[r66]
                int r69 = r27 + 5
                r70 = r51[r69]
                long r8 = r8 + r70
                int r70 = r27 + 6
                r71 = r51[r70]
                int r73 = r27 + 7
                r74 = r51[r73]
                long r0 = r0 + r74
                int r74 = r27 + 8
                r75 = r51[r74]
                int r77 = r27 + 9
                r78 = r51[r77]
                long r10 = r10 + r78
                int r78 = r27 + 10
                r79 = r51[r78]
                int r81 = r27 + 11
                r82 = r51[r81]
                long r6 = r6 + r82
                int r82 = r27 + 12
                r83 = r51[r82]
                int r85 = r27 + 13
                r86 = r51[r85]
                r88 = r52[r28]
                long r86 = r86 + r88
                r88 = r8
                long r8 = r62 + r86
                int r62 = r27 + 14
                r86 = r51[r62]
                int r63 = r28 + 1
                r90 = r52[r63]
                int r92 = r27 + 15
                r93 = r51[r92]
                r97 = r4
                r95 = r8
                r8 = r40
                long r4 = (long) r8
                long r93 = r93 + r4
                long r8 = r48 + r93
                long r12 = r53 + r12
                long r12 = r12 + r14
                r48 = r4
                r4 = 41
                long r14 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r14, r4, r12)
                r4 = r88
                long r53 = r60 + r64
                r60 = r14
                long r14 = r53 + r2
                r53 = r12
                r12 = 9
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r12, r14)
                long r12 = r55 + r67
                long r12 = r12 + r4
                r55 = r2
                r2 = 37
                long r3 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r4, r2, r12)
                long r19 = r19 + r71
                r64 = r3
                long r2 = r19 + r0
                r4 = 31
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r4, r2)
                long r19 = r36 + r75
                long r4 = r19 + r10
                r19 = r0
                r0 = 12
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r10, r0, r4)
                long r0 = r30 + r79
                long r0 = r0 + r6
                r30 = r4
                r4 = 47
                long r5 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r6, r4, r0)
                long r67 = r97 + r83
                r71 = r0
                long r0 = r67 + r95
                r4 = 44
                r67 = r12
                r12 = r95
                long r12 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r12, r4, r0)
                long r86 = r86 + r90
                long r58 = r58 + r86
                r75 = r0
                long r0 = r58 + r8
                r4 = 30
                long r7 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r8, r4, r0)
                r58 = r0
                long r0 = r53 + r10
                r4 = 16
                long r9 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r10, r4, r0)
                long r14 = r14 + r12
                r4 = 34
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r12, r4, r14)
                long r2 = r2 + r5
                r4 = 56
                long r4 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r5, r4, r2)
                r53 = r9
                long r9 = r67 + r7
                r6 = 51
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r7, r6, r9)
                r67 = r4
                long r4 = r71 + r19
                r71 = r11
                r11 = r19
                r8 = 4
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r11, r8, r4)
                r19 = r4
                long r4 = r75 + r55
                r8 = 53
                r75 = r6
                r6 = r55
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r6, r8, r4)
                r55 = r4
                long r4 = r58 + r64
                r8 = 42
                r58 = r2
                r2 = r64
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r8, r4)
                r64 = r4
                long r4 = r30 + r60
                r30 = r6
                r6 = r60
                r8 = 41
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r6, r8, r4)
                long r0 = r0 + r11
                r8 = 31
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r11, r8, r0)
                long r14 = r14 + r2
                r8 = 44
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r8, r14)
                long r9 = r9 + r30
                r60 = r11
                r11 = r30
                r8 = 47
                long r11 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r11, r8, r9)
                r30 = r11
                long r11 = r58 + r6
                r8 = 46
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r6, r8, r11)
                r57 = r2
                long r2 = r55 + r75
                r8 = 19
                r55 = r6
                r6 = r75
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r6, r8, r2)
                r75 = r2
                long r2 = r64 + r71
                r8 = 42
                r64 = r9
                r9 = r71
                long r8 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r9, r8, r2)
                long r4 = r4 + r67
                r10 = 44
                r71 = r2
                r2 = r67
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r10, r4)
                r67 = r4
                long r4 = r19 + r53
                r10 = 25
                r19 = r8
                r8 = r53
                long r8 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r8, r10, r4)
                long r0 = r0 + r6
                r10 = 9
                long r6 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r6, r10, r0)
                long r14 = r14 + r2
                r10 = 48
                long r2 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r2, r10, r14)
                long r11 = r11 + r19
                r10 = 35
                r53 = r14
                r13 = r19
                long r13 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r13, r10, r11)
                r19 = r0
                long r0 = r64 + r8
                r10 = 52
                long r8 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r8, r10, r0)
                r64 = r0
                long r0 = r71 + r55
                r10 = 23
                r71 = r11
                r11 = r55
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r11, r10, r0)
                r55 = r10
                long r10 = r67 + r57
                r67 = r0
                r0 = r57
                r12 = 31
                long r0 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r0, r12, r10)
                long r4 = r4 + r30
                r36 = r10
                r10 = r30
                r12 = 37
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r10, r12, r4)
                r30 = r0
                long r0 = r75 + r60
                r42 = r10
                r10 = r60
                r12 = 20
                long r10 = org.bouncycastle.crypto.engines.ThreefishEngine.rotlXor(r10, r12, r0)
                r57 = r51[r25]
                r59 = r51[r45]
                r45 = r51[r46]
                r75 = r51[r66]
                r79 = r51[r69]
                r69 = r51[r70]
                r83 = r51[r73]
                r73 = r51[r74]
                r86 = r51[r77]
                r77 = r51[r78]
                long r8 = r8 + r77
                r77 = r51[r81]
                long r4 = r4 + r77
                r77 = r51[r82]
                long r77 = r2 + r77
                r2 = r51[r85]
                r61 = r51[r62]
                r81 = r52[r63]
                long r61 = r61 + r81
                long r12 = r13 + r61
                r14 = r51[r92]
                r22 = 2
                int r28 = r28 + 2
                r61 = r52[r28]
                r24 = 16
                int r27 = r27 + 16
                r24 = r51[r27]
                long r24 = r24 + r48
                r27 = 1
                long r24 = r24 + r27
                long r81 = r6 + r24
                long r73 = r10 + r73
                long r6 = r42 + r75
                long r10 = r30 + r69
                long r14 = r14 + r61
                long r48 = r67 + r14
                long r30 = r36 + r86
                long r24 = r71 + r83
                long r42 = r0 + r2
                long r0 = r55 + r59
                int r2 = r40 + 2
                long r14 = r64 + r79
                long r19 = r19 + r57
                long r27 = r53 + r45
                r36 = r4
                r5 = r6
                r75 = r8
                r71 = r10
                r79 = r12
                r7 = r19
                r3 = r33
                r4 = r34
                r10 = r0
                r9 = r2
                r19 = r14
                r13 = r27
                r1 = r51
                r2 = r52
                r15 = 4
                r0 = r99
                goto L_0x00b2
            L_0x0477:
                r15 = r5
                r11 = r10
                r27 = r71
                r2 = r75
                r4 = r77
                r9 = r79
                r0 = r81
                r6 = 0
                r101[r6] = r7
                r6 = 1
                r101[r6] = r11
                r6 = 2
                r101[r6] = r13
                r6 = 3
                r101[r6] = r15
                r6 = 4
                r101[r6] = r19
                r6 = 5
                r101[r6] = r27
                r101[r23] = r24
                r101[r26] = r73
                r6 = 8
                r101[r6] = r30
                r6 = 9
                r101[r6] = r2
                r2 = 10
                r101[r2] = r36
                r101[r38] = r4
                r2 = 12
                r101[r2] = r42
                r2 = 13
                r101[r2] = r9
                r101[r47] = r48
                r101[r50] = r0
                return
            L_0x04b4:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            L_0x04ba:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.ThreefishEngine.Threefish1024Cipher.encryptBlock(long[], long[]):void");
        }
    }

    static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        /* access modifiers changed from: package-private */
        public final void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f5928kw;
            long[] jArr4 = this.f5929t;
            int[] access$000 = ThreefishEngine.MOD5;
            int[] access$100 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            } else if (jArr4.length == 5) {
                boolean z = false;
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                int i = 17;
                while (i > 0) {
                    int i2 = access$000[i];
                    int i3 = access$100[i];
                    int i4 = i2 + 1;
                    long j5 = j - jArr3[i4];
                    int i5 = i2 + 2;
                    long j6 = jArr3[i5];
                    int i6 = i3 + 1;
                    long j7 = jArr4[i6];
                    int i7 = i2 + 3;
                    long j8 = j3 - (jArr3[i7] + jArr4[i3 + 2]);
                    long j9 = (long) i;
                    long xorRotr = ThreefishEngine.xorRotr(j4 - ((jArr3[i2 + 4] + j9) + 1), 32, j5);
                    long j10 = j5 - xorRotr;
                    long j11 = j2 - (j6 + j7);
                    int[] iArr = access$000;
                    long j12 = j8;
                    long xorRotr2 = ThreefishEngine.xorRotr(j11, 32, j12);
                    long j13 = j12 - xorRotr2;
                    long xorRotr3 = ThreefishEngine.xorRotr(xorRotr2, 58, j10);
                    long j14 = j10 - xorRotr3;
                    long xorRotr4 = ThreefishEngine.xorRotr(xorRotr, 22, j13);
                    long j15 = j13 - xorRotr4;
                    long xorRotr5 = ThreefishEngine.xorRotr(xorRotr4, 46, j14);
                    long j16 = j14 - xorRotr5;
                    long xorRotr6 = ThreefishEngine.xorRotr(xorRotr3, 12, j15);
                    long j17 = j15 - xorRotr6;
                    long xorRotr7 = ThreefishEngine.xorRotr(xorRotr6, 25, j16);
                    long xorRotr8 = ThreefishEngine.xorRotr(xorRotr5, 33, j17);
                    long j18 = (j16 - xorRotr7) - jArr3[i2];
                    long j19 = jArr3[i4];
                    long j20 = jArr4[i3];
                    long j21 = (j17 - xorRotr8) - (jArr3[i5] + jArr4[i6]);
                    long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8 - (jArr3[i7] + j9), 5, j18);
                    long j22 = j18 - xorRotr9;
                    long xorRotr10 = ThreefishEngine.xorRotr(xorRotr7 - (j19 + j20), 37, j21);
                    long j23 = j21 - xorRotr10;
                    long xorRotr11 = ThreefishEngine.xorRotr(xorRotr10, 23, j22);
                    long j24 = j22 - xorRotr11;
                    long xorRotr12 = ThreefishEngine.xorRotr(xorRotr9, 40, j23);
                    long j25 = j23 - xorRotr12;
                    long xorRotr13 = ThreefishEngine.xorRotr(xorRotr12, 52, j24);
                    long j26 = j24 - xorRotr13;
                    long xorRotr14 = ThreefishEngine.xorRotr(xorRotr11, 57, j25);
                    long j27 = j25 - xorRotr14;
                    j2 = ThreefishEngine.xorRotr(xorRotr14, 14, j26);
                    j = j26 - j2;
                    j4 = ThreefishEngine.xorRotr(xorRotr13, 16, j27);
                    j3 = j27 - j4;
                    i -= 2;
                    access$000 = iArr;
                    access$100 = access$100;
                    z = false;
                }
                char c = z;
                long j28 = jArr3[c];
                long j29 = jArr3[1];
                long j30 = jArr4[c];
                long j31 = jArr3[2];
                long j32 = jArr4[1];
                long j33 = jArr3[3];
                jArr2[c] = j - j28;
                jArr2[1] = j2 - (j29 + j30);
                jArr2[2] = j3 - (j31 + j32);
                jArr2[3] = j4 - j33;
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* access modifiers changed from: package-private */
        public final void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f5928kw;
            long[] jArr4 = this.f5929t;
            int[] access$000 = ThreefishEngine.MOD5;
            int[] access$100 = ThreefishEngine.MOD3;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            } else if (jArr4.length == 5) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                long j5 = j + jArr3[0];
                long j6 = j2 + jArr3[1] + jArr4[0];
                long j7 = j3 + jArr3[2] + jArr4[1];
                int i = 1;
                long j8 = j4 + jArr3[3];
                while (i < 18) {
                    int i2 = access$000[i];
                    int i3 = access$100[i];
                    long j9 = j5 + j6;
                    long rotlXor = ThreefishEngine.rotlXor(j6, 14, j9);
                    long j10 = j7 + j8;
                    long rotlXor2 = ThreefishEngine.rotlXor(j8, 16, j10);
                    long j11 = j9 + rotlXor2;
                    long rotlXor3 = ThreefishEngine.rotlXor(rotlXor2, 52, j11);
                    long j12 = j10 + rotlXor;
                    long rotlXor4 = ThreefishEngine.rotlXor(rotlXor, 57, j12);
                    long j13 = j11 + rotlXor4;
                    long rotlXor5 = ThreefishEngine.rotlXor(rotlXor4, 23, j13);
                    long j14 = j12 + rotlXor3;
                    long rotlXor6 = ThreefishEngine.rotlXor(rotlXor3, 40, j14);
                    long j15 = j13 + rotlXor6;
                    long rotlXor7 = ThreefishEngine.rotlXor(rotlXor6, 5, j15);
                    long j16 = j14 + rotlXor5;
                    long rotlXor8 = ThreefishEngine.rotlXor(rotlXor5, 37, j16);
                    long j17 = jArr3[i2];
                    int i4 = i2 + 1;
                    long j18 = rotlXor8 + jArr3[i4] + jArr4[i3];
                    int i5 = i2 + 2;
                    long j19 = jArr3[i5];
                    int i6 = i3 + 1;
                    long j20 = jArr4[i6];
                    int i7 = i2 + 3;
                    int[] iArr = access$000;
                    long j21 = (long) i;
                    long j22 = rotlXor7 + jArr3[i7] + j21;
                    long j23 = j15 + j17 + j18;
                    long rotlXor9 = ThreefishEngine.rotlXor(j18, 25, j23);
                    long j24 = j16 + j19 + j20 + j22;
                    long rotlXor10 = ThreefishEngine.rotlXor(j22, 33, j24);
                    long j25 = j23 + rotlXor10;
                    long rotlXor11 = ThreefishEngine.rotlXor(rotlXor10, 46, j25);
                    long j26 = j24 + rotlXor9;
                    long rotlXor12 = ThreefishEngine.rotlXor(rotlXor9, 12, j26);
                    long j27 = j25 + rotlXor12;
                    long rotlXor13 = ThreefishEngine.rotlXor(rotlXor12, 58, j27);
                    long j28 = j26 + rotlXor11;
                    long rotlXor14 = ThreefishEngine.rotlXor(rotlXor11, 22, j28);
                    long j29 = j27 + rotlXor14;
                    long rotlXor15 = ThreefishEngine.rotlXor(rotlXor14, 32, j29);
                    long j30 = j28 + rotlXor13;
                    long rotlXor16 = ThreefishEngine.rotlXor(rotlXor13, 32, j30);
                    j5 = j29 + jArr3[i4];
                    j6 = rotlXor16 + jArr3[i5] + jArr4[i6];
                    j7 = j30 + jArr3[i7] + jArr4[i3 + 2];
                    j8 = rotlXor15 + jArr3[i2 + 4] + j21 + 1;
                    i += 2;
                    access$000 = iArr;
                    access$100 = access$100;
                }
                jArr2[0] = j5;
                jArr2[1] = j6;
                jArr2[2] = j7;
                jArr2[3] = j8;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        protected Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        public final void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f5928kw;
            long[] jArr4 = this.f5929t;
            int[] access$200 = ThreefishEngine.MOD9;
            int[] access$100 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            } else if (jArr4.length == 5) {
                boolean z = false;
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                long j5 = jArr[4];
                long j6 = jArr[5];
                long j7 = jArr[6];
                long j8 = jArr[7];
                int i = 17;
                while (i > 0) {
                    int i2 = access$200[i];
                    int i3 = access$100[i];
                    int i4 = i2 + 1;
                    long j9 = j - jArr3[i4];
                    int i5 = i2 + 2;
                    long j10 = jArr3[i5];
                    int i6 = i2 + 3;
                    long j11 = j3 - jArr3[i6];
                    int i7 = i2 + 4;
                    long j12 = jArr3[i7];
                    int i8 = i2 + 5;
                    long j13 = j5 - jArr3[i8];
                    int i9 = i2 + 6;
                    long j14 = jArr3[i9];
                    int i10 = i3 + 1;
                    long j15 = jArr4[i10];
                    int i11 = i2 + 7;
                    long j16 = j7 - (jArr3[i11] + jArr4[i3 + 2]);
                    long j17 = jArr3[i2 + 8];
                    int[] iArr = access$200;
                    int[] iArr2 = access$100;
                    long j18 = (long) i;
                    long xorRotr = ThreefishEngine.xorRotr(j2 - j10, 8, j16);
                    long xorRotr2 = ThreefishEngine.xorRotr(j8 - ((j17 + j18) + 1), 35, j9);
                    long j19 = j9 - xorRotr2;
                    long j20 = j18;
                    long[] jArr5 = jArr3;
                    long j21 = j11;
                    long xorRotr3 = ThreefishEngine.xorRotr(j6 - (j14 + j15), 56, j21);
                    long xorRotr4 = ThreefishEngine.xorRotr(j4 - j12, 22, j13);
                    long j22 = j13 - xorRotr4;
                    long j23 = j21 - xorRotr3;
                    long xorRotr5 = ThreefishEngine.xorRotr(xorRotr, 25, j22);
                    long j24 = j22 - xorRotr5;
                    long j25 = j16 - xorRotr;
                    long xorRotr6 = ThreefishEngine.xorRotr(xorRotr4, 29, j25);
                    long j26 = j25 - xorRotr6;
                    long xorRotr7 = ThreefishEngine.xorRotr(xorRotr3, 39, j19);
                    int i12 = i;
                    long j27 = j23;
                    long xorRotr8 = ThreefishEngine.xorRotr(xorRotr2, 43, j27);
                    long j28 = j27 - xorRotr8;
                    long xorRotr9 = ThreefishEngine.xorRotr(xorRotr5, 13, j28);
                    long j29 = j28 - xorRotr9;
                    long j30 = j24;
                    long xorRotr10 = ThreefishEngine.xorRotr(xorRotr8, 50, j30);
                    long j31 = j30 - xorRotr10;
                    long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 10, j26);
                    long j32 = j26 - xorRotr11;
                    long j33 = j19 - xorRotr7;
                    long xorRotr12 = ThreefishEngine.xorRotr(xorRotr6, 17, j33);
                    long j34 = j33 - xorRotr12;
                    long xorRotr13 = ThreefishEngine.xorRotr(xorRotr9, 39, j34);
                    long xorRotr14 = ThreefishEngine.xorRotr(xorRotr12, 30, j29);
                    long[] jArr6 = jArr4;
                    long xorRotr15 = ThreefishEngine.xorRotr(xorRotr11, 34, j31);
                    long j35 = j32;
                    long xorRotr16 = ThreefishEngine.xorRotr(xorRotr10, 24, j35);
                    long j36 = (j34 - xorRotr13) - jArr5[i2];
                    long j37 = jArr5[i4];
                    long j38 = (j29 - xorRotr14) - jArr5[i5];
                    long j39 = jArr5[i6];
                    long j40 = (j31 - xorRotr15) - jArr5[i7];
                    long j41 = jArr5[i8];
                    long j42 = jArr6[i3];
                    long j43 = (j35 - xorRotr16) - (jArr5[i9] + jArr6[i10]);
                    long j44 = jArr5[i11];
                    long xorRotr17 = ThreefishEngine.xorRotr(xorRotr13 - j37, 44, j43);
                    long j45 = j43 - xorRotr17;
                    long xorRotr18 = ThreefishEngine.xorRotr(xorRotr16 - (j44 + j20), 9, j36);
                    long j46 = j36 - xorRotr18;
                    long j47 = xorRotr18;
                    long xorRotr19 = ThreefishEngine.xorRotr(xorRotr15 - (j41 + j42), 54, j38);
                    long j48 = j38 - xorRotr19;
                    long xorRotr20 = ThreefishEngine.xorRotr(xorRotr14 - j39, 56, j40);
                    long j49 = j40 - xorRotr20;
                    long xorRotr21 = ThreefishEngine.xorRotr(xorRotr17, 17, j49);
                    long j50 = j49 - xorRotr21;
                    long xorRotr22 = ThreefishEngine.xorRotr(xorRotr20, 49, j45);
                    long j51 = j45 - xorRotr22;
                    long xorRotr23 = ThreefishEngine.xorRotr(xorRotr19, 36, j46);
                    long xorRotr24 = ThreefishEngine.xorRotr(j47, 39, j48);
                    long j52 = j48 - xorRotr24;
                    long xorRotr25 = ThreefishEngine.xorRotr(xorRotr21, 33, j52);
                    long j53 = j52 - xorRotr25;
                    long xorRotr26 = ThreefishEngine.xorRotr(xorRotr24, 27, j50);
                    long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 14, j51);
                    long j54 = j51 - xorRotr27;
                    long j55 = j46 - xorRotr23;
                    long xorRotr28 = ThreefishEngine.xorRotr(xorRotr22, 42, j55);
                    long j56 = j55 - xorRotr28;
                    long xorRotr29 = ThreefishEngine.xorRotr(xorRotr25, 46, j56);
                    long xorRotr30 = ThreefishEngine.xorRotr(xorRotr28, 36, j53);
                    long j57 = xorRotr29;
                    long j58 = j50 - xorRotr26;
                    j6 = ThreefishEngine.xorRotr(xorRotr27, 19, j58);
                    j8 = ThreefishEngine.xorRotr(xorRotr26, 37, j54);
                    j7 = j54 - j8;
                    long j59 = j53 - xorRotr30;
                    i = i12 - 2;
                    j = j56 - j57;
                    j3 = j59;
                    j4 = xorRotr30;
                    j2 = j57;
                    jArr4 = jArr6;
                    access$200 = iArr;
                    access$100 = iArr2;
                    z = false;
                    j5 = j58 - j6;
                    jArr3 = jArr5;
                }
                long[] jArr7 = jArr3;
                long[] jArr8 = jArr4;
                char c = z;
                long j60 = jArr7[c];
                long j61 = jArr7[1];
                long j62 = jArr7[2];
                long j63 = jArr7[3];
                long j64 = jArr7[4];
                long j65 = jArr7[5];
                long j66 = jArr8[c];
                long j67 = jArr7[6];
                long j68 = jArr8[1];
                long j69 = jArr7[7];
                jArr2[c] = j - j60;
                jArr2[1] = j2 - j61;
                jArr2[2] = j3 - j62;
                jArr2[3] = j4 - j63;
                jArr2[4] = j5 - j64;
                jArr2[5] = j6 - (j65 + j66);
                jArr2[6] = j7 - (j67 + j68);
                jArr2[7] = j8 - j69;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public final void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f5928kw;
            long[] jArr4 = this.f5929t;
            int[] access$200 = ThreefishEngine.MOD9;
            int[] access$100 = ThreefishEngine.MOD3;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            } else if (jArr4.length == 5) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                long j5 = jArr[4];
                long j6 = jArr[5];
                long j7 = jArr[6];
                long j8 = jArr[7];
                long j9 = j + jArr3[0];
                long j10 = j2 + jArr3[1];
                long j11 = j3 + jArr3[2];
                long j12 = jArr3[3];
                long j13 = j5 + jArr3[4];
                long j14 = jArr3[5];
                long j15 = jArr4[0];
                long j16 = j7 + jArr3[6] + jArr4[1];
                int i = 1;
                long j17 = j4 + j12;
                long j18 = j6 + j14 + j15;
                long j19 = j8 + jArr3[7];
                while (i < 18) {
                    int i2 = access$200[i];
                    int i3 = access$100[i];
                    long j20 = j9 + j10;
                    long rotlXor = ThreefishEngine.rotlXor(j10, 46, j20);
                    long j21 = j11 + j17;
                    long rotlXor2 = ThreefishEngine.rotlXor(j17, 36, j21);
                    long j22 = j18;
                    int[] iArr = access$200;
                    long j23 = j13 + j22;
                    long rotlXor3 = ThreefishEngine.rotlXor(j22, 19, j23);
                    long[] jArr5 = jArr3;
                    long j24 = rotlXor2;
                    long j25 = j19;
                    long j26 = j16 + j25;
                    int[] iArr2 = iArr;
                    long rotlXor4 = ThreefishEngine.rotlXor(j25, 37, j26);
                    int i4 = i;
                    long j27 = j21 + rotlXor;
                    long rotlXor5 = ThreefishEngine.rotlXor(rotlXor, 33, j27);
                    long j28 = j23 + rotlXor4;
                    long rotlXor6 = ThreefishEngine.rotlXor(rotlXor4, 27, j28);
                    long j29 = j26 + rotlXor3;
                    long rotlXor7 = ThreefishEngine.rotlXor(rotlXor3, 14, j29);
                    int i5 = i2;
                    long j30 = j20 + j24;
                    int i6 = i4;
                    long j31 = rotlXor6;
                    long rotlXor8 = ThreefishEngine.rotlXor(j24, 42, j30);
                    long j32 = j28 + rotlXor5;
                    long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 17, j32);
                    long j33 = j29 + rotlXor8;
                    long rotlXor10 = ThreefishEngine.rotlXor(rotlXor8, 49, j33);
                    long j34 = j30 + rotlXor7;
                    long rotlXor11 = ThreefishEngine.rotlXor(rotlXor7, 36, j34);
                    long j35 = j27 + j31;
                    long j36 = rotlXor10;
                    long rotlXor12 = ThreefishEngine.rotlXor(j31, 39, j35);
                    long j37 = j33 + rotlXor9;
                    long rotlXor13 = ThreefishEngine.rotlXor(rotlXor9, 44, j37);
                    long j38 = j34 + rotlXor12;
                    long rotlXor14 = ThreefishEngine.rotlXor(rotlXor12, 9, j38);
                    long j39 = j35 + rotlXor11;
                    long rotlXor15 = ThreefishEngine.rotlXor(rotlXor11, 54, j39);
                    long j40 = j32 + j36;
                    long j41 = j37;
                    long rotlXor16 = ThreefishEngine.rotlXor(j36, 56, j40);
                    long j42 = jArr5[i5];
                    int i7 = i5 + 1;
                    long j43 = rotlXor13 + jArr5[i7];
                    int i8 = i5 + 2;
                    long j44 = jArr5[i8];
                    int i9 = i5 + 3;
                    long j45 = rotlXor16 + jArr5[i9];
                    int i10 = i5 + 4;
                    long j46 = jArr5[i10];
                    int i11 = i5 + 5;
                    long j47 = rotlXor15 + jArr5[i11] + jArr4[i3];
                    int i12 = i5 + 6;
                    long j48 = jArr5[i12];
                    int i13 = i3 + 1;
                    long j49 = jArr4[i13];
                    int i14 = i5 + 7;
                    long j50 = j47;
                    long j51 = (long) i6;
                    long j52 = rotlXor14 + jArr5[i14] + j51;
                    long j53 = j38 + j42 + j43;
                    long rotlXor17 = ThreefishEngine.rotlXor(j43, 39, j53);
                    long j54 = j39 + j44 + j45;
                    long rotlXor18 = ThreefishEngine.rotlXor(j45, 30, j54);
                    long j55 = j40 + j46 + j50;
                    long j56 = j51;
                    long rotlXor19 = ThreefishEngine.rotlXor(j50, 34, j55);
                    long j57 = rotlXor18;
                    long j58 = j41 + j48 + j49 + j52;
                    long rotlXor20 = ThreefishEngine.rotlXor(j52, 24, j58);
                    long j59 = j54 + rotlXor17;
                    long rotlXor21 = ThreefishEngine.rotlXor(rotlXor17, 13, j59);
                    long j60 = j55 + rotlXor20;
                    long rotlXor22 = ThreefishEngine.rotlXor(rotlXor20, 50, j60);
                    long j61 = j58 + rotlXor19;
                    long rotlXor23 = ThreefishEngine.rotlXor(rotlXor19, 10, j61);
                    long j62 = j53 + j57;
                    long j63 = rotlXor22;
                    long rotlXor24 = ThreefishEngine.rotlXor(j57, 17, j62);
                    long j64 = j60 + rotlXor21;
                    long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 25, j64);
                    long j65 = j61 + rotlXor24;
                    long rotlXor26 = ThreefishEngine.rotlXor(rotlXor24, 29, j65);
                    long j66 = j62 + rotlXor23;
                    long rotlXor27 = ThreefishEngine.rotlXor(rotlXor23, 39, j66);
                    long j67 = j59 + j63;
                    long j68 = rotlXor26;
                    long rotlXor28 = ThreefishEngine.rotlXor(j63, 43, j67);
                    long j69 = j65 + rotlXor25;
                    long rotlXor29 = ThreefishEngine.rotlXor(rotlXor25, 8, j69);
                    long j70 = j66 + rotlXor28;
                    long rotlXor30 = ThreefishEngine.rotlXor(rotlXor28, 35, j70);
                    long j71 = j67 + rotlXor27;
                    long rotlXor31 = ThreefishEngine.rotlXor(rotlXor27, 56, j71);
                    long j72 = j64 + j68;
                    long j73 = j70;
                    long rotlXor32 = ThreefishEngine.rotlXor(j68, 22, j72);
                    long j74 = jArr5[i7];
                    j10 = rotlXor29 + jArr5[i8];
                    long j75 = jArr5[i9];
                    long j76 = jArr5[i10];
                    long j77 = jArr5[i11];
                    long j78 = jArr5[i12];
                    long j79 = jArr4[i13];
                    int i15 = i6 + 2;
                    long j80 = j73 + j74;
                    j19 = rotlXor30 + jArr5[i5 + 8] + j56 + 1;
                    j16 = j69 + jArr5[i14] + jArr4[i3 + 2];
                    j17 = rotlXor32 + j76;
                    j18 = rotlXor31 + j78 + j79;
                    jArr3 = jArr5;
                    long j81 = j71 + j75;
                    i = i15;
                    j11 = j81;
                    j9 = j80;
                    j13 = j72 + j77;
                    access$100 = access$100;
                    access$200 = iArr2;
                }
                jArr2[0] = j9;
                jArr2[1] = j10;
                jArr2[2] = j11;
                jArr2[3] = j17;
                jArr2[4] = j13;
                jArr2[5] = j18;
                jArr2[6] = j16;
                jArr2[7] = j19;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    static abstract class ThreefishCipher {

        /* renamed from: kw */
        protected final long[] f5928kw;

        /* renamed from: t */
        protected final long[] f5929t;

        protected ThreefishCipher(long[] jArr, long[] jArr2) {
            this.f5928kw = jArr;
            this.f5929t = jArr2;
        }

        /* access modifiers changed from: package-private */
        public abstract void decryptBlock(long[] jArr, long[] jArr2);

        /* access modifiers changed from: package-private */
        public abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int i = 0;
        while (true) {
            int[] iArr = MOD9;
            if (i < iArr.length) {
                MOD17[i] = i % 17;
                iArr[i] = i % 9;
                MOD5[i] = i % 5;
                MOD3[i] = i % 3;
                i++;
            } else {
                return;
            }
        }
    }

    public ThreefishEngine(int i) {
        ThreefishCipher threefishCipher;
        long[] jArr = new long[5];
        this.f5927t = jArr;
        int i2 = i / 8;
        this.blocksizeBytes = i2;
        int i3 = i2 / 8;
        this.blocksizeWords = i3;
        this.currentBlock = new long[i3];
        long[] jArr2 = new long[((i3 << 1) + 1)];
        this.f5926kw = jArr2;
        if (i == 256) {
            threefishCipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i == 512) {
            threefishCipher = new Threefish512Cipher(jArr2, jArr);
        } else if (i == 1024) {
            threefishCipher = new Threefish1024Cipher(jArr2, jArr);
        } else {
            throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
        }
        this.cipher = threefishCipher;
    }

    public static long bytesToWord(byte[] bArr, int i) {
        byte[] bArr2 = bArr;
        if (i + 8 <= bArr2.length) {
            int i2 = i + 1;
            int i3 = i2 + 1;
            long j = (long) bArr2[i2];
            int i4 = i3 + 1;
            long j2 = (long) bArr2[i3];
            int i5 = i4 + 1;
            long j3 = (long) bArr2[i4];
            int i6 = i5 + 1;
            long j4 = (long) bArr2[i5];
            int i7 = i6 + 1;
            return ((((long) bArr2[i7 + 1]) & 255) << 56) | (((long) bArr2[i]) & 255) | ((j & 255) << 8) | ((j2 & 255) << 16) | ((j3 & 255) << 24) | ((j4 & 255) << 32) | ((((long) bArr2[i6]) & 255) << 40) | ((((long) bArr2[i7]) & 255) << 48);
        }
        throw new IllegalArgumentException();
    }

    static long rotlXor(long j, int i, long j2) {
        return ((j << i) | (j >>> (-i))) ^ j2;
    }

    private void setKey(long[] jArr) {
        if (jArr.length == this.blocksizeWords) {
            long j = C_240;
            int i = 0;
            while (true) {
                int i2 = this.blocksizeWords;
                if (i < i2) {
                    long[] jArr2 = this.f5926kw;
                    jArr2[i] = jArr[i];
                    j ^= jArr2[i];
                    i++;
                } else {
                    long[] jArr3 = this.f5926kw;
                    jArr3[i2] = j;
                    System.arraycopy(jArr3, 0, jArr3, i2 + 1, i2);
                    return;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Threefish key must be same size as block (");
            sb.append(this.blocksizeWords);
            sb.append(" words)");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length == 2) {
            long[] jArr2 = this.f5927t;
            jArr2[0] = jArr[0];
            jArr2[1] = jArr[1];
            jArr2[2] = jArr2[0] ^ jArr2[1];
            jArr2[3] = jArr2[0];
            jArr2[4] = jArr2[1];
            return;
        }
        throw new IllegalArgumentException("Tweak must be 2 words.");
    }

    public static void wordToBytes(long j, byte[] bArr, int i) {
        if (i + 8 <= bArr.length) {
            int i2 = i + 1;
            bArr[i] = (byte) ((int) j);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) (j >> 8));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) (j >> 16));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (j >> 24));
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((int) (j >> 32));
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((int) (j >> 40));
            bArr[i7] = (byte) ((int) (j >> 48));
            bArr[i7 + 1] = (byte) ((int) (j >> 56));
            return;
        }
        throw new IllegalArgumentException();
    }

    static long xorRotr(long j, int i, long j2) {
        long j3 = j ^ j2;
        return (j3 >>> i) | (j3 << (-i));
    }

    public String getAlgorithmName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Threefish-");
        sb.append(this.blocksizeBytes << 3);
        return sb.toString();
    }

    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] bArr;
        byte[] bArr2;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            bArr2 = tweakableBlockCipherParameters.getKey().getKey();
            bArr = tweakableBlockCipherParameters.getTweak();
        } else if (cipherParameters instanceof KeyParameter) {
            bArr2 = ((KeyParameter) cipherParameters).getKey();
            bArr = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameter passed to Threefish init - ");
            sb.append(cipherParameters.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
        if (bArr2 == null) {
            jArr = null;
        } else if (bArr2.length == this.blocksizeBytes) {
            int i = this.blocksizeWords;
            jArr = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = bytesToWord(bArr2, i2 << 3);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Threefish key must be same size as block (");
            sb2.append(this.blocksizeBytes);
            sb2.append(" bytes)");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (bArr != null) {
            if (bArr.length == 16) {
                jArr2 = new long[]{bytesToWord(bArr, 0), bytesToWord(bArr, 8)};
            } else {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
        }
        init(z, jArr, jArr2);
    }

    public void init(boolean z, long[] jArr, long[] jArr2) {
        this.forEncryption = z;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }

    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.blocksizeBytes;
        if (i2 + i3 > bArr2.length) {
            throw new DataLengthException("Output buffer too short");
        } else if (i3 + i <= bArr.length) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.blocksizeBytes; i5 += 8) {
                this.currentBlock[i5 >> 3] = bytesToWord(bArr, i + i5);
            }
            long[] jArr = this.currentBlock;
            processBlock(jArr, jArr);
            while (true) {
                int i6 = this.blocksizeBytes;
                if (i4 >= i6) {
                    return i6;
                }
                wordToBytes(this.currentBlock[i4 >> 3], bArr2, i2 + i4);
                i4 += 8;
            }
        } else {
            throw new DataLengthException("Input buffer too short");
        }
    }

    public int processBlock(long[] jArr, long[] jArr2) throws DataLengthException, IllegalStateException {
        long[] jArr3 = this.f5926kw;
        int i = this.blocksizeWords;
        if (jArr3[i] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        } else if (jArr.length != i) {
            throw new DataLengthException("Input buffer too short");
        } else if (jArr2.length == i) {
            if (this.forEncryption) {
                this.cipher.encryptBlock(jArr, jArr2);
            } else {
                this.cipher.decryptBlock(jArr, jArr2);
            }
            return this.blocksizeWords;
        } else {
            throw new DataLengthException("Output buffer too short");
        }
    }

    public void reset() {
    }
}
