package 컬렉션즈;

//emp 테이블 클래스
public class EmpVO {
	int empno; //사원번호
	String ename; //사원이름
	String job; //직무
	String hiredate; //고용날짜
	int sal; //급여
	int deptno; //부서번호
	int comm; //성과급
	
	public EmpVO(int empno, String ename, String job, String hiredate, int sal, int deptno, int comm){
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno;
		this.comm = comm;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
}
