package p040o;

import java.io.Serializable;
import org.threeten.p041bp.DateTimeException;
import p040o.PromptPayMobileListAdapter$PromptPayListView;

/* renamed from: o.ProfileManagementAdapter$ProfileManagementHolder */
abstract class ProfileManagementAdapter$ProfileManagementHolder<D extends PromptPayMobileListAdapter$PromptPayListView> extends PromptPayMobileListAdapter$PromptPayListView implements Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    /* access modifiers changed from: package-private */
    public abstract ProfileManagementAdapter$ProfileManagementHolder<D> plusDays(long j);

    /* access modifiers changed from: package-private */
    public abstract ProfileManagementAdapter$ProfileManagementHolder<D> plusMonths(long j);

    /* access modifiers changed from: package-private */
    public abstract ProfileManagementAdapter$ProfileManagementHolder<D> plusYears(long j);

    ProfileManagementAdapter$ProfileManagementHolder() {
    }

    public ProfileManagementAdapter$ProfileManagementHolder<D> plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return (ProfileManagementAdapter$ProfileManagementHolder) getChronology().ensureChronoLocalDate(eBillAdapter$EBillHolder_ViewBinding.addTo(this, j));
        }
        switch (setBackgroundDrawable$MediaBrowserCompat$ItemReceiver.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 7));
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
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                sb.append(" not valid for chronology ");
                sb.append(getChronology().getId());
                throw new DateTimeException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public ProfileManagementAdapter$ProfileManagementHolder<D> plusWeeks(long j) {
        return plusDays(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 7));
    }

    /* access modifiers changed from: package-private */
    public ProfileManagementAdapter$ProfileManagementHolder<D> minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1) : plusYears(-j);
    }

    /* access modifiers changed from: package-private */
    public ProfileManagementAdapter$ProfileManagementHolder<D> minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j);
    }

    /* access modifiers changed from: package-private */
    public ProfileManagementAdapter$ProfileManagementHolder<D> minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1) : plusWeeks(-j);
    }

    /* access modifiers changed from: package-private */
    public ProfileManagementAdapter$ProfileManagementHolder<D> minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j);
    }

    public DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> atTime(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return DepositAccountsAdapter$DepositAccountHolder.m3499of(this, quickAccountSelectAdapter$SelectedHolder);
    }

    public long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        PromptPayMobileListAdapter$PromptPayListView date = getChronology().date(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
            return QuickAccountSelectAdapter$UnselectedHolder.from(this).until(date, eBillAdapter$EBillHolder_ViewBinding);
        }
        return eBillAdapter$EBillHolder_ViewBinding.between(this, date);
    }

    public PurchaseAccountSourceAdapter$ItemViewHolder until(PromptPayMobileListAdapter$PromptPayListView promptPayMobileListAdapter$PromptPayListView) {
        throw new UnsupportedOperationException("Not supported in ThreeTen backport");
    }
}
