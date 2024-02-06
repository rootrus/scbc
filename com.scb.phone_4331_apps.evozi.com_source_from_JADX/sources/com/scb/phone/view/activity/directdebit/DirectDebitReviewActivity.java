package com.scb.phone.view.activity.directdebit;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.directdebit.DirectDebitReviewFragment;
import p040o.AlertController$RecycleListView;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MissingNativeComponent;
import p040o.onGetStartedClick;

public final class DirectDebitReviewActivity extends BaseActivity {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;

    public DirectDebitReviewActivity() {
        FundActionsSuccessActivity read2 = new read(this);
        onGetStartedClick.write((Object) read2, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(read2);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77392131492964);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.review);
        MissingNativeComponent.MissingNativeSessionFileProvider missingNativeSessionFileProvider = (MissingNativeComponent.MissingNativeSessionFileProvider) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        if (missingNativeSessionFileProvider != null) {
            DirectDebitReviewFragment.write write2 = DirectDebitReviewFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) missingNativeSessionFileProvider, "display");
            DirectDebitReviewFragment directDebitReviewFragment = new DirectDebitReviewFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("EXTRA_DIRECT_DEBIT_INPUT_DISPLAY", missingNativeSessionFileProvider);
            directDebitReviewFragment.setArguments(bundle2);
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((AppCompatActivity) this, (Fragment) directDebitReviewFragment, (int) R.id.container);
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<MissingNativeComponent.MissingNativeSessionFileProvider> {
        private /* synthetic */ DirectDebitReviewActivity MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(DirectDebitReviewActivity directDebitReviewActivity) {
            super(0);
            this.MediaBrowserCompat$ItemReceiver = directDebitReviewActivity;
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = this.MediaBrowserCompat$ItemReceiver.getIntent();
            if (intent != null) {
                return (MissingNativeComponent.MissingNativeSessionFileProvider) intent.getParcelableExtra("EXTRA_DIRECT_DEBIT_INPUT_DISPLAY");
            }
            return null;
        }
    }
}
