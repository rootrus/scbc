package com.scb.phone.view.fragment.prepaid.traveltab;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.HashMap;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.FragmentBuilder_BindCcSofTermsAndConditionsFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.OnDeviceIdExtractor;
import p040o.ZHER2K;
import p040o.ZTBSV;
import p040o.getAddress6FieldName;
import p040o.getAddress6FieldName$MediaBrowserCompat$SearchResultReceiver;
import p040o.getKernelIDDstAtop;
import p040o.isSimulator;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeUInt64NoTag;

public final class PrepaidTravelServicesTabFragment extends BaseFragment implements OnDeviceIdExtractor.C6966a.C69693.write, PrepaidDetailsActivity.read {
    private final HmlVerifyEmailActivity IconCompatParcelizer;
    private HashMap MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindCcSofTermsAndConditionsFragment MediaDescriptionCompat;
    private isSimulator RatingCompat;
    @HmlPinActivity
    public getAddress6FieldName presenter;

    private View read(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ void mo15128x50fd9e4a() {
    }

    public PrepaidTravelServicesTabFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C6127xe7c7a74b.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final /* synthetic */ isSimulator MediaBrowserCompat$CustomActionResultReceiver(PrepaidTravelServicesTabFragment prepaidTravelServicesTabFragment) {
        isSimulator issimulator = prepaidTravelServicesTabFragment.RatingCompat;
        if (issimulator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardDisplay");
        }
        return issimulator;
    }

    public static final class write {
        public List<OffsetDateTime> IconCompatParcelizer;
        public OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
        public OffsetDateTime MediaBrowserCompat$ItemReceiver;
        public OffsetDateTime read;

        private write() {
        }

        public write(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, List<OffsetDateTime> list) {
            this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
            this.read = offsetDateTime2;
            this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime3;
            this.IconCompatParcelizer = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write write = (write) obj;
            OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
            if (offsetDateTime == null ? write.MediaBrowserCompat$ItemReceiver != null : !offsetDateTime.equals(write.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            OffsetDateTime offsetDateTime2 = this.read;
            if (offsetDateTime2 == null ? write.read != null : !offsetDateTime2.equals(write.read)) {
                return false;
            }
            OffsetDateTime offsetDateTime3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (offsetDateTime3 == null ? write.MediaBrowserCompat$CustomActionResultReceiver != null : !offsetDateTime3.equals(write.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            List<OffsetDateTime> list = this.IconCompatParcelizer;
            List<OffsetDateTime> list2 = write.IconCompatParcelizer;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            OffsetDateTime offsetDateTime = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = offsetDateTime != null ? offsetDateTime.hashCode() : 0;
            OffsetDateTime offsetDateTime2 = this.read;
            int hashCode2 = offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0;
            OffsetDateTime offsetDateTime3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = offsetDateTime3 != null ? offsetDateTime3.hashCode() : 0;
            List<OffsetDateTime> list = this.IconCompatParcelizer;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88962131494123, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        isSimulator issimulator;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.read = ButterKnife.IconCompatParcelizer(this, view);
        getAddress6FieldName getaddress6fieldname = this.presenter;
        if (getaddress6fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress6fieldname.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null && (issimulator = (isSimulator) arguments.getParcelable("ARGS_PREPAID_CARD_DISPLAY")) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) issimulator, "it");
            this.RatingCompat = issimulator;
            getAddress6FieldName getaddress6fieldname2 = this.presenter;
            if (getaddress6fieldname2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getaddress6fieldname2.MediaBrowserCompat$ItemReceiver(issimulator.MediaBrowserCompat$CustomActionResultReceiver);
            getAddress6FieldName getaddress6fieldname3 = this.presenter;
            if (getaddress6fieldname3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getaddress6fieldname3.write(issimulator.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void onAttach(Context context) {
        onGetStartedClick.write((Object) context, "context");
        super.onAttach(context);
        this.MediaDescriptionCompat = (FragmentBuilder_BindCcSofTermsAndConditionsFragment) context;
    }

    public final void read(isSimulator issimulator) {
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        this.RatingCompat = issimulator;
        getAddress6FieldName getaddress6fieldname = this.presenter;
        if (getaddress6fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress6fieldname.MediaBrowserCompat$ItemReceiver(issimulator.MediaBrowserCompat$CustomActionResultReceiver);
        getAddress6FieldName getaddress6fieldname2 = this.presenter;
        if (getaddress6fieldname2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress6fieldname2.write(issimulator.MediaBrowserCompat$CustomActionResultReceiver);
        ZTBSV ztbsv = (getKernelIDDstAtop) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_summary_service_screen");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Context context = getContext();
        if (context != null) {
            ((ImageView) read(ZHER2K.write.icCardLock)).setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f66182131099773), PorterDuff.Mode.SRC_IN);
            ((TextView) read(ZHER2K.write.tvCardLockTemporary)).setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
        }
        SwitchCompat switchCompat = (SwitchCompat) read(ZHER2K.write.toggleCardLock);
        onGetStartedClick.IconCompatParcelizer((Object) switchCompat, "toggleCardLock");
        switchCompat.setEnabled(true);
        TextView textView = (TextView) read(ZHER2K.write.tvCardAllowTag);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvCardAllowTag");
        textView.setVisibility(8);
    }

    public final void read() {
        Context context = getContext();
        if (context != null) {
            ((ImageView) read(ZHER2K.write.icCardLock)).setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f66182131099773), PorterDuff.Mode.SRC_IN);
            ((TextView) read(ZHER2K.write.tvCardLockTemporary)).setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
        }
        SwitchCompat switchCompat = (SwitchCompat) read(ZHER2K.write.toggleCardLock);
        onGetStartedClick.IconCompatParcelizer((Object) switchCompat, "toggleCardLock");
        switchCompat.setEnabled(true);
        TextView textView = (TextView) read(ZHER2K.write.tvCardAllowTag);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvCardAllowTag");
        textView.setVisibility(8);
    }

    public final void write() {
        Context context = getContext();
        if (context != null) {
            ((ImageView) read(ZHER2K.write.icCardLock)).setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f66402131099796), PorterDuff.Mode.SRC_IN);
            ((TextView) read(ZHER2K.write.tvCardLockTemporary)).setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
        }
        SwitchCompat switchCompat = (SwitchCompat) read(ZHER2K.write.toggleCardLock);
        onGetStartedClick.IconCompatParcelizer((Object) switchCompat, "toggleCardLock");
        switchCompat.setEnabled(false);
        TextView textView = (TextView) read(ZHER2K.write.tvCardAllowTag);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvCardAllowTag");
        textView.setVisibility(0);
        TextView textView2 = (TextView) read(ZHER2K.write.tvCardAllowTag);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "tvCardAllowTag");
        textView2.setText(getString(R.string.prepaid_tab_travel_service_lock_card_inactive));
    }

    public final void IconCompatParcelizer(boolean z) {
        SwitchCompat switchCompat = (SwitchCompat) read(ZHER2K.write.toggleCardLock);
        onGetStartedClick.IconCompatParcelizer((Object) switchCompat, "toggleCardLock");
        switchCompat.setChecked(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Context context = getContext();
        if (context != null) {
            ((ImageView) read(ZHER2K.write.icResetCardPin)).setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f66182131099773), PorterDuff.Mode.SRC_IN);
            ((ImageView) read(ZHER2K.write.icArrow)).setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f65322131099683), PorterDuff.Mode.SRC_IN);
            ((TextView) read(ZHER2K.write.tvResetCardPin)).setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
        }
    }

    public final void IconCompatParcelizer() {
        Context context = getContext();
        if (context != null) {
            ((ImageView) read(ZHER2K.write.icResetCardPin)).setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f66402131099796), PorterDuff.Mode.SRC_IN);
            ((ImageView) read(ZHER2K.write.icArrow)).setColorFilter(setLastBaselineToBottomHeight.read(context, R.color.f66402131099796), PorterDuff.Mode.SRC_IN);
            ((TextView) read(ZHER2K.write.tvResetCardPin)).setTextColor(setLastBaselineToBottomHeight.read(context, R.color.f66402131099796));
        }
    }

    private final void read(String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(str2).IconCompatParcelizer(str3, onClickListener).MediaBrowserCompat$ItemReceiver(str4, IconCompatParcelizer.MediaBrowserCompat$ItemReceiver).show();
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        String string = getString(R.string.prepaid_tab_travel_service_lock_card_temp);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…l_service_lock_card_temp)");
        String string2 = getString(R.string.prepaid_tab_travel_service_lock_card_temp_description);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.prepa…ck_card_temp_description)");
        String string3 = getString(R.string.prepaid_tab_travel_service_lock_card_temp_confirm);
        onGetStartedClick.IconCompatParcelizer((Object) string3, "getString(R.string.prepa…e_lock_card_temp_confirm)");
        String string4 = getString(R.string.prepaid_tab_travel_service_lock_card_temp_cancel);
        onGetStartedClick.IconCompatParcelizer((Object) string4, "getString(R.string.prepa…ce_lock_card_temp_cancel)");
        read(string, string2, string3, string4, new read(this));
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ PrepaidTravelServicesTabFragment write;

        read(PrepaidTravelServicesTabFragment prepaidTravelServicesTabFragment) {
            this.write = prepaidTravelServicesTabFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            getAddress6FieldName getaddress6fieldname = this.write.presenter;
            if (getaddress6fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getaddress6fieldname.MediaBrowserCompat$ItemReceiver(PrepaidTravelServicesTabFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write).RatingCompat);
        }
    }

    public final void MediaMetadataCompat() {
        String string = getString(R.string.prepaid_tab_travel_service_unlock_card);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…avel_service_unlock_card)");
        String string2 = getString(R.string.prepaid_tab_travel_service_unlock_card_description);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "getString(R.string.prepa…_unlock_card_description)");
        String string3 = getString(R.string.prepaid_tab_travel_service_unlock_card_confirm);
        onGetStartedClick.IconCompatParcelizer((Object) string3, "getString(R.string.prepa…vice_unlock_card_confirm)");
        String string4 = getString(R.string.prepaid_tab_travel_service_unlock_card_cancel);
        onGetStartedClick.IconCompatParcelizer((Object) string4, "getString(R.string.prepa…rvice_unlock_card_cancel)");
        read(string, string2, string3, string4, new PrepaidTravelServicesTabFragment$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void MediaDescriptionCompat() {
        FragmentBuilder_BindCcSofTermsAndConditionsFragment fragmentBuilder_BindCcSofTermsAndConditionsFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindCcSofTermsAndConditionsFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelServicesListener");
        }
        if (this.RatingCompat == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardDisplay");
        }
        fragmentBuilder_BindCcSofTermsAndConditionsFragment.MediaSessionCompat$ResultReceiverWrapper();
    }

    @OnCheckedChanged
    public final void onCardLockToggleChanged(CompoundButton compoundButton, boolean z) {
        onGetStartedClick.write((Object) compoundButton, "button");
        if (compoundButton.isPressed()) {
            boolean z2 = true;
            boolean z3 = !z;
            compoundButton.setChecked(z3);
            getAddress6FieldName getaddress6fieldname = this.presenter;
            if (getaddress6fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (z3) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getAddress6FieldName.write.MediaBrowserCompat$ItemReceiver;
                if (getaddress6fieldname.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    iconCompatParcelizer.IconCompatParcelizer(getaddress6fieldname.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getAddress6FieldName$MediaBrowserCompat$SearchResultReceiver.write;
            if (getaddress6fieldname.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                iconCompatParcelizer2.IconCompatParcelizer(getaddress6fieldname.RatingCompat);
            }
        }
    }

    @OnClick
    public final void navigateToResetPin() {
        isSimulator issimulator = this.RatingCompat;
        if (issimulator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardDisplay");
        }
        if (issimulator.MediaBrowserCompat$CustomActionResultReceiver.contains("RESET_PIN")) {
            ZTBSV ztbsv = (getKernelIDDstAtop) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            if (getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_prepaid_resetpin");
            }
            FragmentBuilder_BindCcSofTermsAndConditionsFragment fragmentBuilder_BindCcSofTermsAndConditionsFragment = this.MediaDescriptionCompat;
            if (fragmentBuilder_BindCcSofTermsAndConditionsFragment == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelServicesListener");
            }
            fragmentBuilder_BindCcSofTermsAndConditionsFragment.mo15112x50fd9e4a();
        }
    }

    public final void onDestroyView() {
        getAddress6FieldName getaddress6fieldname = this.presenter;
        if (getaddress6fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress6fieldname.onDestroy();
        super.onDestroyView();
        HashMap hashMap = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final PrepaidTravelServicesTabFragment MediaBrowserCompat$CustomActionResultReceiver(isSimulator issimulator) {
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        PrepaidTravelServicesTabFragment prepaidTravelServicesTabFragment = new PrepaidTravelServicesTabFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_PREPAID_CARD_DISPLAY", issimulator);
        prepaidTravelServicesTabFragment.setArguments(bundle);
        return prepaidTravelServicesTabFragment;
    }
}
