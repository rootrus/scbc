package p040o;

/* renamed from: o.AccountSelectorAdapter$ItemViewHolder */
public enum AccountSelectorAdapter$ItemViewHolder implements AdditionDocumentAdapter$DocumentViewHolder {
    CVCA(192),
    DV_D(128),
    DV_F(64),
    AUTHTERM(0);
    
    private byte value;

    private AccountSelectorAdapter$ItemViewHolder(int i) {
        this.value = (byte) i;
    }

    public final byte read() {
        return this.value;
    }

    public final boolean IconCompatParcelizer() {
        return this == CVCA;
    }

    /* renamed from: o.AccountSelectorAdapter$ItemViewHolder$3 */
    static /* synthetic */ class C103873 {
        static final /* synthetic */ int[] write = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.AccountSelectorAdapter$ItemViewHolder[] r0 = p040o.AccountSelectorAdapter$ItemViewHolder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.AccountSelectorAdapter$ItemViewHolder r1 = p040o.AccountSelectorAdapter$ItemViewHolder.CVCA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.AccountSelectorAdapter$ItemViewHolder r1 = p040o.AccountSelectorAdapter$ItemViewHolder.DV_D     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.AccountSelectorAdapter$ItemViewHolder r1 = p040o.AccountSelectorAdapter$ItemViewHolder.DV_F     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.AccountSelectorAdapter$ItemViewHolder r1 = p040o.AccountSelectorAdapter$ItemViewHolder.AUTHTERM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AccountSelectorAdapter$ItemViewHolder.C103873.<clinit>():void");
        }
    }

    public final String toString() {
        int i = C103873.write[ordinal()];
        if (i == 1) {
            return "CVCA";
        }
        if (i == 2) {
            return "DV-domestic";
        }
        if (i == 3) {
            return "DV-foreign";
        }
        if (i == 4) {
            return "Authentication-Terminal";
        }
        throw new IllegalStateException("Enum case not handled");
    }
}
