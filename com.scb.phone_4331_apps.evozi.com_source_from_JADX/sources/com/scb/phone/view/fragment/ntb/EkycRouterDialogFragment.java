package com.scb.phone.view.fragment.ntb;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.activity.etb.ETBWelcomeAboardActivity;
import com.scb.phone.view.activity.ntb.NTBActivity;
import com.scb.phone.view.activity.ntb.NtbOpenAccountLandingActivity;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointWifiSettingsActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseDialogFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlAccountDetailActivity;
import p040o.ActivityBuilder_ContributeHmlApplicationOutcomeActivity;
import p040o.ActivityBuilder_ContributeHmlBaseAddressActivity;
import p040o.C4176cd;
import p040o.C4805inject;
import p040o.C7041xd5e892c2;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.access$lambda$0;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getIdType;
import p040o.getOnDeviceIdExtractor;
import p040o.setTapText;

public class EkycRouterDialogFragment extends BaseDialogFragment implements KtaJsonCheck.RatingCompat {
    @HmlPinActivity
    public C4176cd ekycRouterPresenter;
    @HmlPinActivity
    public getIdType iDeviceCompatibilityHelper;

    private static final /* synthetic */ void IconCompatParcelizer(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((EkycRouterDialogFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((EkycRouterDialogFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        getDialog().hide();
        this.ekycRouterPresenter.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("INTRODUCTION_LIST")) {
            C4176cd cdVar = this.ekycRouterPresenter;
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("INTRODUCTION_LIST");
            if (parcelableArrayList != null) {
                cdVar.MediaMetadataCompat = parcelableArrayList;
            }
            getOnDeviceIdExtractor getondeviceidextractor = new getOnDeviceIdExtractor(cdVar);
            if (cdVar.RatingCompat != null) {
                getondeviceidextractor.IconCompatParcelizer(cdVar.RatingCompat);
            }
        } else if (arguments != null && arguments.containsKey("TOUCHPOINT_SHOULD_NAVIGATE_TO_REGISTRATION_METHOD")) {
            C4176cd cdVar2 = this.ekycRouterPresenter;
            cdVar2.MediaDescriptionCompat = arguments.getBoolean("TOUCHPOINT_SHOULD_NAVIGATE_TO_REGISTRATION_METHOD");
            getOnDeviceIdExtractor getondeviceidextractor2 = new getOnDeviceIdExtractor(cdVar2);
            if (cdVar2.RatingCompat != null) {
                getondeviceidextractor2.IconCompatParcelizer(cdVar2.RatingCompat);
            }
        } else if (arguments == null || !arguments.containsKey("NAVIGATE_BACK")) {
            C4176cd cdVar3 = this.ekycRouterPresenter;
            getOnDeviceIdExtractor getondeviceidextractor3 = new getOnDeviceIdExtractor(cdVar3);
            if (cdVar3.RatingCompat != null) {
                getondeviceidextractor3.IconCompatParcelizer(cdVar3.RatingCompat);
            }
        } else {
            C4176cd cdVar4 = this.ekycRouterPresenter;
            C4805inject inject = new C4805inject(cdVar4.read.IconCompatParcelizer());
            if (cdVar4.RatingCompat != null) {
                inject.IconCompatParcelizer(cdVar4.RatingCompat);
            }
        }
        if (Build.VERSION.SDK_INT <= 23 && (window = getDialog().getWindow()) != null) {
            window.requestFeature(1);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Bundle arguments = getArguments();
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = (arguments == null || !arguments.containsKey("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA")) ? null : (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) arguments.getParcelable("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA");
        if (discardoldlogfiles_mediabrowsercompat_itemreceiver != null) {
            if (!arguments.containsKey("INTRODUCTION_LIST") || !arguments.containsKey("com.scb.phone.EXTRA_REGISTRATION_FROM_NTB_USER_INFO")) {
                NtbOpenAccountLandingActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) getActivity(), discardoldlogfiles_mediabrowsercompat_itemreceiver);
            } else {
                NtbOpenAccountLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity(), discardoldlogfiles_mediabrowsercompat_itemreceiver, arguments.getParcelableArrayList("INTRODUCTION_LIST"), arguments.getBoolean("com.scb.phone.EXTRA_REGISTRATION_FROM_NTB_USER_INFO"));
            }
            dismiss();
            return;
        }
        if (this.iDeviceCompatibilityHelper.MediaBrowserCompat$CustomActionResultReceiver()) {
            MediaBrowserCompat$MediaItem();
        } else {
            read();
        }
        dismiss();
    }

    public final void RatingCompat() {
        if (this.iDeviceCompatibilityHelper.MediaBrowserCompat$CustomActionResultReceiver()) {
            MediaBrowserCompat$MediaItem();
        } else {
            read();
        }
        dismiss();
    }

    public final void MediaDescriptionCompat() {
        MediaBrowserCompat$MediaItem();
        dismiss();
    }

    public final void read() {
        Intent intent = new Intent(getContext(), ReviewInfoResultActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("EXTRA_IMAGE_ID", R.drawable.ic_notice);
        intent.putExtra("EXTRA_PAGE_TITLE", getString(R.string.ntb_fillinformation_review_info_result_title_page));
        intent.putExtra("EXTRA_TITLE", getString(R.string.ntb_phone_not_supported_title));
        intent.putExtra("EXTRA_DESCRIPTION", getString(R.string.ntb_phone_not_supported_description));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        IconCompatParcelizer(this, intent);
        dismiss();
    }

    public final void IconCompatParcelizer(boolean z) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.ntb_resume_popup_title).IconCompatParcelizer((int) R.string.ntb_resume_popup_description);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.ntb_resume_popup_start_over), new ActivityBuilder_ContributeHmlApplicationOutcomeActivity(this));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ntb_resume_popup_resume), new ActivityBuilder_ContributeHmlBaseAddressActivity(this, z)).show();
    }

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(access_2200.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(access_2200.IconCompatParcelizer).IconCompatParcelizer(getString(R.string.ok), new ActivityBuilder_ContributeHmlAccountDetailActivity(this)).show();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<access$lambda$0> list) {
        if (getContext() != null) {
            Context context = getContext();
            Intent IconCompatParcelizer = NTBLandingActivity.IconCompatParcelizer(getContext(), list);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, IconCompatParcelizer).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        dismiss();
    }

    public final void MediaMetadataCompat() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA")) {
            Intent MediaBrowserCompat$ItemReceiver = TouchPointWifiSettingsActivity.MediaBrowserCompat$ItemReceiver(requireContext(), C7041xd5e892c2.RESUME_FLOW.name(), arguments);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write() {
        Intent write = NTBLandingActivity.write(getContext(), false);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        ETBWelcomeAboardActivity.IconCompatParcelizer(getContext(), (Boolean) null, (Boolean) null);
    }

    public void onDestroy() {
        this.ekycRouterPresenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$MediaItem() {
        Intent intent = new Intent(getContext(), NTBActivity.class);
        intent.addFlags(268435456);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
