package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.setBackgroundDrawable;

/* renamed from: o.ManagePromptpayProxyAdapter$ManagePromptpayViewHolder */
public final class ManagePromptpayProxyAdapter$ManagePromptpayViewHolder extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder, AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<ManagePromptpayProxyAdapter$ManagePromptpayViewHolder>, Serializable {
    public static final EBillAdapter$EBillHolder<ManagePromptpayProxyAdapter$ManagePromptpayViewHolder> FROM = new EBillAdapter$EBillHolder<ManagePromptpayProxyAdapter$ManagePromptpayViewHolder>() {
        public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    public static final int MAX_VALUE = 999999999;
    public static final int MIN_VALUE = -999999999;
    private static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder PARSER = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, 4, 10, MoneyPresentAdapter$MoneyPresentViewHolder_ViewBinding.EXCEEDS_PAD).toFormatter();
    private static final long serialVersionUID = -23038383694477807L;
    private final int year;

    public static ManagePromptpayProxyAdapter$ManagePromptpayViewHolder now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static ManagePromptpayProxyAdapter$ManagePromptpayViewHolder now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static ManagePromptpayProxyAdapter$ManagePromptpayViewHolder now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        return m3530of(QuickAccountSelectAdapter$UnselectedHolder.now(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding).getYear());
    }

    /* renamed from: of */
    public static ManagePromptpayProxyAdapter$ManagePromptpayViewHolder m3530of(int i) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidValue((long) i);
        return new ManagePromptpayProxyAdapter$ManagePromptpayViewHolder(i);
    }

    public static ManagePromptpayProxyAdapter$ManagePromptpayViewHolder from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) {
            return (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        try {
            if (!RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.equals(C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding))) {
                denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding = QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            }
            return m3530of(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR));
        } catch (DateTimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain Year from TemporalAccessor: ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            sb.append(", type ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
            throw new DateTimeException(sb.toString());
        }
    }

    public static ManagePromptpayProxyAdapter$ManagePromptpayViewHolder parse(CharSequence charSequence) {
        return parse(charSequence, PARSER);
    }

    public static ManagePromptpayProxyAdapter$ManagePromptpayViewHolder parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    public static boolean isLeap(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    private ManagePromptpayProxyAdapter$ManagePromptpayViewHolder(int i) {
        this.year = i;
    }

    public final int getValue() {
        return this.year;
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) {
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
            if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.YEARS || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.DECADES || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.CENTURIES || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.MILLENNIA || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.ERAS) {
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
        return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, this.year <= 0 ? 1000000000 : 999999999);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        int i = setBackgroundDrawable.write.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        int i2 = 1;
        if (i == 1) {
            int i3 = this.year;
            if (i3 <= 0) {
                i3 = 1 - i3;
            }
            return (long) i3;
        } else if (i == 2) {
            return (long) this.year;
        } else {
            if (i == 3) {
                if (this.year <= 0) {
                    i2 = 0;
                }
                return (long) i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final boolean isLeap() {
        return isLeap((long) this.year);
    }

    public final boolean isValidMonthDay(ManageAccountInboundViewHolder manageAccountInboundViewHolder) {
        return manageAccountInboundViewHolder != null && manageAccountInboundViewHolder.isValidYear(this.year);
    }

    public final int length() {
        return isLeap() ? 366 : 365;
    }

    public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidValue(j);
        int i = setBackgroundDrawable.write.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
        if (i == 1) {
            if (this.year <= 0) {
                j = 1 - j;
            }
            return m3530of((int) j);
        } else if (i == 2) {
            return m3530of((int) j);
        } else {
            if (i == 3) {
                return getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) == j ? this : m3530of(1 - this.year);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
        }
        int i = setBackgroundDrawable.write.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()];
        if (i == 1) {
            return plusYears(j);
        }
        if (i == 2) {
            return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 10));
        }
        if (i == 3) {
            return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 100));
        }
        if (i == 4) {
            return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 1000));
        }
        if (i == 5) {
            return with((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.ERA, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA), j));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported unit: ");
        sb.append(eBillAdapter$EBillHolder_ViewBinding);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder plusYears(long j) {
        return j == 0 ? this : m3530of(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(((long) this.year) + j));
    }

    public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final ManagePromptpayProxyAdapter$ManagePromptpayViewHolder minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1) : plusYears(-j);
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
            return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.YEARS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset()) {
            return null;
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        if (C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder).equals(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE)) {
            return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, (long) this.year);
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        ManagePromptpayProxyAdapter$ManagePromptpayViewHolder from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        long j = ((long) from.year) - ((long) this.year);
        int i = setBackgroundDrawable.write.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()];
        if (i == 1) {
            return j;
        }
        if (i == 2) {
            return j / 10;
        }
        if (i == 3) {
            return j / 100;
        }
        if (i == 4) {
            return j / 1000;
        }
        if (i == 5) {
            return from.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported unit: ");
        sb.append(eBillAdapter$EBillHolder_ViewBinding);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final QuickAccountSelectAdapter$UnselectedHolder atDay(int i) {
        return QuickAccountSelectAdapter$UnselectedHolder.ofYearDay(this.year, i);
    }

    public final C10412xd5495acd atMonth(PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder) {
        return C10412xd5495acd.m6245of(this.year, prepaidTransactionAdapter$ChildViewHolder);
    }

    public final C10412xd5495acd atMonth(int i) {
        return C10412xd5495acd.m6244of(this.year, i);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder atMonthDay(ManageAccountInboundViewHolder manageAccountInboundViewHolder) {
        return manageAccountInboundViewHolder.atYear(this.year);
    }

    public final int compareTo(ManagePromptpayProxyAdapter$ManagePromptpayViewHolder managePromptpayProxyAdapter$ManagePromptpayViewHolder) {
        return this.year - managePromptpayProxyAdapter$ManagePromptpayViewHolder.year;
    }

    public final boolean isAfter(ManagePromptpayProxyAdapter$ManagePromptpayViewHolder managePromptpayProxyAdapter$ManagePromptpayViewHolder) {
        return this.year > managePromptpayProxyAdapter$ManagePromptpayViewHolder.year;
    }

    public final boolean isBefore(ManagePromptpayProxyAdapter$ManagePromptpayViewHolder managePromptpayProxyAdapter$ManagePromptpayViewHolder) {
        return this.year < managePromptpayProxyAdapter$ManagePromptpayViewHolder.year;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagePromptpayProxyAdapter$ManagePromptpayViewHolder)) {
            return false;
        }
        if (this.year != ((ManagePromptpayProxyAdapter$ManagePromptpayViewHolder) obj).year) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.year;
    }

    public final String toString() {
        return Integer.toString(this.year);
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 67, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
    }

    static ManagePromptpayProxyAdapter$ManagePromptpayViewHolder readExternal(DataInput dataInput) throws IOException {
        return m3530of(dataInput.readInt());
    }
}
