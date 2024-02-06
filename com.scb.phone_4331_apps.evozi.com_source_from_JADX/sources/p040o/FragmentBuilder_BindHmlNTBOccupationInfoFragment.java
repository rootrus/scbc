package p040o;

import java.util.Objects;

/* renamed from: o.FragmentBuilder_BindHmlNTBOccupationInfoFragment */
public final class FragmentBuilder_BindHmlNTBOccupationInfoFragment {
    public final boolean MediaBrowserCompat$ItemReceiver;

    private FragmentBuilder_BindHmlNTBOccupationInfoFragment(boolean z) {
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public /* synthetic */ FragmentBuilder_BindHmlNTBOccupationInfoFragment(boolean z, byte b) {
        this(z);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FragmentBuilder_BindHmlNTBOccupationInfoFragment) && this.MediaBrowserCompat$ItemReceiver == ((FragmentBuilder_BindHmlNTBOccupationInfoFragment) obj).MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.MediaBrowserCompat$ItemReceiver)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            OneIdentityTransferConfiguration(\n                disableIdentityTransfer='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("'\n            )\n        ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }
}
