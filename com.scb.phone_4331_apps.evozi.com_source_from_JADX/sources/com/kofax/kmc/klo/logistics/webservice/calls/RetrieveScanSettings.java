package com.kofax.kmc.klo.logistics.webservice.calls;

import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.RetrieveScanSettingsResponse;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.klo.logistics.webservice.WscDestination;
import com.kofax.kmc.klo.logistics.webservice.WscRetrieveScanSettingsRequest;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.SSLException;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class RetrieveScanSettings extends KofaxWebServiceCallBase {
    public static String METHOD_NAME = "getScanSettings";
    public static String NAMESPACE = "http://scansettings.wsc.des.kofax.com";
    public static String SERVICE_NAME = "RetrieveScanSettingsService";
    public static String SOAP_ACTION = "urn:getScanSettings";
    private static final String TAG = RetrieveScanSettings.class.getSimpleName();
    private WscRetrieveScanSettingsRequest request = null;

    public WscRetrieveScanSettingsRequest getRequest() {
        return this.request;
    }

    public void setRequest(WscRetrieveScanSettingsRequest wscRetrieveScanSettingsRequest) {
        this.request = wscRetrieveScanSettingsRequest;
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
        setRequest(WscRetrieveScanSettingsRequest.initializeRequest(wscDestination, this.kfsUsername, this.kfsPassword));
        return init;
    }

    public AccountHeaderViewHolder_ViewBinding packageRequest() {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(getNamespace(), getMethodName());
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding2 = new AccountHeaderViewHolder_ViewBinding(NAMESPACE, "wscRequest");
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "password", this.request.getPassword(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "userName", this.request.getUserName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "wscClientId", this.request.getWscClientId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://scansettings.wsc.des.kofax.com/xsd", "shortcutName", this.request.getShortcutName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://scansettings.wsc.des.kofax.com/xsd", "shortcutTypeOrdinal", this.request.getShortcutTypeOrdinal(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(accountHeaderViewHolder_ViewBinding2);
        return accountHeaderViewHolder_ViewBinding;
    }

    public KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        return RetrieveScanSettingsResponse.populateFromResponse(accountHeaderViewHolder_ViewBinding);
    }

    public static WebServiceCallResult getScanSettings(URL url, WscDestination wscDestination, String str, String str2, CertificateValidatorListener certificateValidatorListener, int i) {
        C0767k.m1807c(TAG, "getScanSettings");
        RetrieveScanSettings retrieveScanSettings = new RetrieveScanSettings();
        retrieveScanSettings.setkfsPassword(str2);
        retrieveScanSettings.setkfsUsername(str);
        retrieveScanSettings.setTimeout(i);
        WebServiceCallResult init = retrieveScanSettings.init(url, wscDestination, certificateValidatorListener);
        init.setSuccess(false);
        try {
            RetrieveScanSettingsResponse retrieveScanSettingsResponse = (RetrieveScanSettingsResponse) retrieveScanSettings.execute();
            String errorMessage = retrieveScanSettingsResponse.getErrorMessage();
            if (!(errorMessage == null || errorMessage.length() == 0)) {
                init.setErrorMsg(retrieveScanSettingsResponse.getErrorMessage());
                init.setSuccess(false);
            } else {
                init.setExtraData(retrieveScanSettingsResponse);
                init.setSuccess(true);
            }
        } catch (SSLException e) {
            C0767k.m1821e(TAG, "Error in scan settings", (Throwable) e);
            init.setErrorMsg(e.getMessage());
            init.setCertificateError(true);
        } catch (SocketTimeoutException e2) {
            C0767k.m1821e(TAG, "retrieve scan settings service SocketTimeoutException", (Throwable) e2);
            init.setErrorMsg(e2.getMessage());
            init.setErrorInfo(ErrorInfo.KMC_LO_REQUEST_TIMEOUT);
        } catch (Exception unused) {
            init.setErrorMsg("Unknown error");
        }
        return init;
    }
}
