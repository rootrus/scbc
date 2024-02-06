package p040o;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import p040o.access$2300;

/* renamed from: o.adornBoundary */
public class adornBoundary extends writeUInt64NoTag<CheckCaptureModule_GetUriKtaFactory> {
    public immediateCheckedFuture IconCompatParcelizer;
    public Calendar MediaBrowserCompat$ItemReceiver;
    public Calendar MediaBrowserCompat$MediaItem;
    public HashMap<String, ArrayList<Calendar>> MediaBrowserCompat$SearchResultReceiver;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String read;
    public PatternItem write;

    @HmlPinActivity
    public adornBoundary(RegularImmutableBiMap regularImmutableBiMap, PatternItem patternItem) {
        super(regularImmutableBiMap);
        this.write = patternItem;
    }

    public static boolean write(Calendar calendar, Calendar calendar2) {
        return calendar.before(calendar2) || calendar.equals(calendar2);
    }

    public final Calendar read(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        if (this.write.write.setCheckable().equalsIgnoreCase("th")) {
            calendar2.add(1, -543);
        }
        return calendar2;
    }

    public final String[] MediaBrowserCompat$ItemReceiver(String str) {
        ArrayList arrayList = this.MediaBrowserCompat$SearchResultReceiver.get(str);
        if (arrayList == null) {
            return new String[0];
        }
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = new SimpleDateFormat("MMM").format(((Calendar) arrayList.get(i)).getTime());
        }
        return strArr;
    }

    /* renamed from: o.adornBoundary$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk> {
        final boolean MediaBrowserCompat$ItemReceiver;

        public read(boolean z) {
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final void onComplete() {
            adornBoundary.MediaBrowserCompat$CustomActionResultReceiver(adornBoundary.this);
        }

        public final void onError(Throwable th) {
            adornBoundary adornboundary = adornBoundary.this;
            adornboundary.MediaBrowserCompat$ItemReceiver(adornboundary.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            adornBoundary adornboundary = adornBoundary.this;
            toFile tofile = toFile.write;
            if (adornboundary.RatingCompat != null) {
                tofile.IconCompatParcelizer(adornboundary.RatingCompat);
            }
            super.MediaBrowserCompat$ItemReceiver();
        }

        public final /* synthetic */ void onNext(Object obj) {
            adornBoundary adornboundary = adornBoundary.this;
            nativeFromFile nativefromfile = new nativeFromFile(this);
            if (adornboundary.RatingCompat != null) {
                nativefromfile.IconCompatParcelizer(adornboundary.RatingCompat);
            }
        }
    }

    public final String IconCompatParcelizer() {
        if (this.IconCompatParcelizer.setBackgroundResource.value.equalsIgnoreCase(getShortName.TYPE_LONG_TERM.value)) {
            return "Long Term";
        }
        if (this.IconCompatParcelizer.setBackgroundResource.value.equalsIgnoreCase(getShortName.TYPE_FIXED.value)) {
            return "Fixed";
        }
        if (this.IconCompatParcelizer.setBackgroundResource.value.equalsIgnoreCase(getShortName.TYPE_SAVING.value)) {
            return "Savings";
        }
        return this.IconCompatParcelizer.setBackgroundResource.value.equalsIgnoreCase(getShortName.TYPE_CURRENT.value) ? "Current" : "Unknown";
    }

    public final String read() {
        Calendar calendar = this.MediaBrowserCompat$MediaItem;
        Calendar calendar2 = this.MediaBrowserCompat$ItemReceiver;
        Calendar instance = Calendar.getInstance();
        instance.setTime(calendar2.getTime());
        instance.add(2, 1);
        return String.valueOf((((long) (instance.get(1) - calendar.get(1))) * 12) + ((long) (instance.get(2) - calendar.get(2))));
    }

    public void onDestroy() {
        super.onDestroy();
        PatternItem patternItem = this.write;
        if (!patternItem.MediaBrowserCompat$MediaItem.isDisposed()) {
            patternItem.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(adornBoundary adornboundary) {
        if (adornboundary.RatingCompat != null) {
            adornboundary.RatingCompat.aj_();
        }
    }
}
