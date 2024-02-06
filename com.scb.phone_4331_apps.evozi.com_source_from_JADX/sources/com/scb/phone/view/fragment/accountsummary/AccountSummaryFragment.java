package com.scb.phone.view.fragment.accountsummary;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.appbar.AppBarLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.PreLoadCheckActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.scb.phone.view.custom.CustomProfileImageView;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import java.io.File;
import java.lang.ref.WeakReference;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CheckCaptureModule;
import p040o.DataTransportCrashlyticsReportSender$$Lambda$2;
import p040o.DefaultSettingsJsonTransform;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceFilter;
import p040o.PlacesOptions;
import p040o.getAllDemoTiles;
import p040o.getIdps;
import p040o.getSettingsFile;
import p040o.mergeStrings;
import p040o.readCachedSettings;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.stringToByteString;
import p040o.verifySwitch;
import p040o.writeFrame;
import p040o.writeSessionEventApp;
import p040o.writeSessionEventDevice;
import p040o.zzmd;
import p040o.zzwi;

public class AccountSummaryFragment extends BaseFragment implements AppBarLayout.read, CheckCaptureModule.C6375a.write {
    public boolean IconCompatParcelizer = false;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private int RatingCompat = 0;
    @BindView
    DefaultButton accountSummaryAddButton;
    @HmlPinActivity
    public getSettingsFile accountSummaryPresenter;
    @BindView
    CustomProfileImageView cusIvProfile;
    @BindView
    ImageView ivBgAccountSummary;
    @BindView
    AppBarLayout mAppBarLayout;
    @BindView
    TextView tvHomeWelcomeHeadline;
    @BindView
    TextView tvHomeWelcomeUserName;

