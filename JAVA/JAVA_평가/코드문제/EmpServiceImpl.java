package final_test;

import java.util.List;

public interface EmpServiceImpl {

	/**
	 * @param list
	 * @return List<EmpVO>
	 * @date : 2022. 4. 28.
	 * @author : sangwon Hyun
	 * comment : 1번. 전체 사원 200달러 급여 인상하고 사원 리스트를 리턴 하시오. 
	 */
	public List<EmpVO> getEmpList(List<EmpVO> list);
	
	/**
	 * @param list
	 * @return EmpVO
	 * @date : 2022. 4. 28.
	 * @author : sangwon Hyun
	 * comment : 2번. 급여가 가장 높은 사원을 리턴 하시오. (단, 급여 중복이 없다고 가정)
	 */
	public EmpVO getEmp(List<EmpVO> list);
	
	
	/**
	 * @param list
	 * @param sal
	 * @return int
	 * @date : 2022. 4. 28.
	 * @author : sangwon Hyun
	 * comment : 3번. 사원 중 급여를 300이하로 받고 있는 사원 수를 구하시오.
	 */
	public int getCount(List<EmpVO> list, int sal);
	
	/**
	 * @param vo
	 * @return EmpVO
	 * @date : 2022. 4. 28.
	 * @author : sangwon Hyun
	 * comment : 4번. 특정 사원에 부서번호 10, 부서이름 SALES 부서를 추가하고 사원을 리턴하시오.
	 */
	public EmpVO setDept(EmpVO empVO);
	
}
