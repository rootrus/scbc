package org.ejbca.cvc;

import p040o.DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding;

public enum AccessRightEnum implements DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding {
    READ_ACCESS_NONE(0),
    READ_ACCESS_DG3(1),
    READ_ACCESS_DG4(2),
    READ_ACCESS_DG3_AND_DG4(3);
    
    public byte value;

    private AccessRightEnum(int i) {
        this.value = (byte) i;
    }

    public final byte[] read() {
        return new byte[]{this.value};
    }

    /* renamed from: org.ejbca.cvc.AccessRightEnum$2 */
    static /* synthetic */ class C104842 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.ejbca.cvc.AccessRightEnum[] r0 = org.ejbca.cvc.AccessRightEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                org.ejbca.cvc.AccessRightEnum r1 = org.ejbca.cvc.AccessRightEnum.READ_ACCESS_DG3_AND_DG4     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                org.ejbca.cvc.AccessRightEnum r1 = org.ejbca.cvc.AccessRightEnum.READ_ACCESS_DG4     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.ejbca.cvc.AccessRightEnum r1 = org.ejbca.cvc.AccessRightEnum.READ_ACCESS_DG3     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.ejbca.cvc.AccessRightEnum r1 = org.ejbca.cvc.AccessRightEnum.READ_ACCESS_NONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.ejbca.cvc.AccessRightEnum.C104842.<clinit>():void");
        }
    }

    public final String toString() {
        int i = C104842.MediaBrowserCompat$ItemReceiver[ordinal()];
        if (i == 1) {
            return "DG3+DG4";
        }
        if (i == 2) {
            return "DG4";
        }
        if (i == 3) {
            return "DG3";
        }
        if (i == 4) {
            return "none";
        }
        throw new IllegalStateException("Enum case not handled");
    }
}
