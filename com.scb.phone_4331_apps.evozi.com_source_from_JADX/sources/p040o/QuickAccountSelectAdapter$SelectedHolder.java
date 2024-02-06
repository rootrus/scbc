package p040o;

import com.airbnb.lottie.utils.Utils;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import p040o.setExpandActivityOverflowButtonContentDescription;

/* renamed from: o.QuickAccountSelectAdapter$SelectedHolder */
public final class QuickAccountSelectAdapter$SelectedHolder extends TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding implements DenominatorAmountAdapter$BubbleViewDisableHolder, AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<QuickAccountSelectAdapter$SelectedHolder>, Serializable {
    public static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$SelectedHolder> FROM = new EBillAdapter$EBillHolder<QuickAccountSelectAdapter$SelectedHolder>() {
        public final QuickAccountSelectAdapter$SelectedHolder queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return QuickAccountSelectAdapter$SelectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    private static final QuickAccountSelectAdapter$SelectedHolder[] HOURS = new QuickAccountSelectAdapter$SelectedHolder[24];
    static final int HOURS_PER_DAY = 24;
    public static final QuickAccountSelectAdapter$SelectedHolder MAX = new QuickAccountSelectAdapter$SelectedHolder(23, 59, 59, ManagePromptpayProxyAdapter$ManagePromptpayViewHolder.MAX_VALUE);
    static final long MICROS_PER_DAY = 86400000000L;
    public static final QuickAccountSelectAdapter$SelectedHolder MIDNIGHT;
    static final long MILLIS_PER_DAY = 86400000;
    public static final QuickAccountSelectAdapter$SelectedHolder MIN;
    static final int MINUTES_PER_DAY = 1440;
    static final int MINUTES_PER_HOUR = 60;
    static final long NANOS_PER_DAY = 86400000000000L;
    static final long NANOS_PER_HOUR = 3600000000000L;
    static final long NANOS_PER_MINUTE = 60000000000L;
    static final long NANOS_PER_SECOND = 1000000000;
    public static final QuickAccountSelectAdapter$SelectedHolder NOON;
    static final int SECONDS_PER_DAY = 86400;
    static final int SECONDS_PER_HOUR = 3600;
    static final int SECONDS_PER_MINUTE = 60;
    private static final long serialVersionUID = 6414437269572265201L;
    private final byte hour;
    private final byte minute;
    private final int nano;
    private final byte second;

    static {
        int i = 0;
        while (true) {
            QuickAccountSelectAdapter$SelectedHolder[] quickAccountSelectAdapter$SelectedHolderArr = HOURS;
            if (i < quickAccountSelectAdapter$SelectedHolderArr.length) {
                quickAccountSelectAdapter$SelectedHolderArr[i] = new QuickAccountSelectAdapter$SelectedHolder(i, 0, 0, 0);
                i++;
            } else {
                MIDNIGHT = quickAccountSelectAdapter$SelectedHolderArr[0];
                NOON = quickAccountSelectAdapter$SelectedHolderArr[12];
                MIN = quickAccountSelectAdapter$SelectedHolderArr[0];
                return;
            }
        }
    }

    public static QuickAccountSelectAdapter$SelectedHolder now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static QuickAccountSelectAdapter$SelectedHolder now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static QuickAccountSelectAdapter$SelectedHolder now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant = preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.instant();
        long epochSecond = ((instant.getEpochSecond() % 86400) + ((long) preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.getZone().getRules().getOffset(instant).getTotalSeconds())) % 86400;
        if (epochSecond < 0) {
            epochSecond += 86400;
        }
        return ofSecondOfDay(epochSecond, instant.getNano());
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$SelectedHolder m3543of(int i, int i2) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY.checkValidValue((long) i);
        if (i2 == 0) {
            return HOURS[i];
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR.checkValidValue((long) i2);
        return new QuickAccountSelectAdapter$SelectedHolder(i, i2, 0, 0);
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$SelectedHolder m3544of(int i, int i2, int i3) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY.checkValidValue((long) i);
        if ((i2 | i3) == 0) {
            return HOURS[i];
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR.checkValidValue((long) i2);
        TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE.checkValidValue((long) i3);
        return new QuickAccountSelectAdapter$SelectedHolder(i, i2, i3, 0);
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$SelectedHolder m3545of(int i, int i2, int i3, int i4) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY.checkValidValue((long) i);
        TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR.checkValidValue((long) i2);
        TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE.checkValidValue((long) i3);
        TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND.checkValidValue((long) i4);
        return create(i, i2, i3, i4);
    }

    public static QuickAccountSelectAdapter$SelectedHolder ofSecondOfDay(long j) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY.checkValidValue(j);
        int i = (int) (j / 3600);
        long j2 = j - ((long) (i * SECONDS_PER_HOUR));
        int i2 = (int) (j2 / 60);
        return create(i, i2, (int) (j2 - ((long) (i2 * 60))), 0);
    }

    static QuickAccountSelectAdapter$SelectedHolder ofSecondOfDay(long j, int i) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY.checkValidValue(j);
        TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND.checkValidValue((long) i);
        int i2 = (int) (j / 3600);
        long j2 = j - ((long) (i2 * SECONDS_PER_HOUR));
        int i3 = (int) (j2 / 60);
        return create(i2, i3, (int) (j2 - ((long) (i3 * 60))), i);
    }

