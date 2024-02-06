package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hb */
public final class C4743hb extends writeUInt64NoTag<LocalProjectProvider.C69353.IconCompatParcelizer> {
    public List<AutoValue_CrashlyticsReport_Session_Event_Application> IconCompatParcelizer;

    /* renamed from: o.hb$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C69353.IconCompatParcelizer> {
        private /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Application MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ C4743hb read;

        public write(C4743hb hbVar, AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application) {
            this.read = hbVar;
            this.MediaBrowserCompat$ItemReceiver = autoValue_CrashlyticsReport_Session_Event_Application;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.C69353.IconCompatParcelizer) obj).write(this.MediaBrowserCompat$ItemReceiver, C4743hb.MediaBrowserCompat$ItemReceiver(this.read));
        }
    }

    @HmlPinActivity
    public C4743hb(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public static final /* synthetic */ ArrayList MediaBrowserCompat$CustomActionResultReceiver(C4743hb hbVar) {
        List<AutoValue_CrashlyticsReport_Session_Event_Application> list = hbVar.IconCompatParcelizer;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCurrencies");
        }
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            boolean z = true;
            if (((AutoValue_CrashlyticsReport_Session_Event_Application) next).MediaBrowserCompat$CustomActionResultReceiver != 1) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return new ArrayList((List) arrayList);
    }

    public static final /* synthetic */ ArrayList MediaBrowserCompat$ItemReceiver(C4743hb hbVar) {
        List<AutoValue_CrashlyticsReport_Session_Event_Application> list = hbVar.IconCompatParcelizer;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mCurrencies");
        }
        return new ArrayList(list.get(0).MediaBrowserCompat$ItemReceiver);
    }
}
