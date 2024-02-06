package p040o;

import java.util.List;
import p040o.zzbt;

/* renamed from: o.zzag */
public final class zzag implements OPRStatusRewardsLandingActivity_ViewBinding<setLogger> {
    private static final zzag IconCompatParcelizer = new zzag();

    /* renamed from: o.zzag$zzb */
    public final class zzb {
        public setHoles read;
        public C3989a_ write;
    }

    /* renamed from: o.zzag$zza */
    public class zza {
        public String MediaBrowserCompat$ItemReceiver;
        public String read;

        public static zza MediaBrowserCompat$CustomActionResultReceiver() {
            return new zza();
        }
    }

    /* renamed from: o.zzag$zzc */
    public final class zzc extends zzuk implements Comparable<zzc> {
        public Double MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String MediaBrowserCompat$MediaItem;
        public List<zzbt.zze> MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2979x50fd9e4a;
        public Double MediaDescriptionCompat;
        public Double MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public Double MediaSessionCompat$ResultReceiverWrapper;
        public int MediaSessionCompat$Token;
        public String ParcelableVolumeInfo;
        public boolean RatingCompat;
        public String read;
        public String write;

        /* renamed from: o.zzag$zzc$read */
        public static final class read {
            public String IconCompatParcelizer;
            public Double MediaBrowserCompat$CustomActionResultReceiver;
            public String MediaBrowserCompat$ItemReceiver;
            public boolean MediaBrowserCompat$MediaItem;
            public String MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public int f2980x50fd9e4a;
            public String MediaDescriptionCompat;
            public Double MediaMetadataCompat;
            public zzvj MediaSessionCompat$QueueItem;
            public String MediaSessionCompat$ResultReceiverWrapper;
            public Double MediaSessionCompat$Token;
            public String ParcelableVolumeInfo;
            public Double RatingCompat;
            public String read;
            public List<zzbt.zze> write;
        }

        public /* synthetic */ zzc(read read2, byte b) {
            this(read2);
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            int i = this.MediaSessionCompat$Token;
            int i2 = ((zzc) obj).MediaSessionCompat$Token;
            if (i > i2) {
                return 1;
            }
            return i < i2 ? -1 : 0;
        }

        private zzc(read read2) {
            this.read = read2.read;
            this.IconCompatParcelizer = read2.MediaSessionCompat$QueueItem;
            this.MediaSessionCompat$Token = read2.f2980x50fd9e4a;
            this.MediaBrowserCompat$MediaItem = read2.MediaBrowserCompat$SearchResultReceiver;
            this.write = read2.IconCompatParcelizer;
            this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$ItemReceiver;
            this.MediaSessionCompat$QueueItem = read2.MediaDescriptionCompat;
            this.f2979x50fd9e4a = read2.ParcelableVolumeInfo;
            this.ParcelableVolumeInfo = read2.MediaSessionCompat$ResultReceiverWrapper;
            this.MediaMetadataCompat = read2.RatingCompat;
            this.MediaDescriptionCompat = read2.MediaMetadataCompat;
            this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaSessionCompat$ResultReceiverWrapper = read2.MediaSessionCompat$Token;
            this.RatingCompat = read2.MediaBrowserCompat$MediaItem;
            this.MediaBrowserCompat$SearchResultReceiver = read2.write;
        }
    }

    /* renamed from: o.zzag$zzd */
    public enum zzd {
        CID_TYPE("CID"),
        SALARY_TYPE("SALARY"),
        STATEMENT_TYPE("STATEMENT"),
        COMP_REGIS_TYPE("COMP_REGIS"),
        INVOICE_TYPE("INVOICE"),
        HOUSE_REGISTRATION_TYPE("HOUSE_REGIS"),
        SPOUSE_CID("SPOUSE_CID"),
        UNKNOWN_TYPE("UNKNOWN");
        
        public String type;

        private zzd(String str) {
            this.type = str;
        }
    }

    public static zzag IconCompatParcelizer() {
        return IconCompatParcelizer;
    }

    public final /* synthetic */ Object get() {
        return new setLogger();
    }
}
