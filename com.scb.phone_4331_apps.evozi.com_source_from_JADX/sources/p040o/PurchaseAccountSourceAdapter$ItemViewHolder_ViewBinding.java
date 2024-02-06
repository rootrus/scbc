package p040o;

import java.util.Comparator;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.PromptPayMobileListAdapter$PromptPayListView;

/* renamed from: o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding */
public abstract class PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D extends PromptPayMobileListAdapter$PromptPayListView> extends AccountSourceAdapter$ItemViewHolder implements Comparable<PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?>> {
    private static Comparator<PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?>> INSTANT_COMPARATOR = new Comparator<PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?>>() {
        public final int compare(PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding, PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding2) {
            int compareLongs = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toEpochSecond(), purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding2.toEpochSecond());
            return compareLongs == 0 ? RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toLocalTime().toNanoOfDay(), purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding2.toLocalTime().toNanoOfDay()) : compareLongs;
        }
    };

    public abstract ManageAccountInboundViewHolder_ViewBinding getOffset();

    public abstract LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone();

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding);

    public abstract DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> toLocalDateTime();

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j);

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> withEarlierOffsetAtOverlap();

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> withLaterOffsetAtOverlap();

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> withZoneSameInstant(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding);

    public abstract PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> withZoneSameLocal(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding);

    public static Comparator<PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?>> timeLineOrder() {
        return INSTANT_COMPARATOR;
    }

    public static PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, "temporal");
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding) {
            return (PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology());
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding != null) {
            return registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.zonedDateTime(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No Chronology found to create ChronoZonedDateTime: ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass());
        throw new DateTimeException(sb.toString());
    }

    public FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
            return denominatorAmountAdapter$PencilViewHolder.range();
        }
        return toLocalDateTime().range(denominatorAmountAdapter$PencilViewHolder);
    }

    public int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return super.get(denominatorAmountAdapter$PencilViewHolder);
        }
        int i = getSupportImageTintList.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field too large for an int: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        } else if (i != 2) {
            return toLocalDateTime().get(denominatorAmountAdapter$PencilViewHolder);
        } else {
            return getOffset().getTotalSeconds();
        }
    }

    public long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        int i = getSupportImageTintList.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        if (i == 1) {
            return toEpochSecond();
        }
        if (i != 2) {
            return toLocalDateTime().getLong(denominatorAmountAdapter$PencilViewHolder);
        }
        return (long) getOffset().getTotalSeconds();
    }

    public D toLocalDate() {
        return toLocalDateTime().toLocalDate();
    }

    public QuickAccountSelectAdapter$SelectedHolder toLocalTime() {
        return toLocalDateTime().toLocalTime();
    }

    public C7022x6c0e8d61 getChronology() {
        return toLocalDate().getChronology();
    }

    public PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return toLocalDate().getChronology().ensureChronoZonedDateTime(super.with(accountSourceAdapter$ItemViewHolder_ViewBinding));
    }

    public PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return toLocalDate().getChronology().ensureChronoZonedDateTime(super.plus(denominatorAmountAdapter$PencilViewHolder_ViewBinding));
    }

    public PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return toLocalDate().getChronology().ensureChronoZonedDateTime(super.minus(denominatorAmountAdapter$PencilViewHolder_ViewBinding));
    }

    public PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return toLocalDate().getChronology().ensureChronoZonedDateTime(super.minus(j, eBillAdapter$EBillHolder_ViewBinding));
    }

    public <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone()) {
            return getZone();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
            return toLocalDate().getChronology();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.NANOS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset()) {
            return getOffset();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            return QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(toLocalDate().toEpochDay());
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime()) {
            return toLocalTime();
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    public QuickAccountSelectAdapter$HeaderHolder_ViewBinding toInstant() {
        return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochSecond(toEpochSecond(), (long) toLocalTime().getNano());
    }

    public long toEpochSecond() {
        return ((toLocalDate().toEpochDay() * 86400) + ((long) toLocalTime().toSecondOfDay())) - ((long) getOffset().getTotalSeconds());
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding, o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(p040o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> r5) {
        /*
            r4 = this;
            long r0 = r4.toEpochSecond()
            long r2 = r5.toEpochSecond()
            int r0 = p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(r0, r2)
            if (r0 != 0) goto L_0x0059
            o.QuickAccountSelectAdapter$SelectedHolder r0 = r4.toLocalTime()
            int r0 = r0.getNano()
            o.QuickAccountSelectAdapter$SelectedHolder r1 = r5.toLocalTime()
            int r1 = r1.getNano()
            int r0 = r0 - r1
            if (r0 != 0) goto L_0x0059
            o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding r0 = r4.toLocalDateTime()
            o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding r1 = r5.toLocalDateTime()
            int r0 = r0.compareTo((p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>) r1)
            if (r0 != 0) goto L_0x0059
            o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding r0 = r4.getZone()
            java.lang.String r0 = r0.getId()
            o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding r1 = r5.getZone()
            java.lang.String r1 = r1.getId()
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0059
            o.PromptPayMobileListAdapter$PromptPayListView r0 = r4.toLocalDate()
            o.RegistrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding r0 = r0.getChronology()
            o.PromptPayMobileListAdapter$PromptPayListView r5 = r5.toLocalDate()
            o.RegistrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding r5 = r5.getChronology()
            int r0 = r0.compareTo((p040o.C7022x6c0e8d61) r5)
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.compareTo(o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding):int");
    }

    public boolean isAfter(PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding) {
        int i = (toEpochSecond() > purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toEpochSecond() ? 1 : (toEpochSecond() == purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toEpochSecond() ? 0 : -1));
        return i > 0 || (i == 0 && toLocalTime().getNano() > purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toLocalTime().getNano());
    }

    public boolean isBefore(PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding) {
        int i = (toEpochSecond() > purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toEpochSecond() ? 1 : (toEpochSecond() == purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toEpochSecond() ? 0 : -1));
        return i < 0 || (i == 0 && toLocalTime().getNano() < purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toLocalTime().getNano());
    }

    public boolean isEqual(PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding) {
        return toEpochSecond() == purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toEpochSecond() && toLocalTime().getNano() == purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toLocalTime().getNano();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding)) {
            return false;
        }
        if (compareTo((PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?>) (PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding) obj) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(toLocalDateTime().toString());
        sb.append(getOffset().toString());
        String obj = sb.toString();
        if (getOffset() == getZone()) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append('[');
        sb2.append(getZone().toString());
        sb2.append(']');
        return sb2.toString();
    }
}
