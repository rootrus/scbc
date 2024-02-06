package com.scb.phone.view.fragment.remittance;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.remittance.RemittanceAddressSearchActivity;
import com.scb.phone.view.activity.remittance.RemittanceAddressSearchActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CustomAddressInput;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C4219ct;
import p040o.C4223cy;
import p040o.C5017nQ;
import p040o.DebitCardResetOtpActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableList;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Predicates;
import p040o.ZTBSV;
import p040o.addDelayedShutdownHook;
import p040o.nQ$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.onMapClick;
import p040o.reversePosition;
import p040o.setBackground;
import p040o.setRequestTimeout;
import p040o.setTapText;

public final class RemittanceSenderAddressFragment extends BaseAddressFragment implements setRequestTimeout {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    @HmlPinActivity
    public C5017nQ senderAddressPresenter;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        RatingCompat(getString(R.string.remittance_sender_address_section_header));
        C5017nQ nQVar = this.senderAddressPresenter;
        if (nQVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("senderAddressPresenter");
        }
        nQVar.MediaBrowserCompat$ItemReceiver(this);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        setBackground setbackground;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.houseNo.read();
        this.moo.read();
        this.roadTH.read();
        this.floor.read();
        this.unit.read();
        this.village.read();
        this.alley.read();
        C4223cy cyVar = this.presenter;
        C4219ct ctVar = new C4219ct(true);
        if (cyVar.RatingCompat != null) {
            ctVar.IconCompatParcelizer(cyVar.RatingCompat);
        }
        Bundle arguments = getArguments();
        if (arguments != null && (setbackground = (setBackground) arguments.getParcelable("KEY_ADDRESS_DISPLAY")) != null) {
            AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute = new AutoValue_CrashlyticsReport_CustomAttribute();
            autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat = setbackground.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
            autoValue_CrashlyticsReport_CustomAttribute.PlaybackStateCompat = setbackground.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem;
            autoValue_CrashlyticsReport_CustomAttribute.Keep = setbackground.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$QueueItem = setbackground.MediaBrowserCompat$ItemReceiver.f2947x50fd9e4a;
            autoValue_CrashlyticsReport_CustomAttribute.RatingCompat = setbackground.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
            autoValue_CrashlyticsReport_CustomAttribute.ParcelableVolumeInfo = setbackground.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper;
            autoValue_CrashlyticsReport_CustomAttribute.MediaMetadataCompat = setbackground.MediaBrowserCompat$ItemReceiver.read;
            autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$ResultReceiverWrapper = setbackground.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
            autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$ItemReceiver = setbackground.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver = setbackground.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo;
            autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem = setbackground.MediaBrowserCompat$ItemReceiver.RatingCompat;
            autoValue_CrashlyticsReport_CustomAttribute.IconCompatParcelizer = setbackground.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a = setbackground.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
            autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$SearchResultReceiver = setbackground.MediaBrowserCompat$ItemReceiver.write;
            onGetStartedClick.IconCompatParcelizer((Object) autoValue_CrashlyticsReport_CustomAttribute, "EkycAddressDisplay()\n   …Address.addressFormatted)");
            IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute, true);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10002 && i2 == -1 && intent != null) {
            addDelayedShutdownHook adddelayedshutdownhook = (addDelayedShutdownHook) intent.getParcelableExtra("SUB_DISTRICT_DISPLAY");
            TextView textView = this.subDistrictLabel;
            onGetStartedClick.IconCompatParcelizer((Object) textView, "subDistrictLabel");
            textView.setText(adddelayedshutdownhook.MediaBrowserCompat$MediaItem);
            TextView textView2 = this.districtLabel;
            onGetStartedClick.IconCompatParcelizer((Object) textView2, "districtLabel");
            textView2.setText(adddelayedshutdownhook.IconCompatParcelizer);
            TextView textView3 = this.provinceLabel;
            onGetStartedClick.IconCompatParcelizer((Object) textView3, "provinceLabel");
            textView3.setText(adddelayedshutdownhook.MediaMetadataCompat);
            TextView textView4 = this.postalCodeLabel;
            onGetStartedClick.IconCompatParcelizer((Object) textView4, "postalCodeLabel");
            textView4.setText(adddelayedshutdownhook.MediaBrowserCompat$CustomActionResultReceiver);
            MediaDescriptionCompat();
            MediaBrowserCompat$ItemReceiver(true);
        }
    }

    @OnClick
    public final void onSelectProvinceClick() {
        ZTBSV ztbsv = this.MediaBrowserCompat$MediaItem;
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_subdistrict");
        }
        RemittanceAddressSearchActivity$MediaBrowserCompat$ItemReceiver remittanceAddressSearchActivity$MediaBrowserCompat$ItemReceiver = RemittanceAddressSearchActivity.MediaDescriptionCompat;
        Context context = getContext();
        String title = getActivity() instanceof BaseActivity ? ((BaseActivity) getActivity()).setTitle() : "";
        onGetStartedClick.IconCompatParcelizer((Object) title, "headerTitle");
        onGetStartedClick.write((Object) title, MessageBundle.TITLE_ENTRY);
        Intent putExtra = new Intent(context, RemittanceAddressSearchActivity.class).putExtra("com.scb.phone.view.activity.easycash.EXTRA_SEARCH_TITLE", title);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, Remittan…XTRA_SEARCH_TITLE, title)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(putExtra, 10002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public final void onNextButtonClick() {
        CustomAddressInput customAddressInput = this.houseNo;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput, "houseNo");
        String trim = customAddressInput.inputTextField.getText().toString().trim();
        CustomAddressInput customAddressInput2 = this.unit;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput2, "unit");
        String trim2 = customAddressInput2.inputTextField.getText().toString().trim();
        CustomAddressInput customAddressInput3 = this.floor;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput3, "floor");
        String trim3 = customAddressInput3.inputTextField.getText().toString().trim();
        CustomAddressInput customAddressInput4 = this.village;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput4, "village");
        String trim4 = customAddressInput4.inputTextField.getText().toString().trim();
        CustomAddressInput customAddressInput5 = this.moo;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput5, "moo");
        String trim5 = customAddressInput5.inputTextField.getText().toString().trim();
        CustomAddressInput customAddressInput6 = this.alley;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput6, "alley");
        String trim6 = customAddressInput6.inputTextField.getText().toString().trim();
        CustomAddressInput customAddressInput7 = this.roadTH;
        onGetStartedClick.IconCompatParcelizer((Object) customAddressInput7, "roadTH");
        String trim7 = customAddressInput7.inputTextField.getText().toString().trim();
        TextView textView = this.districtLabel;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "districtLabel");
        String obj = textView.getText().toString();
        TextView textView2 = this.subDistrictLabel;
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "subDistrictLabel");
        String obj2 = textView2.getText().toString();
        TextView textView3 = this.provinceLabel;
        onGetStartedClick.IconCompatParcelizer((Object) textView3, "provinceLabel");
        String obj3 = textView3.getText().toString();
        TextView textView4 = this.postalCodeLabel;
        onGetStartedClick.IconCompatParcelizer((Object) textView4, "postalCodeLabel");
        ImmutableList.ReverseImmutableList reverseImmutableList = new ImmutableList.ReverseImmutableList(new reversePosition(trim, trim2, trim3, trim4, trim5, trim6, trim7, obj, obj2, obj3, textView4.getText().toString(), 2080));
        C5017nQ nQVar = this.senderAddressPresenter;
        if (nQVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("senderAddressPresenter");
        }
        onGetStartedClick.write((Object) reverseImmutableList, "addressSaveRequest");
        Predicates.InstanceOfPredicate instanceOfPredicate = nQVar.IconCompatParcelizer;
        onGetStartedClick.write((Object) reverseImmutableList, "addressSaveRequest");
        DebitCardResetOtpActivity<onMapClick> MediaBrowserCompat$ItemReceiver = instanceOfPredicate.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(reverseImmutableList);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "profileRepository.saveAddress(addressSaveRequest)");
        instanceOfPredicate.read(MediaBrowserCompat$ItemReceiver, new C5017nQ.IconCompatParcelizer(nQVar), new nQ$MediaBrowserCompat$ItemReceiver(nQVar));
    }

    public final void write(setBackground setbackground) {
        onGetStartedClick.write((Object) setbackground, "userAddressDisplay");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("USER_ADDRESS_DISPLAY", setbackground);
            activity.setResult(-1, intent);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void onDestroyView() {
        C5017nQ nQVar = this.senderAddressPresenter;
        if (nQVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("senderAddressPresenter");
        }
        nQVar.onDestroy();
        super.onDestroyView();
    }
}
