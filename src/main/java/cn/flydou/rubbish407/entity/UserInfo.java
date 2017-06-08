package cn.flydou.rubbish407.entity;

import java.sql.Date;

/**
 * Created by Cheng on 2017/6/8.
 */
public class UserInfo {
    private int id;
    private int userId;
    private String name;
    private String idcardNum;
    private String sex;
    private int num;
    private int age;
    private String apartment;
    private String nativePlace;
    private String registerBatch;
    private Date start_time;
    private String jobState;
    private String telNum1;
    private String telNum2;
    private String qq;
    private String email;
    private String address;
    private String job;

    public UserInfo(int id, int userId, String name,
                    String idcardNum, String sex,
                    int num, int age, String apartment,
                    String nativePlace, String registerBatch,
                    Date start_time, String jobState,
                    String telNum1, String telNum2, String qq,
                    String email, String address, String job) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.idcardNum = idcardNum;
        this.sex = sex;
        this.num = num;
        this.age = age;
        this.apartment = apartment;
        this.nativePlace = nativePlace;
        this.registerBatch = registerBatch;
        this.start_time = start_time;
        this.jobState = jobState;
        this.telNum1 = telNum1;
        this.telNum2 = telNum2;
        this.qq = qq;
        this.email = email;
        this.address = address;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdcardNum() {
        return idcardNum;
    }

    public void setIdcardNum(String idcardNum) {
        this.idcardNum = idcardNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getRegisterBatch() {
        return registerBatch;
    }

    public void setRegisterBatch(String registerBatch) {
        this.registerBatch = registerBatch;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public String getJobState() {
        return jobState;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public String getTelNum1() {
        return telNum1;
    }

    public void setTelNum1(String telNum1) {
        this.telNum1 = telNum1;
    }

    public String getTelNum2() {
        return telNum2;
    }

    public void setTelNum2(String telNum2) {
        this.telNum2 = telNum2;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
