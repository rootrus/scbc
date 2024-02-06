package com.google.android.flexbox;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.nAllocationResize2D;

/* renamed from: com.google.android.flexbox.FlexboxLayoutManager$MediaBrowserCompat$CustomActionResultReceiver */
public class C5547x12b641fe extends RecyclerView.MediaDescriptionCompat implements nAllocationResize2D {
    public static final Parcelable.Creator<C5547x12b641fe> CREATOR = new Parcelable.Creator<C5547x12b641fe>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new C5547x12b641fe(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new C5547x12b641fe[i];
        }
    };
    private float MediaBrowserCompat$CustomActionResultReceiver = -1.0f;
    private float MediaBrowserCompat$MediaItem = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f3062x50fd9e4a;
    private int MediaDescriptionCompat = 16777215;
    private float MediaMetadataCompat = 1.0f;
    private int MediaSessionCompat$QueueItem;
    private int MediaSessionCompat$ResultReceiverWrapper;
    private int RatingCompat = 16777215;
    private int write = -1;

    public final int MediaSessionCompat$ResultReceiverWrapper() {
        return 1;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final int mo33282x50fd9e4a() {
        return this.width;
    }

    public final int write() {
        return this.height;
    }

    public final float read() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final float IconCompatParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public final int ParcelableVolumeInfo() {
        return this.MediaSessionCompat$ResultReceiverWrapper;
    }

    public final int MediaSessionCompat$QueueItem() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final int MediaSessionCompat$Token() {
        return this.MediaDescriptionCompat;
    }

    public final int MediaBrowserCompat$SearchResultReceiver() {
        return this.RatingCompat;
    }

    public final boolean PlaybackStateCompat$CustomAction() {
        return this.f3062x50fd9e4a;
    }

    public final float MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
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

    public C5547x12b641fe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C5547x12b641fe() {
        super(-2, -2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.MediaBrowserCompat$MediaItem);
        parcel.writeFloat(this.MediaMetadataCompat);
        parcel.writeInt(this.write);
        parcel.writeFloat(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeInt(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.MediaSessionCompat$QueueItem);
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeInt(this.RatingCompat);
        parcel.writeByte(this.f3062x50fd9e4a ? (byte) 1 : 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }

    protected C5547x12b641fe(Parcel parcel) {
        super(-2, -2);
        this.MediaBrowserCompat$MediaItem = parcel.readFloat();
        this.MediaMetadataCompat = parcel.readFloat();
        this.write = parcel.readInt();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readFloat();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readInt();
        this.MediaSessionCompat$QueueItem = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readInt();
        this.RatingCompat = parcel.readInt();
        this.f3062x50fd9e4a = parcel.readByte() != 0;
        this.bottomMargin = parcel.readInt();
        this.leftMargin = parcel.readInt();
        this.rightMargin = parcel.readInt();
        this.topMargin = parcel.readInt();
        this.height = parcel.readInt();
        this.width = parcel.readInt();
    }
}
