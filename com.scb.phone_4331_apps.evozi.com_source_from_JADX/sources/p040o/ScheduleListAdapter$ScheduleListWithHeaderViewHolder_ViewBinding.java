package p040o;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.threeten.p041bp.DateTimeException;

/* renamed from: o.ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding */
final class ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements Cloneable {
    C7022x6c0e8d61 chrono;
    PromptPayMobileListAdapter$PromptPayListView date;
    PrepaidTransactionAdapter$ParentViewHolder_ViewBinding excessDays;
    final Map<DenominatorAmountAdapter$PencilViewHolder, Long> fieldValues = new HashMap();
    boolean leapSecond;
    QuickAccountSelectAdapter$SelectedHolder time;
    LanguageSettingAdapter$LanguageSettingHolder_ViewBinding zone;

    public ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding() {
    }

    public ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        addFieldValue(denominatorAmountAdapter$PencilViewHolder, j);
    }

    private Long getFieldValue0(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return this.fieldValues.get(denominatorAmountAdapter$PencilViewHolder);
    }

    /* access modifiers changed from: package-private */
    public final ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding addFieldValue(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        Long fieldValue0 = getFieldValue0(denominatorAmountAdapter$PencilViewHolder);
        if (fieldValue0 == null || fieldValue0.longValue() == j) {
            return putFieldValue0(denominatorAmountAdapter$PencilViewHolder, j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Conflict found: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        sb.append(" ");
        sb.append(fieldValue0);
        sb.append(" differs from ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        sb.append(" ");
        sb.append(j);
        sb.append(": ");
        sb.append(this);
        throw new DateTimeException(sb.toString());
    }

    private ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding putFieldValue0(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        this.fieldValues.put(denominatorAmountAdapter$PencilViewHolder, Long.valueOf(j));
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void addObject(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        this.date = promptPayMobileListAdapter$PromptPayListView;
    }

    /* access modifiers changed from: package-private */
    public final void addObject(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        this.time = quickAccountSelectAdapter$SelectedHolder;
    }

    public final ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding resolve(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder, Set<DenominatorAmountAdapter$PencilViewHolder> set) {
        PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView;
        if (set != null) {
            this.fieldValues.keySet().retainAll(set);
        }
        mergeInstantFields();
        mergeDate(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);
        mergeTime(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);
        if (resolveFields(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder)) {
            mergeInstantFields();
            mergeDate(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);
            mergeTime(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);
        }
        resolveTimeInferZeroes(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);
        crossCheck();
        PrepaidTransactionAdapter$ParentViewHolder_ViewBinding prepaidTransactionAdapter$ParentViewHolder_ViewBinding = this.excessDays;
        if (!(prepaidTransactionAdapter$ParentViewHolder_ViewBinding == null || prepaidTransactionAdapter$ParentViewHolder_ViewBinding.isZero() || (promptPayMobileListAdapter$PromptPayListView = this.date) == null || this.time == null)) {
            this.date = promptPayMobileListAdapter$PromptPayListView.plus((DenominatorAmountAdapter$PencilViewHolder_ViewBinding) this.excessDays);
            this.excessDays = PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.ZERO;
        }
        resolveFractional();
        resolveInstant();
        return this;
    }

    private boolean resolveFields(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        int i = 0;
        loop0:
        while (i < 100) {
            for (Map.Entry<DenominatorAmountAdapter$PencilViewHolder, Long> key : this.fieldValues.entrySet()) {
                DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder = (DenominatorAmountAdapter$PencilViewHolder) key.getKey();
                Object resolve = denominatorAmountAdapter$PencilViewHolder.resolve(this.fieldValues, this, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder);
                if (resolve != null) {
                    if (resolve instanceof PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding) {
                        PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding = (PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding) resolve;
                        LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = this.zone;
                        if (languageSettingAdapter$LanguageSettingHolder_ViewBinding == null) {
                            this.zone = purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.getZone();
                        } else if (!languageSettingAdapter$LanguageSettingHolder_ViewBinding.equals(purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.getZone())) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("ChronoZonedDateTime must use the effective parsed zone: ");
                            sb.append(this.zone);
                            throw new DateTimeException(sb.toString());
                        }
                        resolve = purchaseAccountSourceAdapter$ItemViewHolder_ViewBinding.toLocalDateTime();
                    }
                    if (resolve instanceof PromptPayMobileListAdapter$PromptPayListView) {
                        resolveMakeChanges(denominatorAmountAdapter$PencilViewHolder, (PromptPayMobileListAdapter$PromptPayListView) resolve);
                    } else if (resolve instanceof QuickAccountSelectAdapter$SelectedHolder) {
                        resolveMakeChanges(denominatorAmountAdapter$PencilViewHolder, (QuickAccountSelectAdapter$SelectedHolder) resolve);
                    } else if (resolve instanceof DepositAccountsAdapter$DepositAccountHolder_ViewBinding) {
                        DepositAccountsAdapter$DepositAccountHolder_ViewBinding depositAccountsAdapter$DepositAccountHolder_ViewBinding = (DepositAccountsAdapter$DepositAccountHolder_ViewBinding) resolve;
                        resolveMakeChanges(denominatorAmountAdapter$PencilViewHolder, depositAccountsAdapter$DepositAccountHolder_ViewBinding.toLocalDate());
                        resolveMakeChanges(denominatorAmountAdapter$PencilViewHolder, depositAccountsAdapter$DepositAccountHolder_ViewBinding.toLocalTime());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unknown type: ");
                        sb2.append(resolve.getClass().getName());
                        throw new DateTimeException(sb2.toString());
                    }
                } else if (!this.fieldValues.containsKey(denominatorAmountAdapter$PencilViewHolder)) {
                }
                i++;
            }
        }
        if (i == 100) {
            throw new DateTimeException("Badly written field");
        } else if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    private void resolveMakeChanges(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        if (this.chrono.equals(promptPayMobileListAdapter$PromptPayListView.getChronology())) {
            long epochDay = promptPayMobileListAdapter$PromptPayListView.toEpochDay();
            Long put = this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY, Long.valueOf(epochDay));
            if (put != null && put.longValue() != epochDay) {
                StringBuilder sb = new StringBuilder();
                sb.append("Conflict found: ");
                sb.append(QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(put.longValue()));
                sb.append(" differs from ");
                sb.append(QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(epochDay));
                sb.append(" while resolving  ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new DateTimeException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChronoLocalDate must use the effective parsed chronology: ");
        sb2.append(this.chrono);
        throw new DateTimeException(sb2.toString());
    }

    private void resolveMakeChanges(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        long nanoOfDay = quickAccountSelectAdapter$SelectedHolder.toNanoOfDay();
        Long put = this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY, Long.valueOf(nanoOfDay));
        if (put != null && put.longValue() != nanoOfDay) {
            StringBuilder sb = new StringBuilder();
            sb.append("Conflict found: ");
            sb.append(QuickAccountSelectAdapter$SelectedHolder.ofNanoOfDay(put.longValue()));
            sb.append(" differs from ");
            sb.append(quickAccountSelectAdapter$SelectedHolder);
            sb.append(" while resolving  ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new DateTimeException(sb.toString());
        }
    }

    private void mergeDate(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        if (this.chrono instanceof RemittanceCountryListAdapter$CountryViewHolder) {
            checkDate(RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.resolveDate((Map) this.fieldValues, questionnaireRecyclerViewAdapter$QuestionnaireViewHolder));
        } else if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY)) {
            checkDate(QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY).longValue()));
        }
    }

    private void checkDate(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        if (quickAccountSelectAdapter$UnselectedHolder != null) {
            addObject((PromptPayMobileListAdapter$PromptPayListView) quickAccountSelectAdapter$UnselectedHolder);
            for (DenominatorAmountAdapter$PencilViewHolder next : this.fieldValues.keySet()) {
                if ((next instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) && next.isDateBased()) {
                    try {
                        long j = quickAccountSelectAdapter$UnselectedHolder.getLong(next);
                        Long l = this.fieldValues.get(next);
                        if (j != l.longValue()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Conflict found: Field ");
                            sb.append(next);
                            sb.append(" ");
                            sb.append(j);
                            sb.append(" differs from ");
                            sb.append(next);
                            sb.append(" ");
                            sb.append(l);
                            sb.append(" derived from ");
                            sb.append(quickAccountSelectAdapter$UnselectedHolder);
                            throw new DateTimeException(sb.toString());
                        }
                    } catch (DateTimeException unused) {
                        continue;
                    }
                }
            }
        }
    }

    private void mergeTime(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        long j = 0;
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_DAY)) {
            long longValue = this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_DAY).longValue();
            if (!(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT || (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART && longValue == 0))) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_DAY.checkValidValue(longValue);
            }
            TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            addFieldValue(tierPricingInstallmentAdapter$InstallmentViewHolder, longValue);
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_AMPM)) {
            long longValue2 = this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_AMPM).longValue();
            if (!(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT || (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART && longValue2 == 0))) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_AMPM.checkValidValue(longValue2);
            }
            TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder2 = TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j = longValue2;
            }
            addFieldValue(tierPricingInstallmentAdapter$InstallmentViewHolder2, j);
        }
        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
            if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.AMPM_OF_DAY)) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.AMPM_OF_DAY.checkValidValue(this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.AMPM_OF_DAY).longValue());
            }
            if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM)) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM.checkValidValue(this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM).longValue());
            }
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.AMPM_OF_DAY) && this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM)) {
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY, (this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.AMPM_OF_DAY).longValue() * 12) + this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM).longValue());
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY)) {
            long longValue3 = this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY).longValue();
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY.checkValidValue(longValue3);
            }
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY, longValue3 / 1000000000);
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, longValue3 % 1000000000);
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_DAY)) {
            long longValue4 = this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_DAY).longValue();
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_DAY.checkValidValue(longValue4);
            }
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY, longValue4 / 1000000);
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND, longValue4 % 1000000);
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_DAY)) {
            long longValue5 = this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_DAY).longValue();
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_DAY.checkValidValue(longValue5);
            }
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY, longValue5 / 1000);
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND, longValue5 % 1000);
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY)) {
            long longValue6 = this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY).longValue();
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY.checkValidValue(longValue6);
            }
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY, longValue6 / 3600);
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR, (longValue6 / 60) % 60);
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE, longValue6 % 60);
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_DAY)) {
            long longValue7 = this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_DAY).longValue();
            if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_DAY.checkValidValue(longValue7);
            }
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY, longValue7 / 60);
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR, longValue7 % 60);
        }
        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
            if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND)) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND.checkValidValue(this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND).longValue());
            }
            if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND)) {
                TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND.checkValidValue(this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND).longValue());
            }
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND) && this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND)) {
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND, (this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND).longValue() * 1000) + (this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND).longValue() % 1000));
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND) && this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND)) {
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND, this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND).longValue() / 1000);
            this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND);
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND) && this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND)) {
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND, this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND).longValue() / 1000000);
            this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND);
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND)) {
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND).longValue() * 1000);
        } else if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND)) {
            addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND).longValue() * 1000000);
        }
    }

    private void resolveTimeInferZeroes(QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder questionnaireRecyclerViewAdapter$QuestionnaireViewHolder) {
        Long l = this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY);
        Long l2 = this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR);
        Long l3 = this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE);
        Long l4 = this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND);
        if (l != null) {
            if (l2 == null && (l3 != null || l4 != null)) {
                return;
            }
            if (l2 == null || l3 != null || l4 == null) {
                if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder != QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.LENIENT) {
                    if (l != null) {
                        if (questionnaireRecyclerViewAdapter$QuestionnaireViewHolder == QuestionnaireRecyclerViewAdapter$QuestionnaireViewHolder.SMART && l.longValue() == 24 && ((l2 == null || l2.longValue() == 0) && ((l3 == null || l3.longValue() == 0) && (l4 == null || l4.longValue() == 0)))) {
                            l = 0L;
                            this.excessDays = PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.ofDays(1);
                        }
                        int checkValidIntValue = TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY.checkValidIntValue(l.longValue());
                        if (l2 != null) {
                            int checkValidIntValue2 = TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR.checkValidIntValue(l2.longValue());
                            if (l3 != null) {
                                int checkValidIntValue3 = TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE.checkValidIntValue(l3.longValue());
                                if (l4 != null) {
                                    addObject(QuickAccountSelectAdapter$SelectedHolder.m3545of(checkValidIntValue, checkValidIntValue2, checkValidIntValue3, TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND.checkValidIntValue(l4.longValue())));
                                } else {
                                    addObject(QuickAccountSelectAdapter$SelectedHolder.m3544of(checkValidIntValue, checkValidIntValue2, checkValidIntValue3));
                                }
                            } else if (l4 == null) {
                                addObject(QuickAccountSelectAdapter$SelectedHolder.m3543of(checkValidIntValue, checkValidIntValue2));
                            }
                        } else if (l3 == null && l4 == null) {
                            addObject(QuickAccountSelectAdapter$SelectedHolder.m3543of(checkValidIntValue, 0));
                        }
                    }
                } else if (l != null) {
                    long longValue = l.longValue();
                    if (l2 == null) {
                        int safeToInt = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(longValue, 24));
                        addObject(QuickAccountSelectAdapter$SelectedHolder.m3543of(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(longValue, 24), 0));
                        this.excessDays = PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.ofDays(safeToInt);
                    } else if (l3 != null) {
                        if (l4 == null) {
                            l4 = 0L;
                        }
                        long safeAdd = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(longValue, 3600000000000L), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(l2.longValue(), 60000000000L)), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(l3.longValue(), 1000000000)), l4.longValue());
                        addObject(QuickAccountSelectAdapter$SelectedHolder.ofNanoOfDay(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(safeAdd, 86400000000000L)));
                        this.excessDays = PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.ofDays((int) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(safeAdd, 86400000000000L));
                    } else {
                        long safeAdd2 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(longValue, 3600), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(l2.longValue(), 60));
                        addObject(QuickAccountSelectAdapter$SelectedHolder.ofSecondOfDay(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(safeAdd2, 86400)));
                        this.excessDays = PrepaidTransactionAdapter$ParentViewHolder_ViewBinding.ofDays((int) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(safeAdd2, 86400));
                    }
                }
                this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY);
                this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR);
                this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE);
                this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND);
            }
        }
    }

    private void mergeInstantFields() {
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS)) {
            LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = this.zone;
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding != null) {
                mergeInstantFields0(languageSettingAdapter$LanguageSettingHolder_ViewBinding);
                return;
            }
            Long l = this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS);
            if (l != null) {
                mergeInstantFields0(ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(l.intValue()));
            }
        }
    }

    private void mergeInstantFields0(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding zonedDateTime = this.chrono.zonedDateTime(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochSecond(this.fieldValues.remove(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS).longValue()), languageSettingAdapter$LanguageSettingHolder_ViewBinding);
        if (this.date == null) {
            addObject(zonedDateTime.toLocalDate());
        } else {
            resolveMakeChanges((DenominatorAmountAdapter$PencilViewHolder) TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS, zonedDateTime.toLocalDate());
        }
        addFieldValue(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY, (long) zonedDateTime.toLocalTime().toSecondOfDay());
    }

    private void crossCheck() {
        QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder;
        if (this.fieldValues.size() > 0) {
            PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView = this.date;
            if (promptPayMobileListAdapter$PromptPayListView == null || (quickAccountSelectAdapter$SelectedHolder = this.time) == null) {
                PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView2 = this.date;
                if (promptPayMobileListAdapter$PromptPayListView2 != null) {
                    crossCheck(promptPayMobileListAdapter$PromptPayListView2);
                    return;
                }
                QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder2 = this.time;
                if (quickAccountSelectAdapter$SelectedHolder2 != null) {
                    crossCheck(quickAccountSelectAdapter$SelectedHolder2);
                    return;
                }
                return;
            }
            crossCheck(promptPayMobileListAdapter$PromptPayListView.atTime(quickAccountSelectAdapter$SelectedHolder));
        }
    }

    private void crossCheck(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        Iterator<Map.Entry<DenominatorAmountAdapter$PencilViewHolder, Long>> it = this.fieldValues.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder = (DenominatorAmountAdapter$PencilViewHolder) next.getKey();
            long longValue = ((Long) next.getValue()).longValue();
            if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.isSupported(denominatorAmountAdapter$PencilViewHolder)) {
                try {
                    long j = denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(denominatorAmountAdapter$PencilViewHolder);
                    if (j == longValue) {
                        it.remove();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cross check failed: ");
                        sb.append(denominatorAmountAdapter$PencilViewHolder);
                        sb.append(" ");
                        sb.append(j);
                        sb.append(" vs ");
                        sb.append(denominatorAmountAdapter$PencilViewHolder);
                        sb.append(" ");
                        sb.append(longValue);
                        throw new DateTimeException(sb.toString());
                    }
                } catch (RuntimeException unused) {
                    continue;
                }
            }
        }
    }

    private void resolveFractional() {
        if (this.time != null) {
            return;
        }
        if (!this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS) && !this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY) && !this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE)) {
            return;
        }
        if (this.fieldValues.containsKey(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND)) {
            long longValue = this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND).longValue();
            this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND, Long.valueOf(longValue / 1000));
            this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND, Long.valueOf(longValue / 1000000));
            return;
        }
        this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, 0L);
        this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND, 0L);
        this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND, 0L);
    }

    private void resolveInstant() {
        if (this.date != null && this.time != null) {
            Long l = this.fieldValues.get(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS);
            if (l != null) {
                this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS, Long.valueOf(this.date.atTime(this.time).atZone(ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(l.intValue())).getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS)));
            } else if (this.zone != null) {
                this.fieldValues.put(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS, Long.valueOf(this.date.atTime(this.time).atZone(this.zone).getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS)));
            }
        }
    }

    public final <R> R build(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        return eBillAdapter$EBillHolder.queryFrom(this);
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView;
        QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder;
        if (denominatorAmountAdapter$PencilViewHolder == null) {
            return false;
        }
        if (this.fieldValues.containsKey(denominatorAmountAdapter$PencilViewHolder) || (((promptPayMobileListAdapter$PromptPayListView = this.date) != null && promptPayMobileListAdapter$PromptPayListView.isSupported(denominatorAmountAdapter$PencilViewHolder)) || ((quickAccountSelectAdapter$SelectedHolder = this.time) != null && quickAccountSelectAdapter$SelectedHolder.isSupported(denominatorAmountAdapter$PencilViewHolder)))) {
            return true;
        }
        return false;
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder, "field");
        Long fieldValue0 = getFieldValue0(denominatorAmountAdapter$PencilViewHolder);
        if (fieldValue0 != null) {
            return fieldValue0.longValue();
        }
        PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView = this.date;
        if (promptPayMobileListAdapter$PromptPayListView != null && promptPayMobileListAdapter$PromptPayListView.isSupported(denominatorAmountAdapter$PencilViewHolder)) {
            return this.date.getLong(denominatorAmountAdapter$PencilViewHolder);
        }
        QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder = this.time;
        if (quickAccountSelectAdapter$SelectedHolder != null && quickAccountSelectAdapter$SelectedHolder.isSupported(denominatorAmountAdapter$PencilViewHolder)) {
            return this.time.getLong(denominatorAmountAdapter$PencilViewHolder);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Field not found: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new DateTimeException(sb.toString());
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId()) {
            return this.zone;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
            return this.chrono;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView = this.date;
            if (promptPayMobileListAdapter$PromptPayListView != null) {
                return QuickAccountSelectAdapter$UnselectedHolder.from(promptPayMobileListAdapter$PromptPayListView);
            }
            return null;
        } else if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime()) {
            return this.time;
        } else {
            if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset()) {
                return eBillAdapter$EBillHolder.queryFrom(this);
            }
            if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
                return null;
            }
            return eBillAdapter$EBillHolder.queryFrom(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.fieldValues.size() > 0) {
            sb.append("fields=");
            sb.append(this.fieldValues);
        }
        sb.append(", ");
        sb.append(this.chrono);
        sb.append(", ");
        sb.append(this.zone);
        sb.append(", ");
        sb.append(this.date);
        sb.append(", ");
        sb.append(this.time);
        sb.append(']');
        return sb.toString();
    }
}
