package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p040o.ForwardingCheckedFuture;

/* renamed from: o.standardStartAndWait */
public final class standardStartAndWait extends ForwardingCheckedFuture.SimpleForwardingCheckedFuture implements Parcelable {
    public static final Parcelable.Creator<standardStartAndWait> CREATOR = new Parcelable.Creator<standardStartAndWait>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new standardStartAndWait(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new standardStartAndWait[i];
        }
    };
    public String IconCompatParcelizer;
    public ForwardingCheckedFuture MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public List<ForwardingFuture> MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public ProcMapEntry ParcelableVolumeInfo;
    public boolean RatingCompat;
    public String read;
    public List<sanitizeAttribute> write;

    public final int describeContents() {
        return 0;
    }

    protected standardStartAndWait(IconCompatParcelizer iconCompatParcelizer) {
        this.ParcelableVolumeInfo = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
        this.MediaMetadataCompat = iconCompatParcelizer.MediaDescriptionCompat;
        this.MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.MediaMetadataCompat;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer.IconCompatParcelizer;
        this.IconCompatParcelizer = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        this.MediaDescriptionCompat = iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
        this.write = iconCompatParcelizer.write;
        this.read = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        this.RatingCompat = iconCompatParcelizer.RatingCompat;
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.read;
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.MediaBrowserCompat$MediaItem;
    }

    public static IconCompatParcelizer write(List<ForwardingFuture> list, String str) {
        return new IconCompatParcelizer(list, str);
    }

    public final String IconCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.read);
        sb.append("_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: o.standardStartAndWait$IconCompatParcelizer */
    public static class IconCompatParcelizer<T extends IconCompatParcelizer<T>> {
        public ForwardingCheckedFuture IconCompatParcelizer;
        String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public boolean MediaBrowserCompat$MediaItem;
        List<ForwardingFuture> MediaBrowserCompat$SearchResultReceiver;
        public String MediaDescriptionCompat;
        public String MediaMetadataCompat;
        public ProcMapEntry MediaSessionCompat$ResultReceiverWrapper = ProcMapEntry.DEFAULT;
        public boolean RatingCompat;
        public boolean read;
        public List<sanitizeAttribute> write;

        public IconCompatParcelizer(List<ForwardingFuture> list, String str) {
            this.MediaBrowserCompat$SearchResultReceiver = list;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final standardStartAndWait read() {
            return new standardStartAndWait(this);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProcMapEntry procMapEntry = this.ParcelableVolumeInfo;
        parcel.writeInt(procMapEntry == null ? -1 : procMapEntry.ordinal());
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeList(this.MediaDescriptionCompat);
        parcel.writeList(this.write);
        parcel.writeString(this.read);
        parcel.writeByte(this.RatingCompat ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$ItemReceiver ? (byte) 1 : 0);
        parcel.writeByte(this.MediaBrowserCompat$MediaItem ? (byte) 1 : 0);
    }

    protected standardStartAndWait(Parcel parcel) {
        int readInt = parcel.readInt();
        this.ParcelableVolumeInfo = readInt == -1 ? ProcMapEntry.DEFAULT : ProcMapEntry.values()[readInt];
        this.MediaMetadataCompat = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = (ForwardingCheckedFuture) parcel.readParcelable(ForwardingCheckedFuture.class.getClassLoader());
        this.IconCompatParcelizer = parcel.readString();
        this.MediaDescriptionCompat = new ArrayList();
        this.write = new ArrayList();
        parcel.readList(this.MediaDescriptionCompat, ForwardingFuture.class.getClassLoader());
        parcel.readList(this.write, sanitizeAttribute.class.getClassLoader());
        this.read = parcel.readString();
        boolean z = true;
        this.RatingCompat = parcel.readByte() != 0;
        this.MediaBrowserCompat$ItemReceiver = parcel.readByte() != 0;
        this.MediaBrowserCompat$MediaItem = parcel.readByte() == 0 ? false : z;
    }
}
