package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import java.util.ArrayList;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class DeviceProfileResponse implements KofaxWebServiceResponseBase {
    private String errorMessage;
    private List<WscDestination> profileShortCuts = new ArrayList();

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public List<WscDestination> getProfileShortCuts() {
        return this.profileShortCuts;
    }

    public void setProfileShortCuts(List<WscDestination> list) {
        this.profileShortCuts = list;
    }

    public void addPersonalShortCut(WscDestination wscDestination) {
        this.profileShortCuts.add(wscDestination);
    }

    public static DeviceProfileResponse populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        DeviceProfileResponse deviceProfileResponse = new DeviceProfileResponse();
        deviceProfileResponse.setErrorMessage(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "errorMessage", (String) null));
        for (int i = 0; i < accountHeaderViewHolder_ViewBinding.getPropertyCount(); i++) {
            AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
            accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i, accountRemarkViewHolder);
            if (accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver() != null && accountRemarkViewHolder.f5805x50fd9e4a.equals("shortcuts")) {
                deviceProfileResponse.addPersonalShortCut(WscDestination.populateFromResponse((AccountHeaderViewHolder_ViewBinding) accountRemarkViewHolder.MediaBrowserCompat$ItemReceiver()));
            }
        }
        return deviceProfileResponse;
    }
}
