package p040o;

import android.os.Looper;

/* renamed from: o.FragmentBuilder_BindEditAddressStatementChannelFragment */
public interface FragmentBuilder_BindEditAddressStatementChannelFragment {
    public static final FragmentBuilder_BindEditAddressStatementChannelFragment IconCompatParcelizer = new FragmentBuilder_BindEditAddressStatementChannelFragment() {
        public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindEasycashReferralSendDfwFragment fragmentBuilder_BindEasycashReferralSendDfwFragment) {
        }
    };
    public static final FragmentBuilder_BindEditAddressStatementChannelFragment read = new FragmentBuilder_BindEditAddressStatementChannelFragment() {
        public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindEasycashReferralSendDfwFragment fragmentBuilder_BindEasycashReferralSendDfwFragment) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Event bus ");
                sb.append(fragmentBuilder_BindEasycashReferralSendDfwFragment);
                sb.append(" accessed from non-main thread ");
                sb.append(Looper.myLooper());
                throw new IllegalStateException(sb.toString());
            }
        }
    };

    void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindEasycashReferralSendDfwFragment fragmentBuilder_BindEasycashReferralSendDfwFragment);
}
