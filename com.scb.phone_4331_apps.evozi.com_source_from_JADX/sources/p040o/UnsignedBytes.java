package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.Shorts;

/* renamed from: o.UnsignedBytes */
public final class UnsignedBytes extends constrainedSetMultimap<getPanningGesturesEnabled, CrashlyticsReport.Session.Application.Builder> {
    @HmlPinActivity
    public UnsignedBytes(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: IconCompatParcelizer */
    public final CrashlyticsReport.Session.Application.Builder MediaBrowserCompat$ItemReceiver(getPanningGesturesEnabled getpanninggesturesenabled) {
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list;
        CrashlyticsReport.Session.Application.Builder write = CrashlyticsReport.Session.Application.Builder.write();
        write.read = write(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(getpanninggesturesenabled.write));
        if (getpanninggesturesenabled.read == null) {
            list = null;
        } else {
            list = MediaBrowserCompat$ItemReceiver(getpanninggesturesenabled.read, new Shorts.LexicographicalComparator(this));
        }
        write.MediaBrowserCompat$CustomActionResultReceiver = list;
        return write;
    }

    /* renamed from: o.UnsignedBytes$LexicographicalComparatorHolder */
    public final /* synthetic */ class LexicographicalComparatorHolder implements findFragmentByWho {
        public static final /* synthetic */ LexicographicalComparatorHolder IconCompatParcelizer = new LexicographicalComparatorHolder();

        private /* synthetic */ LexicographicalComparatorHolder() {
        }

        /* renamed from: o.UnsignedBytes$LexicographicalComparatorHolder$PureJavaComparator */
        public final /* synthetic */ class PureJavaComparator implements findFragmentByWho {
            public static final /* synthetic */ PureJavaComparator MediaBrowserCompat$CustomActionResultReceiver = new PureJavaComparator();

            private /* synthetic */ PureJavaComparator() {
            }

            public final Object IconCompatParcelizer(Object obj) {
                setOnIndoorStateChangeListener setonindoorstatechangelistener = (setOnIndoorStateChangeListener) obj;
                return new CrashlyticsReport.Session.OperatingSystem.Builder(setonindoorstatechangelistener.MediaDescriptionCompat, setonindoorstatechangelistener.IconCompatParcelizer, setonindoorstatechangelistener.write, setonindoorstatechangelistener.MediaBrowserCompat$CustomActionResultReceiver, setonindoorstatechangelistener.MediaBrowserCompat$ItemReceiver, setonindoorstatechangelistener.read);
            }
        }

        /* renamed from: o.UnsignedBytes$LexicographicalComparatorHolder$UnsafeComparator */
        public final /* synthetic */ class UnsafeComparator implements findFragmentByWho {
            public static final /* synthetic */ UnsafeComparator write = new UnsafeComparator();

            private /* synthetic */ UnsafeComparator() {
            }

            public final Object IconCompatParcelizer(Object obj) {
                return Integer.valueOf(((CrashlyticsReport.Session.Event.Application.Execution) obj).MenuItemImpl);
            }
        }

        public final Object IconCompatParcelizer(Object obj) {
            setOnIndoorStateChangeListener setonindoorstatechangelistener = (setOnIndoorStateChangeListener) obj;
            return new CrashlyticsReport.Session.OperatingSystem.Builder(setonindoorstatechangelistener.MediaDescriptionCompat, setonindoorstatechangelistener.IconCompatParcelizer, setonindoorstatechangelistener.write, setonindoorstatechangelistener.MediaBrowserCompat$CustomActionResultReceiver, setonindoorstatechangelistener.MediaBrowserCompat$ItemReceiver, setonindoorstatechangelistener.read);
        }
    }
}
