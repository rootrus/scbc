package com.scb.phone.view.fragment.investment.onboarding;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.Arrays;
import java.util.List;
import p040o.ActivityBuilder_BindNtbDiscoverDisclaimerActivity;
import p040o.ActivityBuilder_BindNtbDiscoverSearchActivity;
import p040o.ActivityBuilder_BindOPRRegistrationLandingPageActivity;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.HmlPinActivity;
import p040o.injectRttiCheckDeserializer;
import p040o.setTorchDelay;
import p040o.setTorchDelay$MediaBrowserCompat$ItemReceiver;

public class FundInvestmentExperienceFragment extends BaseFragment implements injectRttiCheckDeserializer.read {
    private write IconCompatParcelizer;
    private read MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindCalendarDialogFragment RatingCompat;
    @BindView
    Button buttonNext;
    @HmlPinActivity
    public setTorchDelay fundInvestmentExperiencePresenter;
    @BindView
    RecyclerView recyclerViewExperience;
    @BindView
    public RecyclerView recyclerViewHoldingTax;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.RatingCompat = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88402131494067, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fundInvestmentExperiencePresenter.MediaBrowserCompat$ItemReceiver(this);
        this.buttonNext.setEnabled(false);
        String[] stringArray = getResources().getStringArray(R.array.f64752130903054);
        String[] stringArray2 = getResources().getStringArray(R.array.f64762130903055);
        write write2 = new write(new ActivityBuilder_BindNtbDiscoverDisclaimerActivity(this));
        this.IconCompatParcelizer = write2;
        List asList = Arrays.asList(stringArray);
        write2.MediaBrowserCompat$ItemReceiver.clear();
        write2.MediaBrowserCompat$ItemReceiver.addAll(asList);
        write2.IconCompatParcelizer.write();
        this.recyclerViewExperience.setAdapter(this.IconCompatParcelizer);
        read read2 = new read(new ActivityBuilder_BindNtbDiscoverSearchActivity(this));
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
        List asList2 = Arrays.asList(stringArray2);
        read2.MediaBrowserCompat$ItemReceiver.clear();
        read2.MediaBrowserCompat$ItemReceiver.addAll(asList2);
        read2.IconCompatParcelizer.write();
        this.recyclerViewHoldingTax.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.recyclerViewHoldingTax.post(new ActivityBuilder_BindOPRRegistrationLandingPageActivity(this));
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("mfonboard_investmentquestion");
        }
        return inflate;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindCalendarDialogFragment fragmentBuilder_BindCalendarDialogFragment = this.RatingCompat;
        if (fragmentBuilder_BindCalendarDialogFragment != null) {
            fragmentBuilder_BindCalendarDialogFragment.setOverlayMode();
        }
    }

    @OnClick
    public void onNextButtonClick() {
        setTorchDelay settorchdelay = this.fundInvestmentExperiencePresenter;
        if (settorchdelay.RatingCompat != null) {
            settorchdelay.RatingCompat.AlertController$RecycleListView();
        }
        CustomConcurrentHashMap.WriteThroughEntry writeThroughEntry = new CustomConcurrentHashMap.WriteThroughEntry();
        writeThroughEntry.MediaBrowserCompat$ItemReceiver = settorchdelay.read ? "Y" : "N";
        writeThroughEntry.write = settorchdelay.IconCompatParcelizer;
        settorchdelay.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(writeThroughEntry);
        settorchdelay.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setTorchDelay$MediaBrowserCompat$ItemReceiver(settorchdelay));
    }

    class write extends SelectableChoiceAdapter {
        public write(SelectableChoiceAdapter.IconCompatParcelizer iconCompatParcelizer) {
            super(iconCompatParcelizer);
        }
    }

    class read extends SelectableChoiceAdapter {
        public read(SelectableChoiceAdapter.IconCompatParcelizer iconCompatParcelizer) {
            super(iconCompatParcelizer);
        }
    }

    public static /* synthetic */ void write(FundInvestmentExperienceFragment fundInvestmentExperienceFragment, String str) {
        setTorchDelay settorchdelay = fundInvestmentExperienceFragment.fundInvestmentExperiencePresenter;
        settorchdelay.IconCompatParcelizer = str;
        settorchdelay.write();
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(FundInvestmentExperienceFragment fundInvestmentExperienceFragment, int i) {
        boolean z = i == 0;
        setTorchDelay settorchdelay = fundInvestmentExperienceFragment.fundInvestmentExperiencePresenter;
        settorchdelay.read = z;
        settorchdelay.write = true;
        settorchdelay.write();
    }
}
