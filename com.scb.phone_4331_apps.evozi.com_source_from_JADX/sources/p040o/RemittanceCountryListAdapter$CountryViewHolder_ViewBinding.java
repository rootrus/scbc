package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.RemittanceCountryListAdapter$CountryViewHolder_ViewBinding */
public final class RemittanceCountryListAdapter$CountryViewHolder_ViewBinding extends ProfileManagementAdapter$ProfileManagementHolder<RemittanceCountryListAdapter$CountryViewHolder_ViewBinding> implements Serializable {
    static final QuickAccountSelectAdapter$UnselectedHolder MIN_DATE = QuickAccountSelectAdapter$UnselectedHolder.m3547of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    private transient IncomingAdapter$IncomingHolder_ViewBinding era;
    private final QuickAccountSelectAdapter$UnselectedHolder isoDate;
    private transient int yearOfEra;

    public final /* bridge */ /* synthetic */ long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return super.until(denominatorAmountAdapter$BubbleViewDisableHolder, eBillAdapter$EBillHolder_ViewBinding);
    }

    public static RemittanceCountryListAdapter$CountryViewHolder_ViewBinding now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static RemittanceCountryListAdapter$CountryViewHolder_ViewBinding now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static RemittanceCountryListAdapter$CountryViewHolder_ViewBinding now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        return new RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.now(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding));
    }

    /* renamed from: of */
    public static RemittanceCountryListAdapter$CountryViewHolder_ViewBinding m6254of(IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding, int i, int i2, int i3) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(incomingAdapter$IncomingHolder_ViewBinding, "era");
        if (i > 0) {
            QuickAccountSelectAdapter$UnselectedHolder startDate = incomingAdapter$IncomingHolder_ViewBinding.startDate();
            QuickAccountSelectAdapter$UnselectedHolder endDate = incomingAdapter$IncomingHolder_ViewBinding.endDate();
            QuickAccountSelectAdapter$UnselectedHolder of = QuickAccountSelectAdapter$UnselectedHolder.m3547of((startDate.getYear() - 1) + i, i2, i3);
            if (!of.isBefore(startDate) && !of.isAfter(endDate)) {
                return new RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(incomingAdapter$IncomingHolder_ViewBinding, i, of);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Requested date is outside bounds of era ");
            sb.append(incomingAdapter$IncomingHolder_ViewBinding);
            throw new DateTimeException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid YearOfEra: ");
        sb2.append(i);
        throw new DateTimeException(sb2.toString());
    }

    static RemittanceCountryListAdapter$CountryViewHolder_ViewBinding ofYearDay(IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding, int i, int i2) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(incomingAdapter$IncomingHolder_ViewBinding, "era");
        if (i > 0) {
            QuickAccountSelectAdapter$UnselectedHolder startDate = incomingAdapter$IncomingHolder_ViewBinding.startDate();
            QuickAccountSelectAdapter$UnselectedHolder endDate = incomingAdapter$IncomingHolder_ViewBinding.endDate();
            if (i != 1 || (i2 = i2 + (startDate.getDayOfYear() - 1)) <= startDate.lengthOfYear()) {
                QuickAccountSelectAdapter$UnselectedHolder ofYearDay = QuickAccountSelectAdapter$UnselectedHolder.ofYearDay((startDate.getYear() - 1) + i, i2);
                if (!ofYearDay.isBefore(startDate) && !ofYearDay.isAfter(endDate)) {
                    return new RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(incomingAdapter$IncomingHolder_ViewBinding, i, ofYearDay);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Requested date is outside bounds of era ");
                sb.append(incomingAdapter$IncomingHolder_ViewBinding);
                throw new DateTimeException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DayOfYear exceeds maximum allowed in the first year of era ");
            sb2.append(incomingAdapter$IncomingHolder_ViewBinding);
            throw new DateTimeException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid YearOfEra: ");
        sb3.append(i);
        throw new DateTimeException(sb3.toString());
    }

    /* renamed from: of */
    public static RemittanceCountryListAdapter$CountryViewHolder_ViewBinding m6253of(int i, int i2, int i3) {
        return new RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3547of(i, i2, i3));
    }

    public static RemittanceCountryListAdapter$CountryViewHolder_ViewBinding from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return RemittanceCountryListAdapter$TransferOptionViewHolder.INSTANCE.date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        if (!quickAccountSelectAdapter$UnselectedHolder.isBefore(MIN_DATE)) {
            IncomingAdapter$IncomingHolder_ViewBinding from = IncomingAdapter$IncomingHolder_ViewBinding.from(quickAccountSelectAdapter$UnselectedHolder);
            this.era = from;
            this.yearOfEra = quickAccountSelectAdapter$UnselectedHolder.getYear() - (from.startDate().getYear() - 1);
            this.isoDate = quickAccountSelectAdapter$UnselectedHolder;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding, int i, QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        if (!quickAccountSelectAdapter$UnselectedHolder.isBefore(MIN_DATE)) {
            this.era = incomingAdapter$IncomingHolder_ViewBinding;
            this.yearOfEra = i;
            this.isoDate = quickAccountSelectAdapter$UnselectedHolder;
            return;
        }
        throw new DateTimeException("Minimum supported date is January 1st Meiji 6");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        IncomingAdapter$IncomingHolder_ViewBinding from = IncomingAdapter$IncomingHolder_ViewBinding.from(this.isoDate);
        this.era = from;
        this.yearOfEra = this.isoDate.getYear() - (from.startDate().getYear() - 1);
    }

    public final RemittanceCountryListAdapter$TransferOptionViewHolder getChronology() {
        return RemittanceCountryListAdapter$TransferOptionViewHolder.INSTANCE;
    }

    public final IncomingAdapter$IncomingHolder_ViewBinding getEra() {
        return this.era;
    }

    public final int lengthOfMonth() {
        return this.isoDate.lengthOfMonth();
    }

    public final int lengthOfYear() {
        Calendar instance = Calendar.getInstance(RemittanceCountryListAdapter$TransferOptionViewHolder.LOCALE);
        instance.set(0, this.era.getValue() + 2);
        instance.set(this.yearOfEra, this.isoDate.getMonthValue() - 1, this.isoDate.getDayOfMonth());
        return instance.getActualMaximum(6);
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        return super.isSupported(denominatorAmountAdapter$PencilViewHolder);
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        if (isSupported(denominatorAmountAdapter$PencilViewHolder)) {
            TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
            int i = AppCompatSeekBar.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
            if (i == 1) {
                return actualRange(6);
            }
            if (i != 2) {
                return getChronology().range(tierPricingInstallmentAdapter$InstallmentViewHolder);
            }
            return actualRange(1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    private FavouriteTargetAdapter$ItemViewHolder actualRange(int i) {
        Calendar instance = Calendar.getInstance(RemittanceCountryListAdapter$TransferOptionViewHolder.LOCALE);
        instance.set(0, this.era.getValue() + 2);
        instance.set(this.yearOfEra, this.isoDate.getMonthValue() - 1, this.isoDate.getDayOfMonth());
        return FavouriteTargetAdapter$ItemViewHolder.m3505of((long) instance.getActualMinimum(i), (long) instance.getActualMaximum(i));
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        switch (AppCompatSeekBar.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()]) {
            case 1:
                return getDayOfYear();
            case 2:
                return (long) this.yearOfEra;
            case 3:
            case 4:
            case 5:
            case 6:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb.toString());
            case 7:
                return (long) this.era.getValue();
            default:
                return this.isoDate.getLong(denominatorAmountAdapter$PencilViewHolder);
        }
    }

    private long getDayOfYear() {
        int i;
        if (this.yearOfEra == 1) {
            i = (this.isoDate.getDayOfYear() - this.era.startDate().getDayOfYear()) + 1;
        } else {
            i = this.isoDate.getDayOfYear();
        }
        return (long) i;
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) super.with(accountSourceAdapter$ItemViewHolder_ViewBinding);
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        if (getLong(tierPricingInstallmentAdapter$InstallmentViewHolder) == j) {
            return this;
        }
        int i = AppCompatSeekBar.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
        if (i == 1 || i == 2 || i == 7) {
            int checkValidIntValue = getChronology().range(tierPricingInstallmentAdapter$InstallmentViewHolder).checkValidIntValue(j, tierPricingInstallmentAdapter$InstallmentViewHolder);
            int i2 = AppCompatSeekBar.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
            if (i2 == 1) {
                return with(this.isoDate.plusDays(((long) checkValidIntValue) - getDayOfYear()));
            }
            if (i2 == 2) {
                return withYear(checkValidIntValue);
            }
            if (i2 == 7) {
                return withYear(IncomingAdapter$IncomingHolder_ViewBinding.m6241of(checkValidIntValue), this.yearOfEra);
            }
        }
        return with(this.isoDate.with(denominatorAmountAdapter$PencilViewHolder, j));
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) super.plus(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) super.plus(j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) super.minus(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) super.minus(j, eBillAdapter$EBillHolder_ViewBinding);
    }

    private RemittanceCountryListAdapter$CountryViewHolder_ViewBinding withYear(IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding, int i) {
        return with(this.isoDate.withYear(RemittanceCountryListAdapter$TransferOptionViewHolder.INSTANCE.prolepticYear(incomingAdapter$IncomingHolder_ViewBinding, i)));
    }

    private RemittanceCountryListAdapter$CountryViewHolder_ViewBinding withYear(int i) {
        return withYear(getEra(), i);
    }

    /* access modifiers changed from: package-private */
    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding plusYears(long j) {
        return with(this.isoDate.plusYears(j));
    }

    /* access modifiers changed from: package-private */
    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding plusMonths(long j) {
        return with(this.isoDate.plusMonths(j));
    }

    /* access modifiers changed from: package-private */
    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding plusDays(long j) {
        return with(this.isoDate.plusDays(j));
    }

    private RemittanceCountryListAdapter$CountryViewHolder_ViewBinding with(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        return quickAccountSelectAdapter$UnselectedHolder.equals(this.isoDate) ? this : new RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder);
    }

    public final DepositAccountsAdapter$DepositAccountHolder_ViewBinding<RemittanceCountryListAdapter$CountryViewHolder_ViewBinding> atTime(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return super.atTime(quickAccountSelectAdapter$SelectedHolder);
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder until(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        PrepaidTransactionAdapter$ParentViewHolder_ViewBinding until = this.isoDate.until(promptPayMobileListAdapter$PromptPayListView);
        return getChronology().period(until.getYears(), until.getMonths(), until.getDays());
    }

    public final long toEpochDay() {
        return this.isoDate.toEpochDay();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) {
            return this.isoDate.equals(((RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) obj).isoDate);
        }
        return false;
    }

    public final int hashCode() {
        return getChronology().getId().hashCode() ^ this.isoDate.hashCode();
    }

    private Object writeReplace() {
        return new OutgoingAdapter$OutgoingHolder_ViewBinding((byte) 1, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR));
        dataOutput.writeByte(get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR));
        dataOutput.writeByte(get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH));
    }

    static PromptPayMobileListAdapter$PromptPayListView readExternal(DataInput dataInput) throws IOException {
        return RemittanceCountryListAdapter$TransferOptionViewHolder.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
