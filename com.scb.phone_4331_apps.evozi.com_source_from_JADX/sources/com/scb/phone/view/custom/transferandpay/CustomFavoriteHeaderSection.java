package com.scb.phone.view.custom.transferandpay;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;

public class CustomFavoriteHeaderSection extends LinearLayout {
    private View.OnClickListener MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    ImageView mImageButton;
    @BindView
    TextView textTitle;
    private String write;

    public CustomFavoriteHeaderSection(Context context) {
        super(context);
        inflate(getContext(), R.layout.f81942131493420, this);
        ButterKnife.IconCompatParcelizer(this);
        write((AttributeSet) null);
        setTitle(this.write);
    }

    public CustomFavoriteHeaderSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(getContext(), R.layout.f81942131493420, this);
        ButterKnife.IconCompatParcelizer(this);
        write(attributeSet);
        setTitle(this.write);
    }

    public CustomFavoriteHeaderSection(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflate(getContext(), R.layout.f81942131493420, this);
        ButterKnife.IconCompatParcelizer(this);
        write(attributeSet);
        setTitle(this.write);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        read read2 = new read(super.onSaveInstanceState());
        read2.MediaBrowserCompat$CustomActionResultReceiver = this.write;
        return read2;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof read)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        read read2 = (read) parcelable;
        super.onRestoreInstanceState(read2.getSuperState());
        String str = read2.MediaBrowserCompat$CustomActionResultReceiver;
        this.write = str;
        setTitle(str);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onClickListener;
    }

    @OnClick
    public void onEditButtonClick(View view) {
        View.OnClickListener onClickListener = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void write(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomFavoriteHeaderSection, 0, 0);
            this.write = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
        }
    }

    public void setTitle(String str) {
        this.textTitle.setText(str);
    }

    public void setButton(boolean z) {
        this.mImageButton.setVisibility(z ? 0 : 4);
    }

    static class read extends View.BaseSavedState {
        public static final Parcelable.Creator<read> CREATOR = new Parcelable.Creator<read>() {
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new read(parcel);
            }

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new read[i];
            }
        };
        String MediaBrowserCompat$CustomActionResultReceiver;

        read(Parcelable parcelable) {
            super(parcelable);
        }

        read(Parcel parcel) {
            super(parcel);
            this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
