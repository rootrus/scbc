package com.kofax.kmc.klo.logistics.webservice.calls;

import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.SendImageResponse;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.klo.logistics.webservice.WscDestination;
import com.kofax.kmc.klo.logistics.webservice.WscSendImageRequest;
import com.kofax.kmc.klo.logistics.webservice.ksoap.MarshalByte;
import com.kofax.kmc.klo.logistics.webservice.ksoap.MarshalShort;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.mobile.sdk._internal.C0767k;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p040o.AccountEStatementViewHolder_ViewBinding;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;
import p040o.AccountSelectorViewHolder;
import p040o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding;

public class SendImage extends KofaxWebServiceCallBase {
    public static String METHOD_NAME = "sendImage";
    public static String NAMESPACE = "http://job.wsc.des.kofax.com";
    public static String SERVICE_NAME = "SendImageService";
    public static String SOAP_ACTION = "urn:sendImage";
    private static final String TAG = SendImage.class.getSimpleName();
    private Map<String, String> headerMap = new HashMap();
    private byte[] imageBytes = null;
    private WscSendImageRequest request = null;

    public WscSendImageRequest getRequest() {
        return this.request;
    }

    public void setRequest(WscSendImageRequest wscSendImageRequest) {
        this.request = wscSendImageRequest;
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

    public KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding) {
        return SendImageResponse.populateFromResponse(accountHeaderViewHolder_ViewBinding);
    }

    /* access modifiers changed from: protected */
    public List<SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding> getExtraHeaders() {
        if (this.headerMap.size() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (String next : this.headerMap.keySet()) {
            SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding write = new SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding().write(getNamespace(), next);
            write.MediaBrowserCompat$ItemReceiver(4, this.headerMap.get(next));
            arrayList.add(write);
        }
        return arrayList;
    }

    public static WebServiceCallResult cancelJob(URL url, WscDestination wscDestination, String str, String str2, String str3, CertificateValidatorListener certificateValidatorListener) {
        WscSendImageRequest wscSendImageRequest = new WscSendImageRequest();
        wscSendImageRequest.initialize();
        wscSendImageRequest.setCancelled(true);
        wscSendImageRequest.setJobId(str3);
        wscSendImageRequest.setDestination(wscDestination);
        wscSendImageRequest.setUserName(str);
        wscSendImageRequest.setPassword(str2);
        SendImage sendImage = new SendImage();
        WebServiceCallResult init = sendImage.init(url, certificateValidatorListener);
        if (init.isSuccess()) {
            sendImage.setRequest(wscSendImageRequest);
            try {
                SendImageResponse sendImageResponse = (SendImageResponse) sendImage.execute();
                String errorMessage = sendImageResponse.getErrorMessage();
                if (!(errorMessage == null || errorMessage.length() == 0)) {
                    init.setErrorMsg(sendImageResponse.getErrorMessage());
                    init.setSuccess(false);
                } else {
                    init.setExtraData(sendImageResponse);
                    init.setSuccess(true);
                }
            } catch (Exception e) {
                String str4 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to cancel job for ");
                sb.append(str3);
                C0767k.m1821e(str4, sb.toString(), (Throwable) e);
                init.setErrorMsg("Unknown error");
            }
        }
        return init;
    }

    public static WebServiceCallResult sendImage(URL url, WscDestination wscDestination, String str, String str2, String str3, byte[] bArr, int i, boolean z, CertificateValidatorListener certificateValidatorListener, int i2) {
        int i3 = (bArr[0] == 73 && bArr[1] == 73 && bArr[2] == 42) ? 1 : 0;
        WscSendImageRequest wscSendImageRequest = new WscSendImageRequest();
        wscSendImageRequest.initialize();
        wscSendImageRequest.setJobId(str3);
        wscSendImageRequest.setPartNumber(i + 1);
        wscSendImageRequest.setDone(z);
        wscSendImageRequest.setImageType((short) i3);
        wscSendImageRequest.setDestination(wscDestination);
        wscSendImageRequest.setUserName(str);
        wscSendImageRequest.setPassword(str2);
        SendImage sendImage = new SendImage();
        sendImage.setTimeout(i2);
        sendImage.imageBytes = bArr;
        WebServiceCallResult init = sendImage.init(url, certificateValidatorListener);
        if (init.isSuccess()) {
            sendImage.setRequest(wscSendImageRequest);
            try {
                SendImageResponse sendImageResponse = (SendImageResponse) sendImage.execute();
                String errorMessage = sendImageResponse.getErrorMessage();
                if (!(errorMessage == null || errorMessage.length() == 0)) {
                    init.setErrorMsg(sendImageResponse.getErrorMessage());
                    init.setSuccess(false);
                } else {
                    init.setExtraData(sendImageResponse);
                    init.setSuccess(true);
                }
            } catch (SocketTimeoutException e) {
                String str4 = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("send image socketTimeoutException for ");
                sb.append(str3);
                C0767k.m1821e(str4, sb.toString(), (Throwable) e);
                init.setErrorMsg(e.getMessage());
                init.setErrorInfo(ErrorInfo.KMC_LO_REQUEST_TIMEOUT);
                init.setSuccess(false);
            } catch (Exception e2) {
                String str5 = TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to send image for ");
                sb2.append(str3);
                C0767k.m1821e(str5, sb2.toString(), (Throwable) e2);
                init.setErrorMsg("Unknown error");
                init.setSuccess(false);
            }
        }
        return init;
    }

    public AccountHeaderViewHolder_ViewBinding packageRequest() {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(getNamespace(), getMethodName());
        AccountHeaderViewHolder_ViewBinding soapObject = this.request.toSoapObject(getNamespace(), "wsRequest");
        AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
        accountRemarkViewHolder.f5805x50fd9e4a = "image";
        accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper = getNamespace();
        accountRemarkViewHolder.write(this.imageBytes);
        accountRemarkViewHolder.MediaSessionCompat$QueueItem = AccountEStatementViewHolder_ViewBinding.IconCompatParcelizer;
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(soapObject);
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(accountRemarkViewHolder);
        return accountHeaderViewHolder_ViewBinding;
    }

    public void registerMarshallers(AccountSelectorViewHolder accountSelectorViewHolder) {
        new MarshalShort().register(accountSelectorViewHolder);
        new AccountEStatementViewHolder_ViewBinding().register(accountSelectorViewHolder);
        new MarshalByte().register(accountSelectorViewHolder);
    }
}
