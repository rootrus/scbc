package org.threeten.p041bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Comparator;
import p040o.AccountSourceAdapter$ItemViewHolder;
import p040o.AccountSourceAdapter$ItemViewHolder_ViewBinding;
import p040o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver;
import p040o.BillerAdapter$ItemViewHolder_ViewBinding;
import p040o.DenominatorAmountAdapter$BubbleViewDisableHolder;
import p040o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding;
import p040o.DenominatorAmountAdapter$BubbleViewHolder_ViewBinding;
import p040o.DenominatorAmountAdapter$PencilViewHolder;
import p040o.DenominatorAmountAdapter$PencilViewHolder_ViewBinding;
import p040o.DepositAccountsAdapter$DepositAccountHolder_ViewBinding;
import p040o.EBillAdapter$EBillHolder;
import p040o.EBillAdapter$EBillHolder_ViewBinding;
import p040o.FavouriteTargetAdapter$ItemViewHolder;
import p040o.GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder;
import p040o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding;
import p040o.ManageAccountInboundViewHolder_ViewBinding;
import p040o.PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding;
import p040o.PrepaidTransactionAdapter$ChildViewHolder;
import p040o.PrepaidTransactionAdapter$ChildViewHolder_ViewBinding;
import p040o.PrepaidTransactionAdapter$ParentViewHolder;
import p040o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding;
import p040o.QuickAccountSelectAdapter$FooterHolder_ViewBinding;
import p040o.QuickAccountSelectAdapter$HeaderHolder_ViewBinding;
import p040o.QuickAccountSelectAdapter$SelectedHolder;
import p040o.QuickAccountSelectAdapter$UnselectedHolder;
import p040o.QuickAccountSelectAdapter$UnselectedHolder_ViewBinding;
import p040o.RemittanceCountryListAdapter$CountryViewHolder;
import p040o.RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder;
import p040o.TierPricingInstallmentAdapter$InstallmentViewHolder;

/* renamed from: org.threeten.bp.OffsetDateTime */
public final class OffsetDateTime extends AccountSourceAdapter$ItemViewHolder implements DenominatorAmountAdapter$BubbleViewDisableHolder, AccountSourceAdapter$ItemViewHolder_ViewBinding, Comparable<OffsetDateTime>, Serializable {
    public static final EBillAdapter$EBillHolder<OffsetDateTime> FROM = new EBillAdapter$EBillHolder<OffsetDateTime>() {
        public final OffsetDateTime queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return OffsetDateTime.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    private static final Comparator<OffsetDateTime> INSTANT_COMPARATOR = new Comparator<OffsetDateTime>() {
        public final int compare(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
            int compareLongs = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(offsetDateTime.toEpochSecond(), offsetDateTime2.toEpochSecond());
            return compareLongs == 0 ? RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs((long) offsetDateTime.getNano(), (long) offsetDateTime2.getNano()) : compareLongs;
        }
    };
    public static final OffsetDateTime MAX = QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.MAX.atOffset(ManageAccountInboundViewHolder_ViewBinding.MIN);
    public static final OffsetDateTime MIN = QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.MIN.atOffset(ManageAccountInboundViewHolder_ViewBinding.MAX);
    private static final long serialVersionUID = 2287754244819255394L;
    private final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding dateTime;
    private final ManageAccountInboundViewHolder_ViewBinding offset;

    public static Comparator<OffsetDateTime> timeLineOrder() {
        return INSTANT_COMPARATOR;
    }

    public static OffsetDateTime now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static OffsetDateTime now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static OffsetDateTime now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant = preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.instant();
        return ofInstant(instant, preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.getZone().getRules().getOffset(instant));
    }

    /* renamed from: of */
    public static OffsetDateTime m3129of(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return new OffsetDateTime(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of(quickAccountSelectAdapter$UnselectedHolder, quickAccountSelectAdapter$SelectedHolder), manageAccountInboundViewHolder_ViewBinding);
    }

    /* renamed from: of */
    public static OffsetDateTime m3130of(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return new OffsetDateTime(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding);
    }

