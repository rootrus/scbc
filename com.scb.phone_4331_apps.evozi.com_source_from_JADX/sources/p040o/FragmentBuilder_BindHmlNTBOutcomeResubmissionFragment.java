package p040o;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment */
public final class FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment {
    public static FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment MediaBrowserCompat$ItemReceiver;
    public List<C6556x769516c8> read = new ArrayList();
    public WeakReference<Activity> write;

    public final C6556x769516c8 MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) {
        C6556x769516c8 fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6556x769516c8(fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
        fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver.read = this;
        WeakReference<Activity> weakReference = this.write;
        if (!(weakReference == null || weakReference.get() == null)) {
            fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write.get());
        }
        this.read.add(fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver);
        return fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }
}
