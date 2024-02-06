package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.BScanCNotificationDeepLinkActivity */
public abstract class BScanCNotificationDeepLinkActivity<T> implements BillerDeepLinkActivity<T> {
    /* access modifiers changed from: protected */
    public abstract void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity);

    public static <T> BScanCNotificationDeepLinkActivity<T> MediaBrowserCompat$CustomActionResultReceiver(BondDeepLinkActivity<T> bondDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bondDeepLinkActivity, "source is null");
        return new onPersonalProfileClick(bondDeepLinkActivity);
    }

    public static <T> BScanCNotificationDeepLinkActivity<T> MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        HmlLatestPersonalInformationDeepLinkActivity.write(th, "exception is null");
        Callable read = HmlCalculatorDeepLinkActivity.read(th);
        HmlLatestPersonalInformationDeepLinkActivity.write(read, "errorSupplier is null");
        return new PinLockActivity_ViewBinding(read);
    }

    public static <T> BScanCNotificationDeepLinkActivity<T> MediaBrowserCompat$CustomActionResultReceiver(Callable<? extends T> callable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(callable, "callable is null");
        return new SetupNewPinActivity(callable);
    }

    public static <T> BScanCNotificationDeepLinkActivity<T> read(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardResetPinSuccessActivity_ViewBinding, "observableSource is null");
        return new ETBCheckEligibilityActivity(debitCardResetPinSuccessActivity_ViewBinding, null);
    }

    public static <T> BScanCNotificationDeepLinkActivity<T> read(T t) {
        HmlLatestPersonalInformationDeepLinkActivity.write(t, "item is null");
        return new openTermsAndConditions(t);
    }

    public static <T> BScanCNotificationDeepLinkActivity<T> MediaBrowserCompat$ItemReceiver(BillerDeepLinkActivity<T> billerDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(billerDeepLinkActivity, "source is null");
        if (billerDeepLinkActivity instanceof BScanCNotificationDeepLinkActivity) {
            return (BScanCNotificationDeepLinkActivity) billerDeepLinkActivity;
        }
        return new onShare(billerDeepLinkActivity);
    }

    public static <T1, T2, R> BScanCNotificationDeepLinkActivity<R> IconCompatParcelizer(BillerDeepLinkActivity<? extends T1> billerDeepLinkActivity, BillerDeepLinkActivity<? extends T2> billerDeepLinkActivity2, ChequeManagementDeepLinkActivity<? super T1, ? super T2, ? extends R> chequeManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(billerDeepLinkActivity, "source1 is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(billerDeepLinkActivity2, "source2 is null");
        DirectDebitDeepLinkActivity<Object[], ? extends R> write = HmlCalculatorDeepLinkActivity.write(chequeManagementDeepLinkActivity);
        BillerDeepLinkActivity[] billerDeepLinkActivityArr = {billerDeepLinkActivity, billerDeepLinkActivity2};
        HmlLatestPersonalInformationDeepLinkActivity.write(write, "zipper is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(billerDeepLinkActivityArr, "sources is null");
        return new BaseHmlLandingActivity(billerDeepLinkActivityArr, write);
    }

    public final BulkTransferDeepLinkActivity write(DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onSuccess is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity2, "onError is null");
        MutualFundsDiscoverDeepLinkActivity mutualFundsDiscoverDeepLinkActivity = new MutualFundsDiscoverDeepLinkActivity(debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2);
        IconCompatParcelizer(mutualFundsDiscoverDeepLinkActivity);
        return mutualFundsDiscoverDeepLinkActivity;
    }

    public final void IconCompatParcelizer(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(activateChequeDeepLinkActivity, "observer is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(activateChequeDeepLinkActivity, "The RxJavaPlugins.onSubscribe hook returned a null SingleObserver. Please check the handler provided to RxJavaPlugins.setOnSingleSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            read(activateChequeDeepLinkActivity);
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
