package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlBusinessInformationActivity */
public enum HmlBusinessInformationActivity implements DebitCardRequestPayOtpActivity<Object>, BankingAgentTransactionsDeepLinkActivity<Object>, BaseChangePinWithMaxActivity_ViewBinding<Object>, ActivateChequeDeepLinkActivity<Object>, DebitCardRequestInputActivity, SelectProvinceOrDistrictAdapter$ViewHolder, BulkTransferDeepLinkActivity {
    ;

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
    }

    public final void aQ_() {
    }

    public final void dispose() {
    }

    public final boolean isDisposed() {
        return true;
    }

    public final void onComplete() {
    }

    public final void onNext(Object obj) {
    }

    public final void write(long j) {
    }

    private HmlBusinessInformationActivity(String str) {
    }

    public static <T> BankingAgentTransactionsDeepLinkActivity<T> IconCompatParcelizer() {
        return INSTANCE;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        bulkTransferDeepLinkActivity.dispose();
    }

    public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
        selectProvinceOrDistrictAdapter$ViewHolder.aQ_();
    }

    public final void onError(Throwable th) {
        AlertController$RecycleListView.read.read(th);
    }
}
