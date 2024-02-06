package p040o;

import java.net.URI;
import java.util.Map;
import kotlin.TypeCastException;

/* renamed from: o.FragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver */
public final class C1192xa602430c {
    public Map<String, String> MediaBrowserCompat$CustomActionResultReceiver;
    public FragmentBuilder_BindHmlNTBSuccessFragment MediaBrowserCompat$ItemReceiver;

    public C1192xa602430c() {
        URI create = URI.create("");
        onGetStartedClick.IconCompatParcelizer((Object) create, "URI.create(\"\")");
        this.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlNTBSuccessFragment(create);
        HmlNTBeKYCLandingActivity_ViewBinding hmlNTBeKYCLandingActivity_ViewBinding = HmlNTBeKYCLandingActivity_ViewBinding.read;
        if (hmlNTBeKYCLandingActivity_ViewBinding != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBeKYCLandingActivity_ViewBinding;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }
}
