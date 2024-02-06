package p040o;

/* renamed from: o.FragmentBuilder_BindThirdPartyConsentFragment */
public abstract class FragmentBuilder_BindThirdPartyConsentFragment {

    /* renamed from: o.FragmentBuilder_BindThirdPartyConsentFragment$read */
    public static final class read extends FragmentBuilder_BindThirdPartyConsentFragment {
        final boolean MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && this.MediaBrowserCompat$CustomActionResultReceiver == ((read) obj).MediaBrowserCompat$CustomActionResultReceiver;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateProcessPopOverChangeTab(processPopOverChangeTab=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    private FragmentBuilder_BindThirdPartyConsentFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindThirdPartyConsentFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindThirdPartyConsentFragment$write */
    public static final class write extends FragmentBuilder_BindThirdPartyConsentFragment {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        private write() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindThirdPartyConsentFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindThirdPartyConsentFragment {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        private IconCompatParcelizer() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindThirdPartyConsentFragment$RatingCompat */
    public static final class RatingCompat extends FragmentBuilder_BindThirdPartyConsentFragment {
        final BaseAmortizationActivity write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((RatingCompat) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            BaseAmortizationActivity baseAmortizationActivity = this.write;
            if (baseAmortizationActivity != null) {
                return baseAmortizationActivity.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateSelectedTab(selectedTab=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RatingCompat(BaseAmortizationActivity baseAmortizationActivity) {
            super((byte) 0);
            onGetStartedClick.write((Object) baseAmortizationActivity, "selectedTab");
            this.write = baseAmortizationActivity;
        }
    }
}
