package com.scb.phone.view.fragment.hml;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.cleanInvalidTempFiles;
import p040o.enableExceptionHandling;
import p040o.getIPassportDeserializerRtti;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.initializeNetworkSettings;
import p040o.initializeNetworkSettings$MediaBrowserCompat$ItemReceiver;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBApplyLoanEntryFragment extends BaseFragment implements getIPassportDeserializerRtti {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    @BindView
    public LinearLayout buttonListLinearLayout;
    @BindView
    public TextView descriptionTv;
    @BindView
    public ImageView imageIv;
    @HmlPinActivity
    public initializeNetworkSettings presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87912131494018, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        initializeNetworkSettings initializenetworksettings = this.presenter;
        if (initializenetworksettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        initializenetworksettings.MediaBrowserCompat$ItemReceiver(this);
        initializeNetworkSettings initializenetworksettings2 = this.presenter;
        if (initializenetworksettings2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String stackedBackground = setStackedBackground();
        onGetStartedClick.IconCompatParcelizer((Object) stackedBackground, "language");
        onGetStartedClick.write((Object) stackedBackground, "language");
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) stackedBackground, (Object) "th");
        if (initializenetworksettings2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            initializenetworksettings2.RatingCompat.AlertController$RecycleListView();
        }
        initializenetworksettings2.read.IconCompatParcelizer(new initializeNetworkSettings.write(initializenetworksettings2, MediaBrowserCompat$ItemReceiver), new initializeNetworkSettings$MediaBrowserCompat$ItemReceiver(initializenetworksettings2), new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), initializenetworksettings2.MediaBrowserCompat$ItemReceiver);
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(enableExceptionHandling enableexceptionhandling) {
        onGetStartedClick.write((Object) enableexceptionhandling, "loanEntry");
        TextView textView = this.descriptionTv;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("descriptionTv");
        }
        textView.setText(enableexceptionhandling.MediaBrowserCompat$ItemReceiver);
        List<cleanInvalidTempFiles> list = enableexceptionhandling.MediaBrowserCompat$CustomActionResultReceiver;
        if (!list.isEmpty()) {
            for (cleanInvalidTempFiles cleaninvalidtempfiles : list) {
                View inflate = getLayoutInflater().inflate(R.layout.f81152131493341, (ViewGroup) null);
                if (inflate != null) {
                    Button button = (Button) inflate;
                    button.setText(cleaninvalidtempfiles.IconCompatParcelizer);
                    button.setOnClickListener(new read(cleaninvalidtempfiles, this));
                    LinearLayout linearLayout = this.buttonListLinearLayout;
                    if (linearLayout == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonListLinearLayout");
                    }
                    linearLayout.addView(button);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.Button");
                }
            }
        }
        ParcelableVolumeInfo(enableexceptionhandling.write);
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(enableexceptionhandling.IconCompatParcelizer);
        ImageView imageView = this.imageIv;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("imageIv");
        }
        write.read(imageView, (FragmentBuilder_BindEkycFragment) null);
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ HmlNTBApplyLoanEntryFragment MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ cleanInvalidTempFiles MediaBrowserCompat$ItemReceiver;

        read(cleanInvalidTempFiles cleaninvalidtempfiles, HmlNTBApplyLoanEntryFragment hmlNTBApplyLoanEntryFragment) {
            this.MediaBrowserCompat$ItemReceiver = cleaninvalidtempfiles;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlNTBApplyLoanEntryFragment;
        }

        public final void onClick(View view) {
            HmlNTBApplyLoanEntryFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.write);
            HmlNTBApplyLoanEntryFragment.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void onDestroy() {
        initializeNetworkSettings initializenetworksettings = this.presenter;
        if (initializenetworksettings == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        initializenetworksettings.onDestroy();
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(HmlNTBApplyLoanEntryFragment hmlNTBApplyLoanEntryFragment, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity.EXTRA_FROM_NTB", true);
            intent.setData(Uri.parse(str));
            intent.setFlags(603979776);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = hmlNTBApplyLoanEntryFragment.getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                hmlNTBApplyLoanEntryFragment.startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        } catch (NullPointerException e2) {
            onCheckBoxClick.IconCompatParcelizer(e2);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(HmlNTBApplyLoanEntryFragment hmlNTBApplyLoanEntryFragment, String str) {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("feature", "ntb"), new ZSYR2K("button", str)};
        if (hmlNTBApplyLoanEntryFragment.getActivity() != null) {
            ((BaseActivity) hmlNTBApplyLoanEntryFragment.getActivity()).scbAnalytics.write("p10x1_apply_loan_entry", zsyr2kArr);
        }
    }
}
