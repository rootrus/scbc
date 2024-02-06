package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.Iterables;
import p040o.SortedLists;
import p040o.TabLayout;
import p040o.populateThreadsList;

/* renamed from: o.nextElement */
public final class nextElement extends Iterables.C35339 {
    public final getStartFinalizer IconCompatParcelizer;
    public final TabLayout.TabView MediaBrowserCompat$CustomActionResultReceiver;
    public final setBoxBackgroundColor read;
    final SortedLists.Relation.C38005 write;

    /* renamed from: o.nextElement$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<getSettingsClient, populateThreadsList> {
        private /* synthetic */ nextElement MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(nextElement nextelement) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = nextelement;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List<CrashlyticsUncaughtExceptionHandler> list;
            List<CrashlyticsReportWithSessionId> list2;
            String MediaBrowserCompat$CustomActionResultReceiver2;
            getSettingsClient getsettingsclient = (getSettingsClient) obj;
            onGetStartedClick.write((Object) getsettingsclient, "it");
            SortedLists.Relation.C38005 r0 = this.MediaBrowserCompat$CustomActionResultReceiver.write;
            onGetStartedClick.write((Object) getsettingsclient, "data");
            populateThreadsList.write write = populateThreadsList.MediaBrowserCompat$CustomActionResultReceiver;
            populateThreadsList populatethreadslist = new populateThreadsList();
            populatethreadslist.MediaBrowserCompat$ItemReceiver = getsettingsclient.IconCompatParcelizer;
            List<getMaxWaitTime> list3 = getsettingsclient.write;
            List<isAutomaticDataCollectionEnabled> list4 = null;
            String str = "";
            if (list3 != null) {
                onGetStartedClick.write((Object) list3, "highLights");
                Iterable<getMaxWaitTime> iterable = list3;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (getMaxWaitTime getmaxwaittime : iterable) {
                    onGetStartedClick.write((Object) getmaxwaittime, "highlight");
                    String c_ = r0.mo26549c_(getmaxwaittime.write);
                    String str2 = getmaxwaittime.read;
                    String str3 = str2 == null ? str : str2;
                    String str4 = getmaxwaittime.MediaBrowserCompat$ItemReceiver;
                    String str5 = str4 == null ? str : str4;
                    String str6 = getmaxwaittime.IconCompatParcelizer;
                    String str7 = str6 == null ? str : str6;
                    String str8 = getmaxwaittime.MediaBrowserCompat$CustomActionResultReceiver;
                    arrayList.add(new CrashlyticsUncaughtExceptionHandler(c_, str3, str5, str7, str8 == null ? str : str8));
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            populatethreadslist.IconCompatParcelizer = list;
            List<getNumUpdates> list5 = getsettingsclient.MediaBrowserCompat$CustomActionResultReceiver;
            if (list5 != null) {
                list2 = r0.MediaBrowserCompat$ItemReceiver(list5);
            } else {
                list2 = null;
            }
            populatethreadslist.MediaMetadataCompat = list2;
            populatethreadslist.MediaBrowserCompat$SearchResultReceiver = r0.IconCompatParcelizer("dd MMM yyyy", getsettingsclient.MediaMetadataCompat);
            List<setNumUpdates> list6 = getsettingsclient.read;
            if (list6 != null) {
                list4 = r0.read(list6);
                if (!list4.isEmpty()) {
                    list4.get(0).MediaBrowserCompat$CustomActionResultReceiver = true;
                }
            }
            populatethreadslist.MediaDescriptionCompat = list4;
            OffsetDateTime offsetDateTime = getsettingsclient.MediaBrowserCompat$ItemReceiver;
            if (!(offsetDateTime == null || (MediaBrowserCompat$CustomActionResultReceiver2 = r0.MediaBrowserCompat$CustomActionResultReceiver(offsetDateTime)) == null)) {
                str = MediaBrowserCompat$CustomActionResultReceiver2;
            }
            populatethreadslist.read = str;
            return populatethreadslist;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public nextElement(TabLayout.TabView tabView, setBoxBackgroundColor setboxbackgroundcolor, getStartFinalizer getstartfinalizer, SortedLists.Relation.C38005 r5) {
        super((byte) 0);
        onGetStartedClick.write((Object) tabView, "discoverDisclaimerCase");
        onGetStartedClick.write((Object) setboxbackgroundcolor, "discoverLandingCase");
        onGetStartedClick.write((Object) getstartfinalizer, "getNtbUserInfoUseCase");
        onGetStartedClick.write((Object) r5, "discoverLandingMapper");
        this.MediaBrowserCompat$CustomActionResultReceiver = tabView;
        this.read = setboxbackgroundcolor;
        this.IconCompatParcelizer = getstartfinalizer;
        this.write = r5;
    }
}
