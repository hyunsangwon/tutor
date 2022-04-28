package final_test;

import java.util.List;

public class EmpVO{
	private int empno; //사원번호
	private String ename; //사원이름
	private int sal; //사원급여
	private List<DeptVO> list; //사원부서
	
	public EmpVO(int empno, String ename, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	
	public List<DeptVO> getList() {
		return list;
	}
	public void setList(List<DeptVO> list) {
		this.list = list;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
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
	
}
