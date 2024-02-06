package p040o;

import android.net.Uri;
import java.util.HashMap;
import java.util.List;
import p040o.CheckCaptureModule_GetProcessingParametersFactory;
import p040o.Utils;

/* renamed from: o.IdExtractor */
public interface IdExtractor extends CheckCaptureModule_GetProcessingParametersFactory.IconCompatParcelizer {

    /* renamed from: o.IdExtractor$1 */
    public interface C69101 {
        void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, IdCaptureModule_GetIIdDeserializerKtaFactory idCaptureModule_GetIIdDeserializerKtaFactory);
    }

    /* renamed from: o.IdExtractor$2 */
    public interface C69112 extends IdCaptureModule_KtaExceptionResponseDeserializer_Factory {
        void MediaBrowserCompat$ItemReceiver(long j);

        void MediaBrowserCompat$SearchResultReceiver();

        /* renamed from: a_ */
        void mo42665a_(Throwable th);
    }

    /* renamed from: o.IdExtractor$3 */
    public interface C69123 extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(HashMap<String, Object> hashMap);
    }

    void ActionMenuItemView();

    void AppCompatActivity();

    void AppCompatDelegateImpl$ListMenuDecorView();

    void AppCompatDialogFragment();

    void AppCompatViewInflater();

    void IconCompatParcelizer();

    void IconCompatParcelizer(String str);

    void MediaBrowserCompat$CustomActionResultReceiver();

    void MediaBrowserCompat$CustomActionResultReceiver(Uri uri, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver);

    void MediaBrowserCompat$CustomActionResultReceiver(Utils.C39323.C12941 r1);

    void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

    void MediaBrowserCompat$ItemReceiver();

    void MediaBrowserCompat$ItemReceiver(long j);

    void MediaBrowserCompat$ItemReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver);

    void MediaBrowserCompat$ItemReceiver(boolean z);

    void MediaBrowserCompat$MediaItem();

    void MediaBrowserCompat$SearchResultReceiver();

    void MediaDescriptionCompat();

    void MediaMetadataCompat();

    void MediaSessionCompat$QueueItem();

    void MediaSessionCompat$ResultReceiverWrapper();

    void RatingCompat();

    /* renamed from: X_ */
    void mo33806X_();

    /* renamed from: Y_ */
    void mo33807Y_();

    void read();

    void read(int i);

    void read(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list);

    void setCheckable();

    void setChecked();

    void setContentView();

    void setExpandedFormat();

    void setIcon();

    void setItemInvoker();

    void setPadding();

    void setPopupCallback();

    void setShortcut();

    void write();

    void write(Uri uri, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver);

    void write(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list);

    void write(boolean z);
}
