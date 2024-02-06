package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.BaseLayer;

/* renamed from: o.AccountPicker */
public final class AccountPicker extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.AccountPicker$AccountChooserOptions */
    public final class AccountChooserOptions implements OPRStatusRewardsLandingActivity_ViewBinding<setAllowableAccountsTypes> {
        private static final AccountChooserOptions MediaBrowserCompat$CustomActionResultReceiver = new AccountChooserOptions();

        /* renamed from: o.AccountPicker$AccountChooserOptions$zza */
        public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<setTitleOverrideText> {
            private static final zza read = new zza();

            public static zza MediaBrowserCompat$CustomActionResultReceiver() {
                return read;
            }

            public final /* synthetic */ Object get() {
                return new setTitleOverrideText();
            }
        }

        public static AccountChooserOptions MediaBrowserCompat$CustomActionResultReceiver() {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        /* renamed from: o.AccountPicker$AccountChooserOptions$Builder */
        public final class Builder extends FragmentBuilder_BindSummaryFragment {
            public final LocationSettingsResult read(getLayerModel getlayermodel) {
                LocationSettingsStates locationSettingsStates;
                isNetworkLocationUsable isnetworklocationusable;
                isBleUsable isbleusable;
                isBleUsable isbleusable2;
                isLocationUsable islocationusable;
                LocationStatusCodes locationStatusCodes;
                LocationSettingsStatusCodes locationSettingsStatusCodes;
                isGpsUsable isgpsusable;
                isGpsPresent isgpspresent;
                isLocationPresent islocationpresent;
                isNetworkLocationPresent isnetworklocationpresent = null;
                if (getlayermodel == null) {
                    return null;
                }
                LocationSettingsResult locationSettingsResult = new LocationSettingsResult();
                setVisible setvisible = getlayermodel.MediaDescriptionCompat;
                if (setvisible == null) {
                    locationSettingsStates = null;
                } else {
                    locationSettingsStates = new LocationSettingsStates();
                    locationSettingsStates.MediaBrowserCompat$MediaItem = setvisible.MediaDescriptionCompat;
                    removeAnimation removeanimation = setvisible.MediaBrowserCompat$ItemReceiver;
                    if (removeanimation == null) {
                        islocationpresent = null;
                    } else {
                        islocationpresent = new isLocationPresent();
                        islocationpresent.IconCompatParcelizer = removeanimation.IconCompatParcelizer;
                    }
                    locationSettingsStates.MediaBrowserCompat$CustomActionResultReceiver = islocationpresent;
                    locationSettingsStates.MediaMetadataCompat = setvisible.MediaBrowserCompat$SearchResultReceiver;
                    locationSettingsStates.write = IconCompatParcelizer(setvisible.MediaBrowserCompat$CustomActionResultReceiver);
                    locationSettingsStates.MediaBrowserCompat$ItemReceiver = setvisible.read;
                    locationSettingsStates.read = setvisible.IconCompatParcelizer;
                    locationSettingsStates.RatingCompat = setvisible.MediaMetadataCompat;
                    locationSettingsStates.MediaSessionCompat$Token = setvisible.MediaBrowserCompat$MediaItem;
                    locationSettingsStates.MediaDescriptionCompat = setvisible.RatingCompat;
                }
                locationSettingsResult.MediaBrowserCompat$MediaItem = locationSettingsStates;
                BaseLayer.C31212 r2 = getlayermodel.MediaBrowserCompat$CustomActionResultReceiver;
                if (r2 == null) {
                    isnetworklocationusable = null;
                } else {
                    isnetworklocationusable = new isNetworkLocationUsable();
                    isnetworklocationusable.IconCompatParcelizer = r2.MediaBrowserCompat$ItemReceiver;
                    isnetworklocationusable.MediaBrowserCompat$ItemReceiver = r2.write;
                    isnetworklocationusable.MediaBrowserCompat$CustomActionResultReceiver = r2.IconCompatParcelizer;
                }
                locationSettingsResult.MediaBrowserCompat$CustomActionResultReceiver = isnetworklocationusable;
                hasMatteOnThisLayer hasmatteonthislayer = getlayermodel.read;
                if (hasmatteonthislayer == null) {
                    isbleusable = null;
                } else {
                    isbleusable = new isBleUsable();
                    List<String> list = hasmatteonthislayer.write;
                    if (list != null) {
                        isbleusable.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList(list);
                    } else {
                        isbleusable.MediaBrowserCompat$CustomActionResultReceiver = null;
                    }
                }
                locationSettingsResult.IconCompatParcelizer = isbleusable;
                hasMatteOnThisLayer hasmatteonthislayer2 = getlayermodel.MediaBrowserCompat$ItemReceiver;
                if (hasmatteonthislayer2 == null) {
                    isbleusable2 = null;
                } else {
                    isbleusable2 = new isBleUsable();
                    List<String> list2 = hasmatteonthislayer2.write;
                    if (list2 != null) {
                        isbleusable2.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList(list2);
                    } else {
                        isbleusable2.MediaBrowserCompat$CustomActionResultReceiver = null;
                    }
                }
                locationSettingsResult.write = isbleusable2;
                setMatteLayer setmattelayer = getlayermodel.write;
                if (setmattelayer == null) {
                    islocationusable = null;
                } else {
                    islocationusable = new isLocationUsable();
                    islocationusable.MediaBrowserCompat$ItemReceiver = setmattelayer.IconCompatParcelizer;
                }
                locationSettingsResult.read = islocationusable;
                setParentLayer setparentlayer = getlayermodel.MediaMetadataCompat;
                if (setparentlayer == null) {
                    locationStatusCodes = null;
                } else {
                    locationStatusCodes = new LocationStatusCodes();
                    locationStatusCodes.read = setparentlayer.write;
                    resolveChildKeyPath resolvechildkeypath = setparentlayer.read;
                    if (resolvechildkeypath == null) {
                        isgpspresent = null;
                    } else {
                        isgpspresent = new isGpsPresent();
                        isgpspresent.MediaBrowserCompat$CustomActionResultReceiver = resolvechildkeypath.MediaBrowserCompat$ItemReceiver;
                        isgpspresent.read = resolvechildkeypath.read;
                        isgpspresent.write = resolvechildkeypath.MediaBrowserCompat$CustomActionResultReceiver;
                    }
                    locationStatusCodes.write = isgpspresent;
                }
                locationSettingsResult.MediaDescriptionCompat = locationStatusCodes;
                CompositionLayer compositionLayer = getlayermodel.MediaBrowserCompat$MediaItem;
                if (compositionLayer == null) {
                    locationSettingsStatusCodes = null;
                } else {
                    locationSettingsStatusCodes = new LocationSettingsStatusCodes();
                    drawLayer drawlayer = compositionLayer.MediaBrowserCompat$ItemReceiver;
                    if (drawlayer == null) {
                        isgpsusable = null;
                    } else {
                        isgpsusable = new isGpsUsable();
                        isgpsusable.MediaBrowserCompat$CustomActionResultReceiver = drawlayer.MediaBrowserCompat$CustomActionResultReceiver;
                        isgpsusable.MediaBrowserCompat$ItemReceiver = drawlayer.MediaBrowserCompat$ItemReceiver;
                    }
                    locationSettingsStatusCodes.MediaBrowserCompat$CustomActionResultReceiver = isgpsusable;
                }
                locationSettingsResult.RatingCompat = locationSettingsStatusCodes;
                BaseLayer.C31201 r7 = getlayermodel.IconCompatParcelizer;
                if (r7 != null) {
                    isnetworklocationpresent = new isNetworkLocationPresent();
                    isnetworklocationpresent.MediaBrowserCompat$ItemReceiver = r7.write;
                    isnetworklocationpresent.IconCompatParcelizer = r7.IconCompatParcelizer;
                }
                locationSettingsResult.MediaBrowserCompat$ItemReceiver = isnetworklocationpresent;
                return locationSettingsResult;
            }
        }

        public final /* synthetic */ Object get() {
            return new setAllowableAccountsTypes();
        }
    }
}
