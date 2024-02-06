package p040o;

import java.util.Comparator;
import org.threeten.p041bp.DateTimeException;

/* renamed from: o.PromptPayMobileListAdapter$PromptPayListView */
public abstract class PromptPayMobileListAdapter$PromptPayListView extends AccountSourceAdapter$ItemViewHolder implements AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<PromptPayMobileListAdapter$PromptPayListView> {
    private static final Comparator<PromptPayMobileListAdapter$PromptPayListView> DATE_COMPARATOR = new Comparator<PromptPayMobileListAdapter$PromptPayListView>() {
        public final int compare(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView, PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView2) {
            return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(promptPayMobileListAdapter$PromptPayListView.toEpochDay(), promptPayMobileListAdapter$PromptPayListView2.toEpochDay());
        }
    };

    public abstract C7022x6c0e8d61 getChronology();

    public abstract int lengthOfMonth();

    public abstract PromptPayMobileListAdapter$PromptPayListView plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding);

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder until(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView);

    public abstract PromptPayMobileListAdapter$PromptPayListView with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j);

    public static Comparator<PromptPayMobileListAdapter$PromptPayListView> timeLineOrder() {
        return DATE_COMPARATOR;
    }

    public static PromptPayMobileListAdapter$PromptPayListView from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, "temporal");
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof PromptPayMobileListAdapter$PromptPayListView) {
            return (PromptPayMobileListAdapter$PromptPayListView) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology());
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding != null) {
            return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No Chronology found to create ChronoLocalDate: ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass());
        throw new DateTimeException(sb.toString());
    }

    public RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding getEra() {
        return getChronology().eraOf(get(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA));
    }

    public boolean isLeapYear() {
        return getChronology().isLeapYear(getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR));
    }

    public int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    public boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            return denominatorAmountAdapter$PencilViewHolder.isDateBased();
        }
        return denominatorAmountAdapter$PencilViewHolder != null && denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this);
    }

    public boolean isSupported(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
            return eBillAdapter$EBillHolder_ViewBinding.isDateBased();
        }
        return eBillAdapter$EBillHolder_ViewBinding != null && eBillAdapter$EBillHolder_ViewBinding.isSupportedBy(this);
    }

    public PromptPayMobileListAdapter$PromptPayListView with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return getChronology().ensureChronoLocalDate(super.with(accountSourceAdapter$ItemViewHolder_ViewBinding));
    }

    public PromptPayMobileListAdapter$PromptPayListView plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return getChronology().ensureChronoLocalDate(super.plus(denominatorAmountAdapter$PencilViewHolder_ViewBinding));
    }

    public PromptPayMobileListAdapter$PromptPayListView minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return getChronology().ensureChronoLocalDate(super.minus(denominatorAmountAdapter$PencilViewHolder_ViewBinding));
    }

    public PromptPayMobileListAdapter$PromptPayListView minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return getChronology().ensureChronoLocalDate(super.minus(j, eBillAdapter$EBillHolder_ViewBinding));
    }

    public <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
            return getChronology();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.DAYS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            return QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(toEpochDay());
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset()) {
            return null;
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY, toEpochDay());
    }

    public String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    public DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> atTime(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return DepositAccountsAdapter$DepositAccountHolder.m3499of(this, quickAccountSelectAdapter$SelectedHolder);
    }

    public long toEpochDay() {
        return getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY);
    }

    public int compareTo(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        int compareLongs = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(toEpochDay(), promptPayMobileListAdapter$PromptPayListView.toEpochDay());
        return compareLongs == 0 ? getChronology().compareTo(promptPayMobileListAdapter$PromptPayListView.getChronology()) : compareLongs;
    }

    public boolean isAfter(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        return toEpochDay() > promptPayMobileListAdapter$PromptPayListView.toEpochDay();
    }

    public boolean isBefore(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        return toEpochDay() < promptPayMobileListAdapter$PromptPayListView.toEpochDay();
    }

    public boolean isEqual(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        return toEpochDay() == promptPayMobileListAdapter$PromptPayListView.toEpochDay();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptPayMobileListAdapter$PromptPayListView)) {
            return false;
        }
        if (compareTo((PromptPayMobileListAdapter$PromptPayListView) obj) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long epochDay = toEpochDay();
        return ((int) (epochDay ^ (epochDay >>> 32))) ^ getChronology().hashCode();
    }

    public String toString() {
        long j = getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA);
        long j2 = getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR);
        long j3 = getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(getChronology().toString());
        sb.append(" ");
        sb.append(getEra());
        sb.append(" ");
        sb.append(j);
        String str = "-";
        sb.append(j2 < 10 ? "-0" : str);
        sb.append(j2);
        if (j3 < 10) {
            str = "-0";
        }
        sb.append(str);
        sb.append(j3);
        return sb.toString();
    }
}
