package p040o;

/* renamed from: o.NdidIdpShareSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class C6963xa3443844 extends IdpShareInformationActivity<NdidIdpShareSuccessActivity> {
    public NdidIdpShareSuccessActivity IconCompatParcelizer;
    private NdidIdpShareSuccessActivity read;

    public final /* synthetic */ void read(Object obj, Object obj2) {
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj;
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "affected");
        boolean z = obj2 == null;
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2 = z ? this.read : this.IconCompatParcelizer;
        if (ndidIdpShareSuccessActivity2 != null && NdidIdpShareSuccessActivity.MediaBrowserCompat$ItemReceiver.compareAndSet(ndidIdpShareSuccessActivity, this, ndidIdpShareSuccessActivity2) && z) {
            NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity3 = this.read;
            NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity4 = this.IconCompatParcelizer;
            if (ndidIdpShareSuccessActivity4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            ndidIdpShareSuccessActivity3.MediaBrowserCompat$ItemReceiver(ndidIdpShareSuccessActivity4);
        }
    }

    public C6963xa3443844(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "newNode");
        this.read = ndidIdpShareSuccessActivity;
    }
}
