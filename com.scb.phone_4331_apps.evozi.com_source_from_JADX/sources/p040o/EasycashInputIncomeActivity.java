package p040o;

/* renamed from: o.EasycashInputIncomeActivity */
public final class EasycashInputIncomeActivity<T> extends DebitCardResetOtpActivity<T> {
    private InformationPanelAdapter$ItemHolder_ViewBinding<? extends T> IconCompatParcelizer;

    public EasycashInputIncomeActivity(InformationPanelAdapter$ItemHolder_ViewBinding<? extends T> informationPanelAdapter$ItemHolder_ViewBinding) {
        this.IconCompatParcelizer = informationPanelAdapter$ItemHolder_ViewBinding;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.write(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity));
    }

    /* renamed from: o.EasycashInputIncomeActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements DebitCardRequestPayOtpActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super T> read;
        private SelectProvinceOrDistrictAdapter$ViewHolder write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onComplete() {
            this.read.onComplete();
        }

        public final void onError(Throwable th) {
            this.read.onError(th);
        }

        public final void onNext(T t) {
            this.read.onNext(t);
        }

        public final void read(SelectProvinceOrDistrictAdapter$ViewHolder selectProvinceOrDistrictAdapter$ViewHolder) {
            if (setVwCrossConsentSeparator.MediaBrowserCompat$ItemReceiver(this.write, selectProvinceOrDistrictAdapter$ViewHolder)) {
                this.write = selectProvinceOrDistrictAdapter$ViewHolder;
                this.read.onSubscribe(this);
                selectProvinceOrDistrictAdapter$ViewHolder.write(Long.MAX_VALUE);
            }
        }

        public final void dispose() {
            this.write.aQ_();
            this.write = setVwCrossConsentSeparator.CANCELLED;
        }

        public final boolean isDisposed() {
            return this.write == setVwCrossConsentSeparator.CANCELLED;
        }
    }
}
