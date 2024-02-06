package p040o;

import com.scb.phone.view.custom.common.ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindCreateRecipientGroupActivity */
public final /* synthetic */ class ActivityBuilder_BindCreateRecipientGroupActivity implements ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ HmlNTBPersonalInfoFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindCreateRecipientGroupActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.IconCompatParcelizer = hmlNTBPersonalInfoFragment;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        return this.IconCompatParcelizer.presenter.MediaBrowserCompat$ItemReceiver(str);
    }
}
