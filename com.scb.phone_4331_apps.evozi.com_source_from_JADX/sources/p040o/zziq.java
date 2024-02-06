package p040o;

import p040o.CrashlyticsRegistrar$$Lambda$1;

/* renamed from: o.zziq */
public final /* synthetic */ class zziq implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CrashlyticsRegistrar$$Lambda$1.IconCompatParcelizer write;

    public /* synthetic */ zziq(CrashlyticsRegistrar$$Lambda$1.IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        AnimatablePathValue animatablePathValue = (AnimatablePathValue) obj;
        onGetStartedClick.write((Object) animatablePathValue, "occupationInfoEntity");
        AnimatableIntegerValue animatableIntegerValue = animatablePathValue.MediaMetadataCompat;
        setContentDescription setcontentdescription = null;
        String str3 = animatableIntegerValue != null ? animatableIntegerValue.MediaBrowserCompat$ItemReceiver : null;
        String str4 = animatableIntegerValue != null ? animatableIntegerValue.IconCompatParcelizer : null;
        if (animatableIntegerValue != null) {
            str = animatableIntegerValue.write;
        } else {
            str = null;
        }
        setMaxZoomPreference setmaxzoompreference = new setMaxZoomPreference(str3, str4, str);
        AnimatableTextFrame animatableTextFrame = animatablePathValue.MediaDescriptionCompat;
        onGetStartedClick.write((Object) animatableTextFrame, "sourceOfIncomeEntity");
        String str5 = animatableTextFrame.write;
        String str6 = animatableTextFrame.MediaBrowserCompat$ItemReceiver;
        if (str6 == null) {
            str6 = "";
        }
        setMapStyle setmapstyle = new setMapStyle(str5, str6);
        String str7 = animatablePathValue.read;
        String str8 = animatablePathValue.IconCompatParcelizer;
        String str9 = animatablePathValue.MediaBrowserCompat$ItemReceiver;
        if (str9 == null) {
            str2 = "";
        } else {
            str2 = str9;
        }
        PolystarContent polystarContent = animatablePathValue.MediaBrowserCompat$MediaItem;
        if (polystarContent != null) {
            setcontentdescription = FragmentBuilder_ContributePromptPayManagementLandingFragment.read(polystarContent);
        }
        return new setLatLngBoundsForCameraTarget(setmaxzoompreference, setmapstyle, str7, str8, setcontentdescription, str2, animatablePathValue.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindVerifyIdentityTipsFragment.MediaBrowserCompat$ItemReceiver(animatablePathValue.write));
    }
}
