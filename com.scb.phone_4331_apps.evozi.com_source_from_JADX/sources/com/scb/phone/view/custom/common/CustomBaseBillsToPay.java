package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindBaseTransferAndPayTabFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public abstract class CustomBaseBillsToPay<T extends FragmentBuilder_BindBaseTransferAndPayTabFragment> extends ConstraintLayout {
    T IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$SearchResultReceiver;
    private int RatingCompat;
    private int write;

    /* access modifiers changed from: protected */
    public abstract TextView IconCompatParcelizer();

    /* access modifiers changed from: protected */
    public abstract TextView MediaBrowserCompat$CustomActionResultReceiver();

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver();

    /* access modifiers changed from: protected */
    public abstract TextView MediaBrowserCompat$MediaItem();

    /* access modifiers changed from: protected */
    public abstract ImageView MediaDescriptionCompat();

    /* access modifiers changed from: protected */
    public abstract Button MediaMetadataCompat();

    /* access modifiers changed from: protected */
    public abstract TextView RatingCompat();

    /* access modifiers changed from: protected */
    public abstract TextView read();

    public final void setCompletedText(String str) {
        onGetStartedClick.write((Object) str, "completedText");
    }

    public final void setCompletedTextVisibility(int i) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomBaseBillsToPay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomBillsToPay, 0, 0);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getColor(0, setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
        this.write = obtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(R.dimen.f72302131165354));
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getColor(2, setLastBaselineToBottomHeight.read(context, R.color.f67252131099881));
        this.RatingCompat = obtainStyledAttributes.getDimensionPixelSize(3, context.getResources().getDimensionPixelSize(R.dimen.f72312131165355));
        obtainStyledAttributes.recycle();
        MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$SearchResultReceiver();
    }

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$SearchResultReceiver() {
        TextView read = read();
        if (read != null) {
            read.setTextSize(2, ((float) this.write) / getContext().getResources().getDisplayMetrics().density);
        }
        TextView read2 = read();
        if (read2 != null) {
            read2.setTextColor(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        TextView IconCompatParcelizer2 = IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            IconCompatParcelizer2.setTextSize(2, ((float) this.RatingCompat) / getContext().getResources().getDisplayMetrics().density);
        }
        TextView IconCompatParcelizer3 = IconCompatParcelizer();
        if (IconCompatParcelizer3 != null) {
            IconCompatParcelizer3.setTextColor(this.MediaBrowserCompat$SearchResultReceiver);
        }
        Button MediaMetadataCompat = MediaMetadataCompat();
        if (MediaMetadataCompat != null) {
            MediaMetadataCompat.setOnClickListener(new write(this));
        }
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ CustomBaseBillsToPay MediaBrowserCompat$ItemReceiver;

        write(CustomBaseBillsToPay customBaseBillsToPay) {
            this.MediaBrowserCompat$ItemReceiver = customBaseBillsToPay;
        }

        public final void onClick(View view) {
            T t = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
            if (t != null) {
                t.MediaBrowserCompat$SearchResultReceiver();
            }
        }
    }

    public final void setIconDrawable(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
            ImageView MediaDescriptionCompat = MediaDescriptionCompat();
            if (MediaDescriptionCompat != null) {
                MediaDescriptionCompat.setImageDrawable(drawable);
            }
        }
    }

    public final void setIconDrawable(Drawable drawable) {
        ImageView MediaDescriptionCompat;
        if (drawable != null && (MediaDescriptionCompat = MediaDescriptionCompat()) != null) {
            MediaDescriptionCompat.setImageDrawable(drawable);
        }
    }

    public final void setIconDrawable(String str, int i) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        getContext();
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(getContext(), i), MediaDescriptionCompat(), str);
    }

    public final void setAmountTitle(String str) {
        TextView read;
        if (str != null && (read = read()) != null) {
            read.setText(str);
        }
    }

    public final void setAmountValue(String str) {
        TextView IconCompatParcelizer2;
        if (str != null && (IconCompatParcelizer2 = IconCompatParcelizer()) != null) {
            IconCompatParcelizer2.setText(str);
        }
    }

    public final void setDueDateValue(String str) {
        TextView MediaBrowserCompat$CustomActionResultReceiver2;
        if (str != null && (MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver()) != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.setText(str);
        }
    }

    public final void setMinimumPaymentValue(String str) {
        onGetStartedClick.write((Object) str, "minimumPayment");
        TextView MediaBrowserCompat$MediaItem = MediaBrowserCompat$MediaItem();
        if (MediaBrowserCompat$MediaItem != null) {
            MediaBrowserCompat$MediaItem.setText(str);
        }
    }

    public final void setStatementDateValue(String str) {
        onGetStartedClick.write((Object) str, "statementDate");
        TextView RatingCompat2 = RatingCompat();
        if (RatingCompat2 != null) {
            RatingCompat2.setText(str);
        }
    }

    public final void setOnBillClickListener(T t) {
        onGetStartedClick.write((Object) t, "onCustomBillsToPayClickListener");
        this.IconCompatParcelizer = t;
    }

    public final void setPayButtonVisibility(int i) {
        Button MediaMetadataCompat = MediaMetadataCompat();
        if (MediaMetadataCompat != null) {
            MediaMetadataCompat.setVisibility(i);
        }
    }

    public final void setAmountTitleTextVisibility(int i) {
        TextView read = read();
        if (read != null) {
            read.setVisibility(i);
        }
    }

    public final void setAmountVisibility(int i) {
        TextView IconCompatParcelizer2 = IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            IconCompatParcelizer2.setVisibility(i);
        }
    }

    public final void setDueDateVisibility(int i) {
        TextView MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.setVisibility(i);
        }
    }
}
