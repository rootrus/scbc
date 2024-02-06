package p040o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.setVerticalLine */
final class setVerticalLine extends clickManageShopInfo<clickManagePin> {
    private static final AtomicIntegerFieldUpdater read = AtomicIntegerFieldUpdater.newUpdater(setVerticalLine.class, "_invoked");
    private volatile int _invoked = 0;
    private final FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> write;

    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (read.compareAndSet(this, 0, 1)) {
            this.write.invoke(th);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setVerticalLine(clickManagePin clickmanagepin, FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        super(clickmanagepin);
        onGetStartedClick.write((Object) clickmanagepin, "job");
        onGetStartedClick.write((Object) fundFactSheetActivity, "handler");
        this.write = fundFactSheetActivity;
    }

    public final void IconCompatParcelizer(Throwable th) {
        if (read.compareAndSet(this, 0, 1)) {
            this.write.invoke(th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvokeOnCancelling[");
        onGetStartedClick.write((Object) this, "$this$classSimpleName");
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append('@');
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        sb.append(']');
        return sb.toString();
    }
}