    /* renamed from: of */
    public static OffsetDateTime m3128of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return new OffsetDateTime(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3551of(i, i2, i3, i4, i5, i6, i7), manageAccountInboundViewHolder_ViewBinding);
    }

    public static OffsetDateTime ofInstant(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$HeaderHolder_ViewBinding, "instant");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        ManageAccountInboundViewHolder_ViewBinding offset2 = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules().getOffset(quickAccountSelectAdapter$HeaderHolder_ViewBinding);
        return new OffsetDateTime(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.ofEpochSecond(quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond(), quickAccountSelectAdapter$HeaderHolder_ViewBinding.getNano(), offset2), offset2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return ofInstant(p040o.QuickAccountSelectAdapter$HeaderHolder_ViewBinding.from(r2), r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.threeten.p041bp.OffsetDateTime from(p040o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding r2) {
        /*
            boolean r0 = r2 instanceof org.threeten.p041bp.OffsetDateTime
            if (r0 == 0) goto L_0x0007
            org.threeten.bp.OffsetDateTime r2 = (org.threeten.p041bp.OffsetDateTime) r2
            return r2
        L_0x0007:
            o.ManageAccountInboundViewHolder_ViewBinding r0 = p040o.ManageAccountInboundViewHolder_ViewBinding.from(r2)     // Catch:{ DateTimeException -> 0x001d }
            o.QuickAccountSelectAdapter$UnselectedHolder_ViewBinding r1 = p040o.QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.from(r2)     // Catch:{ DateTimeException -> 0x0014 }
            org.threeten.bp.OffsetDateTime r2 = m3130of(r1, r0)     // Catch:{ DateTimeException -> 0x0014 }
            return r2
        L_0x0014:
            o.QuickAccountSelectAdapter$HeaderHolder_ViewBinding r1 = p040o.QuickAccountSelectAdapter$HeaderHolder_ViewBinding.from(r2)     // Catch:{ DateTimeException -> 0x001d }
            org.threeten.bp.OffsetDateTime r2 = ofInstant(r1, r0)     // Catch:{ DateTimeException -> 0x001d }
            return r2
        L_0x001d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to obtain OffsetDateTime from TemporalAccessor: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", type "
            r0.append(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            org.threeten.bp.DateTimeException r2 = new org.threeten.bp.DateTimeException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.p041bp.OffsetDateTime.from(o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding):org.threeten.bp.OffsetDateTime");
    }

    public static OffsetDateTime parse(CharSequence charSequence) {
        return parse(charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_OFFSET_DATE_TIME);
    }

    public static OffsetDateTime parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (OffsetDateTime) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    private OffsetDateTime(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        this.dateTime = (QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, "dateTime");
        this.offset = (ManageAccountInboundViewHolder_ViewBinding) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
    }

    private OffsetDateTime with(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        if (this.dateTime != quickAccountSelectAdapter$UnselectedHolder_ViewBinding || !this.offset.equals(manageAccountInboundViewHolder_ViewBinding)) {
            return new OffsetDateTime(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding);
        }
        return this;
    }

    public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        return (denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder) || (denominatorAmountAdapter$PencilViewHolder != null && denominatorAmountAdapter$PencilViewHolder.isSupportedBy(this));
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
        if (denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS || denominatorAmountAdapter$PencilViewHolder == TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS) {
            return denominatorAmountAdapter$PencilViewHolder.range();
        }
        return this.dateTime.range(denominatorAmountAdapter$PencilViewHolder);
    }

    public final int get(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return super.get(denominatorAmountAdapter$PencilViewHolder);
        }
        int i = AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Field too large for an int: ");
            sb.append(denominatorAmountAdapter$PencilViewHolder);
            throw new DateTimeException(sb.toString());
        } else if (i != 2) {
            return this.dateTime.get(denominatorAmountAdapter$PencilViewHolder);
        } else {
            return getOffset().getTotalSeconds();
        }
    }

    public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return denominatorAmountAdapter$PencilViewHolder.getFrom(this);
        }
        int i = AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
        if (i == 1) {
            return toEpochSecond();
        }
        if (i != 2) {
            return this.dateTime.getLong(denominatorAmountAdapter$PencilViewHolder);
        }
        return (long) getOffset().getTotalSeconds();
    }

    public final ManageAccountInboundViewHolder_ViewBinding getOffset() {
        return this.offset;
    }

    public final OffsetDateTime withOffsetSameLocal(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return with(this.dateTime, manageAccountInboundViewHolder_ViewBinding);
    }

    public final OffsetDateTime withOffsetSameInstant(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        if (manageAccountInboundViewHolder_ViewBinding.equals(this.offset)) {
            return this;
        }
        return new OffsetDateTime(this.dateTime.plusSeconds((long) (manageAccountInboundViewHolder_ViewBinding.getTotalSeconds() - this.offset.getTotalSeconds())), manageAccountInboundViewHolder_ViewBinding);
    }

    public final int getYear() {
        return this.dateTime.getYear();
    }

    public final int getMonthValue() {
        return this.dateTime.getMonthValue();
    }

    public final PrepaidTransactionAdapter$ChildViewHolder getMonth() {
        return this.dateTime.getMonth();
    }

    public final int getDayOfMonth() {
        return this.dateTime.getDayOfMonth();
    }

    public final int getDayOfYear() {
        return this.dateTime.getDayOfYear();
    }

    public final QuickAccountSelectAdapter$FooterHolder_ViewBinding getDayOfWeek() {
        return this.dateTime.getDayOfWeek();
    }

    public final int getHour() {
        return this.dateTime.getHour();
    }

    public final int getMinute() {
        return this.dateTime.getMinute();
    }

    public final int getSecond() {
        return this.dateTime.getSecond();
    }

    public final int getNano() {
        return this.dateTime.getNano();
    }

    public final OffsetDateTime with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        if ((accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder) || (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$SelectedHolder) || (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding)) {
            return with(this.dateTime.with(accountSourceAdapter$ItemViewHolder_ViewBinding), this.offset);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            return ofInstant((QuickAccountSelectAdapter$HeaderHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding, this.offset);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof ManageAccountInboundViewHolder_ViewBinding) {
            return with(this.dateTime, (ManageAccountInboundViewHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof OffsetDateTime) {
            return (OffsetDateTime) accountSourceAdapter$ItemViewHolder_ViewBinding;
        }
        return (OffsetDateTime) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
    }

    public final OffsetDateTime with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (OffsetDateTime) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        int i = AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
        if (i == 1) {
            return ofInstant(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochSecond(j, (long) getNano()), this.offset);
        }
        if (i != 2) {
            return with(this.dateTime.with(denominatorAmountAdapter$PencilViewHolder, j), this.offset);
        }
        return with(this.dateTime, ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidIntValue(j)));
    }

    public final OffsetDateTime withYear(int i) {
        return with(this.dateTime.withYear(i), this.offset);
    }

    public final OffsetDateTime withMonth(int i) {
        return with(this.dateTime.withMonth(i), this.offset);
    }

    public final OffsetDateTime withDayOfMonth(int i) {
        return with(this.dateTime.withDayOfMonth(i), this.offset);
    }

    public final OffsetDateTime withDayOfYear(int i) {
        return with(this.dateTime.withDayOfYear(i), this.offset);
    }

    public final OffsetDateTime withHour(int i) {
        return with(this.dateTime.withHour(i), this.offset);
    }

    public final OffsetDateTime withMinute(int i) {
        return with(this.dateTime.withMinute(i), this.offset);
    }

    public final OffsetDateTime withSecond(int i) {
        return with(this.dateTime.withSecond(i), this.offset);
    }

    public final OffsetDateTime withNano(int i) {
        return with(this.dateTime.withNano(i), this.offset);
    }

    public final OffsetDateTime truncatedTo(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return with(this.dateTime.truncatedTo(eBillAdapter$EBillHolder_ViewBinding), this.offset);
    }

    public final OffsetDateTime plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (OffsetDateTime) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final OffsetDateTime plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding) {
            return with(this.dateTime.plus(j, eBillAdapter$EBillHolder_ViewBinding), this.offset);
        }
        return (OffsetDateTime) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
    }

    public final OffsetDateTime plusYears(long j) {
        return with(this.dateTime.plusYears(j), this.offset);
    }

    public final OffsetDateTime plusMonths(long j) {
        return with(this.dateTime.plusMonths(j), this.offset);
    }

    public final OffsetDateTime plusWeeks(long j) {
        return with(this.dateTime.plusWeeks(j), this.offset);
    }

    public final OffsetDateTime plusDays(long j) {
        return with(this.dateTime.plusDays(j), this.offset);
    }

    public final OffsetDateTime plusHours(long j) {
        return with(this.dateTime.plusHours(j), this.offset);
    }

    public final OffsetDateTime plusMinutes(long j) {
        return with(this.dateTime.plusMinutes(j), this.offset);
    }

    public final OffsetDateTime plusSeconds(long j) {
        return with(this.dateTime.plusSeconds(j), this.offset);
    }

    public final OffsetDateTime plusNanos(long j) {
        return with(this.dateTime.plusNanos(j), this.offset);
    }

    public final OffsetDateTime minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (OffsetDateTime) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final OffsetDateTime minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final OffsetDateTime minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1) : plusYears(-j);
    }

    public final OffsetDateTime minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j);
    }

    public final OffsetDateTime minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1) : plusWeeks(-j);
    }

    public final OffsetDateTime minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j);
    }

    public final OffsetDateTime minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1) : plusHours(-j);
    }

    public final OffsetDateTime minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1) : plusMinutes(-j);
    }

    public final OffsetDateTime minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1) : plusSeconds(-j);
    }

    public final OffsetDateTime minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1) : plusNanos(-j);
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.chronology()) {
            return RemittanceCountryListAdapter$CountryViewHolder.INSTANCE;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.precision()) {
            return BillerAdapter$ItemViewHolder_ViewBinding.NANOS;
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.offset() || eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone()) {
            return getOffset();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            return toLocalDate();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localTime()) {
            return toLocalTime();
        }
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId()) {
            return null;
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public final DenominatorAmountAdapter$BubbleViewDisableHolder adjustInto(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder) {
        return denominatorAmountAdapter$BubbleViewDisableHolder.with(TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY, toLocalDate().toEpochDay()).with(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY, toLocalTime().toNanoOfDay()).with(TierPricingInstallmentAdapter$InstallmentViewHolder.OFFSET_SECONDS, (long) getOffset().getTotalSeconds());
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        OffsetDateTime from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        return this.dateTime.until(from.withOffsetSameInstant(this.offset).dateTime, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding atZoneSameInstant(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.ofInstant(this.dateTime, this.offset, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding atZoneSimilarLocal(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.ofLocal(this.dateTime, languageSettingAdapter$LanguageSettingHolder_ViewBinding, this.offset);
    }

    public final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding toLocalDateTime() {
        return this.dateTime;
    }

    public final QuickAccountSelectAdapter$UnselectedHolder toLocalDate() {
        return this.dateTime.toLocalDate();
    }

    public final QuickAccountSelectAdapter$SelectedHolder toLocalTime() {
        return this.dateTime.toLocalTime();
    }

    public final PrepaidTransactionAdapter$ParentViewHolder toOffsetTime() {
        return PrepaidTransactionAdapter$ParentViewHolder.m6248of(this.dateTime.toLocalTime(), this.offset);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding toZonedDateTime() {
        return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.m3075of(this.dateTime, this.offset);
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding toInstant() {
        return this.dateTime.toInstant(this.offset);
    }

    public final long toEpochSecond() {
        return this.dateTime.toEpochSecond(this.offset);
    }

    public final int compareTo(OffsetDateTime offsetDateTime) {
        if (getOffset().equals(offsetDateTime.getOffset())) {
            return toLocalDateTime().compareTo((DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>) offsetDateTime.toLocalDateTime());
        }
        int compareLongs = RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.compareLongs(toEpochSecond(), offsetDateTime.toEpochSecond());
        if (compareLongs != 0) {
            return compareLongs;
        }
        int nano = toLocalTime().getNano() - offsetDateTime.toLocalTime().getNano();
        return nano == 0 ? toLocalDateTime().compareTo((DepositAccountsAdapter$DepositAccountHolder_ViewBinding<?>) offsetDateTime.toLocalDateTime()) : nano;
    }

    public final boolean isAfter(OffsetDateTime offsetDateTime) {
        int i = (toEpochSecond() > offsetDateTime.toEpochSecond() ? 1 : (toEpochSecond() == offsetDateTime.toEpochSecond() ? 0 : -1));
        return i > 0 || (i == 0 && toLocalTime().getNano() > offsetDateTime.toLocalTime().getNano());
    }

    public final boolean isBefore(OffsetDateTime offsetDateTime) {
        int i = (toEpochSecond() > offsetDateTime.toEpochSecond() ? 1 : (toEpochSecond() == offsetDateTime.toEpochSecond() ? 0 : -1));
        return i < 0 || (i == 0 && toLocalTime().getNano() < offsetDateTime.toLocalTime().getNano());
    }

    public final boolean isEqual(OffsetDateTime offsetDateTime) {
        return toEpochSecond() == offsetDateTime.toEpochSecond() && toLocalTime().getNano() == offsetDateTime.toLocalTime().getNano();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (!this.dateTime.equals(offsetDateTime.dateTime) || !this.offset.equals(offsetDateTime.offset)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.dateTime.hashCode() ^ this.offset.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dateTime.toString());
        sb.append(this.offset.toString());
        return sb.toString();
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.format(this);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 69, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void writeExternal(DataOutput dataOutput) throws IOException {
        this.dateTime.writeExternal(dataOutput);
        this.offset.writeExternal(dataOutput);
    }

    public static OffsetDateTime readExternal(DataInput dataInput) throws IOException {
        return m3130of(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.readExternal(dataInput), ManageAccountInboundViewHolder_ViewBinding.readExternal(dataInput));
    }
}
