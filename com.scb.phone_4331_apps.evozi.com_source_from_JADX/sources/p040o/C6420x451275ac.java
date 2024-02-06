package p040o;

/* renamed from: o.DenominatorAmountAdapter$BubbleViewHolder$MediaBrowserCompat$ItemReceiver */
class C6420x451275ac implements AccountSourceAdapter$ItemViewHolder_ViewBinding {
    /* access modifiers changed from: private */
    public static final C6420x451275ac FIRST_DAY_OF_MONTH = new C6420x451275ac(0);
    /* access modifiers changed from: private */
    public static final C6420x451275ac FIRST_DAY_OF_NEXT_MONTH = new C6420x451275ac(2);
    /* access modifiers changed from: private */
    public static final C6420x451275ac FIRST_DAY_OF_NEXT_YEAR = new C6420x451275ac(5);
    /* access modifiers changed from: private */
    public static final C6420x451275ac FIRST_DAY_OF_YEAR = new C6420x451275ac(3);
    /* access modifiers changed from: private */
    public static final C6420x451275ac LAST_DAY_OF_MONTH = new C6420x451275ac(1);
    /* access modifiers changed from: private */
    public static final C6420x451275ac LAST_DAY_OF_YEAR = new C6420x451275ac(4);
    private final int ordinal;

    private C6420x451275ac(int i) {
        this.ordinal = i;
    }

    public DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        int i = this.ordinal;
        if (i == 0) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, 1);
        }
        if (i == 1) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, denominatorAmountAdapter$BubbleViewDisableHolder.range(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).getMaximum());
        }
        if (i == 2) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, 1).plus(1, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
        }
        if (i == 3) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR, 1);
        }
        if (i == 4) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR, denominatorAmountAdapter$BubbleViewDisableHolder.range(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).getMaximum());
        }
        if (i == 5) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR, 1).plus(1, BillerAdapter$ItemViewHolder_ViewBinding.YEARS);
        }
        throw new IllegalStateException("Unreachable");
    }
}
