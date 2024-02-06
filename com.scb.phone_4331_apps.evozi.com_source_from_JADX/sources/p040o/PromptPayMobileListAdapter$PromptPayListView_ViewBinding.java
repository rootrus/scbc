package p040o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.PromptPayMobileListAdapter$PromptPayListView_ViewBinding */
final class PromptPayMobileListAdapter$PromptPayListView_ViewBinding extends PurchaseAccountSourceAdapter$ItemViewHolder implements Serializable {
    private static final long serialVersionUID = 275618735781L;
    private final C7022x6c0e8d61 chronology;
    private final int days;
    private final int months;
    private final int years;

    public PromptPayMobileListAdapter$PromptPayListView_ViewBinding(C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, int i, int i2, int i3) {
        this.chronology = registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding;
        this.years = i;
        this.months = i2;
        this.days = i3;
    }

    public final long get(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        int i;
        if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.YEARS) {
            i = this.years;
        } else if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.MONTHS) {
            i = this.months;
        } else if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.DAYS) {
            i = this.days;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported unit: ");
            sb.append(eBillAdapter$EBillHolder_ViewBinding);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return (long) i;
    }

    public final List<EBillAdapter$EBillHolder_ViewBinding> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(new EBillAdapter$EBillHolder_ViewBinding[]{BillerAdapter$ItemViewHolder_ViewBinding.YEARS, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS}));
    }

    public final C7022x6c0e8d61 getChronology() {
        return this.chronology;
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        if (denominatorAmountAdapter$PencilViewHolder_ViewBinding instanceof PromptPayMobileListAdapter$PromptPayListView_ViewBinding) {
            PromptPayMobileListAdapter$PromptPayListView_ViewBinding promptPayMobileListAdapter$PromptPayListView_ViewBinding = (PromptPayMobileListAdapter$PromptPayListView_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding;
            if (promptPayMobileListAdapter$PromptPayListView_ViewBinding.getChronology().equals(getChronology())) {
                return new PromptPayMobileListAdapter$PromptPayListView_ViewBinding(this.chronology, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.years, promptPayMobileListAdapter$PromptPayListView_ViewBinding.years), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.months, promptPayMobileListAdapter$PromptPayListView_ViewBinding.months), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.days, promptPayMobileListAdapter$PromptPayListView_ViewBinding.days));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to add amount: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
        throw new DateTimeException(sb.toString());
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        if (denominatorAmountAdapter$PencilViewHolder_ViewBinding instanceof PromptPayMobileListAdapter$PromptPayListView_ViewBinding) {
            PromptPayMobileListAdapter$PromptPayListView_ViewBinding promptPayMobileListAdapter$PromptPayListView_ViewBinding = (PromptPayMobileListAdapter$PromptPayListView_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding;
            if (promptPayMobileListAdapter$PromptPayListView_ViewBinding.getChronology().equals(getChronology())) {
                return new PromptPayMobileListAdapter$PromptPayListView_ViewBinding(this.chronology, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(this.years, promptPayMobileListAdapter$PromptPayListView_ViewBinding.years), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(this.months, promptPayMobileListAdapter$PromptPayListView_ViewBinding.months), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(this.days, promptPayMobileListAdapter$PromptPayListView_ViewBinding.days));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to subtract amount: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
        throw new DateTimeException(sb.toString());
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder multipliedBy(int i) {
        return new PromptPayMobileListAdapter$PromptPayListView_ViewBinding(this.chronology, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(this.years, i), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(this.months, i), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(this.days, i));
    }

    public final PurchaseAccountSourceAdapter$ItemViewHolder normalized() {
        if (!this.chronology.range(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).isFixed()) {
            return this;
        }
        long maximum = (this.chronology.range(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).getMaximum() - this.chronology.range(TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR).getMinimum()) + 1;
        long j = (((long) this.years) * maximum) + ((long) this.months);
        return new PromptPayMobileListAdapter$PromptPayListView_ViewBinding(this.chronology, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(j / maximum), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(j % maximum), this.days);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder addTo(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder, "temporal");
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) denominatorAmountAdapter$BubbleViewDisableHolder.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology());
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding == null || this.chronology.equals(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding)) {
            int i = this.years;
            if (i != 0) {
                denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.plus((long) i, BillerAdapter$ItemViewHolder_ViewBinding.YEARS);
            }
            int i2 = this.months;
            if (i2 != 0) {
                denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.plus((long) i2, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
            }
            int i3 = this.days;
            return i3 != 0 ? denominatorAmountAdapter$BubbleViewDisableHolder.plus((long) i3, BillerAdapter$ItemViewHolder_ViewBinding.DAYS) : denominatorAmountAdapter$BubbleViewDisableHolder;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid chronology, required: ");
        sb.append(this.chronology.getId());
        sb.append(", but was: ");
        sb.append(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId());
        throw new DateTimeException(sb.toString());
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder subtractFrom(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder, "temporal");
        C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding = (C7022x6c0e8d61) denominatorAmountAdapter$BubbleViewDisableHolder.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology());
        if (registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding == null || this.chronology.equals(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding)) {
            int i = this.years;
            if (i != 0) {
                denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.minus((long) i, BillerAdapter$ItemViewHolder_ViewBinding.YEARS);
            }
            int i2 = this.months;
            if (i2 != 0) {
                denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.minus((long) i2, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
            }
            int i3 = this.days;
            return i3 != 0 ? denominatorAmountAdapter$BubbleViewDisableHolder.minus((long) i3, BillerAdapter$ItemViewHolder_ViewBinding.DAYS) : denominatorAmountAdapter$BubbleViewDisableHolder;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid chronology, required: ");
        sb.append(this.chronology.getId());
        sb.append(", but was: ");
        sb.append(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId());
        throw new DateTimeException(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptPayMobileListAdapter$PromptPayListView_ViewBinding)) {
            return false;
        }
        PromptPayMobileListAdapter$PromptPayListView_ViewBinding promptPayMobileListAdapter$PromptPayListView_ViewBinding = (PromptPayMobileListAdapter$PromptPayListView_ViewBinding) obj;
        if (this.years == promptPayMobileListAdapter$PromptPayListView_ViewBinding.years && this.months == promptPayMobileListAdapter$PromptPayListView_ViewBinding.months && this.days == promptPayMobileListAdapter$PromptPayListView_ViewBinding.days && this.chronology.equals(promptPayMobileListAdapter$PromptPayListView_ViewBinding.chronology)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.chronology.hashCode() + Integer.rotateLeft(this.years, 16) + Integer.rotateLeft(this.months, 8) + this.days;
    }

    public final String toString() {
        if (isZero()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.chronology);
            sb.append(" P0D");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.chronology);
        sb2.append(' ');
        sb2.append('P');
        int i = this.years;
        if (i != 0) {
            sb2.append(i);
            sb2.append('Y');
        }
        int i2 = this.months;
        if (i2 != 0) {
            sb2.append(i2);
            sb2.append('M');
        }
        int i3 = this.days;
        if (i3 != 0) {
            sb2.append(i3);
            sb2.append('D');
        }
        return sb2.toString();
    }
}
