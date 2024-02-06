package com.kofax.kmc.kut.utilities;

public class MemoryHelper {
    private static final String TAG = MemoryHelper.class.getSimpleName();

    /* renamed from: nD */
    private static long f3595nD = 0;

    /* renamed from: nE */
    private static long f3596nE = 0;

    /* renamed from: nF */
    private static long f3597nF = 0;

    /* renamed from: nG */
    private static long f3598nG = 0;

    public static long getTotalFreeMemory() {
        f3595nD = Runtime.getRuntime().maxMemory();
        f3596nE = Runtime.getRuntime().freeMemory();
        long j = Runtime.getRuntime().totalMemory();
        f3597nF = j;
        long j2 = j - f3596nE;
        f3598nG = j2;
        return f3595nD - j2;
    }

    public static float getTotalFreeMemoryAsPctOfMax() {
        return ((float) getTotalFreeMemory()) / ((float) f3595nD);
    }
}
