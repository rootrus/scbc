package p040o;

import java.util.List;

/* renamed from: o.EasycashSalesheetIndexActivity$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C9726x8dfbb5c4<T, R> implements DirectDebitDeepLinkActivity<List<DebitCardResetPinSuccessActivity_ViewBinding<? extends T>>, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private final DirectDebitDeepLinkActivity<? super Object[], ? extends R> write;

    public final /* synthetic */ Object write(Object obj) throws Exception {
        return DebitCardResetOtpActivity.zipIterable((List) obj, this.write, false, DebitCardResetOtpActivity.bufferSize());
    }

    public C9726x8dfbb5c4(DirectDebitDeepLinkActivity<? super Object[], ? extends R> directDebitDeepLinkActivity) {
        this.write = directDebitDeepLinkActivity;
    }
}
