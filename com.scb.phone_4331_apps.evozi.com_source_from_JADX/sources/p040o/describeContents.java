package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.PartnerAuthorizeService;

/* renamed from: o.describeContents */
public final class describeContents implements OPRStatusRewardsLandingActivity_ViewBinding<PartnerAuthorizeService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;

    private describeContents(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static describeContents read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new describeContents(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PartnerAuthorizeService groupDividerEnabled = this.MediaBrowserCompat$CustomActionResultReceiver.setGroupDividerEnabled(this.IconCompatParcelizer.get());
        if (groupDividerEnabled != null) {
            return groupDividerEnabled;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
