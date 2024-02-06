package retrofit2.adapter.rxjava2;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentTransactionsDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import retrofit2.Response;

final class BodyObservable<T> extends DebitCardResetOtpActivity<T> {
    private final DebitCardResetOtpActivity<Response<T>> upstream;

    BodyObservable(DebitCardResetOtpActivity<Response<T>> debitCardResetOtpActivity) {
        this.upstream = debitCardResetOtpActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.upstream.subscribe(new BodyObserver(bankingAgentTransactionsDeepLinkActivity));
    }

    static class BodyObserver<R> implements BankingAgentTransactionsDeepLinkActivity<Response<R>> {
        private final BankingAgentTransactionsDeepLinkActivity<? super R> observer;
        private boolean terminated;

        BodyObserver(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
            this.observer = bankingAgentTransactionsDeepLinkActivity;
        }

        public void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            this.observer.onSubscribe(bulkTransferDeepLinkActivity);
        }

        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read((Throwable) new CompositeException(httpException, th));
            }
        }

        public void onComplete() {
            if (!this.terminated) {
                this.observer.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (!this.terminated) {
                this.observer.onError(th);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th);
            AlertController$RecycleListView.read.read((Throwable) assertionError);
        }
    }
}
