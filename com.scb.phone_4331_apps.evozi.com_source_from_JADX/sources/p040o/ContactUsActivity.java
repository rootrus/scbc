package p040o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.registration.preregistration.C5710xa436167;

/* renamed from: o.ContactUsActivity */
public final class ContactUsActivity {
    public final Context IconCompatParcelizer;
    final String MediaBrowserCompat$ItemReceiver;
    public final View read;
    public final AttributeSet write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactUsActivity)) {
            return false;
        }
        ContactUsActivity contactUsActivity = (ContactUsActivity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) contactUsActivity.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) contactUsActivity.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) contactUsActivity.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) contactUsActivity.write);
    }

    public final int hashCode() {
        View view = this.read;
        int i = 0;
        int hashCode = view != null ? view.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        Context context = this.IconCompatParcelizer;
        int hashCode3 = context != null ? context.hashCode() : 0;
        AttributeSet attributeSet = this.write;
        if (attributeSet != null) {
            i = attributeSet.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InflateResult(view=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", context=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", attrs=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public ContactUsActivity(View view, String str, Context context, AttributeSet attributeSet) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) context, "context");
        this.read = view;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = context;
        this.write = attributeSet;
    }

    /* renamed from: o.ContactUsActivity$CustomActionBar_ViewBinding */
    public interface CustomActionBar_ViewBinding {
        static {
            write write2 = write.MediaBrowserCompat$ItemReceiver;
        }

        ContactUsActivity intercept(C1165x6a840f83 contactUsActivity$CustomActionBar_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);

        /* renamed from: o.ContactUsActivity$CustomActionBar_ViewBinding$write */
        public static final class write {
            static final /* synthetic */ write MediaBrowserCompat$ItemReceiver = new write();

            private write() {
            }
        }
    }

    /* renamed from: o.ContactUsActivity$CustomActionBar */
    public final class CustomActionBar {

        /* renamed from: o.ContactUsActivity$CustomActionBar$write */
        public static final class write {
            public static final int viewpump_layout_res = 2131302261;
            public static final int viewpump_tag_id = 2131302262;

            public static C5710xa436167 write(SingleDataEntity<isNetworkException> singleDataEntity) {
                try {
                    isNetworkException data = singleDataEntity.getData();
                    return new C5710xa436167(data.MediaBrowserCompat$CustomActionResultReceiver, data.MediaBrowserCompat$ItemReceiver, data.write, data.IconCompatParcelizer);
                } catch (NullPointerException unused) {
                    return null;
                }
            }
        }
    }
}
