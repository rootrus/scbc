package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.jmrtd.lds.CVCAFile;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.OffsetDateTime;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;

/* renamed from: o.PrepaidTransactionAdapter$ParentViewHolder */
public final class PrepaidTransactionAdapter$ParentViewHolder extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder, AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<PrepaidTransactionAdapter$ParentViewHolder>, Serializable {
    public static final EBillAdapter$EBillHolder<PrepaidTransactionAdapter$ParentViewHolder> FROM = new EBillAdapter$EBillHolder<PrepaidTransactionAdapter$ParentViewHolder>() {
        public final PrepaidTransactionAdapter$ParentViewHolder queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return PrepaidTransactionAdapter$ParentViewHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    public static final PrepaidTransactionAdapter$ParentViewHolder MAX = QuickAccountSelectAdapter$SelectedHolder.MAX.atOffset(ManageAccountInboundViewHolder_ViewBinding.MIN);
    public static final PrepaidTransactionAdapter$ParentViewHolder MIN = QuickAccountSelectAdapter$SelectedHolder.MIN.atOffset(ManageAccountInboundViewHolder_ViewBinding.MAX);
    private static final long serialVersionUID = 7264499704384272492L;
    private final ManageAccountInboundViewHolder_ViewBinding offset;
    private final QuickAccountSelectAdapter$SelectedHolder time;

    public static PrepaidTransactionAdapter$ParentViewHolder now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static PrepaidTransactionAdapter$ParentViewHolder now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static PrepaidTransactionAdapter$ParentViewHolder now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant = preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.instant();
        return ofInstant(instant, preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.getZone().getRules().getOffset(instant));
    }

    /* renamed from: of */
    public static PrepaidTransactionAdapter$ParentViewHolder m6248of(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return new PrepaidTransactionAdapter$ParentViewHolder(quickAccountSelectAdapter$SelectedHolder, manageAccountInboundViewHolder_ViewBinding);
    }

    /* renamed from: of */
    public static PrepaidTransactionAdapter$ParentViewHolder m6247of(int i, int i2, int i3, int i4, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return new PrepaidTransactionAdapter$ParentViewHolder(QuickAccountSelectAdapter$SelectedHolder.m3545of(i, i2, i3, i4), manageAccountInboundViewHolder_ViewBinding);
    }

