package p040o;

import android.text.TextUtils;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import java.util.ArrayList;

/* renamed from: o.ExportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver */
public class C6475xbc4f3007 {
    public ArrayList<ExportCardStatementActivity$MediaBrowserCompat$ItemReceiver<AttributeData>> write = new ArrayList<>();

    /* renamed from: o.ExportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver$write */
    public static class write {
        public boolean IconCompatParcelizer;
        public boolean MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public String[] MediaBrowserCompat$SearchResultReceiver;
        public boolean MediaMetadataCompat;
        public boolean read = false;
        public String[] write;
    }

    /* renamed from: o.ExportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver$MediaDescriptionCompat */
    public static class MediaDescriptionCompat implements ExportCardStatementActivity$MediaBrowserCompat$ItemReceiver<AttributeData> {
        private MediaDescriptionCompat() {
        }

        public /* synthetic */ MediaDescriptionCompat(byte b) {
            this();
        }

        public final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            return !TextUtils.isEmpty(((AttributeData) obj).getKeyApiName());
        }
    }

    /* renamed from: o.ExportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    public static class IconCompatParcelizer implements ExportCardStatementActivity$MediaBrowserCompat$ItemReceiver<AttributeData> {
        private boolean read;

        public final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            return ((AttributeData) obj).isEnabled() == this.read;
        }

        public IconCompatParcelizer(boolean z) {
            this.read = z;
        }
    }

    /* renamed from: o.ExportCardStatementActivity$MediaBrowserCompat$CustomActionResultReceiver$read */
    public static class read implements ExportCardStatementActivity$MediaBrowserCompat$ItemReceiver<AttributeData> {
        private boolean IconCompatParcelizer;

        public final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            return ((AttributeData) obj).isDynamic() == this.IconCompatParcelizer;
        }

        public read(boolean z) {
            this.IconCompatParcelizer = z;
        }
    }
}
