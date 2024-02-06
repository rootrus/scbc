package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.nextEntry */
public final class nextEntry {
    @SerializedName("monthlyIncome")
    public final String IconCompatParcelizer;
    @SerializedName("minimumRepaymentAbility")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("repaymentAbilityFlag")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("repaymentAbility")
    public final String read;
    @SerializedName("minimumMonthlyIncome")
    public final String write;

    public nextEntry() {
        this((byte) 0);
    }

    public nextEntry(String str, String str2, String str3, String str4, String str5) {
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
    }

    private /* synthetic */ nextEntry(byte b) {
        this((String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
