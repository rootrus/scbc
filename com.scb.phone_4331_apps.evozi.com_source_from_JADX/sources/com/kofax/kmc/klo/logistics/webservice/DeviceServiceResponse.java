package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import p040o.AccountHeaderViewHolder_ViewBinding;

public class DeviceServiceResponse implements KofaxWebServiceResponseBase {
    private String errorMessage;
    private int resultCode;
    private boolean retryOk;

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

    public boolean isRetryOk() {
        return this.retryOk;
    }

    public void setRetryOk(boolean z) {
        this.retryOk = z;
    }

    public static DeviceServiceResponse populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        DeviceServiceResponse deviceServiceResponse = new DeviceServiceResponse();
        deviceServiceResponse.setErrorMessage(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "errorMessage", (String) null));
        deviceServiceResponse.setResultCode(Integer.parseInt(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "resultCode", "-1")));
        deviceServiceResponse.setRetryOk("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "retryOk", "false")));
        return deviceServiceResponse;
    }
}
