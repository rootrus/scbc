package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: o.setBatteryVelocity */
public class setBatteryVelocity extends zzuk implements Parcelable {
    public static final Parcelable.Creator<setBatteryVelocity> CREATOR = new Parcelable.Creator<setBatteryVelocity>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setBatteryVelocity(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setBatteryVelocity[i];
        }
    };
    private BigDecimal AbsActionBarView;
    private String ActionBarContainer;
    private String ActionBarContextView;
    public BigDecimal ActionMenuItemView;
    public String AlertController$RecycleListView;
    public String AppCompatActivity;
    public String AppCompatDelegateImpl$ListMenuDecorView;
    public List<setPc> AppCompatDialogFragment;
    private String AppCompatViewInflater;
    private String ExpandedMenuView;
    public String Keep;
    private String ListMenuItemView;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public List<setPc> MediaBrowserCompat$MediaItem;
    public BigDecimal MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2934x50fd9e4a;
    public position MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public List<setPc> MediaSessionCompat$Token;
    private String MenuItemImpl;
    private String MenuItemWrapperICS$CollapsibleActionViewWrapper;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    public String setBackgroundResource;
    public String setCheckable;
    public String setChecked;
    private String setContentHeight;
    public String setContentView;
    private String setCustomView;
    private String setExpandedFormat;
    private String setForceShowIcon;
    private String setGroupDividerEnabled;
    public String setHasDecor;
    private String setHasNonEmbeddedTabs;
    private String setIcon;
    private String setItemInvoker;
    private String setPadding;
    private String setPopupCallback;
    private String setPrimaryBackground;
    private String setShortcut;
    private String setSplitBackground;
    private String setStackedBackground;
    private BigDecimal setSubtitle;
    private String setTabContainer;
    private String setTitle;
    private String setTitleOptional;
    private BigDecimal setTransitioning;
    private BigDecimal setVisibility;
    public String write;

    public int describeContents() {
        return 0;
    }

    public setBatteryVelocity(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, BigDecimal bigDecimal5, String str13, String str14, String str15, String str16, String str17, String str18, BigDecimal bigDecimal6, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, position position, String str41, String str42, String str43, String str44, String str45, List<setPc> list, List<setPc> list2, List<setPc> list3) {
        this.ActionMenuItemView = bigDecimal;
        this.setSubtitle = bigDecimal2;
        this.AbsActionBarView = bigDecimal3;
        this.setVisibility = bigDecimal4;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.setExpandedFormat = str2;
        this.read = str3;
        this.setPadding = str4;
        this.setShortcut = str5;
        this.AppCompatViewInflater = str6;
        this.setPrimaryBackground = str7;
        this.setHasNonEmbeddedTabs = str8;
        this.setTabContainer = str9;
        this.ActionBarContextView = str10;
        this.setCustomView = str11;
        this.setCheckable = str12;
        this.MediaBrowserCompat$SearchResultReceiver = bigDecimal5;
        this.PlaybackStateCompat$CustomAction = str13;
        this.setHasDecor = str14;
        this.AlertController$RecycleListView = str15;
        this.Keep = str16;
        this.AppCompatActivity = str17;
        this.MediaBrowserCompat$CustomActionResultReceiver = str18;
        this.setTransitioning = bigDecimal6;
        this.ParcelableVolumeInfo = str19;
        this.MediaSessionCompat$ResultReceiverWrapper = str20;
        this.f2934x50fd9e4a = str21;
        this.MediaSessionCompat$QueueItem = str22;
        this.PlaybackStateCompat = str23;
        this.setIcon = str24;
        this.setPopupCallback = str25;
        this.setItemInvoker = str26;
        this.setForceShowIcon = str27;
        this.setTitle = str28;
        this.setGroupDividerEnabled = str29;
        this.ListMenuItemView = str30;
        this.ExpandedMenuView = str31;
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = str32;
        this.setContentHeight = str33;
        this.MenuItemImpl = str34;
        this.setTitleOptional = str35;
        this.AppCompatDelegateImpl$ListMenuDecorView = str36;
        this.setBackgroundResource = str37;
        this.setContentView = str38;
        this.ActionBarContainer = str39;
        this.setStackedBackground = str40;
        this.MediaDescriptionCompat = position;
        this.MediaMetadataCompat = str41;
        this.setSplitBackground = str42;
        this.RatingCompat = str43;
        this.write = str44;
        this.setChecked = str45;
        this.MediaSessionCompat$Token = list;
        this.MediaBrowserCompat$MediaItem = list2;
        this.AppCompatDialogFragment = list3;
    }

    protected setBatteryVelocity(Parcel parcel) {
        this.ActionMenuItemView = (BigDecimal) parcel.readSerializable();
        this.setSubtitle = (BigDecimal) parcel.readSerializable();
        this.AbsActionBarView = (BigDecimal) parcel.readSerializable();
        this.setVisibility = (BigDecimal) parcel.readSerializable();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.setExpandedFormat = parcel.readString();
        this.read = parcel.readString();
        this.setPadding = parcel.readString();
        this.setShortcut = parcel.readString();
        this.AppCompatViewInflater = parcel.readString();
        this.setPrimaryBackground = parcel.readString();
        this.setHasNonEmbeddedTabs = parcel.readString();
        this.setTabContainer = parcel.readString();
        this.ActionBarContextView = parcel.readString();
        this.setCustomView = parcel.readString();
        this.setCheckable = parcel.readString();
        this.MediaBrowserCompat$SearchResultReceiver = (BigDecimal) parcel.readSerializable();
        this.PlaybackStateCompat$CustomAction = parcel.readString();
        this.setHasDecor = parcel.readString();
        this.AlertController$RecycleListView = parcel.readString();
        this.Keep = parcel.readString();
        this.AppCompatActivity = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.setTransitioning = (BigDecimal) parcel.readSerializable();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.f2934x50fd9e4a = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.setIcon = parcel.readString();
        this.setPopupCallback = parcel.readString();
        this.setItemInvoker = parcel.readString();
        this.setForceShowIcon = parcel.readString();
        this.setTitle = parcel.readString();
        this.setGroupDividerEnabled = parcel.readString();
        this.ListMenuItemView = parcel.readString();
        this.ExpandedMenuView = parcel.readString();
        this.MenuItemWrapperICS$CollapsibleActionViewWrapper = parcel.readString();
        this.setContentHeight = parcel.readString();
        this.MenuItemImpl = parcel.readString();
        this.setTitleOptional = parcel.readString();
        this.AppCompatDelegateImpl$ListMenuDecorView = parcel.readString();
        this.setBackgroundResource = parcel.readString();
        this.setContentView = parcel.readString();
        this.ActionBarContainer = parcel.readString();
        this.setStackedBackground = parcel.readString();
        this.MediaDescriptionCompat = position.values()[parcel.readInt()];
        this.MediaMetadataCompat = parcel.readString();
        this.setSplitBackground = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.write = parcel.readString();
        this.setChecked = parcel.readString();
        this.MediaSessionCompat$Token = parcel.createTypedArrayList(setPc.CREATOR);
        this.MediaBrowserCompat$MediaItem = parcel.createTypedArrayList(setPc.CREATOR);
        this.AppCompatDialogFragment = parcel.createTypedArrayList(setPc.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.ActionMenuItemView);
        parcel.writeSerializable(this.setSubtitle);
        parcel.writeSerializable(this.AbsActionBarView);
        parcel.writeSerializable(this.setVisibility);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.setExpandedFormat);
        parcel.writeString(this.read);
        parcel.writeString(this.setPadding);
        parcel.writeString(this.setShortcut);
        parcel.writeString(this.AppCompatViewInflater);
        parcel.writeString(this.setPrimaryBackground);
        parcel.writeString(this.setHasNonEmbeddedTabs);
        parcel.writeString(this.setTabContainer);
        parcel.writeString(this.ActionBarContextView);
        parcel.writeString(this.setCustomView);
        parcel.writeString(this.setCheckable);
        parcel.writeSerializable(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.PlaybackStateCompat$CustomAction);
        parcel.writeString(this.setHasDecor);
        parcel.writeString(this.AlertController$RecycleListView);
        parcel.writeString(this.Keep);
        parcel.writeString(this.AppCompatActivity);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeSerializable(this.setTransitioning);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.f2934x50fd9e4a);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.setIcon);
        parcel.writeString(this.setPopupCallback);
        parcel.writeString(this.setItemInvoker);
        parcel.writeString(this.setForceShowIcon);
        parcel.writeString(this.setTitle);
        parcel.writeString(this.setGroupDividerEnabled);
        parcel.writeString(this.ListMenuItemView);
        parcel.writeString(this.ExpandedMenuView);
        parcel.writeString(this.MenuItemWrapperICS$CollapsibleActionViewWrapper);
        parcel.writeString(this.setContentHeight);
        parcel.writeString(this.MenuItemImpl);
        parcel.writeString(this.setTitleOptional);
        parcel.writeString(this.AppCompatDelegateImpl$ListMenuDecorView);
        parcel.writeString(this.setBackgroundResource);
        parcel.writeString(this.setContentView);
        parcel.writeString(this.ActionBarContainer);
        parcel.writeString(this.setStackedBackground);
        parcel.writeInt(this.MediaDescriptionCompat.ordinal());
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.setSplitBackground);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.setChecked);
        parcel.writeTypedList(this.MediaSessionCompat$Token);
        parcel.writeTypedList(this.MediaBrowserCompat$MediaItem);
        parcel.writeTypedList(this.AppCompatDialogFragment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setBatteryVelocity setbatteryvelocity = (setBatteryVelocity) obj;
        BigDecimal bigDecimal = this.ActionMenuItemView;
        if (bigDecimal == null ? setbatteryvelocity.ActionMenuItemView != null : !bigDecimal.equals(setbatteryvelocity.ActionMenuItemView)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.setSubtitle;
        if (bigDecimal2 == null ? setbatteryvelocity.setSubtitle != null : !bigDecimal2.equals(setbatteryvelocity.setSubtitle)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.AbsActionBarView;
        if (bigDecimal3 == null ? setbatteryvelocity.AbsActionBarView != null : !bigDecimal3.equals(setbatteryvelocity.AbsActionBarView)) {
            return false;
        }
        BigDecimal bigDecimal4 = this.setVisibility;
        if (bigDecimal4 == null ? setbatteryvelocity.setVisibility != null : !bigDecimal4.equals(setbatteryvelocity.setVisibility)) {
            return false;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null ? setbatteryvelocity.MediaBrowserCompat$ItemReceiver != null : !str.equals(setbatteryvelocity.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str2 = this.setExpandedFormat;
        if (str2 == null ? setbatteryvelocity.setExpandedFormat != null : !str2.equals(setbatteryvelocity.setExpandedFormat)) {
            return false;
        }
        String str3 = this.read;
        if (str3 == null ? setbatteryvelocity.read != null : !str3.equals(setbatteryvelocity.read)) {
            return false;
        }
        String str4 = this.setPadding;
        if (str4 == null ? setbatteryvelocity.setPadding != null : !str4.equals(setbatteryvelocity.setPadding)) {
            return false;
        }
        String str5 = this.setShortcut;
        if (str5 == null ? setbatteryvelocity.setShortcut != null : !str5.equals(setbatteryvelocity.setShortcut)) {
            return false;
        }
        String str6 = this.AppCompatViewInflater;
        if (str6 == null ? setbatteryvelocity.AppCompatViewInflater != null : !str6.equals(setbatteryvelocity.AppCompatViewInflater)) {
            return false;
        }
        String str7 = this.setPrimaryBackground;
        if (str7 == null ? setbatteryvelocity.setPrimaryBackground != null : !str7.equals(setbatteryvelocity.setPrimaryBackground)) {
            return false;
        }
        String str8 = this.setHasNonEmbeddedTabs;
        if (str8 == null ? setbatteryvelocity.setHasNonEmbeddedTabs != null : !str8.equals(setbatteryvelocity.setHasNonEmbeddedTabs)) {
            return false;
        }
        String str9 = this.setTabContainer;
        if (str9 == null ? setbatteryvelocity.setTabContainer != null : !str9.equals(setbatteryvelocity.setTabContainer)) {
            return false;
        }
        String str10 = this.ActionBarContextView;
        if (str10 == null ? setbatteryvelocity.ActionBarContextView != null : !str10.equals(setbatteryvelocity.ActionBarContextView)) {
            return false;
        }
        String str11 = this.setCustomView;
        if (str11 == null ? setbatteryvelocity.setCustomView != null : !str11.equals(setbatteryvelocity.setCustomView)) {
            return false;
        }
        String str12 = this.setCheckable;
        if (str12 == null ? setbatteryvelocity.setCheckable != null : !str12.equals(setbatteryvelocity.setCheckable)) {
            return false;
        }
        BigDecimal bigDecimal5 = this.MediaBrowserCompat$SearchResultReceiver;
        if (bigDecimal5 == null ? setbatteryvelocity.MediaBrowserCompat$SearchResultReceiver != null : !bigDecimal5.equals(setbatteryvelocity.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str13 = this.PlaybackStateCompat$CustomAction;
        if (str13 == null ? setbatteryvelocity.PlaybackStateCompat$CustomAction != null : !str13.equals(setbatteryvelocity.PlaybackStateCompat$CustomAction)) {
            return false;
        }
        String str14 = this.setHasDecor;
        if (str14 == null ? setbatteryvelocity.setHasDecor != null : !str14.equals(setbatteryvelocity.setHasDecor)) {
            return false;
        }
        String str15 = this.AlertController$RecycleListView;
        if (str15 == null ? setbatteryvelocity.AlertController$RecycleListView != null : !str15.equals(setbatteryvelocity.AlertController$RecycleListView)) {
            return false;
        }
        String str16 = this.Keep;
        if (str16 == null ? setbatteryvelocity.Keep != null : !str16.equals(setbatteryvelocity.Keep)) {
            return false;
        }
        String str17 = this.AppCompatActivity;
        if (str17 == null ? setbatteryvelocity.AppCompatActivity != null : !str17.equals(setbatteryvelocity.AppCompatActivity)) {
            return false;
        }
        String str18 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str18 == null ? setbatteryvelocity.MediaBrowserCompat$CustomActionResultReceiver != null : !str18.equals(setbatteryvelocity.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        BigDecimal bigDecimal6 = this.setTransitioning;
        if (bigDecimal6 == null ? setbatteryvelocity.setTransitioning != null : !bigDecimal6.equals(setbatteryvelocity.setTransitioning)) {
            return false;
        }
        String str19 = this.ParcelableVolumeInfo;
        if (str19 == null ? setbatteryvelocity.ParcelableVolumeInfo != null : !str19.equals(setbatteryvelocity.ParcelableVolumeInfo)) {
            return false;
        }
        String str20 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str20 == null ? setbatteryvelocity.MediaSessionCompat$ResultReceiverWrapper != null : !str20.equals(setbatteryvelocity.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str21 = this.f2934x50fd9e4a;
        if (str21 == null ? setbatteryvelocity.f2934x50fd9e4a != null : !str21.equals(setbatteryvelocity.f2934x50fd9e4a)) {
            return false;
        }
        String str22 = this.MediaSessionCompat$QueueItem;
        if (str22 == null ? setbatteryvelocity.MediaSessionCompat$QueueItem != null : !str22.equals(setbatteryvelocity.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str23 = this.PlaybackStateCompat;
        if (str23 == null ? setbatteryvelocity.PlaybackStateCompat != null : !str23.equals(setbatteryvelocity.PlaybackStateCompat)) {
            return false;
        }
        String str24 = this.setIcon;
        if (str24 == null ? setbatteryvelocity.setIcon != null : !str24.equals(setbatteryvelocity.setIcon)) {
            return false;
        }
        String str25 = this.setPopupCallback;
        if (str25 == null ? setbatteryvelocity.setPopupCallback != null : !str25.equals(setbatteryvelocity.setPopupCallback)) {
            return false;
        }
        String str26 = this.setItemInvoker;
        if (str26 == null ? setbatteryvelocity.setItemInvoker != null : !str26.equals(setbatteryvelocity.setItemInvoker)) {
            return false;
        }
        String str27 = this.setForceShowIcon;
        if (str27 == null ? setbatteryvelocity.setForceShowIcon != null : !str27.equals(setbatteryvelocity.setForceShowIcon)) {
            return false;
        }
        String str28 = this.setTitle;
        if (str28 == null ? setbatteryvelocity.setTitle != null : !str28.equals(setbatteryvelocity.setTitle)) {
            return false;
        }
        String str29 = this.setGroupDividerEnabled;
        if (str29 == null ? setbatteryvelocity.setGroupDividerEnabled != null : !str29.equals(setbatteryvelocity.setGroupDividerEnabled)) {
            return false;
        }
        String str30 = this.ListMenuItemView;
        if (str30 == null ? setbatteryvelocity.ListMenuItemView != null : !str30.equals(setbatteryvelocity.ListMenuItemView)) {
            return false;
        }
        String str31 = this.ExpandedMenuView;
        if (str31 == null ? setbatteryvelocity.ExpandedMenuView != null : !str31.equals(setbatteryvelocity.ExpandedMenuView)) {
            return false;
        }
        String str32 = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
        if (str32 == null ? setbatteryvelocity.MenuItemWrapperICS$CollapsibleActionViewWrapper != null : !str32.equals(setbatteryvelocity.MenuItemWrapperICS$CollapsibleActionViewWrapper)) {
            return false;
        }
        String str33 = this.setContentHeight;
        if (str33 == null ? setbatteryvelocity.setContentHeight != null : !str33.equals(setbatteryvelocity.setContentHeight)) {
            return false;
        }
        String str34 = this.MenuItemImpl;
        if (str34 == null ? setbatteryvelocity.MenuItemImpl != null : !str34.equals(setbatteryvelocity.MenuItemImpl)) {
            return false;
        }
        String str35 = this.setTitleOptional;
        if (str35 == null ? setbatteryvelocity.setTitleOptional != null : !str35.equals(setbatteryvelocity.setTitleOptional)) {
            return false;
        }
        String str36 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str36 == null ? setbatteryvelocity.AppCompatDelegateImpl$ListMenuDecorView != null : !str36.equals(setbatteryvelocity.AppCompatDelegateImpl$ListMenuDecorView)) {
            return false;
        }
        String str37 = this.setBackgroundResource;
        if (str37 == null ? setbatteryvelocity.setBackgroundResource != null : !str37.equals(setbatteryvelocity.setBackgroundResource)) {
            return false;
        }
        String str38 = this.setContentView;
        if (str38 == null ? setbatteryvelocity.setContentView != null : !str38.equals(setbatteryvelocity.setContentView)) {
            return false;
        }
        String str39 = this.ActionBarContainer;
        if (str39 == null ? setbatteryvelocity.ActionBarContainer != null : !str39.equals(setbatteryvelocity.ActionBarContainer)) {
            return false;
        }
        String str40 = this.setStackedBackground;
        if (str40 == null ? setbatteryvelocity.setStackedBackground != null : !str40.equals(setbatteryvelocity.setStackedBackground)) {
            return false;
        }
        if (this.MediaDescriptionCompat != setbatteryvelocity.MediaDescriptionCompat) {
            return false;
        }
        String str41 = this.MediaMetadataCompat;
        if (str41 == null ? setbatteryvelocity.MediaMetadataCompat != null : !str41.equals(setbatteryvelocity.MediaMetadataCompat)) {
            return false;
        }
        String str42 = this.setSplitBackground;
        if (str42 == null ? setbatteryvelocity.setSplitBackground != null : !str42.equals(setbatteryvelocity.setSplitBackground)) {
            return false;
        }
        String str43 = this.RatingCompat;
        if (str43 == null ? setbatteryvelocity.RatingCompat != null : !str43.equals(setbatteryvelocity.RatingCompat)) {
            return false;
        }
        String str44 = this.write;
        if (str44 == null ? setbatteryvelocity.write != null : !str44.equals(setbatteryvelocity.write)) {
            return false;
        }
        String str45 = this.setChecked;
        if (str45 == null ? setbatteryvelocity.setChecked != null : !str45.equals(setbatteryvelocity.setChecked)) {
            return false;
        }
        List<setPc> list = this.MediaSessionCompat$Token;
        if (list == null ? setbatteryvelocity.MediaSessionCompat$Token != null : !list.equals(setbatteryvelocity.MediaSessionCompat$Token)) {
            return false;
        }
        List<setPc> list2 = this.MediaBrowserCompat$MediaItem;
        if (list2 == null ? setbatteryvelocity.MediaBrowserCompat$MediaItem != null : !list2.equals(setbatteryvelocity.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        List<setPc> list3 = this.AppCompatDialogFragment;
        List<setPc> list4 = setbatteryvelocity.AppCompatDialogFragment;
        if (list3 != null) {
            return list3.equals(list4);
        }
        if (list4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.ActionMenuItemView;
        int hashCode = bigDecimal != null ? bigDecimal.hashCode() : 0;
        BigDecimal bigDecimal2 = this.setSubtitle;
        int hashCode2 = bigDecimal2 != null ? bigDecimal2.hashCode() : 0;
        BigDecimal bigDecimal3 = this.AbsActionBarView;
        int hashCode3 = bigDecimal3 != null ? bigDecimal3.hashCode() : 0;
        BigDecimal bigDecimal4 = this.setVisibility;
        int hashCode4 = bigDecimal4 != null ? bigDecimal4.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = str != null ? str.hashCode() : 0;
        String str2 = this.setExpandedFormat;
        int hashCode6 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode7 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.setPadding;
        int hashCode8 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.setShortcut;
        int hashCode9 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.AppCompatViewInflater;
        int hashCode10 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.setPrimaryBackground;
        int hashCode11 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.setHasNonEmbeddedTabs;
        int hashCode12 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.setTabContainer;
        int hashCode13 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.ActionBarContextView;
        int hashCode14 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.setCustomView;
        int hashCode15 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.setCheckable;
        int hashCode16 = str12 != null ? str12.hashCode() : 0;
        BigDecimal bigDecimal5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode17 = bigDecimal5 != null ? bigDecimal5.hashCode() : 0;
        String str13 = this.PlaybackStateCompat$CustomAction;
        int hashCode18 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.setHasDecor;
        int hashCode19 = str14 != null ? str14.hashCode() : 0;
        String str15 = this.AlertController$RecycleListView;
        int hashCode20 = str15 != null ? str15.hashCode() : 0;
        String str16 = this.Keep;
        int hashCode21 = str16 != null ? str16.hashCode() : 0;
        String str17 = this.AppCompatActivity;
        int hashCode22 = str17 != null ? str17.hashCode() : 0;
        String str18 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode23 = str18 != null ? str18.hashCode() : 0;
        BigDecimal bigDecimal6 = this.setTransitioning;
        int hashCode24 = bigDecimal6 != null ? bigDecimal6.hashCode() : 0;
        String str19 = this.ParcelableVolumeInfo;
        int hashCode25 = str19 != null ? str19.hashCode() : 0;
        String str20 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode26 = str20 != null ? str20.hashCode() : 0;
        String str21 = this.f2934x50fd9e4a;
        int hashCode27 = str21 != null ? str21.hashCode() : 0;
        String str22 = this.MediaSessionCompat$QueueItem;
        int hashCode28 = str22 != null ? str22.hashCode() : 0;
        String str23 = this.PlaybackStateCompat;
        int hashCode29 = str23 != null ? str23.hashCode() : 0;
        String str24 = this.setIcon;
        int hashCode30 = str24 != null ? str24.hashCode() : 0;
        String str25 = this.setPopupCallback;
        int hashCode31 = str25 != null ? str25.hashCode() : 0;
        String str26 = this.setItemInvoker;
        int hashCode32 = str26 != null ? str26.hashCode() : 0;
        String str27 = this.setForceShowIcon;
        int hashCode33 = str27 != null ? str27.hashCode() : 0;
        String str28 = this.setTitle;
        int hashCode34 = str28 != null ? str28.hashCode() : 0;
        String str29 = this.setGroupDividerEnabled;
        int hashCode35 = str29 != null ? str29.hashCode() : 0;
        String str30 = this.ListMenuItemView;
        int hashCode36 = str30 != null ? str30.hashCode() : 0;
        String str31 = this.ExpandedMenuView;
        int hashCode37 = str31 != null ? str31.hashCode() : 0;
        String str32 = this.MenuItemWrapperICS$CollapsibleActionViewWrapper;
        int hashCode38 = str32 != null ? str32.hashCode() : 0;
        String str33 = this.setContentHeight;
        int hashCode39 = str33 != null ? str33.hashCode() : 0;
        String str34 = this.MenuItemImpl;
        int hashCode40 = str34 != null ? str34.hashCode() : 0;
        String str35 = this.setTitleOptional;
        int hashCode41 = str35 != null ? str35.hashCode() : 0;
        String str36 = this.AppCompatDelegateImpl$ListMenuDecorView;
        int hashCode42 = str36 != null ? str36.hashCode() : 0;
        String str37 = this.setBackgroundResource;
        int hashCode43 = str37 != null ? str37.hashCode() : 0;
        String str38 = this.setContentView;
        int hashCode44 = str38 != null ? str38.hashCode() : 0;
        String str39 = this.ActionBarContainer;
        int hashCode45 = str39 != null ? str39.hashCode() : 0;
        String str40 = this.setStackedBackground;
        int hashCode46 = str40 != null ? str40.hashCode() : 0;
        position position = this.MediaDescriptionCompat;
        int hashCode47 = position != null ? position.hashCode() : 0;
        String str41 = this.MediaMetadataCompat;
        int hashCode48 = str41 != null ? str41.hashCode() : 0;
        String str42 = this.setSplitBackground;
        int hashCode49 = str42 != null ? str42.hashCode() : 0;
        String str43 = this.RatingCompat;
        int hashCode50 = str43 != null ? str43.hashCode() : 0;
        String str44 = this.write;
        int hashCode51 = str44 != null ? str44.hashCode() : 0;
        String str45 = this.setChecked;
        int hashCode52 = str45 != null ? str45.hashCode() : 0;
        List<setPc> list = this.MediaSessionCompat$Token;
        int hashCode53 = list != null ? list.hashCode() : 0;
        List<setPc> list2 = this.MediaBrowserCompat$MediaItem;
        int hashCode54 = list2 != null ? list2.hashCode() : 0;
        List<setPc> list3 = this.AppCompatDialogFragment;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + hashCode21) * 31) + hashCode22) * 31) + hashCode23) * 31) + hashCode24) * 31) + hashCode25) * 31) + hashCode26) * 31) + hashCode27) * 31) + hashCode28) * 31) + hashCode29) * 31) + hashCode30) * 31) + hashCode31) * 31) + hashCode32) * 31) + hashCode33) * 31) + hashCode34) * 31) + hashCode35) * 31) + hashCode36) * 31) + hashCode37) * 31) + hashCode38) * 31) + hashCode39) * 31) + hashCode40) * 31) + hashCode41) * 31) + hashCode42) * 31) + hashCode43) * 31) + hashCode44) * 31) + hashCode45) * 31) + hashCode46) * 31) + hashCode47) * 31) + hashCode48) * 31) + hashCode49) * 31) + hashCode50) * 31) + hashCode51) * 31) + hashCode52) * 31) + hashCode53) * 31) + hashCode54) * 31) + (list3 != null ? list3.hashCode() : 0);
    }
}
