package p040o;

/* renamed from: o.FragmentBuilder_BindSensitiveCSentFragment */
public abstract class FragmentBuilder_BindSensitiveCSentFragment {
    private FragmentBuilder_BindSensitiveCSentFragment() {
    }

    public /* synthetic */ FragmentBuilder_BindSensitiveCSentFragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindSensitiveCSentFragment$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends FragmentBuilder_BindSensitiveCSentFragment {
        final String IconCompatParcelizer;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((MediaMetadataCompat) obj).IconCompatParcelizer);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdatePushToken(pushToken=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public MediaMetadataCompat(String str) {
            super((byte) 0);
            this.IconCompatParcelizer = str;
        }
    }

    /* renamed from: o.FragmentBuilder_BindSensitiveCSentFragment$RatingCompat */
    public static final class RatingCompat extends FragmentBuilder_BindSensitiveCSentFragment {
        final String read;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((RatingCompat) obj).read);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.read;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdatePushTokenSuccess(pushToken=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public RatingCompat(String str) {
            super((byte) 0);
            this.read = str;
        }
    }

    /* renamed from: o.FragmentBuilder_BindSensitiveCSentFragment$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat extends FragmentBuilder_BindSensitiveCSentFragment {
        final boolean write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MediaDescriptionCompat) && this.write == ((MediaDescriptionCompat) obj).write;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.write;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateMessagingEnabled(messagingEnabled=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        public MediaDescriptionCompat(boolean z) {
            super((byte) 0);
            this.write = z;
        }
    }

    /* renamed from: o.FragmentBuilder_BindSensitiveCSentFragment$read */
    public static final class read extends FragmentBuilder_BindSensitiveCSentFragment {
        final String read;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((read) obj).read);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.read;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SendPushToken(token=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(String str) {
            super((byte) 0);
            onGetStartedClick.write((Object) str, "token");
            this.read = str;
        }
    }

    /* renamed from: o.FragmentBuilder_BindSensitiveCSentFragment$write */
    public static final class write extends FragmentBuilder_BindSensitiveCSentFragment {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        private write() {
            super((byte) 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindSensitiveCSentFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends FragmentBuilder_BindSensitiveCSentFragment {
        private final FragmentBuilder_BindHmlNtbOutcomeRejectFragment MediaBrowserCompat$ItemReceiver;
        private final FragmentBuilder_BindHmlOperatingBankFragment read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read);
        }

        public final int hashCode() {
            FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null ? fragmentBuilder_BindHmlNtbOutcomeRejectFragment.hashCode() : 0;
            FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.read;
            if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
                i = fragmentBuilder_BindHmlOperatingBankFragment.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SendPushTokenSuccess(siteKey=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", thinstance=");
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindHmlNtbOutcomeRejectFragment, "siteKey");
            onGetStartedClick.write((Object) fragmentBuilder_BindHmlOperatingBankFragment, "thinstance");
            this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
            this.read = fragmentBuilder_BindHmlOperatingBankFragment;
        }
    }
}