    public static PrepaidTransactionAdapter$ParentViewHolder ofInstant(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$HeaderHolder_ViewBinding, "instant");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        ManageAccountInboundViewHolder_ViewBinding offset2 = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules().getOffset(quickAccountSelectAdapter$HeaderHolder_ViewBinding);
        long epochSecond = ((quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond() % 86400) + ((long) offset2.getTotalSeconds())) % 86400;
        if (epochSecond < 0) {
            epochSecond += 86400;
        }
        return new PrepaidTransactionAdapter$ParentViewHolder(QuickAccountSelectAdapter$SelectedHolder.ofSecondOfDay(epochSecond, quickAccountSelectAdapter$HeaderHolder_ViewBinding.getNano()), offset2);
    }

    public static PrepaidTransactionAdapter$ParentViewHolder from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof PrepaidTransactionAdapter$ParentViewHolder) {
            return (PrepaidTransactionAdapter$ParentViewHolder) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        try {
            return new PrepaidTransactionAdapter$ParentViewHolder(QuickAccountSelectAdapter$SelectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding), ManageAccountInboundViewHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding));
        } catch (DateTimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain OffsetTime from TemporalAccessor: ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            sb.append(", type ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
            throw new DateTimeException(sb.toString());
        }
    }

    public static PrepaidTransactionAdapter$ParentViewHolder parse(CharSequence charSequence) {
        return parse(charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_OFFSET_TIME);
    }

    public static PrepaidTransactionAdapter$ParentViewHolder parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (PrepaidTransactionAdapter$ParentViewHolder) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    private PrepaidTransactionAdapter$ParentViewHolder(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        this.time = (QuickAccountSelectAdapter$SelectedHolder) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$SelectedHolder, "time");
        this.offset = (ManageAccountInboundViewHolder_ViewBinding) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
    }

    private PrepaidTransactionAdapter$ParentViewHolder with(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        if (this.time != quickAccountSelectAdapter$SelectedHolder || !this.offset.equals(manageAccountInboundViewHolder_ViewBinding)) {
            return new PrepaidTransactionAdapter$ParentViewHolder(quickAccountSelectAdapter$SelectedHolder, manageAccountInboundViewHolder_ViewBinding);
        }
        return this;
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder.isTimeBased() || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
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
            return eBillAdapter$EBillHolder_ViewBinding.isTimeBased();
        }
        return eBillAdapter$EBillHolder_ViewBinding != null && eBillAdapter$EBillHolder_ViewBinding.isSupportedBy(this);
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
            return denominatorAmountAdapter$PencilViewHolder.range();
        }
        return this.time.range(denominatorAmountAdapter$PencilViewHolder);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return super.get(denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
            return (long) getOffset().getTotalSeconds();
        }
        return this.time.getLong(denominatorAmountAdapter$PencilViewHolder);
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffset() {
        return this.offset;
    }

    public final PrepaidTransactionAdapter$ParentViewHolder withOffsetSameLocal(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return (manageAccountInboundViewHolder_ViewBinding == null || !manageAccountInboundViewHolder_ViewBinding.equals(this.offset)) ? new PrepaidTransactionAdapter$ParentViewHolder(this.time, manageAccountInboundViewHolder_ViewBinding) : this;
    }

    public final PrepaidTransactionAdapter$ParentViewHolder withOffsetSameInstant(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        if (manageAccountInboundViewHolder_ViewBinding.equals(this.offset)) {
            return this;
        }
        return new PrepaidTransactionAdapter$ParentViewHolder(this.time.plusSeconds((long) (manageAccountInboundViewHolder_ViewBinding.getTotalSeconds() - this.offset.getTotalSeconds())), manageAccountInboundViewHolder_ViewBinding);
    }

    public final int getHour() {
        return this.time.getHour();
    }

    public final int getMinute() {
        return this.time.getMinute();
    }

    public final int getSecond() {
        return this.time.getSecond();
    }

    public final int getNano() {
        return this.time.getNano();
    }

    public final PrepaidTransactionAdapter$ParentViewHolder with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$SelectedHolder) {
            return with((QuickAccountSelectAdapter$SelectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding, this.offset);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof ManageAccountInboundViewHolder_ViewBinding) {
            return with(this.time, (ManageAccountInboundViewHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof PrepaidTransactionAdapter$ParentViewHolder) {
            return (PrepaidTransactionAdapter$ParentViewHolder) accountSourceAdapter$ItemViewHolder_ViewBinding;
        }
        return (PrepaidTransactionAdapter$ParentViewHolder) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (PrepaidTransactionAdapter$ParentViewHolder) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
            return with(this.time, ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).checkValidIntValue(j)));
        }
        return with(this.time.with(denominatorAmountAdapter$PencilViewHolder, j), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder withHour(int i) {
        return with(this.time.withHour(i), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder withMinute(int i) {
        return with(this.time.withMinute(i), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder withSecond(int i) {
        return with(this.time.withSecond(i), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder withNano(int i) {
        return with(this.time.withNano(i), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder truncatedTo(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return with(this.time.truncatedTo(eBillAdapter$EBillHolder_ViewBinding), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (PrepaidTransactionAdapter$ParentViewHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
            return with(this.time.plus(j, eBillAdapter$EBillHolder_ViewBinding), this.offset);
        }
        return (PrepaidTransactionAdapter$ParentViewHolder) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder plusHours(long j) {
        return with(this.time.plusHours(j), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder plusMinutes(long j) {
        return with(this.time.plusMinutes(j), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder plusSeconds(long j) {
        return with(this.time.plusSeconds(j), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder plusNanos(long j) {
        return with(this.time.plusNanos(j), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (PrepaidTransactionAdapter$ParentViewHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder minusHours(long j) {
        return with(this.time.minusHours(j), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder minusMinutes(long j) {
        return with(this.time.minusMinutes(j), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder minusSeconds(long j) {
        return with(this.time.minusSeconds(j), this.offset);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder minusNanos(long j) {
        return with(this.time.minusNanos(j), this.offset);
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.NANOS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone()) {
            return getOffset();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime()) {
            return this.time;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId()) {
            return null;
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY, this.time.toNanoOfDay()).with(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS, (long) getOffset().getTotalSeconds());
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        PrepaidTransactionAdapter$ParentViewHolder from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        long epochNano = from.toEpochNano() - toEpochNano();
        switch (setBackgroundDrawable.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return epochNano;
            case 2:
                return epochNano / 1000;
            case 3:
                return epochNano / 1000000;
            case 4:
                return epochNano / 1000000000;
            case 5:
                return epochNano / 60000000000L;
            case 6:
                return epochNano / 3600000000000L;
            case 7:
                return epochNano / 43200000000000L;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final OffsetDateTime atDate(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        return OffsetDateTime.m3129of(quickAccountSelectAdapter$UnselectedHolder, this.time, this.offset);
    }

    public final QuickAccountSelectAdapter$SelectedHolder toLocalTime() {
        return this.time;
    }

    private long toEpochNano() {
        return this.time.toNanoOfDay() - (((long) this.offset.getTotalSeconds()) * 1000000000);
    }

    public final int compareTo(PrepaidTransactionAdapter$ParentViewHolder prepaidTransactionAdapter$ParentViewHolder) {
        if (this.offset.equals(prepaidTransactionAdapter$ParentViewHolder.offset)) {
            return this.time.compareTo(prepaidTransactionAdapter$ParentViewHolder.time);
        }
        int compareLongs = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(toEpochNano(), prepaidTransactionAdapter$ParentViewHolder.toEpochNano());
        return compareLongs == 0 ? this.time.compareTo(prepaidTransactionAdapter$ParentViewHolder.time) : compareLongs;
    }

    public final boolean isAfter(PrepaidTransactionAdapter$ParentViewHolder prepaidTransactionAdapter$ParentViewHolder) {
        return toEpochNano() > prepaidTransactionAdapter$ParentViewHolder.toEpochNano();
    }

    public final boolean isBefore(PrepaidTransactionAdapter$ParentViewHolder prepaidTransactionAdapter$ParentViewHolder) {
        return toEpochNano() < prepaidTransactionAdapter$ParentViewHolder.toEpochNano();
    }

    public final boolean isEqual(PrepaidTransactionAdapter$ParentViewHolder prepaidTransactionAdapter$ParentViewHolder) {
        return toEpochNano() == prepaidTransactionAdapter$ParentViewHolder.toEpochNano();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepaidTransactionAdapter$ParentViewHolder)) {
            return false;
        }
        PrepaidTransactionAdapter$ParentViewHolder prepaidTransactionAdapter$ParentViewHolder = (PrepaidTransactionAdapter$ParentViewHolder) obj;
        if (!this.time.equals(prepaidTransactionAdapter$ParentViewHolder.time) || !this.offset.equals(prepaidTransactionAdapter$ParentViewHolder.offset)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.time.hashCode() ^ this.offset.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.time.toString());
        sb.append(this.offset.toString());
        return sb.toString();
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding(CVCAFile.CAR_TAG, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        this.time.writeExternal(dataOutput);
        this.offset.writeExternal(dataOutput);
    }

    static PrepaidTransactionAdapter$ParentViewHolder readExternal(DataInput dataInput) throws IOException {
        return m6248of(QuickAccountSelectAdapter$SelectedHolder.readExternal(dataInput), ManageAccountInboundViewHolder_ViewBinding.readExternal(dataInput));
    }
}
