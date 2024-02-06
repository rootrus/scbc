package com.scb.phone.view.fragment.easycash.loaninformation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import java.util.Locale;
import p040o.C4588xd4fb11e;
import p040o.C5437u;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.HmlPinActivity;
import p040o.SequentialSearchService;
import p040o.ZSYR2K;
import p040o.dispatchCrashlyticsOriginEvent;
import p040o.forEachClear;
import p040o.getImageOriginalDateTime;
import p040o.getRtpSubscriptionRecommandedBiller;
import p040o.getValueReference;
import p040o.isRooted;
import p040o.setRotateType;
import p040o.subscribe;
import p040o.writeUInt64NoTag;

public class EasycashFeaturesPurposefulLoanInformationFragment extends BasePurposefulCommercialFeaturesLoanInformationFragment implements CheckExtractActivity_MembersInjector.setVisibility, AmountEditText.read, AmountEditText.write {
    @BindView
    protected AmountEditText amountEditText;
    @HmlPinActivity
    public getImageOriginalDateTime presenter;

    public static EasycashFeaturesPurposefulLoanInformationFragment read(isRooted isrooted) {
        EasycashFeaturesPurposefulLoanInformationFragment easycashFeaturesPurposefulLoanInformationFragment = new EasycashFeaturesPurposefulLoanInformationFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.activity.easycash.LOAN_DISPLAY", isrooted);
        easycashFeaturesPurposefulLoanInformationFragment.setArguments(bundle);
        return easycashFeaturesPurposefulLoanInformationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.write((writeUInt64NoTag) this.presenter);
        View inflate = layoutInflater.inflate(R.layout.f86992131493926, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getContext();
        this.durationRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.presenter.MediaBrowserCompat$CustomActionResultReceiver((isRooted) arguments.getParcelable("com.scb.phone.view.activity.easycash.LOAN_DISPLAY"), this.MediaBrowserCompat$CustomActionResultReceiver.write());
        }
        this.amountEditText.setCustomHint(getString(R.string.easycash_amount_hint));
        this.amountEditText.setOnAmountChangeListener(this);
        this.amountEditText.setOnHandleDismissKeyboardListener(this);
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        PlaybackStateCompat$CustomAction();
        this.presenter.read(this.amountEditText.getText().toString(), getContext());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
        getImageOriginalDateTime getimageoriginaldatetime = this.presenter;
        setRotateType setrotatetype = setRotateType.MediaBrowserCompat$CustomActionResultReceiver;
        if (getimageoriginaldatetime.RatingCompat != null) {
            setrotatetype.IconCompatParcelizer(getimageoriginaldatetime.RatingCompat);
        }
    }

    public final void write() {
        this.presenter.read(this.amountEditText.getText().toString(), getContext());
    }

    public final void IconCompatParcelizer(String str) {
        this.amountInputLayout.setError(str);
    }

    public final void write(subscribe subscribe) {
        this.cardSelector.MediaBrowserCompat$CustomActionResultReceiver(subscribe, true, new ViewPager.MediaMetadataCompat() {
            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                EasycashFeaturesPurposefulLoanInformationFragment.this.presenter.write(i, true);
            }

            public final void onPageScrollStateChanged(int i) {
                EasycashFeaturesPurposefulLoanInformationFragment.this.amountEditText.setFormattedAmount("0");
                getImageOriginalDateTime getimageoriginaldatetime = EasycashFeaturesPurposefulLoanInformationFragment.this.presenter;
                setRotateType setrotatetype = setRotateType.MediaBrowserCompat$CustomActionResultReceiver;
                boolean z = true;
                if (getimageoriginaldatetime.RatingCompat != null) {
                    setrotatetype.IconCompatParcelizer(getimageoriginaldatetime.RatingCompat);
                }
                C5437u uVar = new C5437u(getimageoriginaldatetime);
                if (getimageoriginaldatetime.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    uVar.IconCompatParcelizer(getimageoriginaldatetime.RatingCompat);
                }
                EasycashFeaturesPurposefulLoanInformationFragment.this.read();
            }
        });
    }

    public final void read() {
        this.amountInputLayout.setError((CharSequence) null);
    }

    public final void read(dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent) {
        this.IconCompatParcelizer = new getRtpSubscriptionRecommandedBiller(dispatchcrashlyticsoriginevent, new SequentialSearchService(this, dispatchcrashlyticsoriginevent));
        super.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }

    public final /* synthetic */ void write(dispatchCrashlyticsOriginEvent dispatchcrashlyticsoriginevent, int i) {
        getImageOriginalDateTime getimageoriginaldatetime = this.presenter;
        int intValue = dispatchcrashlyticsoriginevent.read.get(i).intValue();
        String obj = this.amountEditText.getText().toString();
        getimageoriginaldatetime.IconCompatParcelizer(intValue);
        getimageoriginaldatetime.read.MediaBrowserCompat$CustomActionResultReceiver(new getValueReference(getimageoriginaldatetime.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer, getimageoriginaldatetime.MediaBrowserCompat$SearchResultReceiver.read, obj.replaceAll(",", ""), intValue));
        getimageoriginaldatetime.read.IconCompatParcelizer(new C4588xd4fb11e(getimageoriginaldatetime, (byte) 0));
    }

    @OnClick
    public void onNextButtonClick() {
        PlaybackStateCompat$CustomAction();
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", this.MediaBrowserCompat$CustomActionResultReceiver.write()));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("tenor", String.valueOf(this.presenter.write().MediaBrowserCompat$CustomActionResultReceiver)));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("amount", String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(this.presenter.write().read)})));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_program", this.presenter.write().AlertController$RecycleListView));
        forEachClear foreachclear = this.tracker;
        if (getActivity() != null) {
            foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_feature");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.presenter.write());
        this.MediaMetadataCompat.IconCompatParcelizer(this, new EasycashLoanFeaturesAccountFragment());
    }

    public void onDestroyView() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.presenter.onDestroy();
        super.onDestroyView();
    }
}
