package com.scb.phone.view.activity.investment.discover;

import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.data.network.service.easycash.EasycashMHMCDetailService;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import p040o.C10867startJob;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.PassportExtractActivity_MembersInjector;
import p040o.access$2300;
import p040o.forEachSrcAtop;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public abstract class BaseDiscoverDisclaimerActivity extends BaseActivityWithFragment implements PassportExtractActivity_MembersInjector, FragmentBuilder_BindCustomizeYourPageFragment {
    private forEachSrcAtop MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public Button btnAccept;
    @HmlPinActivity
    public C10867startJob presenter;

    public final void IconCompatParcelizer(String str) {
    }

    public final int MediaSessionCompat$Token() {
        return R.layout.f77412131492966;
    }

    public final void write(String str) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10867startJob startjob = this.presenter;
        if (startjob == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        startjob.MediaBrowserCompat$ItemReceiver(this);
        C10867startJob startjob2 = this.presenter;
        if (startjob2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10867startJob.write.write;
        if (startjob2.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(startjob2.RatingCompat);
        }
        forEachSrcAtop foreachsrcatop = new forEachSrcAtop();
        this.MediaBrowserCompat$SearchResultReceiver = foreachsrcatop;
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.read, forEachSrcAtop.write.write);
        forEachSrcAtop foreachsrcatop2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcAtop.read.IconCompatParcelizer);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final String au_() {
        String string = getString(R.string.investment_discover_disclaimer_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.inves…iscover_disclaimer_title)");
        return string;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        setResult(-1);
        finish();
    }

    @OnClick
    public final void onAcceptButtonClicked() {
        forEachSrcAtop foreachsrcatop = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop.read(forEachSrcAtop.MediaBrowserCompat$ItemReceiver.read, forEachSrcAtop.write.read);
        forEachSrcAtop foreachsrcatop2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (foreachsrcatop2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mutualFundDiscoveryTracker");
        }
        foreachsrcatop2.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, forEachSrcAtop.read.IconCompatParcelizer);
        C10867startJob startjob = this.presenter;
        if (startjob == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        startjob.IconCompatParcelizer.write.IconCompatParcelizer(true);
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10867startJob.read.IconCompatParcelizer;
        if (startjob.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(startjob.RatingCompat);
        }
    }

    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
        finish();
    }

    public final void setContentView() {
        C10867startJob startjob = this.presenter;
        if (startjob == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10867startJob.IconCompatParcelizer.read;
        if (startjob.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(startjob.RatingCompat);
        }
        startjob.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Button button = this.btnAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnAccept");
        }
        button.setEnabled(false);
    }

    public static final class write {
        public final EasycashMHMCDetailService read;

        private write() {
        }

        @HmlPinActivity
        public write(EasycashMHMCDetailService easycashMHMCDetailService) {
            onGetStartedClick.write((Object) easycashMHMCDetailService, "easycashMHMCDetailService");
            this.read = easycashMHMCDetailService;
        }
    }

    public final void read() {
        String string = getString(R.string.investment_discover_disclaimer_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.inves…iscover_disclaimer_title)");
        immediateFailedFuture immediatefailedfuture = new immediateFailedFuture("DiscoverDisclaimerActivity", (String) null, "MUTUAL_FUND_DISCLAIMER", (String) null, string, (String) null, (String) null, false, false, 616);
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }
}
