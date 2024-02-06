package com.scb.phone.view.activity.remittance;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.remittance.RemittanceReviewFragment;
import p040o.CardView;
import p040o.onGetStartedClick;
import p040o.setImportance;

public final class RemittanceReviewActivity extends BaseActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);
    private setImportance MediaMetadataCompat;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f76792131492904);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = (setImportance) getIntent().getParcelableExtra("EXTRA_REMITTANCE_REVIEW_DISPLAY");
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.remittance_review_title);
        setImportance setimportance = this.MediaMetadataCompat;
        if (setimportance != null) {
            CardView read = getSupportFragmentManager().read();
            RemittanceReviewFragment.IconCompatParcelizer iconCompatParcelizer = RemittanceReviewFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) setimportance, "display");
            RemittanceReviewFragment remittanceReviewFragment = new RemittanceReviewFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("EXTRA_REVIEW_REMITTANCE_DISPLAY", setimportance);
            remittanceReviewFragment.setArguments(bundle2);
            read.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, remittanceReviewFragment).write();
        }
        mo13676d_("outward_remittance_review");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.remittance_review_title);
    }
}
