package p040o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.setUuidFromUtf8Bytes */
public class setUuidFromUtf8Bytes implements Parcelable {
    public static final Parcelable.Creator<setUuidFromUtf8Bytes> CREATOR = new Parcelable.Creator<setUuidFromUtf8Bytes>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setUuidFromUtf8Bytes(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setUuidFromUtf8Bytes[i];
        }
    };
    public String AbsActionBarView;
    public String ActionBarContainer;
    public String ActionBarContextView;
    public String ActionBarOverlayLayout;
    public String ActionMenuItemView;
    public List<parseEventExecutionException> ActionMenuPresenter$OverflowMenuButton;
    public CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder ActionMenuView;
    private String ActionMenuView$OnMenuItemClickListener;
    public String AlertController$RecycleListView;
    public Uri AppCompatActivity;
    public String AppCompatDelegateImpl$ListMenuDecorView;
    public String AppCompatDialogFragment;
    public String AppCompatViewInflater;
    public String ExpandedMenuView;
    private String IconCompatParcelizer;
    public String Keep;
    public String ListMenuItemView;
    private CrashlyticsReport.Session.Event.Log MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public CrashlyticsReport.Session.Application f2965x50fd9e4a;
    private String MediaDescriptionCompat;
    private String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public Integer MediaSessionCompat$Token;
    public String MenuItemImpl;
    public String MenuItemWrapperICS$CollapsibleActionViewWrapper;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    private String read;
    public String setActionBarHideOffset;
    public String setActionBarVisibilityCallback;
    public String setBackgroundResource;
    public boolean setCheckable;
    public setJailbroken setChecked;
    public String setContentHeight;
    public String setContentView;
    public String setCustomView;
    private String setExpandedActionViewsExclusive;
    public String setExpandedFormat;
    public String setForceShowIcon;
    public Uri setGroupDividerEnabled;
    public String setHasDecor;
    public String setHasNonEmbeddedTabs;
    public String setHideOnContentScrollEnabled;
    public boolean setIcon;
    public boolean setItemInvoker = false;
    public String setLogo;
    public String setMenu;
    private String setMenuCallbacks;
    public String setMenuPrepared;
    public String setOnMenuItemClickListener;
    public String setOverflowIcon;
    public String setOverflowReserved;
    public String setOverlayMode;
    public boolean setPadding = false;
    public boolean setPopupCallback;
    private String setPopupTheme;
    public List<CrashlyticsReport.Session.OperatingSystem.Builder> setPrimaryBackground;
    public CrashlyticsReport.Session.Event.Device setShortcut;
    public getRamUsed setShowingForActionMode;
    public String setSplitBackground;
    public String setStackedBackground;
    public String setSubtitle;
    public String setTabContainer;
    public String setTitle;
    public String setTitleOptional;
    public String setTransitioning;
    public String setUiOptions;
    public String setVisibility;
    public String setWindowCallback;
    public String setWindowTitle;
    private String write;

    public int describeContents() {
        return 0;
    }

    public setUuidFromUtf8Bytes(Parcel parcel) {
        boolean z = false;
        this.setUiOptions = parcel.readString();
        this.setGroupDividerEnabled = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.ListMenuItemView = parcel.readString();
        this.setExpandedActionViewsExclusive = parcel.readString();
        this.setMenuCallbacks = parcel.readString();
        this.AppCompatActivity = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.setContentView = parcel.readString();
        this.AppCompatDialogFragment = parcel.readString();
        this.setForceShowIcon = parcel.readString();
        this.setBackgroundResource = parcel.readString();
        this.f2965x50fd9e4a = (CrashlyticsReport.Session.Application) parcel.readParcelable(CrashlyticsReport.Session.Application.class.getClassLoader());
        this.setActionBarHideOffset = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.ActionMenuItemView = parcel.readString();
        this.setSubtitle = parcel.readString();
        this.ActionBarContextView = parcel.readString();
        this.setHideOnContentScrollEnabled = parcel.readString();
        this.ActionBarOverlayLayout = parcel.readString();
        this.setActionBarVisibilityCallback = parcel.readString();
        this.setTabContainer = parcel.readString();
        this.setSplitBackground = parcel.readString();
        this.setTransitioning = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.ExpandedMenuView = parcel.readString();
        this.setPopupTheme = parcel.readString();
        this.setOverflowReserved = parcel.readString();
        this.setTitle = parcel.readString();
        this.setExpandedFormat = parcel.readString();
        this.setPadding = parcel.readByte() != 0;
        this.ActionMenuView$OnMenuItemClickListener = parcel.readString();
        this.ActionBarContainer = parcel.readString();
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = parcel.readString();
        this.AbsActionBarView = parcel.readString();
        this.MenuItemImpl = parcel.readString();
        this.setContentHeight = parcel.readString();
        this.setVisibility = parcel.readString();
        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
        this.setWindowCallback = parcel.readString();
        this.setLogo = parcel.readString();
        this.setIcon = parcel.readByte() != 0;
        this.setCheckable = parcel.readByte() != 0;
        this.AppCompatViewInflater = parcel.readString();
        this.setOnMenuItemClickListener = parcel.readString();
        if (parcel.readByte() == 0) {
            this.MediaSessionCompat$Token = null;
        } else {
            this.MediaSessionCompat$Token = Integer.valueOf(parcel.readInt());
        }
        this.ParcelableVolumeInfo = parcel.readString();
        this.Keep = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.setTitleOptional = parcel.readString();
        this.setCustomView = parcel.readString();
        this.setHasNonEmbeddedTabs = parcel.readString();
        this.setShowingForActionMode = (getRamUsed) parcel.readParcelable(getRamUsed.class.getClassLoader());
        this.setMenu = parcel.readString();
        this.setMenuPrepared = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.setShortcut = (CrashlyticsReport.Session.Event.Device) parcel.readParcelable(CrashlyticsReport.Session.Event.Device.class.getClassLoader());
        this.setChecked = (setJailbroken) parcel.readParcelable(setJailbroken.class.getClassLoader());
        this.MediaBrowserCompat$CustomActionResultReceiver = (CrashlyticsReport.Session.Event.Log) parcel.readParcelable(CrashlyticsReport.Session.Event.Log.class.getClassLoader());
        this.ActionMenuView = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder) parcel.readParcelable(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder.class.getClassLoader());
        this.setPrimaryBackground = parcel.createTypedArrayList(CrashlyticsReport.Session.OperatingSystem.Builder.CREATOR);
        this.ActionMenuPresenter$OverflowMenuButton = parcel.createTypedArrayList(parseEventExecutionException.CREATOR);
        this.setOverlayMode = parcel.readString();
        this.setStackedBackground = parcel.readString();
        this.setPopupCallback = parcel.readByte() != 0;
        this.setItemInvoker = parcel.readByte() != 0 ? true : z;
        this.setWindowTitle = parcel.readString();
        this.setOverflowIcon = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.setUiOptions);
        parcel.writeParcelable(this.setGroupDividerEnabled, i);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.ListMenuItemView);
        parcel.writeString(this.setExpandedActionViewsExclusive);
        parcel.writeString(this.setMenuCallbacks);
        parcel.writeParcelable(this.AppCompatActivity, i);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.setContentView);
        parcel.writeString(this.AppCompatDialogFragment);
        parcel.writeString(this.setForceShowIcon);
        parcel.writeString(this.setBackgroundResource);
        parcel.writeParcelable(this.f2965x50fd9e4a, i);
        parcel.writeString(this.setActionBarHideOffset);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.ActionMenuItemView);
        parcel.writeString(this.setSubtitle);
        parcel.writeString(this.ActionBarContextView);
        parcel.writeString(this.setHideOnContentScrollEnabled);
        parcel.writeString(this.ActionBarOverlayLayout);
        parcel.writeString(this.setActionBarVisibilityCallback);
        parcel.writeString(this.setTabContainer);
        parcel.writeString(this.setSplitBackground);
        parcel.writeString(this.setTransitioning);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.ExpandedMenuView);
        parcel.writeString(this.setPopupTheme);
        parcel.writeString(this.setOverflowReserved);
        parcel.writeString(this.setTitle);
        parcel.writeString(this.setExpandedFormat);
        parcel.writeByte(this.setPadding ? (byte) 1 : 0);
        parcel.writeString(this.ActionMenuView$OnMenuItemClickListener);
        parcel.writeString(this.ActionBarContainer);
        parcel.writeString(this.MenuItemWrapperICS$CollapsibleActionViewWrapper);
        parcel.writeString(this.AbsActionBarView);
        parcel.writeString(this.MenuItemImpl);
        parcel.writeString(this.setContentHeight);
        parcel.writeString(this.setVisibility);
        parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
        parcel.writeString(this.setWindowCallback);
        parcel.writeString(this.setLogo);
        parcel.writeByte(this.setIcon ? (byte) 1 : 0);
        parcel.writeByte(this.setCheckable ? (byte) 1 : 0);
        parcel.writeString(this.AppCompatViewInflater);
        parcel.writeString(this.setOnMenuItemClickListener);
        if (this.MediaSessionCompat$Token == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.MediaSessionCompat$Token.intValue());
        }
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.Keep);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.setTitleOptional);
        parcel.writeString(this.setCustomView);
        parcel.writeString(this.setHasNonEmbeddedTabs);
        parcel.writeParcelable(this.setShowingForActionMode, i);
        parcel.writeString(this.setMenu);
        parcel.writeString(this.setMenuPrepared);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeParcelable(this.setShortcut, i);
        parcel.writeParcelable(this.setChecked, i);
        parcel.writeParcelable(this.MediaBrowserCompat$CustomActionResultReceiver, i);
        parcel.writeParcelable(this.ActionMenuView, i);
        parcel.writeTypedList(this.setPrimaryBackground);
        parcel.writeTypedList(this.ActionMenuPresenter$OverflowMenuButton);
        parcel.writeString(this.setOverlayMode);
        parcel.writeString(this.setStackedBackground);
        parcel.writeByte(this.setPopupCallback ? (byte) 1 : 0);
        parcel.writeByte(this.setItemInvoker ? (byte) 1 : 0);
        parcel.writeString(this.setWindowTitle);
        parcel.writeString(this.setOverflowIcon);
    }

    public setUuidFromUtf8Bytes() {
    }

    public static setUuidFromUtf8Bytes RatingCompat() {
        return new setUuidFromUtf8Bytes();
    }

    public String MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public setUuidFromUtf8Bytes write(String str) {
        this.MediaBrowserCompat$MediaItem = str;
        return this;
    }

    public String IconCompatParcelizer() {
        return this.read;
    }

    public setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver(String str) {
        this.read = str;
        return this;
    }

    public String MediaMetadataCompat() {
        return this.MediaDescriptionCompat;
    }

    public setUuidFromUtf8Bytes MediaBrowserCompat$MediaItem(String str) {
        this.MediaDescriptionCompat = str;
        return this;
    }

    public String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver(String str) {
        this.MediaMetadataCompat = str;
        return this;
    }

    public String MediaDescriptionCompat() {
        return this.setPopupTheme;
    }

    public setUuidFromUtf8Bytes MediaMetadataCompat(String str) {
        this.setPopupTheme = str;
        return this;
    }

    public String write() {
        return this.setMenuCallbacks;
    }

    public setUuidFromUtf8Bytes IconCompatParcelizer(String str) {
        this.setMenuCallbacks = str;
        return this;
    }

    public String MediaBrowserCompat$MediaItem() {
        return this.ActionMenuView$OnMenuItemClickListener;
    }

    public setUuidFromUtf8Bytes read(String str) {
        this.ActionMenuView$OnMenuItemClickListener = str;
        return this;
    }

    public CrashlyticsReport.Session.Event.Log MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Log log) {
        this.MediaBrowserCompat$CustomActionResultReceiver = log;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setUuidFromUtf8Bytes)) {
            return false;
        }
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) obj;
        if (this.setPadding != setuuidfromutf8bytes.setPadding || this.setIcon != setuuidfromutf8bytes.setIcon || this.setPopupCallback != setuuidfromutf8bytes.setPopupCallback || this.setItemInvoker != setuuidfromutf8bytes.setItemInvoker) {
            return false;
        }
        String str = this.setUiOptions;
        if (str == null ? setuuidfromutf8bytes.setUiOptions != null : !str.equals(setuuidfromutf8bytes.setUiOptions)) {
            return false;
        }
        Uri uri = this.setGroupDividerEnabled;
        if (uri == null ? setuuidfromutf8bytes.setGroupDividerEnabled != null : !uri.equals(setuuidfromutf8bytes.setGroupDividerEnabled)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str2 == null ? setuuidfromutf8bytes.MediaBrowserCompat$SearchResultReceiver != null : !str2.equals(setuuidfromutf8bytes.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        if (MediaBrowserCompat$ItemReceiver() == null ? setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver() != null : !MediaBrowserCompat$ItemReceiver().equals(setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver())) {
            return false;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver() == null ? setuuidfromutf8bytes.MediaBrowserCompat$CustomActionResultReceiver() != null : !MediaBrowserCompat$CustomActionResultReceiver().equals(setuuidfromutf8bytes.MediaBrowserCompat$CustomActionResultReceiver())) {
            return false;
        }
        String str3 = this.ListMenuItemView;
        if (str3 == null ? setuuidfromutf8bytes.ListMenuItemView != null : !str3.equals(setuuidfromutf8bytes.ListMenuItemView)) {
            return false;
        }
        String str4 = this.setExpandedActionViewsExclusive;
        if (str4 == null ? setuuidfromutf8bytes.setExpandedActionViewsExclusive != null : !str4.equals(setuuidfromutf8bytes.setExpandedActionViewsExclusive)) {
            return false;
        }
        if (write() == null ? setuuidfromutf8bytes.write() != null : !write().equals(setuuidfromutf8bytes.write())) {
            return false;
        }
        Uri uri2 = this.AppCompatActivity;
        if (uri2 == null ? setuuidfromutf8bytes.AppCompatActivity != null : !uri2.equals(setuuidfromutf8bytes.AppCompatActivity)) {
            return false;
        }
        String str5 = this.write;
        if (str5 == null ? setuuidfromutf8bytes.write != null : !str5.equals(setuuidfromutf8bytes.write)) {
            return false;
        }
        if (IconCompatParcelizer() == null ? setuuidfromutf8bytes.IconCompatParcelizer() != null : !IconCompatParcelizer().equals(setuuidfromutf8bytes.IconCompatParcelizer())) {
            return false;
        }
        String str6 = this.AlertController$RecycleListView;
        if (str6 == null ? setuuidfromutf8bytes.AlertController$RecycleListView != null : !str6.equals(setuuidfromutf8bytes.AlertController$RecycleListView)) {
            return false;
        }
        String str7 = this.setHasDecor;
        if (str7 == null ? setuuidfromutf8bytes.setHasDecor != null : !str7.equals(setuuidfromutf8bytes.setHasDecor)) {
            return false;
        }
        String str8 = this.setContentView;
        if (str8 == null ? setuuidfromutf8bytes.setContentView != null : !str8.equals(setuuidfromutf8bytes.setContentView)) {
            return false;
        }
        String str9 = this.AppCompatDialogFragment;
        if (str9 == null ? setuuidfromutf8bytes.AppCompatDialogFragment != null : !str9.equals(setuuidfromutf8bytes.AppCompatDialogFragment)) {
            return false;
        }
        String str10 = this.setForceShowIcon;
        if (str10 == null ? setuuidfromutf8bytes.setForceShowIcon != null : !str10.equals(setuuidfromutf8bytes.setForceShowIcon)) {
            return false;
        }
        String str11 = this.setBackgroundResource;
        if (str11 == null ? setuuidfromutf8bytes.setBackgroundResource != null : !str11.equals(setuuidfromutf8bytes.setBackgroundResource)) {
            return false;
        }
        CrashlyticsReport.Session.Application application = this.f2965x50fd9e4a;
        if (application == null ? setuuidfromutf8bytes.f2965x50fd9e4a != null : !application.equals(setuuidfromutf8bytes.f2965x50fd9e4a)) {
            return false;
        }
        String str12 = this.setActionBarHideOffset;
        if (str12 == null ? setuuidfromutf8bytes.setActionBarHideOffset != null : !str12.equals(setuuidfromutf8bytes.setActionBarHideOffset)) {
            return false;
        }
        String str13 = this.MediaSessionCompat$QueueItem;
        if (str13 == null ? setuuidfromutf8bytes.MediaSessionCompat$QueueItem != null : !str13.equals(setuuidfromutf8bytes.MediaSessionCompat$QueueItem)) {
            return false;
        }
        if (MediaMetadataCompat() == null ? setuuidfromutf8bytes.MediaMetadataCompat() != null : !MediaMetadataCompat().equals(setuuidfromutf8bytes.MediaMetadataCompat())) {
            return false;
        }
        String str14 = this.ActionMenuItemView;
        if (str14 == null ? setuuidfromutf8bytes.ActionMenuItemView != null : !str14.equals(setuuidfromutf8bytes.ActionMenuItemView)) {
            return false;
        }
        String str15 = this.setSubtitle;
        if (str15 == null ? setuuidfromutf8bytes.setSubtitle != null : !str15.equals(setuuidfromutf8bytes.setSubtitle)) {
            return false;
        }
        String str16 = this.ActionBarContextView;
        if (str16 == null ? setuuidfromutf8bytes.ActionBarContextView != null : !str16.equals(setuuidfromutf8bytes.ActionBarContextView)) {
            return false;
        }
        String str17 = this.setHideOnContentScrollEnabled;
        if (str17 == null ? setuuidfromutf8bytes.setHideOnContentScrollEnabled != null : !str17.equals(setuuidfromutf8bytes.setHideOnContentScrollEnabled)) {
            return false;
        }
        String str18 = this.ActionBarOverlayLayout;
        if (str18 == null ? setuuidfromutf8bytes.ActionBarOverlayLayout != null : !str18.equals(setuuidfromutf8bytes.ActionBarOverlayLayout)) {
            return false;
        }
        String str19 = this.setActionBarVisibilityCallback;
        if (str19 == null ? setuuidfromutf8bytes.setActionBarVisibilityCallback != null : !str19.equals(setuuidfromutf8bytes.setActionBarVisibilityCallback)) {
            return false;
        }
        String str20 = this.setTabContainer;
        if (str20 == null ? setuuidfromutf8bytes.setTabContainer != null : !str20.equals(setuuidfromutf8bytes.setTabContainer)) {
            return false;
        }
        String str21 = this.setSplitBackground;
        if (str21 == null ? setuuidfromutf8bytes.setSplitBackground != null : !str21.equals(setuuidfromutf8bytes.setSplitBackground)) {
            return false;
        }
        String str22 = this.setTransitioning;
        if (str22 == null ? setuuidfromutf8bytes.setTransitioning != null : !str22.equals(setuuidfromutf8bytes.setTransitioning)) {
            return false;
        }
        String str23 = this.RatingCompat;
        if (str23 == null ? setuuidfromutf8bytes.RatingCompat != null : !str23.equals(setuuidfromutf8bytes.RatingCompat)) {
            return false;
        }
        String str24 = this.PlaybackStateCompat;
        if (str24 == null ? setuuidfromutf8bytes.PlaybackStateCompat != null : !str24.equals(setuuidfromutf8bytes.PlaybackStateCompat)) {
            return false;
        }
        String str25 = this.ExpandedMenuView;
        if (str25 == null ? setuuidfromutf8bytes.ExpandedMenuView != null : !str25.equals(setuuidfromutf8bytes.ExpandedMenuView)) {
            return false;
        }
        if (MediaDescriptionCompat() == null ? setuuidfromutf8bytes.MediaDescriptionCompat() != null : !MediaDescriptionCompat().equals(setuuidfromutf8bytes.MediaDescriptionCompat())) {
            return false;
        }
        String str26 = this.setOverflowReserved;
        if (str26 == null ? setuuidfromutf8bytes.setOverflowReserved != null : !str26.equals(setuuidfromutf8bytes.setOverflowReserved)) {
            return false;
        }
        String str27 = this.setTitle;
        if (str27 == null ? setuuidfromutf8bytes.setTitle != null : !str27.equals(setuuidfromutf8bytes.setTitle)) {
            return false;
        }
        String str28 = this.setExpandedFormat;
        if (str28 == null ? setuuidfromutf8bytes.setExpandedFormat != null : !str28.equals(setuuidfromutf8bytes.setExpandedFormat)) {
            return false;
        }
        if (MediaBrowserCompat$MediaItem() == null ? setuuidfromutf8bytes.MediaBrowserCompat$MediaItem() != null : !MediaBrowserCompat$MediaItem().equals(setuuidfromutf8bytes.MediaBrowserCompat$MediaItem())) {
            return false;
        }
        String str29 = this.ActionBarContainer;
        if (str29 == null ? setuuidfromutf8bytes.ActionBarContainer != null : !str29.equals(setuuidfromutf8bytes.ActionBarContainer)) {
            return false;
        }
        String str30 = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
        if (str30 == null ? setuuidfromutf8bytes.MenuItemWrapperICS$CollapsibleActionViewWrapper != null : !str30.equals(setuuidfromutf8bytes.MenuItemWrapperICS$CollapsibleActionViewWrapper)) {
            return false;
        }
        String str31 = this.AbsActionBarView;
        if (str31 == null ? setuuidfromutf8bytes.AbsActionBarView != null : !str31.equals(setuuidfromutf8bytes.AbsActionBarView)) {
            return false;
        }
        String str32 = this.MenuItemImpl;
        if (str32 == null ? setuuidfromutf8bytes.MenuItemImpl != null : !str32.equals(setuuidfromutf8bytes.MenuItemImpl)) {
            return false;
        }
        String str33 = this.setContentHeight;
        if (str33 == null ? setuuidfromutf8bytes.setContentHeight != null : !str33.equals(setuuidfromutf8bytes.setContentHeight)) {
            return false;
        }
        String str34 = this.setVisibility;
        if (str34 == null ? setuuidfromutf8bytes.setVisibility != null : !str34.equals(setuuidfromutf8bytes.setVisibility)) {
            return false;
        }
        String str35 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str35 == null ? setuuidfromutf8bytes.AppCompatDelegateImpl$ListMenuDecorView != null : !str35.equals(setuuidfromutf8bytes.AppCompatDelegateImpl$ListMenuDecorView)) {
            return false;
        }
        String str36 = this.setWindowCallback;
        if (str36 == null ? setuuidfromutf8bytes.setWindowCallback != null : !str36.equals(setuuidfromutf8bytes.setWindowCallback)) {
            return false;
        }
        String str37 = this.setLogo;
        if (str37 == null ? setuuidfromutf8bytes.setLogo != null : !str37.equals(setuuidfromutf8bytes.setLogo)) {
            return false;
        }
        String str38 = this.setOnMenuItemClickListener;
        if (str38 == null ? setuuidfromutf8bytes.setOnMenuItemClickListener != null : !str38.equals(setuuidfromutf8bytes.setOnMenuItemClickListener)) {
            return false;
        }
        Integer num = this.MediaSessionCompat$Token;
        if (num == null ? setuuidfromutf8bytes.MediaSessionCompat$Token != null : !num.equals(setuuidfromutf8bytes.MediaSessionCompat$Token)) {
            return false;
        }
        String str39 = this.ParcelableVolumeInfo;
        if (str39 == null ? setuuidfromutf8bytes.ParcelableVolumeInfo != null : !str39.equals(setuuidfromutf8bytes.ParcelableVolumeInfo)) {
            return false;
        }
        String str40 = this.Keep;
        if (str40 == null ? setuuidfromutf8bytes.Keep != null : !str40.equals(setuuidfromutf8bytes.Keep)) {
            return false;
        }
        String str41 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str41 == null ? setuuidfromutf8bytes.MediaSessionCompat$ResultReceiverWrapper != null : !str41.equals(setuuidfromutf8bytes.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str42 = this.MediaBrowserCompat$ItemReceiver;
        if (str42 == null ? setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver != null : !str42.equals(setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str43 = this.setTitleOptional;
        if (str43 == null ? setuuidfromutf8bytes.setTitleOptional != null : !str43.equals(setuuidfromutf8bytes.setTitleOptional)) {
            return false;
        }
        String str44 = this.setCustomView;
        if (str44 == null ? setuuidfromutf8bytes.setCustomView != null : !str44.equals(setuuidfromutf8bytes.setCustomView)) {
            return false;
        }
        String str45 = this.setHasNonEmbeddedTabs;
        if (str45 == null ? setuuidfromutf8bytes.setHasNonEmbeddedTabs != null : !str45.equals(setuuidfromutf8bytes.setHasNonEmbeddedTabs)) {
            return false;
        }
        getRamUsed getramused = this.setShowingForActionMode;
        if (getramused == null ? setuuidfromutf8bytes.setShowingForActionMode != null : !getramused.equals(setuuidfromutf8bytes.setShowingForActionMode)) {
            return false;
        }
        String str46 = this.setMenu;
        if (str46 == null ? setuuidfromutf8bytes.setMenu != null : !str46.equals(setuuidfromutf8bytes.setMenu)) {
            return false;
        }
        String str47 = this.setMenuPrepared;
        if (str47 == null ? setuuidfromutf8bytes.setMenuPrepared != null : !str47.equals(setuuidfromutf8bytes.setMenuPrepared)) {
            return false;
        }
        String str48 = this.IconCompatParcelizer;
        if (str48 == null ? setuuidfromutf8bytes.IconCompatParcelizer != null : !str48.equals(setuuidfromutf8bytes.IconCompatParcelizer)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = this.setShortcut;
        if (device == null ? setuuidfromutf8bytes.setShortcut != null : !device.equals(setuuidfromutf8bytes.setShortcut)) {
            return false;
        }
        setJailbroken setjailbroken = this.setChecked;
        if (setjailbroken == null ? setuuidfromutf8bytes.setChecked != null : !setjailbroken.equals(setuuidfromutf8bytes.setChecked)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Log log = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (log == null ? setuuidfromutf8bytes.MediaBrowserCompat$CustomActionResultReceiver != null : !log.equals(setuuidfromutf8bytes.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder = this.ActionMenuView;
        if (builder == null ? setuuidfromutf8bytes.ActionMenuView != null : !builder.equals(setuuidfromutf8bytes.ActionMenuView)) {
            return false;
        }
        String str49 = this.setOverlayMode;
        if (str49 == null ? setuuidfromutf8bytes.setOverlayMode != null : !str49.equals(setuuidfromutf8bytes.setOverlayMode)) {
            return false;
        }
        String str50 = this.setWindowTitle;
        if (str50 == null ? setuuidfromutf8bytes.setWindowTitle != null : !str50.equals(setuuidfromutf8bytes.setWindowTitle)) {
            return false;
        }
        String str51 = this.setOverflowIcon;
        if (str51 == null ? setuuidfromutf8bytes.setOverflowIcon != null : !str51.equals(setuuidfromutf8bytes.setOverflowIcon)) {
            return false;
        }
        String str52 = this.setStackedBackground;
        if (str52 != null) {
            return str52.equals(setuuidfromutf8bytes.setStackedBackground);
        }
        if (setuuidfromutf8bytes.setStackedBackground != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i50;
        int i51;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        int i57;
        int i58;
        String str = this.setUiOptions;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        Uri uri = this.setGroupDividerEnabled;
        if (uri != null) {
            i2 = uri.hashCode();
        } else {
            i2 = 0;
        }
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode = str2 != null ? str2.hashCode() : 0;
        int hashCode2 = MediaBrowserCompat$ItemReceiver() != null ? MediaBrowserCompat$ItemReceiver().hashCode() : 0;
        int hashCode3 = MediaBrowserCompat$CustomActionResultReceiver() != null ? MediaBrowserCompat$CustomActionResultReceiver().hashCode() : 0;
        String str3 = this.ListMenuItemView;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        String str4 = this.setExpandedActionViewsExclusive;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        int hashCode5 = write() != null ? write().hashCode() : 0;
        Uri uri2 = this.AppCompatActivity;
        if (uri2 != null) {
            i4 = uri2.hashCode();
        } else {
            i4 = 0;
        }
        String str5 = this.write;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        int hashCode7 = IconCompatParcelizer() != null ? IconCompatParcelizer().hashCode() : 0;
        String str6 = this.AlertController$RecycleListView;
        if (str6 != null) {
            i5 = str6.hashCode();
        } else {
            i5 = 0;
        }
        String str7 = this.setHasDecor;
        if (str7 != null) {
            i6 = str7.hashCode();
        } else {
            i6 = 0;
        }
        String str8 = this.setContentView;
        if (str8 != null) {
            i7 = str8.hashCode();
        } else {
            i7 = 0;
        }
        String str9 = this.AppCompatDialogFragment;
        if (str9 != null) {
            i8 = str9.hashCode();
        } else {
            i8 = 0;
        }
        String str10 = this.setForceShowIcon;
        if (str10 != null) {
            i9 = str10.hashCode();
        } else {
            i9 = 0;
        }
        String str11 = this.setBackgroundResource;
        if (str11 != null) {
            i10 = str11.hashCode();
        } else {
            i10 = 0;
        }
        CrashlyticsReport.Session.Application application = this.f2965x50fd9e4a;
        if (application != null) {
            i11 = application.hashCode();
        } else {
            i11 = 0;
        }
        String str12 = this.setActionBarHideOffset;
        if (str12 != null) {
            i12 = str12.hashCode();
        } else {
            i12 = 0;
        }
        String str13 = this.MediaSessionCompat$QueueItem;
        int hashCode8 = str13 != null ? str13.hashCode() : 0;
        if (MediaMetadataCompat() != null) {
            i14 = MediaMetadataCompat().hashCode();
            i13 = hashCode8;
        } else {
            i13 = hashCode8;
            i14 = 0;
        }
        String str14 = this.ActionMenuItemView;
        if (str14 != null) {
            i15 = str14.hashCode();
        } else {
            i15 = 0;
        }
        String str15 = this.setSubtitle;
        if (str15 != null) {
            i16 = str15.hashCode();
        } else {
            i16 = 0;
        }
        String str16 = this.ActionBarContextView;
        if (str16 != null) {
            i17 = str16.hashCode();
        } else {
            i17 = 0;
        }
        String str17 = this.setHideOnContentScrollEnabled;
        if (str17 != null) {
            i18 = str17.hashCode();
        } else {
            i18 = 0;
        }
        String str18 = this.ActionBarOverlayLayout;
        if (str18 != null) {
            i19 = str18.hashCode();
        } else {
            i19 = 0;
        }
        String str19 = this.setActionBarVisibilityCallback;
        if (str19 != null) {
            i20 = str19.hashCode();
        } else {
            i20 = 0;
        }
        String str20 = this.setTabContainer;
        if (str20 != null) {
            i21 = str20.hashCode();
        } else {
            i21 = 0;
        }
        String str21 = this.setSplitBackground;
        if (str21 != null) {
            i22 = str21.hashCode();
        } else {
            i22 = 0;
        }
        String str22 = this.setTransitioning;
        if (str22 != null) {
            i23 = str22.hashCode();
        } else {
            i23 = 0;
        }
        String str23 = this.RatingCompat;
        if (str23 != null) {
            i24 = str23.hashCode();
        } else {
            i24 = 0;
        }
        String str24 = this.PlaybackStateCompat;
        if (str24 != null) {
            i25 = str24.hashCode();
        } else {
            i25 = 0;
        }
        String str25 = this.ExpandedMenuView;
        int hashCode9 = str25 != null ? str25.hashCode() : 0;
        if (MediaDescriptionCompat() != null) {
            i27 = MediaDescriptionCompat().hashCode();
            i26 = hashCode9;
        } else {
            i26 = hashCode9;
            i27 = 0;
        }
        String str26 = this.setOverflowReserved;
        if (str26 != null) {
            i28 = str26.hashCode();
        } else {
            i28 = 0;
        }
        String str27 = this.setTitle;
        if (str27 != null) {
            i29 = str27.hashCode();
        } else {
            i29 = 0;
        }
        String str28 = this.setExpandedFormat;
        if (str28 != null) {
            i30 = str28.hashCode();
        } else {
            i30 = 0;
        }
        boolean z2 = this.setPadding;
        if (MediaBrowserCompat$MediaItem() != null) {
            i31 = MediaBrowserCompat$MediaItem().hashCode();
            z = z2;
        } else {
            z = z2;
            i31 = 0;
        }
        String str29 = this.ActionBarContainer;
        if (str29 != null) {
            i32 = str29.hashCode();
        } else {
            i32 = 0;
        }
        String str30 = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
        if (str30 != null) {
            i33 = str30.hashCode();
        } else {
            i33 = 0;
        }
        String str31 = this.AbsActionBarView;
        if (str31 != null) {
            i34 = str31.hashCode();
        } else {
            i34 = 0;
        }
        String str32 = this.MenuItemImpl;
        if (str32 != null) {
            i35 = str32.hashCode();
        } else {
            i35 = 0;
        }
        String str33 = this.setContentHeight;
        if (str33 != null) {
            i36 = str33.hashCode();
        } else {
            i36 = 0;
        }
        String str34 = this.setVisibility;
        if (str34 != null) {
            i37 = str34.hashCode();
        } else {
            i37 = 0;
        }
        String str35 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str35 != null) {
            i38 = str35.hashCode();
        } else {
            i38 = 0;
        }
        String str36 = this.setWindowCallback;
        if (str36 != null) {
            i39 = str36.hashCode();
        } else {
            i39 = 0;
        }
        String str37 = this.setLogo;
        if (str37 != null) {
            i40 = str37.hashCode();
        } else {
            i40 = 0;
        }
        boolean z3 = this.setIcon;
        String str38 = this.setOnMenuItemClickListener;
        if (str38 != null) {
            i41 = str38.hashCode();
        } else {
            i41 = 0;
        }
        Integer num = this.MediaSessionCompat$Token;
        if (num != null) {
            i42 = num.hashCode();
        } else {
            i42 = 0;
        }
        String str39 = this.ParcelableVolumeInfo;
        if (str39 != null) {
            i43 = str39.hashCode();
        } else {
            i43 = 0;
        }
        String str40 = this.Keep;
        if (str40 != null) {
            i44 = str40.hashCode();
        } else {
            i44 = 0;
        }
        String str41 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str41 != null) {
            i45 = str41.hashCode();
        } else {
            i45 = 0;
        }
        String str42 = this.MediaBrowserCompat$ItemReceiver;
        if (str42 != null) {
            i46 = str42.hashCode();
        } else {
            i46 = 0;
        }
        String str43 = this.setTitleOptional;
        if (str43 != null) {
            i47 = str43.hashCode();
        } else {
            i47 = 0;
        }
        String str44 = this.setCustomView;
        if (str44 != null) {
            i48 = str44.hashCode();
        } else {
            i48 = 0;
        }
        String str45 = this.setHasNonEmbeddedTabs;
        if (str45 != null) {
            i49 = str45.hashCode();
        } else {
            i49 = 0;
        }
        getRamUsed getramused = this.setShowingForActionMode;
        if (getramused != null) {
            i50 = getramused.hashCode();
        } else {
            i50 = 0;
        }
        String str46 = this.setMenu;
        if (str46 != null) {
            i51 = str46.hashCode();
        } else {
            i51 = 0;
        }
        String str47 = this.setMenuPrepared;
        if (str47 != null) {
            i52 = str47.hashCode();
        } else {
            i52 = 0;
        }
        String str48 = this.IconCompatParcelizer;
        if (str48 != null) {
            i53 = str48.hashCode();
        } else {
            i53 = 0;
        }
        CrashlyticsReport.Session.Event.Device device = this.setShortcut;
        if (device != null) {
            i54 = device.hashCode();
        } else {
            i54 = 0;
        }
        setJailbroken setjailbroken = this.setChecked;
        int hashCode10 = setjailbroken != null ? setjailbroken.hashCode() : 0;
        CrashlyticsReport.Session.Event.Log log = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode11 = log != null ? log.hashCode() : 0;
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder = this.ActionMenuView;
        if (builder != null) {
            i55 = builder.hashCode();
        } else {
            i55 = 0;
        }
        boolean z4 = this.setPopupCallback;
        boolean z5 = this.setItemInvoker;
        String str49 = this.setOverlayMode;
        if (str49 != null) {
            i56 = str49.hashCode();
        } else {
            i56 = 0;
        }
        String str50 = this.setStackedBackground;
        if (str50 != null) {
            i57 = str50.hashCode();
        } else {
            i57 = 0;
        }
        String str51 = this.setWindowTitle;
        if (str51 != null) {
            i58 = str51.hashCode();
        } else {
            i58 = 0;
        }
        String str52 = this.setOverflowIcon;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i * 31) + i2) * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + i3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i4) * 31) + hashCode6) * 31) + hashCode7) * 31) + i5) * 31) + i6) * 31) + i7) * 31) + i8) * 31) + i9) * 31) + i10) * 31) + i11) * 31) + i12) * 31) + i13) * 31) + i14) * 31) + i15) * 31) + i16) * 31) + i17) * 31) + i18) * 31) + i19) * 31) + i20) * 31) + i21) * 31) + i22) * 31) + i23) * 31) + i24) * 31) + i25) * 31) + i26) * 31) + i27) * 31) + i28) * 31) + i29) * 31) + i30) * 31) + (z ? 1 : 0)) * 31) + i31) * 31) + i32) * 31) + i33) * 31) + i34) * 31) + i35) * 31) + i36) * 31) + i37) * 31) + i38) * 31) + i39) * 31) + i40) * 31) + (z3 ? 1 : 0)) * 31) + i41) * 31) + i42) * 31) + i43) * 31) + i44) * 31) + i45) * 31) + i46) * 31) + i47) * 31) + i48) * 31) + i49) * 31) + i50) * 31) + i51) * 31) + i52) * 31) + i53) * 31) + i54) * 31) + hashCode10) * 31) + hashCode11) * 31) + i55) * 31) + (z4 ? 1 : 0)) * 31) + (z5 ? 1 : 0)) * 31) + i56) * 31) + i57) * 31) + i58) * 31) + (str52 != null ? str52.hashCode() : 0);
    }
}
