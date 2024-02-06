package com.kofax.kmc.klo.logistics.webservice.calls;

import android.os.Build;
import com.kofax.kmc.klo.logistics.service.CryptoService;
import com.kofax.kmc.klo.logistics.service.NetworkService;
import com.kofax.kmc.klo.logistics.webservice.DeviceServiceResponse;
import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URL;
import javax.net.ssl.SSLException;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.ModifyQuickTopUpReviewActivity;

public class DeviceService extends KofaxWebServiceCallBase {
    public static int ERROR_LICENSE_REQUIRES_AUTH = 12;
    public static int ERROR_LICENSING = 5;
    public static String METHOD_NAME = "updateDeviceInfo";
    public static String NAMESPACE = "http://device.wsc.des.kofax.com";
    public static String SERVICE_NAME = "DeviceService";
    public static String SOAP_ACTION = "urn:updateDeviceInfo";
    private static final String TAG = DeviceService.class.getSimpleName();

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
        init.isSuccess();
        return init;
    }

    public KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        return DeviceServiceResponse.populateFromResponse(accountHeaderViewHolder_ViewBinding);
    }

    public AccountHeaderViewHolder_ViewBinding packageRequest() {
        String str;
        String macAddress = NetworkService.getMacAddress();
        String ipAddress = NetworkService.getIpAddress();
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(Build.MANUFACTURER.charAt(0)));
        sb.append(Build.MANUFACTURER.substring(1));
        String obj = sb.toString();
        if (ModifyQuickTopUpReviewActivity.write((CharSequence) Build.MODEL, (CharSequence) obj)) {
            str = Build.MODEL;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" ");
            sb2.append(Build.MODEL);
            str = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(macAddress);
        sb3.append(macAddress);
        sb3.append(ipAddress);
        sb3.append(macAddress);
        sb3.append(macAddress);
        String obj2 = sb3.toString();
        String str2 = TAG;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("hostName -> ");
        sb4.append(macAddress);
        C0767k.m1801b(str2, sb4.toString());
        String str3 = TAG;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("deviceName -> ");
        sb5.append(macAddress);
        C0767k.m1801b(str3, sb5.toString());
        String str4 = TAG;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("macAddress -> ");
        sb6.append(macAddress);
        C0767k.m1801b(str4, sb6.toString());
        String str5 = TAG;
        StringBuilder sb7 = new StringBuilder();
        sb7.append("ipAddress -> ");
        sb7.append(ipAddress);
        C0767k.m1801b(str5, sb7.toString());
        String str6 = TAG;
        StringBuilder sb8 = new StringBuilder();
        sb8.append("reserved (pre-SHA) -> ");
        sb8.append(obj2);
        C0767k.m1801b(str6, sb8.toString());
        String sha1Hash = CryptoService.sha1Hash(obj2);
        StringBuilder sb9 = new StringBuilder();
        sb9.append("1:1:");
        sb9.append(sha1Hash);
        String obj3 = sb9.toString();
        String str7 = TAG;
        StringBuilder sb10 = new StringBuilder();
        sb10.append("reserved (complete) -> ");
        sb10.append(obj3);
        C0767k.m1801b(str7, sb10.toString());
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(getNamespace(), getMethodName());
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("wscClientID", (Object) macAddress);
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("macAddress", (Object) macAddress);
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("ipAddress", (Object) ipAddress);
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("hostname", (Object) macAddress);
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("vendor", (Object) obj);
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("model", (Object) str);
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("devicename", (Object) macAddress);
        accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("reserved", (Object) obj3);
        return accountHeaderViewHolder_ViewBinding;
    }

    public static WebServiceCallResult updateDeviceInfo(URL url, CertificateValidatorListener certificateValidatorListener, int i) {
        new WebServiceCallResult().setSuccess(false);
        DeviceService deviceService = new DeviceService();
        deviceService.setTimeout(i);
        WebServiceCallResult init = deviceService.init(url, certificateValidatorListener);
        if (init.isSuccess()) {
            init.setSuccess(false);
            try {
                DeviceServiceResponse deviceServiceResponse = (DeviceServiceResponse) deviceService.execute();
                if (deviceServiceResponse.getResultCode() == 0) {
                    init.setSuccess(true);
                    init.setExtraData(deviceServiceResponse);
                } else {
                    init.setErrorMsg(deviceServiceResponse.getErrorMessage());
                    init.setExtraData(deviceServiceResponse);
                    init.setSuccess(false);
                }
            } catch (ConnectException e) {
                C0767k.m1821e(TAG, "Error in updateDeviceInfo", (Throwable) e);
                if (e.getMessage().indexOf("Network is unreachable") >= 0) {
                    init.setErrorMsg("Network Unavailable. Please check your network settings and try again.");
                }
                init.setErrorMsg("Network is unreachable, Please check your network settings and try again.");
            } catch (SSLException e2) {
                C0767k.m1821e(TAG, "Error in updateDeviceInfo", (Throwable) e2);
                init.setErrorMsg(e2.getMessage());
                init.setCertificateError(true);
            } catch (SocketTimeoutException e3) {
                C0767k.m1821e(TAG, "Device Service SocketTimeoutException", (Throwable) e3);
                init.setErrorMsg(e3.getMessage());
                init.setErrorInfo(ErrorInfo.KMC_LO_REQUEST_TIMEOUT);
            } catch (Exception e4) {
                C0767k.m1821e(TAG, "Error in updateDeviceInfo", (Throwable) e4);
                init.setErrorMsg("Network is unreachable, Please check your network settings and try again.");
            }
        }
        return init;
    }
}
