package p040o;

import java.math.BigDecimal;
import p040o.GoogleApiManager;

/* renamed from: o.setUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver */
public final class setUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentByWho {
    private final /* synthetic */ GoogleApiManager.zab MediaBrowserCompat$ItemReceiver;

    private setUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ setUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver(GoogleApiManager.zab zab) {
        this.MediaBrowserCompat$ItemReceiver = zab;
    }

    public final Object IconCompatParcelizer(Object obj) {
        zzrm zzrm;
        String str;
        int i;
        String str2;
        zzrm zzrm2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        onMapReady onmapready;
        OnMapReadyCallback onMapReadyCallback;
        onStreetViewPanoramaReady onstreetviewpanoramaready;
        GoogleApiManager.zab zab = this.MediaBrowserCompat$ItemReceiver;
        setDividerDrawableHorizontal setdividerdrawablehorizontal = (setDividerDrawableHorizontal) obj;
        int i2 = setdividerdrawablehorizontal.MediaMetadataCompat;
        String str8 = setdividerdrawablehorizontal.MediaDescriptionCompat;
        int i3 = setdividerdrawablehorizontal.MediaBrowserCompat$MediaItem;
        String str9 = setdividerdrawablehorizontal.MediaBrowserCompat$SearchResultReceiver;
        if (setdividerdrawablehorizontal.read != null) {
            setOnPageChangeListener setonpagechangelistener = setdividerdrawablehorizontal.read;
            zzrm = new zzrm(setonpagechangelistener.write(), setonpagechangelistener.IconCompatParcelizer(), setonpagechangelistener.read());
        } else {
            zzrm = null;
        }
        String str10 = setdividerdrawablehorizontal.MediaSessionCompat$ResultReceiverWrapper;
        String str11 = setdividerdrawablehorizontal.MediaBrowserCompat$CustomActionResultReceiver;
        int i4 = setdividerdrawablehorizontal.write;
        String str12 = setdividerdrawablehorizontal.RatingCompat;
        String str13 = setdividerdrawablehorizontal.MediaBrowserCompat$ItemReceiver;
        String str14 = setdividerdrawablehorizontal.IconCompatParcelizer;
        if (setdividerdrawablehorizontal.MediaSessionCompat$Token != null) {
            setDividerDrawableVertical setdividerdrawablevertical = setdividerdrawablehorizontal.MediaSessionCompat$Token;
            String str15 = setdividerdrawablevertical.MediaBrowserCompat$ItemReceiver;
            String str16 = setdividerdrawablevertical.MediaBrowserCompat$CustomActionResultReceiver;
            str7 = str14;
            String str17 = setdividerdrawablevertical.write;
            str6 = str13;
            String str18 = setdividerdrawablevertical.IconCompatParcelizer;
            str5 = str12;
            BigDecimal bigDecimal = setdividerdrawablevertical.read;
            str4 = str11;
            String str19 = setdividerdrawablevertical.AppCompatDialogFragment;
            str3 = str10;
            if (setdividerdrawablevertical.setHasDecor != null) {
                setAlignContent setaligncontent = setdividerdrawablevertical.setHasDecor;
                zzrm2 = zzrm;
                str2 = str9;
                i = i3;
                str = str8;
                onstreetviewpanoramaready = new onStreetViewPanoramaReady(setaligncontent.MediaBrowserCompat$CustomActionResultReceiver, setaligncontent.write, setaligncontent.read, setaligncontent.IconCompatParcelizer);
            } else {
                str = str8;
                i = i3;
                str2 = str9;
                zzrm2 = zzrm;
                onstreetviewpanoramaready = null;
            }
            onmapready = new onMapReady(str15, str16, str17, str18, bigDecimal, str19, onstreetviewpanoramaready, setdividerdrawablevertical.RatingCompat, setdividerdrawablevertical.MediaBrowserCompat$SearchResultReceiver, setdividerdrawablevertical.MediaDescriptionCompat, setdividerdrawablevertical.f2939x50fd9e4a, setdividerdrawablevertical.AlertController$RecycleListView, setdividerdrawablevertical.MediaMetadataCompat, setdividerdrawablevertical.MediaSessionCompat$ResultReceiverWrapper, setdividerdrawablevertical.MediaSessionCompat$Token, setdividerdrawablevertical.PlaybackStateCompat$CustomAction, setdividerdrawablevertical.Keep, setdividerdrawablevertical.MediaBrowserCompat$MediaItem, zab.MediaBrowserCompat$ItemReceiver(setdividerdrawablevertical.MediaSessionCompat$QueueItem), zab.MediaBrowserCompat$ItemReceiver(setdividerdrawablevertical.PlaybackStateCompat), zab.MediaBrowserCompat$ItemReceiver(setdividerdrawablevertical.ParcelableVolumeInfo));
        } else {
            str = str8;
            i = i3;
            str2 = str9;
            str3 = str10;
            zzrm2 = zzrm;
            str4 = str11;
            str5 = str12;
            str6 = str13;
            str7 = str14;
            onmapready = null;
        }
        if (setdividerdrawablehorizontal.ParcelableVolumeInfo != null) {
            FlexboxLayout flexboxLayout = setdividerdrawablehorizontal.ParcelableVolumeInfo;
            onMapReadyCallback = new OnMapReadyCallback(flexboxLayout.setPrimaryBackground, flexboxLayout.MenuItemWrapperICS$CollapsibleActionViewWrapper, flexboxLayout.setHasDecor, flexboxLayout.AppCompatDialogFragment, flexboxLayout.write, flexboxLayout.MediaBrowserCompat$ItemReceiver, flexboxLayout.MediaBrowserCompat$CustomActionResultReceiver, flexboxLayout.RatingCompat, flexboxLayout.read, flexboxLayout.IconCompatParcelizer, flexboxLayout.setCheckable, flexboxLayout.setSplitBackground, flexboxLayout.setContentView, flexboxLayout.AbsActionBarView, flexboxLayout.setContentHeight, flexboxLayout.setTabContainer, flexboxLayout.AppCompatDelegateImpl$ListMenuDecorView, flexboxLayout.setIcon, flexboxLayout.setShortcut, flexboxLayout.ListMenuItemView, flexboxLayout.setTitle, flexboxLayout.setGroupDividerEnabled, flexboxLayout.PlaybackStateCompat$CustomAction, flexboxLayout.ExpandedMenuView, flexboxLayout.setExpandedFormat, flexboxLayout.AppCompatViewInflater, flexboxLayout.setPopupCallback, flexboxLayout.setItemInvoker, flexboxLayout.setPadding, flexboxLayout.MediaMetadataCompat, flexboxLayout.MediaBrowserCompat$SearchResultReceiver, flexboxLayout.MediaBrowserCompat$MediaItem, flexboxLayout.MediaDescriptionCompat, flexboxLayout.MediaSessionCompat$Token, flexboxLayout.ParcelableVolumeInfo, flexboxLayout.MediaSessionCompat$ResultReceiverWrapper, flexboxLayout.MediaSessionCompat$QueueItem, flexboxLayout.f2709x50fd9e4a, flexboxLayout.PlaybackStateCompat, flexboxLayout.AlertController$RecycleListView, flexboxLayout.setForceShowIcon, position.NORMALL_BILLER, "", flexboxLayout.AppCompatActivity, flexboxLayout.setBackgroundResource, flexboxLayout.Keep, flexboxLayout.setVisibility, zab.IconCompatParcelizer(flexboxLayout.setChecked), zab.IconCompatParcelizer(flexboxLayout.ActionMenuItemView), zab.IconCompatParcelizer(flexboxLayout.MenuItemImpl));
        } else {
            onMapReadyCallback = null;
        }
        return new setActivity(i2, str, i, str2, zzrm2, str3, str4, String.valueOf(i4), str5, str6, str7, onmapready, onMapReadyCallback, (String) null, (String) null);
    }
}
