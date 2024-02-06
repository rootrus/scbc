package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.OffsetDateTime;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.QuickAccountSelectAdapter$UnselectedHolder */
public final class QuickAccountSelectAdapter$UnselectedHolder extends PromptPayMobileListAdapter$PromptPayListView implements Serializable {
    static final long DAYS_0000_TO_1970 = 719528;
    private static final int DAYS_PER_CYCLE = 146097;
    public static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$UnselectedHolder> FROM = new EBillAdapter$EBillHolder<QuickAccountSelectAdapter$UnselectedHolder>() {
        public final QuickAccountSelectAdapter$UnselectedHolder queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    public static final QuickAccountSelectAdapter$UnselectedHolder MAX = m3547of((int) ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.MAX_VALUE, 12, 31);
    public static final QuickAccountSelectAdapter$UnselectedHolder MIN = m3547of((int) ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.MIN_VALUE, 1, 1);
    private static final long serialVersionUID = 2942565459149668126L;
    private final short day;
    private final short month;
    private final int year;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((PromptPayMobileListAdapter$PromptPayListView) obj);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static QuickAccountSelectAdapter$UnselectedHolder now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static QuickAccountSelectAdapter$UnselectedHolder now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant = preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.instant();
        return ofEpochDay(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(instant.getEpochSecond() + ((long) preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.getZone().getRules().getOffset(instant).getTotalSeconds()), 86400));
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder m3548of(int i, PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder, int i2) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidValue((long) i);
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(prepaidTransactionAdapter$ChildViewHolder, "month");
        TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH.checkValidValue((long) i2);
        return create(i, prepaidTransactionAdapter$ChildViewHolder, i2);
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder m3547of(int i, int i2, int i3) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidValue((long) i);
        TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidValue((long) i2);
        TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH.checkValidValue((long) i3);
        return create(i, PrepaidTransactionAdapter$ChildViewHolder.m3539of(i2), i3);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder ofYearDay(int i, int i2) {
        long j = (long) i;
        TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidValue(j);
        TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR.checkValidValue((long) i2);
        boolean isLeapYear = RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear(j);
        if (i2 != 366 || isLeapYear) {
            PrepaidTransactionAdapter$ChildViewHolder of = PrepaidTransactionAdapter$ChildViewHolder.m3539of(((i2 - 1) / 31) + 1);
            if (i2 > (of.firstDayOfYear(isLeapYear) + of.length(isLeapYear)) - 1) {
                of = of.plus(1);
            }
            return create(i, of, (i2 - of.firstDayOfYear(isLeapYear)) + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid date 'DayOfYear 366' as '");
        sb.append(i);
        sb.append("' is not a leap year");
        throw new DateTimeException(sb.toString());
    }

    public static QuickAccountSelectAdapter$UnselectedHolder ofEpochDay(long j) {
        long j2;
        long j3 = j;
        TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY.checkValidValue(j3);
        long j4 = (j3 + DAYS_0000_TO_1970) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j2 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j2 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        }
        int i = (int) j7;
        int i2 = ((i * 5) + 2) / 153;
        return new QuickAccountSelectAdapter$UnselectedHolder(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(j6 + j2 + ((long) (i2 / 10))), ((i2 + 2) % 12) + 1, (i - (((i2 * 306) + 5) / 10)) + 1);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder = (QuickAccountSelectAdapter$UnselectedHolder) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate());
        if (quickAccountSelectAdapter$UnselectedHolder != null) {
            return quickAccountSelectAdapter$UnselectedHolder;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to obtain LocalDate from TemporalAccessor: ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        sb.append(", type ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
        throw new DateTimeException(sb.toString());
    }

    public static QuickAccountSelectAdapter$UnselectedHolder parse(CharSequence charSequence) {
        return parse(charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_LOCAL_DATE);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (QuickAccountSelectAdapter$UnselectedHolder) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    private static QuickAccountSelectAdapter$UnselectedHolder create(int i, PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder, int i2) {
        if (i2 <= 28 || i2 <= prepaidTransactionAdapter$ChildViewHolder.length(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear((long) i))) {
            return new QuickAccountSelectAdapter$UnselectedHolder(i, prepaidTransactionAdapter$ChildViewHolder.getValue(), i2);
        }
        if (i2 == 29) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid date 'February 29' as '");
            sb.append(i);
            sb.append("' is not a leap year");
            throw new DateTimeException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid date '");
        sb2.append(prepaidTransactionAdapter$ChildViewHolder.name());
        sb2.append(" ");
        sb2.append(i2);
        sb2.append("'");
        throw new DateTimeException(sb2.toString());
    }

    private static QuickAccountSelectAdapter$UnselectedHolder resolvePreviousValid(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return m3547of(i, i2, i3);
    }

    private QuickAccountSelectAdapter$UnselectedHolder(int i, int i2, int i3) {
        this.year = i;
        this.month = (short) i2;
        this.day = (short) i3;
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return super.isSupported(denominatorAmountAdapter$PencilViewHolder);
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        if (tierPricingInstallmentAdapter$InstallmentViewHolder.isDateBased()) {
            int i = AlertController$RecycleListView.RatingCompat.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
            if (i == 1) {
                return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, (long) lengthOfMonth());
            }
            if (i == 2) {
                return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, (long) lengthOfYear());
            }
            if (i == 3) {
                return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, (getMonth() != PrepaidTransactionAdapter$ChildViewHolder.FEBRUARY || isLeapYear()) ? 5 : 4);
            } else if (i != 4) {
                return denominatorAmountAdapter$PencilViewHolder.range();
            } else {
                return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, getYear() <= 0 ? 1000000000 : 999999999);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            return get0(denominatorAmountAdapter$PencilViewHolder);
        }
        return super.get(denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY) {
            return toEpochDay();
        }
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH) {
            return getProlepticMonth();
        }
        return (long) get0(denominatorAmountAdapter$PencilViewHolder);
    }

