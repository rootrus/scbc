package p040o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.io.Serializable;
import p040o.PromptPayMobileListAdapter$PromptPayListView;

/* renamed from: o.RegistrationCountrySearchAdapter$CountryItemViewHolder */
final class RegistrationCountrySearchAdapter$CountryItemViewHolder<D extends PromptPayMobileListAdapter$PromptPayListView> extends PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> implements Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final DepositAccountsAdapter$DepositAccountHolder<D> dateTime;
    private final ManageAccountInboundViewHolder_ViewBinding offset;
    private final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding zone;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r2.contains(r7) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <R extends p040o.PromptPayMobileListAdapter$PromptPayListView> p040o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<R> ofBest(p040o.DepositAccountsAdapter$DepositAccountHolder<R> r5, p040o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding r6, p040o.ManageAccountInboundViewHolder_ViewBinding r7) {
        /*
            java.lang.String r0 = "localDateTime"
            p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(r5, r0)
            java.lang.String r0 = "zone"
            p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(r6, r0)
            boolean r0 = r6 instanceof p040o.ManageAccountInboundViewHolder_ViewBinding
            if (r0 == 0) goto L_0x0017
            o.RegistrationCountrySearchAdapter$CountryItemViewHolder r7 = new o.RegistrationCountrySearchAdapter$CountryItemViewHolder
            r0 = r6
            o.ManageAccountInboundViewHolder_ViewBinding r0 = (p040o.ManageAccountInboundViewHolder_ViewBinding) r0
            r7.<init>(r5, r0, r6)
            return r7
        L_0x0017:
            o.HistoryAdapter$ChildViewHolder r0 = r6.getRules()
            o.QuickAccountSelectAdapter$UnselectedHolder_ViewBinding r1 = p040o.QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.from(r5)
            java.util.List r2 = r0.getValidOffsets(r1)
            int r3 = r2.size()
            r4 = 1
            if (r3 == r4) goto L_0x004d
            int r3 = r2.size()
            if (r3 != 0) goto L_0x0045
            o.HistoryAdapter$ChildViewHolder_ViewBinding r7 = r0.getTransition(r1)
            o.QuickAccountSelectAdapter$SelectedHolder_ViewBinding r0 = r7.getDuration()
            long r0 = r0.getSeconds()
            o.DepositAccountsAdapter$DepositAccountHolder r5 = r5.plusSeconds(r0)
            o.ManageAccountInboundViewHolder_ViewBinding r7 = r7.getOffsetAfter()
            goto L_0x0054
        L_0x0045:
            if (r7 == 0) goto L_0x004d
            boolean r0 = r2.contains(r7)
            if (r0 != 0) goto L_0x0054
        L_0x004d:
            r7 = 0
            java.lang.Object r7 = r2.get(r7)
            o.ManageAccountInboundViewHolder_ViewBinding r7 = (p040o.ManageAccountInboundViewHolder_ViewBinding) r7
        L_0x0054:
            java.lang.String r0 = "offset"
            p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(r7, r0)
            o.RegistrationCountrySearchAdapter$CountryItemViewHolder r0 = new o.RegistrationCountrySearchAdapter$CountryItemViewHolder
            r0.<init>(r5, r7, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.RegistrationCountrySearchAdapter$CountryItemViewHolder.ofBest(o.DepositAccountsAdapter$DepositAccountHolder, o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding, o.ManageAccountInboundViewHolder_ViewBinding):o.PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding");
    }

    static <R extends PromptPayMobileListAdapter$PromptPayListView> RegistrationCountrySearchAdapter$CountryItemViewHolder<R> ofInstant(C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        ManageAccountInboundViewHolder_ViewBinding offset2 = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules().getOffset(quickAccountSelectAdapter$HeaderHolder_ViewBinding);
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(offset2, "offset");
        return new RegistrationCountrySearchAdapter$CountryItemViewHolder<>((DepositAccountsAdapter$DepositAccountHolder) registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.localDateTime(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.ofEpochSecond(quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond(), quickAccountSelectAdapter$HeaderHolder_ViewBinding.getNano(), offset2)), offset2, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    private RegistrationCountrySearchAdapter$CountryItemViewHolder<D> create(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ofInstant(toLocalDate().getChronology(), quickAccountSelectAdapter$HeaderHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    private RegistrationCountrySearchAdapter$CountryItemViewHolder(DepositAccountsAdapter$DepositAccountHolder<D> depositAccountsAdapter$DepositAccountHolder, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        this.dateTime = (DepositAccountsAdapter$DepositAccountHolder) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(depositAccountsAdapter$DepositAccountHolder, "dateTime");
        this.offset = (ManageAccountInboundViewHolder_ViewBinding) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
        this.zone = (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
    }

    public final boolean isSupported(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
            if (eBillAdapter$EBillHolder_ViewBinding.isDateBased() || eBillAdapter$EBillHolder_ViewBinding.isTimeBased()) {
                return true;
            }
            return false;
        } else if (eBillAdapter$EBillHolder_ViewBinding == null || !eBillAdapter$EBillHolder_ViewBinding.isSupportedBy(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffset() {
        return this.offset;
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> withEarlierOffsetAtOverlap() {
        HistoryAdapter$ChildViewHolder_ViewBinding transition = getZone().getRules().getTransition(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.from(this));
        if (transition != null && transition.isOverlap()) {
            ManageAccountInboundViewHolder_ViewBinding offsetBefore = transition.getOffsetBefore();
            if (!offsetBefore.equals(this.offset)) {
                return new RegistrationCountrySearchAdapter$CountryItemViewHolder(this.dateTime, offsetBefore, this.zone);
            }
        }
        return this;
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> withLaterOffsetAtOverlap() {
        HistoryAdapter$ChildViewHolder_ViewBinding transition = getZone().getRules().getTransition(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.from(this));
        if (transition != null) {
            ManageAccountInboundViewHolder_ViewBinding offsetAfter = transition.getOffsetAfter();
            if (!offsetAfter.equals(getOffset())) {
                return new RegistrationCountrySearchAdapter$CountryItemViewHolder(this.dateTime, offsetAfter, this.zone);
            }
        }
        return this;
    }

    public final DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> toLocalDateTime() {
        return this.dateTime;
    }

    public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone() {
        return this.zone;
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> withZoneSameLocal(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ofBest(this.dateTime, languageSettingAdapter$LanguageSettingHolder_ViewBinding, this.offset);
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> withZoneSameInstant(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        return this.zone.equals(languageSettingAdapter$LanguageSettingHolder_ViewBinding) ? this : create(this.dateTime.toInstant(this.offset), languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) || (denominatorAmountAdapter$PencilViewHolder != null && denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this));
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return toLocalDate().getChronology().ensureChronoZonedDateTime(denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j));
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        int i = AppCompatMultiAutoCompleteTextView.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
        if (i == 1) {
            return plus(j - toEpochSecond(), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.SECONDS);
        }
        if (i != 2) {
            return ofBest(this.dateTime.with(denominatorAmountAdapter$PencilViewHolder, j), this.zone, this.offset);
        }
        return create(this.dateTime.toInstant(ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidIntValue(j))), this.zone);
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
            return with((AccountSourceAdapter$ItemViewHolder_ViewBinding) this.dateTime.plus(j, eBillAdapter$EBillHolder_ViewBinding));
        }
        return toLocalDate().getChronology().ensureChronoZonedDateTime(eBillAdapter$EBillHolder_ViewBinding.addTo(this, j));
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> zonedDateTime = toLocalDate().getChronology().zonedDateTime(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, zonedDateTime);
        }
        return this.dateTime.until(zonedDateTime.withZoneSameInstant(this.offset).toLocalDateTime(), eBillAdapter$EBillHolder_ViewBinding);
    }

    private Object writeReplace() {
        return new OutgoingAdapter$OutgoingHolder_ViewBinding((byte) 13, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.dateTime);
        objectOutput.writeObject(this.offset);
        objectOutput.writeObject(this.zone);
    }

    static PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<?> readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((DepositAccountsAdapter$DepositAccountHolder_ViewBinding) objectInput.readObject()).atZone((ManageAccountInboundViewHolder_ViewBinding) objectInput.readObject()).withZoneSameLocal((LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) objectInput.readObject());
    }

    public final boolean equals(Object obj) {
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

    public final int hashCode() {
        return (toLocalDateTime().hashCode() ^ getOffset().hashCode()) ^ Integer.rotateLeft(getZone().hashCode(), 3);
    }

    public final String toString() {
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
