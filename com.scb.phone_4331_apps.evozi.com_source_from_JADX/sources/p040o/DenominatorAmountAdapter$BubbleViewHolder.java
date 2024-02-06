package p040o;

/* renamed from: o.DenominatorAmountAdapter$BubbleViewHolder */
public final class DenominatorAmountAdapter$BubbleViewHolder {
    public String IconCompatParcelizer;

    private DenominatorAmountAdapter$BubbleViewHolder() {
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding firstDayOfMonth() {
        return C6420x451275ac.FIRST_DAY_OF_MONTH;
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding lastDayOfMonth() {
        return C6420x451275ac.LAST_DAY_OF_MONTH;
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding firstDayOfNextMonth() {
        return C6420x451275ac.FIRST_DAY_OF_NEXT_MONTH;
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding firstDayOfYear() {
        return C6420x451275ac.FIRST_DAY_OF_YEAR;
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding lastDayOfYear() {
        return C6420x451275ac.LAST_DAY_OF_YEAR;
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding firstDayOfNextYear() {
        return C6420x451275ac.FIRST_DAY_OF_NEXT_YEAR;
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding firstInMonth(QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$FooterHolder_ViewBinding, "dayOfWeek");
        return new write(1, quickAccountSelectAdapter$FooterHolder_ViewBinding);
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding lastInMonth(QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$FooterHolder_ViewBinding, "dayOfWeek");
        return new write(-1, quickAccountSelectAdapter$FooterHolder_ViewBinding);
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding dayOfWeekInMonth(int i, QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$FooterHolder_ViewBinding, "dayOfWeek");
        return new write(i, quickAccountSelectAdapter$FooterHolder_ViewBinding);
    }

    /* renamed from: o.DenominatorAmountAdapter$BubbleViewHolder$write */
    static final class write implements AccountSourceAdapter$ItemViewHolder_ViewBinding {
        private final int dowValue;
        private final int ordinal;

        private write(int i, QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
            this.ordinal = i;
            this.dowValue = quickAccountSelectAdapter$FooterHolder_ViewBinding.getValue();
        }

        public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
            if (this.ordinal >= 0) {
                DenominatorAmountAdapter$BubbleViewDisableHolder with = denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, 1);
                return with.plus((long) ((int) (((long) (((this.dowValue - with.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) + 7) % 7)) + ((((long) this.ordinal) - 1) * 7))), BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
            }
            DenominatorAmountAdapter$BubbleViewDisableHolder with2 = denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, denominatorAmountAdapter$BubbleViewDisableHolder.range(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).getMaximum());
            int i = this.dowValue - with2.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
            if (i == 0) {
                i = 0;
            } else if (i > 0) {
                i -= 7;
            }
            return with2.plus((long) ((int) (((long) i) - ((((long) (-this.ordinal)) - 1) * 7))), BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
        }
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding next(QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
        return new IconCompatParcelizer(2, quickAccountSelectAdapter$FooterHolder_ViewBinding);
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding nextOrSame(QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
        return new IconCompatParcelizer(0, quickAccountSelectAdapter$FooterHolder_ViewBinding);
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding previous(QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
        return new IconCompatParcelizer(3, quickAccountSelectAdapter$FooterHolder_ViewBinding);
    }

    public static AccountSourceAdapter$ItemViewHolder_ViewBinding previousOrSame(QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
        return new IconCompatParcelizer(1, quickAccountSelectAdapter$FooterHolder_ViewBinding);
    }

    /* renamed from: o.DenominatorAmountAdapter$BubbleViewHolder$IconCompatParcelizer */
    static final class IconCompatParcelizer implements AccountSourceAdapter$ItemViewHolder_ViewBinding {
        private final int dowValue;
        private final int relative;

        private IconCompatParcelizer(int i, QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding) {
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$FooterHolder_ViewBinding, "dayOfWeek");
            this.relative = i;
            this.dowValue = quickAccountSelectAdapter$FooterHolder_ViewBinding.getValue();
        }

        public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
            int i = denominatorAmountAdapter$BubbleViewDisableHolder.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
            if (this.relative < 2 && i == this.dowValue) {
                return denominatorAmountAdapter$BubbleViewDisableHolder;
            }
            if ((this.relative & 1) == 0) {
                int i2 = i - this.dowValue;
                return denominatorAmountAdapter$BubbleViewDisableHolder.plus((long) (i2 >= 0 ? 7 - i2 : -i2), BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
            }
            int i3 = this.dowValue - i;
            return denominatorAmountAdapter$BubbleViewDisableHolder.minus((long) (i3 >= 0 ? 7 - i3 : -i3), BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
        }
    }

    public DenominatorAmountAdapter$BubbleViewHolder(String str) {
        onGetStartedClick.write((Object) str, "marketConductUrl");
        this.IconCompatParcelizer = str;
    }
}