    public static final /* synthetic */ void IconCompatParcelizer(Fragment fragment, Intent intent) {
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
            ((AccountSummaryFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zzmd.zzm.zzb.zza zza;
        boolean z;
        PlaceFilter.zzb zzb;
        boolean z2 = false;
        View inflate = layoutInflater.inflate(R.layout.f85482131493775, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        this.accountSummaryPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getActivity() instanceof HomeActivity) {
            ((HomeActivity) getActivity()).MediaMetadataCompat = true;
        }
        this.MediaBrowserCompat$ItemReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_HIDE_SWIPE_REFRESH")).subscribe(new verifySwitch(this), getIdps.MediaBrowserCompat$ItemReceiver);
        this.MediaDescriptionCompat = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("com.scb.phone/BROADCAST_PROFILE_UPDATED")).subscribe(new verifySwitch(this), getIdps.MediaBrowserCompat$ItemReceiver);
        super.setTransitioning();
        ActionBarContextView();
        ParcelableVolumeInfo(getString(R.string.account_summary));
        this.mAppBarLayout.IconCompatParcelizer((AppBarLayout.read) this);
        setTitleOptional();
        getSettingsFile getsettingsfile = this.accountSummaryPresenter;
        if (getsettingsfile != null) {
            writeFrame writeframe = new writeFrame(getsettingsfile);
            if (getsettingsfile.RatingCompat != null) {
                writeframe.IconCompatParcelizer(getsettingsfile.RatingCompat);
            }
        }
        getSettingsFile getsettingsfile2 = this.accountSummaryPresenter;
        if (getActivity() instanceof PreLoadCheckActivity) {
            zza = ((PreLoadCheckActivity) getActivity()).setTitleOptional();
        } else {
            zza = null;
        }
        if (zzmd.zzm.zzb.zza.INDIVIDUAL == zza) {
            stringToByteString stringtobytestring = stringToByteString.IconCompatParcelizer;
            if (getsettingsfile2.RatingCompat != null) {
                stringtobytestring.IconCompatParcelizer(getsettingsfile2.RatingCompat);
            }
            zzwi MediaBrowserCompat$CustomActionResultReceiver2 = getsettingsfile2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (zzb = MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper) == null) {
                z = false;
            } else {
                z = zzb.MediaBrowserCompat$SearchResultReceiver;
            }
            if (z) {
                DataTransportCrashlyticsReportSender$$Lambda$2 dataTransportCrashlyticsReportSender$$Lambda$2 = DataTransportCrashlyticsReportSender$$Lambda$2.read;
                if (getsettingsfile2.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    dataTransportCrashlyticsReportSender$$Lambda$2.IconCompatParcelizer(getsettingsfile2.RatingCompat);
                }
                getsettingsfile2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new writeSessionEventDevice(getsettingsfile2), new writeSessionEventApp(getsettingsfile2));
            } else {
                readCachedSettings readcachedsettings = readCachedSettings.MediaBrowserCompat$CustomActionResultReceiver;
                if (getsettingsfile2.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    readcachedsettings.IconCompatParcelizer(getsettingsfile2.RatingCompat);
                }
            }
        } else {
            mergeStrings mergestrings = mergeStrings.IconCompatParcelizer;
            if (getsettingsfile2.RatingCompat != null) {
                mergestrings.IconCompatParcelizer(getsettingsfile2.RatingCompat);
            }
            readCachedSettings readcachedsettings2 = readCachedSettings.MediaBrowserCompat$CustomActionResultReceiver;
            if (getsettingsfile2.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                readcachedsettings2.IconCompatParcelizer(getsettingsfile2.RatingCompat);
            }
        }
        return inflate;
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    public void onResume() {
        super.onResume();
        getSettingsFile getsettingsfile = this.accountSummaryPresenter;
        if (getsettingsfile.write.MediaBrowserCompat$ItemReceiver.setChecked()) {
            DefaultSettingsJsonTransform defaultSettingsJsonTransform = DefaultSettingsJsonTransform.write;
            if (getsettingsfile.RatingCompat != null) {
                defaultSettingsJsonTransform.IconCompatParcelizer(getsettingsfile.RatingCompat);
            }
            getsettingsfile.write.MediaBrowserCompat$ItemReceiver.read(false);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    public void onDestroy() {
        this.accountSummaryPresenter.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaDescriptionCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaDescriptionCompat.dispose();
        }
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        ActionBarContextView();
        ParcelableVolumeInfo(getString(R.string.account_summary));
    }

    public final void read(AppBarLayout appBarLayout, int i) {
        AlertController$RecycleListView.read(appBarLayout, i, (WeakReference<TextView>) new WeakReference(this.mActionBarTitle));
    }

    public final void read(Futures.C34104 r3) {
        this.cusIvProfile.setImageUrl(r3.MediaBrowserCompat$ItemReceiver);
        this.tvHomeWelcomeUserName.setText(r3.RatingCompat);
        this.tvHomeWelcomeHeadline.setText(r3.read);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onAddAccountButtonClicked() {
        AddAccountConsentActivity.IconCompatParcelizer(getContext());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("OUTSTATE_REGISTERED_ACCOUNT", this.accountSummaryPresenter.write.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (bundle != null) {
            this.accountSummaryPresenter.write.MediaBrowserCompat$ItemReceiver.RatingCompat(bundle.getString("OUTSTATE_REGISTERED_ACCOUNT"));
        }
    }

    public final void MediaMetadataCompat() {
        Context context = getContext();
        if (context != null) {
            if (this.accountSummaryPresenter.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver() && !this.accountSummaryPresenter.write.MediaBrowserCompat$CustomActionResultReceiver.write()) {
                FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer(new File(this.accountSummaryPresenter.write.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(), PlacesOptions.Builder.BG_ACCOUNT_SUMMARY.component), this.ivBgAccountSummary, setLastBaselineToBottomHeight.write(context, R.drawable.landing_page_header));
            }
            this.cusIvProfile.setOnClickListener(new getAllDemoTiles(this));
        }
    }

    public final void RatingCompat() {
        this.accountSummaryAddButton.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH");
            getActivity().sendBroadcast(intent);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.cusIvProfile.setBorderState(5);
        this.cusIvProfile.setClickable(true);
        this.IconCompatParcelizer = false;
    }

    public final void IconCompatParcelizer() {
        this.cusIvProfile.setBorderState(2);
        this.cusIvProfile.setClickable(true);
        this.IconCompatParcelizer = true;
    }

    public final void write() {
        this.cusIvProfile.setBorderState(1);
        this.cusIvProfile.setClickable(true);
        this.IconCompatParcelizer = false;
    }

    public final void read() {
        this.cusIvProfile.setClickable(false);
        this.cusIvProfile.setBorderState(0);
        this.IconCompatParcelizer = false;
    }

    public static /* synthetic */ void write(AccountSummaryFragment accountSummaryFragment, Intent intent) {
        getSettingsFile getsettingsfile;
        String action = intent.getAction();
        boolean z = false;
        if ("com.scb.phone/BROADCAST_HIDE_SWIPE_REFRESH".equals(action)) {
            int i = accountSummaryFragment.RatingCompat + 1;
            accountSummaryFragment.RatingCompat = i;
            if (i == 4) {
                accountSummaryFragment.az_();
                accountSummaryFragment.RatingCompat = 0;
            }
        } else if ("com.scb.phone/BROADCAST_PROFILE_UPDATED".equals(action) && (getsettingsfile = accountSummaryFragment.accountSummaryPresenter) != null) {
            writeFrame writeframe = new writeFrame(getsettingsfile);
            if (getsettingsfile.RatingCompat != null) {
                z = true;
            }
            if (z) {
                writeframe.IconCompatParcelizer(getsettingsfile.RatingCompat);
            }
        }
    }
}
