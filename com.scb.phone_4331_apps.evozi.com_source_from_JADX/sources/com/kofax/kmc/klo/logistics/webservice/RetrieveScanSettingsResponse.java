package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import com.kofax.mobile.sdk._internal.C0767k;
import java.util.ArrayList;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class RetrieveScanSettingsResponse implements KofaxWebServiceResponseBase {
    private String errorMessage;
    private int resultCode;
    private List<WscScanSetting> scanSettings = new ArrayList();

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public List<WscScanSetting> getScanSettings() {
        return this.scanSettings;
    }

    public void setScanSettings(List<WscScanSetting> list) {
        this.scanSettings = list;
    }

    public static KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        WscScanSetting populateFromResponse;
        RetrieveScanSettingsResponse retrieveScanSettingsResponse = new RetrieveScanSettingsResponse();
        String name = retrieveScanSettingsResponse.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append("***************Called populateFromResponse with ");
        sb.append(accountHeaderViewHolder_ViewBinding.toString());
        C0767k.m1801b(name, sb.toString());
        retrieveScanSettingsResponse.setErrorMessage(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "errorMessage", (String) null));
        retrieveScanSettingsResponse.setResultCode(Integer.parseInt(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "resultCode", "-1")));
        for (int i = 0; i < accountHeaderViewHolder_ViewBinding.getPropertyCount(); i++) {
            AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
            accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, accountRemarkViewHolder);
            if (!(accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver() == null || !accountRemarkViewHolder.f5805x50fd9e4a.equals("settings") || (populateFromResponse = WscScanSetting.populateFromResponse((AccountHeaderViewHolder_ViewBinding) accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver())) == null)) {
                retrieveScanSettingsResponse.scanSettings.add(populateFromResponse);
            }
        }
        return retrieveScanSettingsResponse;
    }
}
