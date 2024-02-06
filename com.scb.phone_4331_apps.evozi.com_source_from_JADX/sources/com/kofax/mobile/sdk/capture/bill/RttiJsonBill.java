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

public class RttiJsonBill extends Bill implements C7922i {
    private final String CITY = "City";
    private final String NAME = KtaJsonExactionHelper.NAME;
    private final String STATE = "State";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_bill_extract_rtti_")
    @HmlPinActivity

    /* renamed from: ZW */
    IJsonExactionHelper f4637ZW;

    /* renamed from: ZX */
    private String f4638ZX;

    /* renamed from: ZY */
    private final String f4639ZY = "AddressLine1";

    /* renamed from: ZZ */
    private final String f4640ZZ = "AddressLine2";
    private final String aaa = "Zip";
    private final String aab = "AccountNumber";
    private final String aac = "AmountDue";
    private final String aad = "DueDate";
    private final String aae = "PhoneNumber";
    private final String aaf = "Source";
    private final String aag = "Billers";

    public RttiJsonBill(Context context, String str) {
        if (str != null) {
            Injector.getInjector(context).injectMembers(this);
            this.f4637ZW.init(str);
            setJson(str);
            return;
        }
        throw new IllegalArgumentException("json cannot be null");
    }

    public void setJson(String str) {
        this.f4638ZX = str;
    }

    public Field getAmount() {
        return this.f4637ZW.getString("AmountDue");
    }

    public Field getDueDate() {
        return this.f4637ZW.getString("DueDate");
    }

    public Field getName() {
        return this.f4637ZW.getString(KtaJsonExactionHelper.NAME);
    }

    public Field getAddressLine1() {
        return this.f4637ZW.getString("AddressLine1");
    }

    public Field getAddressLine2() {
        return this.f4637ZW.getString("AddressLine2");
    }

    public Field getCity() {
        return this.f4637ZW.getString("City");
    }

    public Field getState() {
        return this.f4637ZW.getString("State");
    }

    public Field getZip() {
        return this.f4637ZW.getString("Zip");
    }

    public Field getAccountNumber() {
        return this.f4637ZW.getString("AccountNumber");
    }

    public Field getPhoneNumber() {
        return this.f4637ZW.getString("PhoneNumber");
    }

    public Field getSource() {
        return this.f4637ZW.getString("Source");
    }

    public Field getBillers() {
        return this.f4637ZW.getString("Billers");
    }

    public String getRawData() {
        return this.f4638ZX;
    }
}
