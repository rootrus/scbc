package retrofit2.adapter.rxjava2;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentTransactionsDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import retrofit2.Response;

final class ResultObservable<T> extends DebitCardResetOtpActivity<Result<T>> {
    private final DebitCardResetOtpActivity<Response<T>> upstream;

    ResultObservable(DebitCardResetOtpActivity<Response<T>> debitCardResetOtpActivity) {
        this.upstream = debitCardResetOtpActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Result<T>> bankingAgentTransactionsDeepLinkActivity) {
        this.upstream.subscribe(new ResultObserver(bankingAgentTransactionsDeepLinkActivity));
    }

    static class ResultObserver<R> implements BankingAgentTransactionsDeepLinkActivity<Response<R>> {
        private final BankingAgentTransactionsDeepLinkActivity<? super Result<R>> observer;

        ResultObserver(BankingAgentTransactionsDeepLinkActivity<? super Result<R>> bankingAgentTransactionsDeepLinkActivity) {
            this.observer = bankingAgentTransactionsDeepLinkActivity;
        }

        public void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            this.observer.onSubscribe(bulkTransferDeepLinkActivity);
        }

        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }

        public void onError(Throwable th) {
            try {
                this.observer.onNext(Result.error(th));
                this.observer.onComplete();
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th2));
            }
        }

        public void onComplete() {
            this.observer.onComplete();
        }
    }
}
