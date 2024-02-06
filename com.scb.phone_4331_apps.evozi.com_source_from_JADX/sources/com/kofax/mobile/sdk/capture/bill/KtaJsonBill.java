package com.kofax.mobile.sdk.capture.bill;

import android.content.Context;
import com.kofax.mobile.sdk._internal.C7922i;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.extraction.IJsonExactionHelper;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.kofax.mobile.sdk.capture.model.Bill;
import com.kofax.mobile.sdk.capture.model.Field;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class KtaJsonBill extends Bill implements C7922i {
    private final String CITY = "City";
    private final String NAME = KtaJsonExactionHelper.NAME;
    private final String STATE = "State";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_kta_")
    @HmlPinActivity

    /* renamed from: ZW */
    IJsonExactionHelper f4632ZW;

    /* renamed from: ZX */
    private String f4633ZX;

    /* renamed from: ZY */
    private final String f4634ZY = "AddressLine1";

    /* renamed from: ZZ */
    private final String f4635ZZ = "AddressLine2";
    private final String aaa = "Zip";
    private final String aab = "AccountNumber";
    private final String aac = "AmountDue";
    private final String aad = "DueDate";
    private final String aae = "PhoneNumber";
    private final String aaf = "Source";
    private final String aag = "Billers";

    public KtaJsonBill(Context context, String str) {
        if (str != null) {
            Injector.getInjector(context).injectMembers(this);
            this.f4632ZW.init(str);
            setJson(str);
            return;
        }
        throw new IllegalArgumentException("json cannot be null");
    }

    public void setJson(String str) {
        this.f4633ZX = str;
    }

    public Field getAmount() {
        return this.f4632ZW.getString("AmountDue");
    }

    public Field getDueDate() {
        return this.f4632ZW.getString("DueDate");
    }

    public Field getName() {
        return this.f4632ZW.getString(KtaJsonExactionHelper.NAME);
    }

    public Field getAddressLine1() {
        return this.f4632ZW.getString("AddressLine1");
    }

    public Field getAddressLine2() {
        return this.f4632ZW.getString("AddressLine2");
    }

    public Field getCity() {
        return this.f4632ZW.getString("City");
    }

    public Field getState() {
        return this.f4632ZW.getString("State");
    }

    public Field getZip() {
        return this.f4632ZW.getString("Zip");
    }

    public Field getAccountNumber() {
        return this.f4632ZW.getString("AccountNumber");
    }

    public Field getPhoneNumber() {
        return this.f4632ZW.getString("PhoneNumber");
    }

    public Field getSource() {
        return this.f4632ZW.getString("Source");
    }

    public Field getBillers() {
        return this.f4632ZW.getString("Billers");
    }

    public String getRawData() {
        return this.f4633ZX;
    }
}
