package p040o;

/* renamed from: o.FragmentBuilder_BindTransferToPromptPayStep1Fragment */
public abstract class FragmentBuilder_BindTransferToPromptPayStep1Fragment {
    private FragmentBuilder_BindTransferToPromptPayStep1Fragment() {
    }

    public /* synthetic */ FragmentBuilder_BindTransferToPromptPayStep1Fragment(byte b) {
        this();
    }

    /* renamed from: o.FragmentBuilder_BindTransferToPromptPayStep1Fragment$read */
    public static final class read extends FragmentBuilder_BindTransferToPromptPayStep1Fragment {
        final FragmentBuilder_BindVerifyIdentityFragment write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((read) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment = this.write;
            if (fragmentBuilder_BindVerifyIdentityFragment != null) {
                return fragmentBuilder_BindVerifyIdentityFragment.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateLastDesignTimeMode(previousDesignTimeMode=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(FragmentBuilder_BindVerifyIdentityFragment fragmentBuilder_BindVerifyIdentityFragment) {
            super((byte) 0);
            onGetStartedClick.write((Object) fragmentBuilder_BindVerifyIdentityFragment, "previousDesignTimeMode");
            this.write = fragmentBuilder_BindVerifyIdentityFragment;
        }
    }
}
