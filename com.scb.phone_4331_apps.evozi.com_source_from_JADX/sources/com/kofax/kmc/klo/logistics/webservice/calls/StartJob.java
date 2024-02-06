package com.kofax.kmc.klo.logistics.webservice.calls;

import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.StartJobResponse;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.klo.logistics.webservice.WscRequest;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.net.ssl.SSLException;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class StartJob extends KofaxWebServiceCallBase {
    public static String METHOD_NAME = "startJob";
    public static String NAMESPACE = "http://job.wsc.des.kofax.com";
    public static List<String> PARAM_FIELD_NAMES = new ArrayList();
    public static String SERVICE_NAME = "StartJobService";
    public static String SOAP_ACTION = "urn:startJob";
    private static final String TAG = StartJob.class.getSimpleName();
    private WscRequest request = null;

    public WscRequest getRequest() {
        return this.request;
    }

    public void setRequest(WscRequest wscRequest) {
        this.request = wscRequest;
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

    public WebServiceCallResult init(URL url, String str, String str2, CertificateValidatorListener certificateValidatorListener) {
        WebServiceCallResult init = super.init(url, certificateValidatorListener);
        if (!init.isSuccess()) {
            return init;
        }
        WscRequest initializeRequest = WscRequest.initializeRequest();
        initializeRequest.setJobId(UUID.randomUUID().toString().toUpperCase());
        initializeRequest.setUserName(str);
        initializeRequest.setPassword(str2);
        setRequest(initializeRequest);
        return init;
    }

    public KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        return StartJobResponse.populateFromResponse(accountHeaderViewHolder_ViewBinding);
    }

    public AccountHeaderViewHolder_ViewBinding packageRequest() {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(getNamespace(), getMethodName());
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding2 = new AccountHeaderViewHolder_ViewBinding(NAMESPACE, "wsRequest");
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "jobId", this.request.getJobId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "password", this.request.getPassword(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "userName", this.request.getUserName(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://wsc.des.kofax.com/xsd", "wscClientId", this.request.getWscClientId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(accountHeaderViewHolder_ViewBinding2);
        return accountHeaderViewHolder_ViewBinding;
    }

    public static WebServiceCallResult startJob(URL url, String str, String str2, CertificateValidatorListener certificateValidatorListener, int i) {
        new WebServiceCallResult().setSuccess(false);
        StartJob startJob = new StartJob();
        startJob.setTimeout(i);
        WebServiceCallResult init = startJob.init(url, str, str2, certificateValidatorListener);
        if (init.isSuccess()) {
            init.setSuccess(false);
            try {
                StartJobResponse startJobResponse = (StartJobResponse) startJob.execute();
                if (startJobResponse.getResultCode() != 0) {
                    init.setErrorMsg(startJobResponse.getErrorMessage());
                    init.setSuccess(false);
                } else {
                    init.setExtraData(startJobResponse);
                    init.setSuccess(true);
                }
            } catch (SocketTimeoutException e) {
                C0767k.m1821e(TAG, "start job service SocketTimeoutException", (Throwable) e);
                init.setErrorMsg(e.getMessage());
                init.setErrorInfo(ErrorInfo.KMC_LO_REQUEST_TIMEOUT);
            } catch (SSLException e2) {
                C0767k.m1821e(TAG, "Error in start job", (Throwable) e2);
                init.setErrorMsg(e2.getMessage());
                init.setCertificateError(true);
            } catch (Exception e3) {
                C0767k.m1821e(TAG, "Unable to start job : ", (Throwable) e3);
                init.setErrorMsg("Unknown error");
            }
        }
        return init;
    }
}
