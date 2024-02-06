package p040o;

import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
import java.util.List;

/* renamed from: o.getInfoWindow */
public final class getInfoWindow {
    public final List<getInfoContents> IconCompatParcelizer;
    public final List<read> MediaBrowserCompat$CustomActionResultReceiver;
    public final setOnMyLocationClickListener MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getInfoWindow)) {
            return false;
        }
        getInfoWindow getinfowindow = (getInfoWindow) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getinfowindow.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getinfowindow.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getinfowindow.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getinfowindow.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        List<read> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<getInfoContents> list2 = this.IconCompatParcelizer;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        String str = this.write;
        int hashCode3 = str != null ? str.hashCode() : 0;
        setOnMyLocationClickListener setonmylocationclicklistener = this.MediaBrowserCompat$ItemReceiver;
        if (setonmylocationclicklistener != null) {
            i = setonmylocationclicklistener.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidRequestLanding(existingPrepaidCardList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", prepaidCardTypeList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", remark=");
        sb.append(this.write);
        sb.append(", mailingAddress=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getInfoWindow(List<read> list, List<getInfoContents> list2, String str, setOnMyLocationClickListener setonmylocationclicklistener) {
        onGetStartedClick.write((Object) list, "existingPrepaidCardList");
        onGetStartedClick.write((Object) list2, "prepaidCardTypeList");
        onGetStartedClick.write((Object) str, "remark");
        onGetStartedClick.write((Object) setonmylocationclicklistener, "mailingAddress");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.IconCompatParcelizer = list2;
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = setonmylocationclicklistener;
    }

    /* renamed from: o.getInfoWindow$read */
    public static final class read {
        public final String IconCompatParcelizer;
        public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver;
        public final String read;
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) read2.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read2.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) read2.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) read2.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read2.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) read2.MediaBrowserCompat$SearchResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.write;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode5 = list != null ? list.hashCode() : 0;
            BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$SearchResultReceiver;
            if (billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver != null) {
                i = billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PrepaidCard(cardRefNo=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", cardMask=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", cardStatus=");
            sb.append(this.read);
            sb.append(", prepaidCardType=");
            sb.append(this.write);
            sb.append(", allowTag=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", productType=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public read(String str, String str2, String str3, String str4, List<String> list, BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver) {
            onGetStartedClick.write((Object) str, "cardRefNo");
            onGetStartedClick.write((Object) str2, "cardMask");
            onGetStartedClick.write((Object) str3, "cardStatus");
            onGetStartedClick.write((Object) str4, "prepaidCardType");
            onGetStartedClick.write((Object) list, "allowTag");
            onGetStartedClick.write((Object) billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver, "productType");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.read = str3;
            this.write = str4;
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
            this.MediaBrowserCompat$SearchResultReceiver = billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
        }
    }
}
