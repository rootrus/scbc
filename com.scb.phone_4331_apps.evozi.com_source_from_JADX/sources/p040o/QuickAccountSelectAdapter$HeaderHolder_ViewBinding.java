package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.OffsetDateTime;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.QuickAccountSelectAdapter$HeaderHolder_ViewBinding */
public final class QuickAccountSelectAdapter$HeaderHolder_ViewBinding extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder, AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<QuickAccountSelectAdapter$HeaderHolder_ViewBinding>, Serializable {
    public static final QuickAccountSelectAdapter$HeaderHolder_ViewBinding EPOCH = new QuickAccountSelectAdapter$HeaderHolder_ViewBinding(0, 0);
    public static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$HeaderHolder_ViewBinding> FROM = new EBillAdapter$EBillHolder<QuickAccountSelectAdapter$HeaderHolder_ViewBinding>() {
        public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    public static final QuickAccountSelectAdapter$HeaderHolder_ViewBinding MAX = ofEpochSecond(MAX_SECOND, 999999999);
    private static final long MAX_SECOND = 31556889864403199L;
    private static final long MILLIS_PER_SEC = 1000;
    public static final QuickAccountSelectAdapter$HeaderHolder_ViewBinding MIN = ofEpochSecond(MIN_SECOND, 0);
    private static final long MIN_SECOND = -31557014167219200L;
    private static final int NANOS_PER_MILLI = 1000000;
    private static final int NANOS_PER_SECOND = 1000000000;
    private static final long serialVersionUID = -665713676816604388L;
    private final int nanos;
    private final long seconds;

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding now() {
        return PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemUTC().instant();
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        return preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.instant();
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding ofEpochSecond(long j) {
        return create(j, 0);
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding ofEpochSecond(long j, long j2) {
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(j, RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j2, 1000000000)), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(j2, 1000000000));
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding ofEpochMilli(long j) {
        return create(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j, (long) MILLIS_PER_SEC), RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(j, 1000) * NANOS_PER_MILLI);
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        try {
            return ofEpochSecond(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getLong(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS), (long) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.get(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND));
        } catch (DateTimeException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain Instant from TemporalAccessor: ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            sb.append(", type ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
            throw new DateTimeException(sb.toString(), e);
        }
    }

    public static QuickAccountSelectAdapter$HeaderHolder_ViewBinding parse(CharSequence charSequence) {
        return (QuickAccountSelectAdapter$HeaderHolder_ViewBinding) GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_INSTANT.parse(charSequence, FROM);
    }

    private static QuickAccountSelectAdapter$HeaderHolder_ViewBinding create(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j >= MIN_SECOND && j <= MAX_SECOND) {
            return new QuickAccountSelectAdapter$HeaderHolder_ViewBinding(j, i);
        }
        throw new DateTimeException("Instant exceeds minimum or maximum instant");
    }

    private QuickAccountSelectAdapter$HeaderHolder_ViewBinding(long j, int i) {
        this.seconds = j;
        this.nanos = i;
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND) {
                return true;
            }
            return false;
        } else if (denominatorAmountAdapter$PencilViewHolder == null || !denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean isSupported(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
            if (eBillAdapter$EBillHolder_ViewBinding.isTimeBased() || eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.DAYS) {
                return true;
            }
            return false;
        } else if (eBillAdapter$EBillHolder_ViewBinding == null || !eBillAdapter$EBillHolder_ViewBinding.isSupportedBy(this)) {
            return false;
        } else {
            return true;
        }
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return super.range(denominatorAmountAdapter$PencilViewHolder);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return range(denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(denominatorAmountAdapter$PencilViewHolder.getFrom(this), denominatorAmountAdapter$PencilViewHolder);
        }
        int i = AlertController$RecycleListView.MediaMetadataCompat.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        if (i == 1) {
            return this.nanos;
        }
        if (i == 2) {
            return this.nanos / 1000;
        }
        if (i == 3) {
            return this.nanos / NANOS_PER_MILLI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unsupported field: ");
        sb.append(denominatorAmountAdapter$PencilViewHolder);
        throw new UnsupportedTemporalTypeException(sb.toString());
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        int i;
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        int i2 = AlertController$RecycleListView.MediaMetadataCompat.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        if (i2 == 1) {
            i = this.nanos;
        } else if (i2 == 2) {
            i = this.nanos / 1000;
        } else if (i2 == 3) {
            i = this.nanos / NANOS_PER_MILLI;
        } else if (i2 == 4) {
            return this.seconds;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
        return (long) i;
    }

    public final long getEpochSecond() {
        return this.seconds;
    }

    public final int getNano() {
        return this.nanos;
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$HeaderHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (QuickAccountSelectAdapter$HeaderHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidValue(j);
        int i = AlertController$RecycleListView.MediaMetadataCompat.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
        if (i == 1) {
            return j != ((long) this.nanos) ? create(this.seconds, (int) j) : this;
        }
        if (i == 2) {
            int i2 = ((int) j) * 1000;
            return i2 != this.nanos ? create(this.seconds, i2) : this;
        } else if (i == 3) {
            int i3 = ((int) j) * NANOS_PER_MILLI;
            return i3 != this.nanos ? create(this.seconds, i3) : this;
        } else if (i == 4) {
            return j != this.seconds ? create(j, this.nanos) : this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported field: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding truncatedTo(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.NANOS) {
            return this;
        }
        QuickAccountSelectAdapter$SelectedHolder_ViewBinding duration = eBillAdapter$EBillHolder_ViewBinding.getDuration();
        if (duration.getSeconds() <= 86400) {
            long nanos2 = duration.toNanos();
            if (86400000000000L % nanos2 == 0) {
                long j = ((this.seconds % 86400) * 1000000000) + ((long) this.nanos);
                return plusNanos((RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j, nanos2) * nanos2) - j);
            }
            throw new DateTimeException("Unit must divide into a standard day without remainder");
        }
        throw new DateTimeException("Unit is too large to be used for truncation");
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$HeaderHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return (QuickAccountSelectAdapter$HeaderHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
        }
        switch (AlertController$RecycleListView.MediaMetadataCompat.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return plus(j / 1000000, (j % 1000000) * MILLIS_PER_SEC);
            case 3:
                return plusMillis(j);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusSeconds(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 60));
            case 6:
                return plusSeconds(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 3600));
            case 7:
                return plusSeconds(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 43200));
            case 8:
                return plusSeconds(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, 86400));
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding plusSeconds(long j) {
        return plus(j, 0);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding plusMillis(long j) {
        return plus(j / MILLIS_PER_SEC, (j % MILLIS_PER_SEC) * 1000000);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding plusNanos(long j) {
        return plus(0, j);
    }

    private QuickAccountSelectAdapter$HeaderHolder_ViewBinding plus(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.seconds, j), j2 / 1000000000), ((long) this.nanos) + (j2 % 1000000000));
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$HeaderHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding minusSeconds(long j) {
        if (j == Long.MIN_VALUE) {
            return plusSeconds(Long.MAX_VALUE).plusSeconds(1);
        }
        return plusSeconds(-j);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding minusMillis(long j) {
        if (j == Long.MIN_VALUE) {
            return plusMillis(Long.MAX_VALUE).plusMillis(1);
        }
        return plusMillis(-j);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding minusNanos(long j) {
        if (j == Long.MIN_VALUE) {
            return plusNanos(Long.MAX_VALUE).plusNanos(1);
        }
        return plusNanos(-j);
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.NANOS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset()) {
            return null;
        }
        return eBillAdapter$EBillHolder.queryFrom(this);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS, this.seconds).with(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND, (long) this.nanos);
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        QuickAccountSelectAdapter$HeaderHolder_ViewBinding from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        switch (AlertController$RecycleListView.MediaMetadataCompat.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return nanosUntil(from);
            case 2:
                return nanosUntil(from) / MILLIS_PER_SEC;
            case 3:
                return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(from.toEpochMilli(), toEpochMilli());
            case 4:
                return secondsUntil(from);
            case 5:
                return secondsUntil(from) / 60;
            case 6:
                return secondsUntil(from) / 3600;
            case 7:
                return secondsUntil(from) / 43200;
            case 8:
                return secondsUntil(from) / 86400;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    private long nanosUntil(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(quickAccountSelectAdapter$HeaderHolder_ViewBinding.seconds, this.seconds), 1000000000), (long) (quickAccountSelectAdapter$HeaderHolder_ViewBinding.nanos - this.nanos));
    }

    private long secondsUntil(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        long safeSubtract = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(quickAccountSelectAdapter$HeaderHolder_ViewBinding.seconds, this.seconds);
        long j = (long) (quickAccountSelectAdapter$HeaderHolder_ViewBinding.nanos - this.nanos);
        int i = (safeSubtract > 0 ? 1 : (safeSubtract == 0 ? 0 : -1));
        if (i <= 0 || j >= 0) {
            return (i >= 0 || j <= 0) ? safeSubtract : safeSubtract + 1;
        }
        return safeSubtract - 1;
    }

    public final OffsetDateTime atOffset(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return OffsetDateTime.ofInstant(this, manageAccountInboundViewHolder_ViewBinding);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding atZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.ofInstant(this, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final long toEpochMilli() {
        long j = this.seconds;
        if (j >= 0) {
            return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j, (long) MILLIS_PER_SEC), (long) (this.nanos / NANOS_PER_MILLI));
        }
        return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeSubtract(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(j + 1, (long) MILLIS_PER_SEC), MILLIS_PER_SEC - ((long) (this.nanos / NANOS_PER_MILLI)));
    }

    public final int compareTo(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        int compareLongs = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(this.seconds, quickAccountSelectAdapter$HeaderHolder_ViewBinding.seconds);
        if (compareLongs != 0) {
            return compareLongs;
        }
        return this.nanos - quickAccountSelectAdapter$HeaderHolder_ViewBinding.nanos;
    }

    public final boolean isAfter(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        return compareTo(quickAccountSelectAdapter$HeaderHolder_ViewBinding) > 0;
    }

    public final boolean isBefore(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding) {
        return compareTo(quickAccountSelectAdapter$HeaderHolder_ViewBinding) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickAccountSelectAdapter$HeaderHolder_ViewBinding)) {
            return false;
        }
        QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding = (QuickAccountSelectAdapter$HeaderHolder_ViewBinding) obj;
        if (this.seconds == quickAccountSelectAdapter$HeaderHolder_ViewBinding.seconds && this.nanos == quickAccountSelectAdapter$HeaderHolder_ViewBinding.nanos) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.seconds;
        return ((int) (j ^ (j >>> 32))) + (this.nanos * 51);
    }

    public final String toString() {
        return GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_INSTANT.format(this);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 2, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeLong(this.seconds);
        dataOutput.writeInt(this.nanos);
    }

    static QuickAccountSelectAdapter$HeaderHolder_ViewBinding readExternal(DataInput dataInput) throws IOException {
        return ofEpochSecond(dataInput.readLong(), (long) dataInput.readInt());
    }
}
