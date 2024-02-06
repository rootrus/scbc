package com.scb.phone.view.fragment.otppin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.adapter.otp.MobileListAdapter;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AppStatsState;
import p040o.FragmentBuilder_BindCcSofCreditCardOnlyFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TileOverlay;
import p040o.access$2200;
import p040o.countIn;
import p040o.getAdditionalBottomScanLinesHeight;
import p040o.getContents;
import p040o.makeMap;
import p040o.setCheckParameters;
import p040o.setTapText;

public class MobileListFragment extends BaseFragment implements FragmentBuilder_BindCcSofCreditCardOnlyFragment, setCheckParameters {
    private MobileListAdapter IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    private getAdditionalBottomScanLinesHeight MediaBrowserCompat$MediaItem;
    private String MediaMetadataCompat;
    private String RatingCompat;
    @HmlPinActivity
    public countIn appConfigUseCase;
    @BindView
    TextView belowLabelTextView;
    @BindView
    TextView findUsTextView;
    @BindView
    DefaultButton goToOtpButton;
    @BindView
    RecyclerView mobileList;
    @HmlPinActivity
    public AppStatsState mobileNumberPresenter;

    public static MobileListFragment IconCompatParcelizer(String str) {
        MobileListFragment mobileListFragment = new MobileListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_LABEL_BELOW", str);
        mobileListFragment.setArguments(bundle);
        return mobileListFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaBrowserCompat$MediaItem = (getAdditionalBottomScanLinesHeight) getActivity();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88502131494077, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mobileNumberPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.mobileNumberPresenter.read = this.MediaBrowserCompat$CustomActionResultReceiver;
        setTransitioning();
        ArrayList parcelableArrayListExtra = getActivity().getIntent().getParcelableArrayListExtra("MOBILE_LIST");
        this.IconCompatParcelizer = new MobileListAdapter();
        getContext();
        boolean z = true;
        this.mobileList.setLayoutManager(new LinearLayoutManager(1, false));
        this.mobileList.setAdapter(this.IconCompatParcelizer);
        this.mobileList.setHasFixedSize(false);
        this.mobileList.setNestedScrollingEnabled(false);
        this.IconCompatParcelizer.read = this;
        if (parcelableArrayListExtra != null && !parcelableArrayListExtra.isEmpty()) {
            z = false;
        }
        if (!z) {
            this.IconCompatParcelizer.write = parcelableArrayListExtra;
        } else {
            AlertController$RecycleListView();
            AppStatsState appStatsState = this.mobileNumberPresenter;
            TileOverlay tileOverlay = appStatsState.write;
            makeMap makemap = new makeMap();
            makemap.IconCompatParcelizer = "all";
            makemap.write = "";
            tileOverlay.IconCompatParcelizer(makemap);
            appStatsState.write.IconCompatParcelizer(new AppStatsState.read(appStatsState, (byte) 0));
        }
        this.goToOtpButton.setButtonEnabled(false);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("ARG_LABEL_BELOW") : null;
        if (string != null) {
            this.belowLabelTextView.setText(string);
        }
        this.findUsTextView.setVisibility(0);
        return inflate;
    }

    public void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.otp_title));
    }

    public final void MediaBrowserCompat$ItemReceiver(getContents getcontents) {
        if (this.IconCompatParcelizer != null) {
            this.RatingCompat = getcontents.write;
            this.MediaMetadataCompat = getcontents.MediaBrowserCompat$CustomActionResultReceiver;
            this.IconCompatParcelizer.IconCompatParcelizer.write();
            if (!this.goToOtpButton.isEnabled()) {
                this.goToOtpButton.setButtonEnabled(true);
            }
        }
    }

    @OnClick
    public void goToFindUs() {
        Intent intent = new Intent(getActivity(), FindUsActivity.class);
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

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<getContents> list) {
        aj_();
        this.IconCompatParcelizer.write = list;
        this.IconCompatParcelizer.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        aj_();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mobileNumberPresenter.write((int) R.string.mobile_number_not_found);
    }

    public final void write(access$2200 access_2200) {
        aj_();
        super.write(access_2200);
    }

    public void onDestroy() {
        this.mobileNumberPresenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void goToOtpPage() {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver("OTP_PIN_FRAGMENT_TAG", this.RatingCompat, this.MediaMetadataCompat);
    }
}
