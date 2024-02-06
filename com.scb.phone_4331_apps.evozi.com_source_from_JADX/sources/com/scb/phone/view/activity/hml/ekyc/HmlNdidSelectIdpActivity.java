package com.scb.phone.view.activity.hml.ekyc;

import android.os.Bundle;
import com.scb.phone.view.activity.ndid.NdidSelectIdpActivity;
import com.scb.phone.view.fragment.hml.ekyc.C6027xec0f515e;
import com.scb.phone.view.fragment.hml.ekyc.HmlNdidSelectIdpFragment;
import com.scb.phone.view.fragment.hml.ekyc.HmlNdidSelectIdpSuccessFragment;
import com.scb.phone.view.fragment.ndid.NdidSelectIdpFragment;
import com.scb.phone.view.fragment.ndid.NdidSelectIdpSuccessFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.onGetStartedClick;

public final class HmlNdidSelectIdpActivity extends NdidSelectIdpActivity {
    public static final C5632x347eebdd MediaMetadataCompat = new C5632x347eebdd((byte) 0);

    public final /* synthetic */ NdidSelectIdpSuccessFragment write(List list) {
        onGetStartedClick.write((Object) list, "remarks");
        HmlNdidSelectIdpSuccessFragment.IconCompatParcelizer iconCompatParcelizer = HmlNdidSelectIdpSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) list, "remarks");
        HmlNdidSelectIdpSuccessFragment hmlNdidSelectIdpSuccessFragment = new HmlNdidSelectIdpSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("REMARKS", new ArrayList(list));
        hmlNdidSelectIdpSuccessFragment.setArguments(bundle);
        return hmlNdidSelectIdpSuccessFragment;
    }

    public final /* synthetic */ NdidSelectIdpFragment setContentView() {
        C6027xec0f515e hmlNdidSelectIdpFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlNdidSelectIdpFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlNdidSelectIdpFragment();
    }
}
