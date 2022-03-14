// json 포맷
// key : 중복 X , value : 값 (중복 가능, 데이터 타입)
var dwAcademy = {
    students : ['오승택','류근환','강인석','김보겸','이인서',
    '나정수','정지유','김민영','이규성',
    '이승섭','이상협','홍준호','유영준'],
    students_count : 15,
    teacher : '현상원',
    today : '2022-03-08',
    subject : ['SQL','JAVA','HTML']
};

//문제 1. students_count가 15이하면 학생 수 부족, 
// 15초과면 학생 수 정상
var count = dwAcademy.students_count;
if(count <= 15) {
    console.log('학생 수 부족');
}else{
    console.log('학생 수 정상');
}

//문제 2. 학생 중 이 씨 몇명인지?
var cnt = 0;
var searchWord = '이';
for(var i=0; i<dwAcademy.students.length; i++){
    var firstName = dwAcademy.students[i].substring(0,1);
    if(firstName == searchWord){
        ++cnt;
    }
}
console.log('이씨는 총 => '+cnt);

//문제 3.
// 사원ID가 3450인 사원이름은 SMITH고, 급여는 3400 받는다.
// SMITH의 부서는 개발팀과 영업팀이다.
// SMITH의 입사날짜는 21-12-31 이고, SMITH의 상사는 BRIAN과 KING이다.
// 개발 부서는 5명이다
var emp = {
    empno : 3450,
    ename : 'SMITH',
    sal : 3400,
    dname : [
        {
            부서이름 : "개발",
            부서인원수: 5,
            부서장 : "홍길동"
        }
        ,{
            부서이름 : "영업",
            부서인원수: 13,
            부서장 : "박길동"
        }],
    hiredate : '21-12-31',
    상사이름 : ['BRIAN','KING'],
}