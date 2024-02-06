package p040o;

import com.scb.phone.view.fragment.investment.scbs.ScbsLandingFragment;
import p040o.TabParser$TabParserException;
import p040o.addLicenseFoundEventListener;

/* renamed from: o.ActivityBuilder_BindRtpEBillSubscriptionDetailActivity */
public final /* synthetic */ class ActivityBuilder_BindRtpEBillSubscriptionDetailActivity implements TabParser$TabParserException.read {
    private final /* synthetic */ ScbsLandingFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindRtpEBillSubscriptionDetailActivity(ScbsLandingFragment scbsLandingFragment) {
        this.MediaBrowserCompat$ItemReceiver = scbsLandingFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        NativeSessionFile nativeSessionFile = (NativeSessionFile) obj;
        addLicenseFoundEventListener addlicensefoundeventlistener = this.MediaBrowserCompat$ItemReceiver.scbsLandingPresenter;
        addlicensefoundeventlistener.read = nativeSessionFile;
        if (addlicensefoundeventlistener.RatingCompat != null) {
            addlicensefoundeventlistener.RatingCompat.AlertController$RecycleListView();
        }
        addlicensefoundeventlistener.write.read(new EmptyImmutableSortedSet(nativeSessionFile.MediaBrowserCompat$CustomActionResultReceiver, nativeSessionFile.IconCompatParcelizer, nativeSessionFile.MediaBrowserCompat$ItemReceiver));
        addlicensefoundeventlistener.write.IconCompatParcelizer(new addLicenseFoundEventListener.IconCompatParcelizer(addlicensefoundeventlistener, (byte) 0));
    }
}
