package com.kofax.kmc.klo.logistics.webservice.calls;

import com.kofax.kmc.klo.logistics.webservice.GetIndexFieldsResponse;
import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.klo.logistics.webservice.WscDestination;
import com.kofax.kmc.klo.logistics.webservice.WscIndexFieldsRequest;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.SSLException;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class GetIndexFields extends KofaxWebServiceCallBase {
    public static String METHOD_NAME = "getIndexFields";
    public static String NAMESPACE = "http://indexfields.wsc.des.kofax.com";
    public static String SERVICE_NAME = "GetIndexFieldsService";
    public static String SOAP_ACTION = "urn:getIndexFields";
    private static final String TAG = GetIndexFields.class.getSimpleName();
    private WscIndexFieldsRequest fieldRequest = null;

    public WscIndexFieldsRequest getFieldRequest() {
        return this.fieldRequest;
    }

    private void setFieldRequest(WscIndexFieldsRequest wscIndexFieldsRequest) {
        this.fieldRequest = wscIndexFieldsRequest;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public String getMethodName() {
        return METHOD_NAME;
    }

    public String getSoapAction() {
        return SOAP_ACTION;
    }

    public String getServiceName() {
        return SERVICE_NAME;
    }

    public WebServiceCallResult init(URL url, WscDestination wscDestination, CertificateValidatorListener certificateValidatorListener) {
        WebServiceCallResult init = super.init(url, certificateValidatorListener);
        if (!init.isSuccess()) {
            return init;
        }
        setFieldRequest(WscIndexFieldsRequest.initializeRequest(wscDestination, this.kfsUsername, this.kfsPassword));
        return init;
    }

    public KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        return GetIndexFieldsResponse.populateFromResponse(accountHeaderViewHolder_ViewBinding);
    }

    /* access modifiers changed from: protected */
    public AccountHeaderViewHolder_ViewBinding packageRequest() {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(getNamespace(), getMethodName());
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding2 = new AccountHeaderViewHolder_ViewBinding(NAMESPACE, "wsRequest");
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "password", this.fieldRequest.getPassword(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "userName", this.fieldRequest.getUserName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "wscClientId", this.fieldRequest.getWscClientId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://indexfields.wsc.des.kofax.com/xsd", "backendId", this.fieldRequest.getBackendId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://indexfields.wsc.des.kofax.com/xsd", "dataStoreName", this.fieldRequest.getDataStoreName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://indexfields.wsc.des.kofax.com/xsd", "formTypeId", this.fieldRequest.getFormTypeId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://indexfields.wsc.des.kofax.com/xsd", "shortcutName", this.fieldRequest.getShortcutName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://indexfields.wsc.des.kofax.com/xsd", "shortcutTypeOrdinal", Integer.valueOf(this.fieldRequest.getShortcutTypeOrdinal()), AccountRemarkViewHolder.read));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(accountHeaderViewHolder_ViewBinding2);
        return accountHeaderViewHolder_ViewBinding;
    }

    public static WebServiceCallResult getIndexFields(URL url, WscDestination wscDestination, String str, String str2, CertificateValidatorListener certificateValidatorListener, int i) {
        GetIndexFields getIndexFields = new GetIndexFields();
        getIndexFields.setkfsUsername(str);
        getIndexFields.setkfsPassword(str2);
        getIndexFields.setTimeout(i);
        WebServiceCallResult init = getIndexFields.init(url, wscDestination, certificateValidatorListener);
        if (init.isSuccess()) {
            init.setSuccess(false);
            try {
                GetIndexFieldsResponse getIndexFieldsResponse = (GetIndexFieldsResponse) getIndexFields.execute();
                String errorMessage = getIndexFieldsResponse.getErrorMessage();
                if (!(errorMessage == null || errorMessage.length() == 0)) {
                    init.setErrorMsg(getIndexFieldsResponse.getErrorMessage());
                    init.setSuccess(false);
                } else {
                    init.setExtraData(getIndexFieldsResponse);
                    init.setSuccess(true);
                }
            } catch (SSLException e) {
                C0767k.m1821e(TAG, "Error in get index fields", (Throwable) e);
                init.setErrorMsg(e.getMessage());
                init.setCertificateError(true);
            } catch (SocketTimeoutException e2) {
                C0767k.m1821e(TAG, "get index fields service SocketTimeoutException", (Throwable) e2);
                init.setErrorMsg(e2.getMessage());
                init.setErrorInfo(ErrorInfo.KMC_LO_REQUEST_TIMEOUT);
            } catch (Exception e3) {
                String name = getIndexFields.getClass().getName();
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to get index fields for shorcut ");
                sb.append(wscDestination.getDisplayValue());
                C0767k.m1821e(name, sb.toString(), (Throwable) e3);
                init.setErrorMsg("Unknown error");
            }
        }
        return init;
    }
}
