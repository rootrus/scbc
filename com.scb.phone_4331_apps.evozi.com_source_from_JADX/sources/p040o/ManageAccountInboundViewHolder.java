package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.ManageAccountInboundViewHolder */
public final class ManageAccountInboundViewHolder extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<ManageAccountInboundViewHolder>, Serializable {
    public static final EBillAdapter$EBillHolder<ManageAccountInboundViewHolder> FROM = new EBillAdapter$EBillHolder<ManageAccountInboundViewHolder>() {
        public final ManageAccountInboundViewHolder queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return ManageAccountInboundViewHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    private static final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder PARSER = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendLiteral("--").appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, 2).appendLiteral('-').appendValue(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, 2).toFormatter();
    private static final long serialVersionUID = -939150713474957432L;
    private final int day;
    private final int month;

    public static ManageAccountInboundViewHolder now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static ManageAccountInboundViewHolder now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static ManageAccountInboundViewHolder now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        QuickAccountSelectAdapter$UnselectedHolder now = QuickAccountSelectAdapter$UnselectedHolder.now(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding);
        return m6243of(now.getMonth(), now.getDayOfMonth());
    }

    /* renamed from: of */
    public static ManageAccountInboundViewHolder m6243of(PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder, int i) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(prepaidTransactionAdapter$ChildViewHolder, "month");
        TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH.checkValidValue((long) i);
        if (i <= prepaidTransactionAdapter$ChildViewHolder.maxLength()) {
            return new ManageAccountInboundViewHolder(prepaidTransactionAdapter$ChildViewHolder.getValue(), i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal value for DayOfMonth field, value ");
        sb.append(i);
        sb.append(" is not valid for month ");
        sb.append(prepaidTransactionAdapter$ChildViewHolder.name());
        throw new DateTimeException(sb.toString());
    }

    /* renamed from: of */
    public static ManageAccountInboundViewHolder m6242of(int i, int i2) {
        return m6243of(PrepaidTransactionAdapter$ChildViewHolder.m3539of(i), i2);
    }

    public static ManageAccountInboundViewHolder from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof ManageAccountInboundViewHolder) {
            return (ManageAccountInboundViewHolder) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        try {
            if (!RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.equals(C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding))) {
                denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding = QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            }
            return m6242of(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR), denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH));
        } catch (DateTimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain MonthDay from TemporalAccessor: ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            sb.append(", type ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
            throw new DateTimeException(sb.toString());
        }
    }

    public static ManageAccountInboundViewHolder parse(CharSequence charSequence) {
        return parse(charSequence, PARSER);
    }

    public static ManageAccountInboundViewHolder parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (ManageAccountInboundViewHolder) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    private ManageAccountInboundViewHolder(int i, int i2) {
        this.month = i;
        this.day = i2;
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH) {
                return true;
            }
            return false;
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
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH) {
            return FavouriteTargetAdapter$ItemViewHolder.m3506of(1, (long) getMonth().minLength(), (long) getMonth().maxLength());
        }
        return super.range(denominatorAmountAdapter$PencilViewHolder);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(getLong(denominatorAmountAdapter$PencilViewHolder), denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        int i;
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        int i2 = AppCompatAutoCompleteTextView.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        if (i2 == 1) {
            i = this.day;
        } else if (i2 == 2) {
            i = this.month;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return (long) i;
    }

    public final int getMonthValue() {
        return this.month;
    }

    public final PrepaidTransactionAdapter$ChildViewHolder getMonth() {
        return PrepaidTransactionAdapter$ChildViewHolder.m3539of(this.month);
    }

    public final int getDayOfMonth() {
        return this.day;
    }

    public final boolean isValidYear(int i) {
        return !(this.day == 29 && this.month == 2 && !ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.isLeap((long) i));
    }

    public final ManageAccountInboundViewHolder withMonth(int i) {
        return with(PrepaidTransactionAdapter$ChildViewHolder.m3539of(i));
    }

    public final ManageAccountInboundViewHolder with(PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(prepaidTransactionAdapter$ChildViewHolder, "month");
        if (prepaidTransactionAdapter$ChildViewHolder.getValue() == this.month) {
            return this;
        }
        return new ManageAccountInboundViewHolder(prepaidTransactionAdapter$ChildViewHolder.getValue(), Math.min(this.day, prepaidTransactionAdapter$ChildViewHolder.maxLength()));
    }

    public final ManageAccountInboundViewHolder withDayOfMonth(int i) {
        if (i == this.day) {
            return this;
        }
        return m6242of(this.month, i);
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
            return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE;
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        if (C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder).equals(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE)) {
            DenominatorAmountAdapter$BubbleViewDisableHolder with = denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, (long) this.month);
            return with.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH, Math.min(with.range(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).getMaximum(), (long) this.day));
        }
        throw new DateTimeException("Adjustment only supported on ISO date-time");
    }

    public final QuickAccountSelectAdapter$UnselectedHolder atYear(int i) {
        return QuickAccountSelectAdapter$UnselectedHolder.m3547of(i, this.month, isValidYear(i) ? this.day : 28);
    }

    public final int compareTo(ManageAccountInboundViewHolder manageAccountInboundViewHolder) {
        int i = this.month - manageAccountInboundViewHolder.month;
        return i == 0 ? this.day - manageAccountInboundViewHolder.day : i;
    }

    public final boolean isAfter(ManageAccountInboundViewHolder manageAccountInboundViewHolder) {
        return compareTo(manageAccountInboundViewHolder) > 0;
    }

    public final boolean isBefore(ManageAccountInboundViewHolder manageAccountInboundViewHolder) {
        return compareTo(manageAccountInboundViewHolder) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManageAccountInboundViewHolder)) {
            return false;
        }
        ManageAccountInboundViewHolder manageAccountInboundViewHolder = (ManageAccountInboundViewHolder) obj;
        if (this.month == manageAccountInboundViewHolder.month && this.day == manageAccountInboundViewHolder.day) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.month << 6) + this.day;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.month < 10 ? "0" : "");
        sb.append(this.month);
        sb.append(this.day < 10 ? "-0" : "-");
        sb.append(this.day);
        return sb.toString();
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 64, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }

    static ManageAccountInboundViewHolder readExternal(DataInput dataInput) throws IOException {
        return m6242of((int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
