package retrofit2.adapter.rxjava2;

import p040o.BulkTransferDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import retrofit2.Call;
import retrofit2.Response;

final class CallExecuteObservable<T> extends DebitCardResetOtpActivity<Response<T>> {
    private final Call<T> originalCall;

    CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void subscribeActual(p040o.BankingAgentTransactionsDeepLinkActivity<? super retrofit2.Response<T>> r6) {
        /*
            r5 = this;
            retrofit2.Call<T> r0 = r5.originalCall
            retrofit2.Call r0 = r0.clone()
            retrofit2.adapter.rxjava2.CallExecuteObservable$CallDisposable r1 = new retrofit2.adapter.rxjava2.CallExecuteObservable$CallDisposable
            r1.<init>(r0)
            r6.onSubscribe(r1)
            boolean r2 = r1.isDisposed()
            if (r2 == 0) goto L_0x0015
            return
        L_0x0015:
            r2 = 1
            r3 = 0
            retrofit2.Response r0 = r0.execute()     // Catch:{ all -> 0x0031 }
            boolean r4 = r1.isDisposed()     // Catch:{ all -> 0x0031 }
            if (r4 != 0) goto L_0x0024
            r6.onNext(r0)     // Catch:{ all -> 0x0031 }
        L_0x0024:
            boolean r0 = r1.isDisposed()     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x0059
            r6.onComplete()     // Catch:{ all -> 0x002e }
            return
        L_0x002e:
            r0 = move-exception
            r4 = r2
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            r4 = r3
        L_0x0033:
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r0)
            if (r4 == 0) goto L_0x003c
            p040o.AlertController$RecycleListView.read.read((java.lang.Throwable) r0)
            return
        L_0x003c:
            boolean r1 = r1.isDisposed()
            if (r1 != 0) goto L_0x0059
            r6.onError(r0)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r6 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r6)
            r1 = 2
            java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
            r1[r3] = r0
            r1[r2] = r6
            io.reactivex.exceptions.CompositeException r6 = new io.reactivex.exceptions.CompositeException
            r6.<init>((java.lang.Throwable[]) r1)
            p040o.AlertController$RecycleListView.read.read((java.lang.Throwable) r6)
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.CallExecuteObservable.subscribeActual(o.BankingAgentTransactionsDeepLinkActivity):void");
    }

    static final class CallDisposable implements BulkTransferDeepLinkActivity {
        private final Call<?> call;
        private volatile boolean disposed;

        CallDisposable(Call<?> call2) {
            this.call = call2;
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
