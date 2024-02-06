package com.scb.phone.view.fragment.investment.scbs.open;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.investment.scbs.open.SuitabilitySummaryAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C7129hC;
import p040o.CheckCaptureExperienceCriteriaHolder;
import p040o.CheckSCBSEligibilityActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.GoogleJsonResponseException;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.InvestmentFundDetailsActivity;
import p040o.StandardTable;
import p040o.getLocale;
import p040o.getRating;
import p040o.onBeginSession;
import p040o.onEndSession;
import p040o.onGetStartedClick;
import p040o.persistUserId;
import p040o.setCaptureCriteria;
import p040o.setCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.writeUInt64NoTag;

public final class SuitabilityQuestionsSummaryFragment extends BaseFragment implements C7129hC {
    private SuitabilitySummaryAdapter IconCompatParcelizer;
    private FragmentBuilder_BindCalendarDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public setCaptureCriteria presenter;
    @BindView
    public RecyclerView rvSuitabilitySummary;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> {
        IconCompatParcelizer(setCaptureCriteria setcapturecriteria) {
            super(0, setcapturecriteria);
        }

        public final String getName() {
            return "onNextEvent";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(setCaptureCriteria.class);
        }

        public final String getSignature() {
            return "onNextEvent()V";
        }

        public final /* synthetic */ Object invoke() {
            setCaptureCriteria setcapturecriteria = (setCaptureCriteria) this.receiver;
            if (setcapturecriteria.RatingCompat != null) {
                setcapturecriteria.RatingCompat.AlertController$RecycleListView();
            }
            DebitCardResetOtpActivity<getRating> MediaBrowserCompat$ItemReceiver = setcapturecriteria.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
            GoogleJsonResponseException googleJsonResponseException = setcapturecriteria.MediaBrowserCompat$ItemReceiver;
            setCaptureCriteria setcapturecriteria2 = setcapturecriteria;
            googleJsonResponseException.read(MediaBrowserCompat$ItemReceiver, new CheckCaptureExperienceCriteriaHolder(new setCaptureCriteria.write(setcapturecriteria2)), new CheckCaptureExperienceCriteriaHolder(new setCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver(setcapturecriteria2)));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89712131494198, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        setCaptureCriteria setcapturecriteria = this.presenter;
        if (setcapturecriteria == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setcapturecriteria.MediaBrowserCompat$ItemReceiver(this);
        setCaptureCriteria setcapturecriteria2 = this.presenter;
        if (setcapturecriteria2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        StandardTable.Row.RowEntrySet rowEntrySet = setcapturecriteria2.write;
        List<getLocale> PlaybackStateCompat = setcapturecriteria2.read.MediaBrowserCompat$CustomActionResultReceiver.PlaybackStateCompat();
        onGetStartedClick.IconCompatParcelizer((Object) PlaybackStateCompat, "securitiesRepository.suitabilitiesSummary");
        onGetStartedClick.write((Object) PlaybackStateCompat, "sectionItems");
        List arrayList = new ArrayList();
        arrayList.add(onEndSession.MediaBrowserCompat$CustomActionResultReceiver);
        Collection arrayList2 = new ArrayList();
        for (getLocale read : PlaybackStateCompat) {
            HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(arrayList2, rowEntrySet.read(read));
        }
        arrayList.addAll((List) arrayList2);
        arrayList.add(onBeginSession.write);
        writeUInt64NoTag.IconCompatParcelizer read2 = new setCaptureCriteria.read(arrayList);
        if (setcapturecriteria2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            read2.IconCompatParcelizer(setcapturecriteria2.RatingCompat);
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<? extends persistUserId> list) {
        onGetStartedClick.write((Object) list, "displays");
        setCaptureCriteria setcapturecriteria = this.presenter;
        if (setcapturecriteria == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        this.IconCompatParcelizer = new SuitabilitySummaryAdapter(list, new IconCompatParcelizer(setcapturecriteria));
        RecyclerView recyclerView = this.rvSuitabilitySummary;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvSuitabilitySummary");
        }
        SuitabilitySummaryAdapter suitabilitySummaryAdapter = this.IconCompatParcelizer;
        if (suitabilitySummaryAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("suitabilitySummaryAdapter");
        }
        recyclerView.setAdapter(suitabilitySummaryAdapter);
    }

    public final void read() {
        FragmentBuilder_BindCalendarDialogFragment fragmentBuilder_BindCalendarDialogFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindCalendarDialogFragment != null) {
            fragmentBuilder_BindCalendarDialogFragment.setOverlayMode();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof FragmentBuilder_BindCalendarDialogFragment)) {
            context = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindCalendarDialogFragment) context;
    }

    public static final SuitabilityQuestionsSummaryFragment MediaBrowserCompat$ItemReceiver() {
        return new SuitabilityQuestionsSummaryFragment();
    }
}
