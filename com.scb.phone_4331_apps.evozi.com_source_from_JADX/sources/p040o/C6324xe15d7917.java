package p040o;

import com.scb.phone.view.fragment.transferandpay.FixedTransferSuccessFragment;
import java.lang.ref.WeakReference;
import p040o.CrashlyticsReport;

/* renamed from: o.ActivityBuilder_ContributesHmlLaserIdAboutActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6324xe15d7917 implements HistoryAdapter$GroupFooterViewHolder {
    private final CrashlyticsReport.Session.Event.Application IconCompatParcelizer;
    private final boolean MediaBrowserCompat$CustomActionResultReceiver;
    private final WeakReference<FixedTransferSuccessFragment> MediaBrowserCompat$ItemReceiver;

    public final void read() {
    }

    /* synthetic */ C6324xe15d7917(FixedTransferSuccessFragment fixedTransferSuccessFragment, CrashlyticsReport.Session.Event.Application application, boolean z, byte b) {
        this(fixedTransferSuccessFragment, application, z);
    }

    private C6324xe15d7917(FixedTransferSuccessFragment fixedTransferSuccessFragment, CrashlyticsReport.Session.Event.Application application, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(fixedTransferSuccessFragment);
        this.IconCompatParcelizer = application;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void write() {
        FixedTransferSuccessFragment fixedTransferSuccessFragment = this.MediaBrowserCompat$ItemReceiver.get();
        if (fixedTransferSuccessFragment != null) {
            fixedTransferSuccessFragment.requestPermissions(ActivityBuilder_ContributesHmlLaserIdAboutActivity.MediaBrowserCompat$ItemReceiver, 23);
        }
    }

    public final void IconCompatParcelizer() {
        FixedTransferSuccessFragment fixedTransferSuccessFragment = this.MediaBrowserCompat$ItemReceiver.get();
        if (fixedTransferSuccessFragment != null) {
            fixedTransferSuccessFragment.read(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
