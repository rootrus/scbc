package p040o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.format.DateTimeParseException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.PrepaidTransactionAdapter$ParentViewHolder_ViewBinding */
public final class PrepaidTransactionAdapter$ParentViewHolder_ViewBinding extends PurchaseAccountSourceAdapter$ItemViewHolder implements Serializable {
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    public static final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding ZERO = new PrepaidTransactionAdapter$ParentViewHolder_ViewBinding(0, 0, 0);
    private static final long serialVersionUID = -8290556941213247973L;
    private final int days;
    private final int months;
    private final int years;

    public static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding ofYears(int i) {
        return create(i, 0, 0);
    }

    public static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding ofMonths(int i) {
        return create(0, i, 0);
    }

    public static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding ofWeeks(int i) {
        return create(0, 0, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(i, 7));
    }

    public static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding ofDays(int i) {
        return create(0, 0, i);
    }

    /* renamed from: of */
    public static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding m3540of(int i, int i2, int i3) {
        return create(i, i2, i3);
    }

    public static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding from(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        if (denominatorAmountAdapter$PencilViewHolder_ViewBinding instanceof PrepaidTransactionAdapter$ParentViewHolder_ViewBinding) {
            return (PrepaidTransactionAdapter$ParentViewHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding;
        }
        if (!(denominatorAmountAdapter$PencilViewHolder_ViewBinding instanceof PurchaseAccountSourceAdapter$ItemViewHolder) || RemittanceCountryListAdapter$CountryViewHolder.INSTANCE.equals(((PurchaseAccountSourceAdapter$ItemViewHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding).getChronology())) {
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder_ViewBinding, "amount");
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (EBillAdapter$EBillHolder_ViewBinding next : denominatorAmountAdapter$PencilViewHolder_ViewBinding.getUnits()) {
                long j = denominatorAmountAdapter$PencilViewHolder_ViewBinding.get(next);
                if (next == BillerAdapter$ItemViewHolder_ViewBinding.YEARS) {
                    i = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(j);
                } else if (next == BillerAdapter$ItemViewHolder_ViewBinding.MONTHS) {
                    i2 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(j);
                } else if (next == BillerAdapter$ItemViewHolder_ViewBinding.DAYS) {
                    i3 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(j);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unit must be Years, Months or Days, but was ");
                    sb.append(next);
                    throw new DateTimeException(sb.toString());
                }
            }
            return create(i, i2, i3);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Period requires ISO chronology: ");
        sb2.append(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
        throw new DateTimeException(sb2.toString());
    }

    public static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding between(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder2) {
        return quickAccountSelectAdapter$UnselectedHolder.until((PromptPayMobileListAdapter$PromptPayListView) quickAccountSelectAdapter$UnselectedHolder2);
    }

    public static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding parse(CharSequence charSequence) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(charSequence, "text");
        Matcher matcher = PATTERN.matcher(charSequence);
        if (matcher.matches()) {
            int i = 1;
            if ("-".equals(matcher.group(1))) {
                i = -1;
            }
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            String group4 = matcher.group(5);
            if (!(group == null && group2 == null && group3 == null && group4 == null)) {
                try {
                    return create(parseNumber(charSequence, group, i), parseNumber(charSequence, group2, i), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(parseNumber(charSequence, group4, i), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(parseNumber(charSequence, group3, i), 7)));
                } catch (NumberFormatException e) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0);
    }

    private static int parseNumber(CharSequence charSequence, String str, int i) {
        if (str == null) {
            return 0;
        }
        try {
            return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(Integer.parseInt(str), i);
        } catch (ArithmeticException e) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Period", charSequence, 0).initCause(e));
        }
    }

    private static PrepaidTransactionAdapter$ParentViewHolder_ViewBinding create(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return ZERO;
        }
        return new PrepaidTransactionAdapter$ParentViewHolder_ViewBinding(i, i2, i3);
    }

    private PrepaidTransactionAdapter$ParentViewHolder_ViewBinding(int i, int i2, int i3) {
        this.years = i;
        this.months = i2;
        this.days = i3;
    }

    private Object readResolve() {
        return ((this.years | this.months) | this.days) == 0 ? ZERO : this;
    }

    public final List<EBillAdapter$EBillHolder_ViewBinding> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(new BillerAdapter$ItemViewHolder_ViewBinding[]{BillerAdapter$ItemViewHolder_ViewBinding.YEARS, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS, BillerAdapter$ItemViewHolder_ViewBinding.DAYS}));
    }

    public final C7022x6c0e8d61 getChronology() {
        return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE;
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

    public final boolean isZero() {
        return this == ZERO;
    }

    public final boolean isNegative() {
        return this.years < 0 || this.months < 0 || this.days < 0;
    }

    public final int getYears() {
        return this.years;
    }

    public final int getMonths() {
        return this.months;
    }

    public final int getDays() {
        return this.days;
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding withYears(int i) {
        if (i == this.years) {
            return this;
        }
        return create(i, this.months, this.days);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding withMonths(int i) {
        if (i == this.months) {
            return this;
        }
        return create(this.years, i, this.days);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding withDays(int i) {
        if (i == this.days) {
            return this;
        }
        return create(this.years, this.months, i);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        PrepaidTransactionAdapter$ParentViewHolder_ViewBinding from = from(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.years, from.years), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.months, from.months), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.days, from.days));
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding plusYears(long j) {
        return j == 0 ? this : create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd((long) this.years, j)), this.months, this.days);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding plusMonths(long j) {
        return j == 0 ? this : create(this.years, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd((long) this.months, j)), this.days);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding plusDays(long j) {
        return j == 0 ? this : create(this.years, this.months, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd((long) this.days, j)));
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        PrepaidTransactionAdapter$ParentViewHolder_ViewBinding from = from(denominatorAmountAdapter$PencilViewHolder_ViewBinding);
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(this.years, from.years), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(this.months, from.months), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(this.days, from.days));
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1) : plusYears(-j);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding multipliedBy(int i) {
        return (this == ZERO || i == 1) ? this : create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(this.years, i), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(this.months, i), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(this.days, i));
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding negated() {
        return multipliedBy(-1);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder_ViewBinding normalized() {
        long totalMonths = toTotalMonths();
        long j = totalMonths / 12;
        int i = (int) (totalMonths % 12);
        if (j == ((long) this.years) && i == this.months) {
            return this;
        }
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeToInt(j), i, this.days);
    }

    public final long toTotalMonths() {
        return (((long) this.years) * 12) + ((long) this.months);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder addTo(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder, "temporal");
        int i = this.years;
        if (i == 0) {
            int i2 = this.months;
            if (i2 != 0) {
                denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.plus((long) i2, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
            }
        } else if (this.months != 0) {
            denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.plus(toTotalMonths(), BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
        } else {
            denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.plus((long) i, BillerAdapter$ItemViewHolder_ViewBinding.YEARS);
        }
        int i3 = this.days;
        return i3 != 0 ? denominatorAmountAdapter$BubbleViewDisableHolder.plus((long) i3, BillerAdapter$ItemViewHolder_ViewBinding.DAYS) : denominatorAmountAdapter$BubbleViewDisableHolder;
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder subtractFrom(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$BubbleViewDisableHolder, "temporal");
        int i = this.years;
        if (i == 0) {
            int i2 = this.months;
            if (i2 != 0) {
                denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.minus((long) i2, BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
            }
        } else if (this.months != 0) {
            denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.minus(toTotalMonths(), BillerAdapter$ItemViewHolder_ViewBinding.MONTHS);
        } else {
            denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.minus((long) i, BillerAdapter$ItemViewHolder_ViewBinding.YEARS);
        }
        int i3 = this.days;
        return i3 != 0 ? denominatorAmountAdapter$BubbleViewDisableHolder.minus((long) i3, BillerAdapter$ItemViewHolder_ViewBinding.DAYS) : denominatorAmountAdapter$BubbleViewDisableHolder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepaidTransactionAdapter$ParentViewHolder_ViewBinding)) {
            return false;
        }
        PrepaidTransactionAdapter$ParentViewHolder_ViewBinding prepaidTransactionAdapter$ParentViewHolder_ViewBinding = (PrepaidTransactionAdapter$ParentViewHolder_ViewBinding) obj;
        if (this.years == prepaidTransactionAdapter$ParentViewHolder_ViewBinding.years && this.months == prepaidTransactionAdapter$ParentViewHolder_ViewBinding.months && this.days == prepaidTransactionAdapter$ParentViewHolder_ViewBinding.days) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.years + Integer.rotateLeft(this.months, 8) + Integer.rotateLeft(this.days, 16);
    }

    public final String toString() {
        if (this == ZERO) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.years;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.months;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.days;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
