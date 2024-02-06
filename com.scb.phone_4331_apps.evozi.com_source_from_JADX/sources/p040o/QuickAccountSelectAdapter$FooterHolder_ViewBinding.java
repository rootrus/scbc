package p040o;

import java.util.Locale;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.QuickAccountSelectAdapter$FooterHolder_ViewBinding */
public enum QuickAccountSelectAdapter$FooterHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, AccountSourceAdapter$ItemViewHolder_ViewBinding {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    private static final QuickAccountSelectAdapter$FooterHolder_ViewBinding[] ENUMS = null;
    public static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$FooterHolder_ViewBinding> FROM = null;

    static {
        FROM = new EBillAdapter$EBillHolder<QuickAccountSelectAdapter$FooterHolder_ViewBinding>() {
            public final QuickAccountSelectAdapter$FooterHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
                return QuickAccountSelectAdapter$FooterHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            }
        };
        ENUMS = values();
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$FooterHolder_ViewBinding m3542of(int i) {
        if (i > 0 && i <= 7) {
            return ENUMS[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid value for DayOfWeek: ");
        sb.append(i);
        throw new DateTimeException(sb.toString());
    }

    public static QuickAccountSelectAdapter$FooterHolder_ViewBinding from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof QuickAccountSelectAdapter$FooterHolder_ViewBinding) {
            return (QuickAccountSelectAdapter$FooterHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        try {
            return m3542of(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK));
        } catch (DateTimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain DayOfWeek from TemporalAccessor: ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            sb.append(", type ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
            throw new DateTimeException(sb.toString(), e);
        }
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    public final String getDisplayName(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Locale locale) {
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendText((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding).toFormatter(locale).format(this);
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder != TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) {
                return false;
            }
            return true;
        } else if (denominatorAmountAdapter$PencilViewHolder == null || !denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) {
            return denominatorAmountAdapter$PencilViewHolder.range();
        }
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) {
            return getValue();
        }
        return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) {
            return (long) getValue();
        }
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final QuickAccountSelectAdapter$FooterHolder_ViewBinding plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 7)) + 7)) % 7];
    }

    public final QuickAccountSelectAdapter$FooterHolder_ViewBinding minus(long j) {
        return plus(-(j % 7));
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.DAYS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset()) {
            return null;
        }
        return eBillAdapter$EBillHolder.queryFrom(this);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK, (long) getValue());
    }
}
