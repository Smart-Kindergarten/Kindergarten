package com.cykj.bean;

public class SchoolMessage {
    private String schoolName; //幼儿园名称
    private String legalPerson; //法人
    private String legalPersonId; //法人身份证
    private String address; //地址
    private String TLE; //联系电话
    private String schoolPermit; //办学许可证
    private String hygienicLicense; //卫生许可证
    private String firePermit; //消防许可证
    private String organizationPermit; //组织许可
    private String TaxPermit;//税务许可
    private String EnrolmentTime;//审批时间
    private String type;//状态
    private String applicationDeadline;//申请时间
//    private String //申请id

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalPersonId() {
        return legalPersonId;
    }

    public void setLegalPersonId(String legalPersonId) {
        this.legalPersonId = legalPersonId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTLE() {
        return TLE;
    }

    public void setTLE(String TLE) {
        this.TLE = TLE;
    }

    public String getSchoolPermit() {
        return schoolPermit;
    }

    public void setSchoolPermit(String schoolPermit) {
        this.schoolPermit = schoolPermit;
    }

    public String getHygienicLicense() {
        return hygienicLicense;
    }

    public void setHygienicLicense(String hygienicLicense) {
        this.hygienicLicense = hygienicLicense;
    }

    public String getFirePermit() {
        return firePermit;
    }

    public void setFirePermit(String firePermit) {
        this.firePermit = firePermit;
    }

    public String getOrganizationPermit() {
        return organizationPermit;
    }

    public void setOrganizationPermit(String organizationPermit) {
        this.organizationPermit = organizationPermit;
    }

    public String getTaxPermit() {
        return TaxPermit;
    }

    public void setTaxPermit(String taxPermit) {
        TaxPermit = taxPermit;
    }

    public String getEnrolmentTime() {
        return EnrolmentTime;
    }

    public void setEnrolmentTime(String enrolmentTime) {
        EnrolmentTime = enrolmentTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getApplicationDeadline() {
        return applicationDeadline;
    }

    public void setApplicationDeadline(String applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }
}
