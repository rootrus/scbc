package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.p041bp.DateTimeException;

/* renamed from: o.IncomingAdapter$IncomingHolder_ViewBinding */
public final class IncomingAdapter$IncomingHolder_ViewBinding extends RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder_ViewBinding implements Serializable {
    private static final int ADDITIONAL_VALUE = 3;
    static final int ERA_OFFSET = 2;
    public static final IncomingAdapter$IncomingHolder_ViewBinding HEISEI;
    private static final AtomicReference<IncomingAdapter$IncomingHolder_ViewBinding[]> KNOWN_ERAS;
    public static final IncomingAdapter$IncomingHolder_ViewBinding MEIJI = new IncomingAdapter$IncomingHolder_ViewBinding(-1, QuickAccountSelectAdapter$UnselectedHolder.m3547of(1868, 9, 8), "Meiji");
    public static final IncomingAdapter$IncomingHolder_ViewBinding SHOWA = new IncomingAdapter$IncomingHolder_ViewBinding(1, QuickAccountSelectAdapter$UnselectedHolder.m3547of(1926, 12, 25), "Showa");
    public static final IncomingAdapter$IncomingHolder_ViewBinding TAISHO = new IncomingAdapter$IncomingHolder_ViewBinding(0, QuickAccountSelectAdapter$UnselectedHolder.m3547of(1912, 7, 30), "Taisho");
    private static final long serialVersionUID = 1466499369062886794L;
    private final int eraValue;
    private final transient String name;
    private final transient QuickAccountSelectAdapter$UnselectedHolder since;

    private static int ordinal(int i) {
        return i + 1;
    }

    static {
        IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding = new IncomingAdapter$IncomingHolder_ViewBinding(2, QuickAccountSelectAdapter$UnselectedHolder.m3547of(1989, 1, 8), "Heisei");
        HEISEI = incomingAdapter$IncomingHolder_ViewBinding;
        KNOWN_ERAS = new AtomicReference<>(new IncomingAdapter$IncomingHolder_ViewBinding[]{MEIJI, TAISHO, SHOWA, incomingAdapter$IncomingHolder_ViewBinding});
    }

