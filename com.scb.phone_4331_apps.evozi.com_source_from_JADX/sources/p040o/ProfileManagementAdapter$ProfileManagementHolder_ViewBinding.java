package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding */
public final class ProfileManagementAdapter$ProfileManagementHolder_ViewBinding extends PurchaseAccountSourceAdapter$ItemViewHolder_ViewBinding<QuickAccountSelectAdapter$UnselectedHolder> implements Serializable {
    public static final EBillAdapter$EBillHolder<ProfileManagementAdapter$ProfileManagementHolder_ViewBinding> FROM = new EBillAdapter$EBillHolder<ProfileManagementAdapter$ProfileManagementHolder_ViewBinding>() {
        public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    private static final long serialVersionUID = -6260982410461394882L;
    private final QuickAccountSelectAdapter$UnselectedHolder_ViewBinding dateTime;
    private final ManageAccountInboundViewHolder_ViewBinding offset;
    private final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding zone;

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding now() {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.systemDefaultZone());
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding now(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.system(languageSettingAdapter$LanguageSettingHolder_ViewBinding));
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding now(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "clock");
        return ofInstant(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.instant(), preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.getZone());
    }

    /* renamed from: of */
    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding m3074of(QuickAccountSelectAdapter$UnselectedHolder quickAccountSelectAdapter$UnselectedHolder, QuickAccountSelectAdapter$SelectedHolder quickAccountSelectAdapter$SelectedHolder, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return m3075of(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of(quickAccountSelectAdapter$UnselectedHolder, quickAccountSelectAdapter$SelectedHolder), languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    /* renamed from: of */
    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding m3075of(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ofLocal(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding, (ManageAccountInboundViewHolder_ViewBinding) null);
    }

    /* renamed from: of */
    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding m3073of(int i, int i2, int i3, int i4, int i5, int i6, int i7, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return ofLocal(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3551of(i, i2, i3, i4, i5, i6, i7), languageSettingAdapter$LanguageSettingHolder_ViewBinding, (ManageAccountInboundViewHolder_ViewBinding) null);
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding ofLocal(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, "localDateTime");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        if (languageSettingAdapter$LanguageSettingHolder_ViewBinding instanceof ManageAccountInboundViewHolder_ViewBinding) {
            return new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, (ManageAccountInboundViewHolder_ViewBinding) languageSettingAdapter$LanguageSettingHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
        }
        HistoryAdapter$ChildViewHolder rules = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules();
        List<ManageAccountInboundViewHolder_ViewBinding> validOffsets = rules.getValidOffsets(quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
        if (validOffsets.size() == 1) {
            manageAccountInboundViewHolder_ViewBinding = validOffsets.get(0);
        } else if (validOffsets.size() == 0) {
            HistoryAdapter$ChildViewHolder_ViewBinding transition = rules.getTransition(quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
            quickAccountSelectAdapter$UnselectedHolder_ViewBinding = quickAccountSelectAdapter$UnselectedHolder_ViewBinding.plusSeconds(transition.getDuration().getSeconds());
            manageAccountInboundViewHolder_ViewBinding = transition.getOffsetAfter();
        } else if (manageAccountInboundViewHolder_ViewBinding == null || !validOffsets.contains(manageAccountInboundViewHolder_ViewBinding)) {
            manageAccountInboundViewHolder_ViewBinding = (ManageAccountInboundViewHolder_ViewBinding) RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(validOffsets.get(0), "offset");
        }
        return new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding ofInstant(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$HeaderHolder_ViewBinding, "instant");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        return create(quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond(), quickAccountSelectAdapter$HeaderHolder_ViewBinding.getNano(), languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding ofInstant(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, "localDateTime");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        return create(quickAccountSelectAdapter$UnselectedHolder_ViewBinding.toEpochSecond(manageAccountInboundViewHolder_ViewBinding), quickAccountSelectAdapter$UnselectedHolder_ViewBinding.getNano(), languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    private static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding create(long j, int i, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        ManageAccountInboundViewHolder_ViewBinding offset2 = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules().getOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochSecond(j, (long) i));
        return new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.ofEpochSecond(j, i, offset2), offset2, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding ofStrict(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, "localDateTime");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        HistoryAdapter$ChildViewHolder rules = languageSettingAdapter$LanguageSettingHolder_ViewBinding.getRules();
        if (rules.isValidOffset(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding)) {
            return new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
        }
        HistoryAdapter$ChildViewHolder_ViewBinding transition = rules.getTransition(quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
        if (transition == null || !transition.isGap()) {
            StringBuilder sb = new StringBuilder();
            sb.append("ZoneOffset '");
            sb.append(manageAccountInboundViewHolder_ViewBinding);
            sb.append("' is not valid for LocalDateTime '");
            sb.append(quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
            sb.append("' in zone '");
            sb.append(languageSettingAdapter$LanguageSettingHolder_ViewBinding);
            sb.append("'");
            throw new DateTimeException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LocalDateTime '");
        sb2.append(quickAccountSelectAdapter$UnselectedHolder_ViewBinding);
        sb2.append("' does not exist in zone '");
        sb2.append(languageSettingAdapter$LanguageSettingHolder_ViewBinding);
        sb2.append("' due to a gap in the local time-line, typically caused by daylight savings");
        throw new DateTimeException(sb2.toString());
    }

    private static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding ofLenient(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, "localDateTime");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        if (!(languageSettingAdapter$LanguageSettingHolder_ViewBinding instanceof ManageAccountInboundViewHolder_ViewBinding) || manageAccountInboundViewHolder_ViewBinding.equals(languageSettingAdapter$LanguageSettingHolder_ViewBinding)) {
            return new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|(3:7|8|9)|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding from(p040o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding r4) {
        /*
            boolean r0 = r4 instanceof p040o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding
            if (r0 == 0) goto L_0x0007
            o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding r4 = (p040o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) r4
            return r4
        L_0x0007:
            o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding r0 = p040o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.from(r4)     // Catch:{ DateTimeException -> 0x002d }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS     // Catch:{ DateTimeException -> 0x002d }
            boolean r1 = r4.isSupported(r1)     // Catch:{ DateTimeException -> 0x002d }
            if (r1 == 0) goto L_0x0024
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS     // Catch:{ DateTimeException -> 0x0024 }
            long r1 = r4.getLong(r1)     // Catch:{ DateTimeException -> 0x0024 }
            o.TierPricingInstallmentAdapter$InstallmentViewHolder r3 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND     // Catch:{ DateTimeException -> 0x0024 }
            int r3 = r4.get(r3)     // Catch:{ DateTimeException -> 0x0024 }
            o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding r4 = create(r1, r3, r0)     // Catch:{ DateTimeException -> 0x0024 }
            return r4
        L_0x0024:
            o.QuickAccountSelectAdapter$UnselectedHolder_ViewBinding r1 = p040o.QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.from(r4)     // Catch:{ DateTimeException -> 0x002d }
            o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding r4 = m3075of(r1, r0)     // Catch:{ DateTimeException -> 0x002d }
            return r4
        L_0x002d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to obtain ZonedDateTime from TemporalAccessor: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", type "
            r0.append(r1)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            org.threeten.bp.DateTimeException r4 = new org.threeten.bp.DateTimeException
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.from(o.DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding):o.ProfileManagementAdapter$ProfileManagementHolder_ViewBinding");
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding parse(CharSequence charSequence) {
        return parse(charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.ISO_ZONED_DATE_TIME);
    }

    public static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding parse(CharSequence charSequence, GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, "formatter");
        return (ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder.parse(charSequence, FROM);
    }

    private ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        this.dateTime = quickAccountSelectAdapter$UnselectedHolder_ViewBinding;
        this.offset = manageAccountInboundViewHolder_ViewBinding;
        this.zone = languageSettingAdapter$LanguageSettingHolder_ViewBinding;
    }

    private ProfileManagementAdapter$ProfileManagementHolder_ViewBinding resolveLocal(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
        return ofLocal(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, this.zone, this.offset);
    }

    private ProfileManagementAdapter$ProfileManagementHolder_ViewBinding resolveInstant(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
        return ofInstant(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, this.offset, this.zone);
    }

    private ProfileManagementAdapter$ProfileManagementHolder_ViewBinding resolveOffset(ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        return (manageAccountInboundViewHolder_ViewBinding.equals(this.offset) || !this.zone.getRules().isValidOffset(this.dateTime, manageAccountInboundViewHolder_ViewBinding)) ? this : new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(this.dateTime, manageAccountInboundViewHolder_ViewBinding, this.zone);
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
        int i = C1454x8d0f0ffb.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
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
        int i = C1454x8d0f0ffb.$SwitchMap$org$threeten$bp$temporal$ChronoField[((TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder).ordinal()];
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

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withEarlierOffsetAtOverlap() {
        HistoryAdapter$ChildViewHolder_ViewBinding transition = getZone().getRules().getTransition(this.dateTime);
        if (transition != null && transition.isOverlap()) {
            ManageAccountInboundViewHolder_ViewBinding offsetBefore = transition.getOffsetBefore();
            if (!offsetBefore.equals(this.offset)) {
                return new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(this.dateTime, offsetBefore, this.zone);
            }
        }
        return this;
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withLaterOffsetAtOverlap() {
        HistoryAdapter$ChildViewHolder_ViewBinding transition = getZone().getRules().getTransition(toLocalDateTime());
        if (transition != null) {
            ManageAccountInboundViewHolder_ViewBinding offsetAfter = transition.getOffsetAfter();
            if (!offsetAfter.equals(this.offset)) {
                return new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(this.dateTime, offsetAfter, this.zone);
            }
        }
        return this;
    }

    public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone() {
        return this.zone;
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withZoneSameLocal(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        return this.zone.equals(languageSettingAdapter$LanguageSettingHolder_ViewBinding) ? this : ofLocal(this.dateTime, languageSettingAdapter$LanguageSettingHolder_ViewBinding, this.offset);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withZoneSameInstant(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        if (this.zone.equals(languageSettingAdapter$LanguageSettingHolder_ViewBinding)) {
            return this;
        }
        return create(this.dateTime.toEpochSecond(this.offset), this.dateTime.getNano(), languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withFixedOffsetZone() {
        if (this.zone.equals(this.offset)) {
            return this;
        }
        QuickAccountSelectAdapter$UnselectedHolder_ViewBinding quickAccountSelectAdapter$UnselectedHolder_ViewBinding = this.dateTime;
        ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding = this.offset;
        return new ProfileManagementAdapter$ProfileManagementHolder_ViewBinding(quickAccountSelectAdapter$UnselectedHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding, manageAccountInboundViewHolder_ViewBinding);
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

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding with(AccountSourceAdapter$ItemViewHolder_ViewBinding accountSourceAdapter$ItemViewHolder_ViewBinding) {
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder) {
            return resolveLocal(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of((QuickAccountSelectAdapter$UnselectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding, this.dateTime.toLocalTime()));
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$SelectedHolder) {
            return resolveLocal(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.m3555of(this.dateTime.toLocalDate(), (QuickAccountSelectAdapter$SelectedHolder) accountSourceAdapter$ItemViewHolder_ViewBinding));
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) {
            return resolveLocal((QuickAccountSelectAdapter$UnselectedHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding);
        }
        if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof QuickAccountSelectAdapter$HeaderHolder_ViewBinding) {
            QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding = (QuickAccountSelectAdapter$HeaderHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding;
            return create(quickAccountSelectAdapter$HeaderHolder_ViewBinding.getEpochSecond(), quickAccountSelectAdapter$HeaderHolder_ViewBinding.getNano(), this.zone);
        } else if (accountSourceAdapter$ItemViewHolder_ViewBinding instanceof ManageAccountInboundViewHolder_ViewBinding) {
            return resolveOffset((ManageAccountInboundViewHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding);
        } else {
            return (ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) accountSourceAdapter$ItemViewHolder_ViewBinding.adjustInto(this);
        }
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding with(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j) {
        if (!(denominatorAmountAdapter$PencilViewHolder instanceof TierPricingInstallmentAdapter$InstallmentViewHolder)) {
            return (ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder.adjustInto(this, j);
        }
        TierPricingInstallmentAdapter$InstallmentViewHolder tierPricingInstallmentAdapter$InstallmentViewHolder = (TierPricingInstallmentAdapter$InstallmentViewHolder) denominatorAmountAdapter$PencilViewHolder;
        int i = C1454x8d0f0ffb.$SwitchMap$org$threeten$bp$temporal$ChronoField[tierPricingInstallmentAdapter$InstallmentViewHolder.ordinal()];
        if (i == 1) {
            return create(j, getNano(), this.zone);
        }
        if (i != 2) {
            return resolveLocal(this.dateTime.with(denominatorAmountAdapter$PencilViewHolder, j));
        }
        return resolveOffset(ManageAccountInboundViewHolder_ViewBinding.ofTotalSeconds(tierPricingInstallmentAdapter$InstallmentViewHolder.checkValidIntValue(j)));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withYear(int i) {
        return resolveLocal(this.dateTime.withYear(i));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withMonth(int i) {
        return resolveLocal(this.dateTime.withMonth(i));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withDayOfMonth(int i) {
        return resolveLocal(this.dateTime.withDayOfMonth(i));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withDayOfYear(int i) {
        return resolveLocal(this.dateTime.withDayOfYear(i));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withHour(int i) {
        return resolveLocal(this.dateTime.withHour(i));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withMinute(int i) {
        return resolveLocal(this.dateTime.withMinute(i));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withSecond(int i) {
        return resolveLocal(this.dateTime.withSecond(i));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withNano(int i) {
        return resolveLocal(this.dateTime.withNano(i));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding truncatedTo(EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return resolveLocal(this.dateTime.truncatedTo(eBillAdapter$EBillHolder_ViewBinding));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding.addTo(this);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return (ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) eBillAdapter$EBillHolder_ViewBinding.addTo(this, j);
        }
        if (eBillAdapter$EBillHolder_ViewBinding.isDateBased()) {
            return resolveLocal(this.dateTime.plus(j, eBillAdapter$EBillHolder_ViewBinding));
        }
        return resolveInstant(this.dateTime.plus(j, eBillAdapter$EBillHolder_ViewBinding));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plusYears(long j) {
        return resolveLocal(this.dateTime.plusYears(j));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plusMonths(long j) {
        return resolveLocal(this.dateTime.plusMonths(j));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plusWeeks(long j) {
        return resolveLocal(this.dateTime.plusWeeks(j));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plusDays(long j) {
        return resolveLocal(this.dateTime.plusDays(j));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plusHours(long j) {
        return resolveInstant(this.dateTime.plusHours(j));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plusMinutes(long j) {
        return resolveInstant(this.dateTime.plusMinutes(j));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plusSeconds(long j) {
        return resolveInstant(this.dateTime.plusSeconds(j));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding plusNanos(long j) {
        return resolveInstant(this.dateTime.plusNanos(j));
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minus(DenominatorAmountAdapter$PencilViewHolder_ViewBinding denominatorAmountAdapter$PencilViewHolder_ViewBinding) {
        return (ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) denominatorAmountAdapter$PencilViewHolder_ViewBinding.subtractFrom(this);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minus(long j, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        return j == Long.MIN_VALUE ? plus(Long.MAX_VALUE, eBillAdapter$EBillHolder_ViewBinding).plus(1, eBillAdapter$EBillHolder_ViewBinding) : plus(-j, eBillAdapter$EBillHolder_ViewBinding);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minusYears(long j) {
        return j == Long.MIN_VALUE ? plusYears(Long.MAX_VALUE).plusYears(1) : plusYears(-j);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minusMonths(long j) {
        return j == Long.MIN_VALUE ? plusMonths(Long.MAX_VALUE).plusMonths(1) : plusMonths(-j);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minusWeeks(long j) {
        return j == Long.MIN_VALUE ? plusWeeks(Long.MAX_VALUE).plusWeeks(1) : plusWeeks(-j);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minusDays(long j) {
        return j == Long.MIN_VALUE ? plusDays(Long.MAX_VALUE).plusDays(1) : plusDays(-j);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minusHours(long j) {
        return j == Long.MIN_VALUE ? plusHours(Long.MAX_VALUE).plusHours(1) : plusHours(-j);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minusMinutes(long j) {
        return j == Long.MIN_VALUE ? plusMinutes(Long.MAX_VALUE).plusMinutes(1) : plusMinutes(-j);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minusSeconds(long j) {
        return j == Long.MIN_VALUE ? plusSeconds(Long.MAX_VALUE).plusSeconds(1) : plusSeconds(-j);
    }

    public final ProfileManagementAdapter$ProfileManagementHolder_ViewBinding minusNanos(long j) {
        return j == Long.MIN_VALUE ? plusNanos(Long.MAX_VALUE).plusNanos(1) : plusNanos(-j);
    }

    public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
        if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.localDate()) {
            return toLocalDate();
        }
        return super.query(eBillAdapter$EBillHolder);
    }

    public final long until(DenominatorAmountAdapter$BubbleViewDisableHolder denominatorAmountAdapter$BubbleViewDisableHolder, EBillAdapter$EBillHolder_ViewBinding eBillAdapter$EBillHolder_ViewBinding) {
        ProfileManagementAdapter$ProfileManagementHolder_ViewBinding from = from(denominatorAmountAdapter$BubbleViewDisableHolder);
        if (!(eBillAdapter$EBillHolder_ViewBinding instanceof BillerAdapter$ItemViewHolder_ViewBinding)) {
            return eBillAdapter$EBillHolder_ViewBinding.between(this, from);
        }
        ProfileManagementAdapter$ProfileManagementHolder_ViewBinding withZoneSameInstant = from.withZoneSameInstant(this.zone);
        if (eBillAdapter$EBillHolder_ViewBinding.isDateBased()) {
            return this.dateTime.until(withZoneSameInstant.dateTime, eBillAdapter$EBillHolder_ViewBinding);
        }
        return toOffsetDateTime().until(withZoneSameInstant.toOffsetDateTime(), eBillAdapter$EBillHolder_ViewBinding);
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

    public final OffsetDateTime toOffsetDateTime() {
        return OffsetDateTime.m3130of(this.dateTime, this.offset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileManagementAdapter$ProfileManagementHolder_ViewBinding)) {
            return false;
        }
        ProfileManagementAdapter$ProfileManagementHolder_ViewBinding profileManagementAdapter$ProfileManagementHolder_ViewBinding = (ProfileManagementAdapter$ProfileManagementHolder_ViewBinding) obj;
        if (!this.dateTime.equals(profileManagementAdapter$ProfileManagementHolder_ViewBinding.dateTime) || !this.offset.equals(profileManagementAdapter$ProfileManagementHolder_ViewBinding.offset) || !this.zone.equals(profileManagementAdapter$ProfileManagementHolder_ViewBinding.zone)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.dateTime.hashCode() ^ this.offset.hashCode()) ^ Integer.rotateLeft(this.zone.hashCode(), 3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.dateTime.toString());
        sb.append(this.offset.toString());
        String obj = sb.toString();
        if (this.offset == this.zone) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append('[');
        sb2.append(this.zone.toString());
        sb2.append(']');
        return sb2.toString();
    }

    public final String format(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) {
        return super.format(gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder);
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 6, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        this.dateTime.writeExternal(dataOutput);
        this.offset.writeExternal(dataOutput);
        this.zone.write(dataOutput);
    }

    static ProfileManagementAdapter$ProfileManagementHolder_ViewBinding readExternal(DataInput dataInput) throws IOException {
        return ofLenient(QuickAccountSelectAdapter$UnselectedHolder_ViewBinding.readExternal(dataInput), ManageAccountInboundViewHolder_ViewBinding.readExternal(dataInput), (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) PrepaidTransactionAdapter$ChildViewHolder_ViewBinding.read(dataInput));
    }
}
