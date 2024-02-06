package p040o;

/* renamed from: o.FragmentBuilder_BindPromptPayTargetSelectFragment */
public final class FragmentBuilder_BindPromptPayTargetSelectFragment {
    final boolean MediaBrowserCompat$CustomActionResultReceiver;
    final boolean write;

    public FragmentBuilder_BindPromptPayTargetSelectFragment() {
        this(false, false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindPromptPayTargetSelectFragment)) {
            return false;
        }
        FragmentBuilder_BindPromptPayTargetSelectFragment fragmentBuilder_BindPromptPayTargetSelectFragment = (FragmentBuilder_BindPromptPayTargetSelectFragment) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == fragmentBuilder_BindPromptPayTargetSelectFragment.MediaBrowserCompat$CustomActionResultReceiver && this.write == fragmentBuilder_BindPromptPayTargetSelectFragment.write;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.write;
        if (!z3) {
            z2 = z3;
        }
        return ((z ? 1 : 0) * true) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InteractionContextState(isInteractionContextLoading=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", isUpdatingOnScreenInteractions=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FragmentBuilder_BindPromptPayTargetSelectFragment(boolean z, boolean z2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.write = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentBuilder_BindPromptPayTargetSelectFragment(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
