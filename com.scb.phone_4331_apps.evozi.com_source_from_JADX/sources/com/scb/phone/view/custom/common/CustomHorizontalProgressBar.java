package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomHorizontalProgressBar extends RelativeLayout {
    private String IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f3073x50fd9e4a;
    private int MediaDescriptionCompat;
    private Context MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private int PlaybackStateCompat$CustomAction;
    private Drawable RatingCompat;
    @BindView
    TextView mAvailableTitleTextView;
    @BindView
    TextView mAvailableValueTextView;
    @BindView
    ProgressBar mProgressBar;
    @BindView
    public ConstraintLayout mTotalContainerLinearLayout;
    @BindView
    TextView mTotalTitleTextView;
    @BindView
    TextView mTotalValueTextView;
    @BindView
    TextView mUsedTitleTextView;
    @BindView
    TextView mUsedValueTextView;
    private int read;
    private int setHasDecor;
    private int write;

    public CustomHorizontalProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaMetadataCompat = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomHorizontalProgressBar, 0, 0);
        this.MediaSessionCompat$ResultReceiverWrapper = obtainStyledAttributes.getColor(13, setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
        this.PlaybackStateCompat = obtainStyledAttributes.getColor(15, setLastBaselineToBottomHeight.read(context, R.color.f67252131099881));
        this.read = obtainStyledAttributes.getColor(1, setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getColor(3, setLastBaselineToBottomHeight.read(context, R.color.f65772131099731));
        this.MediaDescriptionCompat = obtainStyledAttributes.getColor(7, setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
        this.MediaSessionCompat$Token = obtainStyledAttributes.getColor(9, setLastBaselineToBottomHeight.read(context, R.color.f66182131099773));
        this.PlaybackStateCompat$CustomAction = obtainStyledAttributes.getDimensionPixelSize(14, context.getResources().getDimensionPixelSize(R.dimen.f72292131165353));
        this.setHasDecor = obtainStyledAttributes.getDimensionPixelSize(16, context.getResources().getDimensionPixelSize(R.dimen.f72302131165354));
        this.write = obtainStyledAttributes.getDimensionPixelSize(2, context.getResources().getDimensionPixelSize(R.dimen.f72292131165353));
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getDimensionPixelSize(4, context.getResources().getDimensionPixelSize(R.dimen.f72302131165354));
        this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getDimensionPixelSize(8, context.getResources().getDimensionPixelSize(R.dimen.f72282131165352));
        this.ParcelableVolumeInfo = obtainStyledAttributes.getDimensionPixelSize(11, context.getResources().getDimensionPixelSize(R.dimen.f72292131165353));
        this.RatingCompat = obtainStyledAttributes.getDrawable(5) != null ? obtainStyledAttributes.getDrawable(5) : setLastBaselineToBottomHeight.write(context, R.drawable.card_progress_bar);
        this.f3073x50fd9e4a = obtainStyledAttributes.getString(12) != null ? obtainStyledAttributes.getString(12) : context.getResources().getString(R.string.account_summary_credit_card_used);
        this.IconCompatParcelizer = obtainStyledAttributes.getString(0) != null ? obtainStyledAttributes.getString(0) : context.getResources().getString(R.string.account_summary_credit_card_available);
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getString(6) != null ? obtainStyledAttributes.getString(6) : context.getResources().getString(R.string.account_summary_credit_card_total);
        this.MediaSessionCompat$QueueItem = obtainStyledAttributes.getString(10);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f82052131493431, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setView();
    }

    public void setView() {
        this.mAvailableTitleTextView.setTextSize(2, ((float) this.write) / this.MediaMetadataCompat.getResources().getDisplayMetrics().density);
        this.mAvailableValueTextView.setTextSize(2, ((float) this.MediaBrowserCompat$ItemReceiver) / this.MediaMetadataCompat.getResources().getDisplayMetrics().density);
        this.mTotalTitleTextView.setTextSize(2, ((float) this.MediaBrowserCompat$MediaItem) / this.MediaMetadataCompat.getResources().getDisplayMetrics().density);
        this.mTotalValueTextView.setTextSize(2, ((float) this.ParcelableVolumeInfo) / this.MediaMetadataCompat.getResources().getDisplayMetrics().density);
        this.mUsedTitleTextView.setTextSize(2, ((float) this.PlaybackStateCompat$CustomAction) / this.MediaMetadataCompat.getResources().getDisplayMetrics().density);
        this.mUsedValueTextView.setTextSize(2, ((float) this.setHasDecor) / this.MediaMetadataCompat.getResources().getDisplayMetrics().density);
        this.mAvailableTitleTextView.setTextColor(this.read);
        this.mAvailableValueTextView.setTextColor(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.mTotalTitleTextView.setTextColor(this.MediaDescriptionCompat);
        this.mTotalValueTextView.setTextColor(this.MediaSessionCompat$Token);
        this.mUsedTitleTextView.setTextColor(this.MediaSessionCompat$ResultReceiverWrapper);
        this.mUsedValueTextView.setTextColor(this.PlaybackStateCompat);
        this.mUsedTitleTextView.setText(this.f3073x50fd9e4a);
        this.mAvailableTitleTextView.setText(this.IconCompatParcelizer);
        this.mTotalTitleTextView.setText(this.MediaBrowserCompat$SearchResultReceiver);
        this.mProgressBar.setProgressDrawable(this.RatingCompat);
        if (!TextUtils.isEmpty(this.MediaSessionCompat$QueueItem)) {
            this.mTotalValueTextView.setTypeface(Typeface.createFromAsset(getResources().getAssets(), this.MediaSessionCompat$QueueItem));
        }
    }

    public void setUsedTitle(String str) {
        if (str != null) {
            this.mUsedTitleTextView.setText(str);
        }
    }

    public void setUsedValueColor(int i) {
        this.mUsedValueTextView.setTextColor(i);
    }

    public void setUsedValue(String str) {
        if (str != null) {
            this.mUsedValueTextView.setText(str);
        }
    }

    public void setAvailableTitle(String str) {
        if (str != null) {
            this.mAvailableTitleTextView.setText(str);
        }
    }

    public void setAvailableValue(String str) {
        if (str != null) {
            this.mAvailableValueTextView.setText(str);
        }
    }

    public void setTotalTitle(String str) {
        if (str != null) {
            this.mTotalTitleTextView.setText(str);
        }
    }

    public void setTotalValue(String str) {
        if (str != null) {
            this.mTotalValueTextView.setText(str);
        }
    }

    public void setTotalValueAllCaps(boolean z) {
        this.mTotalValueTextView.setAllCaps(z);
    }

    public void setUsedTitleAllCaps(boolean z) {
        this.mUsedTitleTextView.setAllCaps(z);
    }

    public void setAvailableTitleAllCaps(boolean z) {
        this.mAvailableTitleTextView.setAllCaps(z);
    }

    public void setProgressBarDrawable(Drawable drawable) {
        if (drawable != null) {
            this.mProgressBar.setProgressDrawable(drawable);
        }
    }

    public void setProgressBar(int i) {
        this.mProgressBar.setProgress(i);
    }

    public void setVisibilityProgressBar(int i) {
        this.mProgressBar.setVisibility(i);
    }

    public void setSecondaryProgressBar(int i) {
        this.mProgressBar.setSecondaryProgress(i);
    }

    public void setProgressMax(int i) {
        this.mProgressBar.setMax(i);
    }
}
