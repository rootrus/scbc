package p040o;

@HmlSetNTBPinActivity
/* renamed from: o.TaskExecutors */
public final class TaskExecutors extends IndoorBuilding {
    private final fromDataField IconCompatParcelizer;

    /* renamed from: o.TaskExecutors$zza */
    public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<TaskExecutors> {
        private final HmlReviewDocumentActivity<fromDataField> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
        private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

        private zza(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<fromDataField> hmlReviewDocumentActivity3) {
            this.write = hmlReviewDocumentActivity;
            this.read = hmlReviewDocumentActivity2;
            this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        }

        public static zza write(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<fromDataField> hmlReviewDocumentActivity3) {
            return new zza(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
        }

        public final /* synthetic */ Object get() {
            return new TaskExecutors(this.write.get(), this.read.get(), this.IconCompatParcelizer.get());
        }
    }

    @HmlPinActivity
    public TaskExecutors(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, fromDataField fromdatafield) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.IconCompatParcelizer = fromdatafield;
    }

    public final void MediaBrowserCompat$ItemReceiver(reclaimKey reclaimkey) {
        write(this.IconCompatParcelizer.read(reclaimkey));
    }
}
