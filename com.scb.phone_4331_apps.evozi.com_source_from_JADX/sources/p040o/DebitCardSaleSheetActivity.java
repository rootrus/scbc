package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.DebitCardSaleSheetActivity */
public abstract class DebitCardSaleSheetActivity<T> implements BaseChangePinWithMaxActivity<T> {
    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding);

    public final T read() {
        LoanDeepLinkActivity loanDeepLinkActivity = new LoanDeepLinkActivity();
        read(loanDeepLinkActivity);
        return loanDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
    }

    public final void read(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(baseChangePinWithMaxActivity_ViewBinding, "observer is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(baseChangePinWithMaxActivity_ViewBinding, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            MediaBrowserCompat$ItemReceiver(baseChangePinWithMaxActivity_ViewBinding);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
