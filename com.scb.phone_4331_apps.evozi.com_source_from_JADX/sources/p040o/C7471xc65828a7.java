package p040o;

import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import p040o.BaseLivenessCheckActivity;
import p040o.NdidIdpShareSuccessActivity;

/* renamed from: o.showDialogDeletePinLocation$MediaBrowserCompat$CustomActionResultReceiver */
final class C7471xc65828a7<R, E> extends WalletAdapter$WalletHolder<E> implements MwCurrentUserEwalletActivity {
    private BaseDiscoverFundFilterActivity<Object, HmlNTBPromptPayNotFoundActivity<? super R>, Object> IconCompatParcelizer;
    private OccupationSearchActivity<R> MediaBrowserCompat$CustomActionResultReceiver;
    private int read = 0;

    public C7471xc65828a7(showDialogDeletePinLocation<E> showdialogdeletepinlocation, OccupationSearchActivity<? super R> occupationSearchActivity, BaseDiscoverFundFilterActivity<Object, ? super HmlNTBPromptPayNotFoundActivity<? super R>, ? extends Object> baseDiscoverFundFilterActivity, int i) {
        onGetStartedClick.write((Object) showdialogdeletepinlocation, "channel");
        onGetStartedClick.write((Object) occupationSearchActivity, "select");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        this.MediaBrowserCompat$CustomActionResultReceiver = occupationSearchActivity;
        this.IconCompatParcelizer = baseDiscoverFundFilterActivity;
    }

    public final EkycOtpActivity IconCompatParcelizer() {
        return (EkycOtpActivity) this.MediaBrowserCompat$CustomActionResultReceiver.write((NdidIdpShareSuccessActivity.write) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(E e) {
        BaseDiscoverFundFilterActivity<Object, HmlNTBPromptPayNotFoundActivity<? super R>, Object> baseDiscoverFundFilterActivity = this.IconCompatParcelizer;
        if (this.read == 2) {
            BaseLivenessCheckActivity.write write = BaseLivenessCheckActivity.MediaBrowserCompat$ItemReceiver;
            e = BaseLivenessCheckActivity.MediaBrowserCompat$CustomActionResultReceiver(BaseLivenessCheckActivity.write(e));
        }
        AlertController$RecycleListView.read(baseDiscoverFundFilterActivity, e, this.MediaBrowserCompat$CustomActionResultReceiver.write());
    }

    public final void write(MwShopAddressActivity<?> mwShopAddressActivity) {
        onGetStartedClick.write((Object) mwShopAddressActivity, "closed");
        if (this.MediaBrowserCompat$CustomActionResultReceiver.read()) {
            int i = this.read;
            if (i == 0) {
                OccupationSearchActivity<R> occupationSearchActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                Throwable th = mwShopAddressActivity.read;
                if (th == null) {
                    th = new ClosedReceiveChannelException("Channel was closed");
                }
                occupationSearchActivity.IconCompatParcelizer(th);
            } else if (i != 1) {
                if (i == 2) {
                    BaseDiscoverFundFilterActivity<Object, HmlNTBPromptPayNotFoundActivity<? super R>, Object> baseDiscoverFundFilterActivity = this.IconCompatParcelizer;
                    BaseLivenessCheckActivity.write write = BaseLivenessCheckActivity.MediaBrowserCompat$ItemReceiver;
                    AlertController$RecycleListView.read(baseDiscoverFundFilterActivity, BaseLivenessCheckActivity.MediaBrowserCompat$CustomActionResultReceiver(BaseLivenessCheckActivity.write(new BaseLivenessCheckActivity$MediaBrowserCompat$ItemReceiver(mwShopAddressActivity.read))), this.MediaBrowserCompat$CustomActionResultReceiver.write());
                }
            } else if (mwShopAddressActivity.read == null) {
                AlertController$RecycleListView.read(this.IconCompatParcelizer, null, this.MediaBrowserCompat$CustomActionResultReceiver.write());
            } else {
                OccupationSearchActivity<R> occupationSearchActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                Throwable th2 = mwShopAddressActivity.read;
                if (th2 == null) {
                    th2 = new ClosedReceiveChannelException("Channel was closed");
                }
                occupationSearchActivity2.IconCompatParcelizer(th2);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        aU_();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReceiveSelect@");
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        sb.append('[');
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(",receiveMode=");
        sb.append(this.read);
        sb.append(']');
        return sb.toString();
    }
}
