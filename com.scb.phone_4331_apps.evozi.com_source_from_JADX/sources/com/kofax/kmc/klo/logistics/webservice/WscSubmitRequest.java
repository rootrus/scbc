package com.kofax.kmc.klo.logistics.webservice;

import java.util.ArrayList;
import java.util.List;
import p040o.AccountHeaderViewHolder_ViewBinding;
import p040o.AccountRemarkViewHolder;

public class WscSubmitRequest extends WscRequest {
    private boolean aborted;
    private String abortedReason;
    private List<WscKeyValuePair> additionalMetadata = new ArrayList();
    private boolean cancelled;
    private String documentNote;
    private boolean done;
    private short imageType;
    private int partNumber;
    private String wscClientType;

    public boolean isAborted() {
        return this.aborted;
    }

    public void setAborted(boolean z) {
        this.aborted = z;
    }

    public String getAbortedReason() {
        return this.abortedReason;
    }

    public void setAbortedReason(String str) {
        this.abortedReason = str;
    }

    public List<WscKeyValuePair> getAdditionalMetadata() {
        return this.additionalMetadata;
    }

    public void setAdditionalMetadata(List<WscKeyValuePair> list) {
        this.additionalMetadata = list;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean z) {
        this.cancelled = z;
    }

    public String getDocumentNote() {
        return this.documentNote;
    }

    public void setDocumentNote(String str) {
        this.documentNote = str;
    }

    public boolean isDone() {
        return this.done;
    }

    public void setDone(boolean z) {
        this.done = z;
    }

    public short getImageType() {
        return this.imageType;
    }

    public void setImageType(short s) {
        this.imageType = s;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public void setPartNumber(int i) {
        this.partNumber = i;
    }

    public String getWscClientType() {
        return this.wscClientType;
    }

    public void setWscClientType(String str) {
        this.wscClientType = str;
    }

    public boolean initialize() {
        return super.initialize();
    }

    public static WscSubmitRequest initializeRequest() {
        WscSubmitRequest wscSubmitRequest = new WscSubmitRequest();
        wscSubmitRequest.initialize();
        return wscSubmitRequest;
    }

    public AccountHeaderViewHolder_ViewBinding toSoapObject(String str, String str2) {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(str, str2);
        toSoapObject(accountHeaderViewHolder_ViewBinding, str);
        return accountHeaderViewHolder_ViewBinding;
    }

    public void toSoapObject(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding, String str) {
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "aborted", Boolean.valueOf(isAborted()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "abortedReason", getAbortedReason(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "cancelled", Boolean.valueOf(isCancelled()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "documentNote", getDocumentNote(), AccountRemarkViewHolder.MediaDescriptionCompat));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "done", Boolean.valueOf(isDone()), AccountRemarkViewHolder.MediaBrowserCompat$CustomActionResultReceiver));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "imageType", Short.valueOf(getImageType()), Short.class));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "partNumber", Integer.valueOf(getPartNumber()), AccountRemarkViewHolder.read));
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(createPropertyInfo(str, "wscClientType", getWscClientType(), AccountRemarkViewHolder.MediaDescriptionCompat));
    }

    public void toSoapObjectForWscRequest(AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding, String str) {
        super.toSoapObject(accountHeaderViewHolder_ViewBinding, str);
    }
}
