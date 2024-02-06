package p040o;

import com.scb.phone.view.activity.csent.PrivacyCSentWebViewActivity;
import p040o.nativeWriteImageToFileBuffer;
import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.h */
public final /* synthetic */ class C4715h implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ C4715h MediaBrowserCompat$ItemReceiver = new C4715h();

    private /* synthetic */ C4715h() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1162x44a04885) obj).write();
    }

    /* renamed from: o.h$b */
    public final class C4724b implements MileageQuantitySelectionActivity<PrivacyCSentWebViewActivity> {
        public static void IconCompatParcelizer(PrivacyCSentWebViewActivity privacyCSentWebViewActivity, parseInt parseint) {
            privacyCSentWebViewActivity.privacyPresenter = parseint;
        }
    }

    /* renamed from: o.h$a */
    public final /* synthetic */ class C4723a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ nativeWriteImageToFileBuffer.read MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ C4723a(nativeWriteImageToFileBuffer.read read, String str) {
            this.MediaBrowserCompat$ItemReceiver = read;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final void IconCompatParcelizer(Object obj) {
            nativeWriteImageToFileBuffer.read read = this.MediaBrowserCompat$ItemReceiver;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            ((newCheckExtractor.IconCompatParcelizer) obj).IconCompatParcelizer(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str, read.write.MediaBrowserCompat$ItemReceiver), "MOB".equals(str) ? Iterables$3$MediaBrowserCompat$ItemReceiver.icon_prompt_pay_mobile : Iterables$3$MediaBrowserCompat$ItemReceiver.icon_prompt_pay_cid);
        }
    }
}
