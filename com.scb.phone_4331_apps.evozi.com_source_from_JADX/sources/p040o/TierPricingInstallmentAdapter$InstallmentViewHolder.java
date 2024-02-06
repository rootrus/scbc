package p040o;

import java.util.Locale;
import java.util.Map;

/* renamed from: o.TierPricingInstallmentAdapter$InstallmentViewHolder */
public enum TierPricingInstallmentAdapter$InstallmentViewHolder implements DenominatorAmountAdapter$PencilViewHolder {
    NANO_OF_SECOND("NanoOfSecond", BillerAdapter$ItemViewHolder_ViewBinding.NANOS, BillerAdapter$ItemViewHolder_ViewBinding.SECONDS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", BillerAdapter$ItemViewHolder_ViewBinding.NANOS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", BillerAdapter$ItemViewHolder_ViewBinding.MICROS, BillerAdapter$ItemViewHolder_ViewBinding.SECONDS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", BillerAdapter$ItemViewHolder_ViewBinding.MICROS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", BillerAdapter$ItemViewHolder_ViewBinding.MILLIS, BillerAdapter$ItemViewHolder_ViewBinding.SECONDS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 999)),
    MILLI_OF_DAY("MilliOfDay", BillerAdapter$ItemViewHolder_ViewBinding.MILLIS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", BillerAdapter$ItemViewHolder_ViewBinding.SECONDS, BillerAdapter$ItemViewHolder_ViewBinding.MINUTES, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 59)),
    SECOND_OF_DAY("SecondOfDay", BillerAdapter$ItemViewHolder_ViewBinding.SECONDS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", BillerAdapter$ItemViewHolder_ViewBinding.MINUTES, BillerAdapter$ItemViewHolder_ViewBinding.HOURS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 59)),
    MINUTE_OF_DAY("MinuteOfDay", BillerAdapter$ItemViewHolder_ViewBinding.MINUTES, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", BillerAdapter$ItemViewHolder_ViewBinding.HOURS, BillerAdapter$ItemViewHolder_ViewBinding.HALF_DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", BillerAdapter$ItemViewHolder_ViewBinding.HOURS, BillerAdapter$ItemViewHolder_ViewBinding.HALF_DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 12)),
    HOUR_OF_DAY("HourOfDay", BillerAdapter$ItemViewHolder_ViewBinding.HOURS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 23)),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", BillerAdapter$ItemViewHolder_ViewBinding.HOURS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", BillerAdapter$ItemViewHolder_ViewBinding.HALF_DAYS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 1)),
    DAY_OF_WEEK("DayOfWeek", BillerAdapter$ItemViewHolder_ViewBinding.DAYS, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", BillerAdapter$ItemViewHolder_ViewBinding.DAYS, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", BillerAdapter$ItemViewHolder_ViewBinding.DAYS, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 7)),
    DAY_OF_MONTH("DayOfMonth", BillerAdapter$ItemViewHolder_ViewBinding.DAYS, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS, FavouriteTargetAdapter$ItemViewHolder.m3506of(1, 28, 31)),
    DAY_OF_YEAR("DayOfYear", BillerAdapter$ItemViewHolder_ViewBinding.DAYS, BillerAdapter$ItemViewHolder_ViewBinding.YEARS, FavouriteTargetAdapter$ItemViewHolder.m3506of(1, 365, 366)),
    EPOCH_DAY("EpochDay", BillerAdapter$ItemViewHolder_ViewBinding.DAYS, BillerAdapter$ItemViewHolder_ViewBinding.FOREVER, FavouriteTargetAdapter$ItemViewHolder.m3505of(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS, FavouriteTargetAdapter$ItemViewHolder.m3506of(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, BillerAdapter$ItemViewHolder_ViewBinding.YEARS, FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", BillerAdapter$ItemViewHolder_ViewBinding.MONTHS, BillerAdapter$ItemViewHolder_ViewBinding.YEARS, FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 12)),
    PROLEPTIC_MONTH("ProlepticMonth", BillerAdapter$ItemViewHolder_ViewBinding.MONTHS, BillerAdapter$ItemViewHolder_ViewBinding.FOREVER, FavouriteTargetAdapter$ItemViewHolder.m3505of(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", BillerAdapter$ItemViewHolder_ViewBinding.YEARS, BillerAdapter$ItemViewHolder_ViewBinding.FOREVER, FavouriteTargetAdapter$ItemViewHolder.m3506of(1, 999999999, 1000000000)),
    YEAR("Year", BillerAdapter$ItemViewHolder_ViewBinding.YEARS, BillerAdapter$ItemViewHolder_ViewBinding.FOREVER, FavouriteTargetAdapter$ItemViewHolder.m3505of(-999999999, 999999999)),
    ERA("Era", BillerAdapter$ItemViewHolder_ViewBinding.ERAS, BillerAdapter$ItemViewHolder_ViewBinding.FOREVER, FavouriteTargetAdapter$ItemViewHolder.m3505of(0, 1)),
    INSTANT_SECONDS("InstantSeconds", BillerAdapter$ItemViewHolder_ViewBinding.SECONDS, BillerAdapter$ItemViewHolder_ViewBinding.FOREVER, FavouriteTargetAdapter$ItemViewHolder.m3505of(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", BillerAdapter$ItemViewHolder_ViewBinding.SECONDS, BillerAdapter$ItemViewHolder_ViewBinding.FOREVER, FavouriteTargetAdapter$ItemViewHolder.m3505of(-64800, 64800));
    
    private final EBillAdapter$EBillHolder_ViewBinding baseUnit;
    private final String name;
    private final FavouriteTargetAdapter$ItemViewHolder range;
    private final EBillAdapter$EBillHolder_ViewBinding rangeUnit;

    public final DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding resolve(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        return null;
    }

    private TierPricingInstallmentAdapter$InstallmentViewHolder(String str, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding2, FavouriteTargetAdapter$ItemViewHolder favouriteTargetAdapter$ItemViewHolder) {
        this.name = str;
        this.baseUnit = eBillAdapter$EBillHolder_ViewBinding;
        this.rangeUnit = eBillAdapter$EBillHolder_ViewBinding2;
        this.range = favouriteTargetAdapter$ItemViewHolder;
    }

    public final EBillAdapter$EBillHolder_ViewBinding getBaseUnit() {
        return this.baseUnit;
    }

    public final EBillAdapter$EBillHolder_ViewBinding getRangeUnit() {
        return this.rangeUnit;
    }

    public final FavouriteTargetAdapter$ItemViewHolder range() {
        return this.range;
    }

    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final long checkValidValue(long j) {
        return range().checkValidValue(j, this);
    }

    public final int checkValidIntValue(long j) {
        return range().checkValidIntValue(j, this);
    }

    public final boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(this);
    }

    public final FavouriteTargetAdapter$ItemViewHolder rangeRefinedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.range(this);
    }

    public final long getFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(this);
    }

    public final <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R adjustInto(R r, long j) {
        return r.with(this, j);
    }

    public final String getDisplayName(Locale locale) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
        return toString();
    }

    public final String toString() {
        return this.name;
    }
}
