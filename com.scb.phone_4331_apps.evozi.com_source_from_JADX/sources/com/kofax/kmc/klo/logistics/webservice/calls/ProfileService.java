package com.kofax.kmc.klo.logistics.webservice.calls;

import com.kofax.kmc.klo.logistics.service.NetworkService;
import com.kofax.kmc.klo.logistics.webservice.DeviceProfileResponse;
import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.klo.logistics.webservice.WscProfileRequest;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.SSLException;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class ProfileService extends KofaxWebServiceCallBase {
    public static String METHOD_NAME = "getProfile";
    public static String NAMESPACE = "http://profile.wsc.des.kofax.com";
    public static String SERVICE_NAME = "ProfileService";
    public static String SOAP_ACTION = "urn:getProfile";
    private static String TAG = "ProfileService";
    private WscProfileRequest profleRequest = null;

    public WscProfileRequest getProfileRequest() {
        return this.profleRequest;
    }

    private void setProfileRequest(WscProfileRequest wscProfileRequest) {
        this.profleRequest = wscProfileRequest;
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

    public WebServiceCallResult init(URL url, CertificateValidatorListener certificateValidatorListener) {
        WebServiceCallResult init = super.init(url, certificateValidatorListener);
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("result = ");
        sb.append(init);
        C0767k.m1807c(str, sb.toString());
        if (!init.isSuccess()) {
            return init;
        }
        setProfileRequest(WscProfileRequest.initializeRequest(NetworkService.getMacAddress()));
        String errorMsg = init.getErrorMsg();
        init.setSuccess(errorMsg == null || errorMsg.length() == 0);
        String str2 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("result = ");
        sb2.append(init);
        C0767k.m1807c(str2, sb2.toString());
        return init;
    }

    public KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        return DeviceProfileResponse.populateFromResponse(accountHeaderViewHolder_ViewBinding);
    }

    public AccountHeaderViewHolder_ViewBinding packageRequest() {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(getNamespace(), getMethodName());
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding2 = new AccountHeaderViewHolder_ViewBinding(NAMESPACE, "wsRequest");
        accountHeaderViewHolder_ViewBinding2.IconCompatParcelizer.addElement(createPropertyInfo("http://profile.wsc.des.kofax.com/xsd", "wscClientId", this.profleRequest.getWscClientId(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(accountHeaderViewHolder_ViewBinding2);
        return accountHeaderViewHolder_ViewBinding;
    }

    public static WebServiceCallResult getProfile(URL url, int i, CertificateValidatorListener certificateValidatorListener) {
        ProfileService profileService = new ProfileService();
        profileService.setTimeout(i);
        WebServiceCallResult init = profileService.init(url, certificateValidatorListener);
        if (init.isSuccess()) {
            init.setSuccess(false);
            try {
                DeviceProfileResponse deviceProfileResponse = (DeviceProfileResponse) profileService.execute();
                String errorMessage = deviceProfileResponse.getErrorMessage();
                if (!(errorMessage == null || errorMessage.length() == 0)) {
                    init.setErrorMsg(deviceProfileResponse.getErrorMessage());
                    init.setSuccess(false);
                } else {
                    init.setExtraData(deviceProfileResponse);
                    init.setSuccess(true);
                }
            } catch (SSLException e) {
                C0767k.m1821e(TAG, "Error in get profile", (Throwable) e);
                init.setErrorMsg(e.getMessage());
                init.setCertificateError(true);
            } catch (SocketTimeoutException e2) {
                C0767k.m1821e(TAG, "Profile Service SocketTimeoutException", (Throwable) e2);
                init.setErrorMsg(e2.getMessage());
                init.setErrorInfo(ErrorInfo.KMC_LO_REQUEST_TIMEOUT);
            } catch (Exception e3) {
                C0767k.m1821e(profileService.getClass().getName(), "Unable to get profile documents", (Throwable) e3);
                init.setErrorMsg("Unknown error");
            }
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("result from get profile = ");
        sb.append(init.getErrorMsg());
        sb.append(" ");
        sb.append(init.getExtraData());
        C0767k.m1807c(str, sb.toString());
        return init;
    }
}
