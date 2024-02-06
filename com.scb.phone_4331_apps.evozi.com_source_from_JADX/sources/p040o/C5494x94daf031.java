package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.ActivityTransition;
import p040o.setActivityType;
import p040o.toContent;
import p040o.zzcz;

/* renamed from: o.zzju$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C5494x94daf031 extends CheckEligibilityActivity implements FundFactSheetActivity<toContent, setActivityType> {
    private /* synthetic */ zzju IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5494x94daf031(zzju zzju) {
        super(1);
        this.IconCompatParcelizer = zzju;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str;
        String str2;
        toContent tocontent = (toContent) obj;
        onGetStartedClick.write((Object) tocontent, "it");
        getRequestedScopes getrequestedscopes = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) tocontent, "entity");
        toContent.write write = tocontent.read;
        onGetStartedClick.write((Object) write, "entity");
        double parseDouble = Double.parseDouble(write.MediaBrowserCompat$MediaItem);
        String str3 = write.MediaBrowserCompat$CustomActionResultReceiver;
        double parseDouble2 = Double.parseDouble(write.MediaBrowserCompat$ItemReceiver);
        zzcz.zzg.write write2 = new zzcz.zzg.write(Double.valueOf(parseDouble2), (String) null, write.read.MediaBrowserCompat$ItemReceiver, write.read.write, 50);
        double parseDouble3 = Double.parseDouble(write.IconCompatParcelizer);
        int parseInt = Integer.parseInt(write.MediaBrowserCompat$SearchResultReceiver);
        OffsetDateTime write3 = FragmentBuilder_BindSummaryFragment.write(write.MediaMetadataCompat, OffsetDateTime.now());
        if (write3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) write3, "transformStringToDateTim…, OffsetDateTime.now())!!");
        Iterable<lerp> iterable = write.MediaDescriptionCompat;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (lerp read : iterable) {
            arrayList.add(getSignInClient.read(read));
        }
        zzcz.zzg.write write4 = write2;
        zzcz.zzg zzg = new zzcz.zzg((String) null, parseDouble, str3, write4, parseDouble3, write3, Integer.valueOf(parseInt), (List) arrayList, (zzcz.zzb) null, 129);
        toContent$MediaBrowserCompat$CustomActionResultReceiver tocontent_mediabrowsercompat_customactionresultreceiver = tocontent.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) tocontent_mediabrowsercompat_customactionresultreceiver, "entity");
        String str4 = tocontent_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$Token;
        String str5 = tocontent_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat;
        String str6 = tocontent_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$QueueItem;
        String str7 = tocontent_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        String str8 = tocontent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem;
        OffsetDateTime write5 = FragmentBuilder_BindSummaryFragment.write(tocontent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver, OffsetDateTime.now());
        if (write5 == null) {
            write5 = OffsetDateTime.now();
            onGetStartedClick.IconCompatParcelizer((Object) write5, "OffsetDateTime.now()");
        }
        ActivityTransition.SupportedActivityTransition supportedActivityTransition = new ActivityTransition.SupportedActivityTransition(str4, str5, str6, str7, str8, write5, tocontent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, tocontent_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat, tocontent_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver, tocontent_mediabrowsercompat_customactionresultreceiver.RatingCompat, tocontent_mediabrowsercompat_customactionresultreceiver.read, getrequestedscopes.IconCompatParcelizer.read(tocontent_mediabrowsercompat_customactionresultreceiver.write));
        toContent.read read2 = tocontent.MediaBrowserCompat$ItemReceiver;
        setActivityTransition setactivitytransition = null;
        if (!(read2 == null || (str = read2.IconCompatParcelizer) == null || (str2 = read2.MediaBrowserCompat$ItemReceiver) == null)) {
            setactivitytransition = new setActivityTransition(str2, str);
        }
        setActivityTransition setactivitytransition2 = setactivitytransition;
        getTransitionEvents IconCompatParcelizer2 = getRequestedScopes.IconCompatParcelizer(tocontent.IconCompatParcelizer);
        String str9 = tocontent.MediaMetadataCompat;
        List<String> list = tocontent.write;
        toContent.write.read read3 = tocontent.read.write;
        return new setActivityType(zzg, supportedActivityTransition, setactivitytransition2, IconCompatParcelizer2, str9, list, new setActivityType.write(read3.MediaBrowserCompat$CustomActionResultReceiver, read3.MediaBrowserCompat$ItemReceiver));
    }
}
