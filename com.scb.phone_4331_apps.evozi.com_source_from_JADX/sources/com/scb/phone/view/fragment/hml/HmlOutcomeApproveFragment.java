package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.components.ItemCustom;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_BindChequeSuccessActivity;
import p040o.C6978x206b8e03;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.ForwardingFuture;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.ImageService;
import p040o.Iterables;
import p040o.KLOLogging;
import p040o.KofaxWebServiceObjectBase;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getNonFatalSessionFilesDir;
import p040o.onGetStartedClick;
import p040o.saveIpPNG;
import p040o.saveToFileBuffer;
import p040o.setDisplayName;
import p040o.setTapText;
import p040o.setUseableImageMemoryLimits;

public class HmlOutcomeApproveFragment extends HmlBaseOutcomeFragment implements C6978x206b8e03 {
    @BindView
    public TextView acceptSubtitle;
    @BindView
    TextView amount;
    @BindView
    public ImageView amountIcon;
    @BindView
    ImageView approveHeader;
    @BindView
    LinearLayout container;
    @BindView
    TextView dateText;
    @HmlPinActivity
    public Iterables.C351911.C35201 itemFactory;
    @HmlPinActivity
    public KofaxWebServiceObjectBase presenter;
    @BindView
    TextView repaymentAmount;

    @OnClick
    public void onButtonReturnHomeClicked(View view) {
        KofaxWebServiceObjectBase kofaxWebServiceObjectBase = this.presenter;
        setDisplayName setdisplayname = setDisplayName.write;
        if (kofaxWebServiceObjectBase.RatingCompat != null) {
            setdisplayname.IconCompatParcelizer(kofaxWebServiceObjectBase.RatingCompat);
        }
    }

    @OnClick
    public void onButtonDeclineClicked(View view) {
        KofaxWebServiceObjectBase kofaxWebServiceObjectBase = this.presenter;
        KLOLogging kLOLogging = KLOLogging.MediaBrowserCompat$ItemReceiver;
        if (kofaxWebServiceObjectBase.RatingCompat != null) {
            kLOLogging.IconCompatParcelizer(kofaxWebServiceObjectBase.RatingCompat);
        }
    }

