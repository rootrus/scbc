package com.scb.phone.data.entity.billpayment;

import com.google.gson.annotations.SerializedName;
import p040o.HmlNTBBusinessOccupationInfoActivity;
import p040o.HmlNTBDocumentListActivity;
import p040o.HmlNTBReviewActivity;

@Deprecated
public class RealmString extends HmlNTBBusinessOccupationInfoActivity implements HmlNTBDocumentListActivity {
    @SerializedName("creditCardCategory")
    private String read;

    public void IconCompatParcelizer(String str) {
        this.read = str;
    }

    public String MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public RealmString() {
        if (this instanceof HmlNTBReviewActivity) {
            ((HmlNTBReviewActivity) this).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public String getCreditCardCategory() {
        return MediaBrowserCompat$ItemReceiver();
    }
}
