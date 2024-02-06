package p040o;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindHmlDocumentKofaxTutorialFragment */
public final class FragmentBuilder_BindHmlDocumentKofaxTutorialFragment extends FragmentBuilder_BindHmlNTBDocumentSubmissionFragment {
    FragmentBuilder_BindHmlDocumentKofaxTutorialFragment(Activity activity, FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment) {
        super(activity, fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        List<View> MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver.size(); i++) {
            if (MediaBrowserCompat$ItemReceiver.get(i).getVisibility() != 0) {
                final View view = MediaBrowserCompat$ItemReceiver.get(i);
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        if (view.getVisibility() == 0) {
                            FragmentBuilder_BindHmlDocumentKofaxTutorialFragment fragmentBuilder_BindHmlDocumentKofaxTutorialFragment = FragmentBuilder_BindHmlDocumentKofaxTutorialFragment.this;
                            String MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view);
                            View view = view;
                            FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment = fragmentBuilder_BindHmlDocumentKofaxTutorialFragment.write;
                            if (fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment != null) {
                                fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment.read(MediaBrowserCompat$CustomActionResultReceiver2, view);
                            }
                        }
                    }
                });
            }
        }
        super.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
