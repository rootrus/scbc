package com.scb.phone.view.fragment.hml.businessowner;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.hml.HmlBanksGridAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import p040o.AppMeasurementSdk;
import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsController;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.LinkedListMultimap;
import p040o.StreetViewPanoramaFragment;
import p040o.WscDestination;
import p040o.WscDestination$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.proxyGetOnDeviceExtractionServer;
import p040o.setEagerLoadingEnabled;
import p040o.setInlineLabel;

public final class HmlOperatingBankFragment extends BaseFragment implements proxyGetOnDeviceExtractionServer {
    public static final HmlOperatingBankFragment$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new HmlOperatingBankFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    private HmlBanksGridAdapter IconCompatParcelizer;
    private final HmlVerifyEmailActivity RatingCompat;
    @BindView
    public GridView bankGrid;
    @HmlPinActivity
    public WscDestination presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ HmlOperatingBankFragment MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(HmlOperatingBankFragment hmlOperatingBankFragment) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = hmlOperatingBankFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2;
            boolean z;
            int intValue = ((Number) obj).intValue();
            WscDestination wscDestination = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (wscDestination == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (wscDestination.RatingCompat != null) {
                wscDestination.RatingCompat.AlertController$RecycleListView();
            }
            StreetViewPanoramaFragment streetViewPanoramaFragment = null;
            try {
                Iterator it = wscDestination.read.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    String str = ((StreetViewPanoramaFragment) obj2).MediaBrowserCompat$CustomActionResultReceiver;
                    onGetStartedClick.IconCompatParcelizer((Object) str, "it.code");
                    if (Integer.parseInt(str) == intValue) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                streetViewPanoramaFragment = (StreetViewPanoramaFragment) obj2;
            } catch (NumberFormatException unused) {
            }
            LinkedListMultimap.C35733 r9 = wscDestination.IconCompatParcelizer;
            FundActionsSuccessActivity write = new WscDestination.write(wscDestination);
            FundFactSheetActivity read = new WscDestination.read(wscDestination);
            onGetStartedClick.write((Object) write, "onComplete");
            onGetStartedClick.write((Object) read, "onError");
            r9.write.MediaBrowserCompat$ItemReceiver(write, read, new setInlineLabel.IconCompatParcelizer(streetViewPanoramaFragment), r9.MediaBrowserCompat$ItemReceiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public HmlOperatingBankFragment() {
        FundActionsSuccessActivity write2 = new write(this);
        onGetStartedClick.write((Object) write2, "initializer");
        this.RatingCompat = new HmlVerifyPhoneTermsConditionsActivity(write2);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87992131494026, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        Context context = getContext();
        if (context != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            this.IconCompatParcelizer = new HmlBanksGridAdapter(context, new IconCompatParcelizer(this));
            GridView gridView = this.bankGrid;
            if (gridView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("bankGrid");
            }
            gridView.setAdapter(this.IconCompatParcelizer);
        }
        WscDestination wscDestination = this.presenter;
        if (wscDestination == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        wscDestination.MediaBrowserCompat$ItemReceiver(this);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_business_main_op_account_bank", zsyr2kArr);
        }
        return inflate;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WscDestination wscDestination = this.presenter;
        if (wscDestination == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String stackedBackground = setStackedBackground();
        onGetStartedClick.IconCompatParcelizer((Object) stackedBackground, "language");
        onGetStartedClick.write((Object) stackedBackground, "language");
        if (wscDestination.RatingCompat != null) {
            wscDestination.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35733 r2 = wscDestination.IconCompatParcelizer;
        FundFactSheetActivity wscDestination$MediaBrowserCompat$CustomActionResultReceiver = new WscDestination$MediaBrowserCompat$CustomActionResultReceiver(wscDestination);
        FundFactSheetActivity iconCompatParcelizer = new WscDestination.IconCompatParcelizer(wscDestination);
        onGetStartedClick.write((Object) wscDestination$MediaBrowserCompat$CustomActionResultReceiver, "onNext");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        onGetStartedClick.write((Object) stackedBackground, "language");
        AppMeasurementSdk.OnEventListener onEventListener = r2.MediaBrowserCompat$CustomActionResultReceiver;
        onEventListener.write(onEventListener.write(stackedBackground), new LinkedListMultimap.C35733.read(wscDestination$MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer));
    }

    public final void read(List<CrashlyticsController.C322922> list) {
        onGetStartedClick.write((Object) list, "transformBanks");
        HmlBanksGridAdapter hmlBanksGridAdapter = this.IconCompatParcelizer;
        if (hmlBanksGridAdapter != null) {
            onGetStartedClick.write((Object) list, "data");
            hmlBanksGridAdapter.IconCompatParcelizer = list;
            hmlBanksGridAdapter.notifyDataSetChanged();
        }
    }

    public final void onDestroy() {
        WscDestination wscDestination = this.presenter;
        if (wscDestination == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        wscDestination.onDestroy();
        super.onDestroy();
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<setEagerLoadingEnabled> {
        private /* synthetic */ HmlOperatingBankFragment IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(HmlOperatingBankFragment hmlOperatingBankFragment) {
            super(0);
            this.IconCompatParcelizer = hmlOperatingBankFragment;
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.IconCompatParcelizer.getActivity();
            if (activity != null) {
                return (setEagerLoadingEnabled) activity;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.activity.hml.businessowner.OnOperatingBankNavigation");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ((setEagerLoadingEnabled) this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver()).setContentView();
    }
}
