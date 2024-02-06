package p040o;

import java.util.Map;
import java.util.Objects;

/* renamed from: o.FragmentBuilder_BindHmlNTBSummaryFragment */
public final class FragmentBuilder_BindHmlNTBSummaryFragment {
    public final FragmentBuilder_BindHmlNTBSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    public final Map<String, String> write;

    private FragmentBuilder_BindHmlNTBSummaryFragment(FragmentBuilder_BindHmlNTBSuccessFragment fragmentBuilder_BindHmlNTBSuccessFragment, Map<String, String> map) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlNTBSuccessFragment;
        this.write = map;
    }

    public /* synthetic */ FragmentBuilder_BindHmlNTBSummaryFragment(FragmentBuilder_BindHmlNTBSuccessFragment fragmentBuilder_BindHmlNTBSuccessFragment, Map map, byte b) {
        this(fragmentBuilder_BindHmlNTBSuccessFragment, map);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n            OneInteraction(\n                path='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("',\n                properties='");
        sb.append(this.write);
        sb.append("'\n            )\n        ");
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(sb.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FragmentBuilder_BindHmlNTBSummaryFragment) {
            FragmentBuilder_BindHmlNTBSummaryFragment fragmentBuilder_BindHmlNTBSummaryFragment = (FragmentBuilder_BindHmlNTBSummaryFragment) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fragmentBuilder_BindHmlNTBSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fragmentBuilder_BindHmlNTBSummaryFragment.write);
        }
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.MediaBrowserCompat$CustomActionResultReceiver, this.write});
    }
}
