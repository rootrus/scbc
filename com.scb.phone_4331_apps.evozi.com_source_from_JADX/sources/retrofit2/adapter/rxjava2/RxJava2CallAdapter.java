package retrofit2.adapter.rxjava2;

import java.lang.reflect.Type;
import p040o.BankingAgentDeepLinkActivity;
import retrofit2.CallAdapter;

final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {
    private final boolean isAsync;
    private final boolean isBody;
    private final boolean isCompletable;
    private final boolean isFlowable;
    private final boolean isMaybe;
    private final boolean isResult;
    private final boolean isSingle;
    private final Type responseType;
    private final BankingAgentDeepLinkActivity scheduler;

    RxJava2CallAdapter(Type type, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.responseType = type;
        this.scheduler = bankingAgentDeepLinkActivity;
        this.isAsync = z;
        this.isResult = z2;
        this.isBody = z3;
        this.isFlowable = z4;
        this.isSingle = z5;
        this.isMaybe = z6;
        this.isCompletable = z7;
    }

    public final Type responseType() {
        return this.responseType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object adapt(retrofit2.Call<R> r2) {
        /*
            r1 = this;
            boolean r0 = r1.isAsync
            if (r0 == 0) goto L_0x000a
            retrofit2.adapter.rxjava2.CallEnqueueObservable r0 = new retrofit2.adapter.rxjava2.CallEnqueueObservable
            r0.<init>(r2)
            goto L_0x000f
        L_0x000a:
            retrofit2.adapter.rxjava2.CallExecuteObservable r0 = new retrofit2.adapter.rxjava2.CallExecuteObservable
            r0.<init>(r2)
        L_0x000f:
            boolean r2 = r1.isResult
            if (r2 == 0) goto L_0x001a
            retrofit2.adapter.rxjava2.ResultObservable r2 = new retrofit2.adapter.rxjava2.ResultObservable
            r2.<init>(r0)
        L_0x0018:
            r0 = r2
            goto L_0x0024
        L_0x001a:
            boolean r2 = r1.isBody
            if (r2 == 0) goto L_0x0024
            retrofit2.adapter.rxjava2.BodyObservable r2 = new retrofit2.adapter.rxjava2.BodyObservable
            r2.<init>(r0)
            goto L_0x0018
        L_0x0024:
            o.BankingAgentDeepLinkActivity r2 = r1.scheduler
            if (r2 == 0) goto L_0x002c
            o.DebitCardResetOtpActivity r0 = r0.subscribeOn(r2)
        L_0x002c:
            boolean r2 = r1.isFlowable
            if (r2 == 0) goto L_0x0037
            o.DebitCardCoachMarkActivity_ViewBinding r2 = p040o.DebitCardCoachMarkActivity_ViewBinding.LATEST
            o.DebitCardRequestReviewActivity r2 = r0.toFlowable(r2)
            return r2
        L_0x0037:
            boolean r2 = r1.isSingle
            if (r2 == 0) goto L_0x0040
            o.BScanCNotificationDeepLinkActivity r2 = r0.singleOrError()
            return r2
        L_0x0040:
            boolean r2 = r1.isMaybe
            if (r2 == 0) goto L_0x0049
            o.DebitCardSaleSheetActivity r2 = r0.singleElement()
            return r2
        L_0x0049:
            boolean r2 = r1.isCompletable
            if (r2 == 0) goto L_0x0052
            o.DebitCardCoachMarkActivity r2 = r0.ignoreElements()
            return r2
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.RxJava2CallAdapter.adapt(retrofit2.Call):java.lang.Object");
    }
}
