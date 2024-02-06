package p040o;

/* renamed from: o.RemittanceRetryDeepLinkActivity */
public final class RemittanceRetryDeepLinkActivity<T> extends DebitCardCoachMarkActivity {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> IconCompatParcelizer;

    public RemittanceRetryDeepLinkActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.IconCompatParcelizer.subscribe(new write(debitCardRequestInputActivity));
    }

    /* renamed from: o.RemittanceRetryDeepLinkActivity$write */
    static final class write<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
        private DebitCardRequestInputActivity IconCompatParcelizer;

        public final void onNext(T t) {
        }

        write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
            this.IconCompatParcelizer = debitCardRequestInputActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            this.IconCompatParcelizer.onSubscribe(bulkTransferDeepLinkActivity);
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
        }
    }
}
