package p040o;

import java.util.Locale;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.BillerAdapter$ItemViewHolder$MediaBrowserCompat$CustomActionResultReceiver */
enum C6339xe2cdc83a implements DenominatorAmountAdapter$PencilViewHolder {
    DAY_OF_QUARTER {
        public final String toString() {
            return "DayOfQuarter";
        }

        public final EBillAdapter$EBillHolder_ViewBinding getBaseUnit() {
            return BillerAdapter$ItemViewHolder_ViewBinding.DAYS;
        }

        public final EBillAdapter$EBillHolder_ViewBinding getRangeUnit() {
            return BillerAdapter$ItemViewHolder.QUARTER_YEARS;
        }

        public final FavouriteTargetAdapter$ItemViewHolder range() {
            return FavouriteTargetAdapter$ItemViewHolder.m3506of(1, 90, 92);
        }

        public final boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR) && denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) && denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR) && C6339xe2cdc83a.isIso(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }

        public final FavouriteTargetAdapter$ItemViewHolder rangeRefinedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(this)) {
                long j = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(QUARTER_OF_YEAR);
                if (j == 1) {
                    return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR)) ? FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 91) : FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 90);
                } else if (j == 2) {
                    return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 91);
                } else {
                    if (j == 3 || j == 4) {
                        return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 92);
                    }
                    return range();
                }
            } else {
                throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
            }
        }

        public final long getFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(this)) {
                return (long) (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR) - C6339xe2cdc83a.QUARTER_DAYS[((denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) - 1) / 3) + (RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR)) ? 4 : 0)]);
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
        }

        public final <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R adjustInto(R r, long j) {
            long from = getFrom(r);
            range().checkValidValue(j, this);
            return r.with(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR, r.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR) + (j - from));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
            if (r0 == 2) goto L_0x0076;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding resolve(java.util.Map<p040o.DenominatorAmountAdapter$PencilViewHolder, java.lang.Long> r11, p040o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding r12, p040o.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder r13) {
            /*
                r10 = this;
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r12 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR
                java.lang.Object r12 = r11.get(r12)
                java.lang.Long r12 = (java.lang.Long) r12
                o.BillerAdapter$ItemViewHolder$MediaBrowserCompat$CustomActionResultReceiver r0 = QUARTER_OF_YEAR
                java.lang.Object r0 = r11.get(r0)
                java.lang.Long r0 = (java.lang.Long) r0
                if (r12 == 0) goto L_0x00a2
                if (r0 == 0) goto L_0x00a2
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR
                long r2 = r12.longValue()
                int r12 = r1.checkValidIntValue(r2)
                o.BillerAdapter$ItemViewHolder$MediaBrowserCompat$CustomActionResultReceiver r1 = DAY_OF_QUARTER
                java.lang.Object r1 = r11.get(r1)
                java.lang.Long r1 = (java.lang.Long) r1
                long r1 = r1.longValue()
                o.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder r3 = p040o.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT
                r4 = 3
                r5 = 1
                r7 = 1
                if (r13 != r3) goto L_0x004f
                long r8 = r0.longValue()
                o.QuickAccountSelectAdapter$UnselectedHolder r12 = p040o.QuickAccountSelectAdapter$UnselectedHolder.m3547of((int) r12, (int) r7, (int) r7)
                long r7 = p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract((long) r8, (long) r5)
                long r3 = p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply((long) r7, (int) r4)
                o.QuickAccountSelectAdapter$UnselectedHolder r12 = r12.plusMonths(r3)
                long r0 = p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract((long) r1, (long) r5)
                o.QuickAccountSelectAdapter$UnselectedHolder r12 = r12.plusDays(r0)
                goto L_0x0094
            L_0x004f:
                o.BillerAdapter$ItemViewHolder$MediaBrowserCompat$CustomActionResultReceiver r3 = QUARTER_OF_YEAR
                o.FavouriteTargetAdapter$ItemViewHolder r3 = r3.range()
                long r8 = r0.longValue()
                o.BillerAdapter$ItemViewHolder$MediaBrowserCompat$CustomActionResultReceiver r0 = QUARTER_OF_YEAR
                int r0 = r3.checkValidIntValue(r8, r0)
                o.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder r3 = p040o.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT
                if (r13 != r3) goto L_0x0081
                r13 = 92
                if (r0 != r7) goto L_0x0073
                o.RemittanceCountryListAdapter$CountryViewHolder r13 = p040o.RemittanceCountryListAdapter$CountryViewHolder.INSTANCE
                long r8 = (long) r12
                boolean r13 = r13.isLeapYear(r8)
                if (r13 != 0) goto L_0x0076
                r13 = 90
                goto L_0x0078
            L_0x0073:
                r3 = 2
                if (r0 != r3) goto L_0x0078
            L_0x0076:
                r13 = 91
            L_0x0078:
                long r8 = (long) r13
                o.FavouriteTargetAdapter$ItemViewHolder r13 = p040o.FavouriteTargetAdapter$ItemViewHolder.m3505of(r5, r8)
                r13.checkValidValue(r1, r10)
                goto L_0x0088
            L_0x0081:
                o.FavouriteTargetAdapter$ItemViewHolder r13 = r10.range()
                r13.checkValidValue(r1, r10)
            L_0x0088:
                int r0 = r0 - r7
                int r0 = r0 * r4
                int r0 = r0 + r7
                o.QuickAccountSelectAdapter$UnselectedHolder r12 = p040o.QuickAccountSelectAdapter$UnselectedHolder.m3547of((int) r12, (int) r0, (int) r7)
                long r1 = r1 - r5
                o.QuickAccountSelectAdapter$UnselectedHolder r12 = r12.plusDays(r1)
            L_0x0094:
                r11.remove(r10)
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r13 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR
                r11.remove(r13)
                o.BillerAdapter$ItemViewHolder$MediaBrowserCompat$CustomActionResultReceiver r13 = QUARTER_OF_YEAR
                r11.remove(r13)
                return r12
            L_0x00a2:
                r11 = 0
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C6339xe2cdc83a.C63412.resolve(java.util.Map, o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, o.QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder):o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding");
        }
    },
    QUARTER_OF_YEAR {
        public final String toString() {
            return "QuarterOfYear";
        }

        public final EBillAdapter$EBillHolder_ViewBinding getBaseUnit() {
            return BillerAdapter$ItemViewHolder.QUARTER_YEARS;
        }

        public final EBillAdapter$EBillHolder_ViewBinding getRangeUnit() {
            return BillerAdapter$ItemViewHolder_ViewBinding.YEARS;
        }

        public final FavouriteTargetAdapter$ItemViewHolder range() {
            return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, 4);
        }

        public final boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) && C6339xe2cdc83a.isIso(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }

        public final FavouriteTargetAdapter$ItemViewHolder rangeRefinedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return range();
        }

        public final long getFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(this)) {
                return (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) + 2) / 3;
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
        }

        public final <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R adjustInto(R r, long j) {
            long from = getFrom(r);
            range().checkValidValue(j, this);
            return r.with(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, r.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) + ((j - from) * 3));
        }
    },
    WEEK_OF_WEEK_BASED_YEAR {
        public final String toString() {
            return "WeekOfWeekBasedYear";
        }

        public final EBillAdapter$EBillHolder_ViewBinding getBaseUnit() {
            return BillerAdapter$ItemViewHolder_ViewBinding.WEEKS;
        }

        public final EBillAdapter$EBillHolder_ViewBinding getRangeUnit() {
            return BillerAdapter$ItemViewHolder.WEEK_BASED_YEARS;
        }

        public final String getDisplayName(Locale locale) {
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
            return "Week";
        }

        public final FavouriteTargetAdapter$ItemViewHolder range() {
            return FavouriteTargetAdapter$ItemViewHolder.m3506of(1, 52, 53);
        }

        public final boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY) && C6339xe2cdc83a.isIso(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }

        public final FavouriteTargetAdapter$ItemViewHolder rangeRefinedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(this)) {
                return C6339xe2cdc83a.getWeekRange(QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding));
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
        }

        public final long getFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(this)) {
                return (long) C6339xe2cdc83a.getWeek(QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding));
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
        }

        public final <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R adjustInto(R r, long j) {
            range().checkValidValue(j, this);
            return r.plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(j, getFrom(r)), BillerAdapter$ItemViewHolder_ViewBinding.WEEKS);
        }

        public final DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding resolve(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
            QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder;
            Map<DenominatorAmountAdapter$PencilViewHolder, Long> map2 = map;
            QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder2 = questionnaireRecyclerViewAdapter$QuestionnaireViewHolder;
            Long l = map2.get(WEEK_BASED_YEAR);
            Long l2 = map2.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
            if (l == null || l2 == null) {
                return null;
            }
            int checkValidIntValue = WEEK_BASED_YEAR.range().checkValidIntValue(l.longValue(), WEEK_BASED_YEAR);
            long longValue = map2.get(WEEK_OF_WEEK_BASED_YEAR).longValue();
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder2 == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                long longValue2 = l2.longValue();
                long j = 0;
                if (longValue2 > 7) {
                    long j2 = longValue2 - 1;
                    j = j2 / 7;
                    longValue2 = (j2 % 7) + 1;
                } else if (longValue2 < 1) {
                    j = (longValue2 / 7) - 1;
                    longValue2 = (longValue2 % 7) + 7;
                }
                quickAccountSelectAdapter$UnselectedHolder = QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue, 1, 4).plusWeeks(longValue - 1).plusWeeks(j).with((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK, longValue2);
            } else {
                int checkValidIntValue2 = TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(l2.longValue());
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder2 == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT) {
                    C6339xe2cdc83a.getWeekRange(QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue, 1, 4)).checkValidValue(longValue, this);
                } else {
                    range().checkValidValue(longValue, this);
                }
                quickAccountSelectAdapter$UnselectedHolder = QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue, 1, 4).plusWeeks(longValue - 1).with((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK, (long) checkValidIntValue2);
            }
            map2.remove(this);
            map2.remove(WEEK_BASED_YEAR);
            map2.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
            return quickAccountSelectAdapter$UnselectedHolder;
        }
    },
    WEEK_BASED_YEAR {
        public final String toString() {
            return "WeekBasedYear";
        }

        public final EBillAdapter$EBillHolder_ViewBinding getBaseUnit() {
            return BillerAdapter$ItemViewHolder.WEEK_BASED_YEARS;
        }

        public final EBillAdapter$EBillHolder_ViewBinding getRangeUnit() {
            return BillerAdapter$ItemViewHolder_ViewBinding.FOREVER;
        }

        public final FavouriteTargetAdapter$ItemViewHolder range() {
            return TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.range();
        }

        public final boolean isSupportedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY) && C6339xe2cdc83a.isIso(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }

        public final FavouriteTargetAdapter$ItemViewHolder rangeRefinedBy(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.range();
        }

        public final long getFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(this)) {
                return (long) C6339xe2cdc83a.getWeekBasedYear(QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding));
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
        }

        public final <R extends DenominatorAmountAdapter$BubbleViewDisableHolder> R adjustInto(R r, long j) {
            if (isSupportedBy(r)) {
                int checkValidIntValue = range().checkValidIntValue(j, WEEK_BASED_YEAR);
                QuickAccountSelectAdapter$UnselectedHolder from = QuickAccountSelectAdapter$UnselectedHolder.from(r);
                int i = from.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK);
                int access$400 = C6339xe2cdc83a.getWeek(from);
                if (access$400 == 53 && C6339xe2cdc83a.getWeekRange(checkValidIntValue) == 52) {
                    access$400 = 52;
                }
                QuickAccountSelectAdapter$UnselectedHolder of = QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue, 1, 4);
                return r.with(of.plusDays((long) ((i - of.get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) + ((access$400 - 1) * 7))));
            }
            throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
        }
    };
    
    /* access modifiers changed from: private */
    public static final int[] QUARTER_DAYS = null;

    public boolean isDateBased() {
        return true;
    }

    public boolean isTimeBased() {
        return false;
    }

    public DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding resolve(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        return null;
    }

    static {
        QUARTER_DAYS = new int[]{0, 90, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, 273, 0, 91, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256, 274};
    }

    public String getDisplayName(Locale locale) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(locale, "locale");
        return toString();
    }

    /* access modifiers changed from: private */
    public static boolean isIso(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return C7022x6c0e8d61.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).equals(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static FavouriteTargetAdapter$ItemViewHolder getWeekRange(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, (long) getWeekRange(getWeekBasedYear(quickAccountSelectAdapter$UnselectedHolder)));
    }

    /* access modifiers changed from: private */
    public static int getWeekRange(int i) {
        QuickAccountSelectAdapter$UnselectedHolder of = QuickAccountSelectAdapter$UnselectedHolder.m3547of(i, 1, 1);
        if (of.getDayOfWeek() != QuickAccountSelectAdapter$FooterHolder_ViewBinding.THURSDAY) {
            return (of.getDayOfWeek() != QuickAccountSelectAdapter$FooterHolder_ViewBinding.WEDNESDAY || !of.isLeapYear()) ? 52 : 53;
        }
        return 53;
    }

    /* access modifiers changed from: private */
    public static int getWeek(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        int ordinal = quickAccountSelectAdapter$UnselectedHolder.getDayOfWeek().ordinal();
        int dayOfYear = quickAccountSelectAdapter$UnselectedHolder.getDayOfYear() - 1;
        int i = (3 - ordinal) + dayOfYear;
        int i2 = (i - ((i / 7) * 7)) - 3;
        if (i2 < -3) {
            i2 += 7;
        }
        if (dayOfYear < i2) {
            return (int) getWeekRange(quickAccountSelectAdapter$UnselectedHolder.withDayOfYear(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256).minusYears(1)).getMaximum();
        }
        int i3 = ((dayOfYear - i2) / 7) + 1;
        if (i3 == 53) {
            if (!(i2 == -3 || (i2 == -2 && quickAccountSelectAdapter$UnselectedHolder.isLeapYear()))) {
                return 1;
            }
        }
        return i3;
    }

    /* access modifiers changed from: private */
    public static int getWeekBasedYear(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        int year = quickAccountSelectAdapter$UnselectedHolder.getYear();
        int dayOfYear = quickAccountSelectAdapter$UnselectedHolder.getDayOfYear();
        if (dayOfYear <= 3) {
            if (dayOfYear - quickAccountSelectAdapter$UnselectedHolder.getDayOfWeek().ordinal() < -2) {
                return year - 1;
            }
            return year;
        } else if (dayOfYear < 363) {
            return year;
        } else {
            return ((dayOfYear - 363) - (quickAccountSelectAdapter$UnselectedHolder.isLeapYear() ? 1 : 0)) - quickAccountSelectAdapter$UnselectedHolder.getDayOfWeek().ordinal() >= 0 ? year + 1 : year;
        }
    }
}
