package p040o;

/* renamed from: o.getErrorInfo */
public final class getErrorInfo extends writeUInt64NoTag<IdCaptureModule_RttiExceptionResponseDeserializer_Factory> {
    public final setCheckedItem IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final TabLayout MediaBrowserCompat$ItemReceiver;
    public final ChequeInquiryDeepLinkActivity write;

    /* renamed from: o.getErrorInfo$write */
    public enum write {
        LANDING,
        PERSONAL,
        BUSINESS,
        DOCUMENTS,
        NCB,
        SUBMISSION,
        OUTCOME,
        SETUP,
        SUCCESSFUL;
        
        public static final getErrorInfo$write$MediaBrowserCompat$ItemReceiver Companion = null;

        static {
            Companion = new getErrorInfo$write$MediaBrowserCompat$ItemReceiver((byte) 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getErrorInfo(RegularImmutableBiMap regularImmutableBiMap, TabLayout tabLayout, setCheckedItem setcheckeditem, ChequeInquiryDeepLinkActivity chequeInquiryDeepLinkActivity) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tabLayout, "hmlSetCustomerTypeCase");
        onGetStartedClick.write((Object) setcheckeditem, "hmlGetApplicationStatus");
        onGetStartedClick.write((Object) chequeInquiryDeepLinkActivity, "disposable");
        this.MediaBrowserCompat$ItemReceiver = tabLayout;
        this.IconCompatParcelizer = setcheckeditem;
        this.write = chequeInquiryDeepLinkActivity;
    }

    public final void onDestroy() {
        this.write.dispose();
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getErrorInfo geterrorinfo) {
        if (geterrorinfo.RatingCompat != null) {
            geterrorinfo.RatingCompat.aj_();
        }
    }
}
