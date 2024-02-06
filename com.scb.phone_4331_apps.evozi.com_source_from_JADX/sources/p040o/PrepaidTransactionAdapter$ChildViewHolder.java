package p040o;

import java.util.Locale;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.setExpandActivityOverflowButtonContentDescription;

/* renamed from: o.PrepaidTransactionAdapter$ChildViewHolder */
public enum PrepaidTransactionAdapter$ChildViewHolder implements DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, AccountSourceAdapter$ItemViewHolder_ViewBinding {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;
    
    private static final PrepaidTransactionAdapter$ChildViewHolder[] ENUMS = null;
    public static final EBillAdapter$EBillHolder<PrepaidTransactionAdapter$ChildViewHolder> FROM = null;

    static {
        FROM = new EBillAdapter$EBillHolder<PrepaidTransactionAdapter$ChildViewHolder>() {
            public final PrepaidTransactionAdapter$ChildViewHolder queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
                return PrepaidTransactionAdapter$ChildViewHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            }
        };
        ENUMS = values();
    }

    /* renamed from: of */
    public static PrepaidTransactionAdapter$ChildViewHolder m3539of(int i) {
        if (i > 0 && i <= 12) {
            return ENUMS[i - 1];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid value for MonthOfYear: ");
        sb.append(i);
        throw new DateTimeException(sb.toString());
    }

    public static PrepaidTransactionAdapter$ChildViewHolder from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof PrepaidTransactionAdapter$ChildViewHolder) {
            return (PrepaidTransactionAdapter$ChildViewHolder) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        try {
            if (!RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.equals(C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding))) {
                denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding = QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            }
            return m3539of(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR));
        } catch (DateTimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain Month from TemporalAccessor: ");
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
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendText((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding).toFormatter(locale).format(this);
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder != TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) {
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
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) {
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
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) {
            return getValue();
        }
        return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) {
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

    public final PrepaidTransactionAdapter$ChildViewHolder plus(long j) {
        return ENUMS[(ordinal() + (((int) (j % 12)) + 12)) % 12];
    }

    public final PrepaidTransactionAdapter$ChildViewHolder minus(long j) {
        return plus(-(j % 12));
    }

    public final int length(boolean z) {
        int i = setExpandActivityOverflowButtonContentDescription.C14841.$SwitchMap$org$threeten$bp$Month[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int minLength() {
        int i = setExpandActivityOverflowButtonContentDescription.C14841.$SwitchMap$org$threeten$bp$Month[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 28;
    }

    public final int maxLength() {
        int i = setExpandActivityOverflowButtonContentDescription.C14841.$SwitchMap$org$threeten$bp$Month[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int firstDayOfYear(boolean z) {
        switch (setExpandActivityOverflowButtonContentDescription.C14841.$SwitchMap$org$threeten$bp$Month[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + true;
            case 3:
                return z + true;
            case 4:
                return z + true;
            case 5:
                return z + true;
            case 6:
                return 1;
            case 7:
                return z + true;
            case 8:
                return z + true;
            case 9:
                return z + true;
            case 10:
                return z + true;
            case 11:
                return z + true;
            default:
                return z + true;
        }
    }

    public final PrepaidTransactionAdapter$ChildViewHolder firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
            return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.MONTHS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset()) {
            return null;
        }
        return eBillAdapter$EBillHolder.queryFrom(this);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        if (C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder).equals(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE)) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, (long) getValue());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }
}