    private IncomingAdapter$IncomingHolder_ViewBinding(int i, QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, String str) {
        this.eraValue = i;
        this.since = quickAccountSelectAdapter$UnselectedHolder;
        this.name = str;
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            return m6241of(this.eraValue);
        } catch (DateTimeException e) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("Invalid era");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        }
    }

    public static IncomingAdapter$IncomingHolder_ViewBinding registerEra(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, String str) {
        IncomingAdapter$IncomingHolder_ViewBinding[] incomingAdapter$IncomingHolder_ViewBindingArr = KNOWN_ERAS.get();
        if (incomingAdapter$IncomingHolder_ViewBindingArr.length <= 4) {
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder, "since");
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "name");
            if (quickAccountSelectAdapter$UnselectedHolder.isAfter(HEISEI.since)) {
                IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding = new IncomingAdapter$IncomingHolder_ViewBinding(3, quickAccountSelectAdapter$UnselectedHolder, str);
                IncomingAdapter$IncomingHolder_ViewBinding[] incomingAdapter$IncomingHolder_ViewBindingArr2 = (IncomingAdapter$IncomingHolder_ViewBinding[]) Arrays.copyOf(incomingAdapter$IncomingHolder_ViewBindingArr, 5);
                incomingAdapter$IncomingHolder_ViewBindingArr2[4] = incomingAdapter$IncomingHolder_ViewBinding;
                if (KNOWN_ERAS.compareAndSet(incomingAdapter$IncomingHolder_ViewBindingArr, incomingAdapter$IncomingHolder_ViewBindingArr2)) {
                    return incomingAdapter$IncomingHolder_ViewBinding;
                }
                throw new DateTimeException("Only one additional Japanese era can be added");
            }
            throw new DateTimeException("Invalid since date for additional Japanese era, must be after Heisei");
        }
        throw new DateTimeException("Only one additional Japanese era can be added");
    }

    /* renamed from: of */
    public static IncomingAdapter$IncomingHolder_ViewBinding m6241of(int i) {
        IncomingAdapter$IncomingHolder_ViewBinding[] incomingAdapter$IncomingHolder_ViewBindingArr = KNOWN_ERAS.get();
        if (i >= MEIJI.eraValue && i <= incomingAdapter$IncomingHolder_ViewBindingArr[incomingAdapter$IncomingHolder_ViewBindingArr.length - 1].eraValue) {
            return incomingAdapter$IncomingHolder_ViewBindingArr[ordinal(i)];
        }
        throw new DateTimeException("japaneseEra is invalid");
    }

    public static IncomingAdapter$IncomingHolder_ViewBinding valueOf(String str) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "japaneseEra");
        for (IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding : KNOWN_ERAS.get()) {
            if (str.equals(incomingAdapter$IncomingHolder_ViewBinding.name)) {
                return incomingAdapter$IncomingHolder_ViewBinding;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Era not found: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public static IncomingAdapter$IncomingHolder_ViewBinding[] values() {
        IncomingAdapter$IncomingHolder_ViewBinding[] incomingAdapter$IncomingHolder_ViewBindingArr = KNOWN_ERAS.get();
        return (IncomingAdapter$IncomingHolder_ViewBinding[]) Arrays.copyOf(incomingAdapter$IncomingHolder_ViewBindingArr, incomingAdapter$IncomingHolder_ViewBindingArr.length);
    }

    static IncomingAdapter$IncomingHolder_ViewBinding from(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        if (!quickAccountSelectAdapter$UnselectedHolder.isBefore(MEIJI.since)) {
            IncomingAdapter$IncomingHolder_ViewBinding[] incomingAdapter$IncomingHolder_ViewBindingArr = KNOWN_ERAS.get();
            for (int length = incomingAdapter$IncomingHolder_ViewBindingArr.length - 1; length >= 0; length--) {
                IncomingAdapter$IncomingHolder_ViewBinding incomingAdapter$IncomingHolder_ViewBinding = incomingAdapter$IncomingHolder_ViewBindingArr[length];
                if (quickAccountSelectAdapter$UnselectedHolder.compareTo((PromptPayMobileListAdapter$PromptPayListView) incomingAdapter$IncomingHolder_ViewBinding.since) >= 0) {
                    return incomingAdapter$IncomingHolder_ViewBinding;
                }
            }
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Date too early: ");
        sb.append(quickAccountSelectAdapter$UnselectedHolder);
        throw new DateTimeException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final QuickAccountSelectAdapter$UnselectedHolder startDate() {
        return this.since;
    }

    /* access modifiers changed from: package-private */
    public final QuickAccountSelectAdapter$UnselectedHolder endDate() {
        int ordinal = ordinal(this.eraValue);
        IncomingAdapter$IncomingHolder_ViewBinding[] values = values();
        if (ordinal >= values.length - 1) {
            return QuickAccountSelectAdapter$UnselectedHolder.MAX;
        }
        return values[ordinal + 1].startDate().minusDays(1);
    }

    public final int getValue() {
        return this.eraValue;
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.ERA) {
            return RemittanceCountryListAdapter$TransferOptionViewHolder.INSTANCE.range(TierPricingInstallmentAdapter$InstallmentViewHolder.ERA);
        }
        return super.range(denominatorAmountAdapter$PencilViewHolder);
    }

    public final String toString() {
        return this.name;
    }

    private Object writeReplace() {
        return new OutgoingAdapter$OutgoingHolder_ViewBinding((byte) 2, this);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(getValue());
    }

    static IncomingAdapter$IncomingHolder_ViewBinding readExternal(DataInput dataInput) throws IOException {
        return m6241of(dataInput.readByte());
    }
}
