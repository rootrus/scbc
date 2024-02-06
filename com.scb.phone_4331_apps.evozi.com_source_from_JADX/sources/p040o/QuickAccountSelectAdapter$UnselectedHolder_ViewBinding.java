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

/* renamed from: o.QuickAccountSelectAdapter$UnselectedHolder_ViewBinding */
public final class QuickAccountSelectAdapter$UnselectedHolder_ViewBinding extends DepositAccountsAdapter$DepositAccountHolder_ViewBinding<QuickAccountSelectAdapter$UnselectedHolder> implements Serializable {
    public static final EBillAdapter$EBillHolder<QuickAccountSelectAdapter$UnselectedHolder_ViewBinding> FROM = new EBillAdapter$EBillHolder<QuickAccountSelectAdapter$UnselectedHolder_ViewBinding>() {
        public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    public static final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding MAX = m3555of(QuickAccountSelectAdapter$UnselectedHolder.MAX, QuickAccountSelectAdapter$SelectedHolder.MAX);
    public static final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding MIN = m3555of(QuickAccountSelectAdapter$UnselectedHolder.MIN, QuickAccountSelectAdapter$SelectedHolder.MIN);
    private static final long serialVersionUID = 6207766400415563566L;
    private final QuickAccountSelectAdapter$UnselectedHolder date;
    private final QuickAccountSelectAdapter$SelectedHolder time;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>) (DepositAccountsAdapter$DepositAccountHolder_ViewBinding) obj);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant = preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.instant();
        return ofEpochSecond(instant.getEpochSecond(), instant.getNano(), preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.getZone().getRules().getOffset(instant));
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding m3552of(int i, PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder, int i2, int i3, int i4) {
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3548of(i, prepaidTransactionAdapter$ChildViewHolder, i2), QuickAccountSelectAdapter$SelectedHolder.m3543of(i3, i4));
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding m3553of(int i, PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder, int i2, int i3, int i4, int i5) {
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3548of(i, prepaidTransactionAdapter$ChildViewHolder, i2), QuickAccountSelectAdapter$SelectedHolder.m3544of(i3, i4, i5));
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding m3554of(int i, PrepaidTransactionAdapter$ChildViewHolder prepaidTransactionAdapter$ChildViewHolder, int i2, int i3, int i4, int i5, int i6) {
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3548of(i, prepaidTransactionAdapter$ChildViewHolder, i2), QuickAccountSelectAdapter$SelectedHolder.m3545of(i3, i4, i5, i6));
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding m3549of(int i, int i2, int i3, int i4, int i5) {
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3547of(i, i2, i3), QuickAccountSelectAdapter$SelectedHolder.m3543of(i4, i5));
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding m3550of(int i, int i2, int i3, int i4, int i5, int i6) {
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3547of(i, i2, i3), QuickAccountSelectAdapter$SelectedHolder.m3544of(i4, i5, i6));
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding m3551of(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.m3547of(i, i2, i3), QuickAccountSelectAdapter$SelectedHolder.m3545of(i4, i5, i6, i7));
    }

    /* renamed from: of */
    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding m3555of(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder, "date");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$SelectedHolder, "time");
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder, quickAccountSelectAdapter$SelectedHolder);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding ofInstant(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$HeaderHolder_ViewBinding, "instant");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        return ofEpochSecond(quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond(), quickAccountSelectAdapter$HeaderHolder_ViewBinding.getNano(), languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules().getOffset(quickAccountSelectAdapter$HeaderHolder_ViewBinding));
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding ofEpochSecond(long j, int i, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
        long totalSeconds = j + ((long) manageAccountInboundViewHolder_ViewBinding.getTotalSeconds());
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.ofEpochDay(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(totalSeconds, 86400)), QuickAccountSelectAdapter$SelectedHolder.ofSecondOfDay((long) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(totalSeconds, 86400), i));
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
        }
        if (denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding instanceof ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) {
            return ((ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding).toLocalDateTime();
        }
        try {
            return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding), QuickAccountSelectAdapter$SelectedHolder.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding));
        } catch (DateTimeException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to obtain LocalDateTime from TemporalAccessor: ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
            sb.append(", type ");
            sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
            throw new DateTimeException(sb.toString());
        }
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding parse(CharSequence charSequence) {
        return parse(charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_LOCAL_DATE_TIME);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    private QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        this.date = quickAccountSelectAdapter$UnselectedHolder;
        this.time = quickAccountSelectAdapter$SelectedHolder;
    }

    private QuickAccountSelectAdapter$UnselectedHolder_ViewBinding with(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder) {
        if (this.date == quickAccountSelectAdapter$UnselectedHolder && this.time == quickAccountSelectAdapter$SelectedHolder) {
            return this;
        }
        return new QuickAccountSelectAdapter$UnselectedHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder, quickAccountSelectAdapter$SelectedHolder);
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            if (denominatorAmountAdapter$PencilViewHolder.isDateBased() || denominatorAmountAdapter$PencilViewHolder.isTimeBased()) {
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
            if (eBillAdapter$EBillHolder_ViewBinding.isDateBased() || eBillAdapter$EBillHolder_ViewBinding.isTimeBased()) {
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
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.rangeRefinedBy(this);
        }
        return (denominatorAmountAdapter$PencilViewHolder.isTimeBased() ? this.time : this.date).range(denominatorAmountAdapter$PencilViewHolder);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return super.get(denominatorAmountAdapter$PencilViewHolder);
        }
        return (denominatorAmountAdapter$PencilViewHolder.isTimeBased() ? this.time : this.date).get(denominatorAmountAdapter$PencilViewHolder);
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) {
            return denominatorAmountAdapter$PencilViewHolder.isTimeBased() ? this.time.getLong(denominatorAmountAdapter$PencilViewHolder) : this.date.getLong(denominatorAmountAdapter$PencilViewHolder);
        }
        return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
    }

    public final int getYear() {
        return this.date.getYear();
    }

    public final int getMonthValue() {
        return this.date.getMonthValue();
    }

    public final PrepaidTransactionAdapter$ChildViewHolder getMonth() {
        return this.date.getMonth();
    }

    public final int getDayOfMonth() {
        return this.date.getDayOfMonth();
    }

    public final int getDayOfYear() {
        return this.date.getDayOfYear();
    }

    public final QuickAccountSelectAdapter$FooterHolder_ViewBinding getDayOfWeek() {
        return this.date.getDayOfWeek();
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

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder) {
            return with((QuickAccountSelectAdapter$UnselectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding, this.time);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$SelectedHolder) {
            return with(this.date, (QuickAccountSelectAdapter$SelectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding;
        }
        return (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        if (denominatorAmountAdapter$PencilViewHolder.isTimeBased()) {
            return with(this.date, this.time.with(denominatorAmountAdapter$PencilViewHolder, j));
        }
        return with(this.date.with(denominatorAmountAdapter$PencilViewHolder, j), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding withYear(int i) {
        return with(this.date.withYear(i), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding withMonth(int i) {
        return with(this.date.withMonth(i), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding withDayOfMonth(int i) {
        return with(this.date.withDayOfMonth(i), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding withDayOfYear(int i) {
        return with(this.date.withDayOfYear(i), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding withHour(int i) {
        return with(this.date, this.time.withHour(i));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding withMinute(int i) {
        return with(this.date, this.time.withMinute(i));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding withSecond(int i) {
        return with(this.date, this.time.withSecond(i));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding withNano(int i) {
        return with(this.date, this.time.withNano(i));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding truncatedTo(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return with(this.date, this.time.truncatedTo(eBillAdapter$EBillHolder_ViewBinding));
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
        }
        switch (C1134xe5b94a38.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[((BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding).ordinal()]) {
            case 1:
                return plusNanos(j);
            case 2:
                return plusDays(j / 86400000000L).plusNanos((j % 86400000000L) * 1000);
            case 3:
                return plusDays(j / 86400000).plusNanos((j % 86400000) * 1000000);
            case 4:
                return plusSeconds(j);
            case 5:
                return plusMinutes(j);
            case 6:
                return plusHours(j);
            case 7:
                return plusDays(j / 256).plusHours((j % 256) * 12);
            default:
                return with(this.date.plus(j, eBillAdapter$EBillHolder_ViewBinding), this.time);
        }
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusYears(long j) {
        return with(this.date.plusYears(j), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusMonths(long j) {
        return with(this.date.plusMonths(j), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusWeeks(long j) {
        return with(this.date.plusWeeks(j), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusDays(long j) {
        return with(this.date.plusDays(j), this.time);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusHours(long j) {
        return plusWithOverflow(this.date, j, 0, 0, 0, 1);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusMinutes(long j) {
        return plusWithOverflow(this.date, 0, j, 0, 0, 1);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusSeconds(long j) {
        return plusWithOverflow(this.date, 0, 0, j, 0, 1);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusNanos(long j) {
        return plusWithOverflow(this.date, 0, 0, 0, j, 1);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1) : plusYears(-j);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1) : plusWeeks(-j);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minusHours(long j) {
        return plusWithOverflow(this.date, j, 0, 0, 0, -1);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minusMinutes(long j) {
        return plusWithOverflow(this.date, 0, j, 0, 0, -1);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minusSeconds(long j) {
        return plusWithOverflow(this.date, 0, 0, j, 0, -1);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding minusNanos(long j) {
        return plusWithOverflow(this.date, 0, 0, 0, j, -1);
    }

    private QuickAccountSelectAdapter$UnselectedHolder_ViewBinding plusWithOverflow(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, long j, long j2, long j3, long j4, int i) {
        QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder2 = quickAccountSelectAdapter$UnselectedHolder;
        if ((j | j2 | j3 | j4) == 0) {
            return with(quickAccountSelectAdapter$UnselectedHolder2, this.time);
        }
        long j5 = j4 / 86400000000000L;
        long j6 = j3 / 86400;
        long j7 = j2 / 1440;
        long j8 = j / 24;
        long j9 = (long) i;
        long nanoOfDay = this.time.toNanoOfDay();
        long j10 = (((j4 % 86400000000000L) + ((j3 % 86400) * 1000000000) + ((j2 % 1440) * 60000000000L) + ((j % 24) * 3600000000000L)) * j9) + nanoOfDay;
        long floorDiv = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorDiv(j10, 86400000000000L);
        long floorMod = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(j10, 86400000000000L);
        return with(quickAccountSelectAdapter$UnselectedHolder2.plusDays(((j5 + j6 + j7 + j8) * j9) + floorDiv), floorMod == nanoOfDay ? this.time : QuickAccountSelectAdapter$SelectedHolder.ofNanoOfDay(floorMod));
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            return toLocalDate();
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return super.adjustInto(denominatorAmountAdapter$BubbleViewDisableHolder);
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        QuickAccountSelectAdapter$UnselectedHolder_ViewBinding from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        BillerAdapter$ItemViewHolder_ViewBinding billerAdapter$ItemViewHolder_ViewBinding = (BillerAdapter$ItemViewHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding;
        if (billerAdapter$ItemViewHolder_ViewBinding.isTimeBased()) {
            long daysUntil = this.date.daysUntil(from.date);
            long nanoOfDay = from.time.toNanoOfDay() - this.time.toNanoOfDay();
            int i = (daysUntil > 0 ? 1 : (daysUntil == 0 ? 0 : -1));
            if (i > 0 && nanoOfDay < 0) {
                daysUntil--;
                nanoOfDay += 86400000000000L;
            } else if (i < 0 && nanoOfDay > 0) {
                daysUntil++;
                nanoOfDay -= 86400000000000L;
            }
            switch (C1134xe5b94a38.$SwitchMap$org$threeten$bp$temporal$ChronoUnit[billerAdapter$ItemViewHolder_ViewBinding.ordinal()]) {
                case 1:
                    return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(daysUntil, 86400000000000L), nanoOfDay);
                case 2:
                    return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(daysUntil, 86400000000L), nanoOfDay / 1000);
                case 3:
                    return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(daysUntil, 86400000), nanoOfDay / 1000000);
                case 4:
                    return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(daysUntil, 86400), nanoOfDay / 1000000000);
                case 5:
                    return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(daysUntil, 1440), nanoOfDay / 60000000000L);
                case 6:
                    return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(daysUntil, 24), nanoOfDay / 3600000000000L);
                case 7:
                    return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeMultiply(daysUntil, 2), nanoOfDay / 43200000000000L);
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported unit: ");
                    sb.append(eBillAdapter$EBillHolder_ViewBinding);
                    throw new UnsupportedTemporalTypeException(sb.toString());
            }
        } else {
            QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder = from.date;
            if (quickAccountSelectAdapter$UnselectedHolder.isAfter(this.date) && from.time.isBefore(this.time)) {
                quickAccountSelectAdapter$UnselectedHolder = quickAccountSelectAdapter$UnselectedHolder.minusDays(1);
            } else if (quickAccountSelectAdapter$UnselectedHolder.isBefore(this.date) && from.time.isAfter(this.time)) {
                quickAccountSelectAdapter$UnselectedHolder = quickAccountSelectAdapter$UnselectedHolder.plusDays(1);
            }
            return this.date.until(quickAccountSelectAdapter$UnselectedHolder, eBillAdapter$EBillHolder_ViewBinding);
        }
    }

    public final OffsetDateTime atOffset(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return OffsetDateTime.m3130of(this, manageAccountInboundViewHolder_ViewBinding);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding atZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.m3075of(this, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder toLocalDate() {
        return this.date;
    }

    public final QuickAccountSelectAdapter$SelectedHolder toLocalTime() {
        return this.time;
    }

    public final int compareTo(DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> depositAccountsAdapter$DepositAccountHolder_ViewBinding) {
        if (depositAccountsAdapter$DepositAccountHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return compareTo0((QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) depositAccountsAdapter$DepositAccountHolder_ViewBinding);
        }
        return super.compareTo(depositAccountsAdapter$DepositAccountHolder_ViewBinding);
    }

    private int compareTo0(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
        int compareTo0 = this.date.compareTo0(quickAccountSelectAdapter$UnselectedHolder_ViewBinding.toLocalDate());
        return compareTo0 == 0 ? this.time.compareTo(quickAccountSelectAdapter$UnselectedHolder_ViewBinding.toLocalTime()) : compareTo0;
    }

    public final boolean isAfter(DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> depositAccountsAdapter$DepositAccountHolder_ViewBinding) {
        if (depositAccountsAdapter$DepositAccountHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return compareTo0((QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) depositAccountsAdapter$DepositAccountHolder_ViewBinding) > 0;
        }
        return super.isAfter(depositAccountsAdapter$DepositAccountHolder_ViewBinding);
    }

    public final boolean isBefore(DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> depositAccountsAdapter$DepositAccountHolder_ViewBinding) {
        if (depositAccountsAdapter$DepositAccountHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return compareTo0((QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) depositAccountsAdapter$DepositAccountHolder_ViewBinding) < 0;
        }
        return super.isBefore(depositAccountsAdapter$DepositAccountHolder_ViewBinding);
    }

    public final boolean isEqual(DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?> depositAccountsAdapter$DepositAccountHolder_ViewBinding) {
        if (depositAccountsAdapter$DepositAccountHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return compareTo0((QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) depositAccountsAdapter$DepositAccountHolder_ViewBinding) == 0;
        }
        return super.isEqual(depositAccountsAdapter$DepositAccountHolder_ViewBinding);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding)) {
            return false;
        }
        QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding = (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) obj;
        if (!this.date.equals(quickAccountSelectAdapter$UnselectedHolder_ViewBinding.date) || !this.time.equals(quickAccountSelectAdapter$UnselectedHolder_ViewBinding.time)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.date.hashCode() ^ this.time.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.date.toString());
        sb.append('T');
        sb.append(this.time.toString());
        return sb.toString();
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        return super.format(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 4, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void writeExternal(DataOutput dataOutput) throws IOException {
        this.date.writeExternal(dataOutput);
        this.time.writeExternal(dataOutput);
    }

    public static QuickAccountSelectAdapter$UnselectedHolder_ViewBinding readExternal(DataInput dataInput) throws IOException {
        return m3555of(QuickAccountSelectAdapter$UnselectedHolder.readExternal(dataInput), QuickAccountSelectAdapter$SelectedHolder.readExternal(dataInput));
    }
}
