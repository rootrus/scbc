package p040o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.p041bp.DateTimeException;
import p040o.AppCompatSeekBar;

/* renamed from: o.ScheduleListAdapter$ScheduleListWithHeaderViewHolder */
public final class ScheduleListAdapter$ScheduleListWithHeaderViewHolder extends C7022x6c0e8d61 implements Serializable {
    private static final HashMap<String, String[]> ERA_FULL_NAMES = new HashMap<>();
    private static final HashMap<String, String[]> ERA_NARROW_NAMES = new HashMap<>();
    private static final HashMap<String, String[]> ERA_SHORT_NAMES = new HashMap<>();
    private static final String FALLBACK_LANGUAGE = "en";
    public static final ScheduleListAdapter$ScheduleListWithHeaderViewHolder INSTANCE = new ScheduleListAdapter$ScheduleListWithHeaderViewHolder();
    private static final String TARGET_LANGUAGE = "th";
    static final int YEARS_DIFFERENCE = 543;
    private static final long serialVersionUID = 2775954514031616474L;

    public final String getCalendarType() {
        return "buddhist";
    }

    public final String getId() {
        return "ThaiBuddhist";
    }

    static {
        ERA_NARROW_NAMES.put(FALLBACK_LANGUAGE, new String[]{"BB", "BE"});
        ERA_NARROW_NAMES.put(TARGET_LANGUAGE, new String[]{"BB", "BE"});
        ERA_SHORT_NAMES.put(FALLBACK_LANGUAGE, new String[]{"B.B.", "B.E."});
        ERA_SHORT_NAMES.put(TARGET_LANGUAGE, new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        ERA_FULL_NAMES.put(FALLBACK_LANGUAGE, new String[]{"Before Buddhist", "Budhhist Era"});
        ERA_FULL_NAMES.put(TARGET_LANGUAGE, new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private ScheduleListAdapter$ScheduleListWithHeaderViewHolder() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding date(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i, int i2, int i3) {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.date(remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, i, i2, i3);
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding date(int i, int i2, int i3) {
        return new ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3547of(i - 543, i2, i3));
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding dateYearDay(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i, int i2) {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.dateYearDay(remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, i, i2);
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding dateYearDay(int i, int i2) {
        return new ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.ofYearDay(i - 543, i2));
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding dateEpochDay(long j) {
        return new ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(j));
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding date(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) {
            return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        return new ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding));
    }

    public final DepositAccountsAdapter$DepositAccountHolder_ViewBinding<ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding> localDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return super.localDateTime(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding> zonedDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return super.zonedDateTime(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding> zonedDateTime(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return super.zonedDateTime(quickAccountSelectAdapter$HeaderHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding dateNow() {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.dateNow();
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding dateNow(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.dateNow(languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding dateNow(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.dateNow(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding);
    }

    public final boolean isLeapYear(long j) {
        return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.isLeapYear(j - 543);
    }

    public final int prolepticYear(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i) {
        if (remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding instanceof C6876x5571234) {
            return remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding != C6876x5571234.BE ? 1 - i : i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    public final C6876x5571234 eraOf(int i) {
        return C6876x5571234.m3513of(i);
    }

    public final List<RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding> eras() {
        return Arrays.asList(C6876x5571234.values());
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder) {
        int i = AppCompatSeekBar.IconCompatParcelizer.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
        if (i == 1) {
            FavouriteTargetAdapter$ItemViewHolder range = TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH.range();
            return FavouriteTargetAdapter$ItemViewHolder.m3505of(range.getMinimum() + 6516, range.getMaximum() + 6516);
        } else if (i == 2) {
            FavouriteTargetAdapter$ItemViewHolder range2 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.range();
            return FavouriteTargetAdapter$ItemViewHolder.m3506of(1, 1 - (range2.getMinimum() + 543), range2.getMaximum() + 543);
        } else if (i != 3) {
            return tierPricingInstallmentAdapter$InstallmentViewHolder.range();
        } else {
            FavouriteTargetAdapter$ItemViewHolder range3 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.range();
            return FavouriteTargetAdapter$ItemViewHolder.m3505of(range3.getMinimum() + 543, range3.getMaximum() + 543);
        }
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding resolveDate(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
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
        Long remove2 = map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA);
        if (remove2 != null) {
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA.checkValidValue(remove2.longValue());
            }
            Long remove3 = map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
            if (remove3 == null) {
                Long l = map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR);
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT) {
                    updateResolveMap(map, TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, (l == null || l.longValue() > 0) ? remove2.longValue() : RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(1, remove2.longValue()));
                } else if (l != null) {
                    updateResolveMap(map, TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, l.longValue() > 0 ? remove2.longValue() : RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(1, remove2.longValue()));
                } else {
                    map.put(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA, remove2);
                }
            } else if (remove3.longValue() == 1) {
                updateResolveMap(map, TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, remove2.longValue());
            } else if (remove3.longValue() == 0) {
                updateResolveMap(map, TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(1, remove2.longValue()));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid value for era: ");
                sb.append(remove3);
                throw new DateTimeException(sb.toString());
            }
        } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA)) {
            TierPricingInstallmentAdapter$InstallmentViewHolder.ERA.checkValidValue(map.get(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA).longValue());
        }
        if (!map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR)) {
            return null;
        }
        if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR)) {
            if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH)) {
                int checkValidIntValue = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                    return date(checkValidIntValue, 1, 1).plusMonths(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1)).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).longValue(), 1));
                }
                int checkValidIntValue2 = range(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR);
                int checkValidIntValue3 = range(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).longValue(), TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH);
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART && checkValidIntValue3 > 28) {
                    checkValidIntValue3 = Math.min(checkValidIntValue3, date(checkValidIntValue, checkValidIntValue2, 1).lengthOfMonth());
                }
                return date(checkValidIntValue, checkValidIntValue2, checkValidIntValue3);
            } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH)) {
                if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                    int checkValidIntValue4 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                        return date(checkValidIntValue4, 1, 1).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.MONTHS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                    }
                    int checkValidIntValue5 = TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue());
                    ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding plus = date(checkValidIntValue4, checkValidIntValue5, 1).plus((long) (((TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue()) - 1) * 7) + (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue()) - 1)), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plus.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) == checkValidIntValue5) {
                        return plus;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) {
                    int checkValidIntValue6 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                        return date(checkValidIntValue6, 1, 1).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.MONTHS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                    }
                    int checkValidIntValue7 = TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue());
                    ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding with = date(checkValidIntValue6, checkValidIntValue7, 1).plus((long) (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue()) - 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).with(DenominatorAmountAdapter$BubbleViewHolder.nextOrSame(QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue()))));
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || with.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) == checkValidIntValue7) {
                        return with;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR)) {
            int checkValidIntValue8 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                return dateYearDay(checkValidIntValue8, TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).longValue()));
            }
            return dateYearDay(checkValidIntValue8, 1).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).longValue(), 1));
        } else if (!map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR)) {
            return null;
        } else {
            if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
                int checkValidIntValue9 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                    return date(checkValidIntValue9, 1, 1).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                }
                ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding plusDays = date(checkValidIntValue9, 1, 1).plusDays((long) (((TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue()) - 1) * 7) + (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue()) - 1)));
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plusDays.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR) == checkValidIntValue9) {
                    return plusDays;
                }
                throw new DateTimeException("Strict mode rejected date parsed to a different year");
            } else if (!map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) {
                return null;
            } else {
                int checkValidIntValue10 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                    return date(checkValidIntValue10, 1, 1).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue(), 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.DAYS);
                }
                ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding with2 = date(checkValidIntValue10, 1, 1).plus((long) (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue()) - 1), (EBillAdapter$EBillHolder_ViewBinding) BillerAdapter$ItemViewHolder_ViewBinding.WEEKS).with(DenominatorAmountAdapter$BubbleViewHolder.nextOrSame(QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue()))));
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || with2.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR) == checkValidIntValue10) {
                    return with2;
                }
                throw new DateTimeException("Strict mode rejected date parsed to a different month");
            }
        }
    }
}
