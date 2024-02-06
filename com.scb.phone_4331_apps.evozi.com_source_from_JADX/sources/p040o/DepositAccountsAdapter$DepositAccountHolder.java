package p040o;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import p040o.PromptPayMobileListAdapter$PromptPayListView;

/* renamed from: o.DepositAccountsAdapter$DepositAccountHolder */
final class DepositAccountsAdapter$DepositAccountHolder<D extends PromptPayMobileListAdapter$PromptPayListView> extends DepositAccountsAdapter$DepositAccountHolder_ViewBinding<D> implements Serializable {
    private static final int HOURS_PER_DAY = 24;
    private static final long MICROS_PER_DAY = 86400000000L;
    private static final long MILLIS_PER_DAY = 86400000;
    private static final int MINUTES_PER_DAY = 1440;
    private static final int MINUTES_PER_HOUR = 60;
    private static final long NANOS_PER_DAY = 86400000000000L;
    private static final long NANOS_PER_HOUR = 3600000000000L;
    private static final long NANOS_PER_MINUTE = 60000000000L;
    private static final long NANOS_PER_SECOND = 1000000000;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final long serialVersionUID = 4556003607393004514L;
    private final D date;
    private final QuickAccountSelectAdapter$SelectedHolder time;

    /* renamed from: of */
    static <R extends PromptPayMobileListAdapter$PromptPayListView> DepositAccountsAdapter$DepositAccountHolder<R> m3499of(R r, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return new DepositAccountsAdapter$DepositAccountHolder<>(r, quickAccountSelectAdapter$SelectedHolder);
    }

