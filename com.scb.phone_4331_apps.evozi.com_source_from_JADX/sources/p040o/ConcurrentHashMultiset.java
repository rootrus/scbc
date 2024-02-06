package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ConcurrentHashMultiset */
public final class ConcurrentHashMultiset implements C4602xca7af99c {
    @SerializedName("transactionAmount")
    private final String IconCompatParcelizer;
    @SerializedName("loanId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("rate")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("term")
    private final String read;
    @SerializedName("cardRef")
    public final String write;

    /* renamed from: o.ConcurrentHashMultiset$EntrySet */
    public final class EntrySet {
        @SerializedName("cardRef")
        private final String IconCompatParcelizer;
        @SerializedName("deejungEligible")
        private final boolean MediaBrowserCompat$CustomActionResultReceiver = true;
        @SerializedName("cycleNumber")
        private final String write;

        public EntrySet(String str, String str2) {
            onGetStartedClick.write((Object) str, "cardRef");
            onGetStartedClick.write((Object) str2, "cycleNumber");
            this.IconCompatParcelizer = str;
            this.write = str2;
        }
    }

    public ConcurrentHashMultiset(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "loanId");
        onGetStartedClick.write((Object) str2, "transactionAmount");
        onGetStartedClick.write((Object) str3, "term");
        onGetStartedClick.write((Object) str4, "rate");
        onGetStartedClick.write((Object) str5, "cardRef");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.write = str5;
    }

    /* renamed from: o.ConcurrentHashMultiset$FieldSettersHolder */
    public class FieldSettersHolder {
        @SerializedName("preApproved")
        private boolean IconCompatParcelizer;
        @SerializedName("expiryDate")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("additionalAmount")
        private double read;
        @SerializedName("reason")
        private String write;

        public FieldSettersHolder(boolean z, double d, String str, String str2) {
            this.IconCompatParcelizer = z;
            this.read = d;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
        }
    }
}
