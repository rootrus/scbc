package com.scb.phone.view.fragment.ntb.touchpoint;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.forgotpin.PinLockActivity;
import com.scb.phone.view.activity.ntb.NtbOpenAccountLandingActivity;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity;
import com.scb.phone.view.activity.ntb.fatca.FatcaErrorActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointFatcaActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointSelectAccountActivity;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.registration.C6141xb267e810;
import com.scb.phone.view.fragment.registration.RegistrationFacialRecognitionLandingActivity;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import kotlin.TypeCastException;
import p040o.C10839getFilename;
import p040o.C4235dD;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindCreditCardTabFragment;
import p040o.FragmentBuilder_BindETBProductDetailFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.MerchantService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceBuffer;
import p040o.access$208;
import p040o.binaryImagesJsonFromMapsFile;
import p040o.constrainedAsMapEntries;
import p040o.constrainedAsMapEntry;
import p040o.dD$MediaBrowserCompat$ItemReceiver;
import p040o.findSubsetIndex;
import p040o.fromDataField;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;
import p040o.setFilename;
import p040o.setTapText;

public final class TouchPointPinFragment extends BaseFragment implements MerchantService, fromDataField.read {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    @BindView
    public CustomKeypad customKeypad;
    @BindView
    public CustomPinInput customPinInput;
    @BindView
    public ImageView pinAvatar;
    @BindView
    public TextView pinTouchPointName;
    @HmlPinActivity
    public C4235dD presenter;

    public final void IconCompatParcelizer() {
    }

    public final void MediaBrowserCompat$ItemReceiver() {
    }

    /* renamed from: P_ */
    public final void mo13717P_() {
    }

    public final void al_() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90132131494240, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C10839getFilename getfilename;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        CustomPinInput customPinInput2 = this.customPinInput;
        if (customPinInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinInput2.setPinInputListener(this);
        CustomKeypad customKeypad2 = this.customKeypad;
        if (customKeypad2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customKeypad");
        }
        CustomPinInput customPinInput3 = this.customPinInput;
        if (customPinInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customKeypad2.setKeypadListener(customPinInput3);
        CustomKeypad customKeypad3 = this.customKeypad;
        if (customKeypad3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customKeypad");
        }
        boolean z = true;
        customKeypad3.setEnabledLines(true);
        C4235dD dDVar = this.presenter;
        if (dDVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dDVar.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null && (getfilename = (C10839getFilename) arguments.getParcelable("EXTRA_INFO_DISPLAY")) != null) {
            TextView textView = this.pinTouchPointName;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pinTouchPointName");
            }
            textView.setText(getfilename.MediaBrowserCompat$ItemReceiver);
            if (getfilename.write.length() <= 0) {
                z = false;
            }
            if (z) {
                FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(getfilename.write);
                write.MediaBrowserCompat$CustomActionResultReceiver.read(new FragmentBuilder_BindETBProductDetailFragment());
                ImageView imageView = this.pinAvatar;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("pinAvatar");
                }
                write.read(imageView, new TouchPointPinFragment$MediaBrowserCompat$ItemReceiver(this));
                return;
            }
            ImageView imageView2 = this.pinAvatar;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("pinAvatar");
            }
            View view2 = imageView2;
            onGetStartedClick.write((Object) view2, "$this$isVisible");
            view2.setVisibility(8);
        }
    }

    public final void onDestroy() {
        C4235dD dDVar = this.presenter;
        if (dDVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dDVar.onDestroy();
        super.onDestroy();
    }

    public final void RatingCompat() {
        setPrimaryBackground();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void write() {
        NtbOpenAccountLandingActivity.write(getContext());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        C10839getFilename getfilename;
        onGetStartedClick.write((Object) str, "pin");
        Bundle arguments = getArguments();
        if (arguments != null && (getfilename = (C10839getFilename) arguments.getParcelable("EXTRA_INFO_DISPLAY")) != null) {
            C4235dD dDVar = this.presenter;
            if (dDVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) getfilename, "it");
            onGetStartedClick.write((Object) getfilename, "pinDisplay");
            onGetStartedClick.write((Object) str, "pin");
            if (dDVar.RatingCompat != null) {
                dDVar.RatingCompat.AlertController$RecycleListView();
            }
            dDVar.IconCompatParcelizer = getfilename;
            dDVar.read = str;
            constrainedAsMapEntries constrainedasmapentries = dDVar.write;
            C4235dD dDVar2 = dDVar;
            FundFactSheetActivity iconCompatParcelizer = new C4235dD.IconCompatParcelizer(dDVar2);
            FundFactSheetActivity dd_mediabrowsercompat_itemreceiver = new dD$MediaBrowserCompat$ItemReceiver(dDVar2);
            onGetStartedClick.write((Object) iconCompatParcelizer, "onSuccess");
            onGetStartedClick.write((Object) dd_mediabrowsercompat_itemreceiver, "onError");
            access$208 access_208 = constrainedasmapentries.MediaBrowserCompat$CustomActionResultReceiver;
            DebitCardResetOtpActivity<PlaceBuffer> read2 = access_208.IconCompatParcelizer.read(new findSubsetIndex("NTBBA"));
            onGetStartedClick.IconCompatParcelizer((Object) read2, "iSprintRepositoryContrac…t(TOUCH_POINT_MODULE_ID))");
            access_208.read(read2, new constrainedAsMapEntry(iconCompatParcelizer), new constrainedAsMapEntry(dd_mediabrowsercompat_itemreceiver));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TouchPointFatcaActivity.write write = TouchPointFatcaActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, TouchPointFatcaActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Activity activity2 = activity;
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity2, R.id.view_group_root, str, getoversizeimage);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    public final void read() {
        CustomPinInput customPinInput2 = this.customPinInput;
        if (customPinInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinInput2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void read(setFilename setfilename, boolean z) {
        onGetStartedClick.write((Object) setfilename, "display");
        if (!z) {
            setfilename.write = new FragmentBuilder_BindCreditCardTabFragment();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent MediaBrowserCompat$ItemReceiver = ReviewInfoResultActivity.MediaBrowserCompat$ItemReceiver(activity, setfilename);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                activity.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            activity.finish();
        }
    }

    public final void read(String str, getOversizeImage getoversizeimage) {
        onGetStartedClick.write((Object) getoversizeimage, "snackBarType");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Activity activity2 = activity;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity2, R.id.view_group_root, str, getoversizeimage);
            }
        }
    }

    public final void MediaDescriptionCompat() {
        if (getContext() != null) {
            Intent intent = new Intent(getContext(), FatcaErrorActivity.class);
            intent.putExtra("EXTRA_TITLE", R.string.fatca_error_open_account_title);
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
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        PinLockActivity.write(getContext());
    }

    public final void MediaMetadataCompat() {
        TouchPointSelectAccountActivity.write write = TouchPointSelectAccountActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, TouchPointSelectAccountActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str) {
        CustomPinInput customPinInput2 = this.customPinInput;
        if (customPinInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinInput2.MediaBrowserCompat$CustomActionResultReceiver();
        C6141xb267e810 registrationFacialRecognitionLandingActivity$MediaBrowserCompat$ItemReceiver = RegistrationFacialRecognitionLandingActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent IconCompatParcelizer = C6141xb267e810.IconCompatParcelizer(requireContext, binaryImagesJsonFromMapsFile.TOUCH_POINT, str);
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
}
