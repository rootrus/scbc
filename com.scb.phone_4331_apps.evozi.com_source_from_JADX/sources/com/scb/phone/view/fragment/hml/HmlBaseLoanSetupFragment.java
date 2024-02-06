package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.scb.phone.view.fragment.BaseFragment;
import kotlin.NoWhenBranchMatchedException;
import org.bouncycastle.i18n.MessageBundle;
import p040o.C10144x9cfe725b;
import p040o.C6306x2af384a1;
import p040o.ExtractionParameters;
import p040o.onGetStartedClick;
import p040o.setCurrentImageIndex;
import p040o.setCurrentImageIndex$MediaBrowserCompat$MediaItem;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeUInt64NoTag;

public abstract class HmlBaseLoanSetupFragment<V extends ExtractionParameters> extends BaseFragment implements ExtractionParameters {
    @BindView
    public ImageView header;
    @BindView
    public ImageView openAccountChecked;
    @BindView
    public ImageView openAccountIcon;
    @BindView
    public ImageView openAccountIndicator;
    @BindView
    public TextView openAccountTextView;
    @BindView
    public TextView reviewLoanTextView;
    @BindView
    public ImageView setupAccountIndicator;
    @BindView
    public TextView setupAccountTextView;
    @BindView
    public TextView subtitle;
    @BindView
    public TextView title;
    @BindView
    public ImageView verifyEmailChecked;
    @BindView
    public ImageView verifyEmailIcon;
    @BindView
    public ImageView verifyEmailIndicator;
    @BindView
    public TextView verifyEmailTextView;

    public abstract int MediaBrowserCompat$MediaItem();

    public abstract int MediaBrowserCompat$SearchResultReceiver();

    public abstract setCurrentImageIndex<V> MediaMetadataCompat();

    public abstract V MediaSessionCompat$Token();

    public abstract int RatingCompat();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87882131494015, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        TextView textView = this.verifyEmailTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyEmailTextView");
        }
        textView.setText(getString(R.string.hml_loan_setup_step_1));
        TextView textView2 = this.openAccountTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("openAccountTextView");
        }
        textView2.setText(getString(RatingCompat()));
        TextView textView3 = this.setupAccountTextView;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("setupAccountTextView");
        }
        textView3.setText(getString(MediaBrowserCompat$SearchResultReceiver()));
        TextView textView4 = this.reviewLoanTextView;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewLoanTextView");
        }
        textView4.setText(getString(MediaBrowserCompat$MediaItem()));
        MediaMetadataCompat().MediaBrowserCompat$ItemReceiver(MediaSessionCompat$Token());
        setCurrentImageIndex MediaMetadataCompat = MediaMetadataCompat();
        if (MediaMetadataCompat.RatingCompat != null) {
            z = true;
        }
        if (z) {
            MediaMetadataCompat.RatingCompat.AlertController$RecycleListView();
        }
        MediaMetadataCompat.read.MediaBrowserCompat$CustomActionResultReceiver();
        MediaMetadataCompat.read.IconCompatParcelizer(new setCurrentImageIndex$MediaBrowserCompat$MediaItem(MediaMetadataCompat));
        return inflate;
    }

    public final void read(setCurrentImageIndex.IconCompatParcelizer iconCompatParcelizer) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "state");
        int i = C6306x2af384a1.read[iconCompatParcelizer.ordinal()];
        if (i == 1) {
            MediaBrowserCompat$CustomActionResultReceiver(R.drawable.background_bird_01);
        } else if (i == 2) {
            MediaBrowserCompat$CustomActionResultReceiver(R.drawable.background_bird_03);
        } else if (i == 3) {
            MediaBrowserCompat$CustomActionResultReceiver(R.drawable.background_bird_02);
        } else if (i == 4) {
            MediaBrowserCompat$CustomActionResultReceiver(R.drawable.background_bird_02);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void read(setCurrentImageIndex.write write) {
        onGetStartedClick.write((Object) write, "state");
        int i = C6306x2af384a1.MediaBrowserCompat$ItemReceiver[write.ordinal()];
        if (i == 1) {
            ImageView imageView = this.verifyEmailIndicator;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyEmailIndicator");
            }
            imageView.setImageDrawable(setLastBaselineToBottomHeight.write(requireContext(), R.drawable.shape_circle_cheque_purple));
        } else if (i == 2 || i == 3) {
            MediaBrowserCompat$ItemReceiver();
            ImageView imageView2 = this.openAccountIndicator;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("openAccountIndicator");
            }
            imageView2.setImageDrawable(setLastBaselineToBottomHeight.write(requireContext(), R.drawable.shape_circle_cheque_purple));
        } else if (i == 4) {
            MediaBrowserCompat$ItemReceiver();
            ImageView imageView3 = this.openAccountIcon;
            if (imageView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("openAccountIcon");
            }
            imageView3.setAlpha(0.4f);
            ImageView imageView4 = this.openAccountChecked;
            if (imageView4 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("openAccountChecked");
            }
            imageView4.setVisibility(0);
            TextView textView = this.openAccountTextView;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("openAccountTextView");
            }
            textView.setAlpha(0.4f);
            ImageView imageView5 = this.setupAccountIndicator;
            if (imageView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("setupAccountIndicator");
            }
            imageView5.setImageDrawable(setLastBaselineToBottomHeight.write(requireContext(), R.drawable.shape_circle_cheque_purple));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @OnClick
    public final void onNextClicked() {
        MediaMetadataCompat().MediaBrowserCompat$CustomActionResultReceiver();
    }

    @OnClick
    public final void onHomeClicked() {
        setCurrentImageIndex MediaMetadataCompat = MediaMetadataCompat();
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C10144x9cfe725b.write;
        if (MediaMetadataCompat.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(MediaMetadataCompat.RatingCompat);
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        TextView textView = this.title;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
        }
        textView.setText(R.string.hml_loan_setup_money_on_the_way);
        TextView textView2 = this.subtitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("subtitle");
        }
        textView2.setText(R.string.hml_loan_setup_complete_steps);
        ImageView imageView = this.header;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("header");
        }
        imageView.setImageDrawable(setLastBaselineToBottomHeight.write(requireContext(), i));
    }

    private final void MediaBrowserCompat$ItemReceiver() {
        ImageView imageView = this.verifyEmailIcon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyEmailIcon");
        }
        imageView.setAlpha(0.4f);
        ImageView imageView2 = this.verifyEmailChecked;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyEmailChecked");
        }
        imageView2.setVisibility(0);
        TextView textView = this.verifyEmailTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("verifyEmailTextView");
        }
        textView.setAlpha(0.4f);
    }

    public final void IconCompatParcelizer() {
        AddAccountConsentActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }
}
