package com.scb.phone.view.fragment.hml.frictionlessmoa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.C5604xec6fa9b8;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlDocumentUploadGuidelineActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.adapter.hml.frictionlessmoa.HmlMoaAdapter;
import com.scb.phone.view.custom.common.CustomAcceptDeclineButtons;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p040o.ActivityBuilder_BindGiftingMoneyReviewActivity;
import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsController;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.getShortcutName;
import p040o.getShortcutName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getShortcutName$MediaBrowserCompat$ItemReceiver;
import p040o.getShortcutName$MediaBrowserCompat$MediaItem;
import p040o.getShortcutName$MediaBrowserCompat$SearchResultReceiver;
import p040o.immediateFailedFuture;
import p040o.newOnDevicePassportDeserializer;
import p040o.onGetStartedClick;
import p040o.setScrollPosition;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzfe;

public final class HmlMoaFragment extends BaseFragment implements newOnDevicePassportDeserializer {
    public static final HmlMoaFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new HmlMoaFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    @BindView
    public TextView accountHeader;
    @BindView
    public RecyclerView accountList;
    @BindView
    public CustomAcceptDeclineButtons btMoa;
    @BindView
    public TextView disclaimer;
    @BindView
    public Button nextButton;
    @HmlPinActivity
    public getShortcutName presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<CrashlyticsController.C32346, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlMoaFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(HmlMoaFragment hmlMoaFragment) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlMoaFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CrashlyticsController.C32346 r4 = (CrashlyticsController.C32346) obj;
            onGetStartedClick.write((Object) r4, "item");
            getShortcutName getshortcutname = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (getshortcutname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) r4, "item");
            getshortcutname.write = r4;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getShortcutName.write.MediaBrowserCompat$CustomActionResultReceiver;
            if (getshortcutname.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getshortcutname.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87892131494016, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_moa", zsyr2kArr);
        }
        RecyclerView recyclerView = this.accountList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountList");
        }
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.btMoa;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        Button button = customAcceptDeclineButtons.btAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAccept");
        }
        button.setText(getString(R.string.hml_moa_accept_button));
        CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.btMoa;
        if (customAcceptDeclineButtons2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        Button button2 = customAcceptDeclineButtons2.btDecline;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btDecline");
        }
        button2.setText(getString(R.string.hml_moa_decline_button));
        CustomAcceptDeclineButtons customAcceptDeclineButtons3 = this.btMoa;
        if (customAcceptDeclineButtons3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        TextView textView = customAcceptDeclineButtons3.tvLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
        }
        textView.setText(getString(R.string.hml_moa_buttons_text));
        CustomAcceptDeclineButtons customAcceptDeclineButtons4 = this.btMoa;
        if (customAcceptDeclineButtons4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        customAcceptDeclineButtons4.setOnButtonClickListener(new HmlMoaFragment$MediaBrowserCompat$CustomActionResultReceiver(this));
        getShortcutName getshortcutname = this.presenter;
        if (getshortcutname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getshortcutname.MediaBrowserCompat$ItemReceiver(this);
        getShortcutName getshortcutname2 = this.presenter;
        if (getshortcutname2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getshortcutname2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getshortcutname2.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35754.C35761.C35771 r1 = getshortcutname2.read;
        FundFactSheetActivity getshortcutname_mediabrowsercompat_searchresultreceiver = new getShortcutName$MediaBrowserCompat$SearchResultReceiver(getshortcutname2);
        FundFactSheetActivity mediaMetadataCompat = new getShortcutName.MediaMetadataCompat(getshortcutname2);
        FundFactSheetActivity getshortcutname_mediabrowsercompat_mediaitem = new getShortcutName$MediaBrowserCompat$MediaItem(getshortcutname2);
        onGetStartedClick.write((Object) getshortcutname_mediabrowsercompat_searchresultreceiver, "onSuccess");
        onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
        onGetStartedClick.write((Object) getshortcutname_mediabrowsercompat_mediaitem, "transform");
        r1.MediaBrowserCompat$ItemReceiver(r1.read, getshortcutname_mediabrowsercompat_searchresultreceiver, mediaMetadataCompat, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), getshortcutname_mediabrowsercompat_mediaitem);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        return inflate;
    }

    public final void write() {
        TextView textView = this.accountHeader;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountHeader");
        }
        textView.setVisibility(0);
        RecyclerView recyclerView = this.accountList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountList");
        }
        recyclerView.setVisibility(0);
        TextView textView2 = this.disclaimer;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("disclaimer");
        }
        textView2.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TextView textView = this.accountHeader;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountHeader");
        }
        textView.setVisibility(8);
        RecyclerView recyclerView = this.accountList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountList");
        }
        recyclerView.setVisibility(8);
        TextView textView2 = this.disclaimer;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("disclaimer");
        }
        textView2.setVisibility(8);
    }

    public final void write(boolean z) {
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.btMoa;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        Button button = customAcceptDeclineButtons.btAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAccept");
        }
        button.setSelected(true);
        CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.btMoa;
        if (customAcceptDeclineButtons2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        Button button2 = customAcceptDeclineButtons2.btDecline;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btDecline");
        }
        button2.setSelected(false);
        Button button3 = this.nextButton;
        if (button3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button3.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.btMoa;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        Button button = customAcceptDeclineButtons.btAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAccept");
        }
        button.setSelected(false);
        CustomAcceptDeclineButtons customAcceptDeclineButtons2 = this.btMoa;
        if (customAcceptDeclineButtons2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        Button button2 = customAcceptDeclineButtons2.btDecline;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btDecline");
        }
        button2.setSelected(true);
        Button button3 = this.nextButton;
        if (button3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button3.setEnabled(true);
    }

    public final void read(List<CrashlyticsController.C32346> list) {
        onGetStartedClick.write((Object) list, "list");
        RecyclerView recyclerView = this.accountList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountList");
        }
        recyclerView.setAdapter(new HmlMoaAdapter(new write(this), list));
    }

    @OnClick
    public final void onNextClicked() {
        String str;
        getShortcutName getshortcutname = this.presenter;
        if (getshortcutname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CustomAcceptDeclineButtons customAcceptDeclineButtons = this.btMoa;
        if (customAcceptDeclineButtons == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btMoa");
        }
        Button button = customAcceptDeclineButtons.btAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAccept");
        }
        boolean isSelected = button.isSelected();
        if (getshortcutname.RatingCompat != null) {
            getshortcutname.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35754.C35761.C35771 r2 = getshortcutname.read;
        FundActionsSuccessActivity getshortcutname_mediabrowsercompat_itemreceiver = new getShortcutName$MediaBrowserCompat$ItemReceiver(getshortcutname);
        FundFactSheetActivity getshortcutname_mediabrowsercompat_customactionresultreceiver = new getShortcutName$MediaBrowserCompat$CustomActionResultReceiver(getshortcutname);
        CrashlyticsController.C32346 r0 = getshortcutname.write;
        if (r0 != null) {
            str = r0.read;
        } else {
            str = null;
        }
        onGetStartedClick.write((Object) getshortcutname_mediabrowsercompat_itemreceiver, "onComplete");
        onGetStartedClick.write((Object) getshortcutname_mediabrowsercompat_customactionresultreceiver, "onError");
        r2.MediaBrowserCompat$ItemReceiver(r2.write, getshortcutname_mediabrowsercompat_itemreceiver, getshortcutname_mediabrowsercompat_customactionresultreceiver, new setScrollPosition.IconCompatParcelizer(isSelected, str));
    }

    public final void read() {
        Button button = this.nextButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nextButton");
        }
        button.setEnabled(true);
    }

    public final void read(getShortcutName.read read) {
        Intent intent;
        onGetStartedClick.write((Object) read, "screen");
        Context context = getContext();
        if (context != null) {
            int i = ActivityBuilder_BindGiftingMoneyReviewActivity.read[read.ordinal()];
            if (i == 1) {
                C5604xec6fa9b8 hmlDocumentUploadGuidelineActivity$MediaBrowserCompat$ItemReceiver = HmlDocumentUploadGuidelineActivity.MediaMetadataCompat;
                onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                onGetStartedClick.write((Object) context, "context");
                intent = new Intent(context, HmlDocumentUploadGuidelineActivity.class);
            } else if (i == 2) {
                HmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver hmlIssuerLandingActivity$MediaBrowserCompat$ItemReceiver = HmlIssuerLandingActivity.MediaDescriptionCompat;
                intent = new Intent(context, HmlIssuerLandingActivity.class);
            } else if (i == 3) {
                HmlConsentActivity.read read2 = HmlConsentActivity.MediaMetadataCompat;
                onGetStartedClick.IconCompatParcelizer((Object) context, "context");
                intent = HmlConsentActivity.read.write(context, zzfe.zza.NCB_CONSENT, (immediateFailedFuture) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
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
    }
}
