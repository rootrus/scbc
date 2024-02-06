package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.FragmentBuilder_BindEBillSubscriptionDetailFragment$MediaBrowserCompat$ItemReceiver */
public final class C6505x27b2fe35 implements inject_base64Decoder {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final OffsetDateTime read;
    private final String write;

    private C6505x27b2fe35() {
    }

    public C6505x27b2fe35(String str, String str2, String str3, OffsetDateTime offsetDateTime) {
        onGetStartedClick.write((Object) offsetDateTime, "stampDateTime");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.read = offsetDateTime;
    }

    public boolean IconCompatParcelizer() {
        QuickAccountSelectAdapter$SelectedHolder_ViewBinding between = QuickAccountSelectAdapter$SelectedHolder_ViewBinding.between(this.read, OffsetDateTime.now());
        onGetStartedClick.IconCompatParcelizer((Object) between, "Duration.between(stampDa…me, OffsetDateTime.now())");
        return between.getSeconds() <= 86400;
    }

    public String write() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        return str == null ? "" : str;
    }

    public String MediaBrowserCompat$ItemReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append("name=");
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(",type=");
        String str3 = this.write;
        if (str3 == null) {
            str3 = str2;
        }
        sb.append(str3);
        sb.append(",source=");
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            str2 = str4;
        }
        sb.append(str2);
        return sb.toString();
    }
}
