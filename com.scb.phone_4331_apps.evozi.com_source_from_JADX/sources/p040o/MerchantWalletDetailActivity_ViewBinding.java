package p040o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.MerchantWalletDetailActivity_ViewBinding */
public class MerchantWalletDetailActivity_ViewBinding {
    static final AtomicIntegerFieldUpdater read = AtomicIntegerFieldUpdater.newUpdater(MerchantWalletDetailActivity_ViewBinding.class, "_handled");
    public final Throwable IconCompatParcelizer;
    volatile int _handled;

    public MerchantWalletDetailActivity_ViewBinding(Throwable th, boolean z) {
        onGetStartedClick.write((Object) th, "cause");
        this.IconCompatParcelizer = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ MerchantWalletDetailActivity_ViewBinding(Throwable th) {
        this(th, false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        onGetStartedClick.write((Object) this, "$this$classSimpleName");
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append('[');
        sb.append(this.IconCompatParcelizer);
        sb.append(']');
        return sb.toString();
    }
}
