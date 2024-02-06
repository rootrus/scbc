package p040o;

import android.util.SparseArray;

/* renamed from: o.inverse */
public enum inverse {
    DEFAULT,
    UNMETERED_ONLY,
    UNMETERED_OR_DAILY,
    FAST_IF_RADIO_AWAKE,
    NEVER,
    UNRECOGNIZED;
    
    private static final SparseArray<inverse> zzg = null;

    static {
        DEFAULT = new inverse("DEFAULT", 0);
        UNMETERED_ONLY = new inverse("UNMETERED_ONLY", 1);
        UNMETERED_OR_DAILY = new inverse("UNMETERED_OR_DAILY", 2);
        FAST_IF_RADIO_AWAKE = new inverse("FAST_IF_RADIO_AWAKE", 3);
        NEVER = new inverse("NEVER", 4);
        UNRECOGNIZED = new inverse("UNRECOGNIZED", 5);
        SparseArray<inverse> sparseArray = new SparseArray<>();
        zzg = sparseArray;
        sparseArray.put(0, DEFAULT);
        zzg.put(1, UNMETERED_ONLY);
        zzg.put(2, UNMETERED_OR_DAILY);
        zzg.put(3, FAST_IF_RADIO_AWAKE);
        zzg.put(4, NEVER);
        zzg.put(-1, UNRECOGNIZED);
    }
}
