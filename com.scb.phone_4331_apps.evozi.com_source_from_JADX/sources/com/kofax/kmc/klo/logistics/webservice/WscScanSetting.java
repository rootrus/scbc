package com.kofax.kmc.klo.logistics.webservice;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import com.kofax.mobile.sdk._internal.C0767k;
import org.json.JSONObject;
import p040o.AccountHeaderViewHolder_ViewBinding;

public class WscScanSetting {
    public static final String TAG = WscScanSetting.class.getSimpleName();
    private String name;
    private String value;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public static WscScanSetting populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        WscScanSetting wscScanSetting = new WscScanSetting();
        String verySafeSoapProperty = KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "name", (String) null);
        String verySafeSoapProperty2 = KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) null);
        wscScanSetting.setName(verySafeSoapProperty);
        wscScanSetting.setValue(verySafeSoapProperty2);
        return wscScanSetting;
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", getName());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, getValue());
        } catch (Exception e) {
            C0767k.m1821e(TAG, "Unable to convery WscScanSetting to JSONObject", (Throwable) e);
        }
        return jSONObject;
    }
}
