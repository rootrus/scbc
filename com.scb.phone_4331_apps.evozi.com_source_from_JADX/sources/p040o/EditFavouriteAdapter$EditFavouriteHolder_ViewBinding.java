package p040o;

import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.p041bp.DateTimeException;

/* renamed from: o.EditFavouriteAdapter$EditFavouriteHolder_ViewBinding */
public final class EditFavouriteAdapter$EditFavouriteHolder_ViewBinding implements Serializable {
    private static final ConcurrentMap<String, EditFavouriteAdapter$EditFavouriteHolder_ViewBinding> CACHE = new ConcurrentHashMap(4, 0.75f, 2);
    public static final EditFavouriteAdapter$EditFavouriteHolder_ViewBinding ISO = new EditFavouriteAdapter$EditFavouriteHolder_ViewBinding(QuickAccountSelectAdapter$FooterHolder_ViewBinding.MONDAY, 4);
    public static final EditFavouriteAdapter$EditFavouriteHolder_ViewBinding SUNDAY_START = m3502of(QuickAccountSelectAdapter$FooterHolder_ViewBinding.SUNDAY, 1);
    private static final long serialVersionUID = -1177360819670808121L;
    private final transient DenominatorAmountAdapter$PencilViewHolder dayOfWeek = write.ofDayOfWeekField(this);
    private final QuickAccountSelectAdapter$FooterHolder_ViewBinding firstDayOfWeek;
    private final int minimalDays;
    private final transient DenominatorAmountAdapter$PencilViewHolder weekBasedYear = write.ofWeekBasedYearField(this);
    private final transient DenominatorAmountAdapter$PencilViewHolder weekOfMonth = write.ofWeekOfMonthField(this);
    /* access modifiers changed from: private */
    public final transient DenominatorAmountAdapter$PencilViewHolder weekOfWeekBasedYear = write.ofWeekOfWeekBasedYearField(this);
    private final transient DenominatorAmountAdapter$PencilViewHolder weekOfYear = write.ofWeekOfYearField(this);

    /* renamed from: of */
    public static EditFavouriteAdapter$EditFavouriteHolder_ViewBinding m3501of(Locale locale) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return m3502of(QuickAccountSelectAdapter$FooterHolder_ViewBinding.SUNDAY.plus((long) (gregorianCalendar.getFirstDayOfWeek() - 1)), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    /* renamed from: of */
    public static EditFavouriteAdapter$EditFavouriteHolder_ViewBinding m3502of(QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(quickAccountSelectAdapter$FooterHolder_ViewBinding.toString());
        sb.append(i);
        String obj = sb.toString();
        EditFavouriteAdapter$EditFavouriteHolder_ViewBinding editFavouriteAdapter$EditFavouriteHolder_ViewBinding = (EditFavouriteAdapter$EditFavouriteHolder_ViewBinding) CACHE.get(obj);
        if (editFavouriteAdapter$EditFavouriteHolder_ViewBinding != null) {
            return editFavouriteAdapter$EditFavouriteHolder_ViewBinding;
        }
        CACHE.putIfAbsent(obj, new EditFavouriteAdapter$EditFavouriteHolder_ViewBinding(quickAccountSelectAdapter$FooterHolder_ViewBinding, i));
        return (EditFavouriteAdapter$EditFavouriteHolder_ViewBinding) CACHE.get(obj);
    }

    private EditFavouriteAdapter$EditFavouriteHolder_ViewBinding(QuickAccountSelectAdapter$FooterHolder_ViewBinding quickAccountSelectAdapter$FooterHolder_ViewBinding, int i) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$FooterHolder_ViewBinding, "firstDayOfWeek");
        if (i <= 0 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.firstDayOfWeek = quickAccountSelectAdapter$FooterHolder_ViewBinding;
        this.minimalDays = i;
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return m3502of(this.firstDayOfWeek, this.minimalDays);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid WeekFields");
            sb.append(e.getMessage());
            throw new InvalidObjectException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$FooterHolder_ViewBinding getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public final int getMinimalDaysInFirstWeek() {
        return this.minimalDays;
    }

    public final DenominatorAmountAdapter$PencilViewHolder dayOfWeek() {
        return this.dayOfWeek;
    }

    public final DenominatorAmountAdapter$PencilViewHolder weekOfMonth() {
        return this.weekOfMonth;
    }

    public final DenominatorAmountAdapter$PencilViewHolder weekOfYear() {
        return this.weekOfYear;
    }

    public final DenominatorAmountAdapter$PencilViewHolder weekOfWeekBasedYear() {
        return this.weekOfWeekBasedYear;
    }

    public final DenominatorAmountAdapter$PencilViewHolder weekBasedYear() {
        return this.weekBasedYear;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditFavouriteAdapter$EditFavouriteHolder_ViewBinding)) {
            return false;
        }
        if (hashCode() != obj.hashCode()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.firstDayOfWeek.ordinal() * 7) + this.minimalDays;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("WeekFields[");
        sb.append(this.firstDayOfWeek);
        sb.append(',');
        sb.append(this.minimalDays);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: o.EditFavouriteAdapter$EditFavouriteHolder_ViewBinding$write */
    static class write implements DenominatorAmountAdapter$PencilViewHolder {
        private static final FavouriteTargetAdapter$ItemViewHolder DAY_OF_WEEK_RANGE = FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 7);
        private static final FavouriteTargetAdapter$ItemViewHolder WEEK_BASED_YEAR_RANGE = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.range();
        private static final FavouriteTargetAdapter$ItemViewHolder WEEK_OF_MONTH_RANGE = FavouriteTargetAdapter$ItemViewHolder.m3507of(0, 1, 4, 6);
        private static final FavouriteTargetAdapter$ItemViewHolder WEEK_OF_WEEK_BASED_YEAR_RANGE = FavouriteTargetAdapter$ItemViewHolder.m3506of(1, 52, 53);
        private static final FavouriteTargetAdapter$ItemViewHolder WEEK_OF_YEAR_RANGE = FavouriteTargetAdapter$ItemViewHolder.m3507of(0, 1, 52, 54);
        private final EBillAdapter$EBillHolder_ViewBinding baseUnit;
        private final String name;
        private final FavouriteTargetAdapter$ItemViewHolder range;
        private final EBillAdapter$EBillHolder_ViewBinding rangeUnit;
        private final EditFavouriteAdapter$EditFavouriteHolder_ViewBinding weekDef;

