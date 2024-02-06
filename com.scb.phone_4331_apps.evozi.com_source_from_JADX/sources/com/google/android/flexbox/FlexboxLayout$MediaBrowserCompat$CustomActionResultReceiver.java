package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.nAllocationResize2D;
import p040o.nClosureCreate;

public class FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver extends ViewGroup.MarginLayoutParams implements nAllocationResize2D {
    public static final Parcelable.Creator<FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver> CREATOR = new Parcelable.Creator<FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver[i];
        }
    };
    private int IconCompatParcelizer = -1;
    private float MediaBrowserCompat$CustomActionResultReceiver = 1.0f;
    private float MediaBrowserCompat$ItemReceiver = -1.0f;
    private int MediaBrowserCompat$MediaItem = 1;
    private int MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int RatingCompat = 16777215;
    private float read = BitmapDescriptorFactory.HUE_RED;
    private int write = 16777215;

    public final int describeContents() {
        return 0;
    }

    public FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout);
        this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_order, 1);
        this.read = obtainStyledAttributes.getFloat(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_flexGrow, BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getFloat(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
        this.IconCompatParcelizer = obtainStyledAttributes.getInt(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_alignSelf, -1);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getFraction(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
        this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getDimensionPixelSize(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_minWidth, 0);
        this.MediaMetadataCompat = obtainStyledAttributes.getDimensionPixelSize(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_minHeight, 0);
        this.RatingCompat = obtainStyledAttributes.getDimensionPixelSize(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_maxWidth, 16777215);
        this.write = obtainStyledAttributes.getDimensionPixelSize(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_maxHeight, 16777215);
        this.MediaDescriptionCompat = obtainStyledAttributes.getBoolean(nClosureCreate.IconCompatParcelizer.FlexboxLayout_Layout_layout_wrapBefore, false);
        obtainStyledAttributes.recycle();
    }

    public FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver(FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver) {
        super(flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$MediaItem = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        this.read = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$SearchResultReceiver = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
        this.MediaMetadataCompat = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
        this.RatingCompat = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
        this.write = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.write;
        this.MediaDescriptionCompat = flexboxLayout$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
    }

    public FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo33282x50fd9e4a() {
        return this.width;
    }

    public final int write() {
        return this.height;
    }

    public final int MediaSessionCompat$ResultReceiverWrapper() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final float read() {
        return this.read;
    }

    public final float IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final int ParcelableVolumeInfo() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final int MediaSessionCompat$QueueItem() {
        return this.MediaMetadataCompat;
    }

    public final int MediaSessionCompat$Token() {
        return this.RatingCompat;
    }

    public final int MediaBrowserCompat$SearchResultReceiver() {
        return this.write;
    }

    public final boolean PlaybackStateCompat$CustomAction() {
        return this.MediaDescriptionCompat;
    }

    public final float MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final int RatingCompat() {
        return this.leftMargin;
    }

    public final int MediaDescriptionCompat() {
        return this.topMargin;
    }

    public final int MediaMetadataCompat() {
        return this.rightMargin;
    }

    public final int MediaBrowserCompat$MediaItem() {
        return this.bottomMargin;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeFloat(this.read);
        parcel.writeFloat(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeFloat(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeInt(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeInt(this.MediaMetadataCompat);
        parcel.writeInt(this.RatingCompat);
        parcel.writeInt(this.write);
        parcel.writeByte(this.MediaDescriptionCompat ? (byte) 1 : 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FlexboxLayout$MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel) {
        super(0, 0);
        boolean z = false;
        this.MediaBrowserCompat$MediaItem = parcel.readInt();
        this.read = parcel.readFloat();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readFloat();
        this.IconCompatParcelizer = parcel.readInt();
        this.MediaBrowserCompat$ItemReceiver = parcel.readFloat();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readInt();
        this.MediaMetadataCompat = parcel.readInt();
        this.RatingCompat = parcel.readInt();
        this.write = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readByte() != 0 ? true : z;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }
}
