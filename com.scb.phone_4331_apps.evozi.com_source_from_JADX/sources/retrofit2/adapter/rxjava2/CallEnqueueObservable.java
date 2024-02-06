package retrofit2.adapter.rxjava2;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentTransactionsDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

final class CallEnqueueObservable<T> extends DebitCardResetOtpActivity<Response<T>> {
    private final Call<T> originalCall;

    CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Response<T>> bankingAgentTransactionsDeepLinkActivity) {
        Call<T> clone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(clone, bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(callCallback);
        if (!callCallback.isDisposed()) {
            clone.enqueue(callCallback);
        }
    }

    static final class CallCallback<T> implements BulkTransferDeepLinkActivity, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final BankingAgentTransactionsDeepLinkActivity<? super Response<T>> observer;
        boolean terminated = false;

        CallCallback(Call<?> call2, BankingAgentTransactionsDeepLinkActivity<? super Response<T>> bankingAgentTransactionsDeepLinkActivity) {
            this.call = call2;
            this.observer = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onResponse(Call<T> call2, Response<T> response) {
            if (!this.disposed) {
                try {
                    this.observer.onNext(response);
                    if (!this.disposed) {
                        this.terminated = true;
                        this.observer.onComplete();
                    }
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th));
                }
            }
        }

        public final void onFailure(Call<T> call2, Throwable th) {
            if (!call2.isCanceled()) {
                try {
                    this.observer.onError(th);
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    AlertController$RecycleListView.read.read((Throwable) new CompositeException(th, th2));
                }
            }
        }

        public final void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        public final boolean isDisposed() {
            return this.disposed;
        }
    }
}
