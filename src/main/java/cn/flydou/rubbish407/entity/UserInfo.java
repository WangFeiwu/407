package cn.flydou.rubbish407.entity;

<<<<<<< HEAD
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

=======
/**
 * Created by wanchenqi on 2017/6/8.
 */
public class UserInfo {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdcardNum(String idcardNum) {
        this.idcardNum = idcardNum;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public void setRegisterBatch(String registerBatch) {
        this.registerBatch = registerBatch;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

    public void setTelNum1(String telNum1) {
        this.telNum1 = telNum1;
    }

    public void setTelNum2(String telNum2) {
        this.telNum2 = telNum2;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private int userId;
    private String name;
    private String idcardNum;
    private String sex;
    private int num;
    private int age;
    private String apartment;
    private String nativePlace;
    private String registerBatch;
    private String date;
    private String jobState;
    private String telNum1;
    private String telNum2;
    private String qq;
    private String email;
    private String address;
    private String job;

>>>>>>> origin/wcq
    public int getId() {
        return id;
    }

<<<<<<< HEAD
    public void setId(int id) {
        this.id = id;
    }

=======
>>>>>>> origin/wcq
    public int getUserId() {
        return userId;
    }

<<<<<<< HEAD
    public void setUserId(int userId) {
        this.userId = userId;
    }

=======
>>>>>>> origin/wcq
    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public void setName(String name) {
        this.name = name;
    }

=======
>>>>>>> origin/wcq
    public String getIdcardNum() {
        return idcardNum;
    }

<<<<<<< HEAD
    public void setIdcardNum(String idcardNum) {
        this.idcardNum = idcardNum;
    }

=======
>>>>>>> origin/wcq
    public String getSex() {
        return sex;
    }

<<<<<<< HEAD
    public void setSex(String sex) {
        this.sex = sex;
    }

=======
>>>>>>> origin/wcq
    public int getNum() {
        return num;
    }

<<<<<<< HEAD
    public void setNum(int num) {
        this.num = num;
    }

=======
>>>>>>> origin/wcq
    public int getAge() {
        return age;
    }

<<<<<<< HEAD
    public void setAge(int age) {
        this.age = age;
    }

=======
>>>>>>> origin/wcq
    public String getApartment() {
        return apartment;
    }

<<<<<<< HEAD
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

=======
>>>>>>> origin/wcq
    public String getNativePlace() {
        return nativePlace;
    }

<<<<<<< HEAD
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

=======
>>>>>>> origin/wcq
    public String getRegisterBatch() {
        return registerBatch;
    }

<<<<<<< HEAD
    public void setRegisterBatch(String registerBatch) {
        this.registerBatch = registerBatch;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
=======
    public String getDate() {
        return date;
>>>>>>> origin/wcq
    }

    public String getJobState() {
        return jobState;
    }

<<<<<<< HEAD
    public void setJobState(String jobState) {
        this.jobState = jobState;
    }

=======
>>>>>>> origin/wcq
    public String getTelNum1() {
        return telNum1;
    }

<<<<<<< HEAD
    public void setTelNum1(String telNum1) {
        this.telNum1 = telNum1;
    }

=======
>>>>>>> origin/wcq
    public String getTelNum2() {
        return telNum2;
    }

<<<<<<< HEAD
    public void setTelNum2(String telNum2) {
        this.telNum2 = telNum2;
    }

=======
>>>>>>> origin/wcq
    public String getQq() {
        return qq;
    }

<<<<<<< HEAD
    public void setQq(String qq) {
        this.qq = qq;
    }

=======
>>>>>>> origin/wcq
    public String getEmail() {
        return email;
    }

<<<<<<< HEAD
    public void setEmail(String email) {
        this.email = email;
    }

=======
>>>>>>> origin/wcq
    public String getAddress() {
        return address;
    }

<<<<<<< HEAD
    public void setAddress(String address) {
        this.address = address;
    }

=======
>>>>>>> origin/wcq
    public String getJob() {
        return job;
    }

<<<<<<< HEAD
    public void setJob(String job) {
        this.job = job;
    }
=======




>>>>>>> origin/wcq
}
