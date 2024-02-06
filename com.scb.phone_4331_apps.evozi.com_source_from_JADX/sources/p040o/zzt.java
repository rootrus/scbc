package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.Arrays;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.BasePartialSearchActivity_ViewBinding;
import p040o.Tables;
import p040o.zzby;
import p040o.zzcz;
import p040o.zzfk;
import p040o.zzfo;

/* renamed from: o.zzt */
public final /* synthetic */ class zzt implements findFragmentByWho {
    public static final /* synthetic */ zzt MediaBrowserCompat$ItemReceiver = new zzt();

    private /* synthetic */ zzt() {
    }

    /* renamed from: o.zzt$zza */
    public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {

        /* renamed from: o.zzt$zza$zza  reason: collision with other inner class name */
        public final /* synthetic */ class C10777zza implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ C10777zza read = new C10777zza();

            private /* synthetic */ C10777zza() {
            }

            public final Object write(Object obj) {
                return (addKey) ((SingleDataEntity) obj).getData();
            }
        }

        /* renamed from: o.zzt$zza$zzb */
        public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ setBody write;

            public /* synthetic */ zzb(setBody setbody) {
                this.write = setbody;
            }

            public final Object write(Object obj) {
                return this.write.write((getFontFamily) obj);
            }
        }

        public /* synthetic */ zza(BasePartialSearchActivity_ViewBinding.read read) {
        }

        /* renamed from: o.zzt$zza$zzd */
        public final /* synthetic */ class zzd implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zzd MediaBrowserCompat$CustomActionResultReceiver = new zzd();

            private /* synthetic */ zzd() {
            }

            public final Object write(Object obj) {
                return ((getStartOpacity) obj).MediaBrowserCompat$ItemReceiver;
            }
        }

        /* renamed from: o.zzt$zza$zzc */
        public final /* synthetic */ class zzc implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ shouldShowCancelButton read;

            public /* synthetic */ zzc(shouldShowCancelButton shouldshowcancelbutton) {
                this.read = shouldshowcancelbutton;
            }

            public final Object write(Object obj) {
                start start = (start) obj;
                return new zzfo.zza(start.MediaBrowserCompat$CustomActionResultReceiver, shouldShowCancelButton.read(start.write, new Tables.ImmutableCell.write(this.read), zzq.read));
            }
        }

        public final Object write(Object obj) {
            String str;
            String str2;
            keysToString keystostring = (keysToString) obj;
            onGetStartedClick.write((Object) keystostring, "hmlVerifyKycStatusEntity");
            String str3 = keystostring.MediaMetadataCompat;
            boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) keystostring.MediaBrowserCompat$MediaItem, (Object) DiskLruCache.VERSION_1);
            String str4 = keystostring.RatingCompat;
            String str5 = keystostring.write;
            String[] strArr = new String[2];
            Font font = keystostring.IconCompatParcelizer;
            String str6 = "";
            if (font == null || (str = font.IconCompatParcelizer) == null) {
                str = str6;
            }
            strArr[0] = str;
            Font font2 = keystostring.IconCompatParcelizer;
            if (!(font2 == null || (str2 = font2.write) == null)) {
                str6 = str2;
            }
            strArr[1] = str6;
            onGetStartedClick.write((Object) strArr, "elements");
            onGetStartedClick.write((Object) strArr, "$this$asList");
            List asList = Arrays.asList(strArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
            String str7 = keystostring.MediaBrowserCompat$ItemReceiver;
            RectangleContent rectangleContent = keystostring.read;
            return new removeActivityTransitionUpdates(str3, MediaBrowserCompat$ItemReceiver, str4, str5, asList, str7, new zzcz.zzi.zza(rectangleContent.MediaBrowserCompat$MediaItem, rectangleContent.write, rectangleContent.RatingCompat, rectangleContent.MediaDescriptionCompat, rectangleContent.MediaBrowserCompat$CustomActionResultReceiver, rectangleContent.MediaBrowserCompat$ItemReceiver, rectangleContent.read, new zzfk.zza(rectangleContent.IconCompatParcelizer.read, rectangleContent.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, rectangleContent.IconCompatParcelizer.write)));
        }
    }

    public final Object IconCompatParcelizer(Object obj) {
        return Integer.valueOf(((zzby.zza) obj).MediaDescriptionCompat);
    }
}
