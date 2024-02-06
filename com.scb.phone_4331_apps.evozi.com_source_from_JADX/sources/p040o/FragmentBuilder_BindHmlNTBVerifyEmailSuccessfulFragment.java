package p040o;

import java.util.Objects;

/* renamed from: o.FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment */
public final class FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment {
    public final boolean IconCompatParcelizer;
    public final Integer read;

    /* renamed from: o.FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment$read */
    public static final class read {
        public boolean read;
        public Integer write;
    }

    private FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment(boolean z, Integer num) {
        this.IconCompatParcelizer = z;
        this.read = num;
    }

    public /* synthetic */ FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment(boolean z, Integer num, byte b) {
        this(z, num);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            MessageConfig(\n                nonAdaptiveSmallIcon='");
        sb.append(this.read);
        sb.append("',\n                enabled='");
        sb.append(this.IconCompatParcelizer);
        sb.append("'\n            )\n        ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment) {
            FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment fragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment = (FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read) && this.IconCompatParcelizer == fragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.IconCompatParcelizer;
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.read, Boolean.valueOf(this.IconCompatParcelizer)});
    }
}
