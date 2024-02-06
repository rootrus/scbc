package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import p040o.AccountHeaderViewHolder_ViewBinding;

public class UserLogoutResponse implements KofaxWebServiceResponseBase {
    private String errorMessage;
    private int resultCode;

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

    public static KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        UserLogoutResponse userLogoutResponse = new UserLogoutResponse();
        userLogoutResponse.setErrorMessage(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "errorMessage", (String) null));
        userLogoutResponse.setResultCode(Integer.parseInt(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "resultCode", "-1")));
        return userLogoutResponse;
    }
}
