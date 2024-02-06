package com.scb.phone.view.activity.cardmanagement;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.data.network.service.PartnerConsentService;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.RealWrapContentViewPager;
import p040o.CreditCardParameters_Factory;
import p040o.FirebaseTooManyRequestsException;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;

public abstract class BaseAmortizationActivity extends BaseActivity implements CreditCardParameters_Factory {
    @BindView
    public ImageButton btnScrollDown;
    @BindView
    public NestedScrollView nsvRoot;
    @BindView
    public CustomTabLayout tabAmortization;
    @BindView
    public TextView tvMessageBottom;
    @BindView
    public RealWrapContentViewPager vpAmortization;

    public static final class read {
        public final PartnerConsentService IconCompatParcelizer;

        private read() {
        }

        @HmlPinActivity
        public read(PartnerConsentService partnerConsentService) {
            onGetStartedClick.write((Object) partnerConsentService, "partnerConsentService");
            this.IconCompatParcelizer = partnerConsentService;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77272131492952);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        ImageButton imageButton = this.btnScrollDown;
        if (imageButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnScrollDown");
        }
        imageButton.setOnClickListener(new write(this));
        NestedScrollView nestedScrollView = this.nsvRoot;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
        }
        nestedScrollView.setOnScrollChangeListener(new IconCompatParcelizer(this));
        setStackedBackground();
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ BaseAmortizationActivity read;

        write(BaseAmortizationActivity baseAmortizationActivity) {
            this.read = baseAmortizationActivity;
        }

        public final void onClick(View view) {
            BaseAmortizationActivity.IconCompatParcelizer(this.read);
        }
    }

    static final class IconCompatParcelizer implements NestedScrollView.IconCompatParcelizer {
        private /* synthetic */ BaseAmortizationActivity MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(BaseAmortizationActivity baseAmortizationActivity) {
            this.MediaBrowserCompat$ItemReceiver = baseAmortizationActivity;
        }

        public final void write(NestedScrollView nestedScrollView, int i, int i2) {
            BaseAmortizationActivity.read(this.MediaBrowserCompat$ItemReceiver, i);
        }
    }

    public final void read(FirebaseTooManyRequestsException firebaseTooManyRequestsException) {
        onGetStartedClick.write((Object) firebaseTooManyRequestsException, "displays");
        RealWrapContentViewPager realWrapContentViewPager = this.vpAmortization;
        if (realWrapContentViewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpAmortization");
        }
        realWrapContentViewPager.setAdapter(new C5566x7e32288c(this, firebaseTooManyRequestsException, getSupportFragmentManager()));
        NestedScrollView nestedScrollView = this.nsvRoot;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
        }
        nestedScrollView.post(new MediaDescriptionCompat(this, 0));
        CustomTabLayout customTabLayout = this.tabAmortization;
        if (customTabLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tabAmortization");
        }
        RealWrapContentViewPager realWrapContentViewPager2 = this.vpAmortization;
        if (realWrapContentViewPager2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("vpAmortization");
        }
        customTabLayout.setupWithViewPager(realWrapContentViewPager2);
    }

    static final class MediaDescriptionCompat implements Runnable {
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ BaseAmortizationActivity read;

        MediaDescriptionCompat(BaseAmortizationActivity baseAmortizationActivity, int i) {
            this.read = baseAmortizationActivity;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final void run() {
            int i = this.MediaBrowserCompat$ItemReceiver;
            NestedScrollView nestedScrollView = this.read.nsvRoot;
            if (nestedScrollView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
            }
            View childAt = nestedScrollView.getChildAt(0);
            onGetStartedClick.IconCompatParcelizer((Object) childAt, "nsvRoot.getChildAt(0)");
            int measuredHeight = childAt.getMeasuredHeight();
            NestedScrollView nestedScrollView2 = this.read.nsvRoot;
            if (nestedScrollView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
            }
            if (i == measuredHeight - nestedScrollView2.getMeasuredHeight()) {
                ImageButton imageButton = this.read.btnScrollDown;
                if (imageButton == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnScrollDown");
                }
                imageButton.setVisibility(8);
                return;
            }
            ImageButton imageButton2 = this.read.btnScrollDown;
            if (imageButton2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnScrollDown");
            }
            imageButton2.setVisibility(0);
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(BaseAmortizationActivity baseAmortizationActivity) {
        NestedScrollView nestedScrollView = baseAmortizationActivity.nsvRoot;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
        }
        nestedScrollView.post(new BaseAmortizationActivity$MediaBrowserCompat$ItemReceiver(baseAmortizationActivity));
    }

    public static final /* synthetic */ void read(BaseAmortizationActivity baseAmortizationActivity, int i) {
        NestedScrollView nestedScrollView = baseAmortizationActivity.nsvRoot;
        if (nestedScrollView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("nsvRoot");
        }
        nestedScrollView.post(new MediaDescriptionCompat(baseAmortizationActivity, i));
    }
}
