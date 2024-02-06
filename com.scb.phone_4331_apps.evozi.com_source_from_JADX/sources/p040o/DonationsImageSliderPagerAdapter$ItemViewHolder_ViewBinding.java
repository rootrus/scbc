package p040o;

import com.kofax.mobile.sdk.p083w.C8515ao;

/* renamed from: o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding */
public enum DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding implements DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding {
    ACCESS_NONE(0),
    ACCESS_SIGN(1),
    ACCESS_QUALSIGN(2),
    ACCESS_SIGN_AND_QUALSIGN(3);
    
    byte value;

    private DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding(int i) {
        this.value = (byte) i;
    }

    public final byte[] read() {
        return new byte[]{this.value};
    }

    /* renamed from: o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding$4 */
    static /* synthetic */ class C103964 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding r1 = p040o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding.ACCESS_SIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding r1 = p040o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding.ACCESS_QUALSIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding r1 = p040o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding.ACCESS_SIGN_AND_QUALSIGN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding r1 = p040o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding.ACCESS_NONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding.C103964.<clinit>():void");
        }
    }

    public final String toString() {
        int i = C103964.MediaBrowserCompat$ItemReceiver[ordinal()];
        if (i == 1) {
            return C8515ao.f5179Qz;
        }
        if (i == 2) {
            return "Qualified_Signature";
        }
        if (i == 3) {
            return "Signature_and_Qualified_Signature";
        }
        if (i == 4) {
            return "none";
        }
        throw new IllegalStateException("Enum case not handled");
    }
}
