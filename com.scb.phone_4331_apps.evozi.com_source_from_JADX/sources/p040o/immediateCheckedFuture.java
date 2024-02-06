package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.Futures;

/* renamed from: o.immediateCheckedFuture */
public final class immediateCheckedFuture extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<immediateCheckedFuture> CREATOR = new Parcelable.Creator<immediateCheckedFuture>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new immediateCheckedFuture(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new immediateCheckedFuture[i];
        }
    };
    public String ActionMenuItemView;
    public boolean AlertController$RecycleListView;
    public String AppCompatActivity;
    public String AppCompatDelegateImpl$ListMenuDecorView;
    public String AppCompatDialogFragment;
    public String AppCompatViewInflater;
    public setDimensions IconCompatParcelizer;
    public String Keep;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public List<String> MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2865x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public boolean PlaybackStateCompat$CustomAction;
    public boolean RatingCompat;
    public String read;
    public getShortName setBackgroundResource;
    public boolean setCheckable;
    public boolean setChecked;
    public String setContentView;
    public boolean setExpandedFormat;
    public List<Futures.C34072> setHasDecor;
    public String setPopupCallback;

    public final int describeContents() {
        return 0;
    }

    public immediateCheckedFuture() {
    }

    public static immediateCheckedFuture MediaBrowserCompat$CustomActionResultReceiver() {
        return new immediateCheckedFuture();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.AppCompatViewInflater);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        getShortName getshortname = this.setBackgroundResource;
        int i2 = -1;
        parcel.writeInt(getshortname == null ? -1 : getshortname.ordinal());
        parcel.writeString(this.AppCompatDialogFragment);
        parcel.writeString(this.AppCompatActivity);
        parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
        parcel.writeString(this.setContentView);
        parcel.writeString(this.MediaDescriptionCompat);
        setDimensions setdimensions = this.IconCompatParcelizer;
        if (setdimensions != null) {
            i2 = setdimensions.ordinal();
        }
        parcel.writeInt(i2);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeTypedList(this.setHasDecor);
        parcel.writeString(this.Keep);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$CustomActionResultReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.PlaybackStateCompat$CustomAction ? (byte) 1 : 0);
        parcel.writeByte(this.RatingCompat ? (byte) 1 : 0);
        parcel.writeByte(this.AlertController$RecycleListView ? (byte) 1 : 0);
        parcel.writeStringList(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.setPopupCallback);
        parcel.writeString(this.read);
        parcel.writeByte(this.setCheckable ? (byte) 1 : 0);
        parcel.writeByte(this.setChecked ? (byte) 1 : 0);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.f2865x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeByte(this.setExpandedFormat ? (byte) 1 : 0);
        parcel.writeString(this.ActionMenuItemView);
    }

    protected immediateCheckedFuture(Parcel parcel) {
        getShortName getshortname;
        this.AppCompatViewInflater = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        int readInt = parcel.readInt();
        setDimensions setdimensions = null;
        if (readInt == -1) {
            getshortname = null;
        } else {
            getshortname = getShortName.values()[readInt];
        }
        this.setBackgroundResource = getshortname;
        this.AppCompatDialogFragment = parcel.readString();
        this.AppCompatActivity = parcel.readString();
        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
        this.setContentView = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        int readInt2 = parcel.readInt();
        this.IconCompatParcelizer = readInt2 != -1 ? setDimensions.values()[readInt2] : setdimensions;
        this.MediaMetadataCompat = parcel.readString();
        this.setHasDecor = parcel.createTypedArrayList(Futures.C34072.CREATOR);
        this.Keep = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        boolean z = true;
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() != 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readByte() != 0;
        this.PlaybackStateCompat$CustomAction = parcel.readByte() != 0;
        this.RatingCompat = parcel.readByte() != 0;
        this.AlertController$RecycleListView = parcel.readByte() != 0;
        this.MediaBrowserCompat$MediaItem = parcel.createStringArrayList();
        this.setPopupCallback = parcel.readString();
        this.read = parcel.readString();
        this.setCheckable = parcel.readByte() != 0;
        this.setChecked = parcel.readByte() != 0;
        this.ParcelableVolumeInfo = parcel.readString();
        this.f2865x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.setExpandedFormat = parcel.readByte() == 0 ? false : z;
        this.ActionMenuItemView = parcel.readString();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof immediateCheckedFuture)) {
            return false;
        }
        immediateCheckedFuture immediatecheckedfuture = (immediateCheckedFuture) obj;
        AddNewCurrencyActivity_ViewBinding addNewCurrencyActivity_ViewBinding = new AddNewCurrencyActivity_ViewBinding();
        boolean z2 = this.MediaBrowserCompat$SearchResultReceiver;
        boolean z3 = immediatecheckedfuture.MediaBrowserCompat$SearchResultReceiver;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z2 == z3;
        }
        boolean z4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z5 = immediatecheckedfuture.MediaBrowserCompat$CustomActionResultReceiver;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z4 == z5;
        }
        boolean z6 = this.RatingCompat;
        boolean z7 = immediatecheckedfuture.RatingCompat;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z6 == z7;
        }
        boolean z8 = this.PlaybackStateCompat$CustomAction;
        boolean z9 = immediatecheckedfuture.PlaybackStateCompat$CustomAction;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z8 == z9;
        }
        boolean z10 = this.AlertController$RecycleListView;
        boolean z11 = immediatecheckedfuture.AlertController$RecycleListView;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z10 == z11;
        }
        AddNewCurrencyActivity_ViewBinding read2 = addNewCurrencyActivity_ViewBinding.read(this.AppCompatViewInflater, immediatecheckedfuture.AppCompatViewInflater).read(this.PlaybackStateCompat, immediatecheckedfuture.PlaybackStateCompat).read(this.MediaBrowserCompat$ItemReceiver, immediatecheckedfuture.MediaBrowserCompat$ItemReceiver).read(this.setBackgroundResource, immediatecheckedfuture.setBackgroundResource).read(this.AppCompatDialogFragment, immediatecheckedfuture.AppCompatDialogFragment).read(this.AppCompatActivity, immediatecheckedfuture.AppCompatActivity).read(this.AppCompatDelegateImpl$ListMenuDecorView, immediatecheckedfuture.AppCompatDelegateImpl$ListMenuDecorView).read(this.setContentView, immediatecheckedfuture.setContentView).read(this.MediaDescriptionCompat, immediatecheckedfuture.MediaDescriptionCompat).read(this.IconCompatParcelizer, immediatecheckedfuture.IconCompatParcelizer).read(this.MediaMetadataCompat, immediatecheckedfuture.MediaMetadataCompat).read(this.setHasDecor, immediatecheckedfuture.setHasDecor).read(this.Keep, immediatecheckedfuture.Keep).read(this.MediaSessionCompat$ResultReceiverWrapper, immediatecheckedfuture.MediaSessionCompat$ResultReceiverWrapper).read(this.MediaBrowserCompat$MediaItem, immediatecheckedfuture.MediaBrowserCompat$MediaItem).read(this.setPopupCallback, immediatecheckedfuture.setPopupCallback).read(this.read, immediatecheckedfuture.read);
        boolean z12 = this.setCheckable;
        boolean z13 = immediatecheckedfuture.setCheckable;
        if (read2.MediaBrowserCompat$ItemReceiver) {
            read2.MediaBrowserCompat$ItemReceiver = z12 == z13;
        }
        boolean z14 = this.setChecked;
        boolean z15 = immediatecheckedfuture.setChecked;
        if (read2.MediaBrowserCompat$ItemReceiver) {
            read2.MediaBrowserCompat$ItemReceiver = z14 == z15;
        }
        AddNewCurrencyActivity_ViewBinding read3 = read2.read(this.ParcelableVolumeInfo, immediatecheckedfuture.ParcelableVolumeInfo).read(this.f2865x50fd9e4a, immediatecheckedfuture.f2865x50fd9e4a).read(this.MediaSessionCompat$QueueItem, immediatecheckedfuture.MediaSessionCompat$QueueItem).read(this.MediaSessionCompat$Token, immediatecheckedfuture.MediaSessionCompat$Token);
        boolean z16 = this.setExpandedFormat;
        boolean z17 = immediatecheckedfuture.setExpandedFormat;
        if (read3.MediaBrowserCompat$ItemReceiver) {
            if (z16 != z17) {
                z = false;
            }
            read3.MediaBrowserCompat$ItemReceiver = z;
        }
        return read3.read(this.ActionMenuItemView, immediatecheckedfuture.ActionMenuItemView).MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 = new DetailsTabHolder_ViewBinding((byte) 0).MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatViewInflater).MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.setBackgroundResource).MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatDialogFragment).MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatActivity).MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatDelegateImpl$ListMenuDecorView).MediaBrowserCompat$CustomActionResultReceiver(this.setContentView).MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat).MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat).MediaBrowserCompat$CustomActionResultReceiver(this.setHasDecor).MediaBrowserCompat$CustomActionResultReceiver(this.Keep).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper);
        MediaBrowserCompat$CustomActionResultReceiver2.read = (MediaBrowserCompat$CustomActionResultReceiver2.read * 37) + (this.MediaBrowserCompat$SearchResultReceiver ^ true ? 1 : 0);
        MediaBrowserCompat$CustomActionResultReceiver2.read = (MediaBrowserCompat$CustomActionResultReceiver2.read * 37) + (this.MediaBrowserCompat$CustomActionResultReceiver ^ true ? 1 : 0);
        MediaBrowserCompat$CustomActionResultReceiver2.read = (MediaBrowserCompat$CustomActionResultReceiver2.read * 37) + (this.RatingCompat ^ true ? 1 : 0);
        MediaBrowserCompat$CustomActionResultReceiver2.read = (MediaBrowserCompat$CustomActionResultReceiver2.read * 37) + (this.PlaybackStateCompat$CustomAction ^ true ? 1 : 0);
        MediaBrowserCompat$CustomActionResultReceiver2.read = (MediaBrowserCompat$CustomActionResultReceiver2.read * 37) + (this.AlertController$RecycleListView ^ true ? 1 : 0);
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem).MediaBrowserCompat$CustomActionResultReceiver(this.setPopupCallback).MediaBrowserCompat$CustomActionResultReceiver(this.read);
        MediaBrowserCompat$CustomActionResultReceiver3.read = (MediaBrowserCompat$CustomActionResultReceiver3.read * 37) + (this.setCheckable ^ true ? 1 : 0);
        MediaBrowserCompat$CustomActionResultReceiver3.read = (MediaBrowserCompat$CustomActionResultReceiver3.read * 37) + (this.setChecked ^ true ? 1 : 0);
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver(this.ParcelableVolumeInfo).MediaBrowserCompat$CustomActionResultReceiver(this.f2865x50fd9e4a).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$QueueItem).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$Token);
        MediaBrowserCompat$CustomActionResultReceiver4.read = (MediaBrowserCompat$CustomActionResultReceiver4.read * 37) + (this.setExpandedFormat ^ true ? 1 : 0);
        return MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver(this.ActionMenuItemView).read;
    }
}
