package p040o;

import java.util.Comparator;
import org.threeten.p041bp.DateTimeException;
import p040o.PromptPayMobileListAdapter$PromptPayListView;

/* renamed from: o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding */
public abstract class DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D extends PromptPayMobileListAdapter$PromptPayListView> extends AccountSourceAdapter$ItemViewHolder implements AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>> {
    private static final Comparator<DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>> DATE_TIME_COMPARATOR = new Comparator<DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>>() {
        /* JADX WARNING: type inference failed for: r5v0, types: [o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>, o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding] */
        /* JADX WARNING: type inference failed for: r6v0, types: [o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>, o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compare(p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> r5, p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> r6) {
            /*
                r4 = this;
                o.PromptPayMobileListAdapter$PromptPayListView r0 = r5.toLocalDate()
                long r0 = r0.toEpochDay()
                o.PromptPayMobileListAdapter$PromptPayListView r2 = r6.toLocalDate()
                long r2 = r2.toEpochDay()
                int r0 = p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(r0, r2)
                if (r0 != 0) goto L_0x002a
                o.QuickAccountSelectAdapter$SelectedHolder r5 = r5.toLocalTime()
                long r0 = r5.toNanoOfDay()
                o.QuickAccountSelectAdapter$SelectedHolder r5 = r6.toLocalTime()
                long r5 = r5.toNanoOfDay()
                int r0 = p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(r0, r5)
            L_0x002a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding.C64281.compare(o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding, o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding):int");
        }
    };

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> atZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding);

    public abstract DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding);

    public abstract D toLocalDate();

    public abstract QuickAccountSelectAdapter$SelectedHolder toLocalTime();

    public abstract DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j);

    public static Comparator<DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>> timeLineOrder() {
        return DATE_TIME_COMPARATOR;
    }

    public static DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, "temporal");
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof DepositAccountsAdapter$DepositAccountHolder_ViewBinding) {
            return (DepositAccountsAdapter$DepositAccountHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology());
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding != null) {
            return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.localDateTime(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No Chronology found to create ChronoLocalDateTime: ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass());
        throw new DateTimeException(sb.toString());
    }

    public C7022x6c0e8d61 getChronology() {
        return toLocalDate().getChronology();
    }

    public DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.with(accountSourceAdapter$ItemViewHolder_ViewBinding));
    }

    public DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.plus(denominatorAmountAdapter$PencilViewHolder_ViewBinding));
    }

    public DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.minus(denominatorAmountAdapter$PencilViewHolder_ViewBinding));
    }

    public DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return toLocalDate().getChronology().ensureChronoLocalDateTime(super.minus(j, eBillAdapter$EBillHolder_ViewBinding));
    }

    public <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
            return getChronology();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.NANOS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            return QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(toLocalDate().toEpochDay());
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime()) {
            return toLocalTime();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset()) {
            return null;
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY, toLocalDate().toEpochDay()).with(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY, toLocalTime().toNanoOfDay());
    }

    public String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    public QuickAccountSelectAdapter$HeaderHolder_ViewBinding toInstant(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochSecond(toEpochSecond(manageAccountInboundViewHolder_ViewBinding), (long) toLocalTime().getNano());
    }

    public long toEpochSecond(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) manageAccountInboundViewHolder_ViewBinding.getTotalSeconds());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>, o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> r3) {
        /*
            r2 = this;
            o.PromptPayMobileListAdapter$PromptPayListView r0 = r2.toLocalDate()
            o.PromptPayMobileListAdapter$PromptPayListView r1 = r3.toLocalDate()
            int r0 = r0.compareTo((p040o.PromptPayMobileListAdapter$PromptPayListView) r1)
            if (r0 != 0) goto L_0x0028
            o.QuickAccountSelectAdapter$SelectedHolder r0 = r2.toLocalTime()
            o.QuickAccountSelectAdapter$SelectedHolder r1 = r3.toLocalTime()
            int r0 = r0.compareTo((p040o.QuickAccountSelectAdapter$SelectedHolder) r1)
            if (r0 != 0) goto L_0x0028
            o.RegistrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding r0 = r2.getChronology()
            o.RegistrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding r3 = r3.getChronology()
            int r0 = r0.compareTo((p040o.C7022x6c0e8d61) r3)
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding.compareTo(o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding):int");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>, o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isAfter(p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> r5) {
        /*
            r4 = this;
            o.PromptPayMobileListAdapter$PromptPayListView r0 = r4.toLocalDate()
            long r0 = r0.toEpochDay()
            o.PromptPayMobileListAdapter$PromptPayListView r2 = r5.toLocalDate()
            long r2 = r2.toEpochDay()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x002c
            if (r0 != 0) goto L_0x002a
            o.QuickAccountSelectAdapter$SelectedHolder r0 = r4.toLocalTime()
            long r0 = r0.toNanoOfDay()
            o.QuickAccountSelectAdapter$SelectedHolder r5 = r5.toLocalTime()
            long r2 = r5.toNanoOfDay()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x002c
        L_0x002a:
            r5 = 0
            goto L_0x002d
        L_0x002c:
            r5 = 1
        L_0x002d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding.isAfter(o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>, o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isBefore(p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> r5) {
        /*
            r4 = this;
            o.PromptPayMobileListAdapter$PromptPayListView r0 = r4.toLocalDate()
            long r0 = r0.toEpochDay()
            o.PromptPayMobileListAdapter$PromptPayListView r2 = r5.toLocalDate()
            long r2 = r2.toEpochDay()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x002c
            if (r0 != 0) goto L_0x002a
            o.QuickAccountSelectAdapter$SelectedHolder r0 = r4.toLocalTime()
            long r0 = r0.toNanoOfDay()
            o.QuickAccountSelectAdapter$SelectedHolder r5 = r5.toLocalTime()
            long r2 = r5.toNanoOfDay()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x002c
        L_0x002a:
            r5 = 0
            goto L_0x002d
        L_0x002c:
            r5 = 1
        L_0x002d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding.isBefore(o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding):boolean");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>, o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isEqual(p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> r5) {
        /*
            r4 = this;
            o.QuickAccountSelectAdapter$SelectedHolder r0 = r4.toLocalTime()
            long r0 = r0.toNanoOfDay()
            o.QuickAccountSelectAdapter$SelectedHolder r2 = r5.toLocalTime()
            long r2 = r2.toNanoOfDay()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x002a
            o.PromptPayMobileListAdapter$PromptPayListView r0 = r4.toLocalDate()
            long r0 = r0.toEpochDay()
            o.PromptPayMobileListAdapter$PromptPayListView r5 = r5.toLocalDate()
            long r2 = r5.toEpochDay()
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x002a
            r5 = 1
            goto L_0x002b
        L_0x002a:
            r5 = 0
        L_0x002b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding.isEqual(o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding):boolean");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositAccountsAdapter$DepositAccountHolder_ViewBinding)) {
            return false;
        }
        if (compareTo((DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>) (DepositAccountsAdapter$DepositAccountHolder_ViewBinding) obj) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return toLocalDate().hashCode() ^ toLocalTime().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toLocalDate().toString());
        sb.append('T');
        sb.append(toLocalTime().toString());
        return sb.toString();
    }
}
