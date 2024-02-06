package p040o;

import java.util.Locale;
import p040o.writeUInt64NoTag;

/* renamed from: o.ds$MediaBrowserCompat$ItemReceiver */
public final class ds$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setPositionFromBounds> {
    private /* synthetic */ C4299ds write;

    /* renamed from: o.ds$MediaBrowserCompat$ItemReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getInnerThrowables> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

        read(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str, "jsData");
            ((getInnerThrowables) obj).mo15013o_(str);
        }
    }

    public ds$MediaBrowserCompat$ItemReceiver(C4299ds dsVar) {
        this.write = dsVar;
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        setPositionFromBounds setpositionfrombounds = (setPositionFromBounds) obj;
        onGetStartedClick.write((Object) setpositionfrombounds, "response");
        super.onNext(setpositionfrombounds);
        C4299ds.read(this.write);
        String MediaBrowserCompat$CustomActionResultReceiver = this.write.read;
        Locale locale = Locale.getDefault();
        onGetStartedClick.IconCompatParcelizer((Object) locale, "Locale.getDefault()");
        String lowerCase = "SUCCESS".toLowerCase(locale);
        onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        setEvents setevents = new setEvents(lowerCase, "SUCCESS");
        onGetStartedClick.write((Object) setevents, "status");
        String str2 = null;
        String str3 = setpositionfrombounds != null ? setpositionfrombounds.MediaBrowserCompat$ItemReceiver : null;
        if (setpositionfrombounds != null) {
            str = setpositionfrombounds.write;
        } else {
            str = null;
        }
        AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session = new AutoValue_CrashlyticsReport_Session(MediaBrowserCompat$CustomActionResultReceiver, str);
        if (setpositionfrombounds != null) {
            str2 = setpositionfrombounds.IconCompatParcelizer;
        }
        getGenerator getgenerator = new getGenerator(str3, autoValue_CrashlyticsReport_Session, str2, setevents);
        removeExact removeexact = this.write.IconCompatParcelizer;
        onGetStartedClick.write((Object) getgenerator, "response");
        String json = removeexact.IconCompatParcelizer.toJson((Object) getgenerator);
        C4299ds dsVar = this.write;
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(json);
        if (dsVar.RatingCompat != null) {
            read2.IconCompatParcelizer(dsVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        super.onError(th);
        C4299ds.read(this.write);
        this.write.write();
    }
}
