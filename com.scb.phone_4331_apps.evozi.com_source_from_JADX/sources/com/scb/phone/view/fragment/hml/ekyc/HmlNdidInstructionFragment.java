package com.scb.phone.view.fragment.hml.ekyc;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.ekyc.C5632x347eebdd;
import com.scb.phone.view.activity.hml.ekyc.HmlNdidNationalIdInputActivity;
import com.scb.phone.view.activity.hml.ekyc.HmlNdidSelectIdpActivity;
import com.scb.phone.view.fragment.ndid.NdidInstructionFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CustomConcurrentHashMap;
import p040o.HmlNationalIdActivity;
import p040o.onGetStartedClick;

public final class HmlNdidInstructionFragment extends NdidInstructionFragment {
    public final String MediaDescriptionCompat() {
        return "your_loan";
    }

    public final int RatingCompat() {
        return R.string.hml_ntb_ekyc_ndid_exit_dialog_text;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final Intent MediaSessionCompat$QueueItem() {
        return new Intent(requireContext(), HmlNdidSelectIdpActivity.class);
    }

    public final Intent MediaBrowserCompat$ItemReceiver(List<String> list) {
        C5632x347eebdd hmlNdidSelectIdpActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNdidSelectIdpActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) list, "remarks");
        Intent putExtra = new Intent(requireContext, HmlNdidSelectIdpActivity.class).putExtra("com.scb.phone.view.activity.ndid.NdidSelectIdpActivity.EXTRA_IS_PENDING", true).putExtra("com.scb.phone.view.activity.ndid.NdidSelectIdpActivity.EXTRA_REMARK", new ArrayList(list));
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNdidS…MARK, ArrayList(remarks))");
        return putExtra;
    }

    public final Intent MediaMetadataCompat() {
        return new Intent(getActivity(), HmlNdidNationalIdInputActivity.class);
    }

    public final void onNextButtonClick() {
        this.presenter.MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.StrongExpirableEvictableEntry.HML);
    }
}
