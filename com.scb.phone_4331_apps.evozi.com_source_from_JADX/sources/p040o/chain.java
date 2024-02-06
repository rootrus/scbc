package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: o.chain */
public final class chain extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<chain> CREATOR = new Parcelable.Creator<chain>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new chain(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new chain[i];
        }
    };
    public String AbsActionBarView;
    public String ActionBarContainer;
    public boolean ActionMenuItemView;
    public String AlertController$RecycleListView;
    public String AppCompatActivity;
    public int AppCompatDelegateImpl$ListMenuDecorView;
    public boolean AppCompatDialogFragment;
    public String AppCompatViewInflater;
    public boolean ExpandedMenuView;
    public String IconCompatParcelizer;
    public String Keep;
    public boolean ListMenuItemView;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2806x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String MenuItemImpl;
    public String MenuItemWrapperICS$CollapsibleActionViewWrapper;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public int PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public ArrayList<String> read;
    public boolean setBackgroundResource;
    public String setCheckable;
    public String setChecked;
    public boolean setContentHeight;
    public boolean setContentView;
    public boolean setExpandedFormat;
    public boolean setForceShowIcon;
    public String setGroupDividerEnabled;
    public String setHasDecor;
    public String setIcon;
    public String setItemInvoker;
    public String setPadding;
    public String setPopupCallback;
    public String setPrimaryBackground;
    public String setShortcut;
    public int setSplitBackground;
    public String setStackedBackground;
    public String setTabContainer;
    public boolean setTitle;
    private String setTitleOptional;
    public boolean setVisibility;

    public final int describeContents() {
        return 0;
    }

    public chain() {
    }

    public static chain MediaBrowserCompat$ItemReceiver() {
        return new chain();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.setIcon);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.setPopupCallback);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.Keep);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MenuItemWrapperICS$CollapsibleActionViewWrapper);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.MenuItemImpl);
        parcel.writeString(this.AbsActionBarView);
        parcel.writeString(this.setTitleOptional);
        parcel.writeInt(this.PlaybackStateCompat$CustomAction);
        parcel.writeValue(Boolean.valueOf(this.write));
        parcel.writeString(this.AppCompatViewInflater);
        parcel.writeString(this.setCheckable);
        parcel.writeString(this.setChecked);
        parcel.writeInt(this.AppCompatDelegateImpl$ListMenuDecorView);
        parcel.writeInt(this.setExpandedFormat ? 1 : 0);
        parcel.writeString(this.f2806x50fd9e4a);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.setGroupDividerEnabled);
        parcel.writeString(this.setShortcut);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeInt(this.ActionMenuItemView ? 1 : 0);
        parcel.writeString(this.setItemInvoker);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.ActionBarContainer);
        parcel.writeString(this.setTabContainer);
        parcel.writeString(this.AppCompatActivity);
        parcel.writeString(this.setPadding);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeInt(this.setSplitBackground);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeInt(this.setForceShowIcon ? 1 : 0);
        parcel.writeInt(this.setContentView ? 1 : 0);
        parcel.writeInt(this.ListMenuItemView ? 1 : 0);
        parcel.writeInt(this.setBackgroundResource ? 1 : 0);
        parcel.writeInt(this.setVisibility ? 1 : 0);
        parcel.writeInt(this.AppCompatDialogFragment ? 1 : 0);
        parcel.writeInt(this.setTitle ? 1 : 0);
        parcel.writeInt(this.setContentHeight ? 1 : 0);
        parcel.writeInt(this.ExpandedMenuView ? 1 : 0);
        parcel.writeStringList(this.read);
    }

    protected chain(Parcel parcel) {
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.setIcon = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.setPopupCallback = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.Keep = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.MenuItemImpl = parcel.readString();
        this.AbsActionBarView = parcel.readString();
        this.setTitleOptional = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readInt();
        this.write = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.AppCompatViewInflater = parcel.readString();
        this.setCheckable = parcel.readString();
        this.setChecked = parcel.readString();
        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readInt();
        boolean z = false;
        this.setExpandedFormat = parcel.readInt() == 1;
        this.f2806x50fd9e4a = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.setGroupDividerEnabled = parcel.readString();
        this.setShortcut = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.ActionMenuItemView = parcel.readInt() == 1;
        this.setItemInvoker = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.ActionBarContainer = parcel.readString();
        this.setTabContainer = parcel.readString();
        this.AppCompatActivity = parcel.readString();
        this.setPadding = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.setSplitBackground = parcel.readInt();
        this.IconCompatParcelizer = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.setForceShowIcon = parcel.readInt() == 1;
        this.setContentView = parcel.readInt() == 1;
        this.ListMenuItemView = parcel.readInt() == 1;
        this.setBackgroundResource = parcel.readInt() == 1;
        this.setVisibility = parcel.readInt() == 1;
        this.AppCompatDialogFragment = parcel.readInt() == 1;
        this.setTitle = parcel.readInt() == 1;
        this.setContentHeight = parcel.readInt() == 1;
        this.ExpandedMenuView = parcel.readInt() == 1 ? true : z;
        this.read = parcel.createStringArrayList();
    }
}