    @OnClick
    public void onButtonAcceptClicked(View view) {
        boolean z = false;
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", MediaBrowserCompat$CustomActionResultReceiver()), new ZSYR2K("button", "accept")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_selected_offer_review", zsyr2kArr);
        }
        KofaxWebServiceObjectBase kofaxWebServiceObjectBase = this.presenter;
        StringBuilder sb = new StringBuilder();
        if (!(kofaxWebServiceObjectBase.read.read == null || kofaxWebServiceObjectBase.read.read.RatingCompat == null)) {
            CrashlyticsReport.FilesPayload.Builder builder = kofaxWebServiceObjectBase.read.read.RatingCompat;
            if (builder.IconCompatParcelizer != null) {
                sb.append(HmlNTBBusinessURLInformationActivity.write(builder.IconCompatParcelizer, "#####", "", "", -1, "", ImageService.EnhancementResults.IconCompatParcelizer));
            }
        }
        saveToFileBuffer savetofilebuffer = new saveToFileBuffer(kofaxWebServiceObjectBase, sb);
        if (kofaxWebServiceObjectBase.RatingCompat != null) {
            z = true;
        }
        if (z) {
            savetofilebuffer.IconCompatParcelizer(kofaxWebServiceObjectBase.RatingCompat);
        }
        kofaxWebServiceObjectBase.read(DiskLruCache.VERSION_1);
    }

    @OnClick
    public void onContactCallCenter(View view) {
        aK_();
    }

    public static HmlOutcomeApproveFragment MediaBrowserCompat$ItemReceiver(getNonFatalSessionFilesDir getnonfatalsessionfilesdir) {
        HmlOutcomeApproveFragment hmlOutcomeApproveFragment = new HmlOutcomeApproveFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_APPROVE_EXTRA", getnonfatalsessionfilesdir);
        hmlOutcomeApproveFragment.setArguments(bundle);
        return hmlOutcomeApproveFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getNonFatalSessionFilesDir getnonfatalsessionfilesdir = null;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88002131494027, (ViewGroup) null, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getArguments() != null) {
            getnonfatalsessionfilesdir = (getNonFatalSessionFilesDir) getArguments().getParcelable("HML_OUTCOME_APPROVE_EXTRA");
        }
        if (getnonfatalsessionfilesdir != null) {
            this.acceptSubtitle.setText(getnonfatalsessionfilesdir.IconCompatParcelizer);
        }
        this.amountIcon.setVisibility(0);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        KofaxWebServiceObjectBase kofaxWebServiceObjectBase = this.presenter;
        kofaxWebServiceObjectBase.read = getnonfatalsessionfilesdir;
        saveIpPNG saveippng = new saveIpPNG(kofaxWebServiceObjectBase, getnonfatalsessionfilesdir);
        if (kofaxWebServiceObjectBase.RatingCompat != null) {
            z = true;
        }
        if (z) {
            saveippng.IconCompatParcelizer(kofaxWebServiceObjectBase.RatingCompat);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, CrashlyticsController.C322418 r4, List<ForwardingFuture> list) {
        this.dateText.setVisibility(str == null ? 8 : 0);
        this.dateText.setText(str);
        for (ForwardingFuture next : list) {
            ItemCustom MediaBrowserCompat$CustomActionResultReceiver = this.itemFactory.MediaBrowserCompat$CustomActionResultReceiver(getContext(), next);
            MediaBrowserCompat$CustomActionResultReceiver.setUpWithDisplay(next);
            this.container.addView(MediaBrowserCompat$CustomActionResultReceiver);
        }
        this.amount.setText(r4.IconCompatParcelizer);
        this.repaymentAmount.setText(r4.write);
        if (!(r4.MediaBrowserCompat$ItemReceiver == null || getContext() == null)) {
            Picasso.read().write(r4.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer((int) R.drawable.outcome_placeholder).read(this.approveHeader, (FragmentBuilder_BindEkycFragment) null);
        }
        if (r4.read != null && getContext() != null) {
            Picasso.read().write(r4.read).IconCompatParcelizer((int) R.drawable.outcome_icon_placeholder).read(this.amountIcon, (FragmentBuilder_BindEkycFragment) null);
        }
    }

    public void read() {
        HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlETBLoanSetupActivity.MediaDescriptionCompat;
        Context context = getContext();
        onGetStartedClick.write((Object) context, "ctx");
        Intent intent = new Intent(context, HmlETBLoanSetupActivity.class);
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

    public final void IconCompatParcelizer() {
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = getString(R.string.hml_outcome_decline_dialog_title);
        access_2200.IconCompatParcelizer = getString(R.string.hml_outcome_decline_dialog_message);
        access$2300 access_2300 = new access$2300();
        ActivityBuilder_BindChequeSuccessActivity activityBuilder_BindChequeSuccessActivity = new ActivityBuilder_BindChequeSuccessActivity(this);
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = activityBuilder_BindChequeSuccessActivity;
        access_2300.MediaBrowserCompat$ItemReceiver = getString(R.string.hml_outcome_decline_dialog_confirm);
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        access$2300 access_23002 = new access$2300();
        access_23002.read = access$2300.write.JUST_DISMISS;
        access_23002.MediaBrowserCompat$ItemReceiver = getString(R.string.hml_outcome_decline_dialog_cancel);
        access_2200.write = access_23002;
        write(access_2200);
    }

    public final /* synthetic */ void write() {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", MediaBrowserCompat$CustomActionResultReceiver()), new ZSYR2K("button", "deny")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_selected_offer_review", zsyr2kArr);
        }
        KofaxWebServiceObjectBase kofaxWebServiceObjectBase = this.presenter;
        if (!(kofaxWebServiceObjectBase.read.read == null || kofaxWebServiceObjectBase.read.read.RatingCompat == null)) {
            CrashlyticsReport.FilesPayload.Builder builder = kofaxWebServiceObjectBase.read.read.RatingCompat;
            if (builder.IconCompatParcelizer != null) {
                HmlNTBBusinessURLInformationActivity.write(builder.IconCompatParcelizer, "#####", "", "", -1, "", setUseableImageMemoryLimits.write);
            }
        }
        kofaxWebServiceObjectBase.read("0");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", MediaBrowserCompat$CustomActionResultReceiver()), new ZSYR2K("button", "accept"), new ZSYR2K("status", "approved_loan"), new ZSYR2K("offer_type", str2), new ZSYR2K("loan_type", str)};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_selected_offer_review", zsyr2kArr);
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
