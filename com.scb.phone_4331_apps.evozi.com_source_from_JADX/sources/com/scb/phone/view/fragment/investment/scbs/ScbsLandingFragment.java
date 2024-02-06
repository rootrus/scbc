package com.scb.phone.view.fragment.investment.scbs;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.github.mikephil.charting.charts.PieChart;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.scbs.ScbsAccountDetailActivity;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingConsentActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.adapter.investment.scbs.LandingAccountsAdapter;
import com.scb.phone.view.adapter.investment.scbs.PieChartLegendAdapter;
import com.scb.phone.view.fragment.BaseHeaderAndFooterFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_BindRtpEBillSubscriptionDetailActivity;
import p040o.C4011x6406d919;
import p040o.FragmentBuilder_BindDummyAndroid41Fragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.NativeSessionFile;
import p040o.PassportParameters_Factory;
import p040o.TabParser$TabParserException;
import p040o.add;
import p040o.addI16;
import p040o.addI64;
import p040o.addLicenseFoundEventListener;
import p040o.addMatrix;
import p040o.addU16;
import p040o.forEachDst;
import p040o.getRoll;
import p040o.getUserDataFileForSession;
import p040o.isComplex;
import p040o.onCreateDialog;
import p040o.onScale;
import p040o.onStart;
import p040o.populateBinaryImageData;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.writeUserData;

public class ScbsLandingFragment extends BaseHeaderAndFooterFragment<NativeSessionFile> implements PassportParameters_Factory {
    private HeaderBinding IconCompatParcelizer;
    /* access modifiers changed from: private */
    public forEachDst MediaBrowserCompat$CustomActionResultReceiver = new forEachDst();
    @HmlPinActivity
    public addLicenseFoundEventListener scbsLandingPresenter;

    public class HeaderBinding_ViewBinding implements Unbinder {
        private View IconCompatParcelizer;
        private View MediaBrowserCompat$ItemReceiver;
        private HeaderBinding write;

