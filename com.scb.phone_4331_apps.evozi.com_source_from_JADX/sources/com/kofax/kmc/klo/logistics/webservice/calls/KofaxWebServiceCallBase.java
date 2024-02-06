package com.kofax.kmc.klo.logistics.webservice.calls;

import com.kofax.kmc.klo.logistics.service.NetworkService;
import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.WebServiceCallResult;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p015ak.C8284d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;
import p040o.AccountRepaymentPlanSelectorViewHolder;
import p040o.AccountSelectorViewHolder;
import p040o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding;

public abstract class KofaxWebServiceCallBase {
    private static final String TAG = KofaxWebServiceCallBase.class.getSimpleName();
    private CertificateValidatorListener certificateValidatorListener;
    private String kfsHostPort = "";
    protected String kfsPassword = "";
    private String kfsServerType = "";
    protected String kfsUsername = "";
    private String kmsHostPort;
    protected int timeout = 20000;

    public abstract String getMethodName();

    public abstract String getNamespace();

    public abstract String getServiceName();

    public abstract String getSoapAction();

    /* access modifiers changed from: protected */
    public abstract AccountHeaderViewHolder_ViewBinding packageRequest();

    public abstract KofaxWebServiceResponseBase populateFromResponse(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding);

    public void registerMarshallers(AccountSelectorViewHolder accountSelectorViewHolder) {
    }

    public String getkfsServerType() {
        return this.kfsServerType;
    }

    public void setkfsUsername(String str) {
        this.kfsUsername = str;
    }

    public void setkfsPassword(String str) {
        this.kfsPassword = str;
    }

    public WebServiceCallResult init(URL url, CertificateValidatorListener certificateValidatorListener2) {
        this.certificateValidatorListener = certificateValidatorListener2;
        WebServiceCallResult webServiceCallResult = new WebServiceCallResult();
        webServiceCallResult.setSuccess(false);
        if (!initHosts(url)) {
            webServiceCallResult.setErrorMsg("Unable to init connector info");
            return webServiceCallResult;
        }
        webServiceCallResult.setSuccess(true);
        return webServiceCallResult;
    }

    private boolean initHosts(URL url) {
        String obj = url.toString();
        this.kfsHostPort = obj;
        this.kmsHostPort = obj;
        return true;
    }

    public List<String> getParamNames() {
        return new ArrayList();
    }

    public List<Object> getParamValues() {
        return new ArrayList();
    }

    public String getServiceCall() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.kmsHostPort);
        sb.append(getServiceName());
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public List<SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding> getExtraHeaders() {
        return new ArrayList();
    }

    public void setKfsHostPort(URL url) {
        this.kfsHostPort = url.toString();
    }

    public KofaxWebServiceResponseBase execute() throws Exception {
        if (NetworkService.getMacAddress() != null || NetworkService.initializeNetworkSettings(AppContextProvider.getContext())) {
            AccountSelectorViewHolder accountSelectorViewHolder = new AccountSelectorViewHolder();
            accountSelectorViewHolder.MediaBrowserCompat$MediaItem = true;
            registerMarshallers(accountSelectorViewHolder);
            accountSelectorViewHolder.MediaBrowserCompat$ItemReceiver = packageRequest();
            SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding write = new SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding().write(getNamespace(), "KfsBaseUrl");
            write.MediaBrowserCompat$ItemReceiver(4, this.kfsHostPort);
            ArrayList arrayList = new ArrayList();
            arrayList.add(write);
            for (SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding add : getExtraHeaders()) {
                arrayList.add(add);
            }
            SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding[] selectProvinceOrDistrictAdapter$ViewHolder_ViewBindingArr = new SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                selectProvinceOrDistrictAdapter$ViewHolder_ViewBindingArr[i] = (SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) arrayList.get(i);
            }
            accountSelectorViewHolder.write = selectProvinceOrDistrictAdapter$ViewHolder_ViewBindingArr;
            String str = TAG;
            StringBuilder sb = new StringBuilder();
            sb.append("nameSpace -> ");
            sb.append(getNamespace());
            C0767k.m1801b(str, sb.toString());
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("methodName -> ");
            sb2.append(getMethodName());
            C0767k.m1801b(str2, sb2.toString());
            String str3 = TAG;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("serviceUrl -> ");
            sb3.append(getServiceCall());
            C0767k.m1801b(str3, sb3.toString());
            String str4 = TAG;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("soapAction -> ");
            sb4.append(getSoapAction());
            C0767k.m1801b(str4, sb4.toString());
            AccountRepaymentPlanSelectorViewHolder a = C8284d.m4661a(getServiceCall(), this.timeout, this.certificateValidatorListener);
            try {
                accountSelectorViewHolder.MediaBrowserCompat$SearchResultReceiver = true;
                a.write(getSoapAction(), accountSelectorViewHolder, (List) null);
                return populateFromResponse((AccountHeaderViewHolder_ViewBinding) accountSelectorViewHolder.read());
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new RuntimeException("Network is unreachable");
        }
    }

    private void dumpStringToFile(String str, String str2) {
        try {
            String str3 = new String("/sdcard/WscDump_");
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str2);
            sb.append(".xml");
            File file = new File(sb.toString());
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.append(str);
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (Exception e) {
            C0767k.m1821e("dumpStringToFile", "error writing string to file", (Throwable) e);
        }
    }

    private void dumpStringToLog(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append("_");
        sb2.append(str.replace(" ->", ""));
        dumpStringToFile(str2, sb2.toString());
        while (obj.length() > 1024) {
            C0767k.m1801b(TAG, obj.substring(0, 1024));
            obj = obj.substring(1024);
        }
        if (obj.length() > 0) {
            C0767k.m1801b(TAG, obj);
        }
    }

    public AccountRemarkViewHolder createPropertyInfo(String str, String str2, Object obj, Class cls) {
        AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
        accountRemarkViewHolder.f5805x50fd9e4a = str2;
        accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper = str;
        accountRemarkViewHolder.write(obj);
        accountRemarkViewHolder.MediaSessionCompat$QueueItem = cls;
        return accountRemarkViewHolder;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public void setTimeout(int i) {
        this.timeout = i;
    }

    public CertificateValidatorListener getCertificateValidatorListener() {
        return this.certificateValidatorListener;
    }

    public void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener2) {
        this.certificateValidatorListener = certificateValidatorListener2;
    }
}
