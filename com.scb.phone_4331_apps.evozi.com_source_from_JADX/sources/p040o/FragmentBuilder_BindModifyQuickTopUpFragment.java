package p040o;

/* renamed from: o.FragmentBuilder_BindModifyQuickTopUpFragment */
public final class FragmentBuilder_BindModifyQuickTopUpFragment {
    private final Integer MediaBrowserCompat$CustomActionResultReceiver;
    private final Integer MediaBrowserCompat$ItemReceiver;
    private final Integer read;
    private final Integer write;

    public FragmentBuilder_BindModifyQuickTopUpFragment() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindModifyQuickTopUpFragment)) {
            return false;
        }
        FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment = (FragmentBuilder_BindModifyQuickTopUpFragment) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindModifyQuickTopUpFragment.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fragmentBuilder_BindModifyQuickTopUpFragment.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindModifyQuickTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fragmentBuilder_BindModifyQuickTopUpFragment.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        Integer num = this.write;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        Integer num2 = this.read;
        int hashCode2 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = num3 != null ? num3.hashCode() : 0;
        Integer num4 = this.MediaBrowserCompat$ItemReceiver;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AppBackGrounded(lastStopped=");
        sb.append(this.write);
        sb.append(", lastPaused=");
        sb.append(this.read);
        sb.append(", lastStarted=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", lastResumed=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private FragmentBuilder_BindModifyQuickTopUpFragment(Integer num, Integer num2, Integer num3, Integer num4) {
        this.write = num;
        this.read = num2;
        this.MediaBrowserCompat$CustomActionResultReceiver = num3;
        this.MediaBrowserCompat$ItemReceiver = num4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentBuilder_BindModifyQuickTopUpFragment(Integer num, Integer num2, Integer num3, Integer num4, int i) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
    }

    public final boolean read() {
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) this.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) this.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static /* synthetic */ FragmentBuilder_BindModifyQuickTopUpFragment read(FragmentBuilder_BindModifyQuickTopUpFragment fragmentBuilder_BindModifyQuickTopUpFragment, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        if ((i & 1) != 0) {
            num = fragmentBuilder_BindModifyQuickTopUpFragment.write;
        }
        if ((i & 2) != 0) {
            num2 = fragmentBuilder_BindModifyQuickTopUpFragment.read;
        }
        if ((i & 4) != 0) {
            num3 = fragmentBuilder_BindModifyQuickTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if ((i & 8) != 0) {
            num4 = fragmentBuilder_BindModifyQuickTopUpFragment.MediaBrowserCompat$ItemReceiver;
        }
        return new FragmentBuilder_BindModifyQuickTopUpFragment(num, num2, num3, num4);
    }
}
