package com.scb.phone.view.fragment.transferandpay;

import android.text.TextUtils;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributeScbsLandingActivity;
import p040o.ActivityBuilder_ContributeScbsOnboardingConsentActivity;
import p040o.C7126xb23daf18;

public abstract class BaseDuplicatedTransferFragment extends BaseFragment implements C7126xb23daf18 {
    public final void read(String str, String str2, C7126xb23daf18.read read) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext());
        if (TextUtils.isEmpty(str)) {
            str = getString(R.string.common_error);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(str2);
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.proceed), new ActivityBuilder_ContributeScbsOnboardingConsentActivity(read));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeScbsLandingActivity.write).show();
    }
}
