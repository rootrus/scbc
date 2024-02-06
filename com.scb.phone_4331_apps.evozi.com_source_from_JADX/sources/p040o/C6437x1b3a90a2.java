package p040o;

import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.connectivity.NetworkOperationCallback;

/* renamed from: o.ECouponCommonActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
public class C6437x1b3a90a2 {
    public String IconCompatParcelizer;
    public BaseRequest MediaBrowserCompat$CustomActionResultReceiver;
    public NetworkOperationCallback MediaBrowserCompat$ItemReceiver;
    final FragmentBuilder_BindHmlOperatingBankFragment read;
    public int write;

    C6437x1b3a90a2() {
        this.read = null;
    }

    public C6437x1b3a90a2(String str, BaseRequest baseRequest, NetworkOperationCallback networkOperationCallback, int i) {
        this(str, baseRequest, networkOperationCallback, i, (FragmentBuilder_BindHmlOperatingBankFragment) null);
    }

    public C6437x1b3a90a2(String str, BaseRequest baseRequest, NetworkOperationCallback networkOperationCallback, int i, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = baseRequest;
        this.MediaBrowserCompat$ItemReceiver = networkOperationCallback;
        this.write = i;
        this.read = fragmentBuilder_BindHmlOperatingBankFragment;
    }
}
