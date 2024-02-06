package p040o;

import java.io.Serializable;

/* renamed from: o.PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C10420x43dafe3a extends PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding implements Serializable {
    private static final long serialVersionUID = 2007484719125426256L;
    private final PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding baseClock;
    private final QuickAccountSelectAdapter$SelectedHolder_ViewBinding offset;

    C10420x43dafe3a(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
        this.baseClock = preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding;
        this.offset = quickAccountSelectAdapter$SelectedHolder_ViewBinding;
    }

    public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone() {
        return this.baseClock.getZone();
    }

    public final PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        if (languageSettingAdapter$LanguageSettingHolder_ViewBinding.equals(this.baseClock.getZone())) {
            return this;
        }
        return new C10420x43dafe3a(this.baseClock.withZone(languageSettingAdapter$LanguageSettingHolder_ViewBinding), this.offset);
    }

    public final long millis() {
        return RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.safeAdd(this.baseClock.millis(), this.offset.toMillis());
    }

    public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant() {
        return this.baseClock.instant().plus((DenominatorAmountAdapter$PencilViewHolder_ViewBinding) this.offset);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10420x43dafe3a)) {
            return false;
        }
        C10420x43dafe3a preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = (C10420x43dafe3a) obj;
        if (!this.baseClock.equals(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.baseClock) || !this.offset.equals(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.offset)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.baseClock.hashCode() ^ this.offset.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OffsetClock[");
        sb.append(this.baseClock);
        sb.append(",");
        sb.append(this.offset);
        sb.append("]");
        return sb.toString();
    }
}
