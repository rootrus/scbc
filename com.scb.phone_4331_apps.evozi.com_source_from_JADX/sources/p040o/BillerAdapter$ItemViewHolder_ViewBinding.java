package p040o;

/* renamed from: o.BillerAdapter$ItemViewHolder_ViewBinding */
public enum BillerAdapter$ItemViewHolder_ViewBinding implements EBillAdapter$EBillHolder_ViewBinding {
    NANOS("Nanos", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofNanos(1)),
    MICROS("Micros", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofNanos(1000)),
    MILLIS("Millis", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofNanos(1000000)),
    SECONDS("Seconds", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(1)),
    MINUTES("Minutes", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(60)),
    HOURS("Hours", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(3600)),
    HALF_DAYS("HalfDays", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(43200)),
    DAYS("Days", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(86400)),
    WEEKS("Weeks", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(604800)),
    MONTHS("Months", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(2629746)),
    YEARS("Years", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(31556952)),
    DECADES("Decades", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(315569520)),
    CENTURIES("Centuries", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(31556952000L)),
    ERAS("Eras", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(31556952000000000L)),
    FOREVER("Forever", QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofSeconds(Long.MAX_VALUE, 999999999));
    
    private final QuickAccountSelectAdapter$SelectedHolder_ViewBinding duration;
    private final String name;

    private BillerAdapter$ItemViewHolder_ViewBinding(String str, QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
        this.name = str;
        this.duration = quickAccountSelectAdapter$SelectedHolder_ViewBinding;
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding getDuration() {
        return this.duration;
    }

    public final boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    public final boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public final boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    public final boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        if (this == FOREVER) {
            return false;
        }
        if (denominatorAmountAdapter$BubbleViewDisableHolder instanceof PromptPayMobileListAdapter$PromptPayListView) {
            return isDateBased();
        }
        if ((denominatorAmountAdapter$BubbleViewDisableHolder instanceof DepositAccountsAdapter$DepositAccountHolder_ViewBinding) || (denominatorAmountAdapter$BubbleViewDisableHolder instanceof PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding)) {
            return true;
        }
        try {
            denominatorAmountAdapter$BubbleViewDisableHolder.plus(1, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                denominatorAmountAdapter$BubbleViewDisableHolder.plus(-1, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    public final <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R addTo(R r, long j) {
        return r.plus(j, this);
    }

    public final long between(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder2) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.until(denominatorAmountAdapter$BubbleViewDisableHolder2, this);
    }

    public final String toString() {
        return this.name;
    }
}