    private DepositAccountsAdapter$DepositAccountHolder(D d, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(d, "date");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$SelectedHolder, "time");
        this.date = d;
        this.time = quickAccountSelectAdapter$SelectedHolder;
    }

    private DepositAccountsAdapter$DepositAccountHolder<D> with(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        if (this.date == denominatorAmountAdapter$BubbleViewDisableHolder && this.time == quickAccountSelectAdapter$SelectedHolder) {
            return this;
        }
        return new DepositAccountsAdapter$DepositAccountHolder<>(this.date.getChronology().ensureChronoLocalDate(denominatorAmountAdapter$BubbleViewDisableHolder), quickAccountSelectAdapter$SelectedHolder);
    }

    public final D toLocalDate() {
        return this.date;
    }

    public final QuickAccountSelectAdapter$SelectedHolder toLocalTime() {
        return this.time;
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder.isDateBased() || denominatorAmountAdapter$PencilViewHolder.isTimeBased()) {
                return true;
            }
            return false;
        } else if (denominatorAmountAdapter$PencilViewHolder == null || !denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this)) {
            return false;
        } else {
            return true;
        }
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

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        return (denominatorAmountAdapter$PencilViewHolder.isTimeBased() ? this.time : this.date).range(denominatorAmountAdapter$PencilViewHolder);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
        }
        return (denominatorAmountAdapter$PencilViewHolder.isTimeBased() ? this.time : this.date).get(denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            return denominatorAmountAdapter$PencilViewHolder.isTimeBased() ? this.time.getLong(denominatorAmountAdapter$PencilViewHolder) : this.date.getLong(denominatorAmountAdapter$PencilViewHolder);
        }
        return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
    }

    public final DepositAccountsAdapter$DepositAccountHolder<D> with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof PromptPayMobileListAdapter$PromptPayListView) {
            return with((DenominatorAmountAdapter$BubbleViewDisableHolder) (PromptPayMobileListAdapter$PromptPayListView) accountSourceAdapter$ItemViewHolder_ViewBinding, this.time);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$SelectedHolder) {
            return with((DenominatorAmountAdapter$BubbleViewDisableHolder) this.date, (QuickAccountSelectAdapter$SelectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof DepositAccountsAdapter$DepositAccountHolder) {
            return this.date.getChronology().ensureChronoLocalDateTime((DepositAccountsAdapter$DepositAccountHolder) accountSourceAdapter$ItemViewHolder_ViewBinding);
        }
        return this.date.getChronology().ensureChronoLocalDateTime((DepositAccountsAdapter$DepositAccountHolder) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this));
    }

    public final DepositAccountsAdapter$DepositAccountHolder<D> with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return this.date.getChronology().ensureChronoLocalDateTime(denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j));
        }
        if (denominatorAmountAdapter$PencilViewHolder.isTimeBased()) {
            return with((DenominatorAmountAdapter$BubbleViewDisableHolder) this.date, this.time.with(denominatorAmountAdapter$PencilViewHolder, j));
        }
        return with((DenominatorAmountAdapter$BubbleViewDisableHolder) this.date.with(denominatorAmountAdapter$PencilViewHolder, j), this.time);
    }

    public final DepositAccountsAdapter$DepositAccountHolder<D> plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return this.date.getChronology().ensureChronoLocalDateTime(eBillAdapter$EBillHolder_ViewBinding.addTo(this, j));
        }
        switch (AppCompatImageButton.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return plusDays(j / MICROS_PER_DAY).plusNanos((j % MICROS_PER_DAY) * 1000);
            case 3:
                return plusDays(j / MILLIS_PER_DAY).plusNanos((j % MILLIS_PER_DAY) * 1000000);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusMinutes(j);
            case 6:
                return plusHours(j);
            case 7:
                return plusDays(j / 256).plusHours((j % 256) * 12);
            default:
                return with((DenominatorAmountAdapter$BubbleViewDisableHolder) this.date.plus(j, eBillAdapter$EBillHolder_ViewBinding), this.time);
        }
    }

    private DepositAccountsAdapter$DepositAccountHolder<D> plusDays(long j) {
        return with((DenominatorAmountAdapter$BubbleViewDisableHolder) this.date.plus(j, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS), this.time);
    }

    private DepositAccountsAdapter$DepositAccountHolder<D> plusHours(long j) {
        return plusWithOverflow(this.date, j, 0, 0, 0);
    }

    private DepositAccountsAdapter$DepositAccountHolder<D> plusMinutes(long j) {
        return plusWithOverflow(this.date, 0, j, 0, 0);
    }

    /* access modifiers changed from: package-private */
    public final DepositAccountsAdapter$DepositAccountHolder<D> plusSeconds(long j) {
        return plusWithOverflow(this.date, 0, 0, j, 0);
    }

    private DepositAccountsAdapter$DepositAccountHolder<D> plusNanos(long j) {
        return plusWithOverflow(this.date, 0, 0, 0, j);
    }

    private DepositAccountsAdapter$DepositAccountHolder<D> plusWithOverflow(D d, long j, long j2, long j3, long j4) {
        D d2 = d;
        if ((j | j2 | j3 | j4) == 0) {
            return with((DenominatorAmountAdapter$BubbleViewDisableHolder) d2, this.time);
        }
        long j5 = j4 / NANOS_PER_DAY;
        long j6 = j3 / 86400;
        long j7 = j2 / 1440;
        long j8 = j / 24;
        long nanoOfDay = this.time.toNanoOfDay();
        long j9 = (j4 % NANOS_PER_DAY) + ((j3 % 86400) * NANOS_PER_SECOND) + ((j2 % 1440) * NANOS_PER_MINUTE) + ((j % 24) * NANOS_PER_HOUR) + nanoOfDay;
        long floorDiv = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j9, (long) NANOS_PER_DAY);
        long floorMod = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(j9, (long) NANOS_PER_DAY);
        return with((DenominatorAmountAdapter$BubbleViewDisableHolder) d2.plus(j5 + j6 + j7 + j8 + floorDiv, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS), floorMod == nanoOfDay ? this.time : QuickAccountSelectAdapter$SelectedHolder.ofNanoOfDay(floorMod));
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<D> atZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return RegistrationCountrySearchAdapter$CountryItemViewHolder.ofBest(this, languageSettingAdapter$LanguageSettingHolder_ViewBinding, (ManageAccountInboundViewHolder_ViewBinding) null);
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        DepositAccountsAdapter$DepositAccountHolder_ViewBinding localDateTime = toLocalDate().getChronology().localDateTime(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, localDateTime);
        }
        BillerAdapter$ItemViewHolder_ViewBinding billerAdapter$ItemViewHolder_ViewBinding = (BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding;
        if (billerAdapter$ItemViewHolder_ViewBinding.isTimeBased()) {
            long j = localDateTime.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY) - this.date.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY);
            switch (AppCompatImageButton.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[billerAdapter$ItemViewHolder_ViewBinding.ordinal()]) {
                case 1:
                    j = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, (long) NANOS_PER_DAY);
                    break;
                case 2:
                    j = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, (long) MICROS_PER_DAY);
                    break;
                case 3:
                    j = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, (long) MILLIS_PER_DAY);
                    break;
                case 4:
                    j = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, (int) SECONDS_PER_DAY);
                    break;
                case 5:
                    j = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, (int) MINUTES_PER_DAY);
                    break;
                case 6:
                    j = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 24);
                    break;
                case 7:
                    j = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 2);
                    break;
            }
            return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(j, this.time.until(localDateTime.toLocalTime(), eBillAdapter$EBillHolder_ViewBinding));
        }
        PromptPayMobileListAdapter$PromptPayListView localDate = localDateTime.toLocalDate();
        if (localDateTime.toLocalTime().isBefore(this.time)) {
            localDate = localDate.minus(1, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
        }
        return this.date.until(localDate, eBillAdapter$EBillHolder_ViewBinding);
    }

    private Object writeReplace() {
        return new OutgoingAdapter$OutgoingHolder_ViewBinding((byte) 12, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.date);
        objectOutput.writeObject(this.time);
    }

    static DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        return ((PromptPayMobileListAdapter$PromptPayListView) objectInput.readObject()).atTime((QuickAccountSelectAdapter$SelectedHolder) objectInput.readObject());
    }
}