        public boolean isDateBased() {
            return true;
        }

        public boolean isTimeBased() {
            return false;
        }

        static write ofDayOfWeekField(EditFavouriteAdapter$EditFavouriteHolder_ViewBinding editFavouriteAdapter$EditFavouriteHolder_ViewBinding) {
            return new write("DayOfWeek", editFavouriteAdapter$EditFavouriteHolder_ViewBinding, BillerAdapter$ItemViewHolder_ViewBinding.DAYS, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, DAY_OF_WEEK_RANGE);
        }

        static write ofWeekOfMonthField(EditFavouriteAdapter$EditFavouriteHolder_ViewBinding editFavouriteAdapter$EditFavouriteHolder_ViewBinding) {
            return new write("WeekOfMonth", editFavouriteAdapter$EditFavouriteHolder_ViewBinding, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS, WEEK_OF_MONTH_RANGE);
        }

        static write ofWeekOfYearField(EditFavouriteAdapter$EditFavouriteHolder_ViewBinding editFavouriteAdapter$EditFavouriteHolder_ViewBinding) {
            return new write("WeekOfYear", editFavouriteAdapter$EditFavouriteHolder_ViewBinding, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, BillerAdapter$ItemViewHolder_ViewBinding.YEARS, WEEK_OF_YEAR_RANGE);
        }

        static write ofWeekOfWeekBasedYearField(EditFavouriteAdapter$EditFavouriteHolder_ViewBinding editFavouriteAdapter$EditFavouriteHolder_ViewBinding) {
            return new write("WeekOfWeekBasedYear", editFavouriteAdapter$EditFavouriteHolder_ViewBinding, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS, BillerAdapter$ItemViewHolder.WEEK_BASED_YEARS, WEEK_OF_WEEK_BASED_YEAR_RANGE);
        }

        static write ofWeekBasedYearField(EditFavouriteAdapter$EditFavouriteHolder_ViewBinding editFavouriteAdapter$EditFavouriteHolder_ViewBinding) {
            return new write("WeekBasedYear", editFavouriteAdapter$EditFavouriteHolder_ViewBinding, BillerAdapter$ItemViewHolder.WEEK_BASED_YEARS, BillerAdapter$ItemViewHolder_ViewBinding.FOREVER, WEEK_BASED_YEAR_RANGE);
        }

