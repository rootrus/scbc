package com.kofax.kmc.klo.logistics.webservice;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;

public class WebServiceCallResult {
    private ErrorInfo errorInfo = null;
    private String errorMsg = "";
    private Object extraData = null;
    private boolean isCertificateError = false;
    private boolean success = false;
    private boolean useErrorMsgAsOnlyMessage = false;

    public boolean isCertificateError() {
        return this.isCertificateError;
    }

    public void setCertificateError(boolean z) {
        this.isCertificateError = z;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public void setErrorMsg(String str) {
        this.errorMsg = str;
    }

    public Object getExtraData() {
        return this.extraData;
    }

    public void setExtraData(Object obj) {
        this.extraData = obj;
    }

    public boolean isUseErrorMsgAsOnlyMessage() {
        return this.useErrorMsgAsOnlyMessage;
    }

    public void setUseErrorMsgAsOnlyMessage(boolean z) {
        this.useErrorMsgAsOnlyMessage = z;
    }

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo2) {
        this.errorInfo = errorInfo2;
    }
}
