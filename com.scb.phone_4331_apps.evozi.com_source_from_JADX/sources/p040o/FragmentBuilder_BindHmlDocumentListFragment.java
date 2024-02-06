package p040o;

import android.view.View;

/* renamed from: o.FragmentBuilder_BindHmlDocumentListFragment */
public abstract class FragmentBuilder_BindHmlDocumentListFragment implements FragmentBuilder_BindHmlDocumentReviewTutorialFragment {
    FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment write;

    FragmentBuilder_BindHmlDocumentListFragment(FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment) {
        this.write = fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, View view) {
        FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment = this.write;
        if (fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment != null) {
            fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment.read(str, view);
        }
    }

    /* access modifiers changed from: protected */
    public final void read(String str, View view) {
        FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment = this.write;
        if (fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment != null) {
            fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment.MediaBrowserCompat$ItemReceiver(str, view);
        }
    }
}
