package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding */
public final class ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding extends ProfileManagementAdapter$ProfileManagementHolder<ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding> implements Serializable {
    private static final long serialVersionUID = -8722293800195731463L;
    private final QuickAccountSelectAdapter$UnselectedHolder isoDate;

    public final /* bridge */ /* synthetic */ long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return super.until(denominatorAmountAdapter$BubbleViewDisableHolder, eBillAdapter$EBillHolder_ViewBinding);
    }

    public static ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        return new ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.now(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding));
    }

    /* renamed from: of */
    public static ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding m3562of(int i, int i2, int i3) {
        return ScheduleListAdapter$ScheduleListWithHeaderViewHolder.INSTANCE.date(i, i2, i3);
    }

    public static ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        return ScheduleListAdapter$ScheduleListWithHeaderViewHolder.INSTANCE.date(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
    }

    ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder, "date");
        this.isoDate = quickAccountSelectAdapter$UnselectedHolder;
    }

    public final ScheduleListAdapter$ScheduleListWithHeaderViewHolder getChronology() {
        return ScheduleListAdapter$ScheduleListWithHeaderViewHolder.INSTANCE;
    }

    public final C6876x5571234 getEra() {
        return (C6876x5571234) super.getEra();
    }

    public final int lengthOfMonth() {
        return this.isoDate.lengthOfMonth();
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        if (isSupported(denominatorAmountAdapter$PencilViewHolder)) {
            TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
            int i = ButtonBarLayout.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return this.isoDate.range(denominatorAmountAdapter$PencilViewHolder);
            }
            if (i != 4) {
                return getChronology().range(tierPricingInstallmentAdapter$InstallmentViewHolder);
            }
            FavouriteTargetAdapter$ItemViewHolder range = TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR.range();
            return FavouriteTargetAdapter$ItemViewHolder.m3505of(1, getProlepticYear() <= 0 ? (-(range.getMinimum() + 543)) + 1 : 543 + range.getMaximum());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        int i = ButtonBarLayout.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        int i2 = 1;
        if (i == 4) {
            int prolepticYear = getProlepticYear();
            if (prolepticYear <= 0) {
                prolepticYear = 1 - prolepticYear;
            }
            return (long) prolepticYear;
        } else if (i == 5) {
            return getProlepticMonth();
        } else {
            if (i == 6) {
                return (long) getProlepticYear();
            }
            if (i != 7) {
                return this.isoDate.getLong(denominatorAmountAdapter$PencilViewHolder);
            }
            if (getProlepticYear() <= 0) {
                i2 = 0;
            }
            return (long) i2;
        }
    }

    private long getProlepticMonth() {
        return ((((long) getProlepticYear()) * 12) + ((long) this.isoDate.getMonthValue())) - 1;
    }

    private int getProlepticYear() {
        return this.isoDate.getYear() + 543;
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.with(accountSourceAdapter$ItemViewHolder_ViewBinding);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r1 != 7) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding with(p040o.DenominatorAmountAdapter$PencilViewHolder r7, long r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p040o.TierPricingInstallmentAdapter$InstallmentViewHolder
            if (r0 == 0) goto L_0x0094
            r0 = r7
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r0 = (p040o.TierPricingInstallmentAdapter$InstallmentViewHolder) r0
            long r1 = r6.getLong(r0)
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0010
            return r6
        L_0x0010:
            int[] r1 = p040o.ButtonBarLayout.$SwitchMap$org$threeten$bp$temporal$ChronoField
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 7
            r3 = 6
            r4 = 4
            if (r1 == r4) goto L_0x003a
            r5 = 5
            if (r1 == r5) goto L_0x0025
            if (r1 == r3) goto L_0x003a
            if (r1 == r2) goto L_0x003a
            goto L_0x0054
        L_0x0025:
            o.ScheduleListAdapter$ScheduleListWithHeaderViewHolder r7 = r6.getChronology()
            o.FavouriteTargetAdapter$ItemViewHolder r7 = r7.range(r0)
            r7.checkValidValue(r8, r0)
            long r0 = r6.getProlepticMonth()
            long r8 = r8 - r0
            o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding r7 = r6.plusMonths((long) r8)
            return r7
        L_0x003a:
            o.ScheduleListAdapter$ScheduleListWithHeaderViewHolder r1 = r6.getChronology()
            o.FavouriteTargetAdapter$ItemViewHolder r1 = r1.range(r0)
            int r1 = r1.checkValidIntValue(r8, r0)
            int[] r5 = p040o.ButtonBarLayout.$SwitchMap$org$threeten$bp$temporal$ChronoField
            int r0 = r0.ordinal()
            r0 = r5[r0]
            if (r0 == r4) goto L_0x007f
            if (r0 == r3) goto L_0x0072
            if (r0 == r2) goto L_0x005f
        L_0x0054:
            o.QuickAccountSelectAdapter$UnselectedHolder r0 = r6.isoDate
            o.QuickAccountSelectAdapter$UnselectedHolder r7 = r0.with((p040o.DenominatorAmountAdapter$PencilViewHolder) r7, (long) r8)
            o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding r7 = r6.with((p040o.QuickAccountSelectAdapter$UnselectedHolder) r7)
            return r7
        L_0x005f:
            o.QuickAccountSelectAdapter$UnselectedHolder r7 = r6.isoDate
            int r8 = r6.getProlepticYear()
            int r8 = 1 - r8
            int r8 = r8 + -543
            o.QuickAccountSelectAdapter$UnselectedHolder r7 = r7.withYear(r8)
            o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding r7 = r6.with((p040o.QuickAccountSelectAdapter$UnselectedHolder) r7)
            return r7
        L_0x0072:
            o.QuickAccountSelectAdapter$UnselectedHolder r7 = r6.isoDate
            int r1 = r1 + -543
            o.QuickAccountSelectAdapter$UnselectedHolder r7 = r7.withYear(r1)
            o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding r7 = r6.with((p040o.QuickAccountSelectAdapter$UnselectedHolder) r7)
            return r7
        L_0x007f:
            o.QuickAccountSelectAdapter$UnselectedHolder r7 = r6.isoDate
            int r8 = r6.getProlepticYear()
            if (r8 > 0) goto L_0x0089
            int r1 = 1 - r1
        L_0x0089:
            int r1 = r1 + -543
            o.QuickAccountSelectAdapter$UnselectedHolder r7 = r7.withYear(r1)
            o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding r7 = r6.with((p040o.QuickAccountSelectAdapter$UnselectedHolder) r7)
            return r7
        L_0x0094:
            o.DenominatorAmountAdapter$BubbleViewDisableHolder r7 = r7.adjustInto(r6, r8)
            o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding r7 = (p040o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding.with(o.DenominatorAmountAdapter$PencilViewHolder, long):o.ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding");
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.plus(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.plus(j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.minus(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
    }

    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return (ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) super.minus(j, eBillAdapter$EBillHolder_ViewBinding);
    }

    /* access modifiers changed from: package-private */
    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding plusYears(long j) {
        return with(this.isoDate.plusYears(j));
    }

    /* access modifiers changed from: package-private */
    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding plusMonths(long j) {
        return with(this.isoDate.plusMonths(j));
    }

    /* access modifiers changed from: package-private */
    public final ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding plusDays(long j) {
        return with(this.isoDate.plusDays(j));
    }

    private ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding with(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        return quickAccountSelectAdapter$UnselectedHolder.equals(this.isoDate) ? this : new ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder);
    }

    public final DepositAccountsAdapter$DepositAccountHolder_ViewBinding<ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding> atTime(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return super.atTime(quickAccountSelectAdapter$SelectedHolder);
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder until(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        PrepaidTransactionAdapter$ParentViewHolder_ViewBinding until = this.isoDate.until(promptPayMobileListAdapter$PromptPayListView);
        return getChronology().period(until.getYears(), until.getMonths(), until.getDays());
    }

    public final long toEpochDay() {
        return this.isoDate.toEpochDay();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) {
            return this.isoDate.equals(((ScheduleListAdapter$ScheduleListNoHeaderViewHolder_ViewBinding) obj).isoDate);
        }
        return false;
    }

    public final int hashCode() {
        return getChronology().getId().hashCode() ^ this.isoDate.hashCode();
    }

    private Object writeReplace() {
        return new OutgoingAdapter$OutgoingHolder_ViewBinding((byte) 7, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(get(TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR));
        dataOutput.writeByte(get(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR));
        dataOutput.writeByte(get(TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH));
    }

    static PromptPayMobileListAdapter$PromptPayListView readExternal(DataInput dataInput) throws IOException {
        return ScheduleListAdapter$ScheduleListWithHeaderViewHolder.INSTANCE.date(dataInput.readInt(), (int) dataInput.readByte(), (int) dataInput.readByte());
    }
}