        public HeaderBinding_ViewBinding(final HeaderBinding headerBinding, View view) {
            this.write = headerBinding;
            headerBinding.marketValueText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_market_value, "field 'marketValueText'", TextView.class);
            headerBinding.netGainText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_net_gain, "field 'netGainText'", TextView.class);
            headerBinding.asOfDateText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_as_of_date, "field 'asOfDateText'", TextView.class);
            headerBinding.marketValueArrowImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_market_value_arrow, "field 'marketValueArrowImage'", ImageView.class);
            headerBinding.pieChart = (PieChart) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scbs_pie_chart, "field 'pieChart'", PieChart.class);
            View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_button_trade_now, "field 'tradeNowButton' and method 'tradeNowButtonClicked'");
            headerBinding.tradeNowButton = IconCompatParcelizer2;
            this.IconCompatParcelizer = IconCompatParcelizer2;
            IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    HeaderBinding.this.tradeNowButtonClicked(view);
                }
            });
            View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_button_open_other, "field 'otherProductButton' and method 'otherProductButtonClicked'");
            headerBinding.otherProductButton = IconCompatParcelizer3;
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
            IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    HeaderBinding.this.otherProductButtonClicked(view);
                }
            });
            headerBinding.legendRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rv_legend_recycler_view, "field 'legendRecyclerView'", RecyclerView.class);
        }

        public final void read() {
            HeaderBinding headerBinding = this.write;
            if (headerBinding != null) {
                this.write = null;
                headerBinding.marketValueText = null;
                headerBinding.netGainText = null;
                headerBinding.asOfDateText = null;
                headerBinding.marketValueArrowImage = null;
                headerBinding.pieChart = null;
                headerBinding.tradeNowButton = null;
                headerBinding.otherProductButton = null;
                headerBinding.legendRecyclerView = null;
                this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
                this.IconCompatParcelizer = null;
                this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
                this.MediaBrowserCompat$ItemReceiver = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static ScbsLandingFragment IconCompatParcelizer() {
        return new ScbsLandingFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.IconCompatParcelizer.pieChart.setHoleRadius(35.0f);
        this.IconCompatParcelizer.pieChart.setTransparentCircleRadius(35.0f);
        this.IconCompatParcelizer.pieChart.setRotationAngle(BitmapDescriptorFactory.HUE_RED);
        this.IconCompatParcelizer.pieChart.setExtraOffsets(-4.0f, -4.0f, -4.0f, -4.0f);
        this.IconCompatParcelizer.pieChart.setRotationEnabled(false);
        this.IconCompatParcelizer.pieChart.setHighlightPerTapEnabled(false);
        this.IconCompatParcelizer.pieChart.setRotationAngle(270.0f);
        this.IconCompatParcelizer.pieChart.MediaSessionCompat$Token();
        this.IconCompatParcelizer.pieChart.MediaBrowserCompat$CustomActionResultReceiver(isComplex.IconCompatParcelizer);
        this.IconCompatParcelizer.pieChart.MediaSessionCompat$QueueItem().MediaSessionCompat$ResultReceiverWrapper = false;
        this.IconCompatParcelizer.pieChart.setDescription((add) null);
        this.IconCompatParcelizer.pieChart.setDrawEntryLabels(false);
        this.scbsLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        forEachDst foreachdst = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            foreachdst.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "scbs_portfolio");
        }
        addLicenseFoundEventListener addlicensefoundeventlistener = this.scbsLandingPresenter;
        if (addlicensefoundeventlistener.RatingCompat != null) {
            addlicensefoundeventlistener.RatingCompat.AlertController$RecycleListView();
        }
        addlicensefoundeventlistener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        addlicensefoundeventlistener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4011x6406d919(addlicensefoundeventlistener, (byte) 0));
        return onCreateView;
    }

    public final TabParser$TabParserException<NativeSessionFile> IconCompatParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.IconCompatParcelizer = new HeaderBinding();
        View inflate = layoutInflater.inflate(R.layout.f90962131494323, viewGroup, false);
        View inflate2 = layoutInflater.inflate(R.layout.f90952131494322, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this.IconCompatParcelizer, inflate);
        LandingAccountsAdapter landingAccountsAdapter = new LandingAccountsAdapter(getContext(), inflate2, new Space(getContext()));
        landingAccountsAdapter.read = inflate;
        landingAccountsAdapter.MediaBrowserCompat$SearchResultReceiver = new ActivityBuilder_BindRtpEBillSubscriptionDetailActivity(this);
        return landingAccountsAdapter;
    }

    public void onDestroy() {
        this.scbsLandingPresenter.onDestroy();
        super.onDestroy();
    }

    public final void read(writeUserData writeuserdata) {
        this.IconCompatParcelizer.marketValueText.setText(writeuserdata.MediaBrowserCompat$SearchResultReceiver);
        this.IconCompatParcelizer.netGainText.setText(writeuserdata.MediaMetadataCompat);
        this.IconCompatParcelizer.netGainText.setTextColor(setLastBaselineToBottomHeight.read(getContext(), writeuserdata.MediaBrowserCompat$MediaItem));
        int i = 0;
        this.IconCompatParcelizer.asOfDateText.setVisibility(writeuserdata.MediaBrowserCompat$CustomActionResultReceiver == null ? 8 : 0);
        this.IconCompatParcelizer.asOfDateText.setText(writeuserdata.MediaBrowserCompat$CustomActionResultReceiver);
        this.IconCompatParcelizer.marketValueArrowImage.setImageResource(writeuserdata.read);
        write(writeuserdata.MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer.tradeNowButton.setVisibility(writeuserdata.RatingCompat ? 0 : 8);
        if (writeuserdata.write) {
            PieChart pieChart = this.IconCompatParcelizer.pieChart;
            List<getUserDataFileForSession> list = writeuserdata.MediaDescriptionCompat;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (getUserDataFileForSession next : list) {
                arrayList2.add(new addI64(next.write, next.MediaBrowserCompat$ItemReceiver, ""));
                arrayList.add(Integer.valueOf(Color.parseColor(next.IconCompatParcelizer)));
            }
            addI16 addi16 = new addI16(arrayList2, "");
            addi16.read = arrayList;
            addMatrix addmatrix = new addMatrix(addi16);
            addmatrix.IconCompatParcelizer((addU16) new FragmentBuilder_BindDummyAndroid41Fragment(this.IconCompatParcelizer.pieChart, new DecimalFormat("###,###,###")));
            addmatrix.MediaBrowserCompat$MediaItem();
            addmatrix.IconCompatParcelizer();
            addmatrix.MediaBrowserCompat$CustomActionResultReceiver(Typeface.createFromAsset(getContext().getAssets(), "fonts/PSL001Pro.ttf"));
            pieChart.setData(addmatrix);
            this.IconCompatParcelizer.legendRecyclerView.setNestedScrollingEnabled(false);
            getContext();
            this.IconCompatParcelizer.legendRecyclerView.setLayoutManager(new LinearLayoutManager());
            this.IconCompatParcelizer.legendRecyclerView.setAdapter(new PieChartLegendAdapter(writeuserdata.MediaDescriptionCompat));
            this.IconCompatParcelizer.pieChart.invalidate();
        } else {
            this.IconCompatParcelizer.pieChart.setVisibility(8);
            this.IconCompatParcelizer.legendRecyclerView.setVisibility(8);
        }
        View view = this.IconCompatParcelizer.otherProductButton;
        if (writeuserdata.IconCompatParcelizer) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void read(String str) {
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaBrowserCompat$ItemReceiver(context, str);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read(populateBinaryImageData populatebinaryimagedata) {
        ScbsAccountDetailActivity.MediaBrowserCompat$ItemReceiver(getContext(), populatebinaryimagedata);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ScbsOnboardingConsentActivity.read(getContext());
    }

    public class HeaderBinding {
        @BindView
        TextView asOfDateText;
        @BindView
        RecyclerView legendRecyclerView;
        @BindView
        ImageView marketValueArrowImage;
        @BindView
        TextView marketValueText;
        @BindView
        TextView netGainText;
        @BindView
        View otherProductButton;
        @BindView
        PieChart pieChart;
        @BindView
        View tradeNowButton;

        public HeaderBinding() {
        }

        @OnClick
        public void tradeNowButtonClicked(View view) {
            ScbsLandingFragment.this.MediaBrowserCompat$CustomActionResultReceiver.read("source", "SCBS_landing");
            ScbsLandingFragment scbsLandingFragment = ScbsLandingFragment.this;
            forEachDst write = scbsLandingFragment.MediaBrowserCompat$CustomActionResultReceiver;
            if (scbsLandingFragment.getActivity() != null) {
                write.MediaBrowserCompat$ItemReceiver(((BaseActivity) scbsLandingFragment.getActivity()).scbAnalytics, "trade_now");
            }
            addLicenseFoundEventListener addlicensefoundeventlistener = ScbsLandingFragment.this.scbsLandingPresenter;
            getRoll getroll = new getRoll(addlicensefoundeventlistener);
            if (addlicensefoundeventlistener.RatingCompat != null) {
                getroll.IconCompatParcelizer(addlicensefoundeventlistener.RatingCompat);
            }
        }

        @OnClick
        public void otherProductButtonClicked(View view) {
            ScbsLandingFragment scbsLandingFragment = ScbsLandingFragment.this;
            if (scbsLandingFragment.getActivity() != null) {
                ((BaseActivity) scbsLandingFragment.getActivity()).mo13676d_("scbsonboard_open_other");
            }
            addLicenseFoundEventListener addlicensefoundeventlistener = ScbsLandingFragment.this.scbsLandingPresenter;
            if (addlicensefoundeventlistener.IconCompatParcelizer.RatingCompat != null) {
                onScale onscale = new onScale(addlicensefoundeventlistener);
                if (addlicensefoundeventlistener.RatingCompat != null) {
                    onscale.IconCompatParcelizer(addlicensefoundeventlistener.RatingCompat);
                }
            }
        }
    }
}
