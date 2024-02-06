package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.PolystarContent;
import p040o.zzca;
import p040o.zzjx;

/* renamed from: o.getDisplayName */
public final class getDisplayName extends FragmentBuilder_BindSummaryFragment {
    @HmlPinActivity
    public getDisplayName(FragmentBuilder_ContributePromptPayManagementLandingFragment fragmentBuilder_ContributePromptPayManagementLandingFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_ContributePromptPayManagementLandingFragment, "addressEntityMapper");
    }

    public final zzca.zzf.zza MediaBrowserCompat$CustomActionResultReceiver(PolystarContent.C37331 r22) {
        zzca.zze zze;
        setContentDescription setcontentdescription;
        zzjx.zzc zzc;
        zzjx.zzc zzc2;
        zzjx.zzc zzc3;
        String str;
        String str2;
        PolystarContent.C37331 r0 = r22;
        onGetStartedClick.write((Object) r0, "customerContactInfoEntity");
        String str3 = r0.IconCompatParcelizer;
        if (str3 != null) {
            zze = zzca.zze.valueOf(str3);
        } else {
            zze = null;
        }
        String str4 = r0.MediaBrowserCompat$ItemReceiver;
        boolean z = Integer.parseInt(r0.RatingCompat) == 1;
        String str5 = r0.write.MediaDescriptionCompat;
        String str6 = r0.write.MediaMetadataCompat;
        String str7 = r0.write.MediaSessionCompat$ResultReceiverWrapper;
        String str8 = r0.write.MediaBrowserCompat$MediaItem;
        String str9 = r0.write.read;
        String str10 = r0.write.MediaBrowserCompat$ItemReceiver;
        Double valueOf = str10 != null ? Double.valueOf(Double.parseDouble(str10)) : null;
        PolystarContent polystarContent = r0.write.write;
        if (polystarContent != null) {
            setcontentdescription = FragmentBuilder_ContributePromptPayManagementLandingFragment.read(polystarContent);
        } else {
            setcontentdescription = null;
        }
        setVertex setvertex = r0.write.MediaBrowserCompat$SearchResultReceiver;
        if (setvertex != null) {
            zzc = new zzjx.zzc(setvertex.MediaBrowserCompat$ItemReceiver, setvertex.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            zzc = null;
        }
        setVertex setvertex2 = r0.write.RatingCompat;
        if (setvertex2 != null) {
            zzc2 = new zzjx.zzc(setvertex2.MediaBrowserCompat$ItemReceiver, setvertex2.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            zzc2 = null;
        }
        setVertex setvertex3 = r0.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (setvertex3 != null) {
            zzc3 = new zzjx.zzc(setvertex3.MediaBrowserCompat$ItemReceiver, setvertex3.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            zzc3 = null;
        }
        createPolygonPath createpolygonpath = r0.write.IconCompatParcelizer;
        if (createpolygonpath != null) {
            str = createpolygonpath.write;
        } else {
            str = null;
        }
        OffsetDateTime write = FragmentBuilder_BindSummaryFragment.write(str, (OffsetDateTime) null);
        createPolygonPath createpolygonpath2 = r0.write.IconCompatParcelizer;
        if (createpolygonpath2 != null) {
            str2 = createpolygonpath2.IconCompatParcelizer;
        } else {
            str2 = null;
        }
        return new zzca.zzf.zza(zze, str4, z, str5, str6, str7, str8, str9, valueOf, setcontentdescription, zzc, zzc2, zzc3, write, str2, r0.MediaBrowserCompat$CustomActionResultReceiver, Integer.valueOf(r0.read));
    }
}
