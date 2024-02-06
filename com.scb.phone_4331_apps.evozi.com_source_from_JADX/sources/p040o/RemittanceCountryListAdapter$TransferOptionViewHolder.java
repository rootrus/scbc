package p040o;

import com.google.android.gms.common.api.Api;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.threeten.p041bp.DateTimeException;
import p040o.AppCompatMultiAutoCompleteTextView;

/* renamed from: o.RemittanceCountryListAdapter$TransferOptionViewHolder */
public final class RemittanceCountryListAdapter$TransferOptionViewHolder extends C7022x6c0e8d61 implements Serializable {
    private static final Map<String, String[]> ERA_FULL_NAMES = new HashMap();
    private static final Map<String, String[]> ERA_NARROW_NAMES = new HashMap();
    private static final Map<String, String[]> ERA_SHORT_NAMES = new HashMap();
    private static final String FALLBACK_LANGUAGE = "en";
    public static final RemittanceCountryListAdapter$TransferOptionViewHolder INSTANCE = new RemittanceCountryListAdapter$TransferOptionViewHolder();
    static final Locale LOCALE = new Locale(TARGET_LANGUAGE, "JP", "JP");
    private static final String TARGET_LANGUAGE = "ja";
    private static final long serialVersionUID = 459996390165777884L;

    public final String getCalendarType() {
        return "japanese";
    }

    public final String getId() {
        return "Japanese";
    }

    static {
        ERA_NARROW_NAMES.put(FALLBACK_LANGUAGE, new String[]{"Unknown", "K", "M", "T", "S", "H"});
        ERA_NARROW_NAMES.put(TARGET_LANGUAGE, new String[]{"Unknown", "K", "M", "T", "S", "H"});
        ERA_SHORT_NAMES.put(FALLBACK_LANGUAGE, new String[]{"Unknown", "K", "M", "T", "S", "H"});
        ERA_SHORT_NAMES.put(TARGET_LANGUAGE, new String[]{"Unknown", "慶", "明", "大", "昭", "平"});
        ERA_FULL_NAMES.put(FALLBACK_LANGUAGE, new String[]{"Unknown", "Keio", "Meiji", "Taisho", "Showa", "Heisei"});
        ERA_FULL_NAMES.put(TARGET_LANGUAGE, new String[]{"Unknown", "慶応", "明治", "大正", "昭和", "平成"});
    }

