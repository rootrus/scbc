package p040o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p040o.C4997nB;

/* renamed from: o.ThirdPartyWebActivity */
public final class ThirdPartyWebActivity {
    public final String IconCompatParcelizer;
    public final Context MediaBrowserCompat$CustomActionResultReceiver;
    public final View MediaBrowserCompat$ItemReceiver;
    public final onCallUsClick read;
    public final AttributeSet write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyWebActivity)) {
            return false;
        }
        ThirdPartyWebActivity thirdPartyWebActivity = (ThirdPartyWebActivity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) thirdPartyWebActivity.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) thirdPartyWebActivity.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) thirdPartyWebActivity.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) thirdPartyWebActivity.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) thirdPartyWebActivity.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Context context = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = context != null ? context.hashCode() : 0;
        AttributeSet attributeSet = this.write;
        int hashCode3 = attributeSet != null ? attributeSet.hashCode() : 0;
        View view = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = view != null ? view.hashCode() : 0;
        onCallUsClick oncallusclick = this.read;
        if (oncallusclick != null) {
            i = oncallusclick.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InflateRequest(name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", context=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", attrs=");
        sb.append(this.write);
        sb.append(", parent=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fallbackViewCreator=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public ThirdPartyWebActivity(String str, Context context, AttributeSet attributeSet, View view, onCallUsClick oncallusclick) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) oncallusclick, "fallbackViewCreator");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.write = attributeSet;
        this.MediaBrowserCompat$ItemReceiver = view;
        this.read = oncallusclick;
    }

    public /* synthetic */ ThirdPartyWebActivity(String str, Context context, AttributeSet attributeSet, onCallUsClick oncallusclick) {
        this(str, context, attributeSet, (View) null, oncallusclick);
    }

    /* renamed from: o.ThirdPartyWebActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements addToMap {
        private final addObject IconCompatParcelizer;
        private final C4997nB.read write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(addObject addobject, C4997nB.read read) {
            this.IconCompatParcelizer = addobject;
            this.write = read;
        }

        public final DebitCardResetOtpActivity<extractLocationAvailability> write() {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver.getKnowledgeAssessment().map(zzjx.MediaBrowserCompat$ItemReceiver).map(new zzka(this.IconCompatParcelizer));
        }

        public final DebitCardResetOtpActivity<zzuk> write(ForwardingMultiset forwardingMultiset) {
            return this.write.MediaBrowserCompat$CustomActionResultReceiver.sendKnowledgeAssessment(forwardingMultiset).map(new zzkb(this.IconCompatParcelizer));
        }
    }
}
