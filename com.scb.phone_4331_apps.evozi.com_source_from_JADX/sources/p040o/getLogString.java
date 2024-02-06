package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getLogString */
public final class getLogString extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<getLogString> CREATOR = new getLogString$MediaBrowserCompat$ItemReceiver();
    private final String ActionMenuItemView;
    private final int AlertController$RecycleListView;
    private final int AppCompatActivity;
    private final String AppCompatDelegateImpl$ListMenuDecorView;
    private final String AppCompatDialogFragment;
    private final String AppCompatViewInflater;
    private final String ExpandedMenuView;
    private final String IconCompatParcelizer;
    private final String Keep;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final int MediaBrowserCompat$MediaItem;
    private final List<clearLog> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final int f2840x50fd9e4a;
    private final String MediaDescriptionCompat;
    private final boolean MediaMetadataCompat;
    private final int MediaSessionCompat$QueueItem;
    private final String MediaSessionCompat$ResultReceiverWrapper;
    private final int MediaSessionCompat$Token;
    private final String ParcelableVolumeInfo;
    private final String PlaybackStateCompat;
    private final String PlaybackStateCompat$CustomAction;
    private final String RatingCompat;
    private final String read;
    private final int setBackgroundResource;
    private final String setCheckable;
    private final String setChecked;
    private final long setContentView;
    private final int setExpandedFormat;
    private final int setHasDecor;
    private final String setIcon;
    private final List<getLogString> setItemInvoker;
    private final String setPadding;
    private final String setPopupCallback;
    private final String setShortcut;

    public final int describeContents() {
        return 0;
    }

    public getLogString(long j, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, int i2, List<getLogString> list, String str13, int i3, int i4, String str14, String str15, int i5, int i6, int i7, int i8, int i9, String str16, List<clearLog> list2, String str17, String str18, String str19, String str20, String str21, String str22) {
        this.setContentView = j;
        this.setHasDecor = i;
        this.setShortcut = str;
        this.setIcon = str2;
        this.ActionMenuItemView = str3;
        this.setChecked = str4;
        this.setCheckable = str5;
        this.AppCompatViewInflater = str6;
        this.ParcelableVolumeInfo = str7;
        this.setPadding = str8;
        this.AppCompatDialogFragment = str9;
        this.ExpandedMenuView = str10;
        this.setPopupCallback = str11;
        this.MediaSessionCompat$ResultReceiverWrapper = str12;
        this.MediaMetadataCompat = z;
        this.MediaBrowserCompat$MediaItem = i2;
        this.setItemInvoker = list;
        this.IconCompatParcelizer = str13;
        this.AppCompatActivity = i3;
        this.setExpandedFormat = i4;
        this.Keep = str14;
        this.AppCompatDelegateImpl$ListMenuDecorView = str15;
        this.AlertController$RecycleListView = i5;
        this.setBackgroundResource = i6;
        this.f2840x50fd9e4a = i7;
        this.MediaSessionCompat$QueueItem = i8;
        this.MediaSessionCompat$Token = i9;
        this.RatingCompat = str16;
        this.MediaBrowserCompat$SearchResultReceiver = list2;
        this.PlaybackStateCompat$CustomAction = str17;
        this.PlaybackStateCompat = str18;
        this.MediaBrowserCompat$CustomActionResultReceiver = str19;
        this.MediaDescriptionCompat = str20;
        this.read = str21;
        this.MediaBrowserCompat$ItemReceiver = str22;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public getLogString(android.os.Parcel r42) {
        /*
            r41 = this;
            r0 = r42
            r1 = r41
            java.lang.String r2 = "source"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            long r2 = r42.readLong()
            int r4 = r42.readInt()
            java.lang.String r5 = r42.readString()
            java.lang.String r6 = r42.readString()
            java.lang.String r7 = r42.readString()
            java.lang.String r8 = r42.readString()
            java.lang.String r9 = r42.readString()
            java.lang.String r10 = r42.readString()
            java.lang.String r11 = r42.readString()
            java.lang.String r12 = r42.readString()
            java.lang.String r13 = r42.readString()
            java.lang.String r14 = r42.readString()
            java.lang.String r15 = r42.readString()
            java.lang.String r16 = r42.readString()
            byte r17 = r42.readByte()
            r38 = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r17)
            r17 = 1
            r39 = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r17)
            boolean r17 = r1.equals(r2)
            int r18 = r42.readInt()
            android.os.Parcelable$Creator<o.getLogString> r1 = CREATOR
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            r19 = r1
            java.util.List r19 = (java.util.List) r19
            java.lang.String r20 = r42.readString()
            int r21 = r42.readInt()
            int r22 = r42.readInt()
            java.lang.String r23 = r42.readString()
            java.lang.String r24 = r42.readString()
            int r25 = r42.readInt()
            int r26 = r42.readInt()
            int r27 = r42.readInt()
            int r28 = r42.readInt()
            int r29 = r42.readInt()
            java.lang.String r30 = r42.readString()
            o.clearLog$write r1 = p040o.clearLog.CREATOR
            android.os.Parcelable$Creator r1 = (android.os.Parcelable.Creator) r1
            java.util.ArrayList r1 = r0.createTypedArrayList(r1)
            r31 = r1
            java.util.List r31 = (java.util.List) r31
            java.lang.String r32 = r42.readString()
            java.lang.String r33 = r42.readString()
            java.lang.String r34 = r42.readString()
            java.lang.String r35 = r42.readString()
            java.lang.String r36 = r42.readString()
            java.lang.String r37 = r42.readString()
            r1 = r38
            r2 = r39
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.getLogString.<init>(android.os.Parcel):void");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "dest");
        parcel.writeLong(this.setContentView);
        parcel.writeInt(this.setHasDecor);
        parcel.writeString(this.setShortcut);
        parcel.writeString(this.setIcon);
        parcel.writeString(this.ActionMenuItemView);
        parcel.writeString(this.setChecked);
        parcel.writeString(this.setCheckable);
        parcel.writeString(this.AppCompatViewInflater);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.setPadding);
        parcel.writeString(this.AppCompatDialogFragment);
        parcel.writeString(this.ExpandedMenuView);
        parcel.writeString(this.setPopupCallback);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeByte(this.MediaMetadataCompat ? (byte) 1 : 0);
        parcel.writeInt(this.MediaBrowserCompat$MediaItem);
        parcel.writeTypedList(this.setItemInvoker);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.AppCompatActivity);
        parcel.writeInt(this.setExpandedFormat);
        parcel.writeString(this.Keep);
        parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
        parcel.writeInt(this.AlertController$RecycleListView);
        parcel.writeInt(this.setBackgroundResource);
        parcel.writeInt(this.f2840x50fd9e4a);
        parcel.writeInt(this.MediaSessionCompat$QueueItem);
        parcel.writeInt(this.MediaSessionCompat$Token);
        parcel.writeString(this.RatingCompat);
        parcel.writeTypedList(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
    }
}
