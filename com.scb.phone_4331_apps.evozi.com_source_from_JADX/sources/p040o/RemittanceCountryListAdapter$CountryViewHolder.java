package p040o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.threeten.p041bp.DateTimeException;

/* renamed from: o.RemittanceCountryListAdapter$CountryViewHolder */
public final class RemittanceCountryListAdapter$CountryViewHolder extends C7022x6c0e8d61 implements Serializable {
    public static final RemittanceCountryListAdapter$CountryViewHolder INSTANCE = new RemittanceCountryListAdapter$CountryViewHolder();
    private static final long serialVersionUID = -1440403870442975015L;

    public final String getCalendarType() {
        return "iso8601";
    }

    public final String getId() {
        return "ISO";
    }

    private RemittanceCountryListAdapter$CountryViewHolder() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    public final QuickAccountSelectAdapter$UnselectedHolder date(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i, int i2, int i3) {
        return date(prolepticYear(remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, i), i2, i3);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder date(int i, int i2, int i3) {
        return QuickAccountSelectAdapter$UnselectedHolder.m3547of(i, i2, i3);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder dateYearDay(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i, int i2) {
        return dateYearDay(prolepticYear(remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, i), i2);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder dateYearDay(int i, int i2) {
        return QuickAccountSelectAdapter$UnselectedHolder.ofYearDay(i, i2);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder dateEpochDay(long j) {
        return QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(j);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder date(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding localDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding zonedDateTime(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding zonedDateTime(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.ofInstant(quickAccountSelectAdapter$HeaderHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder dateNow() {
        return dateNow(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public final QuickAccountSelectAdapter$UnselectedHolder dateNow(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return dateNow(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder dateNow(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        return date((DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) QuickAccountSelectAdapter$UnselectedHolder.now(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding));
    }

    public final boolean isLeapYear(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }

    public final int prolepticYear(RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding, int i) {
        if (remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding instanceof C7025x179e53fd) {
            return remittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding != C7025x179e53fd.CE ? 1 - i : i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    public final C7025x179e53fd eraOf(int i) {
        return C7025x179e53fd.m3558of(i);
    }

    public final List<RemittanceCountryListAdapter$CountryExpandViewHolder_ViewBinding> eras() {
        return Arrays.asList(C7025x179e53fd.values());
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder) {
        return tierPricingInstallmentAdapter$InstallmentViewHolder.range();
    }

    public final QuickAccountSelectAdapter$UnselectedHolder resolveDate(Map<DenominatorAmountAdapter$PencilViewHolder, Long> map, QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY)) {
            return QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY).longValue());
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
                int safeToInt = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue());
                int safeToInt2 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH).longValue());
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                    return QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue, 1, 1).plusMonths((long) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(safeToInt, 1)).plusDays((long) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(safeToInt2, 1));
                } else if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART) {
                    return QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue, safeToInt, safeToInt2);
                } else {
                    TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH.checkValidValue((long) safeToInt2);
                    if (safeToInt == 4 || safeToInt == 6 || safeToInt == 9 || safeToInt == 11) {
                        safeToInt2 = Math.min(safeToInt2, 30);
                    } else if (safeToInt == 2) {
                        safeToInt2 = Math.min(safeToInt2, PrepaidTransactionAdapter$ChildViewHolder.FEBRUARY.length(ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.isLeap((long) checkValidIntValue)));
                    }
                    return QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue, safeToInt, safeToInt2);
                }
            } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH)) {
                if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH)) {
                    int checkValidIntValue2 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                        return QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue2, 1, 1).plusMonths(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1)).plusWeeks(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue(), 1)).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue(), 1));
                    }
                    int checkValidIntValue3 = TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue());
                    QuickAccountSelectAdapter$UnselectedHolder plusDays = QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue2, checkValidIntValue3, 1).plusDays((long) (((TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue()) - 1) * 7) + (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH).longValue()) - 1)));
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plusDays.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) == checkValidIntValue3) {
                        return plusDays;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                } else if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) {
                    int checkValidIntValue4 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                        return QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue4, 1, 1).plusMonths(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue(), 1)).plusWeeks(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue(), 1)).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue(), 1));
                    }
                    int checkValidIntValue5 = TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).longValue());
                    QuickAccountSelectAdapter$UnselectedHolder with = QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue4, checkValidIntValue5, 1).plusWeeks((long) (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH).longValue()) - 1)).with(DenominatorAmountAdapter$BubbleViewHolder.nextOrSame(QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue()))));
                    if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || with.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR) == checkValidIntValue5) {
                        return with;
                    }
                    throw new DateTimeException("Strict mode rejected date parsed to a different month");
                }
            }
        }
        if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR)) {
            int checkValidIntValue6 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                return QuickAccountSelectAdapter$UnselectedHolder.ofYearDay(checkValidIntValue6, TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).longValue()));
            }
            return QuickAccountSelectAdapter$UnselectedHolder.ofYearDay(checkValidIntValue6, 1).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR).longValue(), 1));
        } else if (!map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR)) {
            return null;
        } else {
            if (map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR)) {
                int checkValidIntValue7 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                    return QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue7, 1, 1).plusWeeks(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue(), 1)).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue(), 1));
                }
                QuickAccountSelectAdapter$UnselectedHolder plusDays2 = QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue7, 1, 1).plusDays((long) (((TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue()) - 1) * 7) + (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR).longValue()) - 1)));
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || plusDays2.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR) == checkValidIntValue7) {
                    return plusDays2;
                }
                throw new DateTimeException("Strict mode rejected date parsed to a different year");
            } else if (!map.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK)) {
                return null;
            } else {
                int checkValidIntValue8 = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR).longValue());
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                    return QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue8, 1, 1).plusWeeks(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue(), 1)).plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue(), 1));
                }
                QuickAccountSelectAdapter$UnselectedHolder with2 = QuickAccountSelectAdapter$UnselectedHolder.m3547of(checkValidIntValue8, 1, 1).plusWeeks((long) (TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR).longValue()) - 1)).with(DenominatorAmountAdapter$BubbleViewHolder.nextOrSame(QuickAccountSelectAdapter$FooterHolder_ViewBinding.m3542of(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK.checkValidIntValue(map.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK).longValue()))));
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.STRICT || with2.get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR) == checkValidIntValue8) {
                    return with2;
                }
                throw new DateTimeException("Strict mode rejected date parsed to a different month");
            }
        }
    }
}
