package p040o;

import android.view.View;
import com.scb.phone.view.fragment.bond.BondInputFragment;

/* renamed from: o.acceptTermsAndConditionsVersion */
public final /* synthetic */ class acceptTermsAndConditionsVersion implements View.OnFocusChangeListener {
    private final /* synthetic */ BondInputFragment read;

    public /* synthetic */ acceptTermsAndConditionsVersion(BondInputFragment bondInputFragment) {
        this.read = bondInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        BondInputFragment bondInputFragment = this.read;
        DefaultHeartBeatInfo defaultHeartBeatInfo = bondInputFragment.presenter;
        Boolean valueOf = Boolean.valueOf(z);
        String obj = bondInputFragment.mobileNumberInput.mEditText.getText().toString();
        if (valueOf.booleanValue()) {
            defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = null;
            boolean z2 = false;
            defaultHeartBeatInfo.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = false;
            DataEncoder dataEncoder = new DataEncoder(defaultHeartBeatInfo, obj);
            if (defaultHeartBeatInfo.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                dataEncoder.IconCompatParcelizer(defaultHeartBeatInfo.RatingCompat);
                return;
            }
            return;
        }
        defaultHeartBeatInfo.IconCompatParcelizer(obj);
    }
}
