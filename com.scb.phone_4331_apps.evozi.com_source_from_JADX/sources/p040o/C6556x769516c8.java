package p040o;

import android.app.Activity;

/* renamed from: o.FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment$MediaBrowserCompat$CustomActionResultReceiver */
public class C6556x769516c8 implements FragmentBuilder_BindHmlDocumentUploadGuidelineFragment {
    private boolean IconCompatParcelizer;
    private FragmentBuilder_BindHmlDocumentUploadGuidelineFragment MediaBrowserCompat$CustomActionResultReceiver;
    FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment read;
    private onAccountSummaryClick write;

    /* synthetic */ C6556x769516c8(FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) {
        this(true, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
    }

    private C6556x769516c8(boolean z, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment<?> fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) {
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlDocumentUploadGuidelineFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        this.IconCompatParcelizer = false;
        onAccountSummaryClick onaccountsummaryclick = this.write;
        if (onaccountsummaryclick != null) {
            onaccountsummaryclick.read();
            this.write = null;
        }
        FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment != null) {
            fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.MediaBrowserCompat$ItemReceiver(obj);
        }
        this.read.read.remove(this);
    }

    public final void read() {
        this.IconCompatParcelizer = false;
        onAccountSummaryClick onaccountsummaryclick = this.write;
        if (onaccountsummaryclick != null) {
            onaccountsummaryclick.read();
            this.write = null;
        }
        FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment != null) {
            fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.read();
        }
        this.read.read.remove(this);
    }

    public final void write(int i, String str) {
        this.IconCompatParcelizer = false;
        onAccountSummaryClick onaccountsummaryclick = this.write;
        if (onaccountsummaryclick != null) {
            onaccountsummaryclick.read();
            this.write = null;
        }
        FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindHmlDocumentUploadGuidelineFragment != null) {
            fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(i, str);
        }
        this.read.read.remove(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        if (this.IconCompatParcelizer) {
            onAccountSummaryClick onaccountsummaryclick = this.write;
            if (onaccountsummaryclick == null || !activity.equals(onaccountsummaryclick.MediaBrowserCompat$MediaItem)) {
                onAccountSummaryClick onaccountsummaryclick2 = new onAccountSummaryClick();
                this.write = onaccountsummaryclick2;
                onaccountsummaryclick2.write = true;
                this.write.MediaBrowserCompat$CustomActionResultReceiver(activity);
                this.IconCompatParcelizer = true;
            }
        }
    }
}
