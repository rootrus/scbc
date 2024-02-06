package p040o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onClickInitStateLayout */
public final class onClickInitStateLayout<T, R> extends NtbUserInfoActivity<T, R> {
    private Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> MediaBrowserCompat$ItemReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<?>[] read;
    final DirectDebitDeepLinkActivity<? super Object[], R> write;

    public onClickInitStateLayout(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<?>[] debitCardResetPinSuccessActivity_ViewBindingArr, DirectDebitDeepLinkActivity<? super Object[], R> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = debitCardResetPinSuccessActivity_ViewBindingArr;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.write = directDebitDeepLinkActivity;
    }

    public onClickInitStateLayout(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Iterable<? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> iterable, DirectDebitDeepLinkActivity<? super Object[], R> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = null;
        this.MediaBrowserCompat$ItemReceiver = iterable;
        this.write = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        int i;
        DebitCardResetPinSuccessActivity_ViewBinding<?>[] debitCardResetPinSuccessActivity_ViewBindingArr = this.read;
        if (debitCardResetPinSuccessActivity_ViewBindingArr == null) {
            debitCardResetPinSuccessActivity_ViewBindingArr = new DebitCardResetPinSuccessActivity_ViewBinding[8];
            try {
                i = 0;
                for (DebitCardResetPinSuccessActivity_ViewBinding<?> debitCardResetPinSuccessActivity_ViewBinding : this.MediaBrowserCompat$ItemReceiver) {
                    if (i == debitCardResetPinSuccessActivity_ViewBindingArr.length) {
                        debitCardResetPinSuccessActivity_ViewBindingArr = (DebitCardResetPinSuccessActivity_ViewBinding[]) Arrays.copyOf(debitCardResetPinSuccessActivity_ViewBindingArr, (i >> 1) + i);
                    }
                    debitCardResetPinSuccessActivity_ViewBindingArr[i] = debitCardResetPinSuccessActivity_ViewBinding;
                    i++;
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                return;
            }
        } else {
            i = debitCardResetPinSuccessActivity_ViewBindingArr.length;
        }
        if (i == 0) {
            new EasycashBaseIntroductionActivity_ViewBinding(this.IconCompatParcelizer, new read()).subscribeActual(bankingAgentTransactionsDeepLinkActivity);
            return;
        }
        onClickInitStateLayout$MediaBrowserCompat$ItemReceiver onclickinitstatelayout_mediabrowsercompat_itemreceiver = new onClickInitStateLayout$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, this.write, i);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(onclickinitstatelayout_mediabrowsercompat_itemreceiver);
        IconCompatParcelizer[] iconCompatParcelizerArr = onclickinitstatelayout_mediabrowsercompat_itemreceiver.write;
        AtomicReference<BulkTransferDeepLinkActivity> atomicReference = onclickinitstatelayout_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        for (int i2 = 0; i2 < i && !HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(atomicReference.get()) && !onclickinitstatelayout_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver; i2++) {
            debitCardResetPinSuccessActivity_ViewBindingArr[i2].subscribe(iconCompatParcelizerArr[i2]);
        }
        this.IconCompatParcelizer.subscribe(onclickinitstatelayout_mediabrowsercompat_itemreceiver);
    }

    /* renamed from: o.onClickInitStateLayout$IconCompatParcelizer */
    static final class IconCompatParcelizer extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<Object> {
        private boolean IconCompatParcelizer;
        private int MediaBrowserCompat$ItemReceiver;
        private onClickInitStateLayout$MediaBrowserCompat$ItemReceiver<?, ?> read;

        IconCompatParcelizer(onClickInitStateLayout$MediaBrowserCompat$ItemReceiver<?, ?> onclickinitstatelayout_mediabrowsercompat_itemreceiver, int i) {
            this.read = onclickinitstatelayout_mediabrowsercompat_itemreceiver;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void onNext(Object obj) {
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
            }
            onClickInitStateLayout$MediaBrowserCompat$ItemReceiver<?, ?> onclickinitstatelayout_mediabrowsercompat_itemreceiver = this.read;
            onclickinitstatelayout_mediabrowsercompat_itemreceiver.MediaDescriptionCompat.set(this.MediaBrowserCompat$ItemReceiver, obj);
        }

        public final void onError(Throwable th) {
            onClickInitStateLayout$MediaBrowserCompat$ItemReceiver<?, ?> onclickinitstatelayout_mediabrowsercompat_itemreceiver = this.read;
            int i = this.MediaBrowserCompat$ItemReceiver;
            onclickinitstatelayout_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = true;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(onclickinitstatelayout_mediabrowsercompat_itemreceiver.IconCompatParcelizer);
            IconCompatParcelizer[] iconCompatParcelizerArr = onclickinitstatelayout_mediabrowsercompat_itemreceiver.write;
            for (int i2 = 0; i2 < iconCompatParcelizerArr.length; i2++) {
                if (i2 != i) {
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizerArr[i2]);
                }
            }
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) onclickinitstatelayout_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, th, (AtomicInteger) onclickinitstatelayout_mediabrowsercompat_itemreceiver, onclickinitstatelayout_mediabrowsercompat_itemreceiver.read);
        }

        public final void onComplete() {
            onClickInitStateLayout$MediaBrowserCompat$ItemReceiver<?, ?> onclickinitstatelayout_mediabrowsercompat_itemreceiver = this.read;
            int i = this.MediaBrowserCompat$ItemReceiver;
            if (!this.IconCompatParcelizer) {
                onclickinitstatelayout_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = true;
                IconCompatParcelizer[] iconCompatParcelizerArr = onclickinitstatelayout_mediabrowsercompat_itemreceiver.write;
                for (int i2 = 0; i2 < iconCompatParcelizerArr.length; i2++) {
                    if (i2 != i) {
                        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizerArr[i2]);
                    }
                }
                BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = onclickinitstatelayout_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = onclickinitstatelayout_mediabrowsercompat_itemreceiver.read;
                if (onclickinitstatelayout_mediabrowsercompat_itemreceiver.getAndIncrement() == 0) {
                    Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                    if (read2 != null) {
                        bankingAgentTransactionsDeepLinkActivity.onError(read2);
                    } else {
                        bankingAgentTransactionsDeepLinkActivity.onComplete();
                    }
                }
            }
        }
    }

    /* renamed from: o.onClickInitStateLayout$read */
    final class read implements DirectDebitDeepLinkActivity<T, R> {
        read() {
        }

        public final R write(T t) throws Exception {
            return HmlLatestPersonalInformationDeepLinkActivity.write(onClickInitStateLayout.this.write.write(new Object[]{t}), "The combiner returned a null value");
        }
    }
}
