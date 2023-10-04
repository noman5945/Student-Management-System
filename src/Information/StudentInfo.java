package Information;
public class StudentInfo extends AccountInfo{
    
    private String name;
    private String fatherName;
    private String motherName;
    private String address;
    private String dept;
    private String BirthDate,gender,bloodgroup;
    private int ID;
    private int Class;
    private int semester;
    private String email;
    private int mobileNo,phone;
    private String CGPA;
    
    public StudentInfo()
    {
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setClass(int Class) {
        this.Class = Class;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    public void setmobileNo(int mob)
    {
        this.mobileNo=mob;
    }
    public void setphone(int ph)
    {
        this.phone=ph;
    }
    public void setCGPA(String cgpa)
    {
        this.CGPA=cgpa;
    }
    public void setBirthDate(String bd)
    {
        this.BirthDate=bd;
    }
    public void setgender(String gender)
    {
        this.gender=gender;
    }
    public void setbloodgroup(String bg)
    {
        this.bloodgroup=bg;
    }
    
    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getAddress() {
        return address;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public int getID() {
        return ID;
    }

    public int getclass() {
        return Class;
    }

    public int getSemester() {
        return semester;
    }

    @Override
    public String getEmail() {
        return email;
    }
    public int getmobileNo()
    {
        return mobileNo;
    }
    public int getphone()
    {
        return phone;
    }
    public String getCGPA()
    {
        return CGPA;
    }
    public String getBirthDate()
    {
        return BirthDate;
    }
    public String getgender()
    {
        return gender;
    }
    public String getbloodgroup()
    {
        return bloodgroup;
    }
}
