package p040o;

import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;

/* renamed from: o.DeepLinkModule_HmlLatestPersonalInformationDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_HmlLatestPersonalInformationDeepLinkActivity implements CustomEditText.write {
    private final /* synthetic */ HmlNTBPersonalInfoFragment write;

    public /* synthetic */ DeepLinkModule_HmlLatestPersonalInformationDeepLinkActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.write = hmlNTBPersonalInfoFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment = this.write;
        hmlNTBPersonalInfoFragment.root.setFocusable(true);
        hmlNTBPersonalInfoFragment.root.setFocusableInTouchMode(true);
        hmlNTBPersonalInfoFragment.root.requestFocus();
    }
}
