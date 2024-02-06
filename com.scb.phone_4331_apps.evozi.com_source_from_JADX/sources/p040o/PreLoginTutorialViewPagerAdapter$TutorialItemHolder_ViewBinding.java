package p040o;

import java.io.Serializable;

/* renamed from: o.PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding */
public abstract class PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding {
    public abstract LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone();

    public abstract QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant();

    public abstract PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding);

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding systemUTC() {
        return new write(ManageAccountInboundViewHolder_ViewBinding.UTC);
    }

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding systemDefaultZone() {
        return new write(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.systemDefault());
    }

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding system(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        return new write(languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding tickSeconds(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return new IconCompatParcelizer(system(languageSettingAdapter$LanguageSettingHolder_ViewBinding), 1000000000);
    }

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding tickMinutes(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        return new IconCompatParcelizer(system(languageSettingAdapter$LanguageSettingHolder_ViewBinding), 60000000000L);
    }

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding tick(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "baseClock");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$SelectedHolder_ViewBinding, "tickDuration");
        if (!quickAccountSelectAdapter$SelectedHolder_ViewBinding.isNegative()) {
            long nanos = quickAccountSelectAdapter$SelectedHolder_ViewBinding.toNanos();
            if (nanos % 1000000 != 0 && 1000000000 % nanos != 0) {
                throw new IllegalArgumentException("Invalid tick duration");
            } else if (nanos <= 1) {
                return preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding;
            } else {
                return new IconCompatParcelizer(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, nanos);
            }
        } else {
            throw new IllegalArgumentException("Tick duration must not be negative");
        }
    }

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding fixed(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$HeaderHolder_ViewBinding, "fixedInstant");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(languageSettingAdapter$LanguageSettingHolder_ViewBinding, "zone");
        return new read(quickAccountSelectAdapter$HeaderHolder_ViewBinding, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
    }

    public static PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding offset(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, QuickAccountSelectAdapter$SelectedHolder_ViewBinding quickAccountSelectAdapter$SelectedHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, "baseClock");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(quickAccountSelectAdapter$SelectedHolder_ViewBinding, "offsetDuration");
        if (quickAccountSelectAdapter$SelectedHolder_ViewBinding.equals(QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ZERO)) {
            return preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding;
        }
        return new C10420x43dafe3a(preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, quickAccountSelectAdapter$SelectedHolder_ViewBinding);
    }

    protected PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding() {
    }

    public long millis() {
        return instant().toEpochMilli();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: o.PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding$write */
    static final class write extends PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding implements Serializable {
        private static final long serialVersionUID = 6740630888130243051L;
        private final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding zone;

        write(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
            this.zone = languageSettingAdapter$LanguageSettingHolder_ViewBinding;
        }

        public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone() {
            return this.zone;
        }

        public final PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding.equals(this.zone)) {
                return this;
            }
            return new write(languageSettingAdapter$LanguageSettingHolder_ViewBinding);
        }

        public final long millis() {
            return System.currentTimeMillis();
        }

        public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant() {
            return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochMilli(millis());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof write) {
                return this.zone.equals(((write) obj).zone);
            }
            return false;
        }

        public final int hashCode() {
            return this.zone.hashCode() + 1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SystemClock[");
            sb.append(this.zone);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: o.PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding$read */
    static final class read extends PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding implements Serializable {
        private static final long serialVersionUID = 7430389292664866958L;
        private final QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant;
        private final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding zone;

        read(QuickAccountSelectAdapter$HeaderHolder_ViewBinding quickAccountSelectAdapter$HeaderHolder_ViewBinding, LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
            this.instant = quickAccountSelectAdapter$HeaderHolder_ViewBinding;
            this.zone = languageSettingAdapter$LanguageSettingHolder_ViewBinding;
        }

        public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone() {
            return this.zone;
        }

        public final PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding.equals(this.zone)) {
                return this;
            }
            return new read(this.instant, languageSettingAdapter$LanguageSettingHolder_ViewBinding);
        }

        public final long millis() {
            return this.instant.toEpochMilli();
        }

        public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant() {
            return this.instant;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            if (!this.instant.equals(read.instant) || !this.zone.equals(read.zone)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.instant.hashCode() ^ this.zone.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FixedClock[");
            sb.append(this.instant);
            sb.append(",");
            sb.append(this.zone);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: o.PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding$IconCompatParcelizer */
    static final class IconCompatParcelizer extends PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding implements Serializable {
        private static final long serialVersionUID = 6504659149906368850L;
        private final PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding baseClock;
        private final long tickNanos;

        IconCompatParcelizer(PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, long j) {
            this.baseClock = preLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding;
            this.tickNanos = j;
        }

        public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding getZone() {
            return this.baseClock.getZone();
        }

        public final PreLoginTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding) {
            if (languageSettingAdapter$LanguageSettingHolder_ViewBinding.equals(this.baseClock.getZone())) {
                return this;
            }
            return new IconCompatParcelizer(this.baseClock.withZone(languageSettingAdapter$LanguageSettingHolder_ViewBinding), this.tickNanos);
        }

        public final long millis() {
            long millis = this.baseClock.millis();
            return millis - RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(millis, this.tickNanos / 1000000);
        }

        public final QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant() {
            if (this.tickNanos % 1000000 == 0) {
                long millis = this.baseClock.millis();
                return QuickAccountSelectAdapter$HeaderHolder_ViewBinding.ofEpochMilli(millis - RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod(millis, this.tickNanos / 1000000));
            }
            QuickAccountSelectAdapter$HeaderHolder_ViewBinding instant = this.baseClock.instant();
            return instant.minusNanos(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.floorMod((long) instant.getNano(), this.tickNanos));
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            if (!this.baseClock.equals(iconCompatParcelizer.baseClock) || this.tickNanos != iconCompatParcelizer.tickNanos) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode = this.baseClock.hashCode();
            long j = this.tickNanos;
            return hashCode ^ ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TickClock[");
            sb.append(this.baseClock);
            sb.append(",");
            sb.append(QuickAccountSelectAdapter$SelectedHolder_ViewBinding.ofNanos(this.tickNanos));
            sb.append("]");
            return sb.toString();
        }
    }
}
