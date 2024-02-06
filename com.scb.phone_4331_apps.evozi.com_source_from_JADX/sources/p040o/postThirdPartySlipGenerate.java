package p040o;

import android.content.Context;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.creditcard.SettingTabFragment;
import p040o.setResultDeserializer;

/* renamed from: o.postThirdPartySlipGenerate */
public final /* synthetic */ class postThirdPartySlipGenerate implements BaseFragment.write {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ setResultDeserializer.write MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ postThirdPartySlipGenerate(int i, setResultDeserializer.write write) {
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context) {
        SettingTabFragment.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, context);
    }
}
