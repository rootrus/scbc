package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.LogFileManager;
import p040o.newProxy;

/* renamed from: o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver */
public class discardOldLogFiles$MediaBrowserCompat$ItemReceiver extends newProxy.write implements Parcelable {
    public static final Parcelable.Creator<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> CREATOR = new Parcelable.Creator<discardOldLogFiles$MediaBrowserCompat$ItemReceiver>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new discardOldLogFiles$MediaBrowserCompat$ItemReceiver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new discardOldLogFiles$MediaBrowserCompat$ItemReceiver[i];
        }
    };
    public CrashlyticsReport.Session.Event.Application.Builder AbsActionBarView;
    public boolean ActionMenuItemView;
    public List<clearLog> AlertController$RecycleListView;
    public String AppCompatActivity;
    public boolean AppCompatDelegateImpl$ListMenuDecorView;
    public int AppCompatDialogFragment;
    public int AppCompatViewInflater;
    public setLocale ExpandedMenuView;
    public String IconCompatParcelizer;
    public int Keep;
    public String ListMenuItemView;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2814x50fd9e4a;
    public int MediaDescriptionCompat;
    public long MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public int MediaSessionCompat$Token;
    private String MenuItemImpl;
    private String MenuItemWrapperICS$CollapsibleActionViewWrapper;
    public String ParcelableVolumeInfo;
    public getGeoDataClient PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public List<immediateFuture> read;
    public long setBackgroundResource;
    public long setCheckable;
    public String setChecked;
    public parseEventSignal setContentHeight;
    public boolean setContentView;
    public boolean setExpandedFormat;
    public String setForceShowIcon;
    public List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> setGroupDividerEnabled;
    public CrashlyticsReport.Session.Event.Application.Builder setHasDecor;
    public int setIcon;
    public int setItemInvoker;
    public int setPadding = 1;
    public LogFileManager.C35981 setPopupCallback;
    public int setShortcut;
    public getGeoDataClient setTitle;
    public String write;

    public int describeContents() {
        return 0;
    }

    public discardOldLogFiles$MediaBrowserCompat$ItemReceiver() {
    }

    protected discardOldLogFiles$MediaBrowserCompat$ItemReceiver(Parcel parcel) {
        boolean z = true;
        this.MediaMetadataCompat = parcel.readLong();
        this.setBackgroundResource = parcel.readLong();
        this.setCheckable = parcel.readLong();
        this.Keep = parcel.readInt();
        this.setIcon = parcel.readInt();
        this.ListMenuItemView = parcel.readString();
        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readByte() != 0;
        this.setContentView = parcel.readByte() != 0;
        this.AppCompatActivity = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.AppCompatViewInflater = parcel.readInt();
        this.setItemInvoker = parcel.readInt();
        this.setPadding = parcel.readInt();
        this.AppCompatDialogFragment = parcel.readInt();
        this.setExpandedFormat = parcel.readByte() != 0;
        this.MediaBrowserCompat$MediaItem = (CrashlyticsReport.Session.Event.Application.Execution) parcel.readParcelable(CrashlyticsReport.Session.Event.Application.Execution.class.getClassLoader());
        this.setPopupCallback = (LogFileManager.C35981) parcel.readParcelable(LogFileManager.C35981.class.getClassLoader());
        this.setHasDecor = (CrashlyticsReport.Session.Event.Application.Builder) parcel.readParcelable(CrashlyticsReport.Session.Event.Application.Builder.class.getClassLoader());
        this.setContentHeight = (parseEventSignal) parcel.readParcelable(parseEventSignal.class.getClassLoader());
        this.AbsActionBarView = (CrashlyticsReport.Session.Event.Application.Builder) parcel.readParcelable(CrashlyticsReport.Session.Event.Application.Builder.class.getClassLoader());
        this.setForceShowIcon = parcel.readString();
        this.setChecked = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readByte() == 0 ? false : z;
        this.setGroupDividerEnabled = parcel.createTypedArrayList(CREATOR);
        this.ExpandedMenuView = setLocale.valueOf(parcel.readString());
        this.setTitle = getGeoDataClient.valueOf(parcel.readString());
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaDescriptionCompat = parcel.readInt();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readInt();
        this.setShortcut = parcel.readInt();
        this.ParcelableVolumeInfo = parcel.readString();
        this.f2814x50fd9e4a = parcel.readString();
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = parcel.readString();
        this.MenuItemImpl = parcel.readString();
        this.write = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.AlertController$RecycleListView = parcel.createTypedArrayList(clearLog.CREATOR);
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt != -1) {
            this.PlaybackStateCompat = getGeoDataClient.values()[readInt];
        } else {
            this.PlaybackStateCompat = null;
        }
        this.read = parcel.createTypedArrayList(immediateFuture.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeLong(this.MediaMetadataCompat);
        parcel.writeLong(this.setBackgroundResource);
        parcel.writeLong(this.setCheckable);
        parcel.writeInt(this.Keep);
        parcel.writeInt(this.setIcon);
        parcel.writeString(this.ListMenuItemView);
        parcel.writeByte(this.AppCompatDelegateImpl$ListMenuDecorView ? (byte) 1 : 0);
        parcel.writeByte(this.setContentView ? (byte) 1 : 0);
        parcel.writeString(this.AppCompatActivity);
        parcel.writeString(this.RatingCompat);
        parcel.writeInt(this.AppCompatViewInflater);
        parcel.writeInt(this.setItemInvoker);
        parcel.writeInt(this.setPadding);
        parcel.writeInt(this.AppCompatDialogFragment);
        parcel.writeByte(this.setExpandedFormat ? (byte) 1 : 0);
        parcel.writeParcelable(this.MediaBrowserCompat$MediaItem, i);
        parcel.writeParcelable(this.setPopupCallback, i);
        parcel.writeParcelable(this.setHasDecor, i);
        parcel.writeParcelable(this.setContentHeight, i);
        parcel.writeParcelable(this.AbsActionBarView, i);
        parcel.writeString(this.setForceShowIcon);
        parcel.writeString(this.setChecked);
        parcel.writeByte(this.MediaBrowserCompat$SearchResultReceiver ? (byte) 1 : 0);
        parcel.writeTypedList(this.setGroupDividerEnabled);
        parcel.writeString(this.ExpandedMenuView.name());
        parcel.writeString(this.setTitle.name());
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeInt(this.MediaDescriptionCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeInt(this.MediaSessionCompat$Token);
        parcel.writeInt(this.setShortcut);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.f2814x50fd9e4a);
        parcel.writeString(this.MenuItemWrapperICS$CollapsibleActionViewWrapper);
        parcel.writeString(this.MenuItemImpl);
        parcel.writeString(this.write);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeTypedList(this.AlertController$RecycleListView);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        getGeoDataClient getgeodataclient = this.PlaybackStateCompat;
        onGetStartedClick.write((Object) parcel, "$this$writeEnum");
        if (getgeodataclient != null) {
            i2 = getgeodataclient.ordinal();
        } else {
            i2 = -1;
        }
        parcel.writeInt(i2);
        parcel.writeTypedList(this.read);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof discardOldLogFiles$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj;
        AddNewCurrencyActivity_ViewBinding addNewCurrencyActivity_ViewBinding = new AddNewCurrencyActivity_ViewBinding();
        long j = this.MediaMetadataCompat;
        long j2 = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaMetadataCompat;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = j == j2;
        }
        long j3 = this.setBackgroundResource;
        long j4 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setBackgroundResource;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = j3 == j4;
        }
        long j5 = this.setCheckable;
        long j6 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setCheckable;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = j5 == j6;
        }
        int i = this.Keep;
        int i2 = discardoldlogfiles_mediabrowsercompat_itemreceiver.Keep;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i == i2;
        }
        int i3 = this.setIcon;
        int i4 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setIcon;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i3 == i4;
        }
        boolean z2 = this.AppCompatDelegateImpl$ListMenuDecorView;
        boolean z3 = discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatDelegateImpl$ListMenuDecorView;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z2 == z3;
        }
        boolean z4 = this.setContentView;
        boolean z5 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setContentView;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z4 == z5;
        }
        int i5 = this.AppCompatViewInflater;
        int i6 = discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatViewInflater;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i5 == i6;
        }
        int i7 = this.setItemInvoker;
        int i8 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setItemInvoker;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i7 == i8;
        }
        int i9 = this.setPadding;
        int i10 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setPadding;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i9 == i10;
        }
        int i11 = this.AppCompatDialogFragment;
        int i12 = discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatDialogFragment;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i11 == i12;
        }
        boolean z6 = this.setExpandedFormat;
        boolean z7 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setExpandedFormat;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z6 == z7;
        }
        boolean z8 = this.MediaBrowserCompat$SearchResultReceiver;
        boolean z9 = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = z8 == z9;
        }
        int i13 = this.MediaDescriptionCompat;
        int i14 = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaDescriptionCompat;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i13 == i14;
        }
        int i15 = this.MediaSessionCompat$Token;
        int i16 = discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaSessionCompat$Token;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i15 == i16;
        }
        int i17 = this.setShortcut;
        int i18 = discardoldlogfiles_mediabrowsercompat_itemreceiver.setShortcut;
        if (addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver) {
            addNewCurrencyActivity_ViewBinding.MediaBrowserCompat$ItemReceiver = i17 == i18;
        }
        AddNewCurrencyActivity_ViewBinding read2 = addNewCurrencyActivity_ViewBinding.read(this.ExpandedMenuView, discardoldlogfiles_mediabrowsercompat_itemreceiver.ExpandedMenuView).read(this.setTitle, discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle).read(this.ListMenuItemView, discardoldlogfiles_mediabrowsercompat_itemreceiver.ListMenuItemView).read(this.AppCompatActivity, discardoldlogfiles_mediabrowsercompat_itemreceiver.AppCompatActivity).read(this.RatingCompat, discardoldlogfiles_mediabrowsercompat_itemreceiver.RatingCompat).read(this.MediaBrowserCompat$MediaItem, discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$MediaItem).read(this.setPopupCallback, discardoldlogfiles_mediabrowsercompat_itemreceiver.setPopupCallback).read(this.setHasDecor, discardoldlogfiles_mediabrowsercompat_itemreceiver.setHasDecor).read(this.setContentHeight, discardoldlogfiles_mediabrowsercompat_itemreceiver.setContentHeight).read(this.PlaybackStateCompat, discardoldlogfiles_mediabrowsercompat_itemreceiver.PlaybackStateCompat).read(this.AbsActionBarView, discardoldlogfiles_mediabrowsercompat_itemreceiver.AbsActionBarView).read(this.setForceShowIcon, discardoldlogfiles_mediabrowsercompat_itemreceiver.setForceShowIcon).read(this.setChecked, discardoldlogfiles_mediabrowsercompat_itemreceiver.setChecked).read(this.setGroupDividerEnabled, discardoldlogfiles_mediabrowsercompat_itemreceiver.setGroupDividerEnabled).read(this.MediaSessionCompat$ResultReceiverWrapper, discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaSessionCompat$ResultReceiverWrapper).read(this.IconCompatParcelizer, discardoldlogfiles_mediabrowsercompat_itemreceiver.IconCompatParcelizer).read(this.ParcelableVolumeInfo, discardoldlogfiles_mediabrowsercompat_itemreceiver.ParcelableVolumeInfo).read(this.f2814x50fd9e4a, discardoldlogfiles_mediabrowsercompat_itemreceiver.f2814x50fd9e4a).read(this.MenuItemWrapperICS$CollapsibleActionViewWrapper, discardoldlogfiles_mediabrowsercompat_itemreceiver.MenuItemWrapperICS$CollapsibleActionViewWrapper).read(this.MenuItemImpl, discardoldlogfiles_mediabrowsercompat_itemreceiver.MenuItemImpl).read(this.write, discardoldlogfiles_mediabrowsercompat_itemreceiver.write).read(this.PlaybackStateCompat$CustomAction, discardoldlogfiles_mediabrowsercompat_itemreceiver.PlaybackStateCompat$CustomAction).read(this.AlertController$RecycleListView, discardoldlogfiles_mediabrowsercompat_itemreceiver.AlertController$RecycleListView).read(this.MediaSessionCompat$QueueItem, discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaSessionCompat$QueueItem).read(this.MediaBrowserCompat$ItemReceiver, discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver).read(this.MediaBrowserCompat$CustomActionResultReceiver, discardoldlogfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z10 = this.ActionMenuItemView;
        boolean z11 = discardoldlogfiles_mediabrowsercompat_itemreceiver.ActionMenuItemView;
        if (read2.MediaBrowserCompat$ItemReceiver) {
            if (z10 != z11) {
                z = false;
            }
            read2.MediaBrowserCompat$ItemReceiver = z;
        }
        return read2.read(this.read, discardoldlogfiles_mediabrowsercompat_itemreceiver.read).MediaBrowserCompat$ItemReceiver;
    }

    public int hashCode() {
        DetailsTabHolder_ViewBinding detailsTabHolder_ViewBinding = new DetailsTabHolder_ViewBinding((byte) 0);
        long j = this.MediaMetadataCompat;
        detailsTabHolder_ViewBinding.read = (detailsTabHolder_ViewBinding.read * 37) + ((int) (j ^ (j >> 32)));
        long j2 = this.setBackgroundResource;
        detailsTabHolder_ViewBinding.read = (detailsTabHolder_ViewBinding.read * 37) + ((int) (j2 ^ (j2 >> 32)));
        long j3 = this.setCheckable;
        detailsTabHolder_ViewBinding.read = (detailsTabHolder_ViewBinding.read * 37) + ((int) (j3 ^ (j3 >> 32)));
        detailsTabHolder_ViewBinding.read = (detailsTabHolder_ViewBinding.read * 37) + this.Keep;
        detailsTabHolder_ViewBinding.read = (detailsTabHolder_ViewBinding.read * 37) + this.setIcon;
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 = detailsTabHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.ExpandedMenuView).MediaBrowserCompat$CustomActionResultReceiver(this.setTitle).MediaBrowserCompat$CustomActionResultReceiver(this.ListMenuItemView);
        MediaBrowserCompat$CustomActionResultReceiver2.read = (MediaBrowserCompat$CustomActionResultReceiver2.read * 37) + (this.AppCompatDelegateImpl$ListMenuDecorView ^ true ? 1 : 0);
        MediaBrowserCompat$CustomActionResultReceiver2.read = (MediaBrowserCompat$CustomActionResultReceiver2.read * 37) + (this.setContentView ^ true ? 1 : 0);
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatActivity).MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat);
        MediaBrowserCompat$CustomActionResultReceiver3.read = (MediaBrowserCompat$CustomActionResultReceiver3.read * 37) + this.AppCompatViewInflater;
        MediaBrowserCompat$CustomActionResultReceiver3.read = (MediaBrowserCompat$CustomActionResultReceiver3.read * 37) + this.setItemInvoker;
        MediaBrowserCompat$CustomActionResultReceiver3.read = (MediaBrowserCompat$CustomActionResultReceiver3.read * 37) + this.setPadding;
        MediaBrowserCompat$CustomActionResultReceiver3.read = (MediaBrowserCompat$CustomActionResultReceiver3.read * 37) + this.AppCompatDialogFragment;
        MediaBrowserCompat$CustomActionResultReceiver3.read = (MediaBrowserCompat$CustomActionResultReceiver3.read * 37) + (this.setExpandedFormat ^ true ? 1 : 0);
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem).MediaBrowserCompat$CustomActionResultReceiver(this.setPopupCallback).MediaBrowserCompat$CustomActionResultReceiver(this.setHasDecor).MediaBrowserCompat$CustomActionResultReceiver(this.setContentHeight).MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat).MediaBrowserCompat$CustomActionResultReceiver(this.AbsActionBarView).MediaBrowserCompat$CustomActionResultReceiver(this.setForceShowIcon).MediaBrowserCompat$CustomActionResultReceiver(this.setChecked);
        MediaBrowserCompat$CustomActionResultReceiver4.read = (MediaBrowserCompat$CustomActionResultReceiver4.read * 37) + (this.MediaBrowserCompat$SearchResultReceiver ^ true ? 1 : 0);
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver5 = MediaBrowserCompat$CustomActionResultReceiver4.MediaBrowserCompat$CustomActionResultReceiver(this.setGroupDividerEnabled).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper);
        MediaBrowserCompat$CustomActionResultReceiver5.read = (MediaBrowserCompat$CustomActionResultReceiver5.read * 37) + this.MediaDescriptionCompat;
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver6 = MediaBrowserCompat$CustomActionResultReceiver5.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        MediaBrowserCompat$CustomActionResultReceiver6.read = (MediaBrowserCompat$CustomActionResultReceiver6.read * 37) + this.MediaSessionCompat$Token;
        MediaBrowserCompat$CustomActionResultReceiver6.read = (MediaBrowserCompat$CustomActionResultReceiver6.read * 37) + this.setShortcut;
        DetailsTabHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver7 = MediaBrowserCompat$CustomActionResultReceiver6.MediaBrowserCompat$CustomActionResultReceiver(this.ParcelableVolumeInfo).MediaBrowserCompat$CustomActionResultReceiver(this.f2814x50fd9e4a).MediaBrowserCompat$CustomActionResultReceiver(this.MenuItemWrapperICS$CollapsibleActionViewWrapper).MediaBrowserCompat$CustomActionResultReceiver(this.MenuItemImpl).MediaBrowserCompat$CustomActionResultReceiver(this.write).MediaBrowserCompat$CustomActionResultReceiver(this.PlaybackStateCompat$CustomAction).MediaBrowserCompat$CustomActionResultReceiver(this.AlertController$RecycleListView).MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$QueueItem).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver7.read = (MediaBrowserCompat$CustomActionResultReceiver7.read * 37) + (this.ActionMenuItemView ^ true ? 1 : 0);
        return MediaBrowserCompat$CustomActionResultReceiver7.MediaBrowserCompat$CustomActionResultReceiver(this.read).read;
    }
}
