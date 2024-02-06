package p040o;

import android.view.View;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;

/* renamed from: o.FragmentBuilder_BindEasycashBusinessAndMaritalInfoFragment */
public final /* synthetic */ class FragmentBuilder_BindEasycashBusinessAndMaritalInfoFragment implements View.OnFocusChangeListener {
    private final /* synthetic */ FragmentBuilder_BindEasycashFeaturesCardInformationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FragmentBuilder_BindEasycashBusinessAndMaritalInfoFragment(FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindEasycashFeaturesCardInformationFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write write;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write write2;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!z && (write2 = fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read) != null) {
            write2.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindEasycashFeaturesCardInformationFragment.MediaBrowserCompat$ItemReceiver);
        } else if (z && fragmentBuilder_BindEasycashFeaturesCardInformationFragment.write && (write = fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read) != null) {
            write.write(fragmentBuilder_BindEasycashFeaturesCardInformationFragment.MediaBrowserCompat$ItemReceiver);
        }
    }
}
