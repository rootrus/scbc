package p040o;

import p040o.MoreExecutors;
import p040o.writeUInt64NoTag;

/* renamed from: o.handleResponse */
public final class handleResponse extends writeUInt64NoTag<getPayeeEndorsement> {
    public MoreExecutors.SameThreadExecutorService IconCompatParcelizer;
    public final logEventNoInterceptor write;

    /* renamed from: o.handleResponse$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getPayeeEndorsement> {
        private /* synthetic */ handleResponse MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(handleResponse handleresponse) {
            this.MediaBrowserCompat$ItemReceiver = handleresponse;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getPayeeEndorsement) obj).write(handleResponse.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver), true);
        }
    }

    /* renamed from: o.handleResponse$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getPayeeEndorsement> {
        private /* synthetic */ String read;
        private /* synthetic */ boolean write;

        public write(boolean z, String str) {
            this.write = z;
            this.read = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getPayeeEndorsement getpayeeendorsement = (getPayeeEndorsement) obj;
            if (this.write) {
                getpayeeendorsement.write(this.read);
            } else {
                getpayeeendorsement.write();
            }
        }
    }

    /* renamed from: o.handleResponse$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getPayeeEndorsement> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getPayeeEndorsement) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public static final /* synthetic */ MoreExecutors.SameThreadExecutorService MediaBrowserCompat$ItemReceiver(handleResponse handleresponse) {
        MoreExecutors.SameThreadExecutorService sameThreadExecutorService = handleresponse.IconCompatParcelizer;
        if (sameThreadExecutorService == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        return sameThreadExecutorService;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public handleResponse(RegularImmutableBiMap regularImmutableBiMap, logEventNoInterceptor logeventnointerceptor) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) logeventnointerceptor, "successCase");
        this.write = logeventnointerceptor;
    }
}
