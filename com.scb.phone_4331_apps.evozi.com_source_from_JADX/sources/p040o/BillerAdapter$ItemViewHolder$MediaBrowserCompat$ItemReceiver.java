package p040o;

import p040o.BillerAdapter$ItemViewHolder;

/* renamed from: o.BillerAdapter$ItemViewHolder$MediaBrowserCompat$ItemReceiver */
enum BillerAdapter$ItemViewHolder$MediaBrowserCompat$ItemReceiver implements EBillAdapter$EBillHolder_ViewBinding {
    WEEK_BASED_YEARS("WeekBasedYears", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(7889238));
    
    private final QuickAccountSelectAdapter$SelectedHolder_ViewBinding duration;
    private final String name;

    public final boolean isDateBased() {
        return true;
    }

    public final boolean isDurationEstimated() {
        return true;
    }

    public final boolean isTimeBased() {
        return false;
    }

    private BillerAdapter$ItemViewHolder$MediaBrowserCompat$ItemReceiver(String str, QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
        this.name = str;
        this.duration = quickAccountSelectAdapter$SelectedHolder_ViewBinding;
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding getDuration() {
        return this.duration;
    }

    public final boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY);
    }

    public final <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R addTo(R r, long j) {
        int i = BillerAdapter$ItemViewHolder.C63381.$SwitchMap$org$threeten$bp$temporal$IsoFields$Unit[ordinal()];
        if (i == 1) {
            return r.with(BillerAdapter$ItemViewHolder.WEEK_BASED_YEAR, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd((long) r.get(BillerAdapter$ItemViewHolder.WEEK_BASED_YEAR), j));
        } else if (i == 2) {
            return r.plus(j / 256, BillerAdapter$ItemViewHolder_ViewBinding.YEARS).plus((j % 256) * 3, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
        } else {
            throw new IllegalStateException("Unreachable");
        }
    }

    public final long between(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder2) {
        int i = BillerAdapter$ItemViewHolder.C63381.$SwitchMap$org$threeten$bp$temporal$IsoFields$Unit[ordinal()];
        if (i == 1) {
            return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(denominatorAmountAdapter$BubbleViewDisableHolder2.getLong(BillerAdapter$ItemViewHolder.WEEK_BASED_YEAR), denominatorAmountAdapter$BubbleViewDisableHolder.getLong(BillerAdapter$ItemViewHolder.WEEK_BASED_YEAR));
        }
        if (i == 2) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.until(denominatorAmountAdapter$BubbleViewDisableHolder2, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    public final String toString() {
        return this.name;
    }
}