    private int get0(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        switch (AlertController$RecycleListView.RatingCompat.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()]) {
            case 1:
                return this.day;
            case 2:
                return getDayOfYear();
            case 3:
                return ((this.day - 1) / 7) + 1;
            case 4:
                int i = this.year;
                return i <= 0 ? 1 - i : i;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                return ((this.day - 1) % 7) + 1;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                StringBuilder sb = new StringBuilder();
                sb.append("Field too large for an int: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new DateTimeException(sb.toString());
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.month;
            case 11:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Field too large for an int: ");
                sb2.append(denominatorAmountAdapter$PencilViewHolder);
                throw new DateTimeException(sb2.toString());
            case 12:
                return this.year;
            case 13:
                if (this.year <= 0) {
                    return 0;
                }
                return 1;
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unsupported field: ");
                sb3.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb3.toString());
        }
    }

    private long getProlepticMonth() {
        return (((long) this.year) * 12) + ((long) (this.month - 1));
    }

    public final RemittanceCountryListAdapter$CountryViewHolder getChronology() {
        return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE;
    }

    public final RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding getEra() {
        return super.getEra();
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

    public final int getDayOfMonth() {
        return this.day;
    }

    public final int getDayOfYear() {
        return (getMonth().firstDayOfYear(isLeapYear()) + this.day) - 1;
    }

    public final QuickAccountSelectAdapter$FooterHolder_ViewBinding getDayOfWeek() {
        return QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(toEpochDay() + 3, 7) + 1);
    }

    public final boolean isLeapYear() {
        return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear((long) this.year);
    }

    public final int lengthOfMonth() {
        short s = this.month;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : isLeapYear() ? 29 : 28;
    }

    public final int lengthOfYear() {
        return isLeapYear() ? 366 : 365;
    }

    public final QuickAccountSelectAdapter$UnselectedHolder with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder) {
            return (QuickAccountSelectAdapter$UnselectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding;
        }
        return (QuickAccountSelectAdapter$UnselectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (QuickAccountSelectAdapter$UnselectedHolder) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidValue(j);
        switch (AlertController$RecycleListView.RatingCompat.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()]) {
            case 1:
                return withDayOfMonth((int) j);
            case 2:
                return withDayOfYear((int) j);
            case 3:
                return plusWeeks(j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.year <= 0) {
                    j = 1 - j;
                }
                return withYear((int) j);
            case 5:
                return plusDays(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return plusDays(j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return ofEpochDay(j);
            case 9:
                return plusWeeks(j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return withMonth((int) j);
            case 11:
                return plusMonths(j - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH));
            case 12:
                return withYear((int) j);
            case 13:
                return getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) == j ? this : withYear(1 - this.year);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$UnselectedHolder withYear(int i) {
        if (this.year == i) {
            return this;
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidValue((long) i);
        return resolvePreviousValid(i, this.month, this.day);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder withMonth(int i) {
        if (this.month == i) {
            return this;
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidValue((long) i);
        return resolvePreviousValid(this.year, i, this.day);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder withDayOfMonth(int i) {
        if (this.day == i) {
            return this;
        }
        return m3547of(this.year, (int) this.month, i);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder withDayOfYear(int i) {
        if (getDayOfYear() == i) {
            return this;
        }
        return ofYearDay(this.year, i);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$UnselectedHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return (QuickAccountSelectAdapter$UnselectedHolder) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
        }
        switch (AlertController$RecycleListView.RatingCompat.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusWeeks(j);
            case 3:
                return plusMonths(j);
            case 4:
                return plusYears(j);
            case 5:
                return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 10));
            case 6:
                return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 100));
            case 7:
                return plusYears(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 1000));
            case 8:
                return with((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.ERA, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA), j));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$UnselectedHolder plusYears(long j) {
        if (j == 0) {
            return this;
        }
        return resolvePreviousValid(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(((long) this.year) + j), this.month, this.day);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder plusMonths(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.year) * 12) + ((long) (this.month - 1)) + j;
        return resolvePreviousValid(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j2, 12)), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(j2, 12) + 1, this.day);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder plusWeeks(long j) {
        return plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 7));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder plusDays(long j) {
        if (j == 0) {
            return this;
        }
        return ofEpochDay(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(toEpochDay(), j));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$UnselectedHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1) : plusYears(-j);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1) : plusWeeks(-j);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j);
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            return this;
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return super.adjustInto(denominatorAmountAdapter$BubbleViewDisableHolder);
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        QuickAccountSelectAdapter$UnselectedHolder from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        switch (AlertController$RecycleListView.RatingCompat.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return daysUntil(from);
            case 2:
                return daysUntil(from) / 7;
            case 3:
                return monthsUntil(from);
            case 4:
                return monthsUntil(from) / 12;
            case 5:
                return monthsUntil(from) / 120;
            case 6:
                return monthsUntil(from) / 1200;
            case 7:
                return monthsUntil(from) / 12000;
            case 8:
                return from.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) - getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public final long daysUntil(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        return quickAccountSelectAdapter$UnselectedHolder.toEpochDay() - toEpochDay();
    }

    private long monthsUntil(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        long prolepticMonth = getProlepticMonth();
        return (((quickAccountSelectAdapter$UnselectedHolder.getProlepticMonth() << 5) + ((long) quickAccountSelectAdapter$UnselectedHolder.getDayOfMonth())) - ((prolepticMonth << 5) + ((long) getDayOfMonth()))) / 32;
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding until(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        QuickAccountSelectAdapter$UnselectedHolder from = from(promptPayMobileListAdapter$PromptPayListView);
        long prolepticMonth = from.getProlepticMonth() - getProlepticMonth();
        int i = from.day - this.day;
        int i2 = (prolepticMonth > 0 ? 1 : (prolepticMonth == 0 ? 0 : -1));
        if (i2 > 0 && i < 0) {
            prolepticMonth--;
            i = (int) (from.toEpochDay() - plusMonths(prolepticMonth).toEpochDay());
        } else if (i2 < 0 && i > 0) {
            prolepticMonth++;
            i -= from.lengthOfMonth();
        }
        return PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.m3540of(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(prolepticMonth / 12), (int) (prolepticMonth % 12), i);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding atTime(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of(this, quickAccountSelectAdapter$SelectedHolder);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding atTime(int i, int i2) {
        return atTime(QuickAccountSelectAdapter$SelectedHolder.m3543of(i, i2));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding atTime(int i, int i2, int i3) {
        return atTime(QuickAccountSelectAdapter$SelectedHolder.m3544of(i, i2, i3));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding atTime(int i, int i2, int i3, int i4) {
        return atTime(QuickAccountSelectAdapter$SelectedHolder.m3545of(i, i2, i3, i4));
    }

    public final OffsetDateTime atTime(PrepaidTransactionAdapter$ParentViewHolder prepaidTransactionAdapter$ParentViewHolder) {
        return OffsetDateTime.m3130of(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of(this, prepaidTransactionAdapter$ParentViewHolder.toLocalTime()), prepaidTransactionAdapter$ParentViewHolder.getOffset());
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding atStartOfDay() {
        return QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of(this, QuickAccountSelectAdapter$SelectedHolder.MIDNIGHT);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding atStartOfDay(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        HistoryAdapter$ChildViewHolder_ViewBinding transition;
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        QuickAccountSelectAdapter$UnselectedHolder_ViewBinding atTime = atTime(QuickAccountSelectAdapter$SelectedHolder.MIDNIGHT);
        if (!(languageSettingAdapter$LanguageSettingHolder_ViewBinding instanceof ManageAccountInboundViewHolder_ViewBinding) && (transition = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules().getTransition(atTime)) != null && transition.isGap()) {
            atTime = transition.getDateTimeAfter();
        }
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.m3075of(atTime, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final long toEpochDay() {
        long j;
        long j2 = (long) this.year;
        long j3 = (long) this.month;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = j4 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400);
        } else {
            j = j4 - (((j2 / -4) - (j2 / -100)) + (j2 / -400));
        }
        long j5 = j + (((367 * j3) - 362) / 12) + ((long) (this.day - 1));
        if (j3 > 2) {
            j5--;
            if (!isLeapYear()) {
                j5--;
            }
        }
        return j5 - DAYS_0000_TO_1970;
    }

    public final int compareTo(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        if (promptPayMobileListAdapter$PromptPayListView instanceof QuickAccountSelectAdapter$UnselectedHolder) {
            return compareTo0((QuickAccountSelectAdapter$UnselectedHolder) promptPayMobileListAdapter$PromptPayListView);
        }
        return super.compareTo(promptPayMobileListAdapter$PromptPayListView);
    }

    /* access modifiers changed from: package-private */
    public final int compareTo0(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        int i = this.year - quickAccountSelectAdapter$UnselectedHolder.year;
        if (i != 0) {
            return i;
        }
        int i2 = this.month - quickAccountSelectAdapter$UnselectedHolder.month;
        return i2 == 0 ? this.day - quickAccountSelectAdapter$UnselectedHolder.day : i2;
    }

    public final boolean isAfter(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        if (promptPayMobileListAdapter$PromptPayListView instanceof QuickAccountSelectAdapter$UnselectedHolder) {
            return compareTo0((QuickAccountSelectAdapter$UnselectedHolder) promptPayMobileListAdapter$PromptPayListView) > 0;
        }
        return super.isAfter(promptPayMobileListAdapter$PromptPayListView);
    }

    public final boolean isBefore(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        if (promptPayMobileListAdapter$PromptPayListView instanceof QuickAccountSelectAdapter$UnselectedHolder) {
            return compareTo0((QuickAccountSelectAdapter$UnselectedHolder) promptPayMobileListAdapter$PromptPayListView) < 0;
        }
        return super.isBefore(promptPayMobileListAdapter$PromptPayListView);
    }

    public final boolean isEqual(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        if (promptPayMobileListAdapter$PromptPayListView instanceof QuickAccountSelectAdapter$UnselectedHolder) {
            return compareTo0((QuickAccountSelectAdapter$UnselectedHolder) promptPayMobileListAdapter$PromptPayListView) == 0;
        }
        return super.isEqual(promptPayMobileListAdapter$PromptPayListView);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickAccountSelectAdapter$UnselectedHolder)) {
            return false;
        }
        if (compareTo0((QuickAccountSelectAdapter$UnselectedHolder) obj) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.year;
        return (i & -2048) ^ (((i << 11) + (this.month << 6)) + this.day);
    }

    public final String toString() {
        int i = this.year;
        short s = this.month;
        short s2 = this.day;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        String str = "-";
        sb.append(s < 10 ? "-0" : str);
        sb.append(s);
        if (s2 < 10) {
            str = "-0";
        }
        sb.append(str);
        sb.append(s2);
        return sb.toString();
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        return super.format(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 3, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.year);
        dataOutput.writeByte(this.month);
        dataOutput.writeByte(this.day);
    }

    static QuickAccountSelectAdapter$UnselectedHolder readExternal(DataInput dataInput) throws IOException {
        return m3547of(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
