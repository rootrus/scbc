package p040o;

import com.kofax.mobile.sdk.p026o.C0981a;

/* renamed from: o.isInitialized */
public final class isInitialized {
    public static final isInitialized MediaBrowserCompat$ItemReceiver = new isInitialized();

    private isInitialized() {
    }

    public static zzwf MediaBrowserCompat$CustomActionResultReceiver(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1999289321) {
                if (hashCode == 71686937) {
                    boolean equals = str.equals("KOFAX");
                }
            } else if (str.equals(C0981a.f2377Il)) {
                return zzwf.NATIVE;
            }
        }
        return zzwf.KOFAX;
    }
}
