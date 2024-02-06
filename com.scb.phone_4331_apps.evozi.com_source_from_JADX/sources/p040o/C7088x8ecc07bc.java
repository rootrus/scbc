package p040o;

import p064pl.charmas.android.reactivelocation2.observables.GoogleAPIConnectionSuspendedException;

/* renamed from: o.TransferToMeStep1Adapter$LocalViewHolder$MediaBrowserCompat$ItemReceiver */
public class C7088x8ecc07bc<T> implements DebitCardResetPinSuccessActivity<T, T> {
    private final boolean read;

    public C7088x8ecc07bc(boolean z) {
        this.read = z;
    }

    public final DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$ItemReceiver(DebitCardResetOtpActivity<T> debitCardResetOtpActivity) {
        return this.read ? debitCardResetOtpActivity.retry((CreditCardServiceTabDeepLinkActivity<? super Integer, ? super Throwable>) new write((byte) 0)) : debitCardResetOtpActivity;
    }

    /* renamed from: o.TransferToMeStep1Adapter$LocalViewHolder$MediaBrowserCompat$ItemReceiver$write */
    static class write implements CreditCardServiceTabDeepLinkActivity<Integer, Throwable> {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(Object obj, Object obj2) throws Exception {
            return ((Throwable) obj2) instanceof GoogleAPIConnectionSuspendedException;
        }
    }
}
