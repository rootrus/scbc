package p040o;

import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.getInfoContents */
public final class getInfoContents {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final setOnPoiClickListener write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInfoContents)) {
            return false;
        }
        getInfoContents getinfocontents = (getInfoContents) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getinfocontents.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getinfocontents.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getinfocontents.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getinfocontents.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getinfocontents.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        setOnPoiClickListener setonpoiclicklistener = this.write;
        int hashCode4 = setonpoiclicklistener != null ? setonpoiclicklistener.hashCode() : 0;
        BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        if (billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver != null) {
            i = billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidCardType(newFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", prepaidCardType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardImageUrl=");
        sb.append(this.read);
        sb.append(", newFee=");
        sb.append(this.write);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getInfoContents(String str, String str2, String str3, setOnPoiClickListener setonpoiclicklistener, BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) str, "newFlag");
        onGetStartedClick.write((Object) str2, "prepaidCardType");
        onGetStartedClick.write((Object) str3, "cardImageUrl");
        onGetStartedClick.write((Object) setonpoiclicklistener, "newFee");
        onGetStartedClick.write((Object) billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver, "productType");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
        this.write = setonpoiclicklistener;
        this.MediaBrowserCompat$ItemReceiver = billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
    }
}
