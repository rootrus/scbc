package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.klo.logistics.service.KofaxWebServiceConnectorService;
import p040o.AccountHeaderViewHolder_ViewBinding;

public class StartJobResponse implements KofaxWebServiceResponseBase {
    private String errorMessage;
    private String jobId;
    private int resultCode;
    private boolean retryOk;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String str) {
        this.jobId = str;
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

    public static StartJobResponse populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        StartJobResponse startJobResponse = new StartJobResponse();
        startJobResponse.setErrorMessage(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "errorMessage", (String) null));
        startJobResponse.setJobId(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "jobId", (String) null));
        startJobResponse.setResultCode(Integer.parseInt(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "resultCode", "-1")));
        startJobResponse.setRetryOk("true".equals(KofaxWebServiceConnectorService.getVerySafeSoapProperty(accountHeaderViewHolder_ViewBinding, "retryOk", "false")));
        return startJobResponse;
    }
}
