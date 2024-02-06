package com.kofax.kmc.klo.logistics.service;

import com.kofax.kmc.klo.logistics.webservice.KofaxWebServiceResponseBase;
import com.kofax.kmc.klo.logistics.webservice.calls.KofaxWebServiceCallBase;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk.p015ak.C8284d;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;
import p040o.AccountRepaymentPlanSelectorViewHolder;
import p040o.AccountSelectorViewHolder;
import p040o.C10410xd06cdadd;

public class KofaxWebServiceConnectorService {
    public static KofaxWebServiceResponseBase executeKMSSoapCall(KofaxWebServiceCallBase kofaxWebServiceCallBase) throws Exception {
        return kofaxWebServiceCallBase.populateFromResponse(executeKMSSoapCall(kofaxWebServiceCallBase.getNamespace(), kofaxWebServiceCallBase.getMethodName(), kofaxWebServiceCallBase.getServiceCall(), kofaxWebServiceCallBase.getSoapAction(), kofaxWebServiceCallBase.getParamNames(), kofaxWebServiceCallBase.getParamValues(), kofaxWebServiceCallBase.getCertificateValidatorListener()));
    }

    public static AccountHeaderViewHolder_ViewBinding executeKMSSoapCall(String str, String str2, String str3, String str4, List<String> list, List<Object> list2, CertificateValidatorListener certificateValidatorListener) throws Exception {
        try {
            AccountSelectorViewHolder accountSelectorViewHolder = new AccountSelectorViewHolder();
            accountSelectorViewHolder.MediaBrowserCompat$MediaItem = true;
            AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(str, str2);
            for (int i = 0; i < list.size(); i++) {
                Object obj = list2.get(i);
                String str5 = list.get(i);
                if (obj instanceof C10410xd06cdadd) {
                    AccountRemarkViewHolder accountRemarkViewHolder = new AccountRemarkViewHolder();
                    accountRemarkViewHolder.f5805x50fd9e4a = str5;
                    accountRemarkViewHolder.MediaSessionCompat$ResultReceiverWrapper = str;
                    accountRemarkViewHolder.write(obj);
                    accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(accountRemarkViewHolder);
                } else {
                    accountHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(str5, (Object) obj.toString());
                }
            }
            accountSelectorViewHolder.MediaBrowserCompat$ItemReceiver = accountHeaderViewHolder_ViewBinding;
            StringBuilder sb = new StringBuilder();
            sb.append("nameSpace -> ");
            sb.append(str);
            C0767k.m1801b("KofaxWebServiceConnectorService.executeKMSSoapCall", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("methodName -> ");
            sb2.append(str2);
            C0767k.m1801b("KofaxWebServiceConnectorService.executeKMSSoapCall", sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("serviceUrl -> ");
            sb3.append(str3);
            C0767k.m1801b("KofaxWebServiceConnectorService.executeKMSSoapCall", sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("soapAction -> ");
            sb4.append(str4);
            C0767k.m1801b("KofaxWebServiceConnectorService.executeKMSSoapCall", sb4.toString());
            AccountRepaymentPlanSelectorViewHolder a = C8284d.m4662a(str3, certificateValidatorListener);
            a.write(str4, accountSelectorViewHolder, (List) null);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("requestDump -> ");
            sb5.append(a.IconCompatParcelizer);
            C0767k.m1801b("KofaxWebServiceConnectorService.executeKMSSoapCall", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("responseDump -> ");
            sb6.append(a.RatingCompat);
            C0767k.m1801b("KofaxWebServiceConnectorService.executeKMSSoapCall", sb6.toString());
            return (AccountHeaderViewHolder_ViewBinding) accountSelectorViewHolder.read();
        } catch (Exception e) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Error executing soap call. nameSpace -> ");
            sb7.append(str);
            sb7.append(", methodName -> ");
            sb7.append(str2);
            sb7.append(", serviceUrl -> ");
            sb7.append(str3);
            throw new Exception(sb7.toString(), e);
        }
    }

    public static String getVerySafeSoapProperty(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding, String str, String str2) {
        Integer num;
        boolean z = false;
        if (str != null) {
            int i = 0;
            while (true) {
                try {
                    if (i >= accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.size()) {
                        break;
                    } else if (str.equals(((AccountRemarkViewHolder) accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.elementAt(i)).f5805x50fd9e4a)) {
                        num = Integer.valueOf(i);
                        break;
                    } else {
                        i++;
                    }
                } catch (Exception unused) {
                    return str2;
                }
            }
        }
        num = null;
        String str3 = "";
        if (num != null) {
            Object property = accountHeaderViewHolder_ViewBinding.getProperty(num.intValue());
            if (property != null) {
                str3 = property.toString();
            }
        } else if (str2 != null) {
            str3 = str2.toString();
        }
        if (str3 == null || str3.length() == 0) {
            z = true;
        }
        return (z || !str3.equals("anyType{}")) ? str3 : str2;
    }
}