        private write(String str, EditFavouriteAdapter$EditFavouriteHolder_ViewBinding editFavouriteAdapter$EditFavouriteHolder_ViewBinding, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding2, FavouriteTargetAdapter$ItemViewHolder favouriteTargetAdapter$ItemViewHolder) {
            this.name = str;
            this.weekDef = editFavouriteAdapter$EditFavouriteHolder_ViewBinding;
            this.baseUnit = eBillAdapter$EBillHolder_ViewBinding;
            this.rangeUnit = eBillAdapter$EBillHolder_ViewBinding2;
            this.range = favouriteTargetAdapter$ItemViewHolder;
        }

        public long getFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            int i;
            int floorMod = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) - this.weekDef.getFirstDayOfWeek().getValue(), 7) + 1;
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.WEEKS) {
                return (long) floorMod;
            }
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.MONTHS) {
                int i2 = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH);
                i = computeWeek(startOfWeekOffset(i2, floorMod), i2);
            } else if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.YEARS) {
                int i3 = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR);
                i = computeWeek(startOfWeekOffset(i3, floorMod), i3);
            } else if (this.rangeUnit == BillerAdapter$ItemViewHolder.WEEK_BASED_YEARS) {
                i = localizedWOWBY(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            } else if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.FOREVER) {
                i = localizedWBY(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            } else {
                throw new IllegalStateException("unreachable");
            }
            return (long) i;
        }

        private int localizedDayOfWeek(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, int i) {
            return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) - i, 7) + 1;
        }

        private long localizedWeekOfMonth(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, int i) {
            int i2 = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH);
            return (long) computeWeek(startOfWeekOffset(i2, i), i2);
        }

        private long localizedWeekOfYear(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, int i) {
            int i2 = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR);
            return (long) computeWeek(startOfWeekOffset(i2, i), i2);
        }

        private int localizedWOWBY(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            int floorMod = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) - this.weekDef.getFirstDayOfWeek().getValue(), 7) + 1;
            long localizedWeekOfYear = localizedWeekOfYear(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, floorMod);
            if (localizedWeekOfYear == 0) {
                return ((int) localizedWeekOfYear(C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).minus(1, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS), floorMod)) + 1;
            }
            if (localizedWeekOfYear >= 53) {
                int computeWeek = computeWeek(startOfWeekOffset(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR), floorMod), (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.isLeap((long) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR)) ? 366 : 365) + this.weekDef.getMinimalDaysInFirstWeek());
                if (localizedWeekOfYear >= ((long) computeWeek)) {
                    return (int) (localizedWeekOfYear - ((long) (computeWeek - 1)));
                }
            }
            return (int) localizedWeekOfYear;
        }

        private int localizedWBY(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            int floorMod = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) - this.weekDef.getFirstDayOfWeek().getValue(), 7) + 1;
            int i = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR);
            long localizedWeekOfYear = localizedWeekOfYear(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, floorMod);
            if (localizedWeekOfYear == 0) {
                return i - 1;
            }
            if (localizedWeekOfYear < 53) {
                return i;
            }
            return localizedWeekOfYear >= ((long) computeWeek(startOfWeekOffset(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR), floorMod), (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.isLeap((long) i) ? 366 : 365) + this.weekDef.getMinimalDaysInFirstWeek())) ? i + 1 : i;
        }

        private int startOfWeekOffset(int i, int i2) {
            int floorMod = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(i - i2, 7);
            return floorMod + 1 > this.weekDef.getMinimalDaysInFirstWeek() ? 7 - floorMod : -floorMod;
        }

        private int computeWeek(int i, int i2) {
            return ((i + 7) + (i2 - 1)) / 7;
        }

        public <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R adjustInto(R r, long j) {
            int checkValidIntValue = this.range.checkValidIntValue(j, this);
            int i = r.get(this);
            if (checkValidIntValue == i) {
                return r;
            }
            if (this.rangeUnit != BillerAdapter$ItemViewHolder_ViewBinding.FOREVER) {
                return r.plus((long) (checkValidIntValue - i), this.baseUnit);
            }
            int i2 = r.get(this.weekDef.weekOfWeekBasedYear);
            DenominatorAmountAdapter$BubbleViewDisableHolder plus = r.plus((long) (((double) (j - ((long) i))) * 52.1775d), BillerAdapter$ItemViewHolder_ViewBinding.WEEKS);
            if (plus.get(this) > checkValidIntValue) {
                return plus.minus((long) plus.get(this.weekDef.weekOfWeekBasedYear), BillerAdapter$ItemViewHolder_ViewBinding.WEEKS);
            }
            if (plus.get(this) < checkValidIntValue) {
                plus = plus.plus(2, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS);
            }
            R plus2 = plus.plus((long) (i2 - plus.get(this.weekDef.weekOfWeekBasedYear)), BillerAdapter$ItemViewHolder_ViewBinding.WEEKS);
            return plus2.get(this) > checkValidIntValue ? plus2.minus(1, BillerAdapter$ItemViewHolder_ViewBinding.WEEKS) : plus2;
        }

        public DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding resolve(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
            long j;
            PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView;
            long j2;
            PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView2;
            long j3;
            long j4;
            int i;
            int value = this.weekDef.getFirstDayOfWeek().getValue();
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.WEEKS) {
                map.put(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK, Long.valueOf((long) (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod((value - 1) + (this.range.checkValidIntValue(map.remove(this).longValue(), this) - 1), 7) + 1)));
                return null;
            } else if (!map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) {
                return null;
            } else {
                if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.FOREVER) {
                    if (!map.containsKey(this.weekDef.weekOfWeekBasedYear)) {
                        return null;
                    }
                    C7022x6c0e8d61 from = C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
                    int floorMod = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue()) - value, 7);
                    int checkValidIntValue = range().checkValidIntValue(map.get(this).longValue(), this);
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                        promptPayMobileListAdapter$PromptPayListView2 = from.date(checkValidIntValue, 1, this.weekDef.getMinimalDaysInFirstWeek());
                        j4 = map.get(this.weekDef.weekOfWeekBasedYear).longValue();
                        i = localizedDayOfWeek(promptPayMobileListAdapter$PromptPayListView2, value);
                        j3 = localizedWeekOfYear(promptPayMobileListAdapter$PromptPayListView2, i);
                    } else {
                        promptPayMobileListAdapter$PromptPayListView2 = from.date(checkValidIntValue, 1, this.weekDef.getMinimalDaysInFirstWeek());
                        j4 = (long) this.weekDef.weekOfWeekBasedYear.range().checkValidIntValue(map.get(this.weekDef.weekOfWeekBasedYear).longValue(), this.weekDef.weekOfWeekBasedYear);
                        i = localizedDayOfWeek(promptPayMobileListAdapter$PromptPayListView2, value);
                        j3 = localizedWeekOfYear(promptPayMobileListAdapter$PromptPayListView2, i);
                    }
                    PromptPayMobileListAdapter$PromptPayListView plus = promptPayMobileListAdapter$PromptPayListView2.plus(((j4 - j3) * 7) + ((long) ((floorMod + 1) - i)), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plus.getLong(this) == map.get(this).longValue()) {
                        map.remove(this);
                        map.remove(this.weekDef.weekOfWeekBasedYear);
                        map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
                        return plus;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                } else if (!map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR)) {
                    return null;
                } else {
                    int floorMod2 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue()) - value, 7) + 1;
                    int checkValidIntValue2 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                    C7022x6c0e8d61 from2 = C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
                    if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.MONTHS) {
                        if (!map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR)) {
                            return null;
                        }
                        long longValue = map.remove(this).longValue();
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                            promptPayMobileListAdapter$PromptPayListView = from2.date(checkValidIntValue2, 1, 1).plus(map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue() - 1, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
                            int localizedDayOfWeek = localizedDayOfWeek(promptPayMobileListAdapter$PromptPayListView, value);
                            j2 = ((longValue - localizedWeekOfMonth(promptPayMobileListAdapter$PromptPayListView, localizedDayOfWeek)) * 7) + ((long) (floorMod2 - localizedDayOfWeek));
                        } else {
                            promptPayMobileListAdapter$PromptPayListView = from2.date(checkValidIntValue2, TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidIntValue(map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue()), 8);
                            int localizedDayOfWeek2 = localizedDayOfWeek(promptPayMobileListAdapter$PromptPayListView, value);
                            j2 = ((((long) this.range.checkValidIntValue(longValue, this)) - localizedWeekOfMonth(promptPayMobileListAdapter$PromptPayListView, localizedDayOfWeek2)) * 7) + ((long) (floorMod2 - localizedDayOfWeek2));
                        }
                        PromptPayMobileListAdapter$PromptPayListView plus2 = promptPayMobileListAdapter$PromptPayListView.plus(j2, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plus2.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) == map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue()) {
                            map.remove(this);
                            map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR);
                            map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR);
                            map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
                            return plus2;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    } else if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.YEARS) {
                        long longValue2 = map.remove(this).longValue();
                        PromptPayMobileListAdapter$PromptPayListView date = from2.date(checkValidIntValue2, 1, 1);
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                            int localizedDayOfWeek3 = localizedDayOfWeek(date, value);
                            j = ((longValue2 - localizedWeekOfYear(date, localizedDayOfWeek3)) * 7) + ((long) (floorMod2 - localizedDayOfWeek3));
                        } else {
                            int localizedDayOfWeek4 = localizedDayOfWeek(date, value);
                            j = ((((long) this.range.checkValidIntValue(longValue2, this)) - localizedWeekOfYear(date, localizedDayOfWeek4)) * 7) + ((long) (floorMod2 - localizedDayOfWeek4));
                        }
                        PromptPayMobileListAdapter$PromptPayListView plus3 = date.plus(j, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plus3.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR) == map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue()) {
                            map.remove(this);
                            map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR);
                            map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
                            return plus3;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different year");
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
            }
        }

        public EBillAdapter$EBillHolder_ViewBinding getBaseUnit() {
            return this.baseUnit;
        }

        public EBillAdapter$EBillHolder_ViewBinding getRangeUnit() {
            return this.rangeUnit;
        }

        public FavouriteTargetAdapter$ItemViewHolder range() {
            return this.range;
        }

        public boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (!denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) {
                return false;
            }
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.WEEKS) {
                return true;
            }
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.MONTHS) {
                return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH);
            }
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.YEARS) {
                return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR);
            }
            if (this.rangeUnit == BillerAdapter$ItemViewHolder.WEEK_BASED_YEARS) {
                return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY);
            }
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.FOREVER) {
                return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY);
            }
            return false;
        }

        public FavouriteTargetAdapter$ItemViewHolder rangeRefinedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder;
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.WEEKS) {
                return this.range;
            }
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.MONTHS) {
                tierPricingInstallmentAdapter$InstallmentViewHolder = TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH;
            } else if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.YEARS) {
                tierPricingInstallmentAdapter$InstallmentViewHolder = TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR;
            } else if (this.rangeUnit == BillerAdapter$ItemViewHolder.WEEK_BASED_YEARS) {
                return rangeWOWBY(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            } else {
                if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.FOREVER) {
                    return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.range(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR);
                }
                throw new IllegalStateException("unreachable");
            }
            int startOfWeekOffset = startOfWeekOffset(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(tierPricingInstallmentAdapter$InstallmentViewHolder), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) - this.weekDef.getFirstDayOfWeek().getValue(), 7) + 1);
            FavouriteTargetAdapter$ItemViewHolder range2 = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.range(tierPricingInstallmentAdapter$InstallmentViewHolder);
            return FavouriteTargetAdapter$ItemViewHolder.m3505of((long) computeWeek(startOfWeekOffset, (int) range2.getMinimum()), (long) computeWeek(startOfWeekOffset, (int) range2.getMaximum()));
        }

        private FavouriteTargetAdapter$ItemViewHolder rangeWOWBY(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            while (true) {
                int floorMod = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK) - this.weekDef.getFirstDayOfWeek().getValue(), 7) + 1;
                long localizedWeekOfYear = localizedWeekOfYear(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, floorMod);
                if (localizedWeekOfYear == 0) {
                    denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding = C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).minus(2, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS);
                } else {
                    int computeWeek = computeWeek(startOfWeekOffset(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR), floorMod), (ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.isLeap((long) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR)) ? 366 : 365) + this.weekDef.getMinimalDaysInFirstWeek());
                    if (localizedWeekOfYear < ((long) computeWeek)) {
                        return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, (long) (computeWeek - 1));
                    }
                    denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding = C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).plus(2, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS);
                }
            }
        }

        public String getDisplayName(Locale locale) {
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
            if (this.rangeUnit == BillerAdapter$ItemViewHolder_ViewBinding.YEARS) {
                return "Week";
            }
            return toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.name);
            sb.append("[");
            sb.append(this.weekDef.toString());
            sb.append("]");
            return sb.toString();
        }
    }
}
