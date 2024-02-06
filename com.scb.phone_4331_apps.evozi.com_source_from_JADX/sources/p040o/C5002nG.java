package p040o;

import android.content.SharedPreferences;
import p040o.CharStreams;
import p040o.Functions;
import p040o.LocalProjectProvider;

/* renamed from: o.nG */
public final class C5002nG extends writeUInt64NoTag<LocalProjectProvider.C69342> {
    public final SharedPreferences MediaBrowserCompat$ItemReceiver;
    public final CharStreams.C31734 write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5002nG(RegularImmutableBiMap regularImmutableBiMap, Functions.IdentityFunction identityFunction, CharStreams.C31734 r4, SharedPreferences sharedPreferences) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) identityFunction, "payNowFaqCase");
        onGetStartedClick.write((Object) r4, "payNowFaqDisplayMapper");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        this.write = r4;
        this.MediaBrowserCompat$ItemReceiver = sharedPreferences;
    }

    /* renamed from: o.nG$write */
    public static final class write implements Runnable {
        private /* synthetic */ C5002nG MediaBrowserCompat$ItemReceiver;

        public write(C5002nG nGVar) {
            this.MediaBrowserCompat$ItemReceiver = nGVar;
        }

        /* JADX WARNING: type inference failed for: r2v4, types: [o.nD] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                o.nG r0 = r3.MediaBrowserCompat$ItemReceiver
                o.nG$write$3 r1 = p040o.C5002nG.write.C50033.IconCompatParcelizer
                o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
                if (r1 == 0) goto L_0x000e
                o.nD r2 = new o.nD
                r2.<init>(r1)
                r1 = r2
            L_0x000e:
                o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
                T r2 = r0.RatingCompat
                if (r2 == 0) goto L_0x0016
                r2 = 1
                goto L_0x0017
            L_0x0016:
                r2 = 0
            L_0x0017:
                if (r2 == 0) goto L_0x001e
                T r0 = r0.RatingCompat
                r1.IconCompatParcelizer(r0)
            L_0x001e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C5002nG.write.run():void");
        }
    }
}
