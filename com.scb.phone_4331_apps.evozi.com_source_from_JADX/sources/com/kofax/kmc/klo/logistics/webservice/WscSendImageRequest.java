package com.kofax.kmc.klo.logistics.webservice;

import p040o.AccountHeaderViewHolder_ViewBinding;

public class WscSendImageRequest extends WscSubmitRequest {
    private WscDestination destination;

    public WscDestination getDestination() {
        return this.destination;
    }

    public void setDestination(WscDestination wscDestination) {
        this.destination = wscDestination;
    }

    public boolean initialize() {
        return super.initialize();
    }

    public AccountHeaderViewHolder_ViewBinding toSoapObject(String str, String str2) {
        AccountHeaderViewHolder_ViewBinding accountHeaderViewHolder_ViewBinding = new AccountHeaderViewHolder_ViewBinding(str, str2);
        toSoapObjectForWscRequest(accountHeaderViewHolder_ViewBinding, "http://wsc.des.kofax.com/xsd");
        toSoapObject(accountHeaderViewHolder_ViewBinding, "http://job.wsc.des.kofax.com/xsd");
        accountHeaderViewHolder_ViewBinding.IconCompatParcelizer.addElement(this.destination.toSoapObject("http://job.wsc.des.kofax.com/xsd", "destination", "http://util.wsc.des.kofax.com/xsd"));
        return accountHeaderViewHolder_ViewBinding;
    }
}
