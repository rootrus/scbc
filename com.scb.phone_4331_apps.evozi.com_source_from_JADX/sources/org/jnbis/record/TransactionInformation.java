package org.jnbis.record;

import org.jnbis.internal.record.BaseRecord;

public class TransactionInformation extends BaseRecord {
    private String controlNumber;
    private String controlReferenceNumber;
    private String date;
    private String destinationAgencyId;
    private String directoryOfCharsets;
    private String domainName;
    private String fileContent;
    private String greenwichMeanTime;
    private String nativeScanningResolution;
    private String nominalTransmittingResolution;
    private String originatingAgencyId;
    private String priority;
    private String typeOfTransaction;
    private String version;

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getFileContent() {
        return this.fileContent;
    }

    public void setFileContent(String str) {
        this.fileContent = str;
    }

    public String getTypeOfTransaction() {
        return this.typeOfTransaction;
    }

    public void setTypeOfTransaction(String str) {
        this.typeOfTransaction = str;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String str) {
        this.priority = str;
    }

    public String getDestinationAgencyId() {
        return this.destinationAgencyId;
    }

    public void setDestinationAgencyId(String str) {
        this.destinationAgencyId = str;
    }

    public String getOriginatingAgencyId() {
        return this.originatingAgencyId;
    }

    public void setOriginatingAgencyId(String str) {
        this.originatingAgencyId = str;
    }

    public String getControlNumber() {
        return this.controlNumber;
    }

    public void setControlNumber(String str) {
        this.controlNumber = str;
    }

    public String getControlReferenceNumber() {
        return this.controlReferenceNumber;
    }

    public void setControlReferenceNumber(String str) {
        this.controlReferenceNumber = str;
    }

    public String getNativeScanningResolution() {
        return this.nativeScanningResolution;
    }

    public void setNativeScanningResolution(String str) {
        this.nativeScanningResolution = str;
    }

    public String getNominalTransmittingResolution() {
        return this.nominalTransmittingResolution;
    }

    public void setNominalTransmittingResolution(String str) {
        this.nominalTransmittingResolution = str;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String str) {
        this.domainName = str;
    }

    public String getGreenwichMeanTime() {
        return this.greenwichMeanTime;
    }

    public void setGreenwichMeanTime(String str) {
        this.greenwichMeanTime = str;
    }

    public String getDirectoryOfCharsets() {
        return this.directoryOfCharsets;
    }

    public void setDirectoryOfCharsets(String str) {
        this.directoryOfCharsets = str;
    }
}
