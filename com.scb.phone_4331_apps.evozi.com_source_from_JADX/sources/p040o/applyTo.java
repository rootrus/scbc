package p040o;

import com.scb.phone.view.activity.ntb.ekyc.NationalIdActivity;
import com.scb.phone.view.custom.common.ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.applyTo */
public final /* synthetic */ class applyTo implements ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ NationalIdActivity IconCompatParcelizer;

    public /* synthetic */ applyTo(NationalIdActivity nationalIdActivity) {
        this.IconCompatParcelizer = nationalIdActivity;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        return this.IconCompatParcelizer.nationalIdPresenter.MediaBrowserCompat$ItemReceiver(str);
    }
}
