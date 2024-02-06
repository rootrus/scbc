package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import net.p088sf.scuba.smartcards.ISO7816;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.setBackgroundDrawable;

/* renamed from: o.ManagePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding */
public final class C10412xd5495acd extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder, AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<C10412xd5495acd>, Serializable {
    public static final EBillAdapter$EBillHolder<C10412xd5495acd> FROM = new EBillAdapter$EBillHolder<C10412xd5495acd>() {
        public final C10412xd5495acd queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return C10412xd5495acd.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    private static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder PARSER = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, 4, 10, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD).appendLiteral('-').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, 2).toFormatter();
    private static final long serialVersionUID = 4183400860270640070L;
    private final int month;
    private final int year;

    public static C10412xd5495acd now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static C10412xd5495acd now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static C10412xd5495acd now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        QuickAccountSelectAdapter$UnselectedHolder now = QuickAccountSelectAdapter$UnselectedHolder.now(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding);
        return m6245of(now.getYear(), now.getMonth());
    }

    /* renamed from: of */
    public static C10412xd5495acd m6245of(int i, PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(prepaidTransactionAdapter$ChildViewHolder, "month");
        return m6244of(i, prepaidTransactionAdapter$ChildViewHolder.getValue());
    }

    /* renamed from: of */
    public static C10412xd5495acd m6244of(int i, int i2) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidValue((long) i);
        TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidValue((long) i2);
        return new C10412xd5495acd(i, i2);
    }

    public static C10412xd5495acd from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof C10412xd5495acd) {
            return (C10412xd5495acd) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        try {
            if (!RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.equals(C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding))) {
                denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding = QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            }
            return m6244of(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR), denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR));
        } catch (DateTimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain YearMonth from TemporalAccessor: ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            sb.append(", type ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
            throw new DateTimeException(sb.toString());
        }
    }

    public static C10412xd5495acd parse(CharSequence charSequence) {
        return parse(charSequence, PARSER);
    }

    public static C10412xd5495acd parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (C10412xd5495acd) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    private C10412xd5495acd(int i, int i2) {
        this.year = i;
        this.month = i2;
    }

    private C10412xd5495acd with(int i, int i2) {
        if (this.year == i && this.month == i2) {
            return this;
        }
        return new C10412xd5495acd(i, i2);
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) {
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
            if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.MONTHS || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.YEARS || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.DECADES || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.CENTURIES || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.MILLENNIA || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.ERAS) {
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
        if (denominatorAmountAdapter$PencilViewHolder != TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA) {
            return super.range(denominatorAmountAdapter$PencilViewHolder);
        }
        return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, getYear() <= 0 ? 1000000000 : 999999999);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        int i;
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        int i2 = setBackgroundDrawable.read.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            i = this.month;
        } else if (i2 == 2) {
            return getProlepticMonth();
        } else {
            if (i2 == 3) {
                int i4 = this.year;
                if (i4 <= 0) {
                    i4 = 1 - i4;
                }
                return (long) i4;
            } else if (i2 == 4) {
                i = this.year;
            } else if (i2 == 5) {
                if (this.year <= 0) {
                    i3 = 0;
                }
                return (long) i3;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb.toString());
            }
        }
        return (long) i;
    }

    private long getProlepticMonth() {
        return (((long) this.year) * 12) + ((long) (this.month - 1));
    }

    public final int getYear() {
        return this.year;
    }

    public final int getMonthValue() {
        return this.month;
    }

    public final PrepaidTransactionAdapter$ChildViewHolder getMonth() {
        return PrepaidTransactionAdapter$ChildViewHolder.m3539of(this.month);
    }

    public final boolean isLeapYear() {
        return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear((long) this.year);
    }

    public final boolean isValidDay(int i) {
        return i > 0 && i <= lengthOfMonth();
    }

    public final int lengthOfMonth() {
        return getMonth().length(isLeapYear());
    }

    public final int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    public final C10412xd5495acd with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return (C10412xd5495acd) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public final C10412xd5495acd with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (C10412xd5495acd) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidValue(j);
        int i = setBackgroundDrawable.read.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
        if (i == 1) {
            return withMonth((int) j);
        }
        if (i == 2) {
            return plusMonths(j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH));
        }
        if (i == 3) {
            if (this.year <= 0) {
                j = 1 - j;
            }
            return withYear((int) j);
        } else if (i == 4) {
            return withYear((int) j);
        } else {
            if (i == 5) {
                return getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) == j ? this : withYear(1 - this.year);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final C10412xd5495acd withYear(int i) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidValue((long) i);
        return with(i, this.month);
    }

    public final C10412xd5495acd withMonth(int i) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidValue((long) i);
        return with(this.year, i);
    }

    public final C10412xd5495acd plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (C10412xd5495acd) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final C10412xd5495acd plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return (C10412xd5495acd) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
        }
        switch (setBackgroundDrawable.read.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return plusMonths(j);
            case 2:
                return plusYears(j);
            case 3:
                return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 10));
            case 4:
                return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 100));
            case 5:
                return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 1000));
            case 6:
                return with((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.ERA, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA), j));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final C10412xd5495acd plusYears(long j) {
        if (j == 0) {
            return this;
        }
        return with(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(((long) this.year) + j), this.month);
    }

    public final C10412xd5495acd plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.year) * 12) + ((long) (this.month - 1)) + j;
        return with(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j2, 12)), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(j2, 12) + 1);
    }

    public final C10412xd5495acd minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (C10412xd5495acd) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final C10412xd5495acd minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final C10412xd5495acd minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1) : plusYears(-j);
    }

    public final C10412xd5495acd minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j);
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
        return super.query(eBillAdapter$EBillHolder);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        if (C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder).equals(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE)) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH, getProlepticMonth());
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        C10412xd5495acd from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        long prolepticMonth = from.getProlepticMonth() - getProlepticMonth();
        switch (setBackgroundDrawable.read.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return prolepticMonth;
            case 2:
                return prolepticMonth / 12;
            case 3:
                return prolepticMonth / 120;
            case 4:
                return prolepticMonth / 1200;
            case 5:
                return prolepticMonth / 12000;
            case 6:
                return from.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$UnselectedHolder atDay(int i) {
        return QuickAccountSelectAdapter$UnselectedHolder.m3547of(this.year, this.month, i);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder atEndOfMonth() {
        return QuickAccountSelectAdapter$UnselectedHolder.m3547of(this.year, this.month, lengthOfMonth());
    }

    public final int compareTo(C10412xd5495acd managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding) {
        int i = this.year - managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding.year;
        return i == 0 ? this.month - managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding.month : i;
    }

    public final boolean isAfter(C10412xd5495acd managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding) {
        return compareTo(managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding) > 0;
    }

    public final boolean isBefore(C10412xd5495acd managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding) {
        return compareTo(managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10412xd5495acd)) {
            return false;
        }
        C10412xd5495acd managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding = (C10412xd5495acd) obj;
        if (this.year == managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding.year && this.month == managePromptpayProxyAdapter$ManagePromptpayViewHolder_ViewBinding.month) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.year ^ (this.month << 27);
    }

    public final String toString() {
        int abs = Math.abs(this.year);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i = this.year;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.year);
        }
        sb.append(this.month < 10 ? "-0" : "-");
        sb.append(this.month);
        return sb.toString();
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding(ISO7816.INS_REHABILITATE_CHV, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
    }

    static C10412xd5495acd readExternal(DataInput dataInput) throws IOException {
        return m6244of(dataInput.readInt(), (int) dataInput.readByte());
    }
}