    private RemittanceCountryListAdapter$TransferOptionViewHolder() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding date(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i, int i2, int i3) {
        if (remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding instanceof IncomingAdapter$IncomingHolder_ViewBinding) {
            return RemittanceCountryListAdapter$CountryViewHolder_ViewBinding.m6254of((IncomingAdapter$IncomingHolder_ViewBinding) remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, i, i2, i3);
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding date(int i, int i2, int i3) {
        return new RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3547of(i, i2, i3));
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding dateYearDay(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i, int i2) {
        if (remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding instanceof IncomingAdapter$IncomingHolder_ViewBinding) {
            return RemittanceCountryListAdapter$CountryViewHolder_ViewBinding.ofYearDay((IncomingAdapter$IncomingHolder_ViewBinding) remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, i, i2);
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding dateYearDay(int i, int i2) {
        QuickAccountSelectAdapter$UnselectedHolder ofYearDay = QuickAccountSelectAdapter$UnselectedHolder.ofYearDay(i, i2);
        return date(i, ofYearDay.getMonthValue(), ofYearDay.getDayOfMonth());
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding dateEpochDay(long j) {
        return new RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(j));
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding date(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) {
            return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        return new RemittanceCountryListAdapter$CountryViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding));
    }

    public final DepositAccountsAdapter$DepositAccountHolder_ViewBinding<RemittanceCountryListAdapter$CountryViewHolder_ViewBinding> localDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return super.localDateTime(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<RemittanceCountryListAdapter$CountryViewHolder_ViewBinding> zonedDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return super.zonedDateTime(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<RemittanceCountryListAdapter$CountryViewHolder_ViewBinding> zonedDateTime(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return super.zonedDateTime(quickAccountSelectAdapter$HeaderHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding dateNow() {
        return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) super.dateNow();
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding dateNow(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) super.dateNow(languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding dateNow(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        return (RemittanceCountryListAdapter$CountryViewHolder_ViewBinding) super.dateNow(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding);
    }

    public final boolean isLeapYear(long j) {
        return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear(j);
    }

    public final int prolepticYear(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i) {
        if (remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding instanceof IncomingAdapter$IncomingHolder_ViewBinding) {
            IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding = (IncomingAdapter$IncomingHolder_ViewBinding) remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding;
            int year = incomingAdapter$IncomingHolder_ViewBinding.startDate().getYear();
            FavouriteTargetAdapter$ItemViewHolder.m3505of(1, (long) ((incomingAdapter$IncomingHolder_ViewBinding.endDate().getYear() - incomingAdapter$IncomingHolder_ViewBinding.startDate().getYear()) + 1)).checkValidValue((long) i, TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA);
            return (year + i) - 1;
        }
        throw new ClassCastException("Era must be JapaneseEra");
    }

    public final IncomingAdapter$IncomingHolder_ViewBinding eraOf(int i) {
        return IncomingAdapter$IncomingHolder_ViewBinding.m6241of(i);
    }

    public final List<RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding> eras() {
        return Arrays.asList(IncomingAdapter$IncomingHolder_ViewBinding.values());
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder) {
        switch (AppCompatMultiAutoCompleteTextView.read.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return tierPricingInstallmentAdapter$InstallmentViewHolder.range();
            default:
                Calendar instance = Calendar.getInstance(LOCALE);
                int i = 0;
                switch (AppCompatMultiAutoCompleteTextView.read.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()]) {
                    case 19:
                        IncomingAdapter$IncomingHolder_ViewBinding[] values = IncomingAdapter$IncomingHolder_ViewBinding.values();
                        return FavouriteTargetAdapter$ItemViewHolder.m3505of((long) values[0].getValue(), (long) values[values.length - 1].getValue());
                    case 20:
                        IncomingAdapter$IncomingHolder_ViewBinding[] values2 = IncomingAdapter$IncomingHolder_ViewBinding.values();
                        return FavouriteTargetAdapter$ItemViewHolder.m3505of((long) RemittanceCountryListAdapter$CountryViewHolder_ViewBinding.MIN_DATE.getYear(), (long) values2[values2.length - 1].endDate().getYear());
                    case 21:
                        IncomingAdapter$IncomingHolder_ViewBinding[] values3 = IncomingAdapter$IncomingHolder_ViewBinding.values();
                        int year = values3[values3.length - 1].endDate().getYear();
                        int year2 = values3[values3.length - 1].startDate().getYear();
                        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        while (i < values3.length) {
                            i2 = Math.min(i2, (values3[i].endDate().getYear() - values3[i].startDate().getYear()) + 1);
                            i++;
                        }
                        return FavouriteTargetAdapter$ItemViewHolder.m3507of(1, 6, (long) i2, (long) ((year - year2) + 1));
                    case 22:
                        return FavouriteTargetAdapter$ItemViewHolder.m3507of((long) (instance.getMinimum(2) + 1), (long) (instance.getGreatestMinimum(2) + 1), (long) (instance.getLeastMaximum(2) + 1), (long) (instance.getMaximum(2) + 1));
                    case 23:
                        IncomingAdapter$IncomingHolder_ViewBinding[] values4 = IncomingAdapter$IncomingHolder_ViewBinding.values();
                        int i3 = 366;
                        while (i < values4.length) {
                            i3 = Math.min(i3, (values4[i].startDate().lengthOfYear() - values4[i].startDate().getDayOfYear()) + 1);
                            i++;
                        }
                        return FavouriteTargetAdapter$ItemViewHolder.m3506of(1, (long) i3, 366);
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unimplementable field: ");
                        sb.append(tierPricingInstallmentAdapter$InstallmentViewHolder);
                        throw new UnsupportedOperationException(sb.toString());
                }
        }
    }

    public final RemittanceCountryListAdapter$CountryViewHolder_ViewBinding resolveDate(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY)) {
            return dateEpochDay(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY).longValue());
        }
        Long remove = map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH);
        if (remove != null) {
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH.checkValidValue(remove.longValue());
            }
            updateResolveMap(map, TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR, (long) (RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(remove.longValue(), 12) + 1));
            updateResolveMap(map, TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(remove.longValue(), 12));
        }
        Long l = map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
        IncomingAdapter$IncomingHolder_ViewBinding eraOf = l != null ? eraOf(range(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA).checkValidIntValue(l.longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.ERA)) : null;
        Long l2 = map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA);
        if (l2 != null) {
            int checkValidIntValue = range(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA).checkValidIntValue(l2.longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA);
            if (eraOf == null && questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT && !map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR)) {
                List<RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding> eras = eras();
                eraOf = (IncomingAdapter$IncomingHolder_ViewBinding) eras.get(eras.size() - 1);
            }
            if (eraOf != null && map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) && map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH)) {
                map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
                map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA);
                return resolveEYMD(map, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, eraOf, checkValidIntValue);
            } else if (eraOf != null && map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR)) {
                map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
                map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA);
                return resolveEYD(map, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, eraOf, checkValidIntValue);
            }
        }
        if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR)) {
            if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR)) {
                if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH)) {
                    int checkValidIntValue2 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                        return date(checkValidIntValue2, 1, 1).plusMonths(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1)).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).longValue(), 1));
                    }
                    int checkValidIntValue3 = range(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR);
                    int checkValidIntValue4 = range(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH);
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART && checkValidIntValue4 > 28) {
                        checkValidIntValue4 = Math.min(checkValidIntValue4, date(checkValidIntValue2, checkValidIntValue3, 1).lengthOfMonth());
                    }
                    return date(checkValidIntValue2, checkValidIntValue3, checkValidIntValue4);
                } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH)) {
                    if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                        int checkValidIntValue5 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                            long safeSubtract = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1);
                            return date(checkValidIntValue5, 1, 1).plus(safeSubtract, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.MONTHS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                        }
                        int checkValidIntValue6 = TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue());
                        RemittanceCountryListAdapter$CountryViewHolder_ViewBinding plus = date(checkValidIntValue5, checkValidIntValue6, 1).plus((long) (((TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue()) - 1) * 7) + (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue()) - 1)), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plus.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) == checkValidIntValue6) {
                            return plus;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) {
                        int checkValidIntValue7 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                            long safeSubtract2 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1);
                            return date(checkValidIntValue7, 1, 1).plus(safeSubtract2, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.MONTHS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                        }
                        int checkValidIntValue8 = TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue());
                        RemittanceCountryListAdapter$CountryViewHolder_ViewBinding with = date(checkValidIntValue7, checkValidIntValue8, 1).plus((long) (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue()) - 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).with(DenominatorAmountAdapter$BubbleViewHolder.nextOrSame(QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue()))));
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || with.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) == checkValidIntValue8) {
                            return with;
                        }
                        throw new DateTimeException("Strict mode rejected date parsed to a different month");
                    }
                }
            }
            if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR)) {
                int checkValidIntValue9 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                    return dateYearDay(checkValidIntValue9, TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).longValue()));
                }
                return dateYearDay(checkValidIntValue9, 1).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).longValue(), 1));
            } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR)) {
                if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
                    int checkValidIntValue10 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                        return date(checkValidIntValue10, 1, 1).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                    }
                    RemittanceCountryListAdapter$CountryViewHolder_ViewBinding plusDays = date(checkValidIntValue10, 1, 1).plusDays((long) (((TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue()) - 1) * 7) + (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue()) - 1)));
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plusDays.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR) == checkValidIntValue10) {
                        return plusDays;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different year");
                } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) {
                    int checkValidIntValue11 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                        return date(checkValidIntValue11, 1, 1).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                    }
                    RemittanceCountryListAdapter$CountryViewHolder_ViewBinding with2 = date(checkValidIntValue11, 1, 1).plus((long) (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue()) - 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).with(DenominatorAmountAdapter$BubbleViewHolder.nextOrSame(QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue()))));
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || with2.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR) == checkValidIntValue11) {
                        return with2;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        return null;
    }

    private RemittanceCountryListAdapter$CountryViewHolder_ViewBinding resolveEYMD(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding, int i) {
        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
            int year = incomingAdapter$IncomingHolder_ViewBinding.startDate().getYear();
            long safeSubtract = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1);
            return date((year + i) - 1, 1, 1).plus(safeSubtract, (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.MONTHS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
        }
        int checkValidIntValue = range(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR);
        int checkValidIntValue2 = range(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH);
        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART) {
            return date((RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding) incomingAdapter$IncomingHolder_ViewBinding, i, checkValidIntValue, checkValidIntValue2);
        }
        if (i > 0) {
            int year2 = (incomingAdapter$IncomingHolder_ViewBinding.startDate().getYear() + i) - 1;
            if (checkValidIntValue2 > 28) {
                checkValidIntValue2 = Math.min(checkValidIntValue2, date(year2, checkValidIntValue, 1).lengthOfMonth());
            }
            RemittanceCountryListAdapter$CountryViewHolder_ViewBinding date = date(year2, checkValidIntValue, checkValidIntValue2);
            if (date.getEra() != incomingAdapter$IncomingHolder_ViewBinding) {
                if (Math.abs(date.getEra().getValue() - incomingAdapter$IncomingHolder_ViewBinding.getValue()) > 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid Era/YearOfEra: ");
                    sb.append(incomingAdapter$IncomingHolder_ViewBinding);
                    sb.append(" ");
                    sb.append(i);
                    throw new DateTimeException(sb.toString());
                } else if (!(date.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA) == 1 || i == 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid Era/YearOfEra: ");
                    sb2.append(incomingAdapter$IncomingHolder_ViewBinding);
                    sb2.append(" ");
                    sb2.append(i);
                    throw new DateTimeException(sb2.toString());
                }
            }
            return date;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid YearOfEra: ");
        sb3.append(i);
        throw new DateTimeException(sb3.toString());
    }

    private RemittanceCountryListAdapter$CountryViewHolder_ViewBinding resolveEYD(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding, int i) {
        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
            return dateYearDay((RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding) incomingAdapter$IncomingHolder_ViewBinding, i, range(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR));
        }
        int year = incomingAdapter$IncomingHolder_ViewBinding.startDate().getYear();
        return dateYearDay((year + i) - 1, 1).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
    }
}
