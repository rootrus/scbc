package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.tabs.TabLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessHelpActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerGuidelinesActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomURLEditTextWithButtonView;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_BindFundPurchaseLandingActivity;
import p040o.BaseTransientBottomBar$SnackbarBaseLayout;
import p040o.ChequeInquiryDeepLinkActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.NavigationView;
import p040o.PassportCaptureModule_GetOnDeviceExtractionServerFactory;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setCertificateError;
import p040o.setCertificateError$MediaBrowserCompat$MediaItem;
import p040o.setCertificateError$MediaBrowserCompat$SearchResultReceiver;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.zzcz;

public class HmlBusinessURLInfoFragment extends BaseFragment implements PassportCaptureModule_GetOnDeviceExtractionServerFactory {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private Boolean MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public TextView addMoreProductBtn;
    @BindView
    public TextView addMoreStoreBtn;
    @BindView
    public ProgressStateBar breadcrumbs;
    @BindView
    public CommonInputViewGroup businessRegNumEt;
    @BindView
    public CustomURLEditTextWithButtonView businessUrlEt;
    @BindView
    public TextView businessUrlTitle;
    @BindView
    public TextView premiseOnLeaseErrorTv;
    @BindView
    public LinearLayout premiseOnLeaseLayout;
    @BindView
    public Button premiseOnLeaseNoBtn;
    @BindView
    public Button premiseOnLeaseYesBtn;
    @HmlPinActivity
    public setCertificateError presenter;
    @BindView
    public LinearLayout productUrlLayout;
    @BindView
    public LinearLayout productUrlListLayout;
    @BindView
    public LinearLayout rootLinearLayout;
    @BindView
    public LinearLayout storeUrlLayout;
    @BindView
    public LinearLayout storeUrlListLayout;
    @BindView
    public LinearLayout urlInfoStoreHeader;
    @BindView
    public TabLayout urlListTabLayout;

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87812131494008, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        write();
        setCertificateError setcertificateerror = this.presenter;
        if (setcertificateerror == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setcertificateerror.MediaBrowserCompat$ItemReceiver(this);
        setCertificateError setcertificateerror2 = this.presenter;
        if (setcertificateerror2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setcertificateerror2.write = true;
        if (setcertificateerror2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setcertificateerror2.RatingCompat.AlertController$RecycleListView();
        }
        setcertificateerror2.read.IconCompatParcelizer(new setCertificateError.MediaMetadataCompat(setcertificateerror2), new setCertificateError$MediaBrowserCompat$MediaItem(setcertificateerror2), new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), new ChequeInquiryDeepLinkActivity());
        LinearLayout linearLayout = this.rootLinearLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rootLinearLayout");
        }
        linearLayout.setOnClickListener(HmlBusinessURLInfoFragment$MediaSessionCompat$Token.read);
        TabLayout tabLayout = this.urlListTabLayout;
        if (tabLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlListTabLayout");
        }
        tabLayout.addOnTabSelectedListener(new HmlBusinessURLInfoFragment$MediaSessionCompat$QueueItem(this));
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(R.layou…       }\n        })\n    }");
        return inflate;
    }

    public void write() {
        ProgressStateBar progressStateBar = this.breadcrumbs;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbs");
        }
        progressStateBar.setVisibility(8);
    }

    public final void write(String str) {
        CommonInputViewGroup commonInputViewGroup = this.businessRegNumEt;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
        }
        View view = commonInputViewGroup;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
        CommonInputViewGroup commonInputViewGroup2 = this.businessRegNumEt;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
        }
        commonInputViewGroup2.setIconListener(new HmlBusinessURLInfoFragment$MediaBrowserCompat$MediaItem(this));
        if (str != null) {
            CommonInputViewGroup commonInputViewGroup3 = this.businessRegNumEt;
            if (commonInputViewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
            }
            commonInputViewGroup3.setText(str);
        }
        CommonInputViewGroup commonInputViewGroup4 = this.businessRegNumEt;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
        }
        commonInputViewGroup4.write = false;
        commonInputViewGroup4.mEditClearImageButton.setVisibility(8);
        CommonInputViewGroup commonInputViewGroup5 = this.businessRegNumEt;
        if (commonInputViewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
        }
        TextWatcher hmlBusinessURLInfoFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new C6026x572d820c(this);
        commonInputViewGroup5.mEditText.addTextChangedListener(hmlBusinessURLInfoFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        commonInputViewGroup5.MediaBrowserCompat$CustomActionResultReceiver.add(hmlBusinessURLInfoFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        CommonInputViewGroup commonInputViewGroup6 = this.businessRegNumEt;
        if (commonInputViewGroup6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
        }
        commonInputViewGroup6.setFocusListener(new ParcelableVolumeInfo(this));
    }

    static final class ParcelableVolumeInfo implements View.OnFocusChangeListener {
        private /* synthetic */ HmlBusinessURLInfoFragment MediaBrowserCompat$ItemReceiver;

        ParcelableVolumeInfo(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
            this.MediaBrowserCompat$ItemReceiver = hmlBusinessURLInfoFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$ItemReceiver.businessRegNumEt;
                if (commonInputViewGroup == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
                }
                commonInputViewGroup.write = false;
                commonInputViewGroup.mEditClearImageButton.setVisibility(8);
                setCertificateError setcertificateerror = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (setcertificateerror == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                setCertificateError.IconCompatParcelizer iconCompatParcelizer = setCertificateError.IconCompatParcelizer.BUSINESS_REG_NUM;
                CommonInputViewGroup commonInputViewGroup2 = this.MediaBrowserCompat$ItemReceiver.businessRegNumEt;
                if (commonInputViewGroup2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
                }
                setcertificateerror.IconCompatParcelizer(iconCompatParcelizer, commonInputViewGroup2.mEditText.getText().toString().toString());
                return;
            }
            CommonInputViewGroup commonInputViewGroup3 = this.MediaBrowserCompat$ItemReceiver.businessRegNumEt;
            if (commonInputViewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
            }
            String obj = commonInputViewGroup3.mEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj, "businessRegNumEt.text");
            if (obj.length() > 0) {
                CommonInputViewGroup commonInputViewGroup4 = this.MediaBrowserCompat$ItemReceiver.businessRegNumEt;
                if (commonInputViewGroup4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
                }
                commonInputViewGroup4.write = true;
                commonInputViewGroup4.mEditClearImageButton.setVisibility(0);
            }
        }
    }

    public final void read(String str) {
        LinearLayout linearLayout = this.premiseOnLeaseLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseLayout");
        }
        View view = linearLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
        Button button = this.premiseOnLeaseYesBtn;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseYesBtn");
        }
        button.setOnClickListener(new C6025xd3625d54(this));
        Button button2 = this.premiseOnLeaseNoBtn;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseNoBtn");
        }
        button2.setOnClickListener(new MediaDescriptionCompat(this));
        if (str != null) {
            read(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) DiskLruCache.VERSION_1));
        }
    }

    static final class MediaDescriptionCompat implements View.OnClickListener {
        private /* synthetic */ HmlBusinessURLInfoFragment read;

        MediaDescriptionCompat(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
            this.read = hmlBusinessURLInfoFragment;
        }

        public final void onClick(View view) {
            this.read.read(false);
            onGetStartedClick.IconCompatParcelizer((Object) view, "it");
            onGetStartedClick.write((Object) view, "$this$clearInputFocus");
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public final void IconCompatParcelizer(String str) {
        TextView textView = this.businessUrlTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlTitle");
        }
        View view = textView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
        CustomURLEditTextWithButtonView customURLEditTextWithButtonView = this.businessUrlEt;
        if (customURLEditTextWithButtonView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
        }
        View view2 = customURLEditTextWithButtonView;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        view2.setVisibility(0);
        if (str != null) {
            CustomURLEditTextWithButtonView customURLEditTextWithButtonView2 = this.businessUrlEt;
            if (customURLEditTextWithButtonView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
            }
            customURLEditTextWithButtonView2.setUrlEditText(str);
            CustomURLEditTextWithButtonView customURLEditTextWithButtonView3 = this.businessUrlEt;
            if (customURLEditTextWithButtonView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
            }
            customURLEditTextWithButtonView3.setButtonEnabled(true);
        }
        CustomURLEditTextWithButtonView customURLEditTextWithButtonView4 = this.businessUrlEt;
        if (customURLEditTextWithButtonView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
        }
        customURLEditTextWithButtonView4.read(new RatingCompat(this));
        CustomURLEditTextWithButtonView customURLEditTextWithButtonView5 = this.businessUrlEt;
        if (customURLEditTextWithButtonView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
        }
        View.OnClickListener mediaMetadataCompat = new MediaMetadataCompat(this);
        onGetStartedClick.write((Object) mediaMetadataCompat, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Button button = customURLEditTextWithButtonView5.previewBt;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("previewBt");
        }
        button.setOnClickListener(mediaMetadataCompat);
    }

    static final class RatingCompat implements View.OnFocusChangeListener {
        private /* synthetic */ HmlBusinessURLInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

        RatingCompat(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessURLInfoFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            boolean z2 = false;
            if (!z) {
                CustomURLEditTextWithButtonView customURLEditTextWithButtonView = this.MediaBrowserCompat$CustomActionResultReceiver.businessUrlEt;
                if (customURLEditTextWithButtonView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
                }
                customURLEditTextWithButtonView.IconCompatParcelizer(false);
                setCertificateError setcertificateerror = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
                if (setcertificateerror == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                setCertificateError.IconCompatParcelizer iconCompatParcelizer = setCertificateError.IconCompatParcelizer.OFFICIAL_STORE_URL;
                CustomURLEditTextWithButtonView customURLEditTextWithButtonView2 = this.MediaBrowserCompat$CustomActionResultReceiver.businessUrlEt;
                if (customURLEditTextWithButtonView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
                }
                EditText editText = customURLEditTextWithButtonView2.urlEt;
                if (editText == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
                }
                setcertificateerror.IconCompatParcelizer(iconCompatParcelizer, editText.getText().toString());
                return;
            }
            CustomURLEditTextWithButtonView customURLEditTextWithButtonView3 = this.MediaBrowserCompat$CustomActionResultReceiver.businessUrlEt;
            if (customURLEditTextWithButtonView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
            }
            EditText editText2 = customURLEditTextWithButtonView3.urlEt;
            if (editText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
            }
            if (editText2.getText().toString().length() > 0) {
                z2 = true;
            }
            if (z2) {
                CustomURLEditTextWithButtonView customURLEditTextWithButtonView4 = this.MediaBrowserCompat$CustomActionResultReceiver.businessUrlEt;
                if (customURLEditTextWithButtonView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
                }
                customURLEditTextWithButtonView4.IconCompatParcelizer(true);
            }
            CustomURLEditTextWithButtonView customURLEditTextWithButtonView5 = this.MediaBrowserCompat$CustomActionResultReceiver.businessUrlEt;
            if (customURLEditTextWithButtonView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
            }
            customURLEditTextWithButtonView5.write(true);
        }
    }

    static final class MediaMetadataCompat implements View.OnClickListener {
        private /* synthetic */ HmlBusinessURLInfoFragment MediaBrowserCompat$CustomActionResultReceiver;

        MediaMetadataCompat(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessURLInfoFragment;
        }

        public final void onClick(View view) {
            onGetStartedClick.IconCompatParcelizer((Object) view, "it");
            onGetStartedClick.write((Object) view, "$this$clearInputFocus");
            boolean z = true;
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            CustomURLEditTextWithButtonView customURLEditTextWithButtonView = this.MediaBrowserCompat$CustomActionResultReceiver.businessUrlEt;
            if (customURLEditTextWithButtonView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
            }
            EditText editText = customURLEditTextWithButtonView.urlEt;
            if (editText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
            }
            if (editText.getText().toString().length() <= 0) {
                z = false;
            }
            if (z) {
                HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
                Context requireContext = hmlBusinessURLInfoFragment.requireContext();
                onGetStartedClick.IconCompatParcelizer((Object) requireContext, "this.requireContext()");
                CustomURLEditTextWithButtonView customURLEditTextWithButtonView2 = this.MediaBrowserCompat$CustomActionResultReceiver.businessUrlEt;
                if (customURLEditTextWithButtonView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
                }
                EditText editText2 = customURLEditTextWithButtonView2.urlEt;
                if (editText2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
                }
                HmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(hmlBusinessURLInfoFragment, requireContext, editText2.getText().toString());
            }
        }
    }

    public final void IconCompatParcelizer(zzcz.zzf.zzb zzb, List<String> list, List<String> list2) {
        onGetStartedClick.write((Object) zzb, "validationConfig");
        LinearLayout linearLayout = this.urlInfoStoreHeader;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlInfoStoreHeader");
        }
        View view = linearLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
        TabLayout tabLayout = this.urlListTabLayout;
        if (tabLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlListTabLayout");
        }
        View view2 = tabLayout;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        view2.setVisibility(0);
        Collection collection = list2;
        if (!(collection == null || collection.isEmpty()) || list == null || !(!list.isEmpty())) {
            LinearLayout linearLayout2 = this.storeUrlLayout;
            if (linearLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeUrlLayout");
            }
            View view3 = linearLayout2;
            onGetStartedClick.write((Object) view3, "$this$isVisible");
            view3.setVisibility(0);
        } else {
            TabLayout tabLayout2 = this.urlListTabLayout;
            if (tabLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlListTabLayout");
            }
            TabLayout.IconCompatParcelizer IconCompatParcelizer2 = tabLayout2.IconCompatParcelizer(1);
            if (IconCompatParcelizer2 != null) {
                TabLayout tabLayout3 = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver;
                if (tabLayout3 != null) {
                    tabLayout3.write(IconCompatParcelizer2, true);
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            LinearLayout linearLayout3 = this.productUrlLayout;
            if (linearLayout3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productUrlLayout");
            }
            View view4 = linearLayout3;
            onGetStartedClick.write((Object) view4, "$this$isVisible");
            view4.setVisibility(0);
        }
        if (list2 == null) {
            list2 = HmlNationalIdActivity.IconCompatParcelizer;
        }
        LinearLayout linearLayout4 = this.storeUrlListLayout;
        if (linearLayout4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeUrlListLayout");
        }
        read(list2, linearLayout4, zzb.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, setCertificateError.IconCompatParcelizer.MARKETPLACE_STORE_URL);
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        LinearLayout linearLayout5 = this.productUrlListLayout;
        if (linearLayout5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productUrlListLayout");
        }
        read(list, linearLayout5, zzb.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, setCertificateError.IconCompatParcelizer.MARKETPLACE_PRODUCT_URL);
        TextView textView = this.addMoreStoreBtn;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addMoreStoreBtn");
        }
        zzcz.zzh zzh = zzb.MediaBrowserCompat$CustomActionResultReceiver;
        LinearLayout linearLayout6 = this.storeUrlListLayout;
        if (linearLayout6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeUrlListLayout");
        }
        IconCompatParcelizer(textView, zzh, linearLayout6, setCertificateError.IconCompatParcelizer.MARKETPLACE_STORE_URL);
        TextView textView2 = this.addMoreProductBtn;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("addMoreProductBtn");
        }
        zzcz.zzh zzh2 = zzb.MediaBrowserCompat$ItemReceiver;
        LinearLayout linearLayout7 = this.productUrlListLayout;
        if (linearLayout7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productUrlListLayout");
        }
        IconCompatParcelizer(textView2, zzh2, linearLayout7, setCertificateError.IconCompatParcelizer.MARKETPLACE_PRODUCT_URL);
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ HmlBusinessURLInfoFragment IconCompatParcelizer;
        private /* synthetic */ zzcz.zzh MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ TextView MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ LinearLayout read;
        private /* synthetic */ setCertificateError.IconCompatParcelizer write;

        IconCompatParcelizer(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment, LinearLayout linearLayout, zzcz.zzh zzh, setCertificateError.IconCompatParcelizer iconCompatParcelizer, TextView textView) {
            this.IconCompatParcelizer = hmlBusinessURLInfoFragment;
            this.read = linearLayout;
            this.MediaBrowserCompat$CustomActionResultReceiver = zzh;
            this.write = iconCompatParcelizer;
            this.MediaBrowserCompat$ItemReceiver = textView;
        }

        public final void onClick(View view) {
            if (this.read.getChildCount() < this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
                HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment = this.IconCompatParcelizer;
                LinearLayout linearLayout = this.read;
                Context context = linearLayout.getContext();
                onGetStartedClick.IconCompatParcelizer((Object) context, "listLayout.context");
                hmlBusinessURLInfoFragment.read(linearLayout, new CustomURLEditTextWithButtonView(context, (AttributeSet) null, 6, (byte) 0), (String) null, this.write, true);
            }
            if (this.read.getChildCount() == this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver.setVisibility(8);
            }
        }
    }

    private final void IconCompatParcelizer(TextView textView, zzcz.zzh zzh, LinearLayout linearLayout, setCertificateError.IconCompatParcelizer iconCompatParcelizer) {
        textView.setOnClickListener(new IconCompatParcelizer(this, linearLayout, zzh, iconCompatParcelizer, textView));
        if (linearLayout.getChildCount() == zzh.MediaBrowserCompat$ItemReceiver) {
            textView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void read(boolean z) {
        Button button;
        Button button2;
        if (z) {
            button = this.premiseOnLeaseYesBtn;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseYesBtn");
            }
        } else {
            button = this.premiseOnLeaseNoBtn;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseNoBtn");
            }
        }
        if (z) {
            button2 = this.premiseOnLeaseNoBtn;
            if (button2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseNoBtn");
            }
        } else {
            Button button3 = this.premiseOnLeaseYesBtn;
            if (button3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseYesBtn");
            }
            button2 = button3;
        }
        button.setBackground(setLastBaselineToBottomHeight.write(requireContext(), R.drawable.bg_button_fake_white_with_purple_border_rounded));
        button.setTextColor(setLastBaselineToBottomHeight.read(requireContext(), R.color.f67252131099881));
        button2.setBackground(setLastBaselineToBottomHeight.write(requireContext(), R.drawable.shape_gray_rounded_rectangle));
        button2.setTextColor(setLastBaselineToBottomHeight.read(requireContext(), R.color.f66182131099773));
        this.MediaBrowserCompat$CustomActionResultReceiver = Boolean.valueOf(z);
        TextView textView = this.premiseOnLeaseErrorTv;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseErrorTv");
        }
        textView.setVisibility(8);
    }

    private final void read(List<String> list, LinearLayout linearLayout, int i, setCertificateError.IconCompatParcelizer iconCompatParcelizer) {
        int max = Math.max(list.size(), i);
        int i2 = 0;
        while (i2 < max) {
            Context context = linearLayout.getContext();
            onGetStartedClick.IconCompatParcelizer((Object) context, "urlListLayout.context");
            read(linearLayout, new CustomURLEditTextWithButtonView(context, (AttributeSet) null, 6, (byte) 0), (String) HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(list, i2), iconCompatParcelizer, i2 >= i);
            i2++;
        }
    }

    /* access modifiers changed from: private */
    public final void read(LinearLayout linearLayout, CustomURLEditTextWithButtonView customURLEditTextWithButtonView, String str, setCertificateError.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        String str2;
        linearLayout.addView(customURLEditTextWithButtonView);
        int i = ActivityBuilder_BindFundPurchaseLandingActivity.IconCompatParcelizer[iconCompatParcelizer.ordinal()];
        String str3 = "";
        if (i == 1) {
            str2 = getString(R.string.hml_business_url_info_marketplace_title);
        } else if (i != 2) {
            str2 = str3;
        } else {
            str2 = getString(R.string.hml_business_url_info_product_title);
        }
        onGetStartedClick.IconCompatParcelizer((Object) str2, "when (field) {\n         …     else -> \"\"\n        }");
        customURLEditTextWithButtonView.setUrlTitle(str2);
        int i2 = ActivityBuilder_BindFundPurchaseLandingActivity.MediaBrowserCompat$ItemReceiver[iconCompatParcelizer.ordinal()];
        if (i2 == 1) {
            str3 = getString(R.string.hml_business_url_info_marketplace_hint);
        } else if (i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            sb.append(linearLayout.getChildCount());
            str3 = getString(R.string.hml_business_url_info_product_hint, sb.toString());
        }
        onGetStartedClick.IconCompatParcelizer((Object) str3, "when (field) {\n         …e -> \"\"\n                }");
        customURLEditTextWithButtonView.setUrlEditTextHint(str3);
        String string = getString(R.string.hml_business_url_info_preview_btn);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…ess_url_info_preview_btn)");
        customURLEditTextWithButtonView.setButtonText(string);
        String string2 = getString(R.string.hml_business_url_info_url_invalid_error);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.hml_b…l_info_url_invalid_error)");
        customURLEditTextWithButtonView.setErrorMessage(string2);
        if (str != null) {
            customURLEditTextWithButtonView.setUrlEditText(str);
            customURLEditTextWithButtonView.setButtonEnabled(true);
        }
        customURLEditTextWithButtonView.read(new write(this, customURLEditTextWithButtonView, iconCompatParcelizer, linearLayout));
        View.OnClickListener hmlBusinessURLInfoFragment$MediaBrowserCompat$CustomActionResultReceiver = new C6023x903f3a73(this, customURLEditTextWithButtonView);
        onGetStartedClick.write((Object) hmlBusinessURLInfoFragment$MediaBrowserCompat$CustomActionResultReceiver, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Button button = customURLEditTextWithButtonView.previewBt;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("previewBt");
        }
        button.setOnClickListener(hmlBusinessURLInfoFragment$MediaBrowserCompat$CustomActionResultReceiver);
        if (z) {
            View.OnClickListener hmlBusinessURLInfoFragment$MediaBrowserCompat$ItemReceiver = new HmlBusinessURLInfoFragment$MediaBrowserCompat$ItemReceiver(this, linearLayout, customURLEditTextWithButtonView, iconCompatParcelizer);
            onGetStartedClick.write((Object) hmlBusinessURLInfoFragment$MediaBrowserCompat$ItemReceiver, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            ImageView imageView = customURLEditTextWithButtonView.deleteUrlImageView;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("deleteUrlImageView");
            }
            imageView.setOnClickListener(hmlBusinessURLInfoFragment$MediaBrowserCompat$ItemReceiver);
            ImageView imageView2 = customURLEditTextWithButtonView.deleteUrlImageView;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("deleteUrlImageView");
            }
            View view = imageView2;
            onGetStartedClick.write((Object) view, "$this$isVisible");
            view.setVisibility(0);
        }
    }

    static final class write implements View.OnFocusChangeListener {
        private /* synthetic */ LinearLayout MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ CustomURLEditTextWithButtonView MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ HmlBusinessURLInfoFragment read;
        private /* synthetic */ setCertificateError.IconCompatParcelizer write;

        write(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment, CustomURLEditTextWithButtonView customURLEditTextWithButtonView, setCertificateError.IconCompatParcelizer iconCompatParcelizer, LinearLayout linearLayout) {
            this.read = hmlBusinessURLInfoFragment;
            this.MediaBrowserCompat$ItemReceiver = customURLEditTextWithButtonView;
            this.write = iconCompatParcelizer;
            this.MediaBrowserCompat$CustomActionResultReceiver = linearLayout;
        }

        public final void onFocusChange(View view, boolean z) {
            boolean z2 = false;
            if (!z) {
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(false);
                setCertificateError setcertificateerror = this.read.presenter;
                if (setcertificateerror == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                setCertificateError.IconCompatParcelizer iconCompatParcelizer = this.write;
                EditText editText = this.MediaBrowserCompat$ItemReceiver.urlEt;
                if (editText == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
                }
                setcertificateerror.read(iconCompatParcelizer, editText.getText().toString(), this.MediaBrowserCompat$CustomActionResultReceiver.indexOfChild(this.MediaBrowserCompat$ItemReceiver));
                return;
            }
            EditText editText2 = this.MediaBrowserCompat$ItemReceiver.urlEt;
            if (editText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
            }
            if (editText2.getText().toString().length() > 0) {
                z2 = true;
            }
            if (z2) {
                this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(true);
            }
            this.MediaBrowserCompat$ItemReceiver.write(true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        setCertificateError setcertificateerror = this.presenter;
        if (setcertificateerror == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setcertificateerror.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setCertificateError.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "field");
        int i = ActivityBuilder_BindFundPurchaseLandingActivity.MediaBrowserCompat$CustomActionResultReceiver[iconCompatParcelizer.ordinal()];
        if (i != 1) {
            if (i == 2) {
                CustomURLEditTextWithButtonView customURLEditTextWithButtonView = this.businessUrlEt;
                if (customURLEditTextWithButtonView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
                }
                customURLEditTextWithButtonView.write(z);
            } else if (i == 3) {
                TextView textView = this.premiseOnLeaseErrorTv;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseErrorTv");
                }
                textView.setVisibility(z ? 8 : 0);
            }
        } else if (z) {
            CommonInputViewGroup commonInputViewGroup = this.businessRegNumEt;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
            }
            commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver();
        } else {
            CommonInputViewGroup commonInputViewGroup2 = this.businessRegNumEt;
            if (commonInputViewGroup2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
            }
            commonInputViewGroup2.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setCertificateError.IconCompatParcelizer iconCompatParcelizer, Integer num, boolean z) {
        LinearLayout linearLayout;
        onGetStartedClick.write((Object) iconCompatParcelizer, "field");
        int i = ActivityBuilder_BindFundPurchaseLandingActivity.write[iconCompatParcelizer.ordinal()];
        if (i == 1) {
            linearLayout = this.storeUrlListLayout;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeUrlListLayout");
            }
        } else if (i == 2) {
            linearLayout = this.productUrlListLayout;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("productUrlListLayout");
            }
        } else {
            throw new Exception("No layout list found");
        }
        if (num != null) {
            View childAt = linearLayout.getChildAt(num.intValue());
            if (childAt instanceof CustomURLEditTextWithButtonView) {
                ((CustomURLEditTextWithButtonView) childAt).write(z);
            }
        }
    }

    @OnClick
    public final void onNextButtonClick() {
        int i;
        HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity;
        String str;
        String str2;
        ArrayList arrayList;
        boolean z;
        LinearLayout linearLayout = this.storeUrlListLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeUrlListLayout");
        }
        ArrayList<String> IconCompatParcelizer2 = IconCompatParcelizer(linearLayout);
        LinearLayout linearLayout2 = this.productUrlListLayout;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productUrlListLayout");
        }
        ArrayList<String> IconCompatParcelizer3 = IconCompatParcelizer(linearLayout2);
        ArrayList arrayList2 = new ArrayList();
        LinearLayout linearLayout3 = this.premiseOnLeaseLayout;
        if (linearLayout3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseLayout");
        }
        View view = linearLayout3;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        boolean z2 = true;
        if (view.getVisibility() == 0) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                TextView textView = this.premiseOnLeaseErrorTv;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseErrorTv");
                }
                textView.setVisibility(8);
                z = true;
            } else {
                TextView textView2 = this.premiseOnLeaseErrorTv;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("premiseOnLeaseErrorTv");
                }
                textView2.setVisibility(0);
                z = false;
            }
            arrayList2.add(Boolean.valueOf(z));
        }
        CommonInputViewGroup commonInputViewGroup = this.businessRegNumEt;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
        }
        View view2 = commonInputViewGroup;
        onGetStartedClick.write((Object) view2, "$this$isVisible");
        if (view2.getVisibility() == 0) {
            setCertificateError setcertificateerror = this.presenter;
            if (setcertificateerror == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setCertificateError.IconCompatParcelizer iconCompatParcelizer = setCertificateError.IconCompatParcelizer.BUSINESS_REG_NUM;
            CommonInputViewGroup commonInputViewGroup2 = this.businessRegNumEt;
            if (commonInputViewGroup2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
            }
            arrayList2.add(Boolean.valueOf(setcertificateerror.IconCompatParcelizer(iconCompatParcelizer, commonInputViewGroup2.mEditText.getText().toString().toString())));
        }
        CustomURLEditTextWithButtonView customURLEditTextWithButtonView = this.businessUrlEt;
        if (customURLEditTextWithButtonView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
        }
        View view3 = customURLEditTextWithButtonView;
        onGetStartedClick.write((Object) view3, "$this$isVisible");
        if (view3.getVisibility() == 0) {
            setCertificateError setcertificateerror2 = this.presenter;
            if (setcertificateerror2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setCertificateError.IconCompatParcelizer iconCompatParcelizer2 = setCertificateError.IconCompatParcelizer.OFFICIAL_STORE_URL;
            CustomURLEditTextWithButtonView customURLEditTextWithButtonView2 = this.businessUrlEt;
            if (customURLEditTextWithButtonView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
            }
            EditText editText = customURLEditTextWithButtonView2.urlEt;
            if (editText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
            }
            arrayList2.add(Boolean.valueOf(setcertificateerror2.IconCompatParcelizer(iconCompatParcelizer2, editText.getText().toString())));
        }
        LinearLayout linearLayout4 = this.storeUrlLayout;
        if (linearLayout4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("storeUrlLayout");
        }
        View view4 = linearLayout4;
        onGetStartedClick.write((Object) view4, "$this$isVisible");
        if (view4.getVisibility() == 0) {
            setCertificateError setcertificateerror3 = this.presenter;
            if (setcertificateerror3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            arrayList2.add(Boolean.valueOf(setcertificateerror3.IconCompatParcelizer((List<String>) IconCompatParcelizer2, setCertificateError.IconCompatParcelizer.MARKETPLACE_STORE_URL)));
        }
        LinearLayout linearLayout5 = this.productUrlLayout;
        if (linearLayout5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productUrlLayout");
        }
        View view5 = linearLayout5;
        onGetStartedClick.write((Object) view5, "$this$isVisible");
        if (view5.getVisibility() == 0) {
            setCertificateError setcertificateerror4 = this.presenter;
            if (setcertificateerror4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            arrayList2.add(Boolean.valueOf(setcertificateerror4.IconCompatParcelizer((List<String>) IconCompatParcelizer3, setCertificateError.IconCompatParcelizer.MARKETPLACE_PRODUCT_URL)));
        }
        if (arrayList2.contains(Boolean.FALSE)) {
            CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.hml_personal_information_validation_error_header)).MediaBrowserCompat$ItemReceiver(getString(R.string.hml_personal_information_validation_error_message)).IconCompatParcelizer(getString(R.string.ok), C9294x82ab93d5.MediaBrowserCompat$ItemReceiver).show();
            return;
        }
        TabLayout tabLayout = this.urlListTabLayout;
        if (tabLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlListTabLayout");
        }
        TabLayout.IconCompatParcelizer iconCompatParcelizer3 = tabLayout.MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizer3 != null) {
            i = iconCompatParcelizer3.read;
        } else {
            i = -1;
        }
        if (i == 0) {
            hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(IconCompatParcelizer2, setCertificateError.IconCompatParcelizer.MARKETPLACE_STORE_URL);
        } else {
            hmlVerifyEmailSuccessfulActivity = new HmlVerifyEmailSuccessfulActivity(IconCompatParcelizer3, setCertificateError.IconCompatParcelizer.MARKETPLACE_PRODUCT_URL);
        }
        setCertificateError setcertificateerror5 = this.presenter;
        if (setcertificateerror5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CommonInputViewGroup commonInputViewGroup3 = this.businessRegNumEt;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
        }
        String obj = commonInputViewGroup3.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "businessRegNumEt.text");
        ArrayList arrayList3 = null;
        if (obj.length() == 0) {
            str = null;
        } else {
            CommonInputViewGroup commonInputViewGroup4 = this.businessRegNumEt;
            if (commonInputViewGroup4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessRegNumEt");
            }
            str = commonInputViewGroup4.mEditText.getText().toString().toString();
        }
        Boolean bool = this.MediaBrowserCompat$CustomActionResultReceiver;
        CustomURLEditTextWithButtonView customURLEditTextWithButtonView3 = this.businessUrlEt;
        if (customURLEditTextWithButtonView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
        }
        EditText editText2 = customURLEditTextWithButtonView3.urlEt;
        if (editText2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
        }
        if (!(editText2.getText().toString().length() == 0)) {
            CustomURLEditTextWithButtonView customURLEditTextWithButtonView4 = this.businessUrlEt;
            if (customURLEditTextWithButtonView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("businessUrlEt");
            }
            EditText editText3 = customURLEditTextWithButtonView4.urlEt;
            if (editText3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
            }
            str2 = editText3.getText().toString();
        } else {
            str2 = null;
        }
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "selectedPair");
        if (setcertificateerror5.write) {
            setcertificateerror5.write = false;
            if (setcertificateerror5.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                setcertificateerror5.RatingCompat.AlertController$RecycleListView();
            }
            BaseTransientBottomBar$SnackbarBaseLayout baseTransientBottomBar$SnackbarBaseLayout = setcertificateerror5.IconCompatParcelizer;
            FundActionsSuccessActivity setcertificateerror_mediabrowsercompat_searchresultreceiver = new setCertificateError$MediaBrowserCompat$SearchResultReceiver(setcertificateerror5);
            FundFactSheetActivity ratingCompat = new setCertificateError.RatingCompat(setcertificateerror5);
            if (setCertificateError.IconCompatParcelizer.MARKETPLACE_STORE_URL == ((setCertificateError.IconCompatParcelizer) hmlVerifyEmailSuccessfulActivity.write)) {
                arrayList = (ArrayList) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                arrayList = null;
            }
            List list = arrayList;
            if (setCertificateError.IconCompatParcelizer.MARKETPLACE_PRODUCT_URL == ((setCertificateError.IconCompatParcelizer) hmlVerifyEmailSuccessfulActivity.write)) {
                arrayList3 = (ArrayList) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver;
            }
            baseTransientBottomBar$SnackbarBaseLayout.MediaBrowserCompat$ItemReceiver(setcertificateerror_mediabrowsercompat_searchresultreceiver, ratingCompat, new NavigationView(str, bool, str2, list, arrayList3), new ChequeInquiryDeepLinkActivity());
        }
    }

    private static ArrayList<String> IconCompatParcelizer(LinearLayout linearLayout) {
        ArrayList<String> arrayList = new ArrayList<>();
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof CustomURLEditTextWithButtonView) {
                EditText editText = ((CustomURLEditTextWithButtonView) childAt).urlEt;
                if (editText == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("urlEt");
                }
                arrayList.add(editText.getText().toString());
            }
        }
        return arrayList;
    }

    @OnClick
    public final void onUrlStoreHelpClicked() {
        HmlBusinessHelpActivity.read read2 = HmlBusinessHelpActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "this.requireContext()");
        String string = getString(R.string.hml_business_owner_marketplace_about_activity);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…rketplace_about_activity)");
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlBusinessHelpActivity.read.MediaBrowserCompat$CustomActionResultReceiver(requireContext, string, R.layout.f78232131493048);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void read() {
        HmlBusinessOwnerGuidelinesActivity.IconCompatParcelizer iconCompatParcelizer = HmlBusinessOwnerGuidelinesActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "this.requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlBusinessOwnerGuidelinesActivity.class);
        intent.putExtra("SHOW_BACK_POP_UP", true);
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

    public void onResume() {
        super.onResume();
        setCertificateError setcertificateerror = this.presenter;
        if (setcertificateerror == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setcertificateerror.write = true;
    }

    public static final /* synthetic */ void write(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment) {
        HmlBusinessHelpActivity.read read2 = HmlBusinessHelpActivity.MediaMetadataCompat;
        Context requireContext = hmlBusinessURLInfoFragment.requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "this.requireContext()");
        String string = hmlBusinessURLInfoFragment.getString(R.string.hml_business_owner_registration_number_about_activity);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…on_number_about_activity)");
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlBusinessHelpActivity.read.MediaBrowserCompat$CustomActionResultReceiver(requireContext, string, R.layout.f78262131493051);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = hmlBusinessURLInfoFragment.getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            hmlBusinessURLInfoFragment.startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(HmlBusinessURLInfoFragment hmlBusinessURLInfoFragment, Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setFlags(603979776);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (Exception unused) {
            setCertificateError setcertificateerror = hmlBusinessURLInfoFragment.presenter;
            if (setcertificateerror == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setcertificateerror.write((int) R.string.error_generic_resource);
        }
    }
}
