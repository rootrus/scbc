package com.kofax.kmc.klo.logistics.webservice.calls;

import com.kofax.kmc.klo.logistics.service.NetworkService;
import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.UserLoginResponse;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.SSLException;
import p040o.AccountHeaderViewHolder_ViewBinding;

public class UserLogin extends KofaxWebServiceCallBase {
    public static String METHOD_NAME = "login";
    public static String NAMESPACE = "http://login.wsc.des.kofax.com";
    public static String SERVICE_NAME = "UserLoginService";
    public static String SOAP_ACTION = "urn:login";
    private String requestDomain = new String();
    private String requestPassword = new String();
    private String requestUserName = new String();

    public String getDomain() {
        return this.requestDomain;
    }

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
        super.setTimeout(this.timeout);
        if (!init.isSuccess()) {
            return init;
        }
        String str = this.requestUserName;
        boolean z = false;
        if (str == null || str.length() == 0) {
            init.setErrorMsg("No user defined");
        } else {
            String str2 = this.requestDomain;
            if (!(str2 == null || str2.length() == 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.requestDomain);
                sb.append("\\");
                sb.append(this.requestUserName);
                setRequestUserName(sb.toString());
            }
        }
        String errorMsg = init.getErrorMsg();
        if (errorMsg == null || errorMsg.length() == 0) {
            z = true;
        }
        init.setSuccess(z);
        return init;
    }

    public KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        return UserLoginResponse.populateFromResponse(accountHeaderViewHolder_ViewBinding);
    }

    public AccountHeaderViewHolder_ViewBinding packageRequest() {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(getNamespace(), getMethodName());
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("userName", (Object) getRequestUserName());
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("userPassword", (Object) getRequestPassword());
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("wscClientId2", (Object) NetworkService.getMacAddress());
        return accountHeaderViewHolder_ViewBinding;
    }

    public static WebServiceCallResult loginUser(URL url, String str, String str2, String str3, int i, CertificateValidatorListener certificateValidatorListener) {
        UserLogin userLogin = new UserLogin();
        userLogin.setRequestDomain(str);
        userLogin.setRequestUserName(str2);
        userLogin.setRequestPassword(str3);
        userLogin.setTimeout(i);
        WebServiceCallResult init = userLogin.init(url, certificateValidatorListener);
        if (init.isSuccess()) {
            init.setSuccess(false);
            try {
                UserLoginResponse userLoginResponse = (UserLoginResponse) userLogin.execute();
                if (userLoginResponse.isUserLoggedIn()) {
                    init.setExtraData(userLoginResponse);
                    init.setSuccess(true);
                } else {
                    init.setErrorMsg(userLoginResponse.getErrorMessage());
                    init.setSuccess(false);
                }
            } catch (SSLException e) {
                C0767k.m1821e(userLogin.getClass().getName(), "Error in login user", (Throwable) e);
                init.setErrorMsg(e.getMessage());
                init.setCertificateError(true);
            } catch (Exception e2) {
                C0767k.m1821e(userLogin.getClass().getName(), "Unable to log in user", (Throwable) e2);
                if (e2 instanceof SocketTimeoutException) {
                    init.setErrorInfo(ErrorInfo.KMC_LO_REQUEST_TIMEOUT);
                } else {
                    init.setErrorMsg("Unknown error");
                }
            }
        }
        return init;
    }
}
