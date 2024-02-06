package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.format.DateTimeParseException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.QuickAccountSelectAdapter$SelectedHolder_ViewBinding */
public final class QuickAccountSelectAdapter$SelectedHolder_ViewBinding implements DenominatorAmountAdapter$PencilViewHolder_ViewBinding, Comparable<QuickAccountSelectAdapter$SelectedHolder_ViewBinding>, Serializable {
    private static final BigInteger BI_NANOS_PER_SECOND = BigInteger.valueOf(1000000000);
    private static final int NANOS_PER_MILLI = 1000000;
    private static final int NANOS_PER_SECOND = 1000000000;
    private static final Pattern PATTERN = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)D)?(T(?:([-+]?[0-9]+)H)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)(?:[.,]([0-9]{0,9}))?S)?)?", 2);
    public static final QuickAccountSelectAdapter$SelectedHolder_ViewBinding ZERO = new QuickAccountSelectAdapter$SelectedHolder_ViewBinding(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;
    private final int nanos;
    private final long seconds;

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding ofDays(long j) {
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 86400), 0);
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding ofHours(long j) {
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 3600), 0);
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding ofMinutes(long j) {
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 60), 0);
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding ofSeconds(long j) {
        return create(j, 0);
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding ofSeconds(long j, long j2) {
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(j, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j2, 1000000000)), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(j2, 1000000000));
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return create(j2, i * NANOS_PER_MILLI);
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i += 1000000000;
            j2--;
        }
        return create(j2, i);
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding m3546of(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return ZERO.plus(j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding from(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(denominatorAmountAdapter$PencilViewHolder_ViewBinding, "amount");
        QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding = ZERO;
        for (EBillAdapter$EBillHolder_ViewBinding next : denominatorAmountAdapter$PencilViewHolder_ViewBinding.getUnits()) {
            quickAccountSelectAdapter$SelectedHolder_ViewBinding = quickAccountSelectAdapter$SelectedHolder_ViewBinding.plus(denominatorAmountAdapter$PencilViewHolder_ViewBinding.get(next), next);
        }
        return quickAccountSelectAdapter$SelectedHolder_ViewBinding;
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding between(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder2) {
        long until = denominatorAmountAdapter$BubbleViewDisableHolder.until(denominatorAmountAdapter$BubbleViewDisableHolder2, BillerAdapter$ItemViewHolder_ViewBinding.SECONDS);
        long j = 0;
        if (denominatorAmountAdapter$BubbleViewDisableHolder.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND) && denominatorAmountAdapter$BubbleViewDisableHolder2.isSupported(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND)) {
            try {
                long j2 = denominatorAmountAdapter$BubbleViewDisableHolder.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND);
                long j3 = denominatorAmountAdapter$BubbleViewDisableHolder2.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND) - j2;
                int i = (until > 0 ? 1 : (until == 0 ? 0 : -1));
                if (i > 0 && j3 < 0) {
                    j = j3 + 1000000000;
                } else if (i >= 0 || j3 <= 0) {
                    if (i == 0 && j3 != 0) {
                        try {
                            until = denominatorAmountAdapter$BubbleViewDisableHolder.until(denominatorAmountAdapter$BubbleViewDisableHolder2.with(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, j2), BillerAdapter$ItemViewHolder_ViewBinding.SECONDS);
                        } catch (ArithmeticException | DateTimeException unused) {
                        }
                    }
                    j = j3;
                } else {
                    j = j3 - 1000000000;
                }
            } catch (ArithmeticException | DateTimeException unused2) {
            }
        }
        return ofSeconds(until, j);
    }

    public static QuickAccountSelectAdapter$SelectedHolder_ViewBinding parse(CharSequence charSequence) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(charSequence, "text");
        Matcher matcher = PATTERN.matcher(charSequence);
        if (matcher.matches() && !"T".equals(matcher.group(3))) {
            int i = 1;
            boolean equals = "-".equals(matcher.group(1));
            String group = matcher.group(2);
            String group2 = matcher.group(4);
            String group3 = matcher.group(5);
            String group4 = matcher.group(6);
            String group5 = matcher.group(7);
            if (!(group == null && group2 == null && group3 == null && group4 == null)) {
                long parseNumber = parseNumber(charSequence, group, 86400, "days");
                long parseNumber2 = parseNumber(charSequence, group2, 3600, "hours");
                long parseNumber3 = parseNumber(charSequence, group3, 60, "minutes");
                long parseNumber4 = parseNumber(charSequence, group4, 1, "seconds");
                if (group4 != null && group4.charAt(0) == '-') {
                    i = -1;
                }
                try {
                    return create(equals, parseNumber, parseNumber2, parseNumber3, parseNumber4, parseFraction(charSequence, group5, i));
                } catch (ArithmeticException e) {
                    throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: overflow", charSequence, 0).initCause(e));
                }
            }
        }
        throw new DateTimeParseException("Text cannot be parsed to a Duration", charSequence, 0);
    }

    private static long parseNumber(CharSequence charSequence, String str, int i, String str2) {
        if (str == null) {
            return 0;
        }
        try {
            if (str.startsWith("+")) {
                str = str.substring(1);
            }
            return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(Long.parseLong(str), i);
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Text cannot be parsed to a Duration: ");
            sb.append(str2);
            throw ((DateTimeParseException) new DateTimeParseException(sb.toString(), charSequence, 0).initCause(e));
        } catch (ArithmeticException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Text cannot be parsed to a Duration: ");
            sb2.append(str2);
            throw ((DateTimeParseException) new DateTimeParseException(sb2.toString(), charSequence, 0).initCause(e2));
        }
    }

    private static int parseFraction(CharSequence charSequence, String str, int i) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("000000000");
            return Integer.parseInt(sb.toString().substring(0, 9)) * i;
        } catch (NumberFormatException e) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e));
        } catch (ArithmeticException e2) {
            throw ((DateTimeParseException) new DateTimeParseException("Text cannot be parsed to a Duration: fraction", charSequence, 0).initCause(e2));
        }
    }

    private static QuickAccountSelectAdapter$SelectedHolder_ViewBinding create(boolean z, long j, long j2, long j3, long j4, int i) {
        long safeAdd = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(j, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(j2, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(j3, j4)));
        if (z) {
            return ofSeconds(safeAdd, (long) i).negated();
        }
        return ofSeconds(safeAdd, (long) i);
    }

    private static QuickAccountSelectAdapter$SelectedHolder_ViewBinding create(long j, int i) {
        if ((((long) i) | j) == 0) {
            return ZERO;
        }
        return new QuickAccountSelectAdapter$SelectedHolder_ViewBinding(j, i);
    }

    private QuickAccountSelectAdapter$SelectedHolder_ViewBinding(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    public final List<EBillAdapter$EBillHolder_ViewBinding> getUnits() {
        return Collections.unmodifiableList(Arrays.asList(new BillerAdapter$ItemViewHolder_ViewBinding[]{BillerAdapter$ItemViewHolder_ViewBinding.SECONDS, BillerAdapter$ItemViewHolder_ViewBinding.NANOS}));
    }

    public final long get(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.SECONDS) {
            return this.seconds;
        }
        if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.NANOS) {
            return (long) this.nanos;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported unit: ");
        sb.append(eBillAdapter$EBillHolder_ViewBinding);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final boolean isZero() {
        return (this.seconds | ((long) this.nanos)) == 0;
    }

    public final boolean isNegative() {
        return this.seconds < 0;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public final int getNano() {
        return this.nanos;
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding withSeconds(long j) {
        return create(j, this.nanos);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding withNanos(int i) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND.checkValidIntValue((long) i);
        return create(this.seconds, i);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding plus(QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
        return plus(quickAccountSelectAdapter$SelectedHolder_ViewBinding.getSeconds(), (long) quickAccountSelectAdapter$SelectedHolder_ViewBinding.getNano());
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(eBillAdapter$EBillHolder_ViewBinding, "unit");
        if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.DAYS) {
            return plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 86400), 0);
        }
        if (eBillAdapter$EBillHolder_ViewBinding.isDurationEstimated()) {
            throw new DateTimeException("Unit must not have an estimated duration");
        } else if (j == 0) {
            return this;
        } else {
            if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
                int i = AlertController$RecycleListView.MediaDescriptionCompat.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()];
                if (i == 1) {
                    return plusNanos(j);
                }
                if (i == 2) {
                    return plusSeconds((j / 1000000000) * 1000).plusNanos((j % 1000000000) * 1000);
                }
                if (i == 3) {
                    return plusMillis(j);
                }
                if (i != 4) {
                    return plusSeconds(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(eBillAdapter$EBillHolder_ViewBinding.getDuration().seconds, j));
                }
                return plusSeconds(j);
            }
            QuickAccountSelectAdapter$SelectedHolder_ViewBinding multipliedBy = eBillAdapter$EBillHolder_ViewBinding.getDuration().multipliedBy(j);
            return plusSeconds(multipliedBy.getSeconds()).plusNanos((long) multipliedBy.getNano());
        }
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding plusDays(long j) {
        return plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 86400), 0);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding plusHours(long j) {
        return plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 3600), 0);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding plusMinutes(long j) {
        return plus(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 60), 0);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding plusSeconds(long j) {
        return plus(j, 0);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding plusMillis(long j) {
        return plus(j / 1000, (j % 1000) * 1000000);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding plusNanos(long j) {
        return plus(0, j);
    }

    private QuickAccountSelectAdapter$SelectedHolder_ViewBinding plus(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.seconds, j), j2 / 1000000000), ((long) this.nanos) + (j2 % 1000000000));
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding minus(QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
        long seconds2 = quickAccountSelectAdapter$SelectedHolder_ViewBinding.getSeconds();
        int nano = quickAccountSelectAdapter$SelectedHolder_ViewBinding.getNano();
        if (seconds2 == Long.MIN_VALUE) {
            return plus(Long.MAX_VALUE, (long) (-nano)).plus(1, 0);
        }
        return plus(-seconds2, (long) (-nano));
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1) : plusHours(-j);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1) : plusMinutes(-j);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1) : plusSeconds(-j);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1) : plusMillis(-j);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1) : plusNanos(-j);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding multipliedBy(long j) {
        if (j == 0) {
            return ZERO;
        }
        if (j == 1) {
            return this;
        }
        return create(toSeconds().multiply(BigDecimal.valueOf(j)));
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding dividedBy(long j) {
        if (j == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else if (j == 1) {
            return this;
        } else {
            return create(toSeconds().divide(BigDecimal.valueOf(j), RoundingMode.DOWN));
        }
    }

    private BigDecimal toSeconds() {
        return BigDecimal.valueOf(this.seconds).add(BigDecimal.valueOf((long) this.nanos, 9));
    }

    private static QuickAccountSelectAdapter$SelectedHolder_ViewBinding create(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(BI_NANOS_PER_SECOND);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(divideAndRemainder[0].longValue(), (long) divideAndRemainder[1].intValue());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Exceeds capacity of Duration: ");
        sb.append(bigIntegerExact);
        throw new ArithmeticException(sb.toString());
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding negated() {
        return multipliedBy(-1);
    }

    public final QuickAccountSelectAdapter$SelectedHolder_ViewBinding abs() {
        return isNegative() ? negated() : this;
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder addTo(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        long j = this.seconds;
        if (j != 0) {
            denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.plus(j, BillerAdapter$ItemViewHolder_ViewBinding.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? denominatorAmountAdapter$BubbleViewDisableHolder.plus((long) i, BillerAdapter$ItemViewHolder_ViewBinding.NANOS) : denominatorAmountAdapter$BubbleViewDisableHolder;
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder subtractFrom(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        long j = this.seconds;
        if (j != 0) {
            denominatorAmountAdapter$BubbleViewDisableHolder = denominatorAmountAdapter$BubbleViewDisableHolder.minus(j, BillerAdapter$ItemViewHolder_ViewBinding.SECONDS);
        }
        int i = this.nanos;
        return i != 0 ? denominatorAmountAdapter$BubbleViewDisableHolder.minus((long) i, BillerAdapter$ItemViewHolder_ViewBinding.NANOS) : denominatorAmountAdapter$BubbleViewDisableHolder;
    }

    public final long toDays() {
        return this.seconds / 86400;
    }

    public final long toHours() {
        return this.seconds / 3600;
    }

    public final long toMinutes() {
        return this.seconds / 60;
    }

    public final long toMillis() {
        return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(this.seconds, 1000), (long) (this.nanos / NANOS_PER_MILLI));
    }

    public final long toNanos() {
        return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(this.seconds, 1000000000), (long) this.nanos);
    }

    public final int compareTo(QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
        int compareLongs = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(this.seconds, quickAccountSelectAdapter$SelectedHolder_ViewBinding.seconds);
        if (compareLongs != 0) {
            return compareLongs;
        }
        return this.nanos - quickAccountSelectAdapter$SelectedHolder_ViewBinding.nanos;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickAccountSelectAdapter$SelectedHolder_ViewBinding)) {
            return false;
        }
        QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding = (QuickAccountSelectAdapter$SelectedHolder_ViewBinding) obj;
        if (this.seconds == quickAccountSelectAdapter$SelectedHolder_ViewBinding.seconds && this.nanos == quickAccountSelectAdapter$SelectedHolder_ViewBinding.nanos) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.seconds;
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.nanos == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (i2 >= 0 || this.nanos <= 0) {
            sb.append(i2);
        } else if (i2 == -1) {
            sb.append("-0");
        } else {
            sb.append(i2 + 1);
        }
        if (this.nanos > 0) {
            int length = sb.length();
            if (i2 < 0) {
                sb.append(2000000000 - this.nanos);
            } else {
                sb.append(this.nanos + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 1, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    static QuickAccountSelectAdapter$SelectedHolder_ViewBinding readExternal(DataInput dataInput) throws IOException {
        return ofSeconds(dataInput.readLong(), (long) dataInput.readInt());
    }
}
