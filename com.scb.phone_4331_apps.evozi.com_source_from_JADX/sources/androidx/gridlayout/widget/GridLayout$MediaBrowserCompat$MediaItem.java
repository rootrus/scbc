package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.setPaddingRelative;

public class GridLayout$MediaBrowserCompat$MediaItem extends ViewGroup.MarginLayoutParams {
    private static final int IconCompatParcelizer = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_layout_columnSpan;
    private static final int MediaBrowserCompat$CustomActionResultReceiver = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_android_layout_marginBottom;
    private static final int MediaBrowserCompat$MediaItem = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_android_layout_margin;
    private static final int MediaBrowserCompat$SearchResultReceiver = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_android_layout_marginLeft;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static final int f21x50fd9e4a = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_android_layout_marginTop;
    private static final int MediaDescriptionCompat = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_layout_gravity;
    private static final int MediaMetadataCompat = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_layout_columnWeight;
    private static final int MediaSessionCompat$QueueItem = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_layout_row;
    private static final int MediaSessionCompat$ResultReceiverWrapper = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_android_layout_marginRight;
    private static final int MediaSessionCompat$Token = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_layout_rowSpan;
    private static final int ParcelableVolumeInfo = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_layout_rowWeight;
    private static final int RatingCompat;
    private static final int read = setPaddingRelative.IconCompatParcelizer.GridLayout_Layout_layout_column;
    public GridLayout.MediaMetadataCompat MediaBrowserCompat$ItemReceiver;
    public GridLayout.MediaMetadataCompat write;

    static {
        GridLayout.RatingCompat ratingCompat = new GridLayout.RatingCompat(PKIFailureInfo.systemUnavail, -2147483647);
        RatingCompat = ratingCompat.MediaBrowserCompat$CustomActionResultReceiver - ratingCompat.read;
    }

    private GridLayout$MediaBrowserCompat$MediaItem(GridLayout.MediaMetadataCompat mediaMetadataCompat, GridLayout.MediaMetadataCompat mediaMetadataCompat2, byte b) {
        super(-2, -2);
        this.write = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
        setMargins(PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail);
        this.write = mediaMetadataCompat;
        this.MediaBrowserCompat$ItemReceiver = mediaMetadataCompat2;
    }

    private GridLayout$MediaBrowserCompat$MediaItem(GridLayout.MediaMetadataCompat mediaMetadataCompat, GridLayout.MediaMetadataCompat mediaMetadataCompat2) {
        this(mediaMetadataCompat, mediaMetadataCompat2, (byte) 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GridLayout$MediaBrowserCompat$MediaItem() {
        /*
            r1 = this;
            androidx.gridlayout.widget.GridLayout$MediaMetadataCompat r0 = androidx.gridlayout.widget.GridLayout.MediaMetadataCompat.IconCompatParcelizer
            r1.<init>((androidx.gridlayout.widget.GridLayout.MediaMetadataCompat) r0, (androidx.gridlayout.widget.GridLayout.MediaMetadataCompat) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.gridlayout.widget.GridLayout$MediaBrowserCompat$MediaItem.<init>():void");
    }

    public GridLayout$MediaBrowserCompat$MediaItem(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.write = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
    }

    public GridLayout$MediaBrowserCompat$MediaItem(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.write = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
    }

    public GridLayout$MediaBrowserCompat$MediaItem(GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem) {
        super(gridLayout$MediaBrowserCompat$MediaItem);
        this.write = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
        this.write = gridLayout$MediaBrowserCompat$MediaItem.write;
        this.MediaBrowserCompat$ItemReceiver = gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
    }

    /* JADX INFO: finally extract failed */
    public GridLayout$MediaBrowserCompat$MediaItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = GridLayout.MediaMetadataCompat.IconCompatParcelizer;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setPaddingRelative.IconCompatParcelizer.GridLayout_Layout);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(MediaBrowserCompat$MediaItem, PKIFailureInfo.systemUnavail);
            this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(MediaBrowserCompat$SearchResultReceiver, dimensionPixelSize);
            this.topMargin = obtainStyledAttributes.getDimensionPixelSize(f21x50fd9e4a, dimensionPixelSize);
            this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(MediaSessionCompat$ResultReceiverWrapper, dimensionPixelSize);
            this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(MediaBrowserCompat$CustomActionResultReceiver, dimensionPixelSize);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, setPaddingRelative.IconCompatParcelizer.GridLayout_Layout);
            try {
                int i = obtainStyledAttributes2.getInt(MediaDescriptionCompat, 0);
                this.MediaBrowserCompat$ItemReceiver = GridLayout.MediaBrowserCompat$CustomActionResultReceiver(obtainStyledAttributes2.getInt(read, PKIFailureInfo.systemUnavail), obtainStyledAttributes2.getInt(IconCompatParcelizer, RatingCompat), GridLayout.write(i, true), obtainStyledAttributes2.getFloat(MediaMetadataCompat, BitmapDescriptorFactory.HUE_RED));
                this.write = GridLayout.MediaBrowserCompat$CustomActionResultReceiver(obtainStyledAttributes2.getInt(MediaSessionCompat$QueueItem, PKIFailureInfo.systemUnavail), obtainStyledAttributes2.getInt(MediaSessionCompat$Token, RatingCompat), GridLayout.write(i, false), obtainStyledAttributes2.getFloat(ParcelableVolumeInfo, BitmapDescriptorFactory.HUE_RED));
            } finally {
                obtainStyledAttributes2.recycle();
            }
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, -2);
        this.height = typedArray.getLayoutDimension(i2, -2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GridLayout$MediaBrowserCompat$MediaItem gridLayout$MediaBrowserCompat$MediaItem = (GridLayout$MediaBrowserCompat$MediaItem) obj;
        return this.MediaBrowserCompat$ItemReceiver.equals(gridLayout$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver) && this.write.equals(gridLayout$MediaBrowserCompat$MediaItem.write);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode();
    }
}
