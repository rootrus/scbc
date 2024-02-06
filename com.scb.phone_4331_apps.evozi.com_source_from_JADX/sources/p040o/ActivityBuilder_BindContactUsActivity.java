package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindContactUsActivity */
public final /* synthetic */ class ActivityBuilder_BindContactUsActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ getPageID$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ HmlNTBPersonalInfoFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CommonInputViewGroup write;

    public /* synthetic */ ActivityBuilder_BindContactUsActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment, getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver, CommonInputViewGroup commonInputViewGroup) {
        this.MediaBrowserCompat$ItemReceiver = hmlNTBPersonalInfoFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = getpageid_mediabrowsercompat_itemreceiver;
        this.write = commonInputViewGroup;
    }

    public final void onFocusChange(View view, boolean z) {
        HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        CommonInputViewGroup commonInputViewGroup = this.write;
        hmlNTBPersonalInfoFragment.presenter.write(getpageid_mediabrowsercompat_itemreceiver, commonInputViewGroup.mEditText.getText().toString(), commonInputViewGroup.MediaBrowserCompat$ItemReceiver, z);
    }
}