    public static QuickAccountSelectAdapter$SelectedHolder ofNanoOfDay(long j) {
        TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY.checkValidValue(j);
        int i = (int) (j / NANOS_PER_HOUR);
        long j2 = j - (((long) i) * NANOS_PER_HOUR);
        int i2 = (int) (j2 / NANOS_PER_MINUTE);
        long j3 = j2 - (((long) i2) * NANOS_PER_MINUTE);
        int i3 = (int) (j3 / NANOS_PER_SECOND);
        return create(i, i2, i3, (int) (j3 - (((long) i3) * NANOS_PER_SECOND)));
    }

    public static QuickAccountSelectAdapter$SelectedHolder from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder = (QuickAccountSelectAdapter$SelectedHolder) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime());
        if (quickAccountSelectAdapter$SelectedHolder != null) {
            return quickAccountSelectAdapter$SelectedHolder;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to obtain LocalTime from TemporalAccessor: ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        sb.append(", type ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
        throw new DateTimeException(sb.toString());
    }

    public static QuickAccountSelectAdapter$SelectedHolder parse(CharSequence charSequence) {
        return parse(charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_LOCAL_TIME);
    }

    public static QuickAccountSelectAdapter$SelectedHolder parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (QuickAccountSelectAdapter$SelectedHolder) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    private static QuickAccountSelectAdapter$SelectedHolder create(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return HOURS[i];
        }
        return new QuickAccountSelectAdapter$SelectedHolder(i, i2, i3, i4);
    }

    private QuickAccountSelectAdapter$SelectedHolder(int i, int i2, int i3, int i4) {
        this.hour = (byte) i;
        this.minute = (byte) i2;
        this.second = (byte) i3;
        this.nano = i4;
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            return denominatorAmountAdapter$PencilViewHolder.isTimeBased();
        }
        return denominatorAmountAdapter$PencilViewHolder != null && denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this);
    }

    public final boolean isSupported(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
            return eBillAdapter$EBillHolder_ViewBinding.isTimeBased();
        }
        return eBillAdapter$EBillHolder_ViewBinding != null && eBillAdapter$EBillHolder_ViewBinding.isSupportedBy(this);
    }

    public final FavouriteTargetAdapter$ItemViewHolder range(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return super.range(denominatorAmountAdapter$PencilViewHolder);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            return get0(denominatorAmountAdapter$PencilViewHolder);
        }
        return super.get(denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY) {
            return toNanoOfDay();
        }
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_DAY) {
            return toNanoOfDay() / 1000;
        }
        return (long) get0(denominatorAmountAdapter$PencilViewHolder);
    }

    private int get0(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        switch (setExpandActivityOverflowButtonContentDescription.C14854.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()]) {
            case 1:
                return this.nano;
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append("Field too large for an int: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new DateTimeException(sb.toString());
            case 3:
                return this.nano / 1000;
            case 4:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Field too large for an int: ");
                sb2.append(denominatorAmountAdapter$PencilViewHolder);
                throw new DateTimeException(sb2.toString());
            case 5:
                return this.nano / 1000000;
            case 6:
                return (int) (toNanoOfDay() / 1000000);
            case 7:
                return this.second;
            case 8:
                return toSecondOfDay();
            case 9:
                return this.minute;
            case 10:
                return (this.hour * 60) + this.minute;
            case 11:
                return this.hour % 12;
            case 12:
                int i = this.hour % 12;
                if (i % 12 != 0) {
                    return i;
                }
                return 12;
            case 13:
                return this.hour;
            case 14:
                byte b = this.hour;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.hour / 12;
            default:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unsupported field: ");
                sb3.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb3.toString());
        }
    }

    public final int getHour() {
        return this.hour;
    }

    public final int getMinute() {
        return this.minute;
    }

    public final int getSecond() {
        return this.second;
    }

    public final int getNano() {
        return this.nano;
    }

    public final QuickAccountSelectAdapter$SelectedHolder with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$SelectedHolder) {
            return (QuickAccountSelectAdapter$SelectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding;
        }
        return (QuickAccountSelectAdapter$SelectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public final QuickAccountSelectAdapter$SelectedHolder with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (QuickAccountSelectAdapter$SelectedHolder) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidValue(j);
        switch (setExpandActivityOverflowButtonContentDescription.C14854.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()]) {
            case 1:
                return withNano((int) j);
            case 2:
                return ofNanoOfDay(j);
            case 3:
                return withNano(((int) j) * 1000);
            case 4:
                return ofNanoOfDay(j * 1000);
            case 5:
                return withNano(((int) j) * 1000000);
            case 6:
                return ofNanoOfDay(j * 1000000);
            case 7:
                return withSecond((int) j);
            case 8:
                return plusSeconds(j - ((long) toSecondOfDay()));
            case 9:
                return withMinute((int) j);
            case 10:
                return plusMinutes(j - ((long) ((this.hour * 60) + this.minute)));
            case 11:
                return plusHours(j - ((long) (this.hour % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return plusHours(j - ((long) (this.hour % 12)));
            case 13:
                return withHour((int) j);
            case 14:
                if (j == 24) {
                    j = 0;
                }
                return withHour((int) j);
            case 15:
                return plusHours((j - ((long) (this.hour / 12))) * 12);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$SelectedHolder withHour(int i) {
        if (this.hour == i) {
            return this;
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY.checkValidValue((long) i);
        return create(i, this.minute, this.second, this.nano);
    }

    public final QuickAccountSelectAdapter$SelectedHolder withMinute(int i) {
        if (this.minute == i) {
            return this;
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR.checkValidValue((long) i);
        return create(this.hour, i, this.second, this.nano);
    }

    public final QuickAccountSelectAdapter$SelectedHolder withSecond(int i) {
        if (this.second == i) {
            return this;
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE.checkValidValue((long) i);
        return create(this.hour, this.minute, i, this.nano);
    }

    public final QuickAccountSelectAdapter$SelectedHolder withNano(int i) {
        if (this.nano == i) {
            return this;
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND.checkValidValue((long) i);
        return create(this.hour, this.minute, this.second, i);
    }

    public final QuickAccountSelectAdapter$SelectedHolder truncatedTo(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding == BillerAdapter$ItemViewHolder_ViewBinding.NANOS) {
            return this;
        }
        QuickAccountSelectAdapter$SelectedHolder_ViewBinding duration = eBillAdapter$EBillHolder_ViewBinding.getDuration();
        if (duration.getSeconds() <= 86400) {
            long nanos = duration.toNanos();
            if (NANOS_PER_DAY % nanos == 0) {
                return ofNanoOfDay((toNanoOfDay() / nanos) * nanos);
            }
            throw new DateTimeException("Unit must divide into a standard day without remainder");
        }
        throw new DateTimeException("Unit is too large to be used for truncation");
    }

    public final QuickAccountSelectAdapter$SelectedHolder plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$SelectedHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final QuickAccountSelectAdapter$SelectedHolder plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return (QuickAccountSelectAdapter$SelectedHolder) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
        }
        switch (setExpandActivityOverflowButtonContentDescription.C14854.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return plusNanos((j % MICROS_PER_DAY) * 1000);
            case 3:
                return plusNanos((j % MILLIS_PER_DAY) * 1000000);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusMinutes(j);
            case 6:
                return plusHours(j);
            case 7:
                return plusHours((j % 2) * 12);
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$SelectedHolder plusHours(long j) {
        if (j == 0) {
            return this;
        }
        return create(((((int) (j % 24)) + this.hour) + 24) % 24, this.minute, this.second, this.nano);
    }

    public final QuickAccountSelectAdapter$SelectedHolder plusMinutes(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 60) + this.minute;
        int i2 = ((((int) (j % 1440)) + i) + MINUTES_PER_DAY) % MINUTES_PER_DAY;
        if (i == i2) {
            return this;
        }
        return create(i2 / 60, i2 % 60, this.second, this.nano);
    }

    public final QuickAccountSelectAdapter$SelectedHolder plusSeconds(long j) {
        if (j == 0) {
            return this;
        }
        int i = (this.hour * 3600) + (this.minute * 60) + this.second;
        int i2 = ((((int) (j % 86400)) + i) + SECONDS_PER_DAY) % SECONDS_PER_DAY;
        if (i == i2) {
            return this;
        }
        return create(i2 / SECONDS_PER_HOUR, (i2 / 60) % 60, i2 % 60, this.nano);
    }

    public final QuickAccountSelectAdapter$SelectedHolder plusNanos(long j) {
        if (j == 0) {
            return this;
        }
        long nanoOfDay = toNanoOfDay();
        long j2 = (((j % NANOS_PER_DAY) + nanoOfDay) + NANOS_PER_DAY) % NANOS_PER_DAY;
        if (nanoOfDay == j2) {
            return this;
        }
        return create((int) (j2 / NANOS_PER_HOUR), (int) ((j2 / NANOS_PER_MINUTE) % 60), (int) ((j2 / NANOS_PER_SECOND) % 60), (int) (j2 % NANOS_PER_SECOND));
    }

    public final QuickAccountSelectAdapter$SelectedHolder minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$SelectedHolder) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final QuickAccountSelectAdapter$SelectedHolder minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final QuickAccountSelectAdapter$SelectedHolder minusHours(long j) {
        return plusHours(-(j % 24));
    }

    public final QuickAccountSelectAdapter$SelectedHolder minusMinutes(long j) {
        return plusMinutes(-(j % 1440));
    }

    public final QuickAccountSelectAdapter$SelectedHolder minusSeconds(long j) {
        return plusSeconds(-(j % 86400));
    }

    public final QuickAccountSelectAdapter$SelectedHolder minusNanos(long j) {
        return plusNanos(-(j % NANOS_PER_DAY));
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.NANOS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime()) {
            return this;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            return null;
        }
        return eBillAdapter$EBillHolder.queryFrom(this);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY, toNanoOfDay());
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        QuickAccountSelectAdapter$SelectedHolder from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        long nanoOfDay = from.toNanoOfDay() - toNanoOfDay();
        switch (setExpandActivityOverflowButtonContentDescription.C14854.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return nanoOfDay;
            case 2:
                return nanoOfDay / 1000;
            case 3:
                return nanoOfDay / 1000000;
            case 4:
                return nanoOfDay / NANOS_PER_SECOND;
            case 5:
                return nanoOfDay / NANOS_PER_MINUTE;
            case 6:
                return nanoOfDay / NANOS_PER_HOUR;
            case 7:
                return nanoOfDay / 43200000000000L;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported unit: ");
                sb.append(eBillAdapter$EBillHolder_ViewBinding);
                throw new UnsupportedTemporalTypeException(sb.toString());
        }
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding atDate(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder) {
        return QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of(quickAccountSelectAdapter$UnselectedHolder, this);
    }

    public final PrepaidTransactionAdapter$ParentViewHolder atOffset(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return PrepaidTransactionAdapter$ParentViewHolder.m6248of(this, manageAccountInboundViewHolder_ViewBinding);
    }

    public final int toSecondOfDay() {
        return (this.hour * 3600) + (this.minute * 60) + this.second;
    }

    public final long toNanoOfDay() {
        return (((long) this.hour) * NANOS_PER_HOUR) + (((long) this.minute) * NANOS_PER_MINUTE) + (((long) this.second) * NANOS_PER_SECOND) + ((long) this.nano);
    }

    public final int compareTo(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        int compareInts = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareInts(this.hour, quickAccountSelectAdapter$SelectedHolder.hour);
        if (compareInts != 0) {
            return compareInts;
        }
        int compareInts2 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareInts(this.minute, quickAccountSelectAdapter$SelectedHolder.minute);
        if (compareInts2 != 0) {
            return compareInts2;
        }
        int compareInts3 = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareInts(this.second, quickAccountSelectAdapter$SelectedHolder.second);
        return compareInts3 == 0 ? RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareInts(this.nano, quickAccountSelectAdapter$SelectedHolder.nano) : compareInts3;
    }

    public final boolean isAfter(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return compareTo(quickAccountSelectAdapter$SelectedHolder) > 0;
    }

    public final boolean isBefore(QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        return compareTo(quickAccountSelectAdapter$SelectedHolder) < 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickAccountSelectAdapter$SelectedHolder)) {
            return false;
        }
        QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder = (QuickAccountSelectAdapter$SelectedHolder) obj;
        if (this.hour == quickAccountSelectAdapter$SelectedHolder.hour && this.minute == quickAccountSelectAdapter$SelectedHolder.minute && this.second == quickAccountSelectAdapter$SelectedHolder.second && this.nano == quickAccountSelectAdapter$SelectedHolder.nano) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long nanoOfDay = toNanoOfDay();
        return (int) (nanoOfDay ^ (nanoOfDay >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.hour;
        byte b2 = this.minute;
        byte b3 = this.second;
        int i = this.nano;
        sb.append(b < 10 ? "0" : "");
        sb.append(b);
        String str = ":";
        sb.append(b2 < 10 ? ":0" : str);
        sb.append(b2);
        if (b3 > 0 || i > 0) {
            if (b3 < 10) {
                str = ":0";
            }
            sb.append(str);
            sb.append(b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + Utils.SECOND_IN_NANOS).substring(1));
                }
            }
        }
        return sb.toString();
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 5, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        if (this.nano != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(this.second);
            dataOutput.writeInt(this.nano);
        } else if (this.second != 0) {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(this.minute);
            dataOutput.writeByte(~this.second);
        } else if (this.minute == 0) {
            dataOutput.writeByte(~this.hour);
        } else {
            dataOutput.writeByte(this.hour);
            dataOutput.writeByte(~this.minute);
        }
    }

    static QuickAccountSelectAdapter$SelectedHolder readExternal(DataInput dataInput) throws IOException {
        int i;
        int i2;
        int readByte = dataInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            i2 = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                int i3 = ~readByte2;
                i2 = 0;
                b = i3;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                } else {
                    b = dataInput.readInt();
                    i = readByte3;
                }
                byte b2 = readByte2;
                i2 = b;
                b = b2;
            }
        }
        return m3545of(readByte, b, i, i2);
    }
}
