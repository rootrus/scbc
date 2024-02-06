package com.kofax.kmc.klo.logistics.webservice.calls;

import com.kofax.kmc.klo.logistics.service.NetworkService;
import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.UserLogoutResponse;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.SSLException;
import p040o.AccountHeaderViewHolder_ViewBinding;

public class UserLogout extends KofaxWebServiceCallBase {
    public static String METHOD_NAME = "logout";
    public static String NAMESPACE = "http://logout.wsc.des.kofax.com";
    public static String SERVICE_NAME = "UserLogoutService";
    public static String SOAP_ACTION = "urn:logout";
    private static String TAG = "UserLogout";
    private String requestDomain = new String();
    private String requestPassword = new String();
    private String requestUserName = new String();

    public void setRequestDomain(String str) {
        this.requestDomain = str;
    }

    public String getRequestUserName() {
        return this.requestUserName;
    }

    public void setRequestUserName(String str) {
        this.requestUserName = str;
    }

    public String getRequestPassword() {
        return this.requestPassword;
    }

    public void setRequestPassword(String str) {
        this.requestPassword = str;
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
        String str2 = this.requestUserName;
        boolean z = false;
        if (str2 == null || str2.length() == 0) {
            init.setErrorMsg("No user defined");
        } else {
            setRequestUserName(this.requestUserName);
            setRequestPassword(this.requestPassword);
        }
        String errorMsg = init.getErrorMsg();
        if (errorMsg == null || errorMsg.length() == 0) {
            z = true;
        }
        init.setSuccess(z);
        String str3 = TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("result = ");
        sb2.append(init);
        C0767k.m1807c(str3, sb2.toString());
        return init;
    }

    public KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        return UserLogoutResponse.populateFromResponse(accountHeaderViewHolder_ViewBinding);
    }

    public AccountHeaderViewHolder_ViewBinding packageRequest() {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(getNamespace(), getMethodName());
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("userName", (Object) getRequestUserName());
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("userPassword", (Object) getRequestPassword());
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("wscClientId2", (Object) NetworkService.getMacAddress());
        return accountHeaderViewHolder_ViewBinding;
    }

    public static WebServiceCallResult logoutUser(URL url, String str, String str2, String str3, CertificateValidatorListener certificateValidatorListener, int i) {
        UserLogout userLogout = new UserLogout();
        userLogout.setRequestDomain(str);
        userLogout.setRequestUserName(str2);
        userLogout.setRequestPassword(str3);
        userLogout.setTimeout(i);
        WebServiceCallResult init = userLogout.init(url, certificateValidatorListener);
        if (init.isSuccess()) {
            init.setSuccess(false);
            try {
                UserLogoutResponse userLogoutResponse = (UserLogoutResponse) userLogout.execute();
                String errorMessage = userLogoutResponse.getErrorMessage();
                if (!(errorMessage == null || errorMessage.length() == 0)) {
                    init.setErrorMsg(userLogoutResponse.getErrorMessage());
                    init.setSuccess(false);
                } else {
                    init.setExtraData(userLogoutResponse);
                    init.setSuccess(true);
                }
            } catch (SSLException e) {
                C0767k.m1821e(TAG, "Error in logout", (Throwable) e);
                init.setErrorMsg(e.getMessage());
                init.setCertificateError(true);
            } catch (SocketTimeoutException e2) {
                C0767k.m1821e(TAG, "user logout Service SocketTimeoutException", (Throwable) e2);
                init.setErrorMsg(e2.getMessage());
                init.setErrorInfo(ErrorInfo.KMC_LO_REQUEST_TIMEOUT);
            } catch (Exception e3) {
                C0767k.m1821e(userLogout.getClass().getName(), "Unable to log out user", (Throwable) e3);
                init.setErrorMsg("Unknown error");
            }
        }
        String str4 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("result from user logout = ");
        sb.append(init.getErrorMsg());
        sb.append(" ");
        sb.append(init.getExtraData());
        C0767k.m1807c(str4, sb.toString());
        return init;
    }
}
